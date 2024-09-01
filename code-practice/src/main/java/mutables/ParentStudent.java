package mutables;

import immutables.Address;

import java.util.Objects;

public class ParentStudent {
    final String name;
    ParentStudent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParentStudent that = (ParentStudent) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "ParentStudent{" +
                "name='" + name + '\'' +
                '}';
    }
}
