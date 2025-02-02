
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Repeatable(RepeatAuthor.class)
public @interface Repeat {
    String author();
}