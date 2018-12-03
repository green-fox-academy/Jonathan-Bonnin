package com.greenfoxacademy.restapi.models;

import java.util.ArrayList;
import java.util.List;

public class Entries {
    List<Log> entries = new ArrayList<>();
    int entry_count = entries.size();

    public List<Log> getEntries() {
        return entries;
    }

    public void setEntries(List<Log> entries) {
        this.entries = entries;
    }

    public int getEntry_count() {
        return entry_count;
    }

    public void setEntry_count(int entry_count) {
        this.entry_count = entry_count;
    }

    public void add(Log log){
        entries.add(log);
    }
}
