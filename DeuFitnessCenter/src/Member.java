/*
   Write an object-oriented program that allows users to manage the members of DEU Fitness Center.

The program should store all members’ information (i.e.  name, surname, height, weight, etc.).

Create a Member class with:
	Several attributes: name, surname, heigth, weight etc.
	One constructor method which receives all parameters
	Get / Set methods
	Display method
	BMI method                    (calculates Body Mass Index of the member)
	WeightStatus method      (returns the weight status of the member by calling BMI method)
Body Mass Index	Weight Status
Smaller 18.5	Thin
18.5 – 24.9	Normal
25 – 29.9	Fat
30 and up	Obese


Create a SportCenter class with:
	Several attributes: name of the sport center, Member[] members, count, etc.
	One constructor
	addMember(Member m) method
	search(String name, String surname) method
	printAllMembers() method



Write a main method that
	add yourself as a member
	add your two friends as members
	call printAllMembers() method
	call weightStatus() method for you to learn your status
	call search() method to learn the weight and height information of a member

    */
public class Member {
    private String name;
    private String surname;
    private double height; // in meters
    private double weight; // in kilograms

    public Member(String name, String surname, double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void display() {
        System.out.println("Name: " + name + ", Surname: " + surname + ", Height: " + height + " m, Weight: " + weight + " kg");
    }

    public double calculateBMI() {
        return weight / (height * height); // height is in meters
    }

    public String getWeightStatus() {
        double bmi = calculateBMI();
        if (bmi < 18.5) return "Thin";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Fat";
        else return "Obese";
    }
}
