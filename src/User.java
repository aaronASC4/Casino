//public class User implements Player {
//
//    private final String user;
//
//    private Deck[] userHand = new Deck[0];
//
//    /**
//     * User constructor will add the string user inputed as its nickname in 
//     * this game. It will then draw and display the initial hand of two cards.
//     * 
//     * @param name 
//     */
//    User(String name){
//        user = name;
//
//        userHand = Arrays.copyOf(userHand, userHand.length + 2);
//        userHand[0] = new Deck();
//        userHand[1] = new Deck();
//
//        System.out.println("You get a " + userHand[0].getValue() + " and a " + userHand[1].getValue() + ".");
//        int total = getTotal();
//        System.out.println("Your total is: " + total + "\n");
//    }
//
//    /**
//     * Message upon User's turn.
//     */
//    @Override
//    public void gameStartup(){
//        System.out.println("Your turn!");
//    }
//
//    /**
//     * Retrieves the total of the User's hand.
//     * @return 
//     */
//    @Override
//    public int getTotal(){
//        int totalValue = 0;
//
//        for (Card c : userHand) {
//            int cardValue = c.getValue();
//            totalValue = totalValue + cardValue;
//        }
//
//        return totalValue;
//    }
//
//    /**
//     * Generates a card and adds it to the hand.
//     */
//    @Override
//    public void drawCard() {
//        userHand = Arrays.copyOf(userHand, userHand.length + 1);
//        userHand[userHand.length - 1] = new Card();
//
//        int lastCard = userHand.length - 1;
//        System.out.println("You drew a " + userHand[lastCard].getValue());
//    }
//
//    /**
//     * Asks player if (s)he wants to hit or stay, returns a boolean for if the
//     * player chose stay or not.
//     * 
//     * @return 
//     */
//    @Override
//    public boolean wantToStay() {
//        Boolean stay = null;
//
//        while(stay == null){
//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("Would you like to \"hit\" or \"stay\"? ");
//            String input = sc.nextLine();
//
//            String hitOrStay = input.toLowerCase();
//
//            switch(hitOrStay){
//                case "hit":
//                    stay = false;
//                    break;
//                case "stay":
//                    stay = true;
//                    break;
//                default:
//                    System.out.println("That is not a valid option.");
//                    break;
//            }
//        }
//        return stay;
//    }
//
//    /**
//     * Prints the user's nickname.
//     * 
//     * @return 
//     */
//    @Override
//    public String toString(){
//        return user;
//    }
//}