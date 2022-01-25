package ss18_string_and_regex.practice.validate_email;

public class ValidateEmailTest {
    private static ValidateEmail validateEmail;
    public static final String[] validEmail = new String[] { "huynguyen20@gmail.com", "hung123123@yahoo.com", "abcnhdda@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        validateEmail = new ValidateEmail();
        for (String email: validEmail) {
            boolean isvalid = validateEmail.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }

        for (String email : invalidEmail) {
            boolean isvalid = validateEmail.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}
