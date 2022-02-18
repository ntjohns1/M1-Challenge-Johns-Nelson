

## Exercise 3: Ice Cream Design 

### Requirements

- In this exercise, you will model the attributes of two different `IceCream` classes.

- The first class will represent ice cream as it might be modeled in the point-of-sale system in an ice cream shop. The second class will represent ice cream as it might be modeled in an ice cream factory.

- Each class must have at least three data members and at least three methods.

### Instructions

1. Create your solution in an IntelliJ project called `IceCreamClassDesign`.

2. Using JUnit, implement test cases to verify the functionality of your two `IceCream` classes.

Since you will be testing two different `IceCream` classes with the same name, you will need to use the "fully qualified" names of the classes instead of importing them.

For example, if the paths of your two `IceCream` classes are "com.company.Factory" and "com.company.pointofsale":

- Example code to create the "factory" version of the `IceCream` class might look like:

```java
com.company.Factory.IceCream iceCream =
        new com.company.Factory.IceCream(flavor, salePrice, productionCost, productionTime, ingredients);
```

- Example code to create the "pointofsale" version of the `IceCream` class might look like:

```java
com.company.pointofsale.IceCream iceCream =
        new com.company.pointofsale.IceCream(flavor, price, quantity);
```

---

### Exercise 3 Code: 20%

- You create your solution in an IntelliJ project called `IceCreamClassDesign`.

- Your first class represents ice cream as it might be modeled in the point-of-sale system in an ice cream shop.

- Your second class represents ice cream as it might be modeled in an ice cream factory.

- Each class must have at least three data members and at least three methods.

- You create JUnit test cases to verify the functionality of the two ice cream classes.

---

© 2021 Trilogy Education Services, a 2U, Inc. brand. All Rights Reserved.
