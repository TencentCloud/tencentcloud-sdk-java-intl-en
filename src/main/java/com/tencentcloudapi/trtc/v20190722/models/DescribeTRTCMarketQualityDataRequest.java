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

public class DescribeTRTCMarketQualityDataRequest extends AbstractModel {

    /**
    * User SdkAppId (for example: 1400xxxxxx).
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * Query start time, and the format is YYYY-MM-DD. (query time range is based on the monitoring dashboard feature version. the basic version supports querying the last 30 days, and the advanced version supports querying the last 60 days).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time in YYYY-MM-DD format.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The granularity of returned data supports the following values:.
d: day. at this time, return the data of UTC time at zero point within a specified time range.
h: billed hourly. at this point, return the data of full hour UTC time within a specified time range.
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
    * Whether the returned data is a decimal.
    */
    @SerializedName("IsFloat")
    @Expose
    private Boolean IsFloat;

    /**
     * Get User SdkAppId (for example: 1400xxxxxx). 
     * @return SdkAppId User SdkAppId (for example: 1400xxxxxx).
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set User SdkAppId (for example: 1400xxxxxx).
     * @param SdkAppId User SdkAppId (for example: 1400xxxxxx).
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Query start time, and the format is YYYY-MM-DD. (query time range is based on the monitoring dashboard feature version. the basic version supports querying the last 30 days, and the advanced version supports querying the last 60 days). 
     * @return StartTime Query start time, and the format is YYYY-MM-DD. (query time range is based on the monitoring dashboard feature version. the basic version supports querying the last 30 days, and the advanced version supports querying the last 60 days).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time, and the format is YYYY-MM-DD. (query time range is based on the monitoring dashboard feature version. the basic version supports querying the last 30 days, and the advanced version supports querying the last 60 days).
     * @param StartTime Query start time, and the format is YYYY-MM-DD. (query time range is based on the monitoring dashboard feature version. the basic version supports querying the last 30 days, and the advanced version supports querying the last 60 days).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time in YYYY-MM-DD format. 
     * @return EndTime Query end time in YYYY-MM-DD format.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time in YYYY-MM-DD format.
     * @param EndTime Query end time in YYYY-MM-DD format.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The granularity of returned data supports the following values:.
d: day. at this time, return the data of UTC time at zero point within a specified time range.
h: billed hourly. at this point, return the data of full hour UTC time within a specified time range. 
     * @return Period The granularity of returned data supports the following values:.
d: day. at this time, return the data of UTC time at zero point within a specified time range.
h: billed hourly. at this point, return the data of full hour UTC time within a specified time range.
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set The granularity of returned data supports the following values:.
d: day. at this time, return the data of UTC time at zero point within a specified time range.
h: billed hourly. at this point, return the data of full hour UTC time within a specified time range.
     * @param Period The granularity of returned data supports the following values:.
d: day. at this time, return the data of UTC time at zero point within a specified time range.
h: billed hourly. at this point, return the data of full hour UTC time within a specified time range.
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    /**
     * Get Whether the returned data is a decimal. 
     * @return IsFloat Whether the returned data is a decimal.
     */
    public Boolean getIsFloat() {
        return this.IsFloat;
    }

    /**
     * Set Whether the returned data is a decimal.
     * @param IsFloat Whether the returned data is a decimal.
     */
    public void setIsFloat(Boolean IsFloat) {
        this.IsFloat = IsFloat;
    }

    public DescribeTRTCMarketQualityDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTRTCMarketQualityDataRequest(DescribeTRTCMarketQualityDataRequest source) {
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
        if (source.IsFloat != null) {
            this.IsFloat = new Boolean(source.IsFloat);
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
        this.setParamSimple(map, prefix + "IsFloat", this.IsFloat);

    }
}

