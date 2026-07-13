import java.util.*;
public class ProblemsSet {
	public ProblemsSet() {
		
	}
	public static void main (String [] args){
		 Scanner scanner = new Scanner(System.in);
		 ProblemsSet set = new ProblemsSet(); //object created since all methods are instance methods
		 System.out.print("Enter a number");
		 //input values 
//   	 int num = scanner.nextInt();
//		 int num1 = scanner.nextInt(); 
//		 int num2 = scanner.nextInt();
//		 int num3 = scanner.nextInt();
//		 String s = scanner.nextLine();
//		 double num = scanner.nextDouble();
//		 
//		 System.out.println("How many numbers? ");
//		 int size = scanner.nextInt();
//		 int[] arr = new int[size];
//		 for (int i = 0; i < size; i++) {
//			 System.out.println("Enter number " + (i + 1) + ": ");
//			 arr[i] = scanner.nextInt();
//		 }

		 
//		 boolean isEven = set.isEven(num); //1
//		 System.out.print(isEven);
		 
//		 int result =set.maximumofThree(num1,num2,num3); //2
//		 System.out.print(result);
		 
//		 int result = set.factorial(num); //3
//		 System.out.print(result);
		 
//		 boolean result = set.isPrime(num); //4
//		 System.out.print(result);
		 
//		 int[] result =set.nthFib(num); //5
//		 for(int i = 0; i<result.length; i++){
//			 System.out.print(result[i] + " ");
//		 }
		 
//		 int result = set.sumofDigits(num); //6
//		 System.out.print(result);	 
		 
//		 int result = set.reverse(num); //7
//		 System.out.print(result);
		  
//		 boolean result = set.isPalindrome(num); //8
//		 System.out.print(result);
		 
//    	 int result = set.GCD(num1, num2); //9
//		 System.out.print(result);
    	 
//		 boolean result = set.isLeapYear(num); //10
//		 System.out.print(result);
		 
//		 int[] result =set.multiplicationTable(num); //11
//		 for(int i = 0; i<result.length; i++){
//			 System.out.print(result[i] + " ");
//		 }
		 
//		 set.sumAndAverage(arr); //12
		 
//		 set.minAndMax(arr); //13
		 
//		 set.linearSearch(arr, num); //14
		 
//		 int[] result = set.bubbleSort(arr); //15
//		 for(int i = 0; i<result.length; i++){
//			 System.out.print(result[i] + " ");
//		 }
		 
//		 set.vowelsAndConsonants(s); //16
		 
//		 boolean result = set.isPalindromeString(s); //17
//		 System.out.print(result);

//		 double result = set.celciustoF(num); //18
//		 System.out.print(result);
//		 
		 
//		 double result = set.simpleInterest(num1,num2,num3); //19
//		 System.out.print(result);
		 
//		 boolean result = set.armStrong(num); //20
//		 System.out.print(result);
    	 
//    	 int[] result =set.primeArray(num1,num2); //21
//		 for(int i = 0; i<result.length; i++){
//			 System.out.print(result[i] + " ");
//		 }
		 
//		 int result = set.power(num1,num2); //22
//		 System.out.print(result);		 

//		 set.binarySearch(arr, num); //23  
		 
//		 set.countEvenOdd(num); //24
		
//		 char c = set.gradeMark(num); //25
//		 System.out.print(c);
		 
		 
		 
		 scanner.close();	
	}
	//tests to check is a number is true or false
	public boolean isEven (int no1){
		if(no1%2 == 0){
			return true;
		}
		return false;
	}
	
	//takes three numbers and returns which is the largest
	public int maximumofThree (int n1, int n2, int n3){
		//compares the numbers based on subtraction of the numbers together
		if(((n1-n2) > 0)&&(n1-n3 > 0)){
			return n1;
		}else if((n1 - n3 > 0)&& (n1-n2<0)){
			return n2;
		}else if((n1-n2<0) && (n1-n3<0)){
			if(n2-n3 >0){
				return n2;
			}else{
				return n3;
			}
		}
		return n3;
	}
	
	//gets the factorial for a number that is positive 
	public int factorial (int num){
		if(num < 1){
			return -1; // -1 is returned if the number entered is negative
		}
		int fact = 1;
		int size = num;
		for(int i = 0; i<size; i++){
			fact = fact * num;
			System.out.println(num);
			num = num - 1;
		}
		return fact;
	}
	
	
	//checks if number is a Prime or not
	public boolean isPrime (int num){ 
		int n1 = 2;
		boolean result = false;
		if(num <= 1){ //if number is less than  or equal to one
			return false;
		}
		if (num == 2 || num == 3 ){ // 2 and 3 will always be prime numbers
			return true; 
		}
		while(n1<num){ //the number to be divided by the number entered by the user has to be less
			if(num%n1 == 0){
				result = false; //if number is divisible by anything other than itself then its not a prime
				break;
			}else{
				result = true;
			}
			n1++; //increases the divider number to make sure that num is a prime number
		}
		return result;
	}

