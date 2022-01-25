package ss18_string_and_regex.exercise.validate_class_name;

public class ValidateClassName {
    public static final String CLASS_NAME_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";
    public boolean validate(String className) {
        boolean check = className.matches(CLASS_NAME_REGEX);
        return check;
    }
}
