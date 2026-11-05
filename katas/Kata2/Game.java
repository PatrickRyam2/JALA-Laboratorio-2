public class Game {

    public String winner(String[] deckSteve, String[] deckJosh) {

        int pontosSteve = 0;
        int pontosJosh = 0;

        for (int i = 0; i < deckSteve.length; i++) {

            int valorSteve = "23456789TJQKA".indexOf(deckSteve[i]);
            int valorJosh = "23456789TJQKA".indexOf(deckJosh[i]);

            if (valorSteve > valorJosh) {
                pontosSteve++;
            } else if (valorJosh > valorSteve) {
                pontosJosh++;
            }
        }

        if (pontosSteve > pontosJosh) {
            return "Steve wins " + pontosSteve + " to " + pontosJosh;
        } else if (pontosJosh > pontosSteve) {
            return "Josh wins " + pontosJosh + " to " + pontosSteve;
        } else {
            return "Tie";
        }
    }
}