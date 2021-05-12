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

public class SendStatusStatisticsRequest extends AbstractModel{

    /**
    * Start time of pull in the format of `yyyymmddhh` accurate to the hour.
    */
    @SerializedName("StartDateTime")
    @Expose
    private Long StartDateTime;

    /**
    * End time of pull in the format of `yyyymmddhh` accurate to the hour
Note: `EndDataTime` must be later than `StartDateTime`.
    */
    @SerializedName("EndDataTime")
    @Expose
    private Long EndDataTime;

    /**
    * SMS `SdkAppid` actually generated after an application is added in the [SMS Console](https://console.cloud.tencent.com/sms/smslist), such as 1400006666.
    */
    @SerializedName("SmsSdkAppid")
    @Expose
    private String SmsSdkAppid;

    /**
    * Upper limit.
Note: this parameter is currently fixed at 0.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset.
Note: this parameter is currently fixed at 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Start time of pull in the format of `yyyymmddhh` accurate to the hour. 
     * @return StartDateTime Start time of pull in the format of `yyyymmddhh` accurate to the hour.
     */
    public Long getStartDateTime() {
        return this.StartDateTime;
    }

    /**
     * Set Start time of pull in the format of `yyyymmddhh` accurate to the hour.
     * @param StartDateTime Start time of pull in the format of `yyyymmddhh` accurate to the hour.
     */
    public void setStartDateTime(Long StartDateTime) {
        this.StartDateTime = StartDateTime;
    }

    /**
     * Get End time of pull in the format of `yyyymmddhh` accurate to the hour
Note: `EndDataTime` must be later than `StartDateTime`. 
     * @return EndDataTime End time of pull in the format of `yyyymmddhh` accurate to the hour
Note: `EndDataTime` must be later than `StartDateTime`.
     */
    public Long getEndDataTime() {
        return this.EndDataTime;
    }

    /**
     * Set End time of pull in the format of `yyyymmddhh` accurate to the hour
Note: `EndDataTime` must be later than `StartDateTime`.
     * @param EndDataTime End time of pull in the format of `yyyymmddhh` accurate to the hour
Note: `EndDataTime` must be later than `StartDateTime`.
     */
    public void setEndDataTime(Long EndDataTime) {
        this.EndDataTime = EndDataTime;
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
     * Get Upper limit.
Note: this parameter is currently fixed at 0. 
     * @return Limit Upper limit.
Note: this parameter is currently fixed at 0.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Upper limit.
Note: this parameter is currently fixed at 0.
     * @param Limit Upper limit.
Note: this parameter is currently fixed at 0.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    public SendStatusStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendStatusStatisticsRequest(SendStatusStatisticsRequest source) {
        if (source.StartDateTime != null) {
            this.StartDateTime = new Long(source.StartDateTime);
        }
        if (source.EndDataTime != null) {
            this.EndDataTime = new Long(source.EndDataTime);
        }
        if (source.SmsSdkAppid != null) {
            this.SmsSdkAppid = new String(source.SmsSdkAppid);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDateTime", this.StartDateTime);
        this.setParamSimple(map, prefix + "EndDataTime", this.EndDataTime);
        this.setParamSimple(map, prefix + "SmsSdkAppid", this.SmsSdkAppid);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

