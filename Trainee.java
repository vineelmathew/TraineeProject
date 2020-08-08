public class Trainee {
    private String id;
    private String name;
    public Trainee(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
public int hashCode()
{
    int hashid=id.hashCode();
    return hashid;
}
@Override
    public boolean equals(Object Arg) {
        if(Arg==this)
        {
            return true;
        }
        if(Arg==null || !(Arg instanceof Trainee))
        {
            return false;
        }
        Trainee that=(Trainee) Arg;
        boolean isequal=this.id.equals(that.id);
        return isequal;
    }
}


