package com.techcrack.enumContent;



public class StringEnum {

    private enum Direction {
        NORTH("Its A North Pole."), 
        SOUTH("Its a South Pole."), 
        WEST("Its a west pole."),
        EAST("Its a east pole.");

        private Direction(String discription) {
            this.discription = discription;
        }

        private final String discription; 

        public String giveDiscriptionForThisPole() {
            return discription;
        }

        public static void aboutYou() {
            System.out.println("I Am Direction Class, I am Here To direct You in all the direction !!!!");
        }
        
    }

    // public static void main(String[] args) {
    //     String day = "Tuesday";

    //     switch(day) {
    //         case "Monday" -> System.out.println("Its A Monday");
    //         case "Tuesday" -> System.out.println("Its A Tuesday");
    //         case "Wednesday" -> System.out.println("Its A Wednesday");
    //         case "Thursday" -> System.out.println("Its A Thursday");
    //         case "Friday" -> System.out.println("Its A Friday");
    //         case "Saturday" -> System.out.println("Its a Saturday");
    //         default -> System.out.println("Its A Week End");
    //     }
    // }


    public static  void main(String[] args) {
        Direction direction = Direction.EAST;

        Direction.aboutYou();
    


       String discription =  switch (direction) {
            case NORTH -> Direction.EAST.giveDiscriptionForThisPole();
            case SOUTH -> Direction.SOUTH.giveDiscriptionForThisPole();
            case EAST -> Direction.EAST.giveDiscriptionForThisPole();
            default -> Direction.WEST.giveDiscriptionForThisPole();
        };

        System.out.println(discription);
    }
    
}
