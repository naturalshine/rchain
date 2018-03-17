package rholang.parsing.rholang2.Absyn; // Java Package generated by the BNF Converter.

public class PPar extends Proc {
  public final Proc proc_1, proc_2;
  public PPar(Proc p1, Proc p2) { proc_1 = p1; proc_2 = p2; }

  public <R,A> R accept(rholang.parsing.rholang2.Absyn.Proc.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang2.Absyn.PPar) {
      rholang.parsing.rholang2.Absyn.PPar x = (rholang.parsing.rholang2.Absyn.PPar)o;
      return this.proc_1.equals(x.proc_1) && this.proc_2.equals(x.proc_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.proc_1.hashCode())+this.proc_2.hashCode();
  }


}