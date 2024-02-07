package OOPs.Inheritance;

class A {
    int s = 10;

    void display() {
        System.out.println("Hello User : From A");
    }
}

class B extends A {
    void display() {
        super.display(); // calling the parent class method using 'super' keyword
        System.out.println("Hello User : From B");
    }
}

class C extends B {
    int s;

    void display() {
        super.display(); // calling the method of parent class using 'super' keyword
        System.out.println("Hello User : From C");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C objC = new C();
        objC.display(); // Output: Hello Use
        System.out.println(objC.s);
    }
}

// Class Hierarchy:
// Animal: This class represents basic properties common to all animals, such as
// name, age, etc.
// Mammal: Inherits from Animal and adds properties specific to mammals, such as
// furColor, numberOfLegs, etc.
// Dog: Inherits from Mammal and adds properties specific to dogs, such as
// breed, isTrained, etc.


// Employee Hierarchy:
// Employee: This class represents basic properties common to all employees,
// such as name, employeeID, salary, etc.
// Manager: Inherits from Employee and adds properties specific to managers,
// such as department, numberOfReports, etc.
// Worker: Inherits from Manager and adds properties specific to workers, such
// as hourlyRate, hoursWorked, etc.

// Geometry Hierarchy:
// Shape: This class serves as the base class for geometric shapes and may
// include properties like color, filled, etc.
// Circle: Inherits from Shape and adds properties such as radius and methods to
// calculate its area and circumference.
// Rectangle: Inherits from Shape and adds properties such as length, width and
// methods to calculate its area and perimeter.
// Square: Inherits from Rectangle and has properties and methods specific to
// squares, such as methods to calculate its area and perimeter.
// Account Hierarchy:

// Account: This class represents basic properties common to all types of bank
// accounts, such as accountNumber, balance, etc.
// SavingsAccount: Inherits from Account and adds properties specific to savings
// accounts, such as interestRate, interestCalculation, etc.
// CheckingAccount: Inherits from Account and adds properties specific to
// checking accounts, such as overdraftLimit, transactionFees, etc.
// LoanAccount: Inherits from Account and adds properties specific to loan
// accounts, such as loanAmount, interestRate, loanTerm, etc.
// Vehicle Hierarchy:

// Vehicle: This class represents basic properties common to all vehicles, such
// as make, model, year, etc.
// Car: Inherits from Vehicle and adds properties specific to cars, such as
// numberOfDoors, transmissionType, etc.
// Motorcycle: Inherits from Vehicle and adds properties specific to
// motorcycles, such as engineDisplacement, topSpeed, etc.
// ElectricCar: Inherits from Car and adds properties specific to electric cars,
// such as batteryCapacity, chargingTime, etc.
// GasolineCar: Inherits from Car and adds properties specific to gasoline cars,
// such as fuelCapacity, fuelEfficiency, etc.
