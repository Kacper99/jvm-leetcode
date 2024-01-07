package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeMapTest {

    @Test
    void example1() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        assertThat(timeMap.get("foo", 1)).isEqualTo("bar");
        assertThat(timeMap.get("foo", 3)).isEqualTo("bar");
        timeMap.set("foo", "bar2", 4);
        assertThat(timeMap.get("foo", 4)).isEqualTo("bar2");
        assertThat(timeMap.get("foo", 5)).isEqualTo("bar2");
    }
}
