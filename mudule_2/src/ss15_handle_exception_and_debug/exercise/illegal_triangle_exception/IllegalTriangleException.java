package ss15_handle_exception_and_debug.exercise.illegal_triangle_exception;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
}
