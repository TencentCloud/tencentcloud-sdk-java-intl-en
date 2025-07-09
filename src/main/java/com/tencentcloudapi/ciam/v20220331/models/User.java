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

public class User extends AbstractModel {

    /**
    * User ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Username
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Mobile number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * Email address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * Last login time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastSignOn")
    @Expose
    private Long LastSignOn;

    /**
    * Creation time
    */
    @SerializedName("CreatedDate")
    @Expose
    private Long CreatedDate;

    /**
    * Status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * User source
    */
    @SerializedName("UserDataSourceEnum")
    @Expose
    private String UserDataSourceEnum;

    /**
    * Nickname
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * Address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Date of birth
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Birthdate")
    @Expose
    private Long Birthdate;

    /**
    * User group ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserGroups")
    @Expose
    private String [] UserGroups;

    /**
    * Last modified time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastModifiedDate")
    @Expose
    private Long LastModifiedDate;

    /**
    * Custom attribute
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomAttributes")
    @Expose
    private MemberMap [] CustomAttributes;

    /**
    * ID card number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResidentIdentityCard")
    @Expose
    private String ResidentIdentityCard;

    /**
    * `OpenId` on QQ
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QqOpenId")
    @Expose
    private String QqOpenId;

    /**
    * `UnionId` on QQ
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QqUnionId")
    @Expose
    private String QqUnionId;

    /**
    * `WechatOpenId` on WeChat
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WechatOpenId")
    @Expose
    private String WechatOpenId;

    /**
    * `WechatUnionId` on WeChat
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WechatUnionId")
    @Expose
    private String WechatUnionId;

    /**
    * `AlipayUserId` on Alipay
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlipayUserId")
    @Expose
    private String AlipayUserId;

    /**
    * WeCom user ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WeComUserId")
    @Expose
    private String WeComUserId;

    /**
    * Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Coordinate
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Locale")
    @Expose
    private String Locale;

    /**
    * Gender
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * Identity verification method
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdentityVerificationMethod")
    @Expose
    private String IdentityVerificationMethod;

    /**
    * Whether the identity is verified
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdentityVerified")
    @Expose
    private Boolean IdentityVerified;

    /**
    * Job
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Job")
    @Expose
    private String Job;

    /**
    * Country/Region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Whether the account is the primary account (after account merge, this parameter is `true` for primary accounts and `false` for secondary account).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Primary")
    @Expose
    private Boolean Primary;

    /**
    * Time zone
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Whether the account has ever logged in.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlreadyFirstLogin")
    @Expose
    private Boolean AlreadyFirstLogin;

    /**
    * Tenant ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * User directory ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * Version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * Lock type (locked by admin or locked by login policy)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LockType")
    @Expose
    private String LockType;

    /**
    * Lock time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LockTime")
    @Expose
    private Long LockTime;

    /**
    * Index field 1
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IndexedAttribute1")
    @Expose
    private String IndexedAttribute1;

    /**
    * Index field 2
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IndexedAttribute2")
    @Expose
    private String IndexedAttribute2;

    /**
    * Index field 3
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IndexedAttribute3")
    @Expose
    private String IndexedAttribute3;

    /**
    * Index field 4
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IndexedAttribute4")
    @Expose
    private String IndexedAttribute4;

    /**
    * Index field 5
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IndexedAttribute5")
    @Expose
    private String IndexedAttribute5;

    /**
     * Get User ID 
     * @return UserId User ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID
     * @param UserId User ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Username
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserName Username
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserName Username
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Mobile number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PhoneNumber Mobile number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set Mobile number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PhoneNumber Mobile number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get Email address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Email Email address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Email Email address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get Last login time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastSignOn Last login time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastSignOn() {
        return this.LastSignOn;
    }

    /**
     * Set Last login time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastSignOn Last login time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastSignOn(Long LastSignOn) {
        this.LastSignOn = LastSignOn;
    }

    /**
     * Get Creation time 
     * @return CreatedDate Creation time
     */
    public Long getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set Creation time
     * @param CreatedDate Creation time
     */
    public void setCreatedDate(Long CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    /**
     * Get Status 
     * @return Status Status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
     * @param Status Status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get User source 
     * @return UserDataSourceEnum User source
     */
    public String getUserDataSourceEnum() {
        return this.UserDataSourceEnum;
    }

    /**
     * Set User source
     * @param UserDataSourceEnum User source
     */
    public void setUserDataSourceEnum(String UserDataSourceEnum) {
        this.UserDataSourceEnum = UserDataSourceEnum;
    }

    /**
     * Get Nickname
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nickname Nickname
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set Nickname
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nickname Nickname
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get Address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Address Address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address Address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Date of birth
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Birthdate Date of birth
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBirthdate() {
        return this.Birthdate;
    }

    /**
     * Set Date of birth
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Birthdate Date of birth
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBirthdate(Long Birthdate) {
        this.Birthdate = Birthdate;
    }

    /**
     * Get User group ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserGroups User group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getUserGroups() {
        return this.UserGroups;
    }

    /**
     * Set User group ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserGroups User group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserGroups(String [] UserGroups) {
        this.UserGroups = UserGroups;
    }

    /**
     * Get Last modified time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastModifiedDate Last modified time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastModifiedDate() {
        return this.LastModifiedDate;
    }

    /**
     * Set Last modified time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastModifiedDate Last modified time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastModifiedDate(Long LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    /**
     * Get Custom attribute
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CustomAttributes Custom attribute
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MemberMap [] getCustomAttributes() {
        return this.CustomAttributes;
    }

    /**
     * Set Custom attribute
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CustomAttributes Custom attribute
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomAttributes(MemberMap [] CustomAttributes) {
        this.CustomAttributes = CustomAttributes;
    }

    /**
     * Get ID card number
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResidentIdentityCard ID card number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResidentIdentityCard() {
        return this.ResidentIdentityCard;
    }

    /**
     * Set ID card number
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResidentIdentityCard ID card number
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResidentIdentityCard(String ResidentIdentityCard) {
        this.ResidentIdentityCard = ResidentIdentityCard;
    }

    /**
     * Get `OpenId` on QQ
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QqOpenId `OpenId` on QQ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQqOpenId() {
        return this.QqOpenId;
    }

    /**
     * Set `OpenId` on QQ
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QqOpenId `OpenId` on QQ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQqOpenId(String QqOpenId) {
        this.QqOpenId = QqOpenId;
    }

    /**
     * Get `UnionId` on QQ
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QqUnionId `UnionId` on QQ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQqUnionId() {
        return this.QqUnionId;
    }

    /**
     * Set `UnionId` on QQ
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QqUnionId `UnionId` on QQ
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQqUnionId(String QqUnionId) {
        this.QqUnionId = QqUnionId;
    }

    /**
     * Get `WechatOpenId` on WeChat
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WechatOpenId `WechatOpenId` on WeChat
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWechatOpenId() {
        return this.WechatOpenId;
    }

    /**
     * Set `WechatOpenId` on WeChat
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WechatOpenId `WechatOpenId` on WeChat
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWechatOpenId(String WechatOpenId) {
        this.WechatOpenId = WechatOpenId;
    }

    /**
     * Get `WechatUnionId` on WeChat
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WechatUnionId `WechatUnionId` on WeChat
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWechatUnionId() {
        return this.WechatUnionId;
    }

    /**
     * Set `WechatUnionId` on WeChat
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WechatUnionId `WechatUnionId` on WeChat
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWechatUnionId(String WechatUnionId) {
        this.WechatUnionId = WechatUnionId;
    }

    /**
     * Get `AlipayUserId` on Alipay
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlipayUserId `AlipayUserId` on Alipay
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAlipayUserId() {
        return this.AlipayUserId;
    }

    /**
     * Set `AlipayUserId` on Alipay
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlipayUserId `AlipayUserId` on Alipay
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlipayUserId(String AlipayUserId) {
        this.AlipayUserId = AlipayUserId;
    }

    /**
     * Get WeCom user ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WeComUserId WeCom user ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWeComUserId() {
        return this.WeComUserId;
    }

    /**
     * Set WeCom user ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WeComUserId WeCom user ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWeComUserId(String WeComUserId) {
        this.WeComUserId = WeComUserId;
    }

    /**
     * Get Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Coordinate
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Locale Coordinate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLocale() {
        return this.Locale;
    }

    /**
     * Set Coordinate
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Locale Coordinate
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocale(String Locale) {
        this.Locale = Locale;
    }

    /**
     * Get Gender
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Gender Gender
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set Gender
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Gender Gender
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get Identity verification method
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdentityVerificationMethod Identity verification method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIdentityVerificationMethod() {
        return this.IdentityVerificationMethod;
    }

    /**
     * Set Identity verification method
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdentityVerificationMethod Identity verification method
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdentityVerificationMethod(String IdentityVerificationMethod) {
        this.IdentityVerificationMethod = IdentityVerificationMethod;
    }

    /**
     * Get Whether the identity is verified
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IdentityVerified Whether the identity is verified
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIdentityVerified() {
        return this.IdentityVerified;
    }

    /**
     * Set Whether the identity is verified
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IdentityVerified Whether the identity is verified
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIdentityVerified(Boolean IdentityVerified) {
        this.IdentityVerified = IdentityVerified;
    }

    /**
     * Get Job
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Job Job
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJob() {
        return this.Job;
    }

    /**
     * Set Job
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Job Job
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJob(String Job) {
        this.Job = Job;
    }

    /**
     * Get Country/Region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nationality Country/Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Country/Region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nationality Country/Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Whether the account is the primary account (after account merge, this parameter is `true` for primary accounts and `false` for secondary account).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Primary Whether the account is the primary account (after account merge, this parameter is `true` for primary accounts and `false` for secondary account).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getPrimary() {
        return this.Primary;
    }

    /**
     * Set Whether the account is the primary account (after account merge, this parameter is `true` for primary accounts and `false` for secondary account).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Primary Whether the account is the primary account (after account merge, this parameter is `true` for primary accounts and `false` for secondary account).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrimary(Boolean Primary) {
        this.Primary = Primary;
    }

    /**
     * Get Time zone
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone Time zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Time zone
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zone Time zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Whether the account has ever logged in.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlreadyFirstLogin Whether the account has ever logged in.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAlreadyFirstLogin() {
        return this.AlreadyFirstLogin;
    }

    /**
     * Set Whether the account has ever logged in.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlreadyFirstLogin Whether the account has ever logged in.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlreadyFirstLogin(Boolean AlreadyFirstLogin) {
        this.AlreadyFirstLogin = AlreadyFirstLogin;
    }

    /**
     * Get Tenant ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TenantId Tenant ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set Tenant ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TenantId Tenant ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get User directory ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserStoreId User directory ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set User directory ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserStoreId User directory ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get Version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version Version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set Version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version Version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get Lock type (locked by admin or locked by login policy)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LockType Lock type (locked by admin or locked by login policy)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLockType() {
        return this.LockType;
    }

    /**
     * Set Lock type (locked by admin or locked by login policy)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LockType Lock type (locked by admin or locked by login policy)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLockType(String LockType) {
        this.LockType = LockType;
    }

    /**
     * Get Lock time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LockTime Lock time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLockTime() {
        return this.LockTime;
    }

    /**
     * Set Lock time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LockTime Lock time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLockTime(Long LockTime) {
        this.LockTime = LockTime;
    }

    /**
     * Get Index field 1
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IndexedAttribute1 Index field 1
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIndexedAttribute1() {
        return this.IndexedAttribute1;
    }

    /**
     * Set Index field 1
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IndexedAttribute1 Index field 1
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIndexedAttribute1(String IndexedAttribute1) {
        this.IndexedAttribute1 = IndexedAttribute1;
    }

    /**
     * Get Index field 2
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IndexedAttribute2 Index field 2
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIndexedAttribute2() {
        return this.IndexedAttribute2;
    }

    /**
     * Set Index field 2
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IndexedAttribute2 Index field 2
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIndexedAttribute2(String IndexedAttribute2) {
        this.IndexedAttribute2 = IndexedAttribute2;
    }

    /**
     * Get Index field 3
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IndexedAttribute3 Index field 3
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIndexedAttribute3() {
        return this.IndexedAttribute3;
    }

    /**
     * Set Index field 3
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IndexedAttribute3 Index field 3
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIndexedAttribute3(String IndexedAttribute3) {
        this.IndexedAttribute3 = IndexedAttribute3;
    }

    /**
     * Get Index field 4
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IndexedAttribute4 Index field 4
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIndexedAttribute4() {
        return this.IndexedAttribute4;
    }

    /**
     * Set Index field 4
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IndexedAttribute4 Index field 4
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIndexedAttribute4(String IndexedAttribute4) {
        this.IndexedAttribute4 = IndexedAttribute4;
    }

    /**
     * Get Index field 5
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IndexedAttribute5 Index field 5
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIndexedAttribute5() {
        return this.IndexedAttribute5;
    }

    /**
     * Set Index field 5
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IndexedAttribute5 Index field 5
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIndexedAttribute5(String IndexedAttribute5) {
        this.IndexedAttribute5 = IndexedAttribute5;
    }

    public User() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public User(User source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.LastSignOn != null) {
            this.LastSignOn = new Long(source.LastSignOn);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new Long(source.CreatedDate);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.UserDataSourceEnum != null) {
            this.UserDataSourceEnum = new String(source.UserDataSourceEnum);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Birthdate != null) {
            this.Birthdate = new Long(source.Birthdate);
        }
        if (source.UserGroups != null) {
            this.UserGroups = new String[source.UserGroups.length];
            for (int i = 0; i < source.UserGroups.length; i++) {
                this.UserGroups[i] = new String(source.UserGroups[i]);
            }
        }
        if (source.LastModifiedDate != null) {
            this.LastModifiedDate = new Long(source.LastModifiedDate);
        }
        if (source.CustomAttributes != null) {
            this.CustomAttributes = new MemberMap[source.CustomAttributes.length];
            for (int i = 0; i < source.CustomAttributes.length; i++) {
                this.CustomAttributes[i] = new MemberMap(source.CustomAttributes[i]);
            }
        }
        if (source.ResidentIdentityCard != null) {
            this.ResidentIdentityCard = new String(source.ResidentIdentityCard);
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
        if (source.Primary != null) {
            this.Primary = new Boolean(source.Primary);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.AlreadyFirstLogin != null) {
            this.AlreadyFirstLogin = new Boolean(source.AlreadyFirstLogin);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
        }
        if (source.LockType != null) {
            this.LockType = new String(source.LockType);
        }
        if (source.LockTime != null) {
            this.LockTime = new Long(source.LockTime);
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
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "LastSignOn", this.LastSignOn);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UserDataSourceEnum", this.UserDataSourceEnum);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Birthdate", this.Birthdate);
        this.setParamArraySimple(map, prefix + "UserGroups.", this.UserGroups);
        this.setParamSimple(map, prefix + "LastModifiedDate", this.LastModifiedDate);
        this.setParamArrayObj(map, prefix + "CustomAttributes.", this.CustomAttributes);
        this.setParamSimple(map, prefix + "ResidentIdentityCard", this.ResidentIdentityCard);
        this.setParamSimple(map, prefix + "QqOpenId", this.QqOpenId);
        this.setParamSimple(map, prefix + "QqUnionId", this.QqUnionId);
        this.setParamSimple(map, prefix + "WechatOpenId", this.WechatOpenId);
        this.setParamSimple(map, prefix + "WechatUnionId", this.WechatUnionId);
        this.setParamSimple(map, prefix + "AlipayUserId", this.AlipayUserId);
        this.setParamSimple(map, prefix + "WeComUserId", this.WeComUserId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Locale", this.Locale);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "IdentityVerificationMethod", this.IdentityVerificationMethod);
        this.setParamSimple(map, prefix + "IdentityVerified", this.IdentityVerified);
        this.setParamSimple(map, prefix + "Job", this.Job);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "Primary", this.Primary);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "AlreadyFirstLogin", this.AlreadyFirstLogin);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "LockType", this.LockType);
        this.setParamSimple(map, prefix + "LockTime", this.LockTime);
        this.setParamSimple(map, prefix + "IndexedAttribute1", this.IndexedAttribute1);
        this.setParamSimple(map, prefix + "IndexedAttribute2", this.IndexedAttribute2);
        this.setParamSimple(map, prefix + "IndexedAttribute3", this.IndexedAttribute3);
        this.setParamSimple(map, prefix + "IndexedAttribute4", this.IndexedAttribute4);
        this.setParamSimple(map, prefix + "IndexedAttribute5", this.IndexedAttribute5);

    }
}

