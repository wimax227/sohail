package com.sohail.tutorial.classesexample;

public class ClassesExample {

		
		

	public static void main(String[] args) {
		Mouse logitechMouse = new Mouse();
		logitechMouse.color="Black";
		logitechMouse.length=5;
		logitechMouse.company="Logitech";
		logitechMouse.model="LGZ";
		System.out.println(logitechMouse.color);
		System.out.println(logitechMouse.length);
		System.out.println(logitechMouse.company);
		System.out.println(logitechMouse.model);
		
		System.out.println("==========================");
		logitechMouse.printOut();
		
/*		Mouse appleMouse = new Mouse();
		appleMouse.color="White";
		appleMouse.length=4;
		appleMouse.company="Apple";
		appleMouse.model="S5";
		System.out.println(appleMouse.color);
		System.out.println(appleMouse.length);
		System.out.println(appleMouse.company);
		System.out.println(appleMouse.model);
*/		
		/*Mouse appleMouse2 = appleMouse;
		appleMouse2.color="RED";
		System.out.println(appleMouse2.color);
		System.out.println(appleMouse.color);
		System.out.println(appleMouse2.length);
		System.out.println(appleMouse2.company);
		System.out.println(appleMouse2.model);
		*/
			
	}

}
