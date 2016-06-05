//
// Generated by JTB 1.3.2
//

package mini.syntaxtree;

/**
 * Grammar production:
 * type -> Type()
 * identifier -> Identifier()
 * nodeToken -> ";"
 */
public @SuppressWarnings("all") class VarDecl implements Node {
   private Node parent;
   public Type type;
   public Identifier identifier;
   public NodeToken nodeToken;

   public VarDecl(Type n0, Identifier n1, NodeToken n2) {
      type = n0;
      if ( type != null ) type.setParent(this);
      identifier = n1;
      if ( identifier != null ) identifier.setParent(this);
      nodeToken = n2;
      if ( nodeToken != null ) nodeToken.setParent(this);
   }

   public VarDecl(Type n0, Identifier n1) {
      type = n0;
      if ( type != null ) type.setParent(this);
      identifier = n1;
      if ( identifier != null ) identifier.setParent(this);
      nodeToken = new NodeToken(";");
      if ( nodeToken != null ) nodeToken.setParent(this);
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
