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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserRequest extends AbstractModel{

    /**
    * User directory ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

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
    * Password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

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
    * Date of birth
    */
    @SerializedName("Birthdate")
    @Expose
    private Long Birthdate;

    /**
    * Custom attribute
    */
    @SerializedName("CustomizationAttributes")
    @Expose
    private MemberMap [] CustomizationAttributes;

    /**
     * Get User directory ID 
     * @return UserStoreId User directory ID
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set User directory ID
     * @param UserStoreId User directory ID
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
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
     * Get Password 
     * @return Password Password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password
     * @param Password Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

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
     * Get Date of birth 
     * @return Birthdate Date of birth
     */
    public Long getBirthdate() {
        return this.Birthdate;
    }

    /**
     * Set Date of birth
     * @param Birthdate Date of birth
     */
    public void setBirthdate(Long Birthdate) {
        this.Birthdate = Birthdate;
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

    public CreateUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserRequest(CreateUserRequest source) {
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
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
        if (source.Birthdate != null) {
            this.Birthdate = new Long(source.Birthdate);
        }
        if (source.CustomizationAttributes != null) {
            this.CustomizationAttributes = new MemberMap[source.CustomizationAttributes.length];
            for (int i = 0; i < source.CustomizationAttributes.length; i++) {
                this.CustomizationAttributes[i] = new MemberMap(source.CustomizationAttributes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamArraySimple(map, prefix + "UserGroup.", this.UserGroup);
        this.setParamSimple(map, prefix + "Birthdate", this.Birthdate);
        this.setParamArrayObj(map, prefix + "CustomizationAttributes.", this.CustomizationAttributes);

    }
}

