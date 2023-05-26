import java.util.ArrayList;

public class Celebrity {
    private String name;
    private ArrayList<String> hints = new ArrayList<String>();
    private String type;
    public Celebrity(String name, String hint, String type){
        this.name = name;
        this.type = type;
        this.hints.add(hint);
    }

    public String getName(){
        return this.name;
    }
    public String getHint(){
        return hints.get((int)(Math.random()*hints.size()));
    }
}
