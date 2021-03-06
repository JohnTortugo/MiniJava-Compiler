//
// Generated by JTB 1.3.2
//

package mini.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "class"
 * identifier -> Identifier()
 * nodeToken1 -> "extends"
 * identifier1 -> Identifier()
 * nodeToken2 -> "{"
 * nodeListOptional -> ( VarDecl() )*
 * nodeListOptional1 -> ( MethodDecl() )*
 * nodeToken3 -> "}"
 */
public @SuppressWarnings("all") class ClassExtendsDeclaration implements Node {
   private Node parent;
   public NodeToken nodeToken;
   public Identifier identifier;
   public NodeToken nodeToken1;
   public Identifier identifier1;
   public NodeToken nodeToken2;
   public NodeListOptional nodeListOptional;
   public NodeListOptional nodeListOptional1;
   public NodeToken nodeToken3;

   public ClassExtendsDeclaration(NodeToken n0, Identifier n1, NodeToken n2, Identifier n3, NodeToken n4, NodeListOptional n5, NodeListOptional n6, NodeToken n7) {
      nodeToken = n0;
      if ( nodeToken != null ) nodeToken.setParent(this);
      identifier = n1;
      if ( identifier != null ) identifier.setParent(this);
      nodeToken1 = n2;
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
      identifier1 = n3;
      if ( identifier1 != null ) identifier1.setParent(this);
      nodeToken2 = n4;
      if ( nodeToken2 != null ) nodeToken2.setParent(this);
      nodeListOptional = n5;
      if ( nodeListOptional != null ) nodeListOptional.setParent(this);
      nodeListOptional1 = n6;
      if ( nodeListOptional1 != null ) nodeListOptional1.setParent(this);
      nodeToken3 = n7;
      if ( nodeToken3 != null ) nodeToken3.setParent(this);
   }

   public ClassExtendsDeclaration(Identifier n0, Identifier n1, NodeListOptional n2, NodeListOptional n3) {
      nodeToken = new NodeToken("class");
      if ( nodeToken != null ) nodeToken.setParent(this);
      identifier = n0;
      if ( identifier != null ) identifier.setParent(this);
      nodeToken1 = new NodeToken("extends");
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
      identifier1 = n1;
      if ( identifier1 != null ) identifier1.setParent(this);
      nodeToken2 = new NodeToken("{");
      if ( nodeToken2 != null ) nodeToken2.setParent(this);
      nodeListOptional = n2;
      if ( nodeListOptional != null ) nodeListOptional.setParent(this);
      nodeListOptional1 = n3;
      if ( nodeListOptional1 != null ) nodeListOptional1.setParent(this);
      nodeToken3 = new NodeToken("}");
      if ( nodeToken3 != null ) nodeToken3.setParent(this);
   }

   public void accept(mini.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(mini.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(mini.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(mini.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
   public void setParent(Node n) { parent = n; }
   public Node getParent()       { return parent; }
}

