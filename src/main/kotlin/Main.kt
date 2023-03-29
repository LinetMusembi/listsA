fun main(){
    people()
    val evenIndeces = listOf("Linet","Eunice","Jemimah","Esther","Moureen")
    println(evenIndeces)
    var x = Vehicles("KYF020F",60)
    var y = Vehicles("KBM230G",50)
    var z = Vehicles("KCF343P",70)
    var p = Vehicles("KFD343V",75)
    var allVehicles= listOf(x,y,z,p)
    println(vehicleList(allVehicles))

    var people1=Persons("linet",20,32.5,55)
    var people2=Persons("eunice",56,30.6,70)
    var people3=Persons("ann",22,56.6,90)
    var people4=Persons("mercy",30,65.5,70)
    var people= listOf<Persons>(people1,people2,people3,people4)
    var pple=people.sortedByDescending {people->people.age }
    println(pple)

    val evenName= listOf("Hope","hii","mimi","joy","grace","betty","remy","steve","jimmy","ann")
    println(evenName)

//    3. Given a list of Person objects, each with the attributes, name, age,
//    height and weight. Sort the list in order of descending age (2 points)
//
//    4. Given a list similar to the one above, write a function in which you will
//    create 2 more people objects and add them to the list at one go.
//    (1 points)

}
//. Given a list of people’s heights in metres. Write a function that returns
//  the average height and the total height (2 points)

fun people(){
    var number = mutableListOf(3,5,7,10,7,8,9,5)
    println(number.average())
    println(number.sum())
}
//1. Given a list of 10 strings, write a function that returns a list of the strings
//    at even indices i.e index 2,4,6 etc (2 points

fun many (many:List<String>):List<String>{
    many.forEachIndexed{index, s ->
    if (index % 2 == 0) {
        println(s)
    }
    }
    return many

}
//Write a function that takes in a list of Car objects each with a
//            registration and mileage attribute and returns the average mileage of
//            all the vehicles in the list. (3 points)
data class Vehicles(var registration:String, var mileage:Int)
fun vehicleList(vehicle:List<Vehicles>):Int{
    var avg=0
    vehicle.forEach { new->new.mileage
        avg+=new.mileage
    }
    var totalAvg=vehicle.count()
    return totalAvg
}
class Persons(var nam:String,var age:Int,var height:Double,var weight:Int)


fun addpple(topple:List<Persons>):List<Any>{

