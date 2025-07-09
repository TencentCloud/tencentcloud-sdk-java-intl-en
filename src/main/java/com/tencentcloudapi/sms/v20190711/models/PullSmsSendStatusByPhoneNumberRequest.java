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

public class PullSmsSendStatusByPhoneNumberRequest extends AbstractModel {

    /**
    * Pull start time in seconds in the format of UNIX timestamp.
    */
    @SerializedName("SendDateTime")
    @Expose
    private Long SendDateTime;

    /**
    * Offset.
Note: this parameter is currently fixed at 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of pulled entries. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Target mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * SMS `SdkAppid` actually generated after an application is added in the [SMS Console](https://console.cloud.tencent.com/sms/smslist), such as 1400006666.
    */
    @SerializedName("SmsSdkAppid")
    @Expose
    private String SmsSdkAppid;

    /**
    * Pull end time in UNIX timestamp accurate to seconds.
    */
    @SerializedName("EndDateTime")
    @Expose
    private Long EndDateTime;

    /**
     * Get Pull start time in seconds in the format of UNIX timestamp. 
     * @return SendDateTime Pull start time in seconds in the format of UNIX timestamp.
     */
    public Long getSendDateTime() {
        return this.SendDateTime;
    }

    /**
     * Set Pull start time in seconds in the format of UNIX timestamp.
     * @param SendDateTime Pull start time in seconds in the format of UNIX timestamp.
     */
    public void setSendDateTime(Long SendDateTime) {
        this.SendDateTime = SendDateTime;
    }

    /**
     * Get Offset.
Note: this parameter is currently fixed at 0. 
     * @return Offset Offset.
Note: this parameter is currently fixed at 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
Note: this parameter is currently fixed at 0.
     * @param Offset Offset.
Note: this parameter is currently fixed at 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of pulled entries. Maximum value: 100. 
     * @return Limit Maximum number of pulled entries. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of pulled entries. Maximum value: 100.
     * @param Limit Maximum number of pulled entries. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Target mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number). 
     * @return PhoneNumber Target mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set Target mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     * @param PhoneNumber Target mobile number in the e.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get SMS `SdkAppid` actually generated after an application is added in the [SMS Console](https://console.cloud.tencent.com/sms/smslist), such as 1400006666. 
     * @return SmsSdkAppid SMS `SdkAppid` actually generated after an application is added in the [SMS Console](https://console.cloud.tencent.com/sms/smslist), such as 1400006666.
     */
    public String getSmsSdkAppid() {
        return this.SmsSdkAppid;
    }

    /**
     * Set SMS `SdkAppid` actually generated after an application is added in the [SMS Console](https://console.cloud.tencent.com/sms/smslist), such as 1400006666.
     * @param SmsSdkAppid SMS `SdkAppid` actually generated after an application is added in the [SMS Console](https://console.cloud.tencent.com/sms/smslist), such as 1400006666.
     */
    public void setSmsSdkAppid(String SmsSdkAppid) {
        this.SmsSdkAppid = SmsSdkAppid;
    }

    /**
     * Get Pull end time in UNIX timestamp accurate to seconds. 
     * @return EndDateTime Pull end time in UNIX timestamp accurate to seconds.
     */
    public Long getEndDateTime() {
        return this.EndDateTime;
    }

    /**
     * Set Pull end time in UNIX timestamp accurate to seconds.
     * @param EndDateTime Pull end time in UNIX timestamp accurate to seconds.
     */
    public void setEndDateTime(Long EndDateTime) {
        this.EndDateTime = EndDateTime;
    }

    public PullSmsSendStatusByPhoneNumberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullSmsSendStatusByPhoneNumberRequest(PullSmsSendStatusByPhoneNumberRequest source) {
        if (source.SendDateTime != null) {
            this.SendDateTime = new Long(source.SendDateTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.SmsSdkAppid != null) {
            this.SmsSdkAppid = new String(source.SmsSdkAppid);
        }
        if (source.EndDateTime != null) {
            this.EndDateTime = new Long(source.EndDateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SendDateTime", this.SendDateTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "SmsSdkAppid", this.SmsSdkAppid);
        this.setParamSimple(map, prefix + "EndDateTime", this.EndDateTime);

    }
}

