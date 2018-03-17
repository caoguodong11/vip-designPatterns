package vip.com.patterns.prototype;


/**
 * 原型模式
 */
public class prototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        deepTest();
    }

    //浅拷贝测试
    public static void shallowTest() throws CloneNotSupportedException {
        ShallowStudent shallowStudent = new ShallowStudent();
        shallowStudent.setName("曹国栋");
        shallowStudent.setAge(29);
        School school = new School();
        school.setAddr("北京");
        school.setName("清华大学");
        shallowStudent.setSchool(school);

        ShallowStudent clone = (ShallowStudent) shallowStudent.clone();

        System.out.println(shallowStudent);
        System.out.println(shallowStudent.getSchool());
        System.out.println(clone);
        System.out.println(clone.getSchool());
    }

    public static void deepTest(){
        DeepStudent deepStudent = new DeepStudent();
        deepStudent.setName("曹国栋");
        deepStudent.setAge(29);
        School school = new School();
        school.setAddr("北京");
        school.setName("清华大学");
        deepStudent.setSchool(school);

        DeepStudent clone = (DeepStudent) deepStudent.clone();
        deepStudent.getSchool().setName("北京大学");
        System.out.println(deepStudent.getSchool().getName());
        System.out.println(clone.getSchool().getName());
        System.out.println(deepStudent);
        System.out.println(deepStudent.getSchool());
        System.out.println(clone);
        System.out.println(clone.getSchool());
    }
}
