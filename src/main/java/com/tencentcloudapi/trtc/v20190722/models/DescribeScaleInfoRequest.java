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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScaleInfoRequest extends AbstractModel{

    /**
    * The application ID, such as `1400xxxxxx`.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The start time, which is a Unix timestamp (seconds) in local time, such as `1590065777`.
Note: Only data in the last 14 days can be queried.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The end time, which is a Unix timestamp (seconds) in local time, such as `1590065877`. The end time and start time should preferably be more than 24 hours apart.
Note: Data is collected on a daily basis. To query the data of a day, make sure the end time is later than 00:00 on that day. Otherwise, no data will be returned. For example, to query the data on the 20th, the end time must be later than 00:00 on the 20th.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get The application ID, such as `1400xxxxxx`. 
     * @return SdkAppId The application ID, such as `1400xxxxxx`.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The application ID, such as `1400xxxxxx`.
     * @param SdkAppId The application ID, such as `1400xxxxxx`.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The start time, which is a Unix timestamp (seconds) in local time, such as `1590065777`.
Note: Only data in the last 14 days can be queried. 
     * @return StartTime The start time, which is a Unix timestamp (seconds) in local time, such as `1590065777`.
Note: Only data in the last 14 days can be queried.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time, which is a Unix timestamp (seconds) in local time, such as `1590065777`.
Note: Only data in the last 14 days can be queried.
     * @param StartTime The start time, which is a Unix timestamp (seconds) in local time, such as `1590065777`.
Note: Only data in the last 14 days can be queried.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time, which is a Unix timestamp (seconds) in local time, such as `1590065877`. The end time and start time should preferably be more than 24 hours apart.
Note: Data is collected on a daily basis. To query the data of a day, make sure the end time is later than 00:00 on that day. Otherwise, no data will be returned. For example, to query the data on the 20th, the end time must be later than 00:00 on the 20th. 
     * @return EndTime The end time, which is a Unix timestamp (seconds) in local time, such as `1590065877`. The end time and start time should preferably be more than 24 hours apart.
Note: Data is collected on a daily basis. To query the data of a day, make sure the end time is later than 00:00 on that day. Otherwise, no data will be returned. For example, to query the data on the 20th, the end time must be later than 00:00 on the 20th.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time, which is a Unix timestamp (seconds) in local time, such as `1590065877`. The end time and start time should preferably be more than 24 hours apart.
Note: Data is collected on a daily basis. To query the data of a day, make sure the end time is later than 00:00 on that day. Otherwise, no data will be returned. For example, to query the data on the 20th, the end time must be later than 00:00 on the 20th.
     * @param EndTime The end time, which is a Unix timestamp (seconds) in local time, such as `1590065877`. The end time and start time should preferably be more than 24 hours apart.
Note: Data is collected on a daily basis. To query the data of a day, make sure the end time is later than 00:00 on that day. Otherwise, no data will be returned. For example, to query the data on the 20th, the end time must be later than 00:00 on the 20th.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeScaleInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScaleInfoRequest(DescribeScaleInfoRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

