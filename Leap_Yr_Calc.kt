//Hello peeps this is a Leap Year Identifier
//It free from errors for instance it don't  identify 1900 as leap year
//Please do hit the star if you 👍 😂😂😂 
fun main(args: Array<String>) {
 var year = readLine()!!.toInt()
  
  if (year % 100 == 0 && year % 400 == 0) {
    println(year.toString() + " is a Leap Year")
  }
  else if (year % 4 == 0 && year % 100 != 0) {
    println(year.toString() + " is a Leap Year")
  }
  else {
    println(year.toString() + " is not a Leap Year")
  }
}
