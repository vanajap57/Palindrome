
public class Palindrome {
	
	     public static void main(String []args){
	System.out.println(palindromedescendant(13001120));
	     }

	    public static boolean palindromedescendant(int num ){
	boolean isSym = false;

	while(num > 9){
	            if (isSymmetrical(num)){
	isSym = true;
	                break;
	            }
	            num = getSum(num);
	        }

	        return isSym;
	    }
    public static boolean isSymmetrical(int num) {
	        int reversed = 0, n = num;

	        if(n<0) n = n*-1;

	        while(n!=0)
	        {
	            reversed = reversed *10;
	            reversed = reversed  + n%10;

	            n /= 10;
	        }
	        return reversed == num;
	    }


	    public static int getSum(int num) {
	        String numstr = Integer.toString(num);
	        StringBuilder sb = new StringBuilder();

	for( int i =0; i<numstr.length()-1; i+=2){
	            int i1 = Integer.parseInt(Character.toString(numstr.charAt(i)));
	            int i2 = Integer.parseInt(Character.toString(numstr.charAt(i+1)));
	            int num1  = i1+i2;
	sb.append(Integer.toString(num1));
	        }

	        return Integer.parseInt(sb.toString());
	    }
	}


