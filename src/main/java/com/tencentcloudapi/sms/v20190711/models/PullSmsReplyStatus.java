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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PullSmsReplyStatus extends AbstractModel{

    /**
    * SMS code number extension, which is not activated by default. If you need to activate it, please contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1).
    */
    @SerializedName("ExtendCode")
    @Expose
    private String ExtendCode;

    /**
    * Country (or region) code.
    */
    @SerializedName("NationCode")
    @Expose
    private String NationCode;

    /**
    * Mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * SMS signature.
    */
    @SerializedName("Sign")
    @Expose
    private String Sign;

    /**
    * User reply.
    */
    @SerializedName("ReplyContent")
    @Expose
    private String ReplyContent;

    /**
    * Reply time (e.g., 2019-10-08 17:18:37).
    */
    @SerializedName("ReplyTime")
    @Expose
    private String ReplyTime;

    /**
    * Reply time in seconds in the format of UNIX timestamp.
    */
    @SerializedName("ReplyUnixTime")
    @Expose
    private Long ReplyUnixTime;

    /**
     * Get SMS code number extension, which is not activated by default. If you need to activate it, please contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1). 
     * @return ExtendCode SMS code number extension, which is not activated by default. If you need to activate it, please contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1).
     */
    public String getExtendCode() {
        return this.ExtendCode;
    }

    /**
     * Set SMS code number extension, which is not activated by default. If you need to activate it, please contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1).
     * @param ExtendCode SMS code number extension, which is not activated by default. If you need to activate it, please contact [SMS Helper](https://intl.cloud.tencent.com/document/product/382/3773?from_cn_redirect=1).
     */
    public void setExtendCode(String ExtendCode) {
        this.ExtendCode = ExtendCode;
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
     * Get SMS signature. 
     * @return Sign SMS signature.
     */
    public String getSign() {
        return this.Sign;
    }

    /**
     * Set SMS signature.
     * @param Sign SMS signature.
     */
    public void setSign(String Sign) {
        this.Sign = Sign;
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
     * Get Reply time (e.g., 2019-10-08 17:18:37). 
     * @return ReplyTime Reply time (e.g., 2019-10-08 17:18:37).
     */
    public String getReplyTime() {
        return this.ReplyTime;
    }

    /**
     * Set Reply time (e.g., 2019-10-08 17:18:37).
     * @param ReplyTime Reply time (e.g., 2019-10-08 17:18:37).
     */
    public void setReplyTime(String ReplyTime) {
        this.ReplyTime = ReplyTime;
    }

    /**
     * Get Reply time in seconds in the format of UNIX timestamp. 
     * @return ReplyUnixTime Reply time in seconds in the format of UNIX timestamp.
     */
    public Long getReplyUnixTime() {
        return this.ReplyUnixTime;
    }

    /**
     * Set Reply time in seconds in the format of UNIX timestamp.
     * @param ReplyUnixTime Reply time in seconds in the format of UNIX timestamp.
     */
    public void setReplyUnixTime(Long ReplyUnixTime) {
        this.ReplyUnixTime = ReplyUnixTime;
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
        if (source.NationCode != null) {
            this.NationCode = new String(source.NationCode);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.Sign != null) {
            this.Sign = new String(source.Sign);
        }
        if (source.ReplyContent != null) {
            this.ReplyContent = new String(source.ReplyContent);
        }
        if (source.ReplyTime != null) {
            this.ReplyTime = new String(source.ReplyTime);
        }
        if (source.ReplyUnixTime != null) {
            this.ReplyUnixTime = new Long(source.ReplyUnixTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExtendCode", this.ExtendCode);
        this.setParamSimple(map, prefix + "NationCode", this.NationCode);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Sign", this.Sign);
        this.setParamSimple(map, prefix + "ReplyContent", this.ReplyContent);
        this.setParamSimple(map, prefix + "ReplyTime", this.ReplyTime);
        this.setParamSimple(map, prefix + "ReplyUnixTime", this.ReplyUnixTime);

    }
}

