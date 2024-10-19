import java.util.*;

class Main{
    public static int largenum(int X, int Y){
        int  Large;
        Large = X > Y ? X : Y;
        return Large;
    }
    public static int smallnum(int X, int Y){
        int  Small;
        Small = X < Y ? X : Y;
        return Small;
    }

    public static boolean sameNum(int X, int Y){
        // boolean  Same;
        // Same = X == Y ? true : false;
        return X==Y;
    }
    public static void main(String[] args){
        int A, B;
        Scanner input = new Scanner(System.in);
            A = input.nextInt();
            B = input.nextInt();
        input.close();

        System.out.println(largenum(A,B));
        System.out.println(smallnum(A,B));
        System.out.println(sameNum(A,B));
    }
}
