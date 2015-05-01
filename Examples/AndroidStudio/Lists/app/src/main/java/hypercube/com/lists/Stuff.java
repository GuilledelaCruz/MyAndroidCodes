package hypercube.com.lists;

/**
 * Created by guilledelacruz on 1/05/15.
 */
public class Stuff {

    private String title;
    private Integer number;

    public Stuff(){
        title = "";
        number = 0;
    }
    public Stuff(String title, Integer number){
        this.title = title;
        this.number = number;
    }

    public String getTitle(){
        return title;
    }

    public Integer getNumber(){
        return number;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setNumber(Integer number){
        this.number = number;
    }
}
