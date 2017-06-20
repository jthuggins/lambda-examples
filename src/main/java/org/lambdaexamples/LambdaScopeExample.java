
package org.lambdaexamples;

import java.util.function.Consumer;

public class LambdaScopeExample {

	private int x = 10;
	
	public void publicMethod(int x) {

		Consumer<Integer> lambda = y -> System.out.println(x + y);
		
//		Consumer<Integer> lambda = y -> {
//			int x = 50;
//			System.out.println(x + y);
//		};
		
		lambda.accept(20);
	}
	
	public static void main(String[] args) {
		new LambdaScopeExample().publicMethod(6);
	}
}
