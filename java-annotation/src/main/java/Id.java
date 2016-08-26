import java.lang.annotation.*;

/**
 * Created by wuxing on 16/8/26.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Id {
    String column();
    String type();
    String generator();
}
