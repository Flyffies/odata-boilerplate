package com.penninkhof.odata.entities;

import com.penninkhof.odata.annotations.Sap;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by mtschirnich on 21.11.2016.
 *
 * @author mtschirnich
 */
@Entity
@Table(name = "log")
@IdClass(LogEntryPK.class)
public class LogEntry {

    @Id
    @Sap(filterable = true, sortable = true, creatable = true)
    private String device;
    @Id
    @Sap(filterable = true, sortable = true, creatable = true)
    private Timestamp time;
    @Sap(filterable = true, sortable = true, creatable = true, updatable = true)
    private String content;

    @Column(name = "device")
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    @Column(name = "time")
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LogEntry logEntry = (LogEntry) o;

        if (device != null ? !device.equals(logEntry.device) : logEntry.device != null) return false;
        if (time != null ? !time.equals(logEntry.time) : logEntry.time != null) return false;
        if (content != null ? !content.equals(logEntry.content) : logEntry.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = device != null ? device.hashCode() : 0;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }

}
