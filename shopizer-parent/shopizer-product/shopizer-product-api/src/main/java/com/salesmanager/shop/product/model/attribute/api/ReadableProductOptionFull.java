package com.salesmanager.shop.product.model.attribute.api;

import com.salesmanager.shop.product.model.attribute.ProductOptionDescription;

import java.util.ArrayList;
import java.util.List;

public class ReadableProductOptionFull extends ReadableProductOptionEntity {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private List<ProductOptionDescription> descriptions = new ArrayList<ProductOptionDescription>();

    public List<ProductOptionDescription> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<ProductOptionDescription> descriptions) {
        this.descriptions = descriptions;
    }

}
