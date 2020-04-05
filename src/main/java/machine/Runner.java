package machine;

import graph.Edge;
import graph.FlowGraph;
import graph.OpParam;
import op.OpController;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    TickSequence tickSequence = new TickSequence();
    FlowGraph graph;


    public Runner(FlowGraph graph){
        this.graph = graph;

    }

    public void run(List<Msg> inputs){
            this.step(tickSequence.next(),inputs);
    }

    // call router as long as it produces output.
    private void step(int tickId, List<Msg> inputs){
        List<Msg> msgTray = inputs;
        do{
            msgTray = this.route(tickId, msgTray);
        }while(msgTray.size() > 0);

    }

    private List<Msg> route(int tickId, List<Msg> inputs) {
        List<Msg> result = new ArrayList<>();
        for(Msg msg:inputs){
            List<Edge> edges = graph.getEdges(msg.getSource());
            for(Edge edge:edges){
                OpParam opParam = edge.getOpParam();
                OpController opController = opParam.getOpController();
                Msg output = opController.receive(tickId, opParam.getPosition(), msg.getData());
                // TODO: controller should have a state indicating the reason of nullity.
                if(output != null){
                    result.add(output);
                }
            }
        }
        return result;
    }
}
