import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Pattern p = Pattern.compile("[x,y,z][0-9]{7}[a-zA-Z]{1}");
        Matcher m = p.matcher(tec.nextLine());
        if (m.matches()) {
            System.out.print("NIE válido");
        } else {
            System.out.print("NIE no válido");
        }
    }

}
