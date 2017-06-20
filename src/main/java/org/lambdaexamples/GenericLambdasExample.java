
package org.lambdaexamples;

public class GenericLambdasExample {

	public static interface IntToString {
		String stringify(int i);
	}
	
	public static interface DoubleToString {
		String stringify(double d);
	}
	
//	public static interface ToString<T> {
//		String stringify(T t);
//	}
}
