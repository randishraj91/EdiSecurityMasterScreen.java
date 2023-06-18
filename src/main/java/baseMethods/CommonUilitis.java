package baseMethods;

import java.io.File;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.search.FlagTerm;
import javax.mail.search.OrTerm;
import javax.mail.search.SearchTerm;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

import javax.mail.Folder;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.InternetAddress;
import javax.mail.search.FlagTerm;
import javax.mail.search.OrTerm;
import javax.mail.search.SearchTerm;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommonUilitis {

	public static WebDriver driver = null;
	private static boolean textIsHtml = false;

	public static String getpropvalue(String key) {
		String value = null;
		try {
			Properties prop = new Properties();
			FileInputStream ip;
			if (System.getProperty("AppEnvironment").equalsIgnoreCase("UAT")) {
				ip = new FileInputStream(
						System.getProperty("user.dir") + "/src/test/resources/TestData/UATconfig.properties");
			} else if (System.getProperty("AppEnvironment").equalsIgnoreCase("PRODUCTION")) {
				ip = new FileInputStream(
						System.getProperty("user.dir") + "/src/test/resources/TestData/Prouctionconfig.properties");
			} else if (System.getProperty("AppEnvironment").equalsIgnoreCase("DEV")) {
				ip = new FileInputStream(
						System.getProperty("user.dir") + "/src/test/resources/TestData/DEVconfig.properties");
			} else {
				ip = new FileInputStream(
						System.getProperty("user.dir") + "/src/test/resources/TestData/QAconfig.properties");

			}
			prop.load(ip);
			value = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static String GetDateandTime() {
		DateFormat dateFormat = null;
		Date date = null;
		try {
			dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			date = new Date();
		} catch (Exception e) {
			System.out.println("Error in Getdateandtime : " + e.getMessage());
		}

		return dateFormat.format(date);
	}

	public static JSONObject getDetails(String testcaseid) throws Exception {
		JSONObject finalObj = null;
		JSONArray jsonarray;
		try {
			JSONParser parser = new JSONParser();
			jsonarray = (JSONArray) parser.parse(new InputStreamReader(new FileInputStream(
					new File(System.getProperty("user.dir") + "/src/test/resources/TestData/testdata.json"))));
			for (Object jsonobj : jsonarray) {
				JSONObject myObj = (JSONObject) jsonobj;
				String id = myObj.get("id").toString();
				if (id.equalsIgnoreCase(testcaseid)) {
					finalObj = (JSONObject) myObj.get("data");
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new Exception("Unable to Find TestCase" + testcaseid);
		}
		return finalObj;
	}

	public static String getJsonData(String tcid, String keyName) throws Exception {
		try {
			return getDetails(tcid).get(keyName.toLowerCase()).toString();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(keyName + " not found");
		}
	}

	public static String getdatabasedonrowcolumn(int row, int col) throws Exception

	{
		String celldata = null;
		try {
			String FilePath = System.getProperty("user.dir") + "//src//test//resources//TestData//inputdata.xlsx";
			FileInputStream fis = new FileInputStream(FilePath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(System.getProperty("AppEnvironment"));
			DataFormatter formatter = new DataFormatter();
			Cell cellformat = sh.getRow(row).getCell(col);
			celldata = formatter.formatCellValue(cellformat);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return celldata;

	}

	public static String getdatabasedonsheet(String sheetname, int row, int col) throws Exception

	{
		Object celldata = null;
		try {
			String FilePath = System.getProperty("user.dir") + "//src//test//resources//TestData//"
					+ System.getProperty("AppEnvironment") + "_inputdata.xlsx";
			FileInputStream fis = new FileInputStream(FilePath);
			Workbook wb = WorkbookFactory.create(fis);
			FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();
			Sheet sh = wb.getSheet(sheetname);
			DataFormatter formatter = new DataFormatter();
			Cell cellformat = sh.getRow(row).getCell(col);
			CellValue cellValue = evaluator.evaluate(cellformat);
			if (cellformat.getCellType() == cellformat.CELL_TYPE_FORMULA) {
				try {
					celldata = String.valueOf(cellformat.getStringCellValue());
				} catch (Exception e) {
					celldata = String.valueOf(Math.round(cellformat.getNumericCellValue()));
				}
			} else if (cellformat.getCellType() == cellformat.CELL_TYPE_NUMERIC) {
				celldata = String.valueOf(Math.round(cellformat.getNumericCellValue()));
			} else if (cellformat.getCellType() == cellformat.CELL_TYPE_STRING) {
				celldata = String.valueOf(cellformat.getStringCellValue());
			}
			// celldata = formatter.formatCellValue(cellformat);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return celldata.toString();

	}

	public static String gethybriddata(JSONObject object, String keyName) throws Exception

	{
		String output = null;
		try {
			String key = object.get(keyName.toLowerCase()).toString();
			output = getdatabasedonsheet(key.split(",")[0], Integer.parseInt(key.split(",")[1]),
					Integer.parseInt(key.split(",")[1]));

		} catch (Exception e) {
			e.printStackTrace();

		}
		return output;
	}

	public static String takeSnapShot(String file) throws Exception {

		String fileWithPath = System.getProperty("user.dir") + "//Screenshot//" + file;
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) Threadmanager.getdriver());
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(fileWithPath);
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println(fileWithPath);
		return fileWithPath;
	}

	public static String convertscrtobase(String FilePath) throws Exception {
		String Base64StringofScreenshot = null;
		try {
			File src = new File(FilePath);
			byte[] fileContent = FileUtils.readFileToByteArray(src);
			Base64StringofScreenshot = "data:image/png;base64," + Base64.getEncoder().encodeToString(fileContent);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Base64StringofScreenshot;

	}

//	public static void main(String[] args) throws IOException {
//        String userName = "dwqa-automation@drivewealth.tech";
//        String password = "DriveWealth@1234";
//        String subjectKeyword = "code";
//        String fromEmail = "zeppelin@drivewealth.tech";
//        String bodySearchText = "code";
//        searchEmail(userName, password, subjectKeyword, fromEmail, bodySearchText);
//    }

	private static String getText(Part p) throws MessagingException, IOException {
		if (p.isMimeType("text/*")) {
			String s = (String) p.getContent();
			textIsHtml = p.isMimeType("text/html");
			return s;
		}
		if (p.isMimeType("multipart/alternative")) {
			// prefer html text over plain text
			Multipart mp = (Multipart) p.getContent();
			String text = null;
			for (int i = 0; i < mp.getCount(); i++) {
				Part bp = mp.getBodyPart(i);
				if (bp.isMimeType("text/plain")) {
					if (text == null)
						text = getText(bp);
					continue;
				} else if (bp.isMimeType("text/html")) {
					String s = getText(bp);
					if (s != null)
						return s;
				} else {
					return getText(bp);
				}
			}
			return text;
		} else if (p.isMimeType("multipart/*")) {
			Multipart mp = (Multipart) p.getContent();
			for (int i = 0; i < mp.getCount(); i++) {
				String s = getText(mp.getBodyPart(i));
				if (s != null)
					return s;
			}
		}
		return null;
	}

	public static String searchEmail(String userName, String password, String subjectKeyword, final String fromEmail,
			String bodySearchText) throws IOException {
		Properties properties = new Properties();
		boolean val = false;
		// server setting
		properties.put("mail.imap.host", "pop.gmail.com");
		properties.put("mail.imap.port", 993);
		// SSL setting
		properties.setProperty("mail.imap.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		properties.setProperty("mail.imap.socketFactory.fallback", "false");
		properties.setProperty("mail.imap.socketFactory.port", String.valueOf(993));
		Session session = Session.getDefaultInstance(properties);
		String ConfirmationCode_code = null;
		try {
			// connects to the message store
			Store store = session.getStore("imap");
			store.connect(userName, password);
			System.out.println("Connected to Email server….");
			// opens the inbox folder
			Thread.sleep(10000);
			Folder folderInbox = store.getFolder("INBOX");

			folderInbox.open(Folder.READ_ONLY);
			// create a search term for all “unseen” messages
			Flags seen = new Flags(Flags.Flag.SEEN);
			FlagTerm unseenFlagTerm = new FlagTerm(seen, true);
			// create a search term for all recent messages
			Flags recent = new Flags(Flags.Flag.RECENT);
			FlagTerm recentFlagTerm = new FlagTerm(recent, false);
			SearchTerm searchTerm = new OrTerm(unseenFlagTerm, recentFlagTerm);
			// performs search through the folder
			Message[] foundMessages = folderInbox.search(searchTerm);
			// System.out.println("Total Messages Found :" + foundMessages.length);
			Integer messageCount = folderInbox.getMessageCount();
			Integer unreadMessageCount = folderInbox.getUnreadMessageCount();
			// System.out.println("messageCount :" + messageCount);
			// System.out.println("unreadMessageCount :" +
			// folderInbox.getUnreadMessageCount());

			for (int i = foundMessages.length - 1; i >= foundMessages.length - 10; i--) {
//            for (int i = messageCount; i > (messageCount - unreadMessageCount); i--) {
				Message message = foundMessages[i];
				Address[] froms = message.getFrom();
				String email = froms == null ? null : ((InternetAddress) froms[0]).getAddress();
				if (message.getSubject() == null) {
					continue;
				}
				Date date = new Date();// Getting Present date from the system
				long diff = date.getTime() - message.getReceivedDate().getTime();// Get The difference between two dates
				long diffMinutes = diff / (60 * 1000) % 30; // Fetching the difference of minute
				// System.out.println("Difference in Minutes b/w present time & Email Recieved
				// time :" + diffMinutes);
				try {
					if (message.getSubject().contains(subjectKeyword) && email.equals(fromEmail)
							&& getText(message).contains(bodySearchText) && diffMinutes <= 3) {
						String subject = message.getSubject();

						// System.out.println("Found message #" + i + ": ");
						// System.out.println("At " + i + " :" + "Subject:" + subject);
						// System.out.println("From: " + email + " on : " + message.getReceivedDate());
						// System.out.print("getText(message)" + getText(message));

						String extract = Jsoup.parse(getText(message)).text();
						// System.out.println(extract.substring(118, 124).trim()); // To extract desired
						// character

						if (getText(message).contains(bodySearchText) == true) {
							// System.out.println("Message contains the search text " + bodySearchText);
							val = true;
							ConfirmationCode_code = extract.substring(118, 124).trim();
						} else {
							val = false;
						}
						break;
					}
				} catch (NullPointerException expected) {
					// TODO Auto-generated catch block
					expected.printStackTrace();
				}
				// System.out.println("Searching.…" + "At " + i);
			}
			// disconnect
			folderInbox.close(false);
			store.close();
		} catch (NoSuchProviderException ex) {
			System.out.println("No provider.");
			ex.printStackTrace();
		} catch (MessagingException ex) {
			System.out.println("Could not connect to the message store.");
			ex.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return ConfirmationCode_code;
	}

	public static String getSaltString() throws Exception {
		String saltStr = null;
		try {
			String SALTCHARS = "abcdefghijklmnopqrstuvwxyz1234567890";
			StringBuilder salt = new StringBuilder();
			Random rnd = new Random();
			while (salt.length() < 10) {
				int index = (int) (rnd.nextFloat() * SALTCHARS.length());
				salt.append(SALTCHARS.charAt(index));
			}
			saltStr = salt.toString();
		} catch (Exception e) {
			e.getMessage();
		}
		return saltStr;
	}

	public static String randomstringgenerator(int length) throws Exception {
		String saltStr = null;
		try {
			String SALTCHARS = "abcdefghijklmnopqrstuvwxyz";
			StringBuilder salt = new StringBuilder();
			Random rnd = new Random();
			while (salt.length() < length) {
				int index = (int) (rnd.nextFloat() * SALTCHARS.length());
				salt.append(SALTCHARS.charAt(index));
			}
			saltStr = salt.toString();
		} catch (Exception e) {
			e.getMessage();
		}
		return saltStr;
	}

	public static String randomnumbergenerator(int value) throws Exception {
		String saltStr = null;
		try {
			String SALTCHARS = "1234567899";
			StringBuilder salt = new StringBuilder();
			Random rnd = new Random();
			while (salt.length() < value) {
				int index = (int) (rnd.nextFloat() * SALTCHARS.length());
				salt.append(SALTCHARS.charAt(index));
			}
			saltStr = salt.toString();
		} catch (Exception e) {
			e.getMessage();
		}
		return saltStr;
	}

	public static String randomsymbolgenerator(int value) throws Exception {
		String saltStr = null;
		try {
			String SALTCHARS = "-!*/%->=<=><==!=&&||=#$^";
			StringBuilder salt = new StringBuilder();
			Random rnd = new Random();
			while (salt.length() < value) {
				int index = (int) (rnd.nextFloat() * SALTCHARS.length());
				salt.append(SALTCHARS.charAt(index));
			}
			saltStr = salt.toString();
		} catch (Exception e) {
			e.getMessage();
		}
		return saltStr;
	}

	public static String randommailgenerator() throws Exception {
		String saltStr = null;
		try {
			String SALTCHARS = "abcdefghijklmnopqrstuvwxyz";
			StringBuilder salt = new StringBuilder();
			Random rnd = new Random();
			while (salt.length() < 10) {
				int index = (int) (rnd.nextFloat() * SALTCHARS.length());
				salt.append(SALTCHARS.charAt(index));
			}
			saltStr = salt.toString();
		} catch (Exception e) {
			e.getMessage();
		}
		return saltStr + "@gmail.com";
	}
	
	public static String getdate()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date date = new Date();  
	    return formatter.format(date);
	}


}
