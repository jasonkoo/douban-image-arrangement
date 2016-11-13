package com.jasonkoo.bootstrap.grid.digit;

import java.util.List;

import com.jasonkoo.bootstrap.grid.file.DirectoryReader;
import com.jasonkoo.bootstrap.grid.param.ParamSmall;

public class DigitToHTML {
	
	private int colMax = 5;
	private int rowMax = 9;
	
	private List<String> fileNames;
	private int index;
	
	private String imgDir;
	
	public DigitToHTML(String baseDir, String imgDir) {
		this.imgDir = imgDir;
		DirectoryReader dr = new DirectoryReader(baseDir + imgDir);
		this.fileNames = dr.list();
		this.index = 0;
	}
	
	public String transform(int digit) {
		if (digit < 0 || digit > 9)  return null;
		
		int digitCode[][] = ParamSmall.DigitsCode.get(digit);
		String html = "";
		html += "<div class=\"col-md-7\">\n";
		for (int row = 0; row < rowMax; row++) {
			html += "\t<div class=\"row\">\n";
			for (int col = 0; col < colMax; col++) {
				int code = digitCode[row][col];
				if (code == 1) {
					String imgElement = "<img src=\"" + imgDir + "/" + fileNames.get(index++) + "\">";
					html += "\t\t<div class=\"col-md-4\">" + imgElement + "</div>\n";
				} else {
					html += "\t\t<div class=\"col-md-4\"></div>\n";
				}
			}
			html += "\t</div>\n";
		}
		html += "</div>\n";
		
		return html;
	}
	
	public int getIndex() {
		return index;
	}
}
