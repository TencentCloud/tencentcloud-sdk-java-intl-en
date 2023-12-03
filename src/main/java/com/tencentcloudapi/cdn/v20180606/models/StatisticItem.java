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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatisticItem extends AbstractModel {

    /**
    * Type of usage limit. `total`: Cumulative usage; `moment`: Instantaneous usage.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Unblocking time
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("UnBlockTime")
    @Expose
    private Long UnBlockTime;

    /**
    * Bandwidth/Traffic threshold
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("BpsThreshold")
    @Expose
    private Long BpsThreshold;

    /**
    * Specifies how to disable CDN service when the threshold is exceeded. `RETURN_404`: Return 404; `RESOLVE_DNS_TO_ORIGIN`: Forward to origin server.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CounterMeasure")
    @Expose
    private String CounterMeasure;

    /**
    * Threshold (in percentage) that triggers alarms
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AlertPercentage")
    @Expose
    private Long AlertPercentage;

    /**
    * Whether to enable alerts for cumulative usage limit. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AlertSwitch")
    @Expose
    private String AlertSwitch;

    /**
    * Metric type. `flux`: Traffic; `bandwidth`: Bandwidth.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 
    */
    @SerializedName("Cycle")
    @Expose
    private Long Cycle;

    /**
    * Whether to enable cumulative usage limit. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get Type of usage limit. `total`: Cumulative usage; `moment`: Instantaneous usage.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Type Type of usage limit. `total`: Cumulative usage; `moment`: Instantaneous usage.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of usage limit. `total`: Cumulative usage; `moment`: Instantaneous usage.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Type Type of usage limit. `total`: Cumulative usage; `moment`: Instantaneous usage.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Unblocking time
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return UnBlockTime Unblocking time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getUnBlockTime() {
        return this.UnBlockTime;
    }

    /**
     * Set Unblocking time
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param UnBlockTime Unblocking time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setUnBlockTime(Long UnBlockTime) {
        this.UnBlockTime = UnBlockTime;
    }

    /**
     * Get Bandwidth/Traffic threshold
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return BpsThreshold Bandwidth/Traffic threshold
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getBpsThreshold() {
        return this.BpsThreshold;
    }

    /**
     * Set Bandwidth/Traffic threshold
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param BpsThreshold Bandwidth/Traffic threshold
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setBpsThreshold(Long BpsThreshold) {
        this.BpsThreshold = BpsThreshold;
    }

    /**
     * Get Specifies how to disable CDN service when the threshold is exceeded. `RETURN_404`: Return 404; `RESOLVE_DNS_TO_ORIGIN`: Forward to origin server.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CounterMeasure Specifies how to disable CDN service when the threshold is exceeded. `RETURN_404`: Return 404; `RESOLVE_DNS_TO_ORIGIN`: Forward to origin server.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getCounterMeasure() {
        return this.CounterMeasure;
    }

    /**
     * Set Specifies how to disable CDN service when the threshold is exceeded. `RETURN_404`: Return 404; `RESOLVE_DNS_TO_ORIGIN`: Forward to origin server.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CounterMeasure Specifies how to disable CDN service when the threshold is exceeded. `RETURN_404`: Return 404; `RESOLVE_DNS_TO_ORIGIN`: Forward to origin server.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCounterMeasure(String CounterMeasure) {
        this.CounterMeasure = CounterMeasure;
    }

    /**
     * Get Threshold (in percentage) that triggers alarms
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AlertPercentage Threshold (in percentage) that triggers alarms
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getAlertPercentage() {
        return this.AlertPercentage;
    }

    /**
     * Set Threshold (in percentage) that triggers alarms
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AlertPercentage Threshold (in percentage) that triggers alarms
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAlertPercentage(Long AlertPercentage) {
        this.AlertPercentage = AlertPercentage;
    }

    /**
     * Get Whether to enable alerts for cumulative usage limit. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return AlertSwitch Whether to enable alerts for cumulative usage limit. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAlertSwitch() {
        return this.AlertSwitch;
    }

    /**
     * Set Whether to enable alerts for cumulative usage limit. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param AlertSwitch Whether to enable alerts for cumulative usage limit. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAlertSwitch(String AlertSwitch) {
        this.AlertSwitch = AlertSwitch;
    }

    /**
     * Get Metric type. `flux`: Traffic; `bandwidth`: Bandwidth.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Metric Metric type. `flux`: Traffic; `bandwidth`: Bandwidth.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Metric type. `flux`: Traffic; `bandwidth`: Bandwidth.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Metric Metric type. `flux`: Traffic; `bandwidth`: Bandwidth.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get  
     * @return Cycle 
     */
    public Long getCycle() {
        return this.Cycle;
    }

    /**
     * Set 
     * @param Cycle 
     */
    public void setCycle(Long Cycle) {
        this.Cycle = Cycle;
    }

    /**
     * Get Whether to enable cumulative usage limit. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Switch Whether to enable cumulative usage limit. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable cumulative usage limit. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Switch Whether to enable cumulative usage limit. Values:
`on`: Enable
`off`: Disable
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public StatisticItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatisticItem(StatisticItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UnBlockTime != null) {
            this.UnBlockTime = new Long(source.UnBlockTime);
        }
        if (source.BpsThreshold != null) {
            this.BpsThreshold = new Long(source.BpsThreshold);
        }
        if (source.CounterMeasure != null) {
            this.CounterMeasure = new String(source.CounterMeasure);
        }
        if (source.AlertPercentage != null) {
            this.AlertPercentage = new Long(source.AlertPercentage);
        }
        if (source.AlertSwitch != null) {
            this.AlertSwitch = new String(source.AlertSwitch);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Cycle != null) {
            this.Cycle = new Long(source.Cycle);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UnBlockTime", this.UnBlockTime);
        this.setParamSimple(map, prefix + "BpsThreshold", this.BpsThreshold);
        this.setParamSimple(map, prefix + "CounterMeasure", this.CounterMeasure);
        this.setParamSimple(map, prefix + "AlertPercentage", this.AlertPercentage);
        this.setParamSimple(map, prefix + "AlertSwitch", this.AlertSwitch);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Cycle", this.Cycle);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}

