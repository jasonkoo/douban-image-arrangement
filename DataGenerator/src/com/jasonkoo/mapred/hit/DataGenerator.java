package com.jasonkoo.mapred.hit;

import java.util.Date;

public class DataGenerator {
	
	public static HitDataEntry getHitDataEntry() {
		HitDataEntry de = new HitDataEntry();
		Date now = new Date();
		long nowl = now.getTime();
		String timeStr = Long.toString(nowl);

		de.setDate(now);
		de.setAdId("adId_" + timeStr);
		de.setPid("pid_" + timeStr);
		de.setResult(nowl % 5 + "");		
		
		de.setHitTime(now);

		de.setAccessNum(nowl);
		de.setApn("apn_" + timeStr);
		de.setCellId("cellId_" + timeStr);
		de.setChannelName("channelName_" + timeStr);
		de.setChargeStatus("chargeStatus_" + timeStr);
		de.setCityName("cityName_" + timeStr);
		de.setCountryCode("countryCode_" + timeStr);
		de.setCreateDate(now);
		de.setCustVersion("custVersion_" + timeStr);
		de.setDeviceIMSI("deviceIMSI_" + timeStr);
		de.setDeviceModel("deviceModel_" + timeStr);
		de.setDeviceId("deviceId_" + timeStr);
		de.setDeviceIdType("deviceIdType_" + timeStr);
		de.setIp("ip_" + timeStr);
		de.setLatitude("latitude_" + timeStr);
		de.setLocId("locId_" + timeStr);
		de.setLongitude("longitude_" + timeStr);
		de.setModifyDate(now);
		de.setNetaccessType("netaccessType_" + timeStr);
		de.setOperationType("operationType_" + timeStr);
		de.setOperatorCode("operatorCode_" + timeStr);
		de.setOsVersion("osVersion_" + timeStr);
		de.setPePkgName("pePkgName_" + timeStr);
		de.setPeVerCode("peVerCode_" + timeStr);
		de.setPeVersion("peVersion_" + timeStr);
		de.setPePollVersion("pePollVersion_" + timeStr);
		de.setSysId("sysId_" + timeStr);
		
		de.setArrivalTime(now);
		return de;
	}

	public static UserDataEntry getUserDataEntry() {
		UserDataEntry de = new UserDataEntry();
		Date now = new Date();
		long nowl = now.getTime();
		String timeStr = Long.toString(nowl);

		de.setPid("pid_" + timeStr);
		de.setAccessNum(nowl);
		de.setApn("apn_" + timeStr);
		de.setCellId("cellId_" + timeStr);
		de.setChannelName("channelName_" + timeStr);
		de.setChargeStatus("chargeStatus_" + timeStr);
		de.setCityName("cityName_" + timeStr);
		de.setCountryCode("countryCode_" + timeStr);
		de.setCreateDate(now);
		de.setCustVersion("custVersion_" + timeStr);
		de.setDeviceIMSI("deviceIMSI_" + timeStr);
		de.setDeviceModel("deviceModel_" + timeStr);
		de.setDeviceId("deviceId_" + timeStr);
		de.setDeviceIdType("deviceIdType_" + timeStr);
		de.setIp("ip_" + timeStr);
		de.setLatitude("latitude_" + timeStr);
		de.setLocId("locId_" + timeStr);
		de.setLongitude("longitude_" + timeStr);
		de.setModifyDate(now);
		de.setNetaccessType("netaccessType_" + timeStr);
		de.setOperationType("operationType_" + timeStr);
		de.setOperatorCode("operatorCode_" + timeStr);
		de.setOsVersion("osVersion_" + timeStr);
		de.setPePkgName("pePkgName_" + timeStr);
		de.setPeVerCode("peVerCode_" + timeStr);
		de.setPeVersion("peVersion_" + timeStr);
		de.setPePollVersion("pePollVersion_" + timeStr);
		de.setSysId("sysId_" + timeStr);

		de.setArrivalTime(now);
		return de;
	}
	
	

}
