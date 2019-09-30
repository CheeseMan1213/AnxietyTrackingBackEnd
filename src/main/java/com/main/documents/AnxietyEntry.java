package com.main.documents;
import com.main.enums.TodayWas;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.Date;

@Document(collection = "anxietyEntry")
public class AnxietyEntry {

    //Member variables.
    @Id
    private BigInteger _id;
    Date _date;//Date that will be passed form the calendar page.
    String _anxEntry;//The anxiety entry text.
    TodayWas _todayWas;//For the radio buttons.

    public BigInteger get_id() {
        return _id;
    }

    public void set_id(BigInteger _id) {
        this._id = _id;
    }

    public Date get_date() {
        return _date;
    }

    public void set_date(Date _date) {
        this._date = _date;
    }

    public String get_anxEntry() {
        return _anxEntry;
    }

    public void set_anxEntry(String _anxEntry) {
        this._anxEntry = _anxEntry;
    }

    public TodayWas get_todayWas() {
        return _todayWas;
    }

    public void set_todayWas(TodayWas _todayWas) {
        this._todayWas = _todayWas;
    }
}
