package op;

import machine.Msg;

public class OpController {
    public static int TICKCLEAR = -1;
    public static int TICKSTARTCYCLE = 0;
    public static int OP_READY =  0;
    int hitcount;
    int tickId;
    Object[] inputs;
    Op op;
    public OpController(Op op, Object[] inputs){
        this.op  = op;
        this.inputs = inputs;
        this.hitcount =  inputs.length;
        tickId = -1;
    }
    public void restart(){
        hitcount = inputs.length;
    }
    private void ping(int currTickId){
        if(tickId != currTickId ){
            restart();
        }
        tickId = currTickId;
    }
    public Msg receive(int currTickId, int position,  Object data){
        ping(currTickId);
        hitcount-= 1;
        inputs[position] = data;
        if ( hitcount == 0 ){
            Object result = op.process(inputs);
            if(result != null) {
                return new Msg(data, 0); // flags will be handled differently by subclasses.
            }else{
                // TODO: signal that null data has been skipped.
            }
        }
        return null;
    }

}
