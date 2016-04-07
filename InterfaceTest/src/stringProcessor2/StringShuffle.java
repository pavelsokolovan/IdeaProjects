package stringProcessor2;

/**
 * Created by psok on 3/30/2016.
 */
public class StringShuffle {
    public String shuffle(String s) {
        StringBuilder out = new StringBuilder(s.length());
        for (int i = 0; i < (s.length() - 1); i+=2) {
            out.append(s.charAt(i+1));
            out.append(s.charAt(i));
        }
        return out.toString();
    }
}
