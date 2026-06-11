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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricConfig extends AbstractModel {

    /**
    * Metric name
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Statistical cycle (seconds).
    */
    @SerializedName("Periods")
    @Expose
    private Long [] Periods;

    /**
    * Custom metric label.
    */
    @SerializedName("MetricLabels")
    @Expose
    private MetricLabel [] MetricLabels;

    /**
     * Get Metric name 
     * @return MetricName Metric name
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name
     * @param MetricName Metric name
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Statistical cycle (seconds). 
     * @return Periods Statistical cycle (seconds).
     */
    public Long [] getPeriods() {
        return this.Periods;
    }

    /**
     * Set Statistical cycle (seconds).
     * @param Periods Statistical cycle (seconds).
     */
    public void setPeriods(Long [] Periods) {
        this.Periods = Periods;
    }

    /**
     * Get Custom metric label. 
     * @return MetricLabels Custom metric label.
     */
    public MetricLabel [] getMetricLabels() {
        return this.MetricLabels;
    }

    /**
     * Set Custom metric label.
     * @param MetricLabels Custom metric label.
     */
    public void setMetricLabels(MetricLabel [] MetricLabels) {
        this.MetricLabels = MetricLabels;
    }

    public MetricConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricConfig(MetricConfig source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Periods != null) {
            this.Periods = new Long[source.Periods.length];
            for (int i = 0; i < source.Periods.length; i++) {
                this.Periods[i] = new Long(source.Periods[i]);
            }
        }
        if (source.MetricLabels != null) {
            this.MetricLabels = new MetricLabel[source.MetricLabels.length];
            for (int i = 0; i < source.MetricLabels.length; i++) {
                this.MetricLabels[i] = new MetricLabel(source.MetricLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArraySimple(map, prefix + "Periods.", this.Periods);
        this.setParamArrayObj(map, prefix + "MetricLabels.", this.MetricLabels);

    }
}

