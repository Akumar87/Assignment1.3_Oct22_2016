import java.util.Scanner;

/* Program that swaps the values of two variables without using third variable.*/
/*Start of Program*/
/*Class declaration*/
public class SwapNoThirdVariable {
	/*  Defining the main method. First line of the execution of the code */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first value to be swapped with second value of the variable");
		int i = scan.nextInt();
		System.out.println("Enter the second value to be swapped with first value of the variable");
		int j = scan.nextInt();
		i = i + j; //Gives output as i =50; j = 30
		j = i-j; //Gives output as i = 50 ; j = 20, now the value of j has swapped to the original value of i
		i = i-j;//Gives output as i = 50-20 = 30 and value of j is swapped to i and j = 20
		System.out.println("After Swap, first value is " + i);
		System.out.println("After swap, second value is " + j);*/
		Scanner scan = new Scanner(System.in); //Creating scan reference object of class Scanner to provide input at run time.
		System.out.println("Enter the first value of the variable before swapping");//Input Message through console
		String i = scan.next();
		System.out.println("Enter the second value of the variable before swapping");//Input Message through console
		String j = scan.next();
		i = i + j; //Here the plus operator acts as concatenation operator and concatenates the the variables i and j. let us suppose i =10 and j =20
		j = i.substring(0, (i.length() - j.length()));//Here substring does, j = i.substring(0, (length('10') - length('20'))) = i.substring(0,0) = 10
		i = i.substring(j.length());
		System.out.println("After swap, the swapped first value is " + i);
		System.out.println("After swap, the swapped second value is " + j);
	}

}
//End of Program
