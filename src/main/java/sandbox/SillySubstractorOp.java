package sandbox;

import op.Op;

public class SillySubstractorOp implements Op {
    @Override
    public Object process(Object[] inputs) {
        Integer a = (Integer) inputs[0];
        Integer b = (Integer) inputs[1];
        return a - b;
    }

    @Override
    public int inputCount() {
        return 2;
    }
}
