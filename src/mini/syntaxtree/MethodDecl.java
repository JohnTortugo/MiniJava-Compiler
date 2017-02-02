//
// Generated by JTB 1.3.2
//

package mini.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "public"
 * type -> Type()
 * identifier -> Identifier()
 * nodeToken1 -> "("
 * nodeOptional -> ( FormalList() )?
 * nodeToken2 -> ")"
 * nodeToken3 -> "{"
 * nodeListOptional -> ( VarDecl() )*
 * nodeListOptional1 -> ( Statement() )*
 * nodeToken4 -> "return"
 * exp -> Exp()
 * nodeToken5 -> ";"
 * nodeToken6 -> "}"
 */
public @SuppressWarnings("all") class MethodDecl implements Node {
   private Node parent;
   public NodeToken nodeToken;
   public Type type;
   public Identifier identifier;
   public NodeToken nodeToken1;
   public NodeOptional nodeOptional;
   public NodeToken nodeToken2;
   public NodeToken nodeToken3;
   public NodeListOptional nodeListOptional;
   public NodeListOptional nodeListOptional1;
   public NodeToken nodeToken4;
   public Exp exp;
   public NodeToken nodeToken5;
   public NodeToken nodeToken6;

   public MethodDecl(NodeToken n0, Type n1, Identifier n2, NodeToken n3, NodeOptional n4, NodeToken n5, NodeToken n6, NodeListOptional n7, NodeListOptional n8, NodeToken n9, Exp n10, NodeToken n11, NodeToken n12) {
      nodeToken = n0;
      if ( nodeToken != null ) nodeToken.setParent(this);
      type = n1;
      if ( type != null ) type.setParent(this);
      identifier = n2;
      if ( identifier != null ) identifier.setParent(this);
      nodeToken1 = n3;
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
      nodeOptional = n4;
      if ( nodeOptional != null ) nodeOptional.setParent(this);
      nodeToken2 = n5;
      if ( nodeToken2 != null ) nodeToken2.setParent(this);
      nodeToken3 = n6;
      if ( nodeToken3 != null ) nodeToken3.setParent(this);
      nodeListOptional = n7;
      if ( nodeListOptional != null ) nodeListOptional.setParent(this);
      nodeListOptional1 = n8;
      if ( nodeListOptional1 != null ) nodeListOptional1.setParent(this);
      nodeToken4 = n9;
      if ( nodeToken4 != null ) nodeToken4.setParent(this);
      exp = n10;
      if ( exp != null ) exp.setParent(this);
      nodeToken5 = n11;
      if ( nodeToken5 != null ) nodeToken5.setParent(this);
      nodeToken6 = n12;
      if ( nodeToken6 != null ) nodeToken6.setParent(this);
   }

   public MethodDecl(Type n0, Identifier n1, NodeOptional n2, NodeListOptional n3, NodeListOptional n4, Exp n5) {
      nodeToken = new NodeToken("public");
      if ( nodeToken != null ) nodeToken.setParent(this);
      type = n0;
      if ( type != null ) type.setParent(this);
      identifier = n1;
      if ( identifier != null ) identifier.setParent(this);
      nodeToken1 = new NodeToken("(");
      if ( nodeToken1 != null ) nodeToken1.setParent(this);
      nodeOptional = n2;
      if ( nodeOptional != null ) nodeOptional.setParent(this);
      nodeToken2 = new NodeToken(")");
      if ( nodeToken2 != null ) nodeToken2.setParent(this);
      nodeToken3 = new NodeToken("{");
      if ( nodeToken3 != null ) nodeToken3.setParent(this);
      nodeListOptional = n3;
      if ( nodeListOptional != null ) nodeListOptional.setParent(this);
      nodeListOptional1 = n4;
      if ( nodeListOptional1 != null ) nodeListOptional1.setParent(this);
      nodeToken4 = new NodeToken("return");
      if ( nodeToken4 != null ) nodeToken4.setParent(this);
      exp = n5;
      if ( exp != null ) exp.setParent(this);
      nodeToken5 = new NodeToken(";");
      if ( nodeToken5 != null ) nodeToken5.setParent(this);
      nodeToken6 = new NodeToken("}");
      if ( nodeToken6 != null ) nodeToken6.setParent(this);
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
