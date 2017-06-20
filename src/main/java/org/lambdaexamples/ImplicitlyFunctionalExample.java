
package org.lambdaexamples;

public class ImplicitlyFunctionalExample {

	public static interface LambdaTarget {
		String stringify(Object obj);
		
		// Uncomment to see compiler error.
		//String stringify(Object obj1, Object obj2);
	}
	
	LambdaTarget lambda = (Object o) -> { return o.toString(); };
}
