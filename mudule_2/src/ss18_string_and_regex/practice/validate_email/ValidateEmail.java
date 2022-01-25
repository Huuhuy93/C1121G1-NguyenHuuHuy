package ss18_string_and_regex.practice.validate_email;

public class ValidateEmail {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public boolean validate(String email) {
        boolean check = email.matches(EMAIL_REGEX);
        return check;
    }
}
