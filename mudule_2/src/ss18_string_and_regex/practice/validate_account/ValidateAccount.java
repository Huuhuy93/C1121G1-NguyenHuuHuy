package ss18_string_and_regex.practice.validate_account;

public class ValidateAccount {
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public boolean validate(String account) {
        boolean check = account.matches(ACCOUNT_REGEX);
        return check;
    }
}
