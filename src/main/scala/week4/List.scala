package week4

/**
  * Created by Kodi on 4/15/2017.
  */
trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  override def isEmpty: Boolean = false
}

class Nil[T] extends List[T] {
  override def isEmpty: Boolean = true

  override def head: T = throw new NoSuchElementException("Nil.head")

  override def tail: List[T] = throw new NoSuchElementException("Nil.tail")
}

object List {
  def apply[T](): List[T] = new Nil
  def apply[T](x: T): List[T] = new Cons[T](x, List[T]())
  def apply[T](x: T, y: T): List[T] = new Cons(x, List[T](y))
}
