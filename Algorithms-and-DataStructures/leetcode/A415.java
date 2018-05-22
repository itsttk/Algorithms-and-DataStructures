public class A415{


	public String addStrings(String num1, String num2){



		int a=num1.length();
		int b=num2.length();



        if(a==0){
        if(b==0){return "";}
        else return num2;
        }

        if(b==0){
        	return num1;
        }

        if(a>b){
        	return addHelper(num1,num2,a,b);
        }

        else{
        	return addHelper(num2,num1,b,a);
        }

	}


	public String addHelper(String num1, String num2,int a, int b){
        int temp=0;
        int carry=0;

        int temp1=0;

        String result ="";

        int i=a-1;
        int j=b-1;

        while(i>=0 ){

          // System.out.println(result+"         "+carry+" "+temp);



        	if(j>=0){




        		temp1=carry+Character.getNumericValue(num1.charAt(i))+Character.getNumericValue(num2.charAt(j));

        		carry = (  temp1)/10;
        		temp =temp1%10;

        		result =  temp+result;

        		j--;
        		i--;


        	}



        	else { 
           

        		temp1=carry+ Character.getNumericValue(num1.charAt(i));

                carry = ( temp1)/10;
        		temp =temp1%10;

        		result = temp+result;


           
                 i--;
    
          }


        }
   
      if(carry!=0){

      	result = carry+result;

      }


        return result;


	}



	public static void main(String[] args){

        System.out.println("hi");



		String num1 = "19";
		String num2 = "999";

		A415 object = new A415();



		String a = object.addStrings( num1,  num2);


        


		System.out.println(a);
	
	}


}