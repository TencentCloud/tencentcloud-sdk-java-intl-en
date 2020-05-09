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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConditionListMetric extends AbstractModel{

    /**
    * Metric configuration.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ConfigManual")
    @Expose
    private DescribePolicyConditionListConfigManual ConfigManual;

    /**
    * Metric ID.
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * Metric name.
    */
    @SerializedName("MetricShowName")
    @Expose
    private String MetricShowName;

    /**
    * Metric unit.
    */
    @SerializedName("MetricUnit")
    @Expose
    private String MetricUnit;

    /**
     * Get Metric configuration.
Note: This field may return null, indicating that no valid value was found. 
     * @return ConfigManual Metric configuration.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribePolicyConditionListConfigManual getConfigManual() {
        return this.ConfigManual;
    }

    /**
     * Set Metric configuration.
Note: This field may return null, indicating that no valid value was found.
     * @param ConfigManual Metric configuration.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setConfigManual(DescribePolicyConditionListConfigManual ConfigManual) {
        this.ConfigManual = ConfigManual;
    }

    /**
     * Get Metric ID. 
     * @return MetricId Metric ID.
     */
    public Long getMetricId() {
        return this.MetricId;
    }

    /**
     * Set Metric ID.
     * @param MetricId Metric ID.
     */
    public void setMetricId(Long MetricId) {
        this.MetricId = MetricId;
    }

    /**
     * Get Metric name. 
     * @return MetricShowName Metric name.
     */
    public String getMetricShowName() {
        return this.MetricShowName;
    }

    /**
     * Set Metric name.
     * @param MetricShowName Metric name.
     */
    public void setMetricShowName(String MetricShowName) {
        this.MetricShowName = MetricShowName;
    }

    /**
     * Get Metric unit. 
     * @return MetricUnit Metric unit.
     */
    public String getMetricUnit() {
        return this.MetricUnit;
    }

    /**
     * Set Metric unit.
     * @param MetricUnit Metric unit.
     */
    public void setMetricUnit(String MetricUnit) {
        this.MetricUnit = MetricUnit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ConfigManual.", this.ConfigManual);
        this.setParamSimple(map, prefix + "MetricId", this.MetricId);
        this.setParamSimple(map, prefix + "MetricShowName", this.MetricShowName);
        this.setParamSimple(map, prefix + "MetricUnit", this.MetricUnit);

    }
}

