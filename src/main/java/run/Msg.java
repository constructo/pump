package run;

public class Msg {
    private int source;
    private Object data;

    public Msg(int source, Object data){
        this.source = source;
        this.data = data;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
