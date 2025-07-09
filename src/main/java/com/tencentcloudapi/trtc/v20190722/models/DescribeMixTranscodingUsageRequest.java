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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMixTranscodingUsageRequest extends AbstractModel {

    /**
    * The start date in the format of YYYY-MM-DD.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end date in the format of YYYY-MM-DD.
The period queried per request cannot be longer than 31 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The `SDKAppID` of the TRTC application to which the target room belongs. If you do not specify this parameter, the usage statistics of all TRTC applications under the current account will be returned.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
     * Get The start date in the format of YYYY-MM-DD. 
     * @return StartTime The start date in the format of YYYY-MM-DD.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start date in the format of YYYY-MM-DD.
     * @param StartTime The start date in the format of YYYY-MM-DD.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end date in the format of YYYY-MM-DD.
The period queried per request cannot be longer than 31 days. 
     * @return EndTime The end date in the format of YYYY-MM-DD.
The period queried per request cannot be longer than 31 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end date in the format of YYYY-MM-DD.
The period queried per request cannot be longer than 31 days.
     * @param EndTime The end date in the format of YYYY-MM-DD.
The period queried per request cannot be longer than 31 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The `SDKAppID` of the TRTC application to which the target room belongs. If you do not specify this parameter, the usage statistics of all TRTC applications under the current account will be returned. 
     * @return SdkAppId The `SDKAppID` of the TRTC application to which the target room belongs. If you do not specify this parameter, the usage statistics of all TRTC applications under the current account will be returned.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The `SDKAppID` of the TRTC application to which the target room belongs. If you do not specify this parameter, the usage statistics of all TRTC applications under the current account will be returned.
     * @param SdkAppId The `SDKAppID` of the TRTC application to which the target room belongs. If you do not specify this parameter, the usage statistics of all TRTC applications under the current account will be returned.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    public DescribeMixTranscodingUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMixTranscodingUsageRequest(DescribeMixTranscodingUsageRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);

    }
}

