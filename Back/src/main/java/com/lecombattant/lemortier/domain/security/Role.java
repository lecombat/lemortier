/**
 * 
 */
package com.lecombattant.lemortier.domain.security;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Lecombattant
 *
 */
@Entity
public class Role {
   
   @Id
   private Long roleId;

   private String name;

   @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   private Set<UserRole> userRoles = new HashSet<>();

   public Role() {
   }
   
   public Role(String pName) {
	   this.name = pName;
   }

   public Long getRoleId() {
       return roleId;
   }

   public void setRoleId(Long roleId) {
       this.roleId = roleId;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public Set<UserRole> getUserRoles() {
       return userRoles;
   }

   public void setUserRoles(Set<UserRole> userRoles) {
       this.userRoles = userRoles;
   }
}
