package com.salesmanager.shop.content.model;


@Deprecated
public class ReadableContentEntity extends ContentEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ContentDescriptionEntity description = null;
	public ContentDescriptionEntity getDescription() {
		return description;
	}
	public void setDescription(ContentDescriptionEntity description) {
		this.description = description;
	}

}
