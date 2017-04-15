package week4

/**
  * Created by Kodi on 4/15/2017.
  */
class Succ(n: Nat) extends Nat {
  override def isZero: Boolean = false

  override def predecessor: Nat = n

  override def +(that: Nat): Nat = new Succ( n + that )

  override def -(that: Nat): Nat =
    if(that.isZero) this
    else n - that.predecessor

  override def toString: String = "1 + " + n.toString

}
