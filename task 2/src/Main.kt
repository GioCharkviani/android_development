fun main()
{
    val a  = Point(3,7);
    val b  = Point(3,6);
    println(a.toString())
    println(a.equals(b))
    a.symmetryFromCentre()
    println(a.x.toString() + " " + a.y.toString())

}
class Point(x:Int,y:Int)
{
    public var x  : Int = 0;
    public var y  : Int = 0;
    init {
        this.x = x
        this.y = y
    }
    override fun toString(): String {
        return x.toString() + " " +  y.toString()
    }
    fun equals(point: Point): Boolean {
        if (this.x==point.x && this.y == point.y)
            return true
        return false
    }
    fun symmetryFromCentre() {
        this.x = -1*x;
        this.y = -1*y;
    }
}