package com.jasonkoo.feedback;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Feedback {
	
	 
	 private String tblname;
	 private String logTime;
	 private String pid;
	 private String bizType;
	 private String eventName; // (必须，事件名称:   可能包含这些值：click|display|install|engineUpgrade|clike2end|display2end ... )
	 private String feedbackId; //  (必须，反馈Id)
	 private boolean success; // (必须，是否成功:   true|false)
	 private String sid; // (必须, 产生该事件的SID)
	 private String errCode; // (当 success=false时， 必须提供errCode)
	 private String packName; // (可选，当eventName为install|engineUpgrade时，表示事件相关的包名)
	 private String currVer; // (可选，当eventName为install|engineUpgrade时，表示事件相关的安装前版本号，如果是初次安装，则该属性为空)
	 private String targetVer; //  (可选，当eventName为install|engineUpgrade时，表示事件相关的当前版本号)
	 private String value;
	 
	 
	 public Feedback() {
		 String[] tblnames = {"feedback", "pt", "fbtask"};
		 SimpleDateFormat dt = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		 Date now = new Date();
		 long curms = System.currentTimeMillis();
		 this.tblname = tblnames[(int)(curms%3)]; 
		 this.logTime = dt.format(now);
		 this.pid = "pid-" + curms;
		 this.bizType = "bizType-" + curms;
		 this.eventName = "eventName-" + curms;
		 this.feedbackId = "feedbackId-" + curms;
		 this.success = curms%2 == 1 ? true : false;
		 this.sid = "sid-" + curms;
		 this.errCode = "errCode-" + curms;
		 this.packName = "packName-" + curms;
		 this.currVer = "currVer-" + curms;
		 this.targetVer = "targetVer-" + curms;
		 this.value = "value-" + curms;
	}
	 
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.tblname);
		sb.append("\001");	
		sb.append(this.logTime);
		sb.append("\001");
		sb.append(this.pid);
		sb.append("\001");
		sb.append(this.bizType);
		sb.append("\001");
		sb.append(this.eventName);
		sb.append("\001");
		sb.append(this.feedbackId);
		sb.append("\001");
		sb.append(this.success);
		sb.append("\001");
		sb.append(this.sid);
		sb.append("\001");
		sb.append(this.errCode);
		sb.append("\001");
		sb.append(this.packName);
		sb.append("\001");
		sb.append(this.currVer);
		sb.append("\001");
		sb.append(this.targetVer);
		sb.append("\001");
		sb.append(this.value);
		
	
		return sb.toString();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		for (int i=0; i < 100; i++) {
			Feedback fb = new Feedback();
			System.out.println(fb);
			Thread.sleep(1000);
		}
		

	}

}
