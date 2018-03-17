package vip.com.patterns.prototype;

import java.io.*;

/**
 * 原型模式：深拷贝
 */
public class DeepStudent implements Cloneable, Serializable {
    private String name;
    private int age;
    private School school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    protected Object clone() {
        return this.deepClone();
    }

    //通过序列化实现深拷贝
    public DeepStudent deepClone() {
        DeepStudent deepStudent = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            deepStudent = (DeepStudent)objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deepStudent;
    }
}
