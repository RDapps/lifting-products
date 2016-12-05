package Tutorials;
class iscomingOverTheBridge{
 
    public static void main(String[] args){
    // get input from user in a String variable called command
String command = "go eastx";

switch(command){

  case "go east":
    System.out.println("Player: Moves to the east" );
    break;

  case "go west":
    System.out.println("Player: Moves to the West" );
    break;

  case "go north":
    System.out.println("Player: Moves to the North" );
    break;

  case "go south":
    System.out.println("Player: Moves to the South" );
    break;
  
  case "take sword":
    System.out.println("Player: Takes the silver sword" );
    break;

  // more possible cases

  default:
    System.out.println("Message: Sorry I don't speak Elfish" );
    break;

}    }
}
