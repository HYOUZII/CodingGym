import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int first = 0;
        int second = 0;
        for (int i=0 ; i<3 ;i++) {
            int num = input.nextInt();
            if (num > first) {
                second = first;
                first = num;
            }
            else if(num > second){
                second = num;
            }
        }
        
        input.close();

        System.out.print(second);

    }
}
