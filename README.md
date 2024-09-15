### Packages in java

print() is used for print in same line and move your cursor to the same line

println() is used to print and move your cursor in next line

```java
import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); // Create a Scanner object to read user input
    
    System.out.print("Enter username: "); // Print the prompt and keep input on the same line
    
    String userName = myObj.nextLine(); // Read the user's input and store it in the userName variable
    
    System.out.println("Username is: " + userName); // Print the entered username
  }
}

```

Custom own packages

1. java packages stored in directories with same name as package name
2. java package name must be in small letter
3. compile and run is same as before but dont switch the cmd directory, just write 

```java
package helloworld; // Defines the package

public class JavaCustomPackage {
    public static void main(String args[]) {
        System.out.println("Hello world");
    }
}

```

```java
javac helloworld/JavaCustomPackage.java
java  helloworld.JavaCustomPackage
```

Note: for taking stirng input you can use

```java
import java.util.Scanner;

Scanner s = new Scanner(System.in);
string abc = s.nextLine();
```

but for taking integer input or double input you can write

```java
import java.util.Scanner;

Scanner s = new Scanner(System.in);
int abc = s.nextInt();
//for double 
double d =  s.nextDouble();

```

with error handling

```java
try {
    System.out.print("Enter an integer: ");
    int num = scanner.nextInt();
    System.out.println("You entered: " + num);
} catch (InputMismatchException e) {
    System.out.println("Invalid input! Please enter an integer.");
}
```

### Enums in Java

An `enum` is a special "class" that represents a group of **constants** (unchangeable variables, like `final` variables).

```java
public enum PizzaSize {
    SMALL(5.99),   // SMALL is associated with 5.99
    MEDIUM(7.99),  // MEDIUM is associated with 7.99
    LARGE(9.99);   // LARGE is associated with 9.99

    private final double price;  // Enum field to store the price

    // Constructor that accepts a price argument
    PizzaSize(double price) {
        this.price = price;  // Assign the passed price to the field
    }

    // Method to retrieve the price associated with each size
    public double getPrice() {
        return price;  // Return the price for this enum constant
    }
}

```

```java
public class PizzaOrder {
    public enum PizzaSize {
        SMALL(5.99), MEDIUM(7.99), LARGE(9.99);

        private final double price;

        PizzaSize(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        PizzaSize size = PizzaSize.SMALL;
        System.out.println("Pizza size: " + size);
        System.out.println("Price: $" + size.getPrice());
    }
}

```

### Date and time

```java
package dates;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {
    public static void main(String args[]){
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        DateTimeFormatter fff = DateTimeFormatter.ofPattern("dd MMM, yyyy HH:mm:ss");
        System.out.println(fff.format(time));
    }
}

```
