//
// Generated by JTB 1.3.2
//

package mini.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> ","
 * exp -> Exp()
 */
public @SuppressWarnings("all") class ExpRest implements Node {
   private Node parent;
   public NodeToken nodeToken;
   public Exp exp;

   public ExpRest(NodeToken n0, Exp n1) {
      nodeToken = n0;
      if ( nodeToken != null ) nodeToken.setParent(this);
      exp = n1;
      if ( exp != null ) exp.setParent(this);
   }

   public ExpRest(Exp n0) {
      nodeToken = new NodeToken(",");
      if ( nodeToken != null ) nodeToken.setParent(this);
      exp = n0;
      if ( exp != null ) exp.setParent(this);
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
