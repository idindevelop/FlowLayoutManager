package com.xiaofeng.androidlibs;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Utility for demo item generate
 */
public class DemoUtil {
	private static final Random random = new Random();
	private static final String STRING_BASE = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static List<String> generate(int total, int minLen, int maxLen, int maxLinesPerItem, boolean randomOrder) {
		ArrayList<String> result = new ArrayList<>(total);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= total; i ++) {
			int lineCount = random.nextInt(maxLinesPerItem) + 1;
			List<String> lines = generate(lineCount, minLen, maxLen, randomOrder);
			boolean firstLine = true;
			for (String line : lines) {
				if (firstLine) {
					firstLine = false;
				} else {
					sb.append("\n");
				}
				sb.append(line);
			}
			result.add(sb.toString() +  " (" + i + ")");
		}
		return result;
	}
	public static List<String> generate(int total, int minLen, int maxLen, boolean randomOrder) {
		int baseLen = STRING_BASE.length();
		ArrayList<String> result = new ArrayList<>(total);
		int baseIndex, len;
		for (int i = 0; i < total; i ++) {
			int index = i;
			if (randomOrder) {
				index += random.nextInt(1000);
			}
			baseIndex = index % baseLen;
			len = random.nextInt(maxLen - minLen) + minLen;
			char baseChar = STRING_BASE.charAt(baseIndex);
			Log.d("dbg", "generate: " + len);
			StringBuilder stringBuilder = new StringBuilder(len);
			for (int j = 0; j < len; j++) {
				stringBuilder.append((char) (random.nextInt(122 - 28) + 28));
			}
			result.add(stringBuilder.toString());
		}
		return result;
	}
}
