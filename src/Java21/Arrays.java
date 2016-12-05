package Java21;

public class Arrays{
public static void main(String args[])
{
    String[] titles = {"Mr.", "Mrs.", "Miss.", "Ms.", "Dr."};
    System.out.println(titles[0]);
    System.out.println(titles.length);
    
    
    {
    int[][][] century = new int[100][52][7];
    System.out.println("Elements in the first dimension: " + century.length);
    System.out.println("Elements in the second dimension: " + century[0].length);
    System.out.println("Elements in the third dimension: " + century[0][0].length);
    }
    
    char grade = 'A';
    switch(grade) {
        case 'A':
                System.out.println("Well Done");
                break;
        case 'B':
            System.out.println("Great");
            break;
        case 'C':
            System.out.println("Try Harder Fucknut");
            break;
        default:
            System.out.println("You're a fucking bell end");
    }
/*    
int object1 = 2;
int object2 = 3;
char operation = '+';
switch(operation){
    case '+':
        add(object1,object2);
        break;
    case '-':
        subtract(object1, object2);
    case '*':
        multiply(object1,object2);
        break;
    case '/':
        divide(ibject1,object2);
        break;
}
*/

}
}
