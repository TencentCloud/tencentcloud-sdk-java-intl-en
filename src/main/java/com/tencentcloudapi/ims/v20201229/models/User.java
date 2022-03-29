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
package com.tencentcloudapi.ims.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class User extends AbstractModel{

    /**
    * This field indicates the business user ID. After it is specified, the system can optimize the moderation result according to the violation history to facilitate determination when a suspicious violation risk exists.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * This field indicates the nickname of the business user's account.
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * This field indicates the account type of the business user ID.<br>
This field can be used together with the ID parameter (UserId) to uniquely identify the account.
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * This field indicates the gender of the business user's account.<br>
Valid values: **0** (default value): unknown; **1** (male); **2** (female).
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * This field indicates the age of the business user's account.<br>
Valid values: integers between **0** (default value, which indicates unknown) and **custom age limit**.
    */
    @SerializedName("Age")
    @Expose
    private Long Age;

    /**
    * This field indicates the level of the business user's account.<br>
Valid values: **0** (default value): unknown; **1**: low level; **2**: medium level; **3**: high level. Currently, **the level is not customizable**.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * This field indicates the mobile number of the business user's account. It supports recording mobile numbers across the world.<br>
Note: you need to use a consistent mobile number format, such as area code format (086/+86).
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * This field indicates the profile of the business user. It can contain **up to 5,000 letters and special symbols**.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * This field indicates the access URL of the business user's profile photo in PNG, JPG, JPEG, BMP, GIF, or WEBP format.<br>Note: the profile photo **cannot exceed 5 MB in size**. **A resolution of 256x256 or higher** is recommended. The image download time should be limited to 3 seconds; otherwise, a download timeout will be returned.
    */
    @SerializedName("HeadUrl")
    @Expose
    private String HeadUrl;

    /**
     * Get This field indicates the business user ID. After it is specified, the system can optimize the moderation result according to the violation history to facilitate determination when a suspicious violation risk exists. 
     * @return UserId This field indicates the business user ID. After it is specified, the system can optimize the moderation result according to the violation history to facilitate determination when a suspicious violation risk exists.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set This field indicates the business user ID. After it is specified, the system can optimize the moderation result according to the violation history to facilitate determination when a suspicious violation risk exists.
     * @param UserId This field indicates the business user ID. After it is specified, the system can optimize the moderation result according to the violation history to facilitate determination when a suspicious violation risk exists.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get This field indicates the nickname of the business user's account. 
     * @return Nickname This field indicates the nickname of the business user's account.
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set This field indicates the nickname of the business user's account.
     * @param Nickname This field indicates the nickname of the business user's account.
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get This field indicates the account type of the business user ID.<br>
This field can be used together with the ID parameter (UserId) to uniquely identify the account. 
     * @return AccountType This field indicates the account type of the business user ID.<br>
This field can be used together with the ID parameter (UserId) to uniquely identify the account.
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set This field indicates the account type of the business user ID.<br>
This field can be used together with the ID parameter (UserId) to uniquely identify the account.
     * @param AccountType This field indicates the account type of the business user ID.<br>
This field can be used together with the ID parameter (UserId) to uniquely identify the account.
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get This field indicates the gender of the business user's account.<br>
Valid values: **0** (default value): unknown; **1** (male); **2** (female). 
     * @return Gender This field indicates the gender of the business user's account.<br>
Valid values: **0** (default value): unknown; **1** (male); **2** (female).
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set This field indicates the gender of the business user's account.<br>
Valid values: **0** (default value): unknown; **1** (male); **2** (female).
     * @param Gender This field indicates the gender of the business user's account.<br>
Valid values: **0** (default value): unknown; **1** (male); **2** (female).
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get This field indicates the age of the business user's account.<br>
Valid values: integers between **0** (default value, which indicates unknown) and **custom age limit**. 
     * @return Age This field indicates the age of the business user's account.<br>
Valid values: integers between **0** (default value, which indicates unknown) and **custom age limit**.
     */
    public Long getAge() {
        return this.Age;
    }

    /**
     * Set This field indicates the age of the business user's account.<br>
Valid values: integers between **0** (default value, which indicates unknown) and **custom age limit**.
     * @param Age This field indicates the age of the business user's account.<br>
Valid values: integers between **0** (default value, which indicates unknown) and **custom age limit**.
     */
    public void setAge(Long Age) {
        this.Age = Age;
    }

    /**
     * Get This field indicates the level of the business user's account.<br>
Valid values: **0** (default value): unknown; **1**: low level; **2**: medium level; **3**: high level. Currently, **the level is not customizable**. 
     * @return Level This field indicates the level of the business user's account.<br>
Valid values: **0** (default value): unknown; **1**: low level; **2**: medium level; **3**: high level. Currently, **the level is not customizable**.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set This field indicates the level of the business user's account.<br>
Valid values: **0** (default value): unknown; **1**: low level; **2**: medium level; **3**: high level. Currently, **the level is not customizable**.
     * @param Level This field indicates the level of the business user's account.<br>
Valid values: **0** (default value): unknown; **1**: low level; **2**: medium level; **3**: high level. Currently, **the level is not customizable**.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get This field indicates the mobile number of the business user's account. It supports recording mobile numbers across the world.<br>
Note: you need to use a consistent mobile number format, such as area code format (086/+86). 
     * @return Phone This field indicates the mobile number of the business user's account. It supports recording mobile numbers across the world.<br>
Note: you need to use a consistent mobile number format, such as area code format (086/+86).
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set This field indicates the mobile number of the business user's account. It supports recording mobile numbers across the world.<br>
Note: you need to use a consistent mobile number format, such as area code format (086/+86).
     * @param Phone This field indicates the mobile number of the business user's account. It supports recording mobile numbers across the world.<br>
Note: you need to use a consistent mobile number format, such as area code format (086/+86).
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get This field indicates the profile of the business user. It can contain **up to 5,000 letters and special symbols**. 
     * @return Desc This field indicates the profile of the business user. It can contain **up to 5,000 letters and special symbols**.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set This field indicates the profile of the business user. It can contain **up to 5,000 letters and special symbols**.
     * @param Desc This field indicates the profile of the business user. It can contain **up to 5,000 letters and special symbols**.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get This field indicates the access URL of the business user's profile photo in PNG, JPG, JPEG, BMP, GIF, or WEBP format.<br>Note: the profile photo **cannot exceed 5 MB in size**. **A resolution of 256x256 or higher** is recommended. The image download time should be limited to 3 seconds; otherwise, a download timeout will be returned. 
     * @return HeadUrl This field indicates the access URL of the business user's profile photo in PNG, JPG, JPEG, BMP, GIF, or WEBP format.<br>Note: the profile photo **cannot exceed 5 MB in size**. **A resolution of 256x256 or higher** is recommended. The image download time should be limited to 3 seconds; otherwise, a download timeout will be returned.
     */
    public String getHeadUrl() {
        return this.HeadUrl;
    }

    /**
     * Set This field indicates the access URL of the business user's profile photo in PNG, JPG, JPEG, BMP, GIF, or WEBP format.<br>Note: the profile photo **cannot exceed 5 MB in size**. **A resolution of 256x256 or higher** is recommended. The image download time should be limited to 3 seconds; otherwise, a download timeout will be returned.
     * @param HeadUrl This field indicates the access URL of the business user's profile photo in PNG, JPG, JPEG, BMP, GIF, or WEBP format.<br>Note: the profile photo **cannot exceed 5 MB in size**. **A resolution of 256x256 or higher** is recommended. The image download time should be limited to 3 seconds; otherwise, a download timeout will be returned.
     */
    public void setHeadUrl(String HeadUrl) {
        this.HeadUrl = HeadUrl;
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
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
        if (source.Gender != null) {
            this.Gender = new Long(source.Gender);
        }
        if (source.Age != null) {
            this.Age = new Long(source.Age);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.HeadUrl != null) {
            this.HeadUrl = new String(source.HeadUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "HeadUrl", this.HeadUrl);

    }
}

