import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wuxing
 */
public class Test {

    public static void main(String[] args) {
        /**
         * ([\(\[])([+-]?\d+(?:\.\d+)?),?([+-]?\d+(?:\.\d+)?)?([\)\]])?
         */
        String ladderExpression = "([\\(\\[])([+-]?\\d+(?:\\.\\d+)?),?([+-]?\\d+(?:\\.\\d+)?)?([\\)\\]])?";
        String scope = "(0,2]";
        Pattern pattern = Pattern.compile(ladderExpression);
        Matcher matcher = pattern.matcher(scope);
//        if (!matcher.find() || matcher.groupCount() != 4) {
//            System.out.println("match count[" + matcher.groupCount() + "] is not 4");
//        }
//        System.out.println(matcher.group(0)); // 是匹配的一整段
//        System.out.println(matcher.group(1));
//        System.out.println(matcher.group(2));
//        System.out.println(matcher.group(3));
//        System.out.println(matcher.group(4));
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
