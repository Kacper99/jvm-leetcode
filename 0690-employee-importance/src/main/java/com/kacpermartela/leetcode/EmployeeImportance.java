package com.kacpermartela.leetcode;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeImportance {

    public static int getImportance(List<Employee> employees, int id) {
        final var employeeLookup =
                employees.stream().collect(Collectors.toMap(employee -> employee.id, Function.identity()));

        return dfs(id, employeeLookup);
    }

    public static int dfs(int rootId, Map<Integer, Employee> lookup) {
        Employee employee = lookup.get(rootId);
        int total = employee.importance;

        for (Integer subordinateId : employee.subordinates) {
            total += dfs(subordinateId, lookup);
        }

        return total;
    }

    public static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
    ;
}
