package ss20_structural_design_pattern.practice.implement_facade;

public class LinkedIn implements ISocialShare{
    private String message;
    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to LinkedIn: "+this.message);
    }
}
