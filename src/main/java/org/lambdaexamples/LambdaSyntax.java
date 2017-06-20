
package org.lambdaexamples;

public class LambdaSyntax {
	
	// Example of full lambda syntax
	LambdaTarget lambda = (Object o) -> {
		String prefix = "pre";
		return prefix + o.toString();
	};
	
	public static interface LambdaTarget {
		String stringify(Object obj);
	}
}
