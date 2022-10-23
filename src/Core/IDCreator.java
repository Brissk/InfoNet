package Core;

public class IDCreator {
    Integer id = 0;
    public IDCreator(){
        super();
    }

    public Integer getId(){

        return id++;
    }


}
