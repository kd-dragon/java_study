package map.vo;

import java.util.Objects;

public class MyMapData {

    private int v;

    public MyMapData(int v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "[" + v + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyMapData myMapData = (MyMapData) o;
        return v == myMapData.v;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v);
    }
}
