object HelloWorld {
   def main(args: Array[String]) {
      val p1=Point(2,5)
      val p2=Point(3,1)
      val p3=p1.move(2,3)

   }
}

case class Point(i:Int, j:Int){
    def x:Int=i
    def y:Int=j
    
    def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
    def add(p1:Point)=Point(this.x+p1.x,this.y+p1.y)
}
