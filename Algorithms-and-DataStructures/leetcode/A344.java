public class A344
{
   public String reverseString(String s) {
        
        StringBuffer result= new StringBuffer();
        
        for(int i=s.length();i>0;i--){
            
            result = result.append(s.charAt(i-1));
            
        }
        
        
        return result.toString();
        
    }

	


	public static void main(String[] args){




		String num1 = "19";

		A344 object = new A344();



		String a = object.reverseString( num1);


        


		System.out.println(a);
	
	}


}