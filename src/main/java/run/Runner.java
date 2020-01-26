package run;

import graph.Edge;
import graph.FlowGraph;
import graph.OpParam;
import op.OpController;

import java.util.ArrayList;
import java.util.List;


public class Runner {
    FlowGraph graph;

    TickSequence tickSeq = new TickSequence();

    public Runner(FlowGraph graph){

    }

    // routes and processes a list of messages (input), returning the resulting messages for further processing.
    public List<Msg> tick(List<Msg> input){
        int tickNumber = tickSeq.next();
        List<Msg> result = new ArrayList<>();
        for(Msg msg:input){
            List<Edge> edges = graph.getEdges(msg.getSource());
            for(Edge edge:edges){
                OpParam opParam = edge.getOpParam();
                OpController opController = opParam.getOpController();
                int opStatus = opController.receive(tickNumber, opParam.getPosition(),msg.getData());
                if(opStatus == 0){
                    Object data = opController.process();
                    result.add(new Msg(edge.getIdVertex(), data));
                }
            }
        }
        return result;
    }
}
