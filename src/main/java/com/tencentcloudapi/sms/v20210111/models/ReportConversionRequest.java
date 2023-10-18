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

public class ReportConversionRequest extends AbstractModel {

    /**
    * The SMS SdkAppId generated after an application is created in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as “1400006666”.
    */
    @SerializedName("SmsSdkAppId")
    @Expose
    private String SmsSdkAppId;

    /**
    * The serial number returned for a message sent.
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * The recipient’s reply time in seconds in the format of UNIX timestamp.
    */
    @SerializedName("ConversionTime")
    @Expose
    private Long ConversionTime;

    /**
     * Get The SMS SdkAppId generated after an application is created in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as “1400006666”. 
     * @return SmsSdkAppId The SMS SdkAppId generated after an application is created in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as “1400006666”.
     */
    public String getSmsSdkAppId() {
        return this.SmsSdkAppId;
    }

    /**
     * Set The SMS SdkAppId generated after an application is created in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as “1400006666”.
     * @param SmsSdkAppId The SMS SdkAppId generated after an application is created in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as “1400006666”.
     */
    public void setSmsSdkAppId(String SmsSdkAppId) {
        this.SmsSdkAppId = SmsSdkAppId;
    }

    /**
     * Get The serial number returned for a message sent. 
     * @return SerialNo The serial number returned for a message sent.
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * Set The serial number returned for a message sent.
     * @param SerialNo The serial number returned for a message sent.
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * Get The recipient’s reply time in seconds in the format of UNIX timestamp. 
     * @return ConversionTime The recipient’s reply time in seconds in the format of UNIX timestamp.
     */
    public Long getConversionTime() {
        return this.ConversionTime;
    }

    /**
     * Set The recipient’s reply time in seconds in the format of UNIX timestamp.
     * @param ConversionTime The recipient’s reply time in seconds in the format of UNIX timestamp.
     */
    public void setConversionTime(Long ConversionTime) {
        this.ConversionTime = ConversionTime;
    }

    public ReportConversionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportConversionRequest(ReportConversionRequest source) {
        if (source.SmsSdkAppId != null) {
            this.SmsSdkAppId = new String(source.SmsSdkAppId);
        }
        if (source.SerialNo != null) {
            this.SerialNo = new String(source.SerialNo);
        }
        if (source.ConversionTime != null) {
            this.ConversionTime = new Long(source.ConversionTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SmsSdkAppId", this.SmsSdkAppId);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "ConversionTime", this.ConversionTime);

    }
}

