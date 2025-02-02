package com.salesmanager.shop.commons.entity.payments;

import com.salesmanager.shop.commons.entity.system.IntegrationConfiguration;
import com.salesmanager.shop.commons.entity.system.IntegrationModule;

import java.io.Serializable;

/**
 * Object to be used in store front with meta data and configuration
 * informations required to display to the end user
 * @author Carl Samson
 *
 */
public class PaymentMethod implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String paymentMethodCode;
	private PaymentType paymentType;
	private boolean defaultSelected;
	private IntegrationModule module;
	private IntegrationConfiguration informations;

	public PaymentType getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentMethodCode() {
		return paymentMethodCode;
	}
	public void setPaymentMethodCode(String paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}
	public boolean isDefaultSelected() {
		return defaultSelected;
	}
	public void setDefaultSelected(boolean defaultSelected) {
		this.defaultSelected = defaultSelected;
	}
	public IntegrationModule getModule() {
		return module;
	}
	public void setModule(IntegrationModule module) {
		this.module = module;
	}
	public IntegrationConfiguration getInformations() {
		return informations;
	}
	public void setInformations(IntegrationConfiguration informations) {
		this.informations = informations;
	}

}
