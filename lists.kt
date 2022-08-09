import kotlin.math.PI

    
    fun main() {
       // Read-only (immutable)
    val names = listOf("Ahad", "Turki", "Raghad", "Nasser", "Sumayah", "Fahdah")
    val namesAll = listOf("Ahad", "Turki", "Raghad", "Nasser")
    val color = listOf<String>()
    
    // Read and Write (mutable)
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val weekDays = mutableListOf("Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat")

    
    // Read-Write (mutable) List - Operations
    
    
    // Add (Element)
    println("list before adding:$numbers")
    numbers.add("six")
   
    println("list after adding:$numbers")
    
    
    
    // Add (Index, Element)
    println("list before adding:$numbers")
    numbers.add(6,"seven")
    println("list after adding:$numbers ")
    
    // Add All (List)
    println("list before adding:$weekDays")
    weekDays .addAll(numbers)
    println("list after adding : $weekDays")
    // Add All (Index, List)
    println("list before adding : $weekDays")
    weekDays.addAll(2,numbers)
    println(" list after adding: $weekDays")
    
    val numbers1=mutableListOf("eight","nine","ten")
    
    // Clear 
    println( " list before clear: $numbers1 ")
    numbers1.clear()
    println("list after clear: $numbers1")
    
    
    val names1 = mutableListOf("Ahad", "Turki", "Lama", "Nasser", "Sumayah", "Fahdah")
    
    // Remove
    println("list before Remove ( Ahad): $names1")
    names1.remove("Ahad")
    println(" list after Remove (Ahad): $names1")
    
    // Remove At 
    println(" list before Remove element at position 3 :$names1")
    names1.removeAt(3)
    println("list after Remove element at position 3 : $names1")
    
    // Remove All
    println("list before removing:$weekDays")
    weekDays.removeAll(numbers)
    println("list after removing:$weekDays")
    
    // Read-only (immutable) List - Operations
     
     
    // The size of the list
    println("the size of list ${names.size}")
    
    // Contains
    println("Is Sumayah on the list? ${names.contains("Sumayah")}")
    
    // Contains All
    
    println("Is (namesAll) have same elements as (names): ${namesAll.containsAll(names)}")
    // get
    println("name At index (1) is: ${names.get(1)}")
    
    // indexOf
    println("Fahdah's order in the list is: ${names.indexOf("Fahdah")}")
    
    // isEmpty
    println("names list is empty? ${names.isEmpty()}")
    
    
    // Sublist
    println("The last two names on the list are: ${names.subList(4,6)}")
}
