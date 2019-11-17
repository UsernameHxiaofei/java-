package cn.itcast.solr;

public class Student {
    private  String naem;
    private  Integer age;
    private Double score;

    public Student() {
    }



    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "naem='" + naem + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
