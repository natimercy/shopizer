package com.salesmanager.shop.user.reposistory;

import com.salesmanager.shop.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {

	@Query("select distinct u from User as u left join fetch u.groups ug left join fetch ug.permissions ugp join fetch u.merchantStore um left join fetch u.defaultLanguage ul where u.adminName = ?1")
	User findByUserName(String userName);
	
	@Query("select distinct u from User as u left join fetch u.groups ug join fetch u.merchantStore um left join fetch u.defaultLanguage ul where u.id = ?1 and um.code = ?2")
	User findByUserId(Long userId, String storeCode);
	
	@Query("select distinct u from User as u left join fetch u.groups ug join fetch u.merchantStore um left join fetch u.defaultLanguage ul where u.adminName= ?1 and um.code = ?2")
	User findByUserName(String userName, String storeCode);

	@Query("select distinct u from User as u left join fetch u.groups ug join fetch u.merchantStore um left join fetch u.defaultLanguage ul where u.id = ?1")
	User findOne(Long id);
	
	@Query("select distinct u from User as u left join fetch u.groups ug join fetch u.merchantStore um left join fetch u.defaultLanguage ul order by u.id")
	List<User> findAll();
	
	@Query("select distinct u from User as u left join fetch u.groups ug join fetch u.merchantStore um left join fetch u.defaultLanguage ul where um.id = ?1 order by u.id")
	List<User> findByStore(Integer storeId);
	
	@Query("select distinct u from User as u left join fetch u.groups ug join fetch u.merchantStore um left join fetch u.defaultLanguage ul where u.id= ?1 and um.code = ?2")
	User findByUserAndStore(Long userId, String storeCode);

	@Query("select distinct u from User as u "
			+ "left join fetch u.groups ug "
			+ "join fetch u.merchantStore um "
			+ "left join fetch u.defaultLanguage ul "
			+ "where u.credentialsResetRequest.credentialsRequest = ?1 and um.code = ?2 ")
	User findByResetPasswordToken(String token, String store);
}