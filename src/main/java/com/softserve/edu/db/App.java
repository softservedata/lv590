package com.softserve.edu.db;

import com.softserve.edu.db.Outer.Inner;

class Outer {
	public Outer(String message) {
		System.out.println(message);
	}

	 static class Inner {
		public Inner(String message) {
			System.out.println(message);
		}
	}
}

public class App {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner("text");
		// Outer outer = new Outer("text");
		//Outer.Inner inner = outer.new Inner("text");
	}

}
