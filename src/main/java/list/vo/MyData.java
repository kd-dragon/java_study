package list.vo;

import java.util.Objects;

public class MyData {

    private int value;

    public MyData(int value) {
        this.value = value;
    }

    public static MyData create(int n) {
        return new MyData(n);
    }

    @Override
    public String toString() {
        return "" + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return value == myData.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
