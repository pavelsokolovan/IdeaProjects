package Test;

/**
 * Created by psok on 3/29/2016.
 */
public class Sub extends Super
    implements AbleToDo {
    @Override
    public void Do() {
        System.out.println(getClass().getSimpleName());
    }
}
