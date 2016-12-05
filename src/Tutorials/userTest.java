package tutorials;
class userTest {
    
    public static void main(String[] args)
    {
       Person p = new Person("Rich", "Drury");
       
    }
    
}

class Person
{
    String firstName;
    String lastName;
    boolean tester;
    
    Person(String f, String l) {    
    firstName = f;
        lastName = l;

            System.out.println(firstName);
            System.out.println(lastName);
            System.out.println(tester);
            
    }
        
}