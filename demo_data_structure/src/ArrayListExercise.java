import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.
    ArrayList<Integer> arraylist1  = new ArrayList<>();
    arraylist1.add(10);
    arraylist1.add(20);
    arraylist1.add(30);
    arraylist1.add(40);
    arraylist1.add(50);
    System.out.println(arraylist1);
    arraylist1.remove(2);
    System.out.println(arraylist1.size());
    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Orange");
    if (!fruits.contains("Grape")) {
        fruits.add("Grape");
    }
    int MangoIndex = fruits.indexOf("Mango");
    if (MangoIndex != -1) {
        fruits.set(MangoIndex, "Peach");
    }    System.out.println(fruits);

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.
    ArrayList<Integer> arraylist2  = new ArrayList<>();
    arraylist2.add(10);
    arraylist2.add(20);
    arraylist2.add(10);
    arraylist2.add(30);
    arraylist2.add(40);
    arraylist2.add(20);
    arraylist2.add(50);

    HashSet<Integer> uniqueSet = new HashSet<>(arraylist2);
    List<Integer> uniqueList = new ArrayList<>(uniqueSet);

    System.out.println(uniqueList);

    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.

    HashSet<String> countries = new HashSet<>();
    countries.add("USA");
    countries.add("India");
    countries.add("China");
    countries.add("Japan");
    countries.add("Canada");
    System.out.println(countries.add("India"));
    System.out.println(countries);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.
    
    HashSet<Double> numbers= new HashSet<>();
    numbers.add(1.1);
    numbers.add(2.2);
    numbers.add(3.3);
    numbers.add(4.4);
    numbers.add(5.5);
    double index = 0.0;

    double targetRemoveIndex = 2.2;
    for(double d : numbers){
        if (targetRemoveIndex == index) {
            targetRemoveIndex = d;
            break;
        }
        index = index + 1.1;
    }
    numbers.remove(targetRemoveIndex);
    System.out.println(numbers);
    System.out.println(numbers.size());

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.
    HashSet<Integer> set1 = new HashSet<>();
    set1.add(10);
    set1.add(20);
    set1.add(30);
    set1.add(40);
    HashSet<Integer> set2 = new HashSet<>();
    set2.add(30);
    set2.add(40);
    set2.add(50);
    set2.add(60);
    HashSet<Integer> set = new HashSet<>();
    for(Integer int1 : set1){
      for(Integer int2 : set2){
          if (int1.equals(int2)) {
              set.add(int1);
          }
      }
    }
    System.out.println(set);


    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.
    HashSet<String> names = new HashSet<>();
    names.add("Cherry");
    names.add("Steve");
    names.add("Chole");
    names.add("Jenny");
    names.add("Vicky");

    ArrayList<String> Names = new ArrayList<>(names);

    System.out.println(Names);


    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'
    ArrayList<String> Students = new ArrayList<>();
    Students.add("Alice");
    Students.add("Bob");
    Students.add("Charlie");
    for(String Student : Students){
        System.out.println("Name: " + Student);
    }
    Students.remove("Bob");
    System.out.println(Students);
    for(String Student : Students){
        if (Students.contains("Bob")) {
          System.out.println("Found");
        }else{
          System.out.println("Student not found");
        }
    }
    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
    
  }

  public static class Student {
    private int id;
    private String name;

    // Constructor
    // getter, setter, etc.
  }
}