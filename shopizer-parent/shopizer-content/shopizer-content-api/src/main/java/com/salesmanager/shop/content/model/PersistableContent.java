package com.salesmanager.shop.content.model;


import com.salesmanager.shop.commons.model.entity.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PersistableContent extends Entity implements Serializable {
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private String code;
  private boolean isDisplayedInMenu;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
  
  public List<ObjectContent> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<ObjectContent> descriptions) {
    this.descriptions = descriptions;
  }

  public boolean isDisplayedInMenu() {
    return isDisplayedInMenu;
  }

  public void setDisplayedInMenu(boolean isDisplayedInMenu) {
    this.isDisplayedInMenu = isDisplayedInMenu;
  }

  private List<ObjectContent> descriptions = new ArrayList<ObjectContent>();

}
