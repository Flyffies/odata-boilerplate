package com.penninkhof.odata.entities;

import javax.persistence.*;

/**
 * Created by mtschirnich on 23.11.2016.
 *
 * @author mtschirnich
 */
@Entity
@Table(name = "tg_languages")
public class TgLanguagesEntry {
    private int chatid;
    private String locale;

    @Id
    @Column(name = "chatid")
    public int getChatid() {
        return chatid;
    }

    public void setChatid(int chatid) {
        this.chatid = chatid;
    }

    @Basic
    @Column(name = "locale")
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TgLanguagesEntry that = (TgLanguagesEntry) o;

        if (chatid != that.chatid) return false;
        if (locale != null ? !locale.equals(that.locale) : that.locale != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = chatid;
        result = 31 * result + (locale != null ? locale.hashCode() : 0);
        return result;
    }
}
