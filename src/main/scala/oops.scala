
class Person(val name:String,val age:Int) extends Ordered[Person] {

  override def compare(that: Person): Int = {

    if(this.name.equals(that.name))
    {
      if (this.age<that.age) -1 else  0
    }
    else if (this.name.length<that.name.length) -1 else 0

  }

}

object Main {

  def main(args: Array[String]): Unit = {

    val personOne = new Person("Test", 24)
    val personTwo = new Person("Test", 25)
    println(personOne < personTwo)
    println(personOne > personTwo)
    println(personOne <= personTwo)
    println(personOne >= personTwo)
    println(personOne == personTwo)

  }
}