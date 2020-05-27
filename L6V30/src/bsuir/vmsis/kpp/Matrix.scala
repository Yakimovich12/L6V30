package bsuir.vmsis.kpp

import scala.math.BigInt.int2bigInt

object Matrix {
  def main(arg:Array[String])
  {
    println("Введите размер масива");
    val size=readInt()
    val matrix=InitFunction(size)
    var code=0
    do
    {
      println("Введите код операции")
      println("1-Найти произведение элементов на главной диагонали")
      println("2-Найти произведение элементов на побочной диагонали")
      println("0-Выход")
      code=readInt()
      if(code==1)
         PrintFunction(MainDiagonal _,matrix,size)
      if(code==2)
        PrintFunction(SideDiagonal _,matrix,size)
    }while(code!=0)
    
  }
  def InitFunction(size:Int):Array[Array[Int]]=
  {
    val mas=Array.ofDim[Int](size,size)
    for(i<-0 to size-1)
      for(j<-0 to size-1)
      {
        println("Введите matrix["+i+"]["+j+"]")
        mas(i)(j)=readInt()
      }
    mas
  }
  def MainDiagonal(matrix:Array[Array[Int]],size:Int):BigInt=
  {
    var Mdiag=1
    for(i<-0 to size-1)
      Mdiag*=matrix(i)(i)
    Mdiag
  }
  def SideDiagonal(matrix:Array[Array[Int]],size:Int):BigInt=
  {
    var Sdiag=1
    for(i<-0 to size-1)
      Sdiag*=matrix(i)(size-i-1)
    Sdiag
  }
  
  def PrintFunction(fun:(Array[Array[Int]],Int)=>BigInt,matrix:Array[Array[Int]],size:Int):Unit=
  {
    val result=fun(matrix,size)
    println("Результат произведения: "+result)
  }
}