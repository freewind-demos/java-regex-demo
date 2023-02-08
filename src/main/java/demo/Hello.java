package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hello {

    public static void main(String[] args) {
        String regex = "^data:(.+);base64,(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("data:image/jpeg;base64,/9j/4AAQSkZ");

        if (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }

    }

}
