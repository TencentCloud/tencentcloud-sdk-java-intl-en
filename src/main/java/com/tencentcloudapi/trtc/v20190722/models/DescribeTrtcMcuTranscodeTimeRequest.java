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

public class DescribeTrtcMcuTranscodeTimeRequest extends AbstractModel{

    /**
    * Query start date in the format of YYYY-MM-DD
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end date in the format of YYYY-MM-DD
The period queried in a request cannot be longer than 31 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Application ID, which is optional. If it is specified, duration statistics for the specified application are returned; otherwise, the total durations of all applications are returned.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
     * Get Query start date in the format of YYYY-MM-DD 
     * @return StartTime Query start date in the format of YYYY-MM-DD
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start date in the format of YYYY-MM-DD
     * @param StartTime Query start date in the format of YYYY-MM-DD
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end date in the format of YYYY-MM-DD
The period queried in a request cannot be longer than 31 days. 
     * @return EndTime Query end date in the format of YYYY-MM-DD
The period queried in a request cannot be longer than 31 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end date in the format of YYYY-MM-DD
The period queried in a request cannot be longer than 31 days.
     * @param EndTime Query end date in the format of YYYY-MM-DD
The period queried in a request cannot be longer than 31 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Application ID, which is optional. If it is specified, duration statistics for the specified application are returned; otherwise, the total durations of all applications are returned. 
     * @return SdkAppId Application ID, which is optional. If it is specified, duration statistics for the specified application are returned; otherwise, the total durations of all applications are returned.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID, which is optional. If it is specified, duration statistics for the specified application are returned; otherwise, the total durations of all applications are returned.
     * @param SdkAppId Application ID, which is optional. If it is specified, duration statistics for the specified application are returned; otherwise, the total durations of all applications are returned.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    public DescribeTrtcMcuTranscodeTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrtcMcuTranscodeTimeRequest(DescribeTrtcMcuTranscodeTimeRequest source) {
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

