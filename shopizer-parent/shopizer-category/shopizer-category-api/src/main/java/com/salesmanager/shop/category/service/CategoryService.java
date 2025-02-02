package com.salesmanager.shop.category.service;


import com.salesmanager.shop.category.entity.Category;
import com.salesmanager.shop.category.entity.CategoryDescription;
import com.salesmanager.shop.commons.entity.merchant.MerchantStore;
import com.salesmanager.shop.commons.entity.reference.language.Language;
import com.salesmanager.shop.commons.exception.ServiceException;
import com.salesmanager.shop.commons.service.generic.SalesManagerEntityService;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService extends SalesManagerEntityService<Long, Category> {

    List<Category> getListByLineage(MerchantStore store, String lineage) throws ServiceException;

    List<Category> listBySeUrl(MerchantStore store, String seUrl) throws ServiceException;

    CategoryDescription getDescription(Category category, Language language) throws ServiceException;

    void addCategoryDescription(Category category, CategoryDescription description) throws ServiceException;

    void addChild(Category parent, Category child) throws ServiceException;

    List<Category> listByParent(Category category) throws ServiceException;

    List<Category> listByStoreAndParent(MerchantStore store, Category category) throws ServiceException;


    List<Category> getByName(MerchantStore store, String name, Language language) throws ServiceException;

    List<Category> listByStore(MerchantStore store) throws ServiceException;

    Category getByCode(MerchantStore store, String code)
            throws ServiceException;

    List<Category> listByStore(MerchantStore store, Language language)
            throws ServiceException;

    void saveOrUpdate(Category category) throws ServiceException;

    List<Category> getListByDepth(MerchantStore store, int depth);

    Category getById(Long id, int merchantId);

    Category getById(Long categoryid, int merchantId, int language);

    Page<Category> getListByDepth(MerchantStore store, Language language, String name, int depth, int page, int count);

    /**
     * Get root categories by store for a given language
     *
     * @param store
     * @param depth
     * @param language
     * @return
     */
    List<Category> getListByDepth(MerchantStore store, int depth, Language language);

    /**
     * Returns category hierarchy filter by featured
     *
     * @param store
     * @param depth
     * @param language
     * @return
     */
    List<Category> getListByDepthFilterByFeatured(MerchantStore store, int depth, Language language);

    List<Category> getListByLineage(String storeCode, String lineage)
            throws ServiceException;

    Category getByCode(String storeCode, String code) throws ServiceException;

    Category getById(MerchantStore store, Long id) throws ServiceException;

    Category getBySeUrl(MerchantStore store, String seUrl, Language language);

    List<Category> listByParent(Category category, Language language);

    Category getOneByLanguage(long categoryId, Language language);

    /**
     * Returns a list by category containing the category code and the number of products
     * 1->obj[0] = 1
     * obj[1] = 150
     * 2->obj[0] = 2
     * obj[1] = 35
     * ...
     *
     * @param store
     * @param categoryIds
     * @return
     * @throws ServiceException
     */
    List<Object[]> countProductsByCategories(MerchantStore store,
                                             List<Long> categoryIds) throws ServiceException;

    List<Category> getByProductId(Long productId, MerchantStore store);

    /**
     * Returns a list of Category by category code for a given language
     *
     * @param store
     * @param codes
     * @param language
     * @return
     */
    List<Category> listByCodes(MerchantStore store, List<String> codes,
                               Language language);

    /**
     * List of Category by id
     *
     * @param store
     * @param ids
     * @param language
     * @return
     */
    List<Category> listByIds(MerchantStore store, List<Long> ids,
                             Language language);


    /**
     * Returns Category with childs and descriptions
     *
     * @param category
     * @return
     */
    Category findById(Long category);

    int count(MerchantStore store);


}
