package com.s8.pkgs.ui.carbide.boxes.b2;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.pkgs.ui.carbide.CarbideWebSources;
import com.s8.pkgs.ui.carbide.HTML_S8WebNode;


/**
 * 
 * @author pierreconvert
 *
 */
public class B2Box extends HTML_S8WebNode {
	
	
	public final static String ROOT_WEBPATH = CarbideWebSources.ROOT_WEBPATH + "/boxes/b2";
	
	public final static String JS_TYPENAME = "/B2Box";
	
	

	
	/**
	 * 
	 * @param front
	 */
	
	public B2Box(S8WebFront front) {
		super(front, ROOT_WEBPATH + JS_TYPENAME);
	}

	
	/**
	 * 
	 * @param items
	 */
	public void setElements(S8WebObject... elements) {
		vertex.outbound().setObjectListField("elements", elements);
	}
	
}
