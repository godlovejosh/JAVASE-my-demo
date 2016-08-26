import javax.swing.*;
import java.util.Date;

/**
 * Created by wuxing on 16/8/6.
 */
public class CrazyitObjectFactory {
    public static <T> T getInstance(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Date d = CrazyitObjectFactory.getInstance(Date.class);
        JFrame f = CrazyitObjectFactory.getInstance(JFrame.class);
    }
}
