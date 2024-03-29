package com.revature.intro;

import java.util.*;

public class Collections {
	
	public static void main(String[] args) {
		String[] arr = {"if", "it", "is", "to", "be", "it", "is", "up", "to", "me", "to", "delegate"};
		map(arr);
	}
	
	static void map(String[] args) {
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();

        // Initialize frequency table from command line
        for (String a : args) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
	}
	
}
