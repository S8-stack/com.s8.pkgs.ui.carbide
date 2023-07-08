package com.s8.web.front.carbide.title;

import com.s8.io.bohr.neon.core.NeBranch;
import com.s8.web.front.HTML_NeNode;


/**
 * 
 * @author pierreconvert
 *
 */
public class H1Title extends HTML_NeNode {
	
	public static H1Title create(NeBranch branch, String text) {
		H1Title title = new H1Title(branch);
		title.setText(text);
		return title;
	}

	
	/**
	 * 
	 * @param branch
	 */
	public H1Title(NeBranch branch) {
		super(branch, "/s8-web-front/carbide/title/H1Title");
	}
	
	
	/**
	 * 
	 * @param name
	 */
	public void setText(String text) {
		vertex.setStringUTF8Field("text", text);
	}
}