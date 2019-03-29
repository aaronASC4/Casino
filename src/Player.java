public interface Player {

    // Player hand as an array.

    // Player name as a String.

    /**
     * What will happen at start of a player's turn.
     */
    void gameStartup();

    /**
     * Generate a card and add it to the player's hand.
     */
    void drawCard();

    /**
     * Ask player if (s)he wants to hit or stay, returns a boolean on the choice of staying.
     * @return 
     */
    boolean wantToStay();

    /**
     * Retrieves the total of the player's hand.
     * @return 
     */
    int getTotal();
}