package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\Sande_000\\Desktop\\java\\Adactin_Automation\\src\\test\\java\\com\\adactin\\properties\\Confirgration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis); // throws exception IO

		// load----its add method
	}

	public String getBrowser() {

		String broswer = p.getProperty("broswer");

		return broswer;
	}

	public String geturl() {

		String url = p.getProperty("url");
		return url;
	}

	public String getUsername() {

		String username = p.getProperty("username");

		return username;

	}

	public String getPassword() {

		String password = p.getProperty("password");

		return password;

	}

}
