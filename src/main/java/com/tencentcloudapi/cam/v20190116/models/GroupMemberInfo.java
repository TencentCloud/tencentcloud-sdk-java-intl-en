/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupMemberInfo extends AbstractModel{

    /**
    * Sub-user UID
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * Sub-user UIN
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Sub-user name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Mobile number
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * Mobile number country/area code
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * If mobile number has been verified
    */
    @SerializedName("PhoneFlag")
    @Expose
    private Long PhoneFlag;

    /**
    * Email address
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * If email has been verified
    */
    @SerializedName("EmailFlag")
    @Expose
    private Long EmailFlag;

    /**
    * User type
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
    * Time policy created
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * If the user is the main message recipient
    */
    @SerializedName("IsReceiverOwner")
    @Expose
    private Long IsReceiverOwner;

    /**
     * Get Sub-user UID 
     * @return Uid Sub-user UID
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set Sub-user UID
     * @param Uid Sub-user UID
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Sub-user UIN 
     * @return Uin Sub-user UIN
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set Sub-user UIN
     * @param Uin Sub-user UIN
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub-user name 
     * @return Name Sub-user name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Sub-user name
     * @param Name Sub-user name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Mobile number 
     * @return PhoneNum Mobile number
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set Mobile number
     * @param PhoneNum Mobile number
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get Mobile number country/area code 
     * @return CountryCode Mobile number country/area code
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set Mobile number country/area code
     * @param CountryCode Mobile number country/area code
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get If mobile number has been verified 
     * @return PhoneFlag If mobile number has been verified
     */
    public Long getPhoneFlag() {
        return this.PhoneFlag;
    }

    /**
     * Set If mobile number has been verified
     * @param PhoneFlag If mobile number has been verified
     */
    public void setPhoneFlag(Long PhoneFlag) {
        this.PhoneFlag = PhoneFlag;
    }

    /**
     * Get Email address 
     * @return Email Email address
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email address
     * @param Email Email address
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get If email has been verified 
     * @return EmailFlag If email has been verified
     */
    public Long getEmailFlag() {
        return this.EmailFlag;
    }

    /**
     * Set If email has been verified
     * @param EmailFlag If email has been verified
     */
    public void setEmailFlag(Long EmailFlag) {
        this.EmailFlag = EmailFlag;
    }

    /**
     * Get User type 
     * @return UserType User type
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set User type
     * @param UserType User type
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    /**
     * Get Time policy created 
     * @return CreateTime Time policy created
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Time policy created
     * @param CreateTime Time policy created
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get If the user is the main message recipient 
     * @return IsReceiverOwner If the user is the main message recipient
     */
    public Long getIsReceiverOwner() {
        return this.IsReceiverOwner;
    }

    /**
     * Set If the user is the main message recipient
     * @param IsReceiverOwner If the user is the main message recipient
     */
    public void setIsReceiverOwner(Long IsReceiverOwner) {
        this.IsReceiverOwner = IsReceiverOwner;
    }

    public GroupMemberInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupMemberInfo(GroupMemberInfo source) {
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.PhoneFlag != null) {
            this.PhoneFlag = new Long(source.PhoneFlag);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.EmailFlag != null) {
            this.EmailFlag = new Long(source.EmailFlag);
        }
        if (source.UserType != null) {
            this.UserType = new Long(source.UserType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsReceiverOwner != null) {
            this.IsReceiverOwner = new Long(source.IsReceiverOwner);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "PhoneFlag", this.PhoneFlag);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "EmailFlag", this.EmailFlag);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsReceiverOwner", this.IsReceiverOwner);

    }
}