    //calculates fibonacci series and gives a list till a specified term	
	public int [] nthFib (int num){
		int[] arr = new int [num]; // to store result in an array 
		int start = 0; //used to keep track of which term i am in 
		for (int i = 0; i<arr.length; i++){
			if(start <= num){ //to ensure not getting an extra fib number
				arr[i] = fib(start) ;
				start = start + 1;
			}
		}
		return arr;
	}
	
	//helper method for nthFib
	public int fib (int num){
		if (num == 0){ //this is a standard form for fib at 0
			return 0;
		}
		if (num == 1){ //this is a standard form for fib at 1
			return 1;
		}else{
			 return fib(num-1)+ fib(num - 2); //calculation of a fibonacci term
		}
	}
	
	
	//Calculates the sum of digits in a number
	public int sumofDigits (int num){
		int sum = 0;
		String s = ""; 
		String s1 = "";
		s = s + num; //changes number to string 
		for (int i = 0 ; i<s.length(); i++){
			s1 = String.valueOf(s.charAt(i)); // extracts a character from the string 
			sum = sum + Integer.parseInt(s1); //changes string to integer to be used for mathematical calculations
		}
		return sum;
	}
	
	//reverses a number
	public int reverse (int num){
		String s = "";
		int revnum = 0;
		s = s + num; //changes number to string 
		int size = s.length(); //saves size of the number to be able to extract each number 
		String s1 = "";
		for (int i = 0 ; i< s.length() ; i++){
			s1 = String.valueOf(s.charAt(size-(i+1)));  // extracts a character from the string 
			revnum = revnum * 10; // ensures that number will be next to it not added to the existing value in revnum
			revnum = revnum + Integer.parseInt(s1); //changes string to integer to be used for mathematical calculations
		}
		return revnum;
	}
	
	//checks if a number in its reverse is the same or not 
	public boolean isPalindrome (int num){
		int num1 = reverse(num); //uses reverse method to reverse given number
		if (num == num1){ //checks if the reverse if equal to the original or not 
			return true;
		}else{
			return false;
		}	
	}
	
	////gets the greatest common divisor using Euclidean Algorithm 
	 public int GCD (int num1, int num2){
		 if(num2 == 0){ // if the second number is zero then u have found GCD
			 return num1;
		 }else{
			return GCD(num2, num1 % num2); //if not then numbers get swapped and divide the numbers to get the new remainder and recall the method 
		 }
	 }

	 
	//checks if a year is a leap year  
	public boolean isLeapYear (int year){
		if (year >= 1000){
			if (year % 4 == 0){
				return true;
			}else{
				return false;
			}
		}else{
			if (year % 400 == 0){  //if a year is a century year 
				return true;
			}
			return false;
		}
	}
	
	//returns a list of the multiplication table of a number from 1-10
	public int[] multiplicationTable (int num){
		int[] arr = new int[10]; // to store the result in an array 
		for (int i = 0; i<arr.length; i++){
			arr[i] = num*(i+1); // i+1 to start at 1 not 0 and number is added to the correct index in the array  //an array from size 10 has indices from 0-9
		}
		return arr;
	}
	
	
	//returns the sum and average of the values in an array
	public void sumAndAverage (int[] arr){
		double sum = 0;
		double average = 0;
		for (int i = 0; i < arr.length; i++){ //loops through all the array 
			sum = sum + arr[i]; 
		}
		average = sum / arr.length; 
		System.out.print("The sum of the Array is " + sum + " The Average of the Array is " + average);
		}
	
	
	//returns the maximum and minimum in an array 
	public void minAndMax (int[] arr){
		int max = arr[0];//initialised with the first number in the array 
		int min = arr[0];//initialised with the first number in the array 
		for (int i = 1; i<arr.length; i++){ //starts with 1 to not compare max and min with themseleves 
			if (arr[i] > max){
				max = arr[i];
			}
			if (arr[i] < min){
				min  = arr[i];
			}
		}
		System.out.print("The maximum Value is " + max + " The mininum value is " + min);
	}
	
	
	
	//given an array and a number to search and check if number exists in the array or not 
	public void linearSearch (int[] arr, int key){
		boolean flag = false; //to tell the program whether the key was found or not after looping through the entire array 
		for (int i = 0; i<arr.length; i++){
			if(arr[i] == key){
				System.out.print("The key was found in position " + i); //returns the position of the key if found
				flag = true; //key was found
			}
		}
	    if (flag == false){ //key was not found so output it wasnt found.
	    	System.out.print("The key was not found in the array");
	    }
	}
	
