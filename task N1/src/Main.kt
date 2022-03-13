fun main()
{
    println(sumOfNumbers(arrayOf(453,346,23)))
    println(palindrom("uyu"))
}
fun sumOfNumbers(arr : Array<Int>):Int
{
    var sum:Int = 0
    val x:Int = arr.size
    for (i in 0 until  x)
    {
        if (i%2==0)
        {
            sum+=arr[i]
        }
    }
    return sum
}
fun palindrom(x:String):Boolean
{
    var new_x:String = ""
    for (i in 0 until x.length)
    {
        new_x+=x[x.length-1-i]
    }
    if (new_x==x)
    {
        return true
    } else
    {
        return false
    }

}