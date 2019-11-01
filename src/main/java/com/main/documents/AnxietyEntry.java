package com.main.documents;
import com.main.enums.TodayWas;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "anxietyEntry")
public class AnxietyEntry {

    //Member variables.
    @Id
    private String _id;
    private String date;//Date that will be passed form the calendar page.
    private String anxEntry;//The anxiety entry text.
    private TodayWas todayWas;//For the radio buttons.



    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAnxEntry() {
        return anxEntry;
    }

    public void setAnxEntry(String anxEntry) {
        this.anxEntry = anxEntry;
    }

    public TodayWas getTodayWas() {
        return todayWas;
    }

    public void setTodayWas(TodayWas todayWas) {
        this.todayWas = todayWas;
    }
}
