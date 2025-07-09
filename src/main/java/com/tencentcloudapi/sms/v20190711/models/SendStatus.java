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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendStatus extends AbstractModel {

    /**
    * Delivery serial number.
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * Mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * Number of billable SMS messages. For billing rules, please see [Billing Policy](https://intl.cloud.tencent.com/document/product/382/36135?from_cn_redirect=1).
    */
    @SerializedName("Fee")
    @Expose
    private Long Fee;

    /**
    * User session content.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * SMS request error code. For specific meanings, please see Error Codes.
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * SMS request error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Country code or region code, such as CN and US. If the country code or region code is not obtained, the returned value will be 'DEF' by default. For more information on the supported list, see price overview for non-Mainland China regions.
    */
    @SerializedName("IsoCode")
    @Expose
    private String IsoCode;

    /**
     * Get Delivery serial number. 
     * @return SerialNo Delivery serial number.
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set Delivery serial number.
     * @param SerialNo Delivery serial number.
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get Mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number). 
     * @return PhoneNumber Mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set Mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     * @param PhoneNumber Mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get Number of billable SMS messages. For billing rules, please see [Billing Policy](https://intl.cloud.tencent.com/document/product/382/36135?from_cn_redirect=1). 
     * @return Fee Number of billable SMS messages. For billing rules, please see [Billing Policy](https://intl.cloud.tencent.com/document/product/382/36135?from_cn_redirect=1).
     */
    public Long getFee() {
        return this.Fee;
    }

    /**
     * Set Number of billable SMS messages. For billing rules, please see [Billing Policy](https://intl.cloud.tencent.com/document/product/382/36135?from_cn_redirect=1).
     * @param Fee Number of billable SMS messages. For billing rules, please see [Billing Policy](https://intl.cloud.tencent.com/document/product/382/36135?from_cn_redirect=1).
     */
    public void setFee(Long Fee) {
        this.Fee = Fee;
    }

    /**
     * Get User session content. 
     * @return SessionContext User session content.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set User session content.
     * @param SessionContext User session content.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get SMS request error code. For specific meanings, please see Error Codes. 
     * @return Code SMS request error code. For specific meanings, please see Error Codes.
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set SMS request error code. For specific meanings, please see Error Codes.
     * @param Code SMS request error code. For specific meanings, please see Error Codes.
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get SMS request error message. 
     * @return Message SMS request error message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set SMS request error message.
     * @param Message SMS request error message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Country code or region code, such as CN and US. If the country code or region code is not obtained, the returned value will be 'DEF' by default. For more information on the supported list, see price overview for non-Mainland China regions. 
     * @return IsoCode Country code or region code, such as CN and US. If the country code or region code is not obtained, the returned value will be 'DEF' by default. For more information on the supported list, see price overview for non-Mainland China regions.
     */
    public String getIsoCode() {
        return this.IsoCode;
    }

    /**
     * Set Country code or region code, such as CN and US. If the country code or region code is not obtained, the returned value will be 'DEF' by default. For more information on the supported list, see price overview for non-Mainland China regions.
     * @param IsoCode Country code or region code, such as CN and US. If the country code or region code is not obtained, the returned value will be 'DEF' by default. For more information on the supported list, see price overview for non-Mainland China regions.
     */
    public void setIsoCode(String IsoCode) {
        this.IsoCode = IsoCode;
    }

    public SendStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendStatus(SendStatus source) {
        if (source.SerialNo != null) {
            this.SerialNo = new String(source.SerialNo);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.Fee != null) {
            this.Fee = new Long(source.Fee);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.IsoCode != null) {
            this.IsoCode = new String(source.IsoCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Fee", this.Fee);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "IsoCode", this.IsoCode);

    }
}

