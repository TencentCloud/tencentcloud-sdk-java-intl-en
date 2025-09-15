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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewMetricData extends AbstractModel {

    /**
    * Metric name.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * First data timestamp.
    */
    @SerializedName("First")
    @Expose
    private Long First;

    /**
    * Last data timestamp.
    */
    @SerializedName("Last")
    @Expose
    private Long Last;

    /**
    * Sampling point time interval.
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Sampling point data.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataPoints")
    @Expose
    private String [] DataPoints;

    /**
    * Metric tags.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private MetricTags Tags;

    /**
     * Get Metric name. 
     * @return Metric Metric name.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Metric name.
     * @param Metric Metric name.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get First data timestamp. 
     * @return First First data timestamp.
     */
    public Long getFirst() {
        return this.First;
    }

    /**
     * Set First data timestamp.
     * @param First First data timestamp.
     */
    public void setFirst(Long First) {
        this.First = First;
    }

    /**
     * Get Last data timestamp. 
     * @return Last Last data timestamp.
     */
    public Long getLast() {
        return this.Last;
    }

    /**
     * Set Last data timestamp.
     * @param Last Last data timestamp.
     */
    public void setLast(Long Last) {
        this.Last = Last;
    }

    /**
     * Get Sampling point time interval. 
     * @return Interval Sampling point time interval.
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Sampling point time interval.
     * @param Interval Sampling point time interval.
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Sampling point data.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataPoints Sampling point data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getDataPoints() {
        return this.DataPoints;
    }

    /**
     * Set Sampling point data.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataPoints Sampling point data.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataPoints(String [] DataPoints) {
        this.DataPoints = DataPoints;
    }

    /**
     * Get Metric tags.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Metric tags.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MetricTags getTags() {
        return this.Tags;
    }

    /**
     * Set Metric tags.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Metric tags.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(MetricTags Tags) {
        this.Tags = Tags;
    }

    public OverviewMetricData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewMetricData(OverviewMetricData source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.First != null) {
            this.First = new Long(source.First);
        }
        if (source.Last != null) {
            this.Last = new Long(source.Last);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.DataPoints != null) {
            this.DataPoints = new String[source.DataPoints.length];
            for (int i = 0; i < source.DataPoints.length; i++) {
                this.DataPoints[i] = new String(source.DataPoints[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new MetricTags(source.Tags);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "First", this.First);
        this.setParamSimple(map, prefix + "Last", this.Last);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArraySimple(map, prefix + "DataPoints.", this.DataPoints);
        this.setParamObj(map, prefix + "Tags.", this.Tags);

    }
}

