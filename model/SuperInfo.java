package model;

import java.util.Objects;

public class SuperInfo <T extends Comparable> implements Comparable<SuperInfo<T>> {

    private String string;
    private T tVal;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperInfo<?> superInfo = (SuperInfo<?>) o;
        return string.equals(superInfo.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }

    @Override
    public String toString() {
        return this.getString()+"["+this.gettVal()+"]";
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public T gettVal() {
        return tVal;
    }

    public void settVal(T tVal) {
        this.tVal = tVal;
    }

    public SuperInfo(String string, T tVal) {
        this.setString(string);
        this.settVal(tVal);
    }

   /* @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(this.getClass() != o.getClass()) return false;
        SuperInfo superInfo = (SuperInfo) o;
        if(this.getString().equals(superInfo.getString()) && this.gettVal().equals(superInfo.gettVal()))
            return true;
        else
        return false;
    }

    */

    @Override
    public int compareTo(SuperInfo superInfo) {
        return this.getString().compareTo(superInfo.getString());
    }

}
