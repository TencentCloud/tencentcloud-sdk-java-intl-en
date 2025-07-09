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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryMetricItem extends AbstractModel {

    /**
    * Metric name.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Year-Over-Year comparison is now supported for comparebyyesterday (compared to yesterday) and comparebylastweek (compared to last week). 
    */
    @SerializedName("Compares")
    @Expose
    private String [] Compares;

    /**
    * Year-On-Year, deprecated, not recommended for use.
    */
    @SerializedName("Compare")
    @Expose
    private String Compare;

    /**
     * Get Metric name. 
     * @return MetricName Metric name.
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name.
     * @param MetricName Metric name.
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Year-Over-Year comparison is now supported for comparebyyesterday (compared to yesterday) and comparebylastweek (compared to last week).  
     * @return Compares Year-Over-Year comparison is now supported for comparebyyesterday (compared to yesterday) and comparebylastweek (compared to last week). 
     */
    public String [] getCompares() {
        return this.Compares;
    }

    /**
     * Set Year-Over-Year comparison is now supported for comparebyyesterday (compared to yesterday) and comparebylastweek (compared to last week). 
     * @param Compares Year-Over-Year comparison is now supported for comparebyyesterday (compared to yesterday) and comparebylastweek (compared to last week). 
     */
    public void setCompares(String [] Compares) {
        this.Compares = Compares;
    }

    /**
     * Get Year-On-Year, deprecated, not recommended for use. 
     * @return Compare Year-On-Year, deprecated, not recommended for use.
     */
    public String getCompare() {
        return this.Compare;
    }

    /**
     * Set Year-On-Year, deprecated, not recommended for use.
     * @param Compare Year-On-Year, deprecated, not recommended for use.
     */
    public void setCompare(String Compare) {
        this.Compare = Compare;
    }

    public QueryMetricItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryMetricItem(QueryMetricItem source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Compares != null) {
            this.Compares = new String[source.Compares.length];
            for (int i = 0; i < source.Compares.length; i++) {
                this.Compares[i] = new String(source.Compares[i]);
            }
        }
        if (source.Compare != null) {
            this.Compare = new String(source.Compare);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArraySimple(map, prefix + "Compares.", this.Compares);
        this.setParamSimple(map, prefix + "Compare", this.Compare);

    }
}

