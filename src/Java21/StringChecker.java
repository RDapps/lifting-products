class StringChecker {
    
    public static void main(String[] arguments) {

        int accountBalance = 5005;
        System.out.format("Balance: £%,d%n", accountBalance);
        
        String str = " Would you like an apple pie with that?";
        
        System.out.println("Thr String is: " + str);
        System.out.println("The String length is: " + str.length());
        System.out.println("The character at position 6 is: " + str.charAt(6));
        System.out.println("The Substring from 26 to 32: " + str.substring(26,32));
        System.out.println("The index of the first 'a':" + str.indexOf('a'));
        System.out.println("The index of the beginning of the " + "substring \"apple\": " + str.indexOf("apple"));
        System.out.println("The String in Uppercase: " + str.toUpperCase());

        int firstPrice = 225;
        int secondPrice = 217;
        int higherPrice = Math.max(firstPrice, secondPrice);
        System.out.println(higherPrice);
        
        
    }
    
}