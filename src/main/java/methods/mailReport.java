package methods;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class mailReport {
	
	
	public static void sendMailForTestCaseResult(String outputTestCasePath, int passCount, int failCount)
			throws IOException {
		try {
			Date date = new Date();
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			String currentTime = dateFormat.format(date);

			final String fromEmail = "sivaramakrishnan.p@ionixxtech.com"; // requires
																			// valid
																			// gmail
																			// id
			final String password = "Sivaraki@123"; // correct password for
													// gmail id

			final String toEmail = "sivaramakrishnan.p@ionixxtech.com";

			System.out.println("Sending Email Started ............");
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP Host
			props.put("mail.smtp.port", "587"); // TLS Port
			props.put("mail.smtp.auth", "true"); // enable authentication
			props.put("mail.smtp.starttls.enable", "true"); // enable STARTTLS

			// create Authenticator object to pass in Session.getInstance
			// argument
			Authenticator auth = new Authenticator() {
				// override the getPasswordAuthentication method
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(fromEmail, password);
				}
			};
			Session session = Session.getInstance(props, auth);

			MimeMessage msg = new MimeMessage(session);
			// set message headers
			msg.addHeader("Content-type", "text/html; charset=UTF-8");
			msg.addHeader("format", "flowed");
			msg.addHeader("Content-Transfer-Encoding", "8bit");

			msg.setFrom(new InternetAddress("sivaramakrishnan.p@ionixxtech.com", "Automation Result"));

			msg.setReplyTo(InternetAddress.parse("testautomation.result1@gmail.com", false));

			msg.setSubject("Automation Execution Result - " + currentTime, "UTF-8");
			// msg.setSubject("Automation execution result -
			// "+testCaseIdentifier, "UTF-8");
			String body = "<html><body>" + "<h4>Automation execution result short summary listed below:</h4>"
					+ "<table border='0' style='border-collapse:collapse'><tbody>"
					+ "<tr><td style='border:1px solid rgb(0,0,0)'> <i>Total Testcase Count :</i> </td>"
					+ "<td width='50' style='border:1px solid rgb(0,0,0);font-weight:bold;text-align:center'>"
					+ (passCount + failCount) + "</td></tr>"
					+ "<tr><td style='border:1px solid rgb(0,0,0)'><i>Total Passed Testcase Count : </i> </td>"
					+ "<td width='50' style='border:1px solid rgb(0,0,0);font-weight:bold;text-align:center'>"
					+ passCount + "</td></tr>"
					+ "<tr><td style='border:1px solid rgb(0,0,0)'><i>Total Failed Testcase Count :</i> </td>"
					+ "<td width='5' style='border:1px solid rgb(0,0,0);font-weight:bold;text-align:center;background-color:rgb(255,0,0)'>"
					+ failCount + "</td></tr>" + "</tbody></table>" + "&nbsp;"
					+ "<h4>Download html file and double click on it to view the test report in detail.</h4>"
					+ "<h4>Automation Test results attached on e-mail. </h4>" + "Thanks <br>" + "&nbsp;"
					+ "<i>Ionixx Technologies</i>" + "</body></html>";

			msg.setText(body, "UTF-8");

			msg.setSentDate(new Date());
			msg.setContent(body, "text/HTML");

			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));

			// Create the message body part
			BodyPart messageBodyPart = new MimeBodyPart();

			// Fill the message
			messageBodyPart.setText(body);

			messageBodyPart.setHeader("Content-type", "text/html; charset=UTF-8");
			// Create a multipart message for attachment
			Multipart multipart = new MimeMultipart();

			// Set text message part
			multipart.addBodyPart(messageBodyPart);

			File directory = new File(outputTestCasePath);
			File[] fileList = directory.listFiles();

			for (int fileCount = 0; fileCount < fileList.length; fileCount++) {

				// Second part is attachment
				messageBodyPart = new MimeBodyPart();

				String filename = fileList[fileCount].getName();
				DataSource source = new FileDataSource(directory + File.separator + filename);
				messageBodyPart.setDataHandler(new DataHandler(source));

				messageBodyPart.setFileName(filename);
				multipart.addBodyPart(messageBodyPart, fileCount);
			}

			// Send the complete message parts
			msg.setContent(multipart);

			// Send message
			Transport.send(msg);
			System.out.println("EMail Sent Successfully ............");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
