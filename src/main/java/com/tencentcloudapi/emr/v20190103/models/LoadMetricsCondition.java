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

public class LoadMetricsCondition extends AbstractModel {

    /**
    * Rule statistics cycle. Options include 1 min, 3 min, and 5 min.
    */
    @SerializedName("StatisticPeriod")
    @Expose
    private Long StatisticPeriod;

    /**
    * Trigger count. Scaling begins only after it has been triggered continuously more than TriggerThreshold times.
    */
    @SerializedName("TriggerThreshold")
    @Expose
    private Long TriggerThreshold;

    /**
    * Scaling load metric.
    */
    @SerializedName("LoadMetrics")
    @Expose
    private String LoadMetrics;

    /**
    * Rule metadata record ID.
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * Trigger condition.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Conditions")
    @Expose
    private TriggerCondition [] Conditions;

    /**
     * Get Rule statistics cycle. Options include 1 min, 3 min, and 5 min. 
     * @return StatisticPeriod Rule statistics cycle. Options include 1 min, 3 min, and 5 min.
     */
    public Long getStatisticPeriod() {
        return this.StatisticPeriod;
    }

    /**
     * Set Rule statistics cycle. Options include 1 min, 3 min, and 5 min.
     * @param StatisticPeriod Rule statistics cycle. Options include 1 min, 3 min, and 5 min.
     */
    public void setStatisticPeriod(Long StatisticPeriod) {
        this.StatisticPeriod = StatisticPeriod;
    }

    /**
     * Get Trigger count. Scaling begins only after it has been triggered continuously more than TriggerThreshold times. 
     * @return TriggerThreshold Trigger count. Scaling begins only after it has been triggered continuously more than TriggerThreshold times.
     */
    public Long getTriggerThreshold() {
        return this.TriggerThreshold;
    }

    /**
     * Set Trigger count. Scaling begins only after it has been triggered continuously more than TriggerThreshold times.
     * @param TriggerThreshold Trigger count. Scaling begins only after it has been triggered continuously more than TriggerThreshold times.
     */
    public void setTriggerThreshold(Long TriggerThreshold) {
        this.TriggerThreshold = TriggerThreshold;
    }

    /**
     * Get Scaling load metric. 
     * @return LoadMetrics Scaling load metric.
     */
    public String getLoadMetrics() {
        return this.LoadMetrics;
    }

    /**
     * Set Scaling load metric.
     * @param LoadMetrics Scaling load metric.
     */
    public void setLoadMetrics(String LoadMetrics) {
        this.LoadMetrics = LoadMetrics;
    }

    /**
     * Get Rule metadata record ID. 
     * @return MetricId Rule metadata record ID.
     */
    public Long getMetricId() {
        return this.MetricId;
    }

    /**
     * Set Rule metadata record ID.
     * @param MetricId Rule metadata record ID.
     */
    public void setMetricId(Long MetricId) {
        this.MetricId = MetricId;
    }

    /**
     * Get Trigger condition.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Conditions Trigger condition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TriggerCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Trigger condition.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Conditions Trigger condition.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConditions(TriggerCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    public LoadMetricsCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadMetricsCondition(LoadMetricsCondition source) {
        if (source.StatisticPeriod != null) {
            this.StatisticPeriod = new Long(source.StatisticPeriod);
        }
        if (source.TriggerThreshold != null) {
            this.TriggerThreshold = new Long(source.TriggerThreshold);
        }
        if (source.LoadMetrics != null) {
            this.LoadMetrics = new String(source.LoadMetrics);
        }
        if (source.MetricId != null) {
            this.MetricId = new Long(source.MetricId);
        }
        if (source.Conditions != null) {
            this.Conditions = new TriggerCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new TriggerCondition(source.Conditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatisticPeriod", this.StatisticPeriod);
        this.setParamSimple(map, prefix + "TriggerThreshold", this.TriggerThreshold);
        this.setParamSimple(map, prefix + "LoadMetrics", this.LoadMetrics);
        this.setParamSimple(map, prefix + "MetricId", this.MetricId);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);

    }
}

