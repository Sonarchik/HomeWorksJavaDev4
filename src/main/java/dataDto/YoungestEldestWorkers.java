package dataDto;

import java.sql.Date;

public class YoungestEldestWorkers {
    private final String type;
    private final String name;
    private final Date birthday;

    public YoungestEldestWorkers(String type, String name, Date birthday) {
        this.type = type;
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "{ " +
                "type = '" + type + '\'' +
                ", name = '" + name + '\'' +
                ", birthday = " + birthday +
                " }";
    }
}
