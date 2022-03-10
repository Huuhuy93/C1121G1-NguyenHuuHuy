public class Person {
    int order;
    String name;
    String dateOfBirth;
    String address;
    String images;

    public Person(int order, String name, String dateOfBirth, String address, String images) {
        this.order = order;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.images = images;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}


