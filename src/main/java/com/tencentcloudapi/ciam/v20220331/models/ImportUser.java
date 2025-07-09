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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportUser extends AbstractModel {

    /**
    * Username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Mobile number
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * Email address
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * ID card number
    */
    @SerializedName("ResidentIdentityCard")
    @Expose
    private String ResidentIdentityCard;

    /**
    * Nickname
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * Address
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * User group ID
    */
    @SerializedName("UserGroup")
    @Expose
    private String [] UserGroup;

    /**
    * `qqOpenId` on QQ
    */
    @SerializedName("QqOpenId")
    @Expose
    private String QqOpenId;

    /**
    * `qqUnionId` on QQ
    */
    @SerializedName("QqUnionId")
    @Expose
    private String QqUnionId;

    /**
    * `wechatOpenId` on WeChat
    */
    @SerializedName("WechatOpenId")
    @Expose
    private String WechatOpenId;

    /**
    * `wechatUnionId` on WeChat
    */
    @SerializedName("WechatUnionId")
    @Expose
    private String WechatUnionId;

    /**
    * `alipayUserId` on Alipay
    */
    @SerializedName("AlipayUserId")
    @Expose
    private String AlipayUserId;

    /**
    * WeCom user ID.
    */
    @SerializedName("WeComUserId")
    @Expose
    private String WeComUserId;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Date of birth
    */
    @SerializedName("Birthdate")
    @Expose
    private String Birthdate;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Coordinate
    */
    @SerializedName("Locale")
    @Expose
    private String Locale;

    /**
    * Gender. Valid values: `MALE`, `FEMALE`, `UNKNOWN`.
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * Identity verification method
    */
    @SerializedName("IdentityVerificationMethod")
    @Expose
    private String IdentityVerificationMethod;

    /**
    * Whether the identity is verified
    */
    @SerializedName("IdentityVerified")
    @Expose
    private Boolean IdentityVerified;

    /**
    * Job
    */
    @SerializedName("Job")
    @Expose
    private String Job;

    /**
    * Country/Region
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Time zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Password ciphertext
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Custom attribute
    */
    @SerializedName("CustomizationAttributes")
    @Expose
    private MemberMap [] CustomizationAttributes;

    /**
    * Password salt
    */
    @SerializedName("Salt")
    @Expose
    private Salt Salt;

    /**
    * Password encryption method. Valid values: `SHA1`, `BCRYPT`.
    */
    @SerializedName("PasswordEncryptTypeEnum")
    @Expose
    private String PasswordEncryptTypeEnum;

    /**
    * Index field 1
    */
    @SerializedName("IndexedAttribute1")
    @Expose
    private String IndexedAttribute1;

    /**
    * Index field 2
    */
    @SerializedName("IndexedAttribute2")
    @Expose
    private String IndexedAttribute2;

    /**
    * Index field 3
    */
    @SerializedName("IndexedAttribute3")
    @Expose
    private String IndexedAttribute3;

    /**
    * Index field 4
    */
    @SerializedName("IndexedAttribute4")
    @Expose
    private String IndexedAttribute4;

    /**
    * Index field 5
    */
    @SerializedName("IndexedAttribute5")
    @Expose
    private String IndexedAttribute5;

    /**
     * Get Username 
     * @return UserName Username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
     * @param UserName Username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Mobile number 
     * @return PhoneNumber Mobile number
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set Mobile number
     * @param PhoneNumber Mobile number
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
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
     * Get ID card number 
     * @return ResidentIdentityCard ID card number
     */
    public String getResidentIdentityCard() {
        return this.ResidentIdentityCard;
    }

    /**
     * Set ID card number
     * @param ResidentIdentityCard ID card number
     */
    public void setResidentIdentityCard(String ResidentIdentityCard) {
        this.ResidentIdentityCard = ResidentIdentityCard;
    }

    /**
     * Get Nickname 
     * @return Nickname Nickname
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set Nickname
     * @param Nickname Nickname
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get Address 
     * @return Address Address
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address
     * @param Address Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get User group ID 
     * @return UserGroup User group ID
     */
    public String [] getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set User group ID
     * @param UserGroup User group ID
     */
    public void setUserGroup(String [] UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get `qqOpenId` on QQ 
     * @return QqOpenId `qqOpenId` on QQ
     */
    public String getQqOpenId() {
        return this.QqOpenId;
    }

    /**
     * Set `qqOpenId` on QQ
     * @param QqOpenId `qqOpenId` on QQ
     */
    public void setQqOpenId(String QqOpenId) {
        this.QqOpenId = QqOpenId;
    }

    /**
     * Get `qqUnionId` on QQ 
     * @return QqUnionId `qqUnionId` on QQ
     */
    public String getQqUnionId() {
        return this.QqUnionId;
    }

    /**
     * Set `qqUnionId` on QQ
     * @param QqUnionId `qqUnionId` on QQ
     */
    public void setQqUnionId(String QqUnionId) {
        this.QqUnionId = QqUnionId;
    }

    /**
     * Get `wechatOpenId` on WeChat 
     * @return WechatOpenId `wechatOpenId` on WeChat
     */
    public String getWechatOpenId() {
        return this.WechatOpenId;
    }

    /**
     * Set `wechatOpenId` on WeChat
     * @param WechatOpenId `wechatOpenId` on WeChat
     */
    public void setWechatOpenId(String WechatOpenId) {
        this.WechatOpenId = WechatOpenId;
    }

    /**
     * Get `wechatUnionId` on WeChat 
     * @return WechatUnionId `wechatUnionId` on WeChat
     */
    public String getWechatUnionId() {
        return this.WechatUnionId;
    }

    /**
     * Set `wechatUnionId` on WeChat
     * @param WechatUnionId `wechatUnionId` on WeChat
     */
    public void setWechatUnionId(String WechatUnionId) {
        this.WechatUnionId = WechatUnionId;
    }

    /**
     * Get `alipayUserId` on Alipay 
     * @return AlipayUserId `alipayUserId` on Alipay
     */
    public String getAlipayUserId() {
        return this.AlipayUserId;
    }

    /**
     * Set `alipayUserId` on Alipay
     * @param AlipayUserId `alipayUserId` on Alipay
     */
    public void setAlipayUserId(String AlipayUserId) {
        this.AlipayUserId = AlipayUserId;
    }

    /**
     * Get WeCom user ID. 
     * @return WeComUserId WeCom user ID.
     */
    public String getWeComUserId() {
        return this.WeComUserId;
    }

    /**
     * Set WeCom user ID.
     * @param WeComUserId WeCom user ID.
     */
    public void setWeComUserId(String WeComUserId) {
        this.WeComUserId = WeComUserId;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Date of birth 
     * @return Birthdate Date of birth
     */
    public String getBirthdate() {
        return this.Birthdate;
    }

    /**
     * Set Date of birth
     * @param Birthdate Date of birth
     */
    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Coordinate 
     * @return Locale Coordinate
     */
    public String getLocale() {
        return this.Locale;
    }

    /**
     * Set Coordinate
     * @param Locale Coordinate
     */
    public void setLocale(String Locale) {
        this.Locale = Locale;
    }

    /**
     * Get Gender. Valid values: `MALE`, `FEMALE`, `UNKNOWN`. 
     * @return Gender Gender. Valid values: `MALE`, `FEMALE`, `UNKNOWN`.
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set Gender. Valid values: `MALE`, `FEMALE`, `UNKNOWN`.
     * @param Gender Gender. Valid values: `MALE`, `FEMALE`, `UNKNOWN`.
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get Identity verification method 
     * @return IdentityVerificationMethod Identity verification method
     */
    public String getIdentityVerificationMethod() {
        return this.IdentityVerificationMethod;
    }

    /**
     * Set Identity verification method
     * @param IdentityVerificationMethod Identity verification method
     */
    public void setIdentityVerificationMethod(String IdentityVerificationMethod) {
        this.IdentityVerificationMethod = IdentityVerificationMethod;
    }

    /**
     * Get Whether the identity is verified 
     * @return IdentityVerified Whether the identity is verified
     */
    public Boolean getIdentityVerified() {
        return this.IdentityVerified;
    }

    /**
     * Set Whether the identity is verified
     * @param IdentityVerified Whether the identity is verified
     */
    public void setIdentityVerified(Boolean IdentityVerified) {
        this.IdentityVerified = IdentityVerified;
    }

    /**
     * Get Job 
     * @return Job Job
     */
    public String getJob() {
        return this.Job;
    }

    /**
     * Set Job
     * @param Job Job
     */
    public void setJob(String Job) {
        this.Job = Job;
    }

    /**
     * Get Country/Region 
     * @return Nationality Country/Region
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Country/Region
     * @param Nationality Country/Region
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Time zone 
     * @return Zone Time zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Time zone
     * @param Zone Time zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Password ciphertext 
     * @return Password Password ciphertext
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password ciphertext
     * @param Password Password ciphertext
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Custom attribute 
     * @return CustomizationAttributes Custom attribute
     */
    public MemberMap [] getCustomizationAttributes() {
        return this.CustomizationAttributes;
    }

    /**
     * Set Custom attribute
     * @param CustomizationAttributes Custom attribute
     */
    public void setCustomizationAttributes(MemberMap [] CustomizationAttributes) {
        this.CustomizationAttributes = CustomizationAttributes;
    }

    /**
     * Get Password salt 
     * @return Salt Password salt
     */
    public Salt getSalt() {
        return this.Salt;
    }

    /**
     * Set Password salt
     * @param Salt Password salt
     */
    public void setSalt(Salt Salt) {
        this.Salt = Salt;
    }

    /**
     * Get Password encryption method. Valid values: `SHA1`, `BCRYPT`. 
     * @return PasswordEncryptTypeEnum Password encryption method. Valid values: `SHA1`, `BCRYPT`.
     */
    public String getPasswordEncryptTypeEnum() {
        return this.PasswordEncryptTypeEnum;
    }

    /**
     * Set Password encryption method. Valid values: `SHA1`, `BCRYPT`.
     * @param PasswordEncryptTypeEnum Password encryption method. Valid values: `SHA1`, `BCRYPT`.
     */
    public void setPasswordEncryptTypeEnum(String PasswordEncryptTypeEnum) {
        this.PasswordEncryptTypeEnum = PasswordEncryptTypeEnum;
    }

    /**
     * Get Index field 1 
     * @return IndexedAttribute1 Index field 1
     */
    public String getIndexedAttribute1() {
        return this.IndexedAttribute1;
    }

    /**
     * Set Index field 1
     * @param IndexedAttribute1 Index field 1
     */
    public void setIndexedAttribute1(String IndexedAttribute1) {
        this.IndexedAttribute1 = IndexedAttribute1;
    }

    /**
     * Get Index field 2 
     * @return IndexedAttribute2 Index field 2
     */
    public String getIndexedAttribute2() {
        return this.IndexedAttribute2;
    }

    /**
     * Set Index field 2
     * @param IndexedAttribute2 Index field 2
     */
    public void setIndexedAttribute2(String IndexedAttribute2) {
        this.IndexedAttribute2 = IndexedAttribute2;
    }

    /**
     * Get Index field 3 
     * @return IndexedAttribute3 Index field 3
     */
    public String getIndexedAttribute3() {
        return this.IndexedAttribute3;
    }

    /**
     * Set Index field 3
     * @param IndexedAttribute3 Index field 3
     */
    public void setIndexedAttribute3(String IndexedAttribute3) {
        this.IndexedAttribute3 = IndexedAttribute3;
    }

    /**
     * Get Index field 4 
     * @return IndexedAttribute4 Index field 4
     */
    public String getIndexedAttribute4() {
        return this.IndexedAttribute4;
    }

    /**
     * Set Index field 4
     * @param IndexedAttribute4 Index field 4
     */
    public void setIndexedAttribute4(String IndexedAttribute4) {
        this.IndexedAttribute4 = IndexedAttribute4;
    }

    /**
     * Get Index field 5 
     * @return IndexedAttribute5 Index field 5
     */
    public String getIndexedAttribute5() {
        return this.IndexedAttribute5;
    }

    /**
     * Set Index field 5
     * @param IndexedAttribute5 Index field 5
     */
    public void setIndexedAttribute5(String IndexedAttribute5) {
        this.IndexedAttribute5 = IndexedAttribute5;
    }

    public ImportUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportUser(ImportUser source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.ResidentIdentityCard != null) {
            this.ResidentIdentityCard = new String(source.ResidentIdentityCard);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.UserGroup != null) {
            this.UserGroup = new String[source.UserGroup.length];
            for (int i = 0; i < source.UserGroup.length; i++) {
                this.UserGroup[i] = new String(source.UserGroup[i]);
            }
        }
        if (source.QqOpenId != null) {
            this.QqOpenId = new String(source.QqOpenId);
        }
        if (source.QqUnionId != null) {
            this.QqUnionId = new String(source.QqUnionId);
        }
        if (source.WechatOpenId != null) {
            this.WechatOpenId = new String(source.WechatOpenId);
        }
        if (source.WechatUnionId != null) {
            this.WechatUnionId = new String(source.WechatUnionId);
        }
        if (source.AlipayUserId != null) {
            this.AlipayUserId = new String(source.AlipayUserId);
        }
        if (source.WeComUserId != null) {
            this.WeComUserId = new String(source.WeComUserId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Birthdate != null) {
            this.Birthdate = new String(source.Birthdate);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Locale != null) {
            this.Locale = new String(source.Locale);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.IdentityVerificationMethod != null) {
            this.IdentityVerificationMethod = new String(source.IdentityVerificationMethod);
        }
        if (source.IdentityVerified != null) {
            this.IdentityVerified = new Boolean(source.IdentityVerified);
        }
        if (source.Job != null) {
            this.Job = new String(source.Job);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.CustomizationAttributes != null) {
            this.CustomizationAttributes = new MemberMap[source.CustomizationAttributes.length];
            for (int i = 0; i < source.CustomizationAttributes.length; i++) {
                this.CustomizationAttributes[i] = new MemberMap(source.CustomizationAttributes[i]);
            }
        }
        if (source.Salt != null) {
            this.Salt = new Salt(source.Salt);
        }
        if (source.PasswordEncryptTypeEnum != null) {
            this.PasswordEncryptTypeEnum = new String(source.PasswordEncryptTypeEnum);
        }
        if (source.IndexedAttribute1 != null) {
            this.IndexedAttribute1 = new String(source.IndexedAttribute1);
        }
        if (source.IndexedAttribute2 != null) {
            this.IndexedAttribute2 = new String(source.IndexedAttribute2);
        }
        if (source.IndexedAttribute3 != null) {
            this.IndexedAttribute3 = new String(source.IndexedAttribute3);
        }
        if (source.IndexedAttribute4 != null) {
            this.IndexedAttribute4 = new String(source.IndexedAttribute4);
        }
        if (source.IndexedAttribute5 != null) {
            this.IndexedAttribute5 = new String(source.IndexedAttribute5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "ResidentIdentityCard", this.ResidentIdentityCard);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamArraySimple(map, prefix + "UserGroup.", this.UserGroup);
        this.setParamSimple(map, prefix + "QqOpenId", this.QqOpenId);
        this.setParamSimple(map, prefix + "QqUnionId", this.QqUnionId);
        this.setParamSimple(map, prefix + "WechatOpenId", this.WechatOpenId);
        this.setParamSimple(map, prefix + "WechatUnionId", this.WechatUnionId);
        this.setParamSimple(map, prefix + "AlipayUserId", this.AlipayUserId);
        this.setParamSimple(map, prefix + "WeComUserId", this.WeComUserId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Birthdate", this.Birthdate);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Locale", this.Locale);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "IdentityVerificationMethod", this.IdentityVerificationMethod);
        this.setParamSimple(map, prefix + "IdentityVerified", this.IdentityVerified);
        this.setParamSimple(map, prefix + "Job", this.Job);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "CustomizationAttributes.", this.CustomizationAttributes);
        this.setParamObj(map, prefix + "Salt.", this.Salt);
        this.setParamSimple(map, prefix + "PasswordEncryptTypeEnum", this.PasswordEncryptTypeEnum);
        this.setParamSimple(map, prefix + "IndexedAttribute1", this.IndexedAttribute1);
        this.setParamSimple(map, prefix + "IndexedAttribute2", this.IndexedAttribute2);
        this.setParamSimple(map, prefix + "IndexedAttribute3", this.IndexedAttribute3);
        this.setParamSimple(map, prefix + "IndexedAttribute4", this.IndexedAttribute4);
        this.setParamSimple(map, prefix + "IndexedAttribute5", this.IndexedAttribute5);

    }
}

