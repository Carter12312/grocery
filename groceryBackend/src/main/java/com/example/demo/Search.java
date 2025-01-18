package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Search {

    public static class Result {

        private final String value;

        private final int editDistance;

        Result(String value, int editDistance) {
            this.value = value;
            this.editDistance = editDistance;
        }

        public int getEditDistance() {
            return this.editDistance;
        }

        public String getValue() {
            return this.value;
        }
    }
    public List<String> search(String key, List<String> values, int resultLength) {
        PriorityQueue<Result> pq = new PriorityQueue<>(new Comparator<Result>() {
            @Override
            public int compare(Result r1, Result r2) {
                return Integer.compare(r1.getEditDistance(), r2.getEditDistance());
            }
        });

        for (String value : values) {
            pq.add(new Result(value, editDistance(key, value)));
        }

        List<String> results = new ArrayList<String>();

        for(int i = 0; i < resultLength && !pq.isEmpty(); i++) {
            results.add(pq.poll().getValue());
        }

        return results;
    }

    private static int editDistance(String key, String value) {
        int m = key.length(); int n = value.length();

        int[][] dp = new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (key.charAt(i-1) == value.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
                }
            }
        }

        return dp[m][n];
    }
}
