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
package com.tencentcloudapi.ip.v20210409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccountRequest extends AbstractModel{

    /**
    * Account type of a new customer. Valid value: `business`.
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * Registered email address, which should be valid and correct.
For example, account@qq.com.
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * Account password
Length limit: 8-20 characters
A password must contain numbers, letters, and special symbols [!@#$%^&*()]. Spaces are not allowed.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Confirm the password. It must be the same as the `Password` field.
    */
    @SerializedName("ConfirmPassword")
    @Expose
    private String ConfirmPassword;

    /**
    * Customer mobile number, which should be valid and correct.
A global mobile number within 1-32 digits is allowed, such as 18888888888.
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * Country code, which can be obtained via the `GetCountryCodes` API, such as `86`.
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * ISO2 standard country code, which can be obtained via the `GetCountryCodes` API. It should correspond to the `CountryCode` field.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Expanded field, which is left empty by default.
    */
    @SerializedName("Extended")
    @Expose
    private String Extended;

    /**
     * Get Account type of a new customer. Valid value: `business`. 
     * @return AccountType Account type of a new customer. Valid value: `business`.
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set Account type of a new customer. Valid value: `business`.
     * @param AccountType Account type of a new customer. Valid value: `business`.
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get Registered email address, which should be valid and correct.
For example, account@qq.com. 
     * @return Mail Registered email address, which should be valid and correct.
For example, account@qq.com.
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set Registered email address, which should be valid and correct.
For example, account@qq.com.
     * @param Mail Registered email address, which should be valid and correct.
For example, account@qq.com.
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get Account password
Length limit: 8-20 characters
A password must contain numbers, letters, and special symbols [!@#$%^&*()]. Spaces are not allowed. 
     * @return Password Account password
Length limit: 8-20 characters
A password must contain numbers, letters, and special symbols [!@#$%^&*()]. Spaces are not allowed.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Account password
Length limit: 8-20 characters
A password must contain numbers, letters, and special symbols [!@#$%^&*()]. Spaces are not allowed.
     * @param Password Account password
Length limit: 8-20 characters
A password must contain numbers, letters, and special symbols [!@#$%^&*()]. Spaces are not allowed.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Confirm the password. It must be the same as the `Password` field. 
     * @return ConfirmPassword Confirm the password. It must be the same as the `Password` field.
     */
    public String getConfirmPassword() {
        return this.ConfirmPassword;
    }

    /**
     * Set Confirm the password. It must be the same as the `Password` field.
     * @param ConfirmPassword Confirm the password. It must be the same as the `Password` field.
     */
    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }

    /**
     * Get Customer mobile number, which should be valid and correct.
A global mobile number within 1-32 digits is allowed, such as 18888888888. 
     * @return PhoneNum Customer mobile number, which should be valid and correct.
A global mobile number within 1-32 digits is allowed, such as 18888888888.
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set Customer mobile number, which should be valid and correct.
A global mobile number within 1-32 digits is allowed, such as 18888888888.
     * @param PhoneNum Customer mobile number, which should be valid and correct.
A global mobile number within 1-32 digits is allowed, such as 18888888888.
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get Country code, which can be obtained via the `GetCountryCodes` API, such as `86`. 
     * @return CountryCode Country code, which can be obtained via the `GetCountryCodes` API, such as `86`.
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set Country code, which can be obtained via the `GetCountryCodes` API, such as `86`.
     * @param CountryCode Country code, which can be obtained via the `GetCountryCodes` API, such as `86`.
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get ISO2 standard country code, which can be obtained via the `GetCountryCodes` API. It should correspond to the `CountryCode` field. 
     * @return Area ISO2 standard country code, which can be obtained via the `GetCountryCodes` API. It should correspond to the `CountryCode` field.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set ISO2 standard country code, which can be obtained via the `GetCountryCodes` API. It should correspond to the `CountryCode` field.
     * @param Area ISO2 standard country code, which can be obtained via the `GetCountryCodes` API. It should correspond to the `CountryCode` field.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Expanded field, which is left empty by default. 
     * @return Extended Expanded field, which is left empty by default.
     */
    public String getExtended() {
        return this.Extended;
    }

    /**
     * Set Expanded field, which is left empty by default.
     * @param Extended Expanded field, which is left empty by default.
     */
    public void setExtended(String Extended) {
        this.Extended = Extended;
    }

    public CreateAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccountRequest(CreateAccountRequest source) {
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
        if (source.Mail != null) {
            this.Mail = new String(source.Mail);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ConfirmPassword != null) {
            this.ConfirmPassword = new String(source.ConfirmPassword);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Extended != null) {
            this.Extended = new String(source.Extended);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ConfirmPassword", this.ConfirmPassword);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Extended", this.Extended);

    }
}

