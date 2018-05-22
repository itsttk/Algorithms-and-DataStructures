import java.util.Arrays;
import java.util.Collections;


public class A767{


    public String reorganizeString(String s) {

        int[]a = new int[26];
        int l =s.length();

        char[] result = new char[s.length()];

        
        for(int i=0;i<l;i++){
            a[s.charAt(i)-97]+=1;

        }


        int max = a[0];
        int max_coef = 0;

        for(int i=1;i<26;i++){

            if(a[i]>max){
                max = a[i];
                max_coef = i;
            }

        }

      











        if(max>(l+1)/2){return "";}

        

        System.out.println(max+" "+max_coef);









        if(max==(l+1)/2){
        
          int j=0;


                int k=0;  

                while(k<max){

                    if(j>l-1){j=1;}


                    result[j] = (char)(max_coef+97); 

                    System.out.println(j+" "+result[j]);

                    
                    j +=2 ;
                    k++;

                }

                a[max_coef]=0;



          for(int i=0;i<26;i++){

            if(a[i]!=0){


                 k=0;  

                while(k<a[i]){

                    if(j>l-1){j=1;}


                    result[j] = (char)(i+97); 

                    System.out.println(j+" "+result[j]);

                    
                    j +=2 ;
                    k++;

                }

            }



              

        }

        }


       











        else{

            int j=0;

          for(int i=0;i<26;i++){




            if(a[i]!=0){



                int k=0;

                while(k<a[i]){

                    if(j>l-1){j=1;}


                    result[j] = (char)(i+97); 

                    System.out.println(j+" "+result[j]);

                    
                    j +=2 ;
                    k++;

                }

            }



              

        }


    }


     String out = new String(result);


     return out;

           

}
        
    



    public static void main(String[] args){

    //  System.out.println("hi");



        String num1 = "aab";//aaab

        A767 object = new A767();


        String a = object.reorganizeString(num1);

        System.out.println(a);
    
    }


}