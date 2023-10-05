
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
public class SmsGateway {
    public static void main(String[] args) {
        String apiToken = "4ebd8g0d-xwtya46x-2jzneriv-znmn3g6w-cjp8xfae"; // Replace with your API token
        String sid = "TECHNONEXTLABNON"; // Replace with your SID
        String smsText = "Hello, this is a test message."; // Replace with your SMS text
        String mobileNumber = "01753155400"; // Replace with the recipient's mobile number
        String csmsId = "1"; // Replace with any number you want

        try {
            // Create the URL
            URL url = new URL("https://smsplus.sslwireless.com/api/v3/send-sms");

            // Create the connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to POST
            connection.setRequestMethod("POST");

            // Set the request headers
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("api_token", apiToken);
            connection.setRequestProperty("sid", sid);

            // Enable input and output streams
            connection.setDoOutput(true);

            // Construct the JSON payload
            String jsonPayload = String.format("{\"sms\":\"%s\",\"msisdn\":\"%s\",\"csms_id\":\"%s\"}", smsText, mobileNumber, csmsId);

            // Write the JSON payload to the output stream
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonPayload.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Get the HTTP response code
            int responseCode = connection.getResponseCode();

            // Handle the response code (e.g., check for success)
            if (responseCode == 200) {
                System.out.println("SMS sent successfully! "+connection.getResponseMessage()+" c");
            } else {
                System.out.println("Failed to send SMS. HTTP Response Code: " + responseCode);
            }

            // Close the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}