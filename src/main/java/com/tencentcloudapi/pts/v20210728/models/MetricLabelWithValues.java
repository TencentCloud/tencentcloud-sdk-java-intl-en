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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricLabelWithValues extends AbstractModel {

    /**
    * Metric name.
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Labels and values.
    */
    @SerializedName("LabelValuesSet")
    @Expose
    private LabelWithValues [] LabelValuesSet;

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
     * Get Labels and values. 
     * @return LabelValuesSet Labels and values.
     */
    public LabelWithValues [] getLabelValuesSet() {
        return this.LabelValuesSet;
    }

    /**
     * Set Labels and values.
     * @param LabelValuesSet Labels and values.
     */
    public void setLabelValuesSet(LabelWithValues [] LabelValuesSet) {
        this.LabelValuesSet = LabelValuesSet;
    }

    public MetricLabelWithValues() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricLabelWithValues(MetricLabelWithValues source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.LabelValuesSet != null) {
            this.LabelValuesSet = new LabelWithValues[source.LabelValuesSet.length];
            for (int i = 0; i < source.LabelValuesSet.length; i++) {
                this.LabelValuesSet[i] = new LabelWithValues(source.LabelValuesSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArrayObj(map, prefix + "LabelValuesSet.", this.LabelValuesSet);

    }
}

