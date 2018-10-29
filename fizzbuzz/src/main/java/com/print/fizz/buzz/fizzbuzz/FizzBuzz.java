package com.print.fizz.buzz.fizzbuzz;

public class FizzBuzz {
	
	int limit;
	
	public FizzBuzz(int limit) {
		this.limit = limit;
	}
	
	public void checkFizzBuzz() {
		for(int i = 1;i <= limit;i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("FizzBuzz");
			}else if (i%3 == 0 || String.valueOf(i).contains("3")){
				System.out.println("Fizz");
			}else if (i%5 == 0){
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
	}
}
