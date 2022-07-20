import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInformation {

    public void validateFirstname(String firstName,String CheckPattern){
        Pattern pattern = Pattern.compile(CheckPattern);
        Matcher matcher = pattern.matcher(firstName);
        if(matcher.matches()){
            System.out.println("valid");
        }
        else
            System.out.println("invalid");

    }
}
