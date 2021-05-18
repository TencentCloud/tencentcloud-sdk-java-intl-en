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
    * The account type identification of the newly created customer. The value of this interface is: business
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * Registered email address. The caller needs to ensure the validity and correctness of the email address.
The email format must be met. For example: account@qq.com
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * Account password.
Length limit: [8,20].
It must also contain numbers, letters and special symbols (!@#$%^&*() and other non-spaces)
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Reconfirm the password. It must be the same as the Password value
    */
    @SerializedName("ConfirmPassword")
    @Expose
    private String ConfirmPassword;

    /**
    * Customer's mobile phone number. The caller is required to ensure the validity and correctness of the mobile phone number.
Length limit: [1,32]. Global mobile phone numbers are supported. For example, 18888888888
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * The country code of the customer. For the value, please refer to the GetCountryCodes interface GetCountryCodes. Such as 86
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * Customer's IOS2 standard country code. Refer to the GetCountryCodes interface for obtaining country codes. It needs to correspond to the CountryCode value. Such as CN
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Extension field, default is empty
    */
    @SerializedName("Extended")
    @Expose
    private String Extended;

    /**
     * Get The account type identification of the newly created customer. The value of this interface is: business 
     * @return AccountType The account type identification of the newly created customer. The value of this interface is: business
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set The account type identification of the newly created customer. The value of this interface is: business
     * @param AccountType The account type identification of the newly created customer. The value of this interface is: business
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get Registered email address. The caller needs to ensure the validity and correctness of the email address.
The email format must be met. For example: account@qq.com 
     * @return Mail Registered email address. The caller needs to ensure the validity and correctness of the email address.
The email format must be met. For example: account@qq.com
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set Registered email address. The caller needs to ensure the validity and correctness of the email address.
The email format must be met. For example: account@qq.com
     * @param Mail Registered email address. The caller needs to ensure the validity and correctness of the email address.
The email format must be met. For example: account@qq.com
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get Account password.
Length limit: [8,20].
It must also contain numbers, letters and special symbols (!@#$%^&*() and other non-spaces) 
     * @return Password Account password.
Length limit: [8,20].
It must also contain numbers, letters and special symbols (!@#$%^&*() and other non-spaces)
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Account password.
Length limit: [8,20].
It must also contain numbers, letters and special symbols (!@#$%^&*() and other non-spaces)
     * @param Password Account password.
Length limit: [8,20].
It must also contain numbers, letters and special symbols (!@#$%^&*() and other non-spaces)
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Reconfirm the password. It must be the same as the Password value 
     * @return ConfirmPassword Reconfirm the password. It must be the same as the Password value
     */
    public String getConfirmPassword() {
        return this.ConfirmPassword;
    }

    /**
     * Set Reconfirm the password. It must be the same as the Password value
     * @param ConfirmPassword Reconfirm the password. It must be the same as the Password value
     */
    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }

    /**
     * Get Customer's mobile phone number. The caller is required to ensure the validity and correctness of the mobile phone number.
Length limit: [1,32]. Global mobile phone numbers are supported. For example, 18888888888 
     * @return PhoneNum Customer's mobile phone number. The caller is required to ensure the validity and correctness of the mobile phone number.
Length limit: [1,32]. Global mobile phone numbers are supported. For example, 18888888888
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set Customer's mobile phone number. The caller is required to ensure the validity and correctness of the mobile phone number.
Length limit: [1,32]. Global mobile phone numbers are supported. For example, 18888888888
     * @param PhoneNum Customer's mobile phone number. The caller is required to ensure the validity and correctness of the mobile phone number.
Length limit: [1,32]. Global mobile phone numbers are supported. For example, 18888888888
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get The country code of the customer. For the value, please refer to the GetCountryCodes interface GetCountryCodes. Such as 86 
     * @return CountryCode The country code of the customer. For the value, please refer to the GetCountryCodes interface GetCountryCodes. Such as 86
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set The country code of the customer. For the value, please refer to the GetCountryCodes interface GetCountryCodes. Such as 86
     * @param CountryCode The country code of the customer. For the value, please refer to the GetCountryCodes interface GetCountryCodes. Such as 86
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get Customer's IOS2 standard country code. Refer to the GetCountryCodes interface for obtaining country codes. It needs to correspond to the CountryCode value. Such as CN 
     * @return Area Customer's IOS2 standard country code. Refer to the GetCountryCodes interface for obtaining country codes. It needs to correspond to the CountryCode value. Such as CN
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Customer's IOS2 standard country code. Refer to the GetCountryCodes interface for obtaining country codes. It needs to correspond to the CountryCode value. Such as CN
     * @param Area Customer's IOS2 standard country code. Refer to the GetCountryCodes interface for obtaining country codes. It needs to correspond to the CountryCode value. Such as CN
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Extension field, default is empty 
     * @return Extended Extension field, default is empty
     */
    public String getExtended() {
        return this.Extended;
    }

    /**
     * Set Extension field, default is empty
     * @param Extended Extension field, default is empty
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

