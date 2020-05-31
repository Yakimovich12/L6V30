package test.scala

class MatrixTest extends org.scalatest.FunSuite
{
  test("test0")
  {
    val size:Int=3
    val mas=Array.ofDim[Int](size,size)
    for(i<-0 to size-1)
      for(j<-0 to size-1)
        mas(i)(j)=i*size+j
    val Mdiag=main.scala.Matrix.Function(main.scala.Matrix.MainDiagonal _,mas,size)
    assert(Mdiag == 0)
  }
  test("test1")
  {
    val size:Int=3
    val mas=Array.ofDim[Int](size,size)
    for(i<-0 to size-1)
      for(j<-0 to size-1)
        mas(i)(j)=i*size+j
    val Sdiag=main.scala.Matrix.Function(main.scala.Matrix.SideDiagonal _,mas,size)
    assert(Sdiag == 48)
  }
  test("test2")
  {
    val size:Int=3
    val mas=Array.ofDim[Int](size,size)
    for(i<-0 to size-1)
      for(j<-0 to size-1)
        mas(i)(j)=(i*size+j+1)*100
    val Mdiag=main.scala.Matrix.Function(main.scala.Matrix.MainDiagonal _,mas,size)
    assert(Mdiag == 45000000)
  }
  test("test3")
  {
    val size:Int=3
    val mas=Array.ofDim[Int](size,size)
    for(i<-0 to size-1)
      for(j<-0 to size-1)
        mas(i)(j)=(i*size+j+1)*100
    val Sdiag=main.scala.Matrix.Function(main.scala.Matrix.SideDiagonal _,mas,size)
    assert(Sdiag == 105000000)
  }
  test("test4")
  {
    val size:Int=1
    val mas=Array.ofDim[Int](size,size)
        mas(0)(0)=890
    val Sdiag=main.scala.Matrix.Function(main.scala.Matrix.SideDiagonal _,mas,size)
    assert(Sdiag == 890)
  }
  test("test5")
  {
    val size:Int=1
    val mas=Array.ofDim[Int](size,size)
    mas(0)(0)=890
    val Mdiag=main.scala.Matrix.Function(main.scala.Matrix.MainDiagonal _,mas,size)
    assert(Mdiag == 890)
  }
}
