# M1 Challenge

This challenge consists of several coding exercises that evaluate your understanding of object-oriented programming in Java.

This challenge might look familiar, as it is very similar to an exercise from earlier in the course.  However, there are several differences and additions, so make sure to read and follow the challenge instructions carefully!

## Challenge Set Up

1. Code must reside in one directory called `M1-Challenge-Lastname-Firstname`.

2. Solutions must reside in their own IntelliJ project as specified below.

## Exercise 1: Converter Interface

1. Create your solution in an IntelliJ project called `ConverterInterface`.

2. Create two implementations of the below interface. 

3. The first implementation must use if/else if/else statements and be called `ConverterIf`.

4. The second implementation must use switch statements and be called `ConverterSwitch`.

5. Create a class called `ConverterApplication` which has your main method. 

6. Instantiate and use both the `ConverterIf` and `ConverterSwitch` classes in that main method.

7. Implement the interface of `ConverterIf` and `ConverterSwitch` classes by using the code below:

```java
public interface Converter {

    /**
     * This method converts the given number into its corresponding month.
     * @param monthNumber the number you wish to convert to a month
     * @return the name of the corresponding month if the parameter value is between 1 and 12; error message otherwise
     */
    String convertMonth(int monthNumber);

    /**
     * This method converts the given number into its corresponding day of the week.
     * @param dayNumber number you wish to convert to a day of the week
     * @return the name of the corresponding day if the parameter value is between 1 and 7, error message otherwise
     * The first day of the week is Sunday
     */
    String convertDay(int dayNumber);

}
```

8. Using JUnit, implement test cases to verify the functionality of your `ConverterIf` and `ConverterSwitch` classes.

## Exercise 2: Calculate Object 

### Requirements

- In this exercise, you will create a class that has a set of methods that does addition, subtraction, multiplication, and division for two integer parameters and a separate set of methods that does the same for two double parameters. 

- You will then instantiate the class and use it to perform the following calculations below. 

- You must print out the calculation being performed and the result of the calculation. For example: 2 + 2 = 4.

### Instructions

1. Create your solution in an IntelliJ project called `CalculatorObject`.

2. Perform the following calculations:

- 1 + 1
- 23 - 52
- 34 * 2
- 12 / 3
- 12 / 7
- 3.4 + 2.3
- 6.7 * 4.4
- 5.5 - 0.5
- 10.8 / 2.2

3. Using JUnit, implement test cases to verify the functionality of your calculator class.  Include test cases for integers and doubles, using each of the four operations (addition, subtraction, multiplication and division).

## Exercise 3: Ice Cream Design 

### Requirements

- In this exercise, you will model the attributes of two different `IceCream` classes.

- The first class will represent ice cream as it might be modeled in the point-of-sale system in an ice cream shop. The second class will represent ice cream as it might be modeled in an ice cream factory.

- Each class must have at least three data members and at least three methods.

### Instructions

1. Create your solution in an IntelliJ project called `IceCreamClassDesign`.

2. Using JUnit, implement test cases to verify the functionality of your two `IceCream` classes.

Since you will be testing two different `IceCream` classes with the same name, you will need to use the "fully qualified" names of the classes instead of importing them.

For example, if the paths of your two `IceCream` classes are "com.company.factory" and "com.company.pointofsale":

- Example code to create the "factory" version of the `IceCream` class might look like:

```java
com.company.factory.IceCream iceCream =
        new com.company.factory.IceCream(flavor, salePrice, productionCost, productionTime, ingredients);
```

- Example code to create the "pointofsale" version of the `IceCream` class might look like:

```java
com.company.pointofsale.IceCream iceCream =
        new com.company.pointofsale.IceCream(flavor, price, quantity);
```

## Exercise 4: RPGInheritance

### Requirements

In this exercise, you will design an inheritance hierarchy for characters in a video game. Your design must include a common base class for the following three character types:

- Farmer

- Constable

- Warrior

### Instructions

1. Create your solution in an IntelliJ project called (`RPGInheritance`).

2. Create the following three classes, each deriving from a common base class:

- Farmer

  - Properties:
    - name
    - strength (initial value = 75)
    - health (initial value = 100)
    - stamina (initial value = 75)
    - speed (initial value = 10)
    - attackPower (initial value = 1)
    - running (initial value = false)
    - arrested (initial value = false)
    - plowing (initial value = false)
    - harvesting (initial value = false)

  - Abilities:
    - attack another character

- Constable

  - Properties
    - name
    - strength (initial value = 60)
    - health (initial value = 100)
    - stamina (initial value = 60)
    - speed (initial value = 20)
    - attackPower (initial value = 5)
    - running (initial value = false)
    - arrested (initial value = false)
    - jurisdiction

  - Abilities:
    - arrest another character
    - attack another character

- Warrior

  - Properties
    - name
    - strength (initial value = 75)
    - health (initial value = 100)
    - stamina (initial value = 100)
    - speed (initial value = 50)
    - attackPower (initial value = 10)
    - shieldStrength (initial value = 100)
    - running (initial value = false)
    - arrested (initial value = false)

  - Abilities:
    - attack another character

3. Using JUnit, implement test cases to verify the functionality of the three classes.

## Exercise 5: Customer Composition

### Requirements

- In this exercise, you will design and implement a class that represents a customer based on the specifications below. 

- Use composition for maximum code reuse.

### Instructions

