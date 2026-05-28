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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomerOwnCostExplorerFilterRequest extends AbstractModel {

    /**
    * <p>Start time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months. When PeriodType is day, the time range is 2 calendar months;</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months. When PeriodType is day, the time range is 2 calendar months.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Date type</p><p>Enumeration value:</p><ul><li>day: By day</li><li>month: Monthly</li></ul>
    */
    @SerializedName("PeriodType")
    @Expose
    private String PeriodType;

    /**
     * Get <p>Start time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months. When PeriodType is day, the time range is 2 calendar months;</p> 
     * @return StartTime <p>Start time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months. When PeriodType is day, the time range is 2 calendar months;</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months. When PeriodType is day, the time range is 2 calendar months;</p>
     * @param StartTime <p>Start time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months. When PeriodType is day, the time range is 2 calendar months;</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months. When PeriodType is day, the time range is 2 calendar months.</p> 
     * @return EndTime <p>End time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months. When PeriodType is day, the time range is 2 calendar months.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months. When PeriodType is day, the time range is 2 calendar months.</p>
     * @param EndTime <p>End time</p><p>Parameter format: YYYY-MM-DD hh:mm:ss, for example 2006-01-02 00:00:00</p><p>Input limit: When PeriodType is month, the time range is 6 calendar months. When PeriodType is day, the time range is 2 calendar months.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Date type</p><p>Enumeration value:</p><ul><li>day: By day</li><li>month: Monthly</li></ul> 
     * @return PeriodType <p>Date type</p><p>Enumeration value:</p><ul><li>day: By day</li><li>month: Monthly</li></ul>
     */
    public String getPeriodType() {
        return this.PeriodType;
    }

    /**
     * Set <p>Date type</p><p>Enumeration value:</p><ul><li>day: By day</li><li>month: Monthly</li></ul>
     * @param PeriodType <p>Date type</p><p>Enumeration value:</p><ul><li>day: By day</li><li>month: Monthly</li></ul>
     */
    public void setPeriodType(String PeriodType) {
        this.PeriodType = PeriodType;
    }

    public DescribeCustomerOwnCostExplorerFilterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomerOwnCostExplorerFilterRequest(DescribeCustomerOwnCostExplorerFilterRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PeriodType != null) {
            this.PeriodType = new String(source.PeriodType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PeriodType", this.PeriodType);

    }
}

