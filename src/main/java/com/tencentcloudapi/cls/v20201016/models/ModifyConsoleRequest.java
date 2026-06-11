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

public class ModifyConsoleRequest extends AbstractModel {

    /**
    * <p>DataSight Console ConsoleId</p>
    */
    @SerializedName("ConsoleId")
    @Expose
    private String ConsoleId;

    /**
    * <p>Access method: public - public network, internal - private network</p>
    */
    @SerializedName("AccessMode")
    @Expose
    private String [] AccessMode;

    /**
    * <p>Login methods</p><p>Enumeration value:</p><ul><li>0: Account password authentication</li><li>1: Anonymous login</li><li>2: Third-party authentication login</li></ul>
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
    * <p>User account information</p><p>"Account password authentication" is required for login methods.</p>
    */
    @SerializedName("Accounts")
    @Expose
    private ConsoleAccount [] Accounts;

    /**
    * <p>Anonymous login account information</p><p>"Anonymous login" is required for the login method.</p>
    */
    @SerializedName("AnonymousLogin")
    @Expose
    private AnonymousLoginInfo AnonymousLogin;

    /**
    * <p>Private network type, defaults to 0</p>
    */
    @SerializedName("IntranetType")
    @Expose
    private Long IntranetType;

    /**
    * <p>Private network region</p>
    */
    @SerializedName("IntranetRegion")
    @Expose
    private String IntranetRegion;

    /**
    * <p>Private network VpcId</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Private subnet SubnetId</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Auth user role information</p><p>"Third-party authentication login" is required for the login method.</p>
    */
    @SerializedName("AuthRoles")
    @Expose
    private AuthRoleInfo [] AuthRoles;

    /**
    * <p>Custom hidden parameter</p>
    */
    @SerializedName("HideParams")
    @Expose
    private String [] HideParams;

    /**
    * <p>Access Control Rule</p><p>The "third-party authentication login" login method requires the AccessMode: internal && Action: ACCEPT rule.</p>
    */
    @SerializedName("AccessControlRules")
    @Expose
    private AccessControlRule [] AccessControlRules;

    /**
    * <p>Remark</p>
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
    * <p>Custom display menu</p>
    */
    @SerializedName("Menus")
    @Expose
    private String [] Menus;

    /**
     * Get <p>DataSight Console ConsoleId</p> 
     * @return ConsoleId <p>DataSight Console ConsoleId</p>
     */
    public String getConsoleId() {
        return this.ConsoleId;
    }

    /**
     * Set <p>DataSight Console ConsoleId</p>
     * @param ConsoleId <p>DataSight Console ConsoleId</p>
     */
    public void setConsoleId(String ConsoleId) {
        this.ConsoleId = ConsoleId;
    }

