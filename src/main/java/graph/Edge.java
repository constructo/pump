package graph;

/*
 the dual purpose is to contain both graph/edge information and flow routing information.
 */
public class Edge {
    private int idVertex;
    private OpParam opParam;

    public Edge(int idVertex, OpParam opParam){
        this.idVertex = idVertex;
        this.opParam = opParam;
    }

    public int getIdVertex() {
        return idVertex;
    }

    public void setIdVertex(int idVertex) {
        this.idVertex = idVertex;
    }

    public OpParam getOpParam() {
        return opParam;
    }

    public void setOpParam(OpParam opParam) {
        this.opParam = opParam;
    }
}
