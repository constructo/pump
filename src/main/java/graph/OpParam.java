package graph;

import op.OpController;

/*
 contains the necessary info to route data to an operator's input tray
 */
public class OpParam {
    private int position;
    private OpController opController;

    public OpParam(OpController opController, int position){
        this.setOpController(opController);
        this.setPosition(position);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public OpController getOpController() {
        return opController;
    }

    public void setOpController(OpController opController) {
        this.opController = opController;
    }
}
