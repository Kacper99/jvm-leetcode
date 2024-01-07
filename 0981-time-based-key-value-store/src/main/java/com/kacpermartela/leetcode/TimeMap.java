package com.kacpermartela.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {

    private final Map<String, List<TimeMapEntry>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        List<TimeMapEntry> timeMapEntries = map.get(key);
        TimeMapEntry timeMapEntry = new TimeMapEntry(value, timestamp);
        if (timeMapEntries == null) {
            map.put(key, new ArrayList<>(List.of(timeMapEntry)));
        } else {
            timeMapEntries.add(timeMapEntry);
        }
    }

    public String get(String key, int timestamp) {
        List<TimeMapEntry> timeMapEntries = map.get(key);
        if (timeMapEntries == null) {
            return "";
        }

        int left = 0;
        int right = timeMapEntries.size() - 1;
        String curr = "";

        while (left <= right) {
            int mid = left + (right - left) / 2;
            var midEntry = timeMapEntries.get(mid);
            if (midEntry.timestamp <= timestamp) {
                curr = midEntry.value;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return curr;
    }

    record TimeMapEntry(String value, int timestamp) {}
}
