public class MethodExample {

        public void displayHighScorePosition(String playerName, int position){

               System.out.println(playerName +" manage to get the position "+position+" on the high score table");
        }
    public int calculateHighScore(int score) {
            int pos;
            if (score >= 1000) {
                pos=1;
            } else if (score >= 500) {
                pos=2;
            } else if (score >= 100) {
                pos= 3;
            } else {
                pos= 4;
            }
            return pos;
        }
    public static void main(String[] args) {
            MethodExample methodExample = new MethodExample();
     int position = methodExample.calculateHighScore(1500);
        methodExample.displayHighScorePosition("Vishal", position);

        position = methodExample.calculateHighScore(900);
        methodExample.displayHighScorePosition("Joy", position);

        position = methodExample.calculateHighScore(400);
        methodExample.displayHighScorePosition("Sean", position);

        position = methodExample.calculateHighScore(50);
        methodExample.displayHighScorePosition("Nathan", position);
    }
}
