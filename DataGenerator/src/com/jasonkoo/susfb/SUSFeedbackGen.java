package com.jasonkoo.susfb;

import java.util.Date;

public class SUSFeedbackGen {

	public static void main(String[] args) {	
		
		StringBuffer susfb1 = new StringBuffer();
		susfb1.append("A1000038A6D8606" + "\001");
		susfb1.append("packageId" + getNowString() + "\001");
		susfb1.append("cVerName" + getNowString() + "\001");
		susfb1.append("cVerCode" + getNowString() + "\001");
		susfb1.append("tVerName" + getNowString() + "\001");
		susfb1.append("1.0.0" + "\001");
		susfb1.append("channel_key_1" + "\001");
		susfb1.append("notify_show" + "\001");
		susfb1.append("error_code_0");
		System.out.println(susfb1.toString());
		
		
		StringBuffer susfb2 = new StringBuffer();
		susfb2.append("862298026100674" + "\001");
		susfb2.append("packageId" + getNowString() + "\001");
		susfb2.append("cVerName" + getNowString() + "\001");
		susfb2.append("cVerCode" + getNowString() + "\001");
		susfb2.append("tVerName" + getNowString() + "\001");
		susfb2.append("1.0.0" + "\001");
		susfb2.append("channel_key_1" + "\001");
		susfb2.append("notify_show" + "\001");
		susfb2.append("error_code_0");
		System.out.println(susfb2.toString());
		
		
		StringBuffer susfb3 = new StringBuffer();
		susfb3.append("A1000038CE059F5" + "\001");
		susfb3.append("packageId" + getNowString() + "\001");
		susfb3.append("cVerName" + getNowString() + "\001");
		susfb3.append("cVerCode" + getNowString() + "\001");
		susfb3.append("tVerName" + getNowString() + "\001");
		susfb3.append("1.0.0" + "\001");
		susfb3.append("channel_key_1" + "\001");
		susfb3.append("install_alert_show" + "\001");
		susfb3.append("error_code_0");
		System.out.println(susfb3.toString());
		
		
		StringBuffer susfb4 = new StringBuffer();
		susfb4.append("A1000038CE059F5" + "\001");
		susfb4.append("packageId" + getNowString() + "\001");
		susfb4.append("cVerName" + getNowString() + "\001");
		susfb4.append("cVerCode" + getNowString() + "\001");
		susfb4.append("tVerName" + getNowString() + "\001");
		susfb4.append("1.0.0" + "\001");
		susfb4.append("channel_key_1" + "\001");
		susfb4.append("install_alert_show" + "\001");
		susfb4.append("error_code_0");
		System.out.println(susfb4.toString());
	}
	
	public static Long getNowString() {
		Date date = new Date();
		return date.getTime();
	}

}
