package mini.test;

import mini.compiler.*;
import mini.syntaxtree.Program;
import mini.*;

import java.io.*;
import java.nio.file.FileSystem;

public class Main {

	public static void main(String[] args) {
		String filepath;

		if (args.length < 1) {
			System.out.println("Please give a filename as argument.");
			return ;
		}
		else {
			filepath = System.getProperty("user.dir") + java.nio.file.FileSystems.getDefault().getSeparator() + args[0];
		}
		
		try {			
			FileInputStream file = new FileInputStream(filepath);
			MiniJavaParser parser = new MiniJavaParser(file);
			Program node=parser.Program();
			//First traverse, establish symbol table
			SymbolVisitor visitor= new SymbolVisitor();
			SymbolClassTable table=new SymbolClassTable();
			node.accept(visitor,table);
			if(visitor.IsSummaryExist()){
				System.out.println("Analyze the error information:");
				System.out.println(visitor.GetSummary());
			}
			else
			{
				System.out.println("Print the symbolic tables for the first analysis:");
				new TestFirstStep(table).PrintTable();
				InheritVisitor hVisitor=new InheritVisitor();
				node.accept(hVisitor,table);
				if(hVisitor.getSum().IsSummaryExist())
				{
					System.out.println(hVisitor.toString());
				}
				else
				{
					new TestSecondStep(table).PrintTable();
					TypeVisitor tVisitor=new TypeVisitor(table);
					node.accept(tVisitor,null);
					if(tVisitor.getSum().IsSummaryExist())
						System.out.println(tVisitor.toString());
					else{
						try {
							FileWriter writer=new FileWriter( filepath.substring(0, filepath.lastIndexOf('.')) + ".asm" );
							writer.write(tVisitor.getAsm());
							writer.close();
							new MakeLink(System.getProperty("user.dir"),args[0]);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Success :)");
					}
				}
			}
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Can not find file at:"+filepath);
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
