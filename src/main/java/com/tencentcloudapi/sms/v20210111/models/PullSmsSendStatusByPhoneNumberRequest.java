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

public class PullSmsSendStatusByPhoneNumberRequest extends AbstractModel{

    /**
    * Pull start time in seconds in the format of UNIX timestamp.
Note: the data for the last 7 days can be pulled at most.
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

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
    * Target mobile number in the E.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 1400006666.
    */
    @SerializedName("SmsSdkAppId")
    @Expose
    private String SmsSdkAppId;

    /**
    * Pull end time in seconds in the format of UNIX timestamp.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get Pull start time in seconds in the format of UNIX timestamp.
Note: the data for the last 7 days can be pulled at most. 
     * @return BeginTime Pull start time in seconds in the format of UNIX timestamp.
Note: the data for the last 7 days can be pulled at most.
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Pull start time in seconds in the format of UNIX timestamp.
Note: the data for the last 7 days can be pulled at most.
     * @param BeginTime Pull start time in seconds in the format of UNIX timestamp.
Note: the data for the last 7 days can be pulled at most.
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
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
     * Get Target mobile number in the E.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number). 
     * @return PhoneNumber Target mobile number in the E.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set Target mobile number in the E.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     * @param PhoneNumber Target mobile number in the E.164 standard (+[country/region code][mobile number]), such as +8613711112222, which has a + sign followed by 86 (country/region code) and then by 13711112222 (mobile number).
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 1400006666. 
     * @return SmsSdkAppId The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 1400006666.
     */
    public String getSmsSdkAppId() {
        return this.SmsSdkAppId;
    }

    /**
     * Set The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 1400006666.
     * @param SmsSdkAppId The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 1400006666.
     */
    public void setSmsSdkAppId(String SmsSdkAppId) {
        this.SmsSdkAppId = SmsSdkAppId;
    }

    /**
     * Get Pull end time in seconds in the format of UNIX timestamp. 
     * @return EndTime Pull end time in seconds in the format of UNIX timestamp.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Pull end time in seconds in the format of UNIX timestamp.
     * @param EndTime Pull end time in seconds in the format of UNIX timestamp.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public PullSmsSendStatusByPhoneNumberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullSmsSendStatusByPhoneNumberRequest(PullSmsSendStatusByPhoneNumberRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
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
        if (source.SmsSdkAppId != null) {
            this.SmsSdkAppId = new String(source.SmsSdkAppId);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "SmsSdkAppId", this.SmsSdkAppId);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

