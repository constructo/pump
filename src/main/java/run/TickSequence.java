package run;

public class TickSequence {
    public static int TICKSEQ_START = 0;
    int seq = TICKSEQ_START;
    boolean restarted = false;

    public int next(){
        int tickNumber = seq;
        seq++;
        if(seq == Integer.MAX_VALUE){
            seq = TICKSEQ_START;
            restarted = true;
        }else{
            restarted = false;
        }
        return tickNumber;
    }

    public boolean hasRestarted(){
        return restarted;
    }

}
