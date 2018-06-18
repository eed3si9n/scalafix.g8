package fix

import scalafix._
import scala.meta._

final case class $rule;format="Camel"$_$version;format="snake"$(index: SemanticdbIndex)
    extends SemanticRule(index, "$rule;format="Camel"$_$version;format="snake"$") {

  override def fix(ctx: RuleCtx): Patch = {
    println(s"Tree.syntax: " + ctx.tree.syntax)
    println(s"Tree.structure: " + ctx.tree.structure)
    Patch.empty
  }

}
