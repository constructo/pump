package op;

public class OpController {
    public static int TICKCLEAR = -1;
    public static int TICKSTARTCYCLE = 0;
    public static int OP_READY =  0;
    int hitcount;
    int activityTick;
    Object[] inputs;
    Op op;
    public OpController(Op op, Object[] inputs){
        this.op  = op;
        this.inputs = inputs;
        this.hitcount =  inputs.length;
        activityTick = -1;
    }
    public void restart(){
        hitcount = inputs.length;
    }
    private void ping(int tickNumber){
        // reset hitcount if tickNumber does not match.
        if(activityTick != tickNumber ){
            restart();
        }
        activityTick = tickNumber;
    }
    public int receive(int tickNumber, int position,  Object data){
        ping(tickNumber);
        hitcount-= 1;
        inputs[position] = data;
        return hitcount;
    }
    public Object process(){
        return op.process(inputs);
    }
}
