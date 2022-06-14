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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BandwidthAlert extends AbstractModel{

    /**
    * Specifies whether to enable the bandwidth cap
`on`: enable
`off`: disable
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * The upper limit of bandwidth usage (in bps) or traffic usage (in bytes).
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BpsThreshold")
    @Expose
    private Long BpsThreshold;

    /**
    * Action taken when threshold is reached
RESOLVE_DNS_TO_ORIGIN: requests will be forwarded to the origin server. This is only supported for domain names of external origin.
RETURN_404: a 404 error will be returned for all requests.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CounterMeasure")
    @Expose
    private String CounterMeasure;

    /**
    * The last time when the usage upper limit in the Chinese mainland was reached
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LastTriggerTime")
    @Expose
    private String LastTriggerTime;

    /**
    * Indicates whether to trigger alerts when the upper limit is reached
`on`: enable
`off`: disable
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AlertSwitch")
    @Expose
    private String AlertSwitch;

    /**
    * Triggers alarms when the ratio of bandwidth or traffic usage to the usage upper limit reaches the specified value
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AlertPercentage")
    @Expose
    private Long AlertPercentage;

    /**
    * The last time when the usage outside the Chinese mainland reached the upper limit
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("LastTriggerTimeOverseas")
    @Expose
    private String LastTriggerTimeOverseas;

    /**
    * Dimension of the usage limit
`bandwidth`: bandwidth
`flux`: traffic
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
     * Get Specifies whether to enable the bandwidth cap
`on`: enable
`off`: disable 
     * @return Switch Specifies whether to enable the bandwidth cap
`on`: enable
`off`: disable
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Specifies whether to enable the bandwidth cap
`on`: enable
`off`: disable
     * @param Switch Specifies whether to enable the bandwidth cap
`on`: enable
`off`: disable
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get The upper limit of bandwidth usage (in bps) or traffic usage (in bytes).
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return BpsThreshold The upper limit of bandwidth usage (in bps) or traffic usage (in bytes).
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getBpsThreshold() {
        return this.BpsThreshold;
    }

    /**
     * Set The upper limit of bandwidth usage (in bps) or traffic usage (in bytes).
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param BpsThreshold The upper limit of bandwidth usage (in bps) or traffic usage (in bytes).
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBpsThreshold(Long BpsThreshold) {
        this.BpsThreshold = BpsThreshold;
    }

    /**
     * Get Action taken when threshold is reached
RESOLVE_DNS_TO_ORIGIN: requests will be forwarded to the origin server. This is only supported for domain names of external origin.
RETURN_404: a 404 error will be returned for all requests.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CounterMeasure Action taken when threshold is reached
RESOLVE_DNS_TO_ORIGIN: requests will be forwarded to the origin server. This is only supported for domain names of external origin.
RETURN_404: a 404 error will be returned for all requests.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCounterMeasure() {
        return this.CounterMeasure;
    }

    /**
     * Set Action taken when threshold is reached
RESOLVE_DNS_TO_ORIGIN: requests will be forwarded to the origin server. This is only supported for domain names of external origin.
RETURN_404: a 404 error will be returned for all requests.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CounterMeasure Action taken when threshold is reached
RESOLVE_DNS_TO_ORIGIN: requests will be forwarded to the origin server. This is only supported for domain names of external origin.
RETURN_404: a 404 error will be returned for all requests.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCounterMeasure(String CounterMeasure) {
        this.CounterMeasure = CounterMeasure;
    }

    /**
     * Get The last time when the usage upper limit in the Chinese mainland was reached
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LastTriggerTime The last time when the usage upper limit in the Chinese mainland was reached
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLastTriggerTime() {
        return this.LastTriggerTime;
    }

    /**
     * Set The last time when the usage upper limit in the Chinese mainland was reached
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LastTriggerTime The last time when the usage upper limit in the Chinese mainland was reached
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLastTriggerTime(String LastTriggerTime) {
        this.LastTriggerTime = LastTriggerTime;
    }

    /**
     * Get Indicates whether to trigger alerts when the upper limit is reached
`on`: enable
`off`: disable
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AlertSwitch Indicates whether to trigger alerts when the upper limit is reached
`on`: enable
`off`: disable
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAlertSwitch() {
        return this.AlertSwitch;
    }

    /**
     * Set Indicates whether to trigger alerts when the upper limit is reached
`on`: enable
`off`: disable
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AlertSwitch Indicates whether to trigger alerts when the upper limit is reached
`on`: enable
`off`: disable
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAlertSwitch(String AlertSwitch) {
        this.AlertSwitch = AlertSwitch;
    }

    /**
     * Get Triggers alarms when the ratio of bandwidth or traffic usage to the usage upper limit reaches the specified value
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AlertPercentage Triggers alarms when the ratio of bandwidth or traffic usage to the usage upper limit reaches the specified value
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getAlertPercentage() {
        return this.AlertPercentage;
    }

    /**
     * Set Triggers alarms when the ratio of bandwidth or traffic usage to the usage upper limit reaches the specified value
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AlertPercentage Triggers alarms when the ratio of bandwidth or traffic usage to the usage upper limit reaches the specified value
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAlertPercentage(Long AlertPercentage) {
        this.AlertPercentage = AlertPercentage;
    }

    /**
     * Get The last time when the usage outside the Chinese mainland reached the upper limit
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return LastTriggerTimeOverseas The last time when the usage outside the Chinese mainland reached the upper limit
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLastTriggerTimeOverseas() {
        return this.LastTriggerTimeOverseas;
    }

    /**
     * Set The last time when the usage outside the Chinese mainland reached the upper limit
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param LastTriggerTimeOverseas The last time when the usage outside the Chinese mainland reached the upper limit
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLastTriggerTimeOverseas(String LastTriggerTimeOverseas) {
        this.LastTriggerTimeOverseas = LastTriggerTimeOverseas;
    }

    /**
     * Get Dimension of the usage limit
`bandwidth`: bandwidth
`flux`: traffic
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Metric Dimension of the usage limit
`bandwidth`: bandwidth
`flux`: traffic
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Dimension of the usage limit
`bandwidth`: bandwidth
`flux`: traffic
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Metric Dimension of the usage limit
`bandwidth`: bandwidth
`flux`: traffic
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    public BandwidthAlert() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BandwidthAlert(BandwidthAlert source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.BpsThreshold != null) {
            this.BpsThreshold = new Long(source.BpsThreshold);
        }
        if (source.CounterMeasure != null) {
            this.CounterMeasure = new String(source.CounterMeasure);
        }
        if (source.LastTriggerTime != null) {
            this.LastTriggerTime = new String(source.LastTriggerTime);
        }
        if (source.AlertSwitch != null) {
            this.AlertSwitch = new String(source.AlertSwitch);
        }
        if (source.AlertPercentage != null) {
            this.AlertPercentage = new Long(source.AlertPercentage);
        }
        if (source.LastTriggerTimeOverseas != null) {
            this.LastTriggerTimeOverseas = new String(source.LastTriggerTimeOverseas);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "BpsThreshold", this.BpsThreshold);
        this.setParamSimple(map, prefix + "CounterMeasure", this.CounterMeasure);
        this.setParamSimple(map, prefix + "LastTriggerTime", this.LastTriggerTime);
        this.setParamSimple(map, prefix + "AlertSwitch", this.AlertSwitch);
        this.setParamSimple(map, prefix + "AlertPercentage", this.AlertPercentage);
        this.setParamSimple(map, prefix + "LastTriggerTimeOverseas", this.LastTriggerTimeOverseas);
        this.setParamSimple(map, prefix + "Metric", this.Metric);

    }
}

