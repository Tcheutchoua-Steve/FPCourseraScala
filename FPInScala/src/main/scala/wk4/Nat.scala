package wk4

//Peano numbers

abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat = new Succ(this)
  def + (that: Nat): Nat
  def - (that: Nat): Nat = if (that.isZero) this else (predecessor - that.predecessor)
}

object Zero extends Nat{
  override def isZero: Boolean = true

  override def predecessor: Nat = throw new Error("No predecessor for Zero")

  override def +(that: Nat): Nat = that

}

class Succ(n: Nat) extends Nat{
  override def isZero: Boolean = false

  override def predecessor: Nat = n

  override def +(that: Nat): Nat = n + that.successor
}