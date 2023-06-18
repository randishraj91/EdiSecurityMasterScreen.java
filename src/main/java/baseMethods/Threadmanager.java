package baseMethods;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class Threadmanager {
	public static Map drivermanager = new HashMap();
	
	
	
	
	public static synchronized WebDriver getdriver() {
		return (WebDriver) drivermanager.get((int) (long) (Thread.currentThread().getId()));
	}

	public static synchronized  void setdriver(WebDriver id) {
		drivermanager.put((int) (long) (Thread.currentThread().getId()), id);
	}
	
}
