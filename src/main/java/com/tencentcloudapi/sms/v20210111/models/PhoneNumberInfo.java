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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PhoneNumberInfo extends AbstractModel{

    /**
    * Error code for mobile number information query. `Ok` will be returned if the query is successful.
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Description of the error code for mobile number information query.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Country (or region) code.
    */
    @SerializedName("NationCode")
    @Expose
    private String NationCode;

    /**
    * Subscriber number in normal format such as 13711112222, without any prefix (country or region code).
    */
    @SerializedName("SubscriberNumber")
    @Expose
    private String SubscriberNumber;

    /**
    * The standardized mobile number in E.164 format after parsing, which is consistent with the parsed number for SMS message delivery. If the parsing fails, the original number will be returned.
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * Country or region code such as CN and US. If the country or region code cannot be identified, `DEF` will be returned by default.
    */
    @SerializedName("IsoCode")
    @Expose
    private String IsoCode;

    /**
    * Country code or region name such as China. For more information, see [Global SMS Price Overview](https://intl.cloud.tencent.com/document/product/382/18051?from_cn_redirect=1#.E6.97.A5.E7.BB.93.E5.90.8E.E4.BB.98.E8.B4.B9.3Ca-id.3D.22post-payment.22.3E.3C.2Fa.3E)
    */
    @SerializedName("IsoName")
    @Expose
    private String IsoName;

    /**
     * Get Error code for mobile number information query. `Ok` will be returned if the query is successful. 
     * @return Code Error code for mobile number information query. `Ok` will be returned if the query is successful.
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Error code for mobile number information query. `Ok` will be returned if the query is successful.
     * @param Code Error code for mobile number information query. `Ok` will be returned if the query is successful.
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get Description of the error code for mobile number information query. 
     * @return Message Description of the error code for mobile number information query.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Description of the error code for mobile number information query.
     * @param Message Description of the error code for mobile number information query.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Country (or region) code. 
     * @return NationCode Country (or region) code.
     */
    public String getNationCode() {
        return this.NationCode;
    }

    /**
     * Set Country (or region) code.
     * @param NationCode Country (or region) code.
     */
    public void setNationCode(String NationCode) {
        this.NationCode = NationCode;
    }

    /**
     * Get Subscriber number in normal format such as 13711112222, without any prefix (country or region code). 
     * @return SubscriberNumber Subscriber number in normal format such as 13711112222, without any prefix (country or region code).
     */
    public String getSubscriberNumber() {
        return this.SubscriberNumber;
    }

    /**
     * Set Subscriber number in normal format such as 13711112222, without any prefix (country or region code).
     * @param SubscriberNumber Subscriber number in normal format such as 13711112222, without any prefix (country or region code).
     */
    public void setSubscriberNumber(String SubscriberNumber) {
        this.SubscriberNumber = SubscriberNumber;
    }

    /**
     * Get The standardized mobile number in E.164 format after parsing, which is consistent with the parsed number for SMS message delivery. If the parsing fails, the original number will be returned. 
     * @return PhoneNumber The standardized mobile number in E.164 format after parsing, which is consistent with the parsed number for SMS message delivery. If the parsing fails, the original number will be returned.
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set The standardized mobile number in E.164 format after parsing, which is consistent with the parsed number for SMS message delivery. If the parsing fails, the original number will be returned.
     * @param PhoneNumber The standardized mobile number in E.164 format after parsing, which is consistent with the parsed number for SMS message delivery. If the parsing fails, the original number will be returned.
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get Country or region code such as CN and US. If the country or region code cannot be identified, `DEF` will be returned by default. 
     * @return IsoCode Country or region code such as CN and US. If the country or region code cannot be identified, `DEF` will be returned by default.
     */
    public String getIsoCode() {
        return this.IsoCode;
    }

    /**
     * Set Country or region code such as CN and US. If the country or region code cannot be identified, `DEF` will be returned by default.
     * @param IsoCode Country or region code such as CN and US. If the country or region code cannot be identified, `DEF` will be returned by default.
     */
    public void setIsoCode(String IsoCode) {
        this.IsoCode = IsoCode;
    }

    /**
     * Get Country code or region name such as China. For more information, see [Global SMS Price Overview](https://intl.cloud.tencent.com/document/product/382/18051?from_cn_redirect=1#.E6.97.A5.E7.BB.93.E5.90.8E.E4.BB.98.E8.B4.B9.3Ca-id.3D.22post-payment.22.3E.3C.2Fa.3E) 
     * @return IsoName Country code or region name such as China. For more information, see [Global SMS Price Overview](https://intl.cloud.tencent.com/document/product/382/18051?from_cn_redirect=1#.E6.97.A5.E7.BB.93.E5.90.8E.E4.BB.98.E8.B4.B9.3Ca-id.3D.22post-payment.22.3E.3C.2Fa.3E)
     */
    public String getIsoName() {
        return this.IsoName;
    }

    /**
     * Set Country code or region name such as China. For more information, see [Global SMS Price Overview](https://intl.cloud.tencent.com/document/product/382/18051?from_cn_redirect=1#.E6.97.A5.E7.BB.93.E5.90.8E.E4.BB.98.E8.B4.B9.3Ca-id.3D.22post-payment.22.3E.3C.2Fa.3E)
     * @param IsoName Country code or region name such as China. For more information, see [Global SMS Price Overview](https://intl.cloud.tencent.com/document/product/382/18051?from_cn_redirect=1#.E6.97.A5.E7.BB.93.E5.90.8E.E4.BB.98.E8.B4.B9.3Ca-id.3D.22post-payment.22.3E.3C.2Fa.3E)
     */
    public void setIsoName(String IsoName) {
        this.IsoName = IsoName;
    }

    public PhoneNumberInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhoneNumberInfo(PhoneNumberInfo source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.NationCode != null) {
            this.NationCode = new String(source.NationCode);
        }
        if (source.SubscriberNumber != null) {
            this.SubscriberNumber = new String(source.SubscriberNumber);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.IsoCode != null) {
            this.IsoCode = new String(source.IsoCode);
        }
        if (source.IsoName != null) {
            this.IsoName = new String(source.IsoName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "NationCode", this.NationCode);
        this.setParamSimple(map, prefix + "SubscriberNumber", this.SubscriberNumber);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "IsoCode", this.IsoCode);
        this.setParamSimple(map, prefix + "IsoName", this.IsoName);

    }
}

