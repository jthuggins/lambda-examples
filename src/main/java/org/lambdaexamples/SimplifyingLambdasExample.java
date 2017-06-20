
package org.lambdaexamples;

public class SimplifyingLambdasExample {

	// Example of full lambda syntax
	LambdaTarget lambda = (Object o) -> {
		String prefix = "pre";
		return prefix + o.toString();
	};

	// Example of more concise syntax
	//LambdaTarget lambda2 = o -> "pre" + o;
	
	// Example of using a method instead of multi-line
	//LambdaTarget lambda3 = o -> addPrefix(o);
	
	// Example of using a method reference
	//LambdaTarget lambda4 = this::addPrefix;

	public static interface LambdaTarget {
		String stringify(Object obj);
	}
	
//	private String addPrefix(Object object) {
//		String prefix = "pre";
//		return prefix + object.toString();
//	}
}
