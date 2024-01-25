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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTRTCMarketScaleDataRequest extends AbstractModel {

    /**
    * User SDKAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * Query start time, format is YYYY-MM-DD. (The query time range depends on the monitoring dashboard function version, the premium edition can query up to 60 days)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time, format is YYYY-MM-DD.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The granularity of the returned data, which can be set to the following values:
 d: by day. This returns data for the entire UTC day of the query time range.
 h: by hour. This returns data for the entire UTC hour of the query time range.
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
     * Get User SDKAppId 
     * @return SdkAppId User SDKAppId
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set User SDKAppId
     * @param SdkAppId User SDKAppId
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Query start time, format is YYYY-MM-DD. (The query time range depends on the monitoring dashboard function version, the premium edition can query up to 60 days) 
     * @return StartTime Query start time, format is YYYY-MM-DD. (The query time range depends on the monitoring dashboard function version, the premium edition can query up to 60 days)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time, format is YYYY-MM-DD. (The query time range depends on the monitoring dashboard function version, the premium edition can query up to 60 days)
     * @param StartTime Query start time, format is YYYY-MM-DD. (The query time range depends on the monitoring dashboard function version, the premium edition can query up to 60 days)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time, format is YYYY-MM-DD. 
     * @return EndTime Query end time, format is YYYY-MM-DD.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time, format is YYYY-MM-DD.
     * @param EndTime Query end time, format is YYYY-MM-DD.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The granularity of the returned data, which can be set to the following values:
 d: by day. This returns data for the entire UTC day of the query time range.
 h: by hour. This returns data for the entire UTC hour of the query time range. 
     * @return Period The granularity of the returned data, which can be set to the following values:
 d: by day. This returns data for the entire UTC day of the query time range.
 h: by hour. This returns data for the entire UTC hour of the query time range.
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set The granularity of the returned data, which can be set to the following values:
 d: by day. This returns data for the entire UTC day of the query time range.
 h: by hour. This returns data for the entire UTC hour of the query time range.
     * @param Period The granularity of the returned data, which can be set to the following values:
 d: by day. This returns data for the entire UTC day of the query time range.
 h: by hour. This returns data for the entire UTC hour of the query time range.
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    public DescribeTRTCMarketScaleDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTRTCMarketScaleDataRequest(DescribeTRTCMarketScaleDataRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