1. Create your solution in an IntelliJ project called `CustomerComposition`.

2. Design a Customer class that keeps track of:

  - First name

  - Last name

  - Email

  - Phone number

  - Shipping address:
    - Street 1
    - Street 2
    - City
    - State
    - Zip

  - Billing address:
    - Street 1
    - Street 2
    - City
    - State
    - Zip

  - If the customer is a Rewards Member or not.

3. Using JUnit, implement test cases to verify the functionality of your customer class.

## Submission

Great job completing your first Challenge! Now it’s time to submit. It may seem intimidating to look at, but these steps will become second nature before you know it. Make sure to double check that your submission is completed.

1. **Create and clone a working Java repo**: On Github.com, create a repository called `YourFirstName_YourLastName_Java`. Clone the repository onto your machine.

2. **Copy your folder:** When you have completed your Challenge Assessment, copy your completed `M1-Challenge-Lastname-Firstname` folder (located inside in your Working Folder Java) into your personal GitHub repository folder located on your desktop.

3.  **Complete the commands:**
   Once the `M1-Challenge-Lastname-Firstname` folder has been copied into the GitHub repository folder, navigate into your GitHub repository in either your Terminal (Mac) or Git Bash (Windows). Once you have navigated to the appropriate repository, complete the following commands (which should be familiar):

    - `git add -A`
    - `git commit-m"< commit message >" ` where `< commit message > ` is your commit message for the commit.
    - `git push origin master`. 

4. **Navigate:** Open your personal account on Github.com. Navigate to the  `YourFirstName_YourLastName_Java` repository.

5. **Confirm:** Click on the `M1-Challenge-Lastname-Firstname` folder that you created and uploaded. Confirm that ALL of the expected projects have been included inside that folder. Again, the folder name should be related to the Module associated with the Challenge.

6. **Copy the URL:** Copy the URL of the Challenge folder from the browser address bar.

7. **Paste the URL:** Log into BootCampSpot and paste the URL for this specific Challenge in the appropriate location.

## Grading Requirements

In this challenge, your grade will consist of a combination of general set up and format requirements, and your actual code. See the criteria below for more detailed information:

### Exercise 1 Code: 20%

- Your solution must reside in an IntelliJ project called `ConverterInterface`.

- The first implementation uses if/else/else if statements and is called `ConverterIf`.

- The second implementation uses switch statements and is called `ConverterSwitch`.

- You create a class called `ConverterApplication` which has your main method. In that main method, you instantiate and use both the `ConverterIf` and `ConverterSwitch` classes.

- You create JUnit test cases to verify your `ConverterIf` and `ConverterSwitch` functionality.

### Exercise 2 Code: 20%

- You create a solution in an IntelliJ project called `CalculatorObject`.

- Your program prints out the calculation being performed and the result of the calculation.
  
  - 1 + 1
  - 23 - 52
  - 34 * 2
  - 12 / 3
  - 12 / 7
  - 3.4 + 2.3
  - 6.7 * 4.4
  - 5.5 - 0.5
  - 10.8 / 2.2

- You create JUnit test cases to verify your calculator functionality.

### Exercise 3 Code: 20%

- You create your solution in an IntelliJ project called `IceCreamClassDesign`.

- Your first class represents ice cream as it might be modeled in the point-of-sale system in an ice cream shop.

- Your second class represents ice cream as it might be modeled in an ice cream factory.

- Each class must have at least three data members and at least three methods.

- You create JUnit test cases to verify the functionality of the two ice cream classes.

### Exercise 4 Code: 20%

- You create your solution in an IntelliJ project called `RPGInheritance`.

- Your design must include a common base class for the following three character types:

  - Farmer

    - Properties:
      - name
      - strength (initial value = 75)
      - health (initial value = 100)
      - stamina (initial value = 75)
      - speed (initial value = 10)
      - attackPower (initial value = 1)
      - running (initial value = false)
      - arrested (initial value = false)
      - plowing (initial value = false)
      - harvesting (initial value = false)

    - Abilities:
      - attack another character

  - Constable

    - Properties
      - name
      - strength (initial value = 60)
      - health (initial value = 100)
      - stamina (initial value = 60)
      - speed (initial value = 20)
      - attackPower (initial value = 5)
      - running (initial value = false)
      - arrested (initial value = false)
      - jurisdiction

    - Abilities:
      - arrest another character
      - attack another character

  - Warrior

    - Properties
      - name
      - strength (initial value = 75)
      - health (initial value = 100)
      - stamina (initial value = 100)
      - speed (initial value = 50)
      - attackPower (initial value = 10)
      - shieldStrength (initial value = 100)
      - running (initial value = false)
      - arrested (initial value = false)

    - Abilities:
      - attack another character

- You create JUnit test cases to verify the functionality of each of the three classes.

### Exercise 5 Code: 20%

- You create your solution in an IntelliJ project called `CustomerComposition`.

- You design a Customer class which must keep track of:

  - First name
  
  - Last name
  
  - Email
  
  - Phone number
  
  - Shipping address:
    - Street 1
    - Street 2
    - City
    - State
    - Zip

  - Billing address:
    - Street 1
    - Street 2
    - City
    - State
    - Zip

  - If the customer is a Rewards Member or not.

- You create JUnit test cases to verify the functionality of your Customer class.

---

© 2021 Trilogy Education Services, a 2U, Inc. brand. All Rights Reserved.
