package com.penninkhof.odata.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by mtschirnich on 21.11.2016.
 *
 * @author mtschirnich
 */
public class LogEntryPK implements Serializable {
    private String device;
    private Timestamp time;

    @Column(name = "device")
    @Id
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    @Column(name = "time")
    @Id
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LogEntryPK that = (LogEntryPK) o;

        if (device != null ? !device.equals(that.device) : that.device != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = device != null ? device.hashCode() : 0;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
