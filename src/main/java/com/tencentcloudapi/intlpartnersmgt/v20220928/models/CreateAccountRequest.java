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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccountRequest extends AbstractModel {

    /**
    * Account type of a new customer.
Valid values: `personal`, `company`.
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * Registered email address, which should be valid and correct.
such as "account@qq.com"
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * Account password.
Length limit: 8-20 characters
A password must contain numbers, letters, and symbols (!@#$%^&*()). Space is not allowed.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * The confirmed password, which must be the same as that entered in the `Password` field.
    */
    @SerializedName("ConfirmPassword")
    @Expose
    private String ConfirmPassword;

    /**
    * Customer's mobile number.
The caller needs to ensure the validity and correctness of the mobile number. A global mobile number within a range of 1-32 digits is allowed.
The system will perform binding limit verification of the mobile number you provide, allowing a maximum of 5 accounts per mobile number.
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * Customer's country/region code, which can be obtained via the  [GetCountryCodes API](https://www.tencentcloud.com/document/product/1085/51416), such as "852".
Parameter value is not allowed to be 7,380,86.
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * Customer's ISO2 standard country/region code, which can be obtained via the [GetCountryCodes API](https://www.tencentcloud.com/document/product/1085/51416). It should correspond to the `CountryCode` field, such as `HK`.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Extension field, which is left empty by default.
    */
    @SerializedName("Extended")
    @Expose
    private String Extended;

    /**
    * VerifyCode. This parameter is required. 
Use the [SendVerifyCode API](https://www.tencentcloud.com/document/product/1085/65907) to obtain the verifycode.The SendVerifyCode API sends a 6-digit verifycode to your specified mobile number via SMS. After receiving it, you need to pass it along with other parameters.
    */
    @SerializedName("VerifyCode")
    @Expose
    private String VerifyCode;

    /**
    * Layer-1 industry id. This is a required item and can be obtained via the [ GetTradeConfigList  API](https://www.tencentcloud.com/zh/document/product/1085/68181).
    */
    @SerializedName("TradeOne")
    @Expose
    private String TradeOne;

    /**
    * Layer-2 industry id. This is a required item and can be obtained via the [ GetTradeConfigList API](https://www.tencentcloud.com/zh/document/product/1085/68181).
    */
    @SerializedName("TradeTwo")
    @Expose
    private String TradeTwo;

    /**
     * Get Account type of a new customer.
Valid values: `personal`, `company`. 
     * @return AccountType Account type of a new customer.
Valid values: `personal`, `company`.
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set Account type of a new customer.
Valid values: `personal`, `company`.
     * @param AccountType Account type of a new customer.
Valid values: `personal`, `company`.
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get Registered email address, which should be valid and correct.
such as "account@qq.com" 
     * @return Mail Registered email address, which should be valid and correct.
such as "account@qq.com"
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set Registered email address, which should be valid and correct.
such as "account@qq.com"
     * @param Mail Registered email address, which should be valid and correct.
such as "account@qq.com"
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get Account password.
Length limit: 8-20 characters
A password must contain numbers, letters, and symbols (!@#$%^&*()). Space is not allowed. 
     * @return Password Account password.
Length limit: 8-20 characters
A password must contain numbers, letters, and symbols (!@#$%^&*()). Space is not allowed.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Account password.
Length limit: 8-20 characters
A password must contain numbers, letters, and symbols (!@#$%^&*()). Space is not allowed.
     * @param Password Account password.
Length limit: 8-20 characters
A password must contain numbers, letters, and symbols (!@#$%^&*()). Space is not allowed.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get The confirmed password, which must be the same as that entered in the `Password` field. 
     * @return ConfirmPassword The confirmed password, which must be the same as that entered in the `Password` field.
     */
    public String getConfirmPassword() {
        return this.ConfirmPassword;
    }

    /**
     * Set The confirmed password, which must be the same as that entered in the `Password` field.
     * @param ConfirmPassword The confirmed password, which must be the same as that entered in the `Password` field.
     */
    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }

    /**
     * Get Customer's mobile number.
The caller needs to ensure the validity and correctness of the mobile number. A global mobile number within a range of 1-32 digits is allowed.
The system will perform binding limit verification of the mobile number you provide, allowing a maximum of 5 accounts per mobile number. 
     * @return PhoneNum Customer's mobile number.
The caller needs to ensure the validity and correctness of the mobile number. A global mobile number within a range of 1-32 digits is allowed.
The system will perform binding limit verification of the mobile number you provide, allowing a maximum of 5 accounts per mobile number.
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set Customer's mobile number.
The caller needs to ensure the validity and correctness of the mobile number. A global mobile number within a range of 1-32 digits is allowed.
The system will perform binding limit verification of the mobile number you provide, allowing a maximum of 5 accounts per mobile number.
     * @param PhoneNum Customer's mobile number.
The caller needs to ensure the validity and correctness of the mobile number. A global mobile number within a range of 1-32 digits is allowed.
The system will perform binding limit verification of the mobile number you provide, allowing a maximum of 5 accounts per mobile number.
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get Customer's country/region code, which can be obtained via the  [GetCountryCodes API](https://www.tencentcloud.com/document/product/1085/51416), such as "852".
Parameter value is not allowed to be 7,380,86. 
     * @return CountryCode Customer's country/region code, which can be obtained via the  [GetCountryCodes API](https://www.tencentcloud.com/document/product/1085/51416), such as "852".
Parameter value is not allowed to be 7,380,86.
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set Customer's country/region code, which can be obtained via the  [GetCountryCodes API](https://www.tencentcloud.com/document/product/1085/51416), such as "852".
Parameter value is not allowed to be 7,380,86.
     * @param CountryCode Customer's country/region code, which can be obtained via the  [GetCountryCodes API](https://www.tencentcloud.com/document/product/1085/51416), such as "852".
Parameter value is not allowed to be 7,380,86.
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get Customer's ISO2 standard country/region code, which can be obtained via the [GetCountryCodes API](https://www.tencentcloud.com/document/product/1085/51416). It should correspond to the `CountryCode` field, such as `HK`. 
     * @return Area Customer's ISO2 standard country/region code, which can be obtained via the [GetCountryCodes API](https://www.tencentcloud.com/document/product/1085/51416). It should correspond to the `CountryCode` field, such as `HK`.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Customer's ISO2 standard country/region code, which can be obtained via the [GetCountryCodes API](https://www.tencentcloud.com/document/product/1085/51416). It should correspond to the `CountryCode` field, such as `HK`.
     * @param Area Customer's ISO2 standard country/region code, which can be obtained via the [GetCountryCodes API](https://www.tencentcloud.com/document/product/1085/51416). It should correspond to the `CountryCode` field, such as `HK`.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Extension field, which is left empty by default. 
     * @return Extended Extension field, which is left empty by default.
     */
    public String getExtended() {
        return this.Extended;
    }

    /**
     * Set Extension field, which is left empty by default.
     * @param Extended Extension field, which is left empty by default.
     */
    public void setExtended(String Extended) {
        this.Extended = Extended;
    }

    /**
     * Get VerifyCode. This parameter is required. 
Use the [SendVerifyCode API](https://www.tencentcloud.com/document/product/1085/65907) to obtain the verifycode.The SendVerifyCode API sends a 6-digit verifycode to your specified mobile number via SMS. After receiving it, you need to pass it along with other parameters. 
     * @return VerifyCode VerifyCode. This parameter is required. 
Use the [SendVerifyCode API](https://www.tencentcloud.com/document/product/1085/65907) to obtain the verifycode.The SendVerifyCode API sends a 6-digit verifycode to your specified mobile number via SMS. After receiving it, you need to pass it along with other parameters.
     */
    public String getVerifyCode() {
        return this.VerifyCode;
    }

    /**
     * Set VerifyCode. This parameter is required. 
Use the [SendVerifyCode API](https://www.tencentcloud.com/document/product/1085/65907) to obtain the verifycode.The SendVerifyCode API sends a 6-digit verifycode to your specified mobile number via SMS. After receiving it, you need to pass it along with other parameters.
     * @param VerifyCode VerifyCode. This parameter is required. 
Use the [SendVerifyCode API](https://www.tencentcloud.com/document/product/1085/65907) to obtain the verifycode.The SendVerifyCode API sends a 6-digit verifycode to your specified mobile number via SMS. After receiving it, you need to pass it along with other parameters.
     */
    public void setVerifyCode(String VerifyCode) {
        this.VerifyCode = VerifyCode;
    }

    /**
     * Get Layer-1 industry id. This is a required item and can be obtained via the [ GetTradeConfigList  API](https://www.tencentcloud.com/zh/document/product/1085/68181). 
     * @return TradeOne Layer-1 industry id. This is a required item and can be obtained via the [ GetTradeConfigList  API](https://www.tencentcloud.com/zh/document/product/1085/68181).
     */
    public String getTradeOne() {
        return this.TradeOne;
    }

    /**
     * Set Layer-1 industry id. This is a required item and can be obtained via the [ GetTradeConfigList  API](https://www.tencentcloud.com/zh/document/product/1085/68181).
     * @param TradeOne Layer-1 industry id. This is a required item and can be obtained via the [ GetTradeConfigList  API](https://www.tencentcloud.com/zh/document/product/1085/68181).
     */
    public void setTradeOne(String TradeOne) {
        this.TradeOne = TradeOne;
    }

    /**
     * Get Layer-2 industry id. This is a required item and can be obtained via the [ GetTradeConfigList API](https://www.tencentcloud.com/zh/document/product/1085/68181). 
     * @return TradeTwo Layer-2 industry id. This is a required item and can be obtained via the [ GetTradeConfigList API](https://www.tencentcloud.com/zh/document/product/1085/68181).
     */
    public String getTradeTwo() {
        return this.TradeTwo;
    }

    /**
     * Set Layer-2 industry id. This is a required item and can be obtained via the [ GetTradeConfigList API](https://www.tencentcloud.com/zh/document/product/1085/68181).
     * @param TradeTwo Layer-2 industry id. This is a required item and can be obtained via the [ GetTradeConfigList API](https://www.tencentcloud.com/zh/document/product/1085/68181).
     */
    public void setTradeTwo(String TradeTwo) {
        this.TradeTwo = TradeTwo;
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
        if (source.VerifyCode != null) {
            this.VerifyCode = new String(source.VerifyCode);
        }
        if (source.TradeOne != null) {
            this.TradeOne = new String(source.TradeOne);
        }
        if (source.TradeTwo != null) {
            this.TradeTwo = new String(source.TradeTwo);
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
        this.setParamSimple(map, prefix + "VerifyCode", this.VerifyCode);
        this.setParamSimple(map, prefix + "TradeOne", this.TradeOne);
        this.setParamSimple(map, prefix + "TradeTwo", this.TradeTwo);

    }
}

