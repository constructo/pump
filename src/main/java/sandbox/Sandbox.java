package sandbox;

import op.OpController;

/*
 * fiddle tests here.. will be taken to separate project later.
 */
public class Sandbox {
    public static void main(String[] args) {
        OpController opController = new OpController(new SillySubstractorOp(),new Object[2]);
        int status  = 0;
        int ticknumber = 1;
        status = opController.receive(ticknumber,0,1);
        System.out.println("status after first write..."  + status);
        status = opController.receive(ticknumber, 1,4);
        System.out.println("status after second write..."  + status);
        System.out.println("is ready?" + (status == 0));
        if(status == 0){
            Object result = opController.process();
            System.out.println(result);
        }
        status = opController.receive(ticknumber, 1,604);
        ticknumber ++;
        status = opController.receive(ticknumber,0,7);
        System.out.println("status after first write..."  + status);
        status = opController.receive(ticknumber, 1,15);
        System.out.println("status after second write..."  + status);
        System.out.println("is ready?" + (status == 0));
        if(status == 0){
            Object result = opController.process();
            System.out.println(result);
        }
    }
}
