import java.util.Scanner;

public class ToH{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        int n = scan.nextInt();


        System.out.println("The moves are: ");
        movedisks(n, 'A', 'B', 'C');

    }

    public static void movedisks (int n, char from, char to, char aux){
    	if(n==1)
    		System.out.println("Move disk " + n + " from " + from + " to " + to);
    	else{
    		movedisks(n-1, from, aux, to);
    		System.out.println("Move disk " + n + " from " + from + " to " + to);
    		movedisks(n-1, aux, to, from);
    	}
    }
}