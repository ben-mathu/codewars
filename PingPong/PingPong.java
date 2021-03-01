import java.util.List;
import java.util.ArrayList;

public class PingPong {
  private static ArrayList<Score> sScoreList;
  private static Score score;
  private static String output = "";
  private static int count = 0;
  
  public static ArrayList<Score> result(String winOrLose) {
    if (winOrLose.isEmpty()) {
      return null;
    }
    
    sScoreList = new ArrayList<>();
    
    int me = 0;
    int opp = 0;
    
    // 11 points score system
    for (int i = 0; i < winOrLose.length(); i++) {
      char c = winOrLose.charAt(i);

      output += c + "";
      if (count == winOrLose.length() / 4) {
        System.out.println();
        count = 0;
      }
      count++;

      if (c == 'W') {
        me++;
      }
      
      if (c == 'L') {
        opp++;
      }

      // me/opp is equal to 11 or the loser is less than 2 of winner
      if (me == 11 && opp <= me - 2 || opp == 11 && me <= opp - 2) {
        score = new Score(me, opp);
        System.out.println("Me: " + score.getMe() + " Opp:" + score.getOpp());
        sScoreList.add(score);
        me = 0;
        opp = 0;
      } else if (me > 11 && opp <= me - 2 || opp > 11 && me <= opp - 2) { // me/opp is go for extra points and winner has 2 more than loser
        score = new Score(me, opp);
        System.out.println("Me: " + score.getMe() + " Opp:" + score.getOpp());
        sScoreList.add(score);
        me = 0;
        opp = 0;
      } else if (i == winOrLose.length() - 1) {
        score = new Score(me, opp);
        System.out.println("Me: " + score.getMe() + " Opp:" + score.getOpp());
        sScoreList.add(score);
        me = 0;
        opp = 0;
      }
    }
    
    String breakpoint = " ";

    // 21 points score system
    for (int i = 0; i < winOrLose.length(); i++) {
      char c = winOrLose.charAt(i);

      output += c + "";
      if (i == winOrLose.length() / 4) {
        System.out.println();
      }

      if (c == 'W') {
        me++;
      }
      
      if (c == 'L') {
        opp++;
      }

      if (me == 21 && opp <= me - 2 || opp == 21 && me <= opp - 2) {
        score = new Score(me, opp);
        System.out.println("Me: " + score.getMe() + " Opp:" + score.getOpp());
        sScoreList.add(score);
        me = 0;
        opp = 0;
      } else if (me > 21 && opp <= me - 2 || opp > 21 && me <= opp - 2) {
        score = new Score(me, opp);
        System.out.println("Me: " + score.getMe() + " Opp:" + score.getOpp());
        sScoreList.add(score);
        me = 0;
        opp = 0;
      } else if (i == winOrLose.length() - 1) {
        score = new Score(me, opp);
        System.out.println("Me: " + score.getMe() + " Opp:" + score.getOpp());
        sScoreList.add(score);
      }
    }
    
    return sScoreList;
  }

  public static void main(String[] args) {
    ArrayList<Score> list = PingPong.result("LWWWLLLWLLWWWLLWWLWWLLWLLLWWWWLWLWLWLWLLWLLWLWLWWWLLLLWWWWLLLWLWWLLWLWLLWLWWWLWWLWWWLLWLLWWLLLLWLLLLLLLWLLLLWLLLLWLLLWWW");

    for (Score result : list) {
      System.out.println("Me: " + result.getMe() + " Opp:" + result.getOpp());
    }
  }
}
