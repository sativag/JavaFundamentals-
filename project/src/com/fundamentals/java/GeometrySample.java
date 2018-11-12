package com.fundamentals.java;

/*
 * Since this class is abstract, it does not have to implement the abstract methods
 * of its parent. However, any subclass of this class must implement those abstract
 * methods, unless, this class defines them itself.
 * Any abstract methods of this class, must be defined(implemented) in its subclasses.
 * */
public abstract class GeometrySample extends Shape {
	
	// Overrides the method from the parent class of Shape
	public String draw() {
		return "Geometry Draws";
	}
	
	// Abstract method must be defined (implemented) in the child class (subclass)
	abstract void geometryMethod();

}
