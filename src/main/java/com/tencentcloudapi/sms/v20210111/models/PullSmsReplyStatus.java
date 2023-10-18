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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PullSmsReplyStatus extends AbstractModel {

    /**
    * SMS code number extension, which is not activated by default. If you need to activate it, please contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
    */
    @SerializedName("ExtendCode")
    @Expose
    private String ExtendCode;

    /**
    * Country (or region) code.
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * Mobile number in the E.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * SMS signature name.
    */
    @SerializedName("SignName")
    @Expose
    private String SignName;

    /**
    * User reply.
    */
    @SerializedName("ReplyContent")
    @Expose
    private String ReplyContent;

    /**
    * Reply time in seconds in the format of UNIX timestamp.
    */
    @SerializedName("ReplyTime")
    @Expose
    private Long ReplyTime;

    /**
    * User's mobile number in a common format such as 13711112222.
    */
    @SerializedName("SubscriberNumber")
    @Expose
    private String SubscriberNumber;

    /**
     * Get SMS code number extension, which is not activated by default. If you need to activate it, please contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81). 
     * @return ExtendCode SMS code number extension, which is not activated by default. If you need to activate it, please contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
     */
    public String getExtendCode() {
        return this.ExtendCode;
    }

    /**
     * Set SMS code number extension, which is not activated by default. If you need to activate it, please contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
     * @param ExtendCode SMS code number extension, which is not activated by default. If you need to activate it, please contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1#.E6.8A.80.E6.9C.AF.E4.BA.A4.E6.B5.81).
     */
    public void setExtendCode(String ExtendCode) {
        this.ExtendCode = ExtendCode;
    }

    /**
     * Get Country (or region) code. 
     * @return CountryCode Country (or region) code.
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set Country (or region) code.
     * @param CountryCode Country (or region) code.
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get Mobile number in the E.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number). 
     * @return PhoneNumber Mobile number in the E.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set Mobile number in the E.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     * @param PhoneNumber Mobile number in the E.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get SMS signature name. 
     * @return SignName SMS signature name.
     */
    public String getSignName() {
        return this.SignName;
    }

    /**
     * Set SMS signature name.
     * @param SignName SMS signature name.
     */
    public void setSignName(String SignName) {
        this.SignName = SignName;
    }

    /**
     * Get User reply. 
     * @return ReplyContent User reply.
     */
    public String getReplyContent() {
        return this.ReplyContent;
    }

    /**
     * Set User reply.
     * @param ReplyContent User reply.
     */
    public void setReplyContent(String ReplyContent) {
        this.ReplyContent = ReplyContent;
    }

    /**
     * Get Reply time in seconds in the format of UNIX timestamp. 
     * @return ReplyTime Reply time in seconds in the format of UNIX timestamp.
     */
    public Long getReplyTime() {
        return this.ReplyTime;
    }

    /**
     * Set Reply time in seconds in the format of UNIX timestamp.
     * @param ReplyTime Reply time in seconds in the format of UNIX timestamp.
     */
    public void setReplyTime(Long ReplyTime) {
        this.ReplyTime = ReplyTime;
    }

    /**
     * Get User's mobile number in a common format such as 13711112222. 
     * @return SubscriberNumber User's mobile number in a common format such as 13711112222.
     */
    public String getSubscriberNumber() {
        return this.SubscriberNumber;
    }

    /**
     * Set User's mobile number in a common format such as 13711112222.
     * @param SubscriberNumber User's mobile number in a common format such as 13711112222.
     */
    public void setSubscriberNumber(String SubscriberNumber) {
        this.SubscriberNumber = SubscriberNumber;
    }

    public PullSmsReplyStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullSmsReplyStatus(PullSmsReplyStatus source) {
        if (source.ExtendCode != null) {
            this.ExtendCode = new String(source.ExtendCode);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.SignName != null) {
            this.SignName = new String(source.SignName);
        }
        if (source.ReplyContent != null) {
            this.ReplyContent = new String(source.ReplyContent);
        }
        if (source.ReplyTime != null) {
            this.ReplyTime = new Long(source.ReplyTime);
        }
        if (source.SubscriberNumber != null) {
            this.SubscriberNumber = new String(source.SubscriberNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExtendCode", this.ExtendCode);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "SignName", this.SignName);
        this.setParamSimple(map, prefix + "ReplyContent", this.ReplyContent);
        this.setParamSimple(map, prefix + "ReplyTime", this.ReplyTime);
        this.setParamSimple(map, prefix + "SubscriberNumber", this.SubscriberNumber);

    }
}

