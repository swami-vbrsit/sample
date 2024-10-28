package com.ems.qa.configreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {
	private Properties prop;
	public Properties read_elements() {
		try{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Swami Reddy\\eclipse-workspace\\EMS_App_Testing\\src\\test\\resource\\EMS_config\\properties\\properties");
	    prop.load(fis);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
