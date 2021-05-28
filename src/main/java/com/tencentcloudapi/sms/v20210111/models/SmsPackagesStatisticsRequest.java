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

public class SmsPackagesStatisticsRequest extends AbstractModel{

    /**
    * The SMS `SdkAppId` generated after an application is added in the [SMS console](https://console.cloud.tencent.com/smsv2/app-manage), such as 1400006666.
    */
    @SerializedName("SmsSdkAppId")
    @Expose
    private String SmsSdkAppId;

    /**
    * Upper limit (number of packages to be pulled)
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Start time in the format of `yyyymmddhh` accurate to the hour, such as 2021050113 (13:00 on May 1, 2021).
Note: the creation time of a pulled package should not be earlier than the start time.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time in the format of `yyyymmddhh` accurate to the hour, such as 2021050118 (18:00 on May 1, 2021).
Note: `EndTime` must be later than `BeginTime`. The creation time of a pulled package should not be later than the end time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

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
     * Get Upper limit (number of packages to be pulled) 
     * @return Limit Upper limit (number of packages to be pulled)
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Upper limit (number of packages to be pulled)
     * @param Limit Upper limit (number of packages to be pulled)
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Start time in the format of `yyyymmddhh` accurate to the hour, such as 2021050113 (13:00 on May 1, 2021).
Note: the creation time of a pulled package should not be earlier than the start time. 
     * @return BeginTime Start time in the format of `yyyymmddhh` accurate to the hour, such as 2021050113 (13:00 on May 1, 2021).
Note: the creation time of a pulled package should not be earlier than the start time.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time in the format of `yyyymmddhh` accurate to the hour, such as 2021050113 (13:00 on May 1, 2021).
Note: the creation time of a pulled package should not be earlier than the start time.
     * @param BeginTime Start time in the format of `yyyymmddhh` accurate to the hour, such as 2021050113 (13:00 on May 1, 2021).
Note: the creation time of a pulled package should not be earlier than the start time.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time in the format of `yyyymmddhh` accurate to the hour, such as 2021050118 (18:00 on May 1, 2021).
Note: `EndTime` must be later than `BeginTime`. The creation time of a pulled package should not be later than the end time. 
     * @return EndTime End time in the format of `yyyymmddhh` accurate to the hour, such as 2021050118 (18:00 on May 1, 2021).
Note: `EndTime` must be later than `BeginTime`. The creation time of a pulled package should not be later than the end time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in the format of `yyyymmddhh` accurate to the hour, such as 2021050118 (18:00 on May 1, 2021).
Note: `EndTime` must be later than `BeginTime`. The creation time of a pulled package should not be later than the end time.
     * @param EndTime End time in the format of `yyyymmddhh` accurate to the hour, such as 2021050118 (18:00 on May 1, 2021).
Note: `EndTime` must be later than `BeginTime`. The creation time of a pulled package should not be later than the end time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public SmsPackagesStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsPackagesStatisticsRequest(SmsPackagesStatisticsRequest source) {
        if (source.SmsSdkAppId != null) {
            this.SmsSdkAppId = new String(source.SmsSdkAppId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SmsSdkAppId", this.SmsSdkAppId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

