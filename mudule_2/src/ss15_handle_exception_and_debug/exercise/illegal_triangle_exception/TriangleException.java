package ss15_handle_exception_and_debug.exercise.illegal_triangle_exception;

public class TriangleException extends Exception{
    public TriangleException() {
    }

    public TriangleException(String message) {
        super(message);
    }
}
