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

public class Line extends AbstractModel {

    /**
    * Metric name.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Metric chinese name.
    */
    @SerializedName("MetricNameCN")
    @Expose
    private String MetricNameCN;

    /**
    * Time series.
    */
    @SerializedName("TimeSerial")
    @Expose
    private Long [] TimeSerial;

    /**
    * Data sequence.
    */
    @SerializedName("DataSerial")
    @Expose
    private Float [] DataSerial;

    /**
    * Dimension list.
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * Metric data unit
    */
    @SerializedName("MetricUnit")
    @Expose
    private String MetricUnit;

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
     * Get Metric chinese name. 
     * @return MetricNameCN Metric chinese name.
     */
    public String getMetricNameCN() {
        return this.MetricNameCN;
    }

    /**
     * Set Metric chinese name.
     * @param MetricNameCN Metric chinese name.
     */
    public void setMetricNameCN(String MetricNameCN) {
        this.MetricNameCN = MetricNameCN;
    }

    /**
     * Get Time series. 
     * @return TimeSerial Time series.
     */
    public Long [] getTimeSerial() {
        return this.TimeSerial;
    }

    /**
     * Set Time series.
     * @param TimeSerial Time series.
     */
    public void setTimeSerial(Long [] TimeSerial) {
        this.TimeSerial = TimeSerial;
    }

    /**
     * Get Data sequence. 
     * @return DataSerial Data sequence.
     */
    public Float [] getDataSerial() {
        return this.DataSerial;
    }

    /**
     * Set Data sequence.
     * @param DataSerial Data sequence.
     */
    public void setDataSerial(Float [] DataSerial) {
        this.DataSerial = DataSerial;
    }

    /**
     * Get Dimension list. 
     * @return Tags Dimension list.
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Dimension list.
     * @param Tags Dimension list.
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Metric data unit 
     * @return MetricUnit Metric data unit
     */
    public String getMetricUnit() {
        return this.MetricUnit;
    }

    /**
     * Set Metric data unit
     * @param MetricUnit Metric data unit
     */
    public void setMetricUnit(String MetricUnit) {
        this.MetricUnit = MetricUnit;
    }

    public Line() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Line(Line source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.MetricNameCN != null) {
            this.MetricNameCN = new String(source.MetricNameCN);
        }
        if (source.TimeSerial != null) {
            this.TimeSerial = new Long[source.TimeSerial.length];
            for (int i = 0; i < source.TimeSerial.length; i++) {
                this.TimeSerial[i] = new Long(source.TimeSerial[i]);
            }
        }
        if (source.DataSerial != null) {
            this.DataSerial = new Float[source.DataSerial.length];
            for (int i = 0; i < source.DataSerial.length; i++) {
                this.DataSerial[i] = new Float(source.DataSerial[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.MetricUnit != null) {
            this.MetricUnit = new String(source.MetricUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "MetricNameCN", this.MetricNameCN);
        this.setParamArraySimple(map, prefix + "TimeSerial.", this.TimeSerial);
        this.setParamArraySimple(map, prefix + "DataSerial.", this.DataSerial);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "MetricUnit", this.MetricUnit);

    }
}

