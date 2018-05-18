import java.util.*;

public class LeftRecursion{
	public static void main(String args[]){
		new LeftRecursion();
	}

	public LeftRecursion(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of productions");
		int N = scan.nextInt();
		System.out.println("e is epsilon");
		String prod = scan.nextLine();
		for(int i=0;i<N;i++){
		    prod = scan.nextLine();
		    //System.out.println(prod);
		    checkLeftRecursion(prod);
		}
	}
	
	private void checkLeftRecursion(String prod){
	    String comp[] = prod.split("->");
	    String left = comp[0];    
        String right = comp[1];
        //System.out.println(left);
        //System.out.println(right);
        if(left.equals(String.valueOf(right.charAt(0)))) {
            //System.out.println("This is left recursion");
            String sym[] = right.split("\\|");
            //System.out.println(Arrays.toString(sym));
            String alpha = sym[0].substring(1,sym[0].length());
            String beta = sym[1];
            System.out.println(left + "->" + beta + left + "'");
            System.out.println(left + "'->" + alpha + left + "'|e" );
        }
        else{
            System.out.println("This is not left recursion");
        }
	}
}
// output
// Enter number of productions
// 2
// e is epsilon
// E->E+T|T
// E->TE'
// E'->+TE'|e
// F->F+E|q
// F->qF'
// F'->+EF'|e
