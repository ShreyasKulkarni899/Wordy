package minenew.example.wordy;

public class Member {
    private String Name;
    private Integer Age;
    private Long ph;
    private float ht;
    public Member(){

    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Long getPh() {
        return ph;
    }

    public void setPh(Long ph) {
        this.ph = ph;
    }

    public float getHt() {
        return ht;
    }

    public void setHt(float ht) {
        this.ht = ht;
    }
}
