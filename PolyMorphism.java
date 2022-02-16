package com.prajwalSharma.firstJavaProject;
abstract class Vechile{  
   abstract void transport();  
	}
//Inheritance
class Car extends Vechile {  
	void transport(){System.out.println("Car is Mostly Used For Long Distances...");}  
}  
class Bike extends Vechile{  
	void drive(){System.out.println("Bike is Mostly Used For Adventures Trips...");}
@Override
void transport() {
	// TODO Auto-generated method stub	
	} 
	}  
//multiple inheritance and polymorphism too
class Bicycle extends Car{
void transport(){System.out.println("Cycling Makes Man Fit...");}
	}
public class PolyMorphism {
public static void main(String args[]){ 
	Car ducatti =new Car();
	Bike duke=new Bike();  
	duke.drive();  
	duke.transport();  
	Bicycle hero=new Bicycle();
	hero.transport();
	ducatti.transport();
	}}

