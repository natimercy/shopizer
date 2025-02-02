package com.salesmanager.shop.content.model.common;


import com.salesmanager.shop.commons.model.entity.Entity;

public class Content extends Entity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private boolean visible;
	private String contentType;
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}


}
