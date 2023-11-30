import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Pattern p = Pattern.compile("[0-9]{8}[a-zA-Z]{1}");
        Matcher m = p.matcher(tec.nextLine());
        if (m.matches()) {
            System.out.println("NIF válido");
        } else {
            System.out.println("NIF no válido");
        }
    }

}
