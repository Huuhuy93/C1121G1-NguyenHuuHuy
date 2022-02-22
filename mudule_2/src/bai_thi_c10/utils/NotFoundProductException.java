package bai_thi_c10.utils;

public class NotFoundProductException extends Exception{
    public NotFoundProductException() {
    }
    public NotFoundProductException(String message) {
        super(message);
    }
}
