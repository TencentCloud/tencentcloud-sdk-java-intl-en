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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationUsageRequest extends AbstractModel {

    /**
    * Start time of the query period. The start time point is included in the query period.
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time of the query period. The end time point is not included in the query period.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Subproduct name.
    */
    @SerializedName("SubProduct")
    @Expose
    private String SubProduct;

    /**
    * Unit of time increment.
- MONTHLY: month
- DAILY: day
- MINUTELY: minute
    */
    @SerializedName("TimeLevel")
    @Expose
    private String TimeLevel;

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * true: Returns the weighted sum of raw usage data.
false: Returns the raw usage data.
    */
    @SerializedName("IsWeighted")
    @Expose
    private Boolean IsWeighted;

    /**
     * Get Start time of the query period. The start time point is included in the query period. 
     * @return BeginTime Start time of the query period. The start time point is included in the query period.
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time of the query period. The start time point is included in the query period.
     * @param BeginTime Start time of the query period. The start time point is included in the query period.
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time of the query period. The end time point is not included in the query period. 
     * @return EndTime End time of the query period. The end time point is not included in the query period.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time of the query period. The end time point is not included in the query period.
     * @param EndTime End time of the query period. The end time point is not included in the query period.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Subproduct name. 
     * @return SubProduct Subproduct name.
     */
    public String getSubProduct() {
        return this.SubProduct;
    }

    /**
     * Set Subproduct name.
     * @param SubProduct Subproduct name.
     */
    public void setSubProduct(String SubProduct) {
        this.SubProduct = SubProduct;
    }

    /**
     * Get Unit of time increment.
- MONTHLY: month
- DAILY: day
- MINUTELY: minute 
     * @return TimeLevel Unit of time increment.
- MONTHLY: month
- DAILY: day
- MINUTELY: minute
     */
    public String getTimeLevel() {
        return this.TimeLevel;
    }

    /**
     * Set Unit of time increment.
- MONTHLY: month
- DAILY: day
- MINUTELY: minute
     * @param TimeLevel Unit of time increment.
- MONTHLY: month
- DAILY: day
- MINUTELY: minute
     */
    public void setTimeLevel(String TimeLevel) {
        this.TimeLevel = TimeLevel;
    }

    /**
     * Get SdkAppId of the whiteboard application. 
     * @return SdkAppId SdkAppId of the whiteboard application.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId of the whiteboard application.
     * @param SdkAppId SdkAppId of the whiteboard application.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get true: Returns the weighted sum of raw usage data.
false: Returns the raw usage data. 
     * @return IsWeighted true: Returns the weighted sum of raw usage data.
false: Returns the raw usage data.
     */
    public Boolean getIsWeighted() {
        return this.IsWeighted;
    }

    /**
     * Set true: Returns the weighted sum of raw usage data.
false: Returns the raw usage data.
     * @param IsWeighted true: Returns the weighted sum of raw usage data.
false: Returns the raw usage data.
     */
    public void setIsWeighted(Boolean IsWeighted) {
        this.IsWeighted = IsWeighted;
    }

    public DescribeApplicationUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationUsageRequest(DescribeApplicationUsageRequest source) {
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SubProduct != null) {
            this.SubProduct = new String(source.SubProduct);
        }
        if (source.TimeLevel != null) {
            this.TimeLevel = new String(source.TimeLevel);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.IsWeighted != null) {
            this.IsWeighted = new Boolean(source.IsWeighted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SubProduct", this.SubProduct);
        this.setParamSimple(map, prefix + "TimeLevel", this.TimeLevel);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "IsWeighted", this.IsWeighted);

    }
}

