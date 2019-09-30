import java.util.*;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(solve(x, y));
    }
    public static int solve(int x, int y){
        if(x < 0)
            return (y < 0)? 3 : 2;
        return (y < 0)? 4 : 1;
    }
}