    /**
     * Get <p>Access method: public - public network, internal - private network</p> 
     * @return AccessMode <p>Access method: public - public network, internal - private network</p>
     */
    public String [] getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>Access method: public - public network, internal - private network</p>
     * @param AccessMode <p>Access method: public - public network, internal - private network</p>
     */
    public void setAccessMode(String [] AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get <p>Login methods</p><p>Enumeration value:</p><ul><li>0: Account password authentication</li><li>1: Anonymous login</li><li>2: Third-party authentication login</li></ul> 
     * @return LoginMode <p>Login methods</p><p>Enumeration value:</p><ul><li>0: Account password authentication</li><li>1: Anonymous login</li><li>2: Third-party authentication login</li></ul>
     */
    public Long getLoginMode() {
        return this.LoginMode;
    }

    /**
     * Set <p>Login methods</p><p>Enumeration value:</p><ul><li>0: Account password authentication</li><li>1: Anonymous login</li><li>2: Third-party authentication login</li></ul>
     * @param LoginMode <p>Login methods</p><p>Enumeration value:</p><ul><li>0: Account password authentication</li><li>1: Anonymous login</li><li>2: Third-party authentication login</li></ul>
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
     * Get <p>User account information</p><p>"Account password authentication" is required for login methods.</p> 
     * @return Accounts <p>User account information</p><p>"Account password authentication" is required for login methods.</p>
     */
    public ConsoleAccount [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set <p>User account information</p><p>"Account password authentication" is required for login methods.</p>
     * @param Accounts <p>User account information</p><p>"Account password authentication" is required for login methods.</p>
     */
    public void setAccounts(ConsoleAccount [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get <p>Anonymous login account information</p><p>"Anonymous login" is required for the login method.</p> 
     * @return AnonymousLogin <p>Anonymous login account information</p><p>"Anonymous login" is required for the login method.</p>
     */
    public AnonymousLoginInfo getAnonymousLogin() {
        return this.AnonymousLogin;
    }

    /**
     * Set <p>Anonymous login account information</p><p>"Anonymous login" is required for the login method.</p>
     * @param AnonymousLogin <p>Anonymous login account information</p><p>"Anonymous login" is required for the login method.</p>
     */
    public void setAnonymousLogin(AnonymousLoginInfo AnonymousLogin) {
        this.AnonymousLogin = AnonymousLogin;
    }

    /**
     * Get <p>Private network type, defaults to 0</p> 
     * @return IntranetType <p>Private network type, defaults to 0</p>
     */
    public Long getIntranetType() {
        return this.IntranetType;
    }

    /**
     * Set <p>Private network type, defaults to 0</p>
     * @param IntranetType <p>Private network type, defaults to 0</p>
     */
    public void setIntranetType(Long IntranetType) {
        this.IntranetType = IntranetType;
    }

    /**
     * Get <p>Private network region</p> 
     * @return IntranetRegion <p>Private network region</p>
     */
    public String getIntranetRegion() {
        return this.IntranetRegion;
    }

    /**
     * Set <p>Private network region</p>
     * @param IntranetRegion <p>Private network region</p>
     */
    public void setIntranetRegion(String IntranetRegion) {
        this.IntranetRegion = IntranetRegion;
    }

    /**
     * Get <p>Private network VpcId</p> 
     * @return VpcId <p>Private network VpcId</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>Private network VpcId</p>
     * @param VpcId <p>Private network VpcId</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Private subnet SubnetId</p> 
     * @return SubnetId <p>Private subnet SubnetId</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Private subnet SubnetId</p>
     * @param SubnetId <p>Private subnet SubnetId</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Auth user role information</p><p>"Third-party authentication login" is required for the login method.</p> 
     * @return AuthRoles <p>Auth user role information</p><p>"Third-party authentication login" is required for the login method.</p>
     */
    public AuthRoleInfo [] getAuthRoles() {
        return this.AuthRoles;
    }

    /**
     * Set <p>Auth user role information</p><p>"Third-party authentication login" is required for the login method.</p>
     * @param AuthRoles <p>Auth user role information</p><p>"Third-party authentication login" is required for the login method.</p>
     */
    public void setAuthRoles(AuthRoleInfo [] AuthRoles) {
        this.AuthRoles = AuthRoles;
    }

    /**
     * Get <p>Custom hidden parameter</p> 
     * @return HideParams <p>Custom hidden parameter</p>
     */
    public String [] getHideParams() {
        return this.HideParams;
    }

    /**
     * Set <p>Custom hidden parameter</p>
     * @param HideParams <p>Custom hidden parameter</p>
     */
    public void setHideParams(String [] HideParams) {
        this.HideParams = HideParams;
    }

    /**
     * Get <p>Access Control Rule</p><p>The "third-party authentication login" login method requires the AccessMode: internal && Action: ACCEPT rule.</p> 
     * @return AccessControlRules <p>Access Control Rule</p><p>The "third-party authentication login" login method requires the AccessMode: internal && Action: ACCEPT rule.</p>
     */
    public AccessControlRule [] getAccessControlRules() {
        return this.AccessControlRules;
    }

    /**
     * Set <p>Access Control Rule</p><p>The "third-party authentication login" login method requires the AccessMode: internal && Action: ACCEPT rule.</p>
     * @param AccessControlRules <p>Access Control Rule</p><p>The "third-party authentication login" login method requires the AccessMode: internal && Action: ACCEPT rule.</p>
     */
    public void setAccessControlRules(AccessControlRule [] AccessControlRules) {
        this.AccessControlRules = AccessControlRules;
    }

    /**
     * Get <p>Remark</p> 
     * @return Remarks <p>Remark</p>
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * Set <p>Remark</p>
     * @param Remarks <p>Remark</p>
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    /**
     * Get <p>Custom display menu</p> 
     * @return Menus <p>Custom display menu</p>
     */
    public String [] getMenus() {
        return this.Menus;
    }

    /**
     * Set <p>Custom display menu</p>
     * @param Menus <p>Custom display menu</p>
     */
    public void setMenus(String [] Menus) {
        this.Menus = Menus;
    }

    public ModifyConsoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConsoleRequest(ModifyConsoleRequest source) {
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
        if (source.AnonymousLogin != null) {
            this.AnonymousLogin = new AnonymousLoginInfo(source.AnonymousLogin);
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
        if (source.AuthRoles != null) {
            this.AuthRoles = new AuthRoleInfo[source.AuthRoles.length];
            for (int i = 0; i < source.AuthRoles.length; i++) {
                this.AuthRoles[i] = new AuthRoleInfo(source.AuthRoles[i]);
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
        this.setParamObj(map, prefix + "AnonymousLogin.", this.AnonymousLogin);
        this.setParamSimple(map, prefix + "IntranetType", this.IntranetType);
        this.setParamSimple(map, prefix + "IntranetRegion", this.IntranetRegion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "AuthRoles.", this.AuthRoles);
        this.setParamArraySimple(map, prefix + "HideParams.", this.HideParams);
        this.setParamArrayObj(map, prefix + "AccessControlRules.", this.AccessControlRules);
        this.setParamSimple(map, prefix + "Remarks", this.Remarks);
        this.setParamArraySimple(map, prefix + "Menus.", this.Menus);

    }
}

