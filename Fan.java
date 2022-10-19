public class Fan {
    
    //Intialize the variables
    public static int speedCordCounter = 0;
    public static String direction = new String("clockwise");
    public static String speed = new String("Slow");
    
    //Method: Functionality when speed cord is pulled
    public void pullSpeedCord() {
        speedCordCounter++; //increment the counter
        switch (speedCordCounter){ //adjust the speed
            case 2:
            speed = "Medium";
            break;
            case 3:
            speed = "Fast";
            break;
            case 4: //Reset all settings
            speedCordCounter = 0;
            speed = "Slow";
            break;
        }
        status(); //display the status
    }
    
     //Method: Functionality when direction cord is pulled
     public void pullDirectionCord() {
        direction = (direction.equals("clockwise")) ? "anti-clockwise" : "clockwise"; //switch the direction
        status(); //displa status
    }
    
    //Method: To display the status of the Fan
    public static void status(){
        if (speedCordCounter < 4 && speedCordCounter != 0)
        {
            System.out.println("\nFan is running at " + speed + " Speed in " + direction + " direction\n");
        }
        else
        {
            System.out.println("\nFan is off right now, direction is set to " + direction +".\n");
        }
    }
    
     
}