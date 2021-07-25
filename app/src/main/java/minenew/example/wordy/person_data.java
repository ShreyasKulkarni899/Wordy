package minenew.example.wordy;

public class person_data {
    private String name;
    private Integer age;
    private Long phoneNo;
    private float height;

    public person_data(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getHeight() {
        String tempHT = Float.toString(height);
        return tempHT;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
