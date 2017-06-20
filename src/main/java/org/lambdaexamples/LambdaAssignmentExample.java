
package org.lambdaexamples;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaAssignmentExample {
	
	Predicate<String> filter = (String s) -> { return s.startsWith("A"); };
	
	//Use the filter here
	public void filterStream(Stream<String> stream) {
		stream.filter(filter);
		
		//This is more readable
		//stream.filter((String s) -> { return s.startsWith("A"); });
	}
}
