package com.hyuki.dp.Adapter.A2;

import java.io.*;
import java.util.*;

/**
 * プロパティファイルを読み書きするためのAdapterクラスです。<p>
 * {@link FileIO}のメソッドを利用して読み書きしてください。
 */
@SuppressWarnings("serial")
public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String filename) throws IOException {
	load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
	store(new FileOutputStream(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
	setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
	return getProperty(key, "");
    }
}
