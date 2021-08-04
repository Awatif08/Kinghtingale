package LabExercises;

public class CastingExercise {
public static void main(String[] args) {
	byte b=10;
	
	int i=b; //Automatic type promotion.
	
	byte c=i; //Lower datatype cannot be put into higher.
	
	byte d=(byte)i; //Type casting enables us to atore compatible types.
	
	byte x=10,
	byte y=20;
	
	byte sum=x*y; // Error is thrown because when two bytes are used in an 
	 //arithmetic operation, the result will be integer
}
}
