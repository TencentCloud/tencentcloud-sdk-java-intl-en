/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Console extends AbstractModel {

    /**
    * <p>DataSight Console Id</p>
    */
    @SerializedName("ConsoleId")
    @Expose
    private String ConsoleId;

    /**
    * <p>Access method: public - internet, internal - intranet</p>
    */
    @SerializedName("AccessMode")
    @Expose
    private String [] AccessMode;

    /**
    * <p>Log-in methods: 0-account password authentication, 1-anonymous login, 2-third-party authentication login</p>
    */
    @SerializedName("LoginMode")
    @Expose
    private Long LoginMode;

    /**
    * <p>Custom domain name prefix</p>
    */
    @SerializedName("DomainPrefix")
    @Expose
    private String DomainPrefix;

    /**
    * <p>User account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Accounts")
    @Expose
    private ConsoleAccount [] Accounts;

    /**
    * <p>Private network type, defaults to 0</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IntranetType")
    @Expose
    private Long IntranetType;

    /**
    * <p>Private network region</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IntranetRegion")
    @Expose
    private String IntranetRegion;

    /**
    * <p>Private network VpcId</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Private subnet SubnetId</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Anonymous login account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AnonymousLogin")
    @Expose
    private AnonymousLoginInfo AnonymousLogin;

    /**
    * <p>auth user role information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthRoles")
    @Expose
    private AuthRoleInfo [] AuthRoles;

    /**
    * <p>Bound tag information</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Custom hidden parameter</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HideParams")
    @Expose
    private String [] HideParams;

    /**
    * <p>Access Control Rule</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessControlRules")
    @Expose
    private AccessControlRule [] AccessControlRules;

    /**
    * <p>Remark</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
    * <p>Customize menu</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Menus")
    @Expose
    private String [] Menus;

    /**
    * <p>Public access domain name</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>private network access domain</p>
    */
    @SerializedName("IntranetDomain")
    @Expose
    private String IntranetDomain;

    /**
     * Get <p>DataSight Console Id</p> 
     * @return ConsoleId <p>DataSight Console Id</p>
     */
    public String getConsoleId() {
        return this.ConsoleId;
    }

    /**
     * Set <p>DataSight Console Id</p>
     * @param ConsoleId <p>DataSight Console Id</p>
     */
    public void setConsoleId(String ConsoleId) {
        this.ConsoleId = ConsoleId;
    }

    /**
     * Get <p>Access method: public - internet, internal - intranet</p> 
     * @return AccessMode <p>Access method: public - internet, internal - intranet</p>
     */
    public String [] getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>Access method: public - internet, internal - intranet</p>
     * @param AccessMode <p>Access method: public - internet, internal - intranet</p>
     */
    public void setAccessMode(String [] AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get <p>Log-in methods: 0-account password authentication, 1-anonymous login, 2-third-party authentication login</p> 
     * @return LoginMode <p>Log-in methods: 0-account password authentication, 1-anonymous login, 2-third-party authentication login</p>
     */
    public Long getLoginMode() {
        return this.LoginMode;
    }

    /**
     * Set <p>Log-in methods: 0-account password authentication, 1-anonymous login, 2-third-party authentication login</p>
     * @param LoginMode <p>Log-in methods: 0-account password authentication, 1-anonymous login, 2-third-party authentication login</p>
     */
    public void setLoginMode(Long LoginMode) {
        this.LoginMode = LoginMode;
    }

    /**
     * Get <p>Custom domain name prefix</p> 
     * @return DomainPrefix <p>Custom domain name prefix</p>
     */
    public String getDomainPrefix() {
        return this.DomainPrefix;
    }

    /**
     * Set <p>Custom domain name prefix</p>
     * @param DomainPrefix <p>Custom domain name prefix</p>
     */
    public void setDomainPrefix(String DomainPrefix) {
        this.DomainPrefix = DomainPrefix;
    }

    /**
     * Get <p>User account information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Accounts <p>User account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ConsoleAccount [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set <p>User account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Accounts <p>User account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccounts(ConsoleAccount [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get <p>Private network type, defaults to 0</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IntranetType <p>Private network type, defaults to 0</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIntranetType() {
        return this.IntranetType;
    }

    /**
     * Set <p>Private network type, defaults to 0</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IntranetType <p>Private network type, defaults to 0</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIntranetType(Long IntranetType) {
        this.IntranetType = IntranetType;
    }

    /**
     * Get <p>Private network region</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IntranetRegion <p>Private network region</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIntranetRegion() {
        return this.IntranetRegion;
    }

    /**
     * Set <p>Private network region</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IntranetRegion <p>Private network region</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIntranetRegion(String IntranetRegion) {
        this.IntranetRegion = IntranetRegion;
    }

    /**
     * Get <p>Private network VpcId</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId <p>Private network VpcId</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>Private network VpcId</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId <p>Private network VpcId</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Private subnet SubnetId</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId <p>Private subnet SubnetId</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Private subnet SubnetId</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId <p>Private subnet SubnetId</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Anonymous login account information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AnonymousLogin <p>Anonymous login account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AnonymousLoginInfo getAnonymousLogin() {
        return this.AnonymousLogin;
    }

    /**
     * Set <p>Anonymous login account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AnonymousLogin <p>Anonymous login account information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAnonymousLogin(AnonymousLoginInfo AnonymousLogin) {
        this.AnonymousLogin = AnonymousLogin;
    }

    /**
     * Get <p>auth user role information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AuthRoles <p>auth user role information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AuthRoleInfo [] getAuthRoles() {
        return this.AuthRoles;
    }

    /**
     * Set <p>auth user role information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AuthRoles <p>auth user role information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthRoles(AuthRoleInfo [] AuthRoles) {
        this.AuthRoles = AuthRoles;
    }

    /**
     * Get <p>Bound tag information</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags <p>Bound tag information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Bound tag information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags <p>Bound tag information</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Custom hidden parameter</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HideParams <p>Custom hidden parameter</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getHideParams() {
        return this.HideParams;
    }

    /**
     * Set <p>Custom hidden parameter</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HideParams <p>Custom hidden parameter</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHideParams(String [] HideParams) {
        this.HideParams = HideParams;
    }

    /**
     * Get <p>Access Control Rule</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessControlRules <p>Access Control Rule</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AccessControlRule [] getAccessControlRules() {
        return this.AccessControlRules;
    }

    /**
     * Set <p>Access Control Rule</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessControlRules <p>Access Control Rule</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessControlRules(AccessControlRule [] AccessControlRules) {
        this.AccessControlRules = AccessControlRules;
    }

    /**
     * Get <p>Remark</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remarks <p>Remark</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * Set <p>Remark</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remarks <p>Remark</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    /**
     * Get <p>Customize menu</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Menus <p>Customize menu</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getMenus() {
        return this.Menus;
    }

    /**
     * Set <p>Customize menu</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Menus <p>Customize menu</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMenus(String [] Menus) {
        this.Menus = Menus;
    }

    /**
     * Get <p>Public access domain name</p> 
     * @return Domain <p>Public access domain name</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Public access domain name</p>
     * @param Domain <p>Public access domain name</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>private network access domain</p> 
     * @return IntranetDomain <p>private network access domain</p>
     */
    public String getIntranetDomain() {
        return this.IntranetDomain;
    }

    /**
     * Set <p>private network access domain</p>
     * @param IntranetDomain <p>private network access domain</p>
     */
    public void setIntranetDomain(String IntranetDomain) {
        this.IntranetDomain = IntranetDomain;
    }

    public Console() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Console(Console source) {
        if (source.ConsoleId != null) {
            this.ConsoleId = new String(source.ConsoleId);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String[source.AccessMode.length];
            for (int i = 0; i < source.AccessMode.length; i++) {
                this.AccessMode[i] = new String(source.AccessMode[i]);
            }
        }
        if (source.LoginMode != null) {
            this.LoginMode = new Long(source.LoginMode);
        }
        if (source.DomainPrefix != null) {
            this.DomainPrefix = new String(source.DomainPrefix);
        }
        if (source.Accounts != null) {
            this.Accounts = new ConsoleAccount[source.Accounts.length];
            for (int i = 0; i < source.Accounts.length; i++) {
                this.Accounts[i] = new ConsoleAccount(source.Accounts[i]);
            }
        }
        if (source.IntranetType != null) {
            this.IntranetType = new Long(source.IntranetType);
        }
        if (source.IntranetRegion != null) {
            this.IntranetRegion = new String(source.IntranetRegion);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.AnonymousLogin != null) {
            this.AnonymousLogin = new AnonymousLoginInfo(source.AnonymousLogin);
        }
        if (source.AuthRoles != null) {
            this.AuthRoles = new AuthRoleInfo[source.AuthRoles.length];
            for (int i = 0; i < source.AuthRoles.length; i++) {
                this.AuthRoles[i] = new AuthRoleInfo(source.AuthRoles[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HideParams != null) {
            this.HideParams = new String[source.HideParams.length];
            for (int i = 0; i < source.HideParams.length; i++) {
                this.HideParams[i] = new String(source.HideParams[i]);
            }
        }
        if (source.AccessControlRules != null) {
            this.AccessControlRules = new AccessControlRule[source.AccessControlRules.length];
            for (int i = 0; i < source.AccessControlRules.length; i++) {
                this.AccessControlRules[i] = new AccessControlRule(source.AccessControlRules[i]);
            }
        }
        if (source.Remarks != null) {
            this.Remarks = new String(source.Remarks);
        }
        if (source.Menus != null) {
            this.Menus = new String[source.Menus.length];
            for (int i = 0; i < source.Menus.length; i++) {
                this.Menus[i] = new String(source.Menus[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.IntranetDomain != null) {
            this.IntranetDomain = new String(source.IntranetDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsoleId", this.ConsoleId);
        this.setParamArraySimple(map, prefix + "AccessMode.", this.AccessMode);
        this.setParamSimple(map, prefix + "LoginMode", this.LoginMode);
        this.setParamSimple(map, prefix + "DomainPrefix", this.DomainPrefix);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamSimple(map, prefix + "IntranetType", this.IntranetType);
        this.setParamSimple(map, prefix + "IntranetRegion", this.IntranetRegion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamObj(map, prefix + "AnonymousLogin.", this.AnonymousLogin);
        this.setParamArrayObj(map, prefix + "AuthRoles.", this.AuthRoles);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "HideParams.", this.HideParams);
        this.setParamArrayObj(map, prefix + "AccessControlRules.", this.AccessControlRules);
        this.setParamSimple(map, prefix + "Remarks", this.Remarks);
        this.setParamArraySimple(map, prefix + "Menus.", this.Menus);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "IntranetDomain", this.IntranetDomain);

    }
}

