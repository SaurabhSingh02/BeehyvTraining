/*Write an application that asks the user to enter two integers,
obtains them from the user and displays the larger number followed
by the words "is larger" . If the numbers are equal, print the
message "These numbers are equal" .
 */


import java.util.Scanner;
public class Que1 {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter First Integer");
	int a = input.nextInt();

	System.out.println("Enter Second Integer");
	int b = input.nextInt();

	if(a>b) System.out.println(a+ " is larger");
	if(b>a) System.out.println(b+ " is larger");
	if(a==b) System.out.println("These numbers are equal");

    }
}
