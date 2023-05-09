In Java, arrays are used to store elements of the same data type in a contiguous memory location. Here are some common methods, functionalities, and examples of using arrays in Java:

# java.util.Arrays

1. Declare and initialize an array:

    ```java
    // Declare an integer array of size 5
    int[] intArray = new int[5];

    // Declare and initialize an integer array
    int[] intArray2 = {1, 2, 3, 4, 5};

    ```
2. Access and modify elements:

    ```java
    // Access the first element of the array
    int firstElement = intArray2[0];

    // Modify the value of the third element
    intArray2[2] = 10;
    ```
3. Loop through elements:

    ```java
    // Using a for loop
    for (int i = 0; i < intArray2.length; i++) {
        System.out.println(intArray2[i]);
    }

    // Using an enhanced for loop (for-each loop)
    for (int element : intArray2) {
        System.out.println(element);
    }
    ```
4. Multi-dimensional arrays:
    ```java
    // Declare and initialize a 2D integer array (matrix)
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    // Access an element in the matrix
    int element = matrix[1][2]; // element = 6

    ```
5. Common array operations:
    ```java
    import java.util.Arrays;

    // Sort an array
    int[] unsortedArray = {5, 1, 9, 3, 7};
    Arrays.sort(unsortedArray);

    // Search for an element in a sorted array using binary search
    int index = Arrays.binarySearch(unsortedArray, 7); // index = 3

    // Copy an array
    int[] newArray = Arrays.copyOf(unsortedArray, unsortedArray.length);

    // Compare two arrays for equality
    boolean arraysEqual = Arrays.equals(unsortedArray, newArray); // true
    ```

# Java Collections

Java provides the Collections framework as an alternative to using arrays, which offers more flexibility and functionality. Some commonly used collections are:

1. Lists: An ordered collection that allows duplicates and supports dynamic resizing.

    ```java
    import java.util.ArrayList;
    import java.util.List;

    // Create an empty list of integers
    List<Integer> intList = new ArrayList<>();

    // Add elements to the list
    intList.add(1);
    intList.add(2);
    intList.add(3);

    // Access and modify elements
    int firstElement = intList.get(0);
    intList.set(2, 10);

    // Loop through elements
    for (int element : intList) {
        System.out.println(element);
    }
    ```
2. Sets: An unordered collection that does not allow duplicates.
    ```java
    import java.util.HashSet;
    import java.util.Set;

    // Create an empty set of integers
    Set<Integer> intSet = new HashSet<>();

    // Add elements to the set
    intSet.add(1);
    intSet.add(2);
    intSet.add(3);

    // Loop through elements
    for (int element : intSet) {
        System.out.println(element);
    }

    ```
3. Maps: A collection of key-value pairs where keys are unique.
    ```java
    import java.util.HashMap;
    import java.util.Map;

    // Create an empty map with integer keys and string values
    Map<Integer, String> intStrMap = new HashMap<>();

    // Add key-value pairs to the map
    intStrMap.put(1, "One");
    intStrMap.put(2, "Two");
    intStrMap.put(3, "Three");

    // Access values using keys
    String value = intStrMap.get(2);

    // Check if a key exists in the map
    boolean keyExists = intStrMap.containsKey(3); // true

    // Check if a value exists in the map
    boolean valueExists = intStrMap.containsValue("Four"); // false

    // Loop through keys and values
    for (Map.Entry<Integer, String> entry : intStrMap.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }

    ```
To summarize, Java provides various ways to work with arrays and collections, each with its own advantages and use cases. Arrays offer a simple and efficient way to store and access elements of the same data type, while the Collections framework provides more flexible and advanced data structures like Lists, Sets, and Maps, which can accommodate dynamic resizing and offer additional functionalities.

for more methods and details refer official java documentation
[java documentaion](https://docs.oracle.com/)