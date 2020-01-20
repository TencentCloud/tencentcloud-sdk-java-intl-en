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

public class GetMonitorDataRequest extends AbstractModel{

    /**
    * Namespace. Each Tencent Cloud product has a namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Metric name. For detailed metric descriptions of each Tencent Cloud product, see the corresponding [Monitoring API](https://cloud.tencent.com/document/product/248/30384) document
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Combination of instance object dimensions
    */
    @SerializedName("Instances")
    @Expose
    private Instance [] Instances;

    /**
    * Monitoring statistical period. The default value is 300, and the unit is s
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Start time such as 2018-09-22T19:51:23+08:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time. Uses the current time by default and cannot be earlier than StartTime
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Namespace. Each Tencent Cloud product has a namespace 
     * @return Namespace Namespace. Each Tencent Cloud product has a namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace. Each Tencent Cloud product has a namespace
     * @param Namespace Namespace. Each Tencent Cloud product has a namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Metric name. For detailed metric descriptions of each Tencent Cloud product, see the corresponding [Monitoring API](https://cloud.tencent.com/document/product/248/30384) document 
     * @return MetricName Metric name. For detailed metric descriptions of each Tencent Cloud product, see the corresponding [Monitoring API](https://cloud.tencent.com/document/product/248/30384) document
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set Metric name. For detailed metric descriptions of each Tencent Cloud product, see the corresponding [Monitoring API](https://cloud.tencent.com/document/product/248/30384) document
     * @param MetricName Metric name. For detailed metric descriptions of each Tencent Cloud product, see the corresponding [Monitoring API](https://cloud.tencent.com/document/product/248/30384) document
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get Combination of instance object dimensions 
     * @return Instances Combination of instance object dimensions
     */
    public Instance [] getInstances() {
        return this.Instances;
    }

    /**
     * Set Combination of instance object dimensions
     * @param Instances Combination of instance object dimensions
     */
    public void setInstances(Instance [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get Monitoring statistical period. The default value is 300, and the unit is s 
     * @return Period Monitoring statistical period. The default value is 300, and the unit is s
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Monitoring statistical period. The default value is 300, and the unit is s
     * @param Period Monitoring statistical period. The default value is 300, and the unit is s
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Start time such as 2018-09-22T19:51:23+08:00 
     * @return StartTime Start time such as 2018-09-22T19:51:23+08:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time such as 2018-09-22T19:51:23+08:00
     * @param StartTime Start time such as 2018-09-22T19:51:23+08:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. Uses the current time by default and cannot be earlier than StartTime 
     * @return EndTime End time. Uses the current time by default and cannot be earlier than StartTime
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. Uses the current time by default and cannot be earlier than StartTime
     * @param EndTime End time. Uses the current time by default and cannot be earlier than StartTime
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

