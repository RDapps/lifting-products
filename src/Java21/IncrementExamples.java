package Java21;

public class IncrementExamples {
    public static void main(String[] arguments) {
        int x = 1;
        int y,z,a,b;
        boolean q;
        y = x++;
        
        System.out.println(y + "A");
        q = y <= 3;
        System.out.println(q);
                
        z = ++x;
        System.out.println(z + "B");
        q = z <= 3;
        System.out.println(q);
        
        a = ++x;
        System.out.println(a + "C");
        q = a <= 3;
        System.out.println(q);
        
        b = ++x;
        System.out.println(b + "D");
        q = !(b <= 3);
        System.out.println(q);
        
    }
}