package ss18_string_and_regex.exercise.validate_phone_number;

public class ValidatePhoneNumber {
    public static final String PHONE_NUMBER_REGEX = "^[0-9]{2}-[0][0-9]{9}$";
    public boolean validate(String phoneNumber) {
        boolean check = phoneNumber.matches(PHONE_NUMBER_REGEX);

        return check;
    }
}
