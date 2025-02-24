package app4;

public class AgeNegativeException extends ArithmeticException {
	AgeNegativeException(){
		
	}
	
	AgeNegativeException(String s1){
		super(s1);
	}
}