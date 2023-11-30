import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Pattern p = Pattern.compile("CA[0-9].");
        Matcher m = p.matcher(tec.nextLine());
        if (m.matches()) {
            System.out.println("Si, contiene el patrón");
        } else {
            System.out.println("No, no contiene el patrón");
        }
    }

}
