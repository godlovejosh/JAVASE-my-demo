import java.lang.annotation.*;

/**
 * Created by wuxing on 16/8/26.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Persistent {
    String table();
}
