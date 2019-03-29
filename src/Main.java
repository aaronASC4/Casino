//public class Main {
//
//    // Contains the players for comparing who won.
//    private final Player[] players = new Player[2];
//
//    public static void main(String[] args){
//
//        BlackJackGame game = new BlackJackGame();
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println(" ___________________________________________\n" + 
//                           "|                                           |\n" + 
//                           "|  Welcome to the Gemtastic BlackJack Game! |\n" +
//                           "|___________________________________________|\n");
//
//
//        System.out.println("What is your name?");
//        String userName = sc.nextLine();
//
//        System.out.println("Hello " + userName + "! Let's play!\n");
//
//        // Gets an input fromt he user which will represent the user in the game.
//
//        // Create the players and add them to array.
//        Player user = new User(userName);
//        game.players[0] = user;
//        Player dealer = new Dealer();
//        game.players[1] = dealer;
//
//        // Time to get this game going! And user goes always first.
//        user.gameStartup();
//        boolean userLoseByDefault = game.playerTurn(user, dealer);
//
//        if(userLoseByDefault){
//            game.lostByDefault(sc);
//        }
//
//        // Dealer's turn
//        dealer.gameStartup();
//        boolean dealerLoseByDefault = game.playerTurn(dealer, user);
//
//        if(dealerLoseByDefault){
//            game.lostByDefault(sc);
//        }
//
//        Player winner = game.whoWon(game.players, dealer);
//
//        System.out.println(user + "'s total is: " + user.getTotal() + ".\n" +
//                           dealer + "'s total is : " + dealer.getTotal() + ".\n");
//        System.out.printf("%s WIN!\n\n", winner);
//
//        if (game.goAgain(sc) == true){
//            main(null);
//        }
//    }
//
//    /**
//     * This method handles the player's turn.<p>
//     * 
//     * Parameters sends in the one playing and the other player. This method 
//     * calls for the {@code wantToStay()} method repeatedly until it returns
//     * {@code true}. It then evaluates if the player's hand is more than 21
//     * and if so, it's an auto-loss for the player.<p>
//     * 
//     * it returns {@code loseByDefault} to tell the caller if the player have
//     * already lost or not.
//     * 
//     * @param player
//     * @param otherPlayer
//     * @return 
//     */
//    private boolean playerTurn(Player player, Player otherPlayer){
//        boolean endTurn = false;
//        boolean loseByDefault = false;
//
//        while(endTurn == false){
//            endTurn = player.wantToStay();
//
//            if(endTurn == false){
//                player.drawCard();
//                System.out.println(player + "'s total is: " + player.getTotal() + "\n");
//            }
//        }
//        if(player.getTotal() > 21){
//            System.out.println(player + "'s total is more than 21, " + player + " lose by default.\n" +
//                               otherPlayer + " WIN!\n");
//            loseByDefault = true;
//        }
//        return loseByDefault;
//    }
//    /**
//     * This method iterates through the players and compare their hands. The 
//     * highest hand wins. It returns the winner.
//     * 
//     * @param players
//     * @param dealer
//     * @return 
//     */
//    private Player whoWon(Player[] players, Player dealer){
//        Player winner = players[0];
//
//        for(int i = 1; i < players.length; i++){
//            Player elem = players[i];
//
//            if(elem.getTotal() > winner.getTotal()){
//                winner = elem;
//            }
//            else if(elem.getTotal() == winner.getTotal()){
//                winner = dealer;
//            }
//        }
//        return winner;
//    }
//
//    /**
//     * This method calls for {@code goAgain()} if either player has lost by default,
//     * if not, it ends the game.
//     * 
//     * @param sc 
//     */
//    private void lostByDefault(Scanner sc){
//        if(goAgain(sc) == true){
//            main(null);
//        }
//        System.exit(0);
//    }
//
//    /**
//     * The method for taking the input and evaluate if the user wants to play
//     * another round.
//     * 
//     * @param sc
//     * @return 
//     */
//    private boolean goAgain(Scanner sc){
//        Boolean goAgain = null;
//
//        while(goAgain == null){
//            System.out.println("Would you like to play another round? \"yes\"/\"no\": ");
//            String input = sc.nextLine();
//
//            String answer = input.toLowerCase();
//
//            switch(answer){
//                case "y":
//                case "yes":
//                    goAgain = true;
//                    break;
//                case "n":
//                case "no":
//                    goAgain = false;
//                    break;
//                default:
//                    System.out.println("Invalid answer. Please answer only \"yes\" or \"no\"");
//                    break;
//            }
//            System.out.println();
//        }
//        return goAgain;
//    }
//}