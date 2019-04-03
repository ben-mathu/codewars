public class Score {
    private int me = 0;
    private int opp = 0;
    
    public Score(int me, int opp) {
      this.me = me;
      this.opp = opp;
    }
  
    public void setMe(int me) {
      this.me = me;
    }
  
    public int getMe() {
      return me;
    }
  
    public void setOpp(int opp) {
      this.opp = opp;
    }
  
    public int getOpp() {
      return opp;
    }
  }