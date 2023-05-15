
import java.lang.annotation.*;   // package for annotations

// single target - type is defined
@Target(ElementType.TYPE)

// we can specify multiple targets also
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})

// it denotes till where it's power holds
@Retention(RetentionPolicy.RUNTIME)

@interface CricketPlayer
{

    String country() default "India";
    int age() default 34;

}

// this annotation gives info that virat is a cricket player - belonging to india and age 34
@CricketPlayer
class Virat
{
    @CricketPlayer   // being used with variables
    private int innings;
    private int runs;

    @CricketPlayer   // being used with constructors
    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

}

public class Annotation2 
{
    public static void main(String[] args) 
    {

        Virat v=new Virat();
        v.setInnings(300);
        v.setRuns(20000);

        System.out.println(v.getInnings());
        System.out.println(v.getRuns());

        Class c=v.getClass();
        Annotation a=c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp=(CricketPlayer)a;    // down-casting

        String country=cp.country();
        System.out.println(country);
        int age=cp.age();
        System.out.println(age);
  
    }
    
}
