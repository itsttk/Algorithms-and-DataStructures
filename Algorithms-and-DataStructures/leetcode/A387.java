
import java.util.Arrays;
public class A387{


	public int firstUniqChar(String s) {

		int [] array = new int[26];

		for(int i=0;i<s.length();i++){

			array [s.charAt(i)-97] +=1;
		}


		for(int i=0;i<s.length();i++){
			if(array[s.charAt(i)-97]==1){
				return i;
			}

		}

		return -1;
        
    }


	public static void main(String[] args){

     A387 object = new A387();

     String s=  "loveleetcode";

     int out = object.firstUniqChar(s);
     System.out.println(out);



	}
}