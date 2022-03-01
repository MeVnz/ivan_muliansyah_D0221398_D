
package Java_Static_Initializer_Block;

import java.util.*;

public class day10_Java_Static_Initializer_Block {
static Scanner sc = new Scanner(System.in);
static int B = sc.nextInt();
static int H = sc.nextInt();
static Boolean flag = true;

static{
    try{
        if(B<=0 || H<=0){
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
    }catch(Exception vn){
        System.out.println(vn);
    }
}
    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
	}
		
    }

}
    

