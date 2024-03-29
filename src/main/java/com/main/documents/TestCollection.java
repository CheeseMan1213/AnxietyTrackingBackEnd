package com.main.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "testCollection")
public class TestCollection {

    @Id
    private String _id;

    private String firstName;
    private String lastName;
    private Date TTime;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getTTime() {
        return TTime;
    }

    public void setTTime(Date TTime) {
        this.TTime = TTime;
    }
}
