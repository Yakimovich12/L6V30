import scala.collection.mutable.ArrayBuffer

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
    val mas=Array.ofDim[Int](size,size);
    var i,j=0
    while(i<size)
    {
      j=0
      while(j<size)
      {
        println("Введите matrix["+i+"]["+j+"]")
        mas(i)(j)=readInt()
        j+=1
      }
      i+=1
    }
    mas
  }
  def MainDiagonal(matrix:Array[Array[Int]],size:Int):BigInt=
  {
    var i=0
    var Mdiag=1
    while(i<size)
    {
      Mdiag*=matrix(i)(i)
      i+=1
    }
    Mdiag
  }
  def SideDiagonal(matrix:Array[Array[Int]],size:Int):BigInt=
  {
    var i=0
    var Sdiag=1
    while(i<size)
    {
      Sdiag*=matrix(i)(size-i-1)
      i+=1
    }
    Sdiag
  }
  
  def PrintFunction(fun:(Array[Array[Int]],Int)=>BigInt,matrix:Array[Array[Int]],size:Int):Unit=
  {
    val result=fun(matrix,size)
    println("Результат произведения: "+result)
  }
}