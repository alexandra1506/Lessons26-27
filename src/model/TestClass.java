package model;

import java.util.Objects;

public class TestClass {

    String string;
    int anInt;

    public TestClass(String string, int anInt) {
        this.string = string;
        this.anInt = anInt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass testClass = (TestClass) o;
        return anInt == testClass.anInt &&
                string.equals(testClass.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string, anInt);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }
}
