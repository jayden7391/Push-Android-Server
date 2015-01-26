package push1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;


import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;


public class c_push
{

	public static void main(String[] args)
	{
		ChPushThread chpt;
		chpt = new ChPushThread();
		chpt.start();
	}
	
}
class ChPushThread extends Thread{
	//public static String gcmURL = "https://android.googleapis.com/gcm/send";
	//static String gcmRegID2 = "APA91bHigZ23fGGuTx8paHYjSYpSS_a6FA9WVvCgBEiAS9RzR2kSknl5AwpDl3QkV3xQnrGdhZOWagyJ2w0abALdrXhqr1kB5r6kJWhPIRi69d7hdNsp8DLV5qO9Xk0kL0qzvfaZdxtB";
	//static String gcmRegID1 = "APA91bES7_EUeDpuOcKodpuR06-a-tMkugxAp2bMVbkJ-VXNbCTBMtF_ZTxzmYpH-CrHNMD6aeJ0dBFHdxv4o_KNpqf9OpuKjk1puCcn0NEZrtDeaMIM85VCmon6Pmfd1v6cTBjTUIP4";
	//static String gcmRegID = "APA91bEPPGWxXCLzmF8iPaDgEj-HpADIWI6bGX6dXc6-dRLQl5afLbifIoKmHmAtv84Guob97SCwVcKgIblM5j3YWXJIy9s-ZC_PI1tyxTzGGnUrfvkiZGaj_3bYiwe2NBNiDjQVF9id";
	//public String gcmAuthToken = "AIzaSyCcIjkiacAGpsnOTl76A7wY3KRUiyobAIw";
	
	public void run(){
		while(true){
			String inputstr;
			String strarr[] = new String[5];
			String device = null, videoname = "응답하라1994", timerange = "00:00:10-00:02:20", title = "너에게", artist = "성시경", albumtitle = "응답하라1994 OST Part 2";
			String youtubeURL = "https://www.youtube.com/watch?v=_kr3bOs5s8U";
			String subtitles = "<SAMI>\n<HEAD>\n<TITLE>성시경_너에게.smi</TITLE>\n<STYLE TYPE=\"text/css\">\n<!--\nP { margin-left:8pt; margin-right:8pt; margin-bottom:2pt;\n    margin-top:2pt; font-size:20pt; text-align:center;\n    font-family:arial, sans-serif; font-weight:normal; color:white; }\n.KRCC { Name:Korean; lang:ko-KR; SAMIType:CC; }\n-->\n</STYLE>\n</HEAD>\n<BODY>\n<SYNC Start=0> \n<SYNC Start=23000><P Class=KRCC>너를 만난 후 언젠가부터 \n<SYNC Start=30000><P Class=KRCC>나의 마음속엔 근심이 생겼지\n<SYNC Start=36000><P Class=KRCC>네가 좋아진 그 다음부터 \n<SYNC Start=42000><P Class=KRCC>널 생각하면 깊은 한숨뿐만\n<SYNC Start=50000><P Class=KRCC>사랑스런 너의 눈을 보면 \n<SYNC Start=53000><P Class=KRCC>내 맘은 편안해지고 네 손을 잡고 있을 때면\n<SYNC Start=60000><P Class=KRCC>'난 이런 꿈을 꾸기도 했어' \n<SYNC Start=63000><P Class=KRCC>나의 뺨에 네가 키스할 땐 온 세상이 내 것 같아\n<SYNC Start=69000><P Class=KRCC>이대로 너를 안고 싶어 하지만 세상에는\n<SYNC Start=76000><P Class=KRCC>아직도 너무 많은 일이 네 앞에 버티고 있잖아 \n<SYNC Start=81000><P Class=KRCC>생각해 봐 어려운 일 뿐이지 \n<SYNC Start=89000><P Class=KRCC>네가 접하게 되는 새로운 생활들과\n<SYNC Start=91000><P Class=KRCC>모두가 너에게 시선을 돌리게 되는 걸 알 수 있니 \n<SYNC Start=98000><P Class=KRCC>너는 이런 내 마음을 아는지\n<SYNC Start=102000><P Class=KRCC>조그마한 너의 마음 다치게 하긴 싫어 \n<SYNC Start=110000><P Class=KRCC>이러는 것 뿐이지\n<SYNC Start=113000><P Class=KRCC>어른들은 항상 내게 말하지 \n<SYNC Start=120000><P Class=KRCC>넌 아직도 모르고 있는 일이 더 많다고\n<SYNC Start=128000><P Class=KRCC> \n<SYNC Start=134000><P Class=KRCC>네 순수한 마음 난 변치 않길 바래\n</BODY>\n</SAMI>";
			
			try{
				
				device = "APA91bG0PonETY-lxPD6eMe0lHJxl8-0fp9tY7aEcoOg3kqJHZnoeXccUtI38sgzZLAXN9SzkA1d5cLAXraUdmr91S9lyuoeiqo5r9iWZLvvA2c0s8PbSNVLGU3UAnoGyfp2CnhOAG3qkP17EsSUfkcOR_X5xxXaDA";
				//device = "APA91bGgA16D-AUeDyxqTOasEVPhgylT_UwjgFJJLDnGVARj19GbOVR98wgpJjg-rQ93YmYmin_WXh-rH3W-GiKEPhZo0b8F6x1v-_wZKzd6ZLLf4YFcNUampYPXXq0JGhPA1Bj5Xtvd";
				String msg;
				msg = videoname + "\n" + timerange + "\n" + title + "\n" + artist + "\n" + albumtitle + "\n" + 
						youtubeURL + "\n" + subtitles;
				
				sender(device, "AIzaSyA0JeIGNDbJFX9zvBoahp-l5x-4LKR0ywI", msg);
				

				
			}catch(Exception e){
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void sender(String regId, String authToken, String msg) throws Exception { 

		StringBuffer postDataBuilder = new StringBuffer();
		postDataBuilder.append("registration_id=" + regId); // µÓ∑œID 
		postDataBuilder.append("&collapse_key=1"); 
		postDataBuilder.append("&delay_while_idle=1"); 
        postDataBuilder.append("&data.msg=" + URLEncoder.encode(msg, "UTF-8"));

        byte[] postData = postDataBuilder.toString().getBytes("UTF-8");
        URL url = new URL("https://android.googleapis.com/gcm/send");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        HttpsURLConnection.setDefaultHostnameVerifier(new FakeHostnameVerifier());
        conn.setDoOutput(true); 
        conn.setUseCaches(false); 
        conn.setRequestMethod("POST"); 
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        conn.setRequestProperty("Content-Length", Integer.toString(postData.length));
        conn.setRequestProperty("Authorization", "key=" + "AIzaSyA0JeIGNDbJFX9zvBoahp-l5x-4LKR0ywI");

        OutputStream out = conn.getOutputStream(); 
        out.write(postData); 
        out.close();
        conn.getInputStream();

        System.out.println("postData : " + postDataBuilder.toString());
        String reponseLine = new BufferedReader(new InputStreamReader(conn.getInputStream())).readLine();

        System.out.println("responseLine : " + reponseLine);
	}
	
	private static class FakeHostnameVerifier implements HostnameVerifier {

		public boolean verify(String hostname, SSLSession session) {
	        return true;
		}
	}
}