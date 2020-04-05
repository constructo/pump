package graph;

/*
 the dual purpose is to contain both graph/edge information and flow routing information.
 */
public class Edge {
    private int vertexId;
    private OpParam opParam;

    public Edge(int vertexId, OpParam opParam){
        this.vertexId = vertexId;
        this.opParam = opParam;
    }

    public int getVertexId() {
        return vertexId;
    }

    public void setVertexId(int vertexId) {
        this.vertexId = vertexId;
    }

    public OpParam getOpParam() {
        return opParam;
    }

    public void setOpParam(OpParam opParam) {
        this.opParam = opParam;
    }
}
