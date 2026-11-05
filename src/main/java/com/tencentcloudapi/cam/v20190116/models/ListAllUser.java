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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAllUser extends AbstractModel {

    /**
    * <p>Sub-account account ID.</p>
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * <p>Username of sub-account.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Sub-account UID.</p>
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * <p>Sub-account remark.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Whether or not the sub-account can log in to the console.</p>
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
    * <p>Phone number.</p>
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * <p>Area code.</p>
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * <p>Mailbox.</p>
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * <p>Creation time.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Account type</p><p>Enumeration values:</p><ul><li>Owner: root account</li><li>SubUser: sub-user</li><li>CICUser: CIC user</li><li>WechatCorpUser: WeCom sub-user</li><li>AgentIdentity: AgentIdentity user</li><li>Collaborator: collaborator</li><li>MessageReceiver: message recipient</li><li>Unknown: unknown</li></ul>
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
     * Get <p>Sub-account account ID.</p> 
     * @return Uin <p>Sub-account account ID.</p>
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set <p>Sub-account account ID.</p>
     * @param Uin <p>Sub-account account ID.</p>
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Username of sub-account.</p> 
     * @return Name <p>Username of sub-account.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Username of sub-account.</p>
     * @param Name <p>Username of sub-account.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Sub-account UID.</p> 
     * @return Uid <p>Sub-account UID.</p>
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set <p>Sub-account UID.</p>
     * @param Uid <p>Sub-account UID.</p>
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get <p>Sub-account remark.</p> 
     * @return Remark <p>Sub-account remark.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Sub-account remark.</p>
     * @param Remark <p>Sub-account remark.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Whether or not the sub-account can log in to the console.</p> 
     * @return ConsoleLogin <p>Whether or not the sub-account can log in to the console.</p>
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set <p>Whether or not the sub-account can log in to the console.</p>
     * @param ConsoleLogin <p>Whether or not the sub-account can log in to the console.</p>
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * Get <p>Phone number.</p> 
     * @return PhoneNum <p>Phone number.</p>
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set <p>Phone number.</p>
     * @param PhoneNum <p>Phone number.</p>
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get <p>Area code.</p> 
     * @return CountryCode <p>Area code.</p>
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set <p>Area code.</p>
     * @param CountryCode <p>Area code.</p>
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get <p>Mailbox.</p> 
     * @return Email <p>Mailbox.</p>
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set <p>Mailbox.</p>
     * @param Email <p>Mailbox.</p>
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get <p>Creation time.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p> 
     * @return CreateTime <p>Creation time.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     * @param CreateTime <p>Creation time.</p><p>Parameter format: YYYY-MM-DD hh:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Account type</p><p>Enumeration values:</p><ul><li>Owner: root account</li><li>SubUser: sub-user</li><li>CICUser: CIC user</li><li>WechatCorpUser: WeCom sub-user</li><li>AgentIdentity: AgentIdentity user</li><li>Collaborator: collaborator</li><li>MessageReceiver: message recipient</li><li>Unknown: unknown</li></ul> 
     * @return UserType <p>Account type</p><p>Enumeration values:</p><ul><li>Owner: root account</li><li>SubUser: sub-user</li><li>CICUser: CIC user</li><li>WechatCorpUser: WeCom sub-user</li><li>AgentIdentity: AgentIdentity user</li><li>Collaborator: collaborator</li><li>MessageReceiver: message recipient</li><li>Unknown: unknown</li></ul>
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set <p>Account type</p><p>Enumeration values:</p><ul><li>Owner: root account</li><li>SubUser: sub-user</li><li>CICUser: CIC user</li><li>WechatCorpUser: WeCom sub-user</li><li>AgentIdentity: AgentIdentity user</li><li>Collaborator: collaborator</li><li>MessageReceiver: message recipient</li><li>Unknown: unknown</li></ul>
     * @param UserType <p>Account type</p><p>Enumeration values:</p><ul><li>Owner: root account</li><li>SubUser: sub-user</li><li>CICUser: CIC user</li><li>WechatCorpUser: WeCom sub-user</li><li>AgentIdentity: AgentIdentity user</li><li>Collaborator: collaborator</li><li>MessageReceiver: message recipient</li><li>Unknown: unknown</li></ul>
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public ListAllUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAllUser(ListAllUser source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ConsoleLogin != null) {
            this.ConsoleLogin = new Long(source.ConsoleLogin);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UserType", this.UserType);

    }
}