	//sorts an array in ascending order (smallest to largest) 
	public int[] bubbleSort (int [] arr){
		int size = 0; //to ensure the array was sorted correctly because one loop is not enough
		if (arr.length%2 == 0){
			size = arr.length/2;
		}else{
			size = arr.length/2 +1;
		}
		for (int j = 0; j<size +1; j++){ // to redo storing after every loop 
			for(int i = 0; i<arr.length-1; i++){ // arr.length-1 because there is nothing to compare the last number with 
				if (arr[i] > arr[i+1]){ //checks two numbers to ensure which is greatest 
					int temp = arr[i]; //stores number in a temp value to be able to swap 
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		return arr; //return correctly sorted array 
	}

	//returns the number of vowels and consonants in a word
	public void vowelsAndConsonants (String s){
		int vowels = 0;
		int consonants = 0;
		String s1 = "aeiouAEIOU"; // to ensure vowel is entered whether written in uppercase or lowercase
		String s2 = "";
		for (int i = 0; i<s.length(); i++){
			s2 = String.valueOf(s.charAt(i)); //extracts a character from the string
			if(s1.contains(s2)){ //checks is the character exists in the string of vowels or not 
				vowels++;
			}else{
				consonants++;
			}
		}
		System.out.print("The number of vowels is " + vowels + " The number of consonants is " + consonants);
	}
	
	//checks if a word was reversed would it be the same or not 
	public boolean isPalindromeString (String s){
		String s1 = "";
		int size = s.length(); //saves size of the number to be able to extract each number
		for (int i = 0 ; i< s.length(); i++){
			s1 = s1 + s.charAt(size -(i+1)); //extracts each character from back to front  
		}
		if (s.equals(s1)){ //checks if both strings are equal or not 
			return true;
		}
		return false;
	}
	
	//coverts a temperature in Celsius to Fahrenheit
	public double celciustoF (double num){
		return ((num*(9.0/5.0))+32); //conversion equation
	}
	
	//calculates the interest 
	public double simpleInterest (double amount, double interest, double year){
		return (amount * interest * year) / 100;
	}
	
	//checks if a three digit number has each of its digits cubed and added will be the same number as the original or not 
	public boolean armStrong (int num){
		String s ="";
		s = s + num;//changes number to string 
		int sum = 0;
		int s1 = 0;
		if (num <1000 && num >99){ //ensures its a three digit number (100-999)
			for (int i = 0 ; i< s.length(); i++){
				s1 = Integer.parseInt(String.valueOf((s.charAt(i)))); //extracts the first character and turn into an integer
				sum = sum + power(s1,3);//cubes the number
			}
		}else{
			System.out.print("Number entered is not three digits"); // to ensure number entered is three digits 
		}
		if(sum == num){ //compared the sum of the three digits with the original number
			return true;
		}else{
			return false;
		}
	}
	
	//gives all the prime numbers between two number inclusively
	public int[] primeArray (int first, int last){
		int size = (last - first) + 1; //size of the array 
		int count = 0; //counts how many prime number are there between the two numbers inclusively 
		int[] arr = new int [size];
		for (int i = 0 ; i<size; i++){
			if(isPrime(first + i)){ //checks if number is prime or not //first + i to change number until the last value 
				arr[i] = first + i;
				count++;
			}
		}
		int [] newarr = new int[count]; //array to remove any unnecessary zeroes to ensure only prime numbers are returned
		int j = 0; //index of the new array 
		for (int i= 0; i<size; i++){ 
			if (arr[i] > 0){ //checks if the value in array is zero or not
				newarr[j] = arr[i]; //number is added to new array if not zero
				j++;//increases index of the new array 
			}
		}
		return newarr; //returns array with no zero values
	}
		
	//calculates the power of a number 
	public int power (int base, int expo){
		int result = 1; // so number mutlipled start by 1 because any number multiplied by zero is 0
		for(int i = 0; i<expo; i++){ // multiplies the number of times of the expo 
			result = result * base;
		}
		return result;
	}	
	
	//checks in a stored array if a key exists or not
	public void binarySearch (int[] arr, int key){
		int lower = 0;//lowest index
		int upper = arr.length - 1; //largest index
		while (lower <= upper){ //ensure that lower will never be higher than maximum index of the array 
			int middle = (upper+lower)/2; //calculates middle index to check if my key is on my left or right 
			if(arr[middle] == key){ //key is in the middle index
				System.out.println("Key is found at position " + middle); //returns index
				return; //exit the program 
			}else if (arr[middle] > key){ 
				upper = middle - 1;  // if value in the middle is more than key then decrease the upper to look on the left part of the array
			}else{
				lower = middle + 1; //if value in the middle is less than key then increase the lower to look on the right part of the array 
			}
		} 
		System.out.print("Key does not exist in the array"); //message is key doesnt exist in the array 
	}
	
	//count how many even and odd values exist in the number
	public void countEvenOdd (int num){
		String s = "";
		s = s + num; //changes number to string 
		int even = 0;
		int odd = 0;
		for (int i = 0 ; i <s.length(); i++){
			int s1 = Integer.parseInt(String.valueOf(s.charAt(i))); //extracts the first character and then chnage to integer to be used for calculation
			if (isEven(s1)){ //checks if number is even or not 
				even++;
			}else{
				odd++;
			}
		}
		System.out.print("The number has " + even + " even numbers and " + odd + " odd numbers");
	}
	
	//returns the grade based on a criteria 
	public char gradeMark (int mark){
		char grade;
		if (mark >= 90){
			grade = 'A';
		}else if (mark >=80){
			grade = 'B';
		}else if (mark >=70){
			grade = 'C';
		}else if (mark >=60){
			grade = 'D';
		}else{
			grade = 'F'; //if mark is than than 60
		}
		return grade;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
