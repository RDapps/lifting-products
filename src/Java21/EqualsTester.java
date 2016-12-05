class EqualsTester{
    public static void main(String[] arguments) {
        
        String str1, str2;
        str1 = "Free the bound perodicals.";
        str2 = str1;
        
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same Object? " + (str1 == str2));
        
        str2 = new String(str1);
        
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("Same object? " + (str1 == str2));
        System.out.println("Same Value? " + str1.equals(str2));
        
System.out.println(str1 = str2);
        
    }    
}