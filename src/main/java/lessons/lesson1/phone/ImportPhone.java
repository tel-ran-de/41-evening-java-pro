package lessons.lesson1.phone;

public class ImportPhone {

    String manufactor;

    Phone phone;

    public ImportPhone(String manufactor, Phone phone) {
        this.manufactor = manufactor;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ImportPhone{" +
                "manufactor='" + manufactor + '\'' +
                ", phone=" + phone +
                '}';
    }
}
