import csharp
import semmle.code.csharp.controlflow.Guards

query predicate impliesStep(Expr e1, AbstractValue v1, Expr e2, AbstractValue v2) {
  Internal::impliesStep(e1, v1, e2, v2)
}

query predicate impliesStepIdentity(Expr e1, Expr e2) {
  Internal::impliesStepIdentity(e1, e2)
}
