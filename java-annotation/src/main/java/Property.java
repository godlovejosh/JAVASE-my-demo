import java.lang.annotation.*;

/**
 * Created by wuxing on 16/8/26.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Property {
    String column();
    String type();
}
