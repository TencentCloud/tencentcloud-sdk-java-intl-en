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

public class DescribeStatisticDataRequest extends AbstractModel{

    /**
    * Module, whose value is fixed at `monitor`
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Namespace. Valid values: `QCE`, `TKE2`.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Metric name list
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * Dimension condition. The `=` and `in` operators are supported
    */
    @SerializedName("Conditions")
    @Expose
    private MidQueryCondition [] Conditions;

    /**
    * Statistical period in seconds. Default value: 300. Optional values: 60, 300, 3,600, and 86,400.
Due to the storage period limit, the statistical period is subject to the time range of statistics:
60s: The time range is less than 12 hours, and the timespan between `StartTime` and the current time cannot exceed 15 days.
300s: The time range is less than three days, and the timespan between `StartTime` and the current time cannot exceed 31 days.
3,600s: The time range is less than 30 days, and the timespan between `StartTime` and the current time cannot exceed 93 days.
86,400s: The time range is less than 186 days, and the timespan between `StartTime` and the current time cannot exceed 186 days.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Start time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * `groupBy` by the specified dimension
    */
    @SerializedName("GroupBys")
    @Expose
    private String [] GroupBys;

    /**
     * Get Module, whose value is fixed at `monitor` 
     * @return Module Module, whose value is fixed at `monitor`
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Module, whose value is fixed at `monitor`
     * @param Module Module, whose value is fixed at `monitor`
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Namespace. Valid values: `QCE`, `TKE2`. 
     * @return Namespace Namespace. Valid values: `QCE`, `TKE2`.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace. Valid values: `QCE`, `TKE2`.
     * @param Namespace Namespace. Valid values: `QCE`, `TKE2`.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Metric name list 
     * @return MetricNames Metric name list
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Metric name list
     * @param MetricNames Metric name list
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get Dimension condition. The `=` and `in` operators are supported 
     * @return Conditions Dimension condition. The `=` and `in` operators are supported
     */
    public MidQueryCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Dimension condition. The `=` and `in` operators are supported
     * @param Conditions Dimension condition. The `=` and `in` operators are supported
     */
    public void setConditions(MidQueryCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get Statistical period in seconds. Default value: 300. Optional values: 60, 300, 3,600, and 86,400.
Due to the storage period limit, the statistical period is subject to the time range of statistics:
60s: The time range is less than 12 hours, and the timespan between `StartTime` and the current time cannot exceed 15 days.
300s: The time range is less than three days, and the timespan between `StartTime` and the current time cannot exceed 31 days.
3,600s: The time range is less than 30 days, and the timespan between `StartTime` and the current time cannot exceed 93 days.
86,400s: The time range is less than 186 days, and the timespan between `StartTime` and the current time cannot exceed 186 days. 
     * @return Period Statistical period in seconds. Default value: 300. Optional values: 60, 300, 3,600, and 86,400.
Due to the storage period limit, the statistical period is subject to the time range of statistics:
60s: The time range is less than 12 hours, and the timespan between `StartTime` and the current time cannot exceed 15 days.
300s: The time range is less than three days, and the timespan between `StartTime` and the current time cannot exceed 31 days.
3,600s: The time range is less than 30 days, and the timespan between `StartTime` and the current time cannot exceed 93 days.
86,400s: The time range is less than 186 days, and the timespan between `StartTime` and the current time cannot exceed 186 days.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Statistical period in seconds. Default value: 300. Optional values: 60, 300, 3,600, and 86,400.
Due to the storage period limit, the statistical period is subject to the time range of statistics:
60s: The time range is less than 12 hours, and the timespan between `StartTime` and the current time cannot exceed 15 days.
300s: The time range is less than three days, and the timespan between `StartTime` and the current time cannot exceed 31 days.
3,600s: The time range is less than 30 days, and the timespan between `StartTime` and the current time cannot exceed 93 days.
86,400s: The time range is less than 186 days, and the timespan between `StartTime` and the current time cannot exceed 186 days.
     * @param Period Statistical period in seconds. Default value: 300. Optional values: 60, 300, 3,600, and 86,400.
Due to the storage period limit, the statistical period is subject to the time range of statistics:
60s: The time range is less than 12 hours, and the timespan between `StartTime` and the current time cannot exceed 15 days.
300s: The time range is less than three days, and the timespan between `StartTime` and the current time cannot exceed 31 days.
3,600s: The time range is less than 30 days, and the timespan between `StartTime` and the current time cannot exceed 93 days.
86,400s: The time range is less than 186 days, and the timespan between `StartTime` and the current time cannot exceed 186 days.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Start time, which is the current time by default, such as 2020-12-08T19:51:23+08:00 
     * @return StartTime Start time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
     * @param StartTime Start time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, which is the current time by default, such as 2020-12-08T19:51:23+08:00 
     * @return EndTime End time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
     * @param EndTime End time, which is the current time by default, such as 2020-12-08T19:51:23+08:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get `groupBy` by the specified dimension 
     * @return GroupBys `groupBy` by the specified dimension
     */
    public String [] getGroupBys() {
        return this.GroupBys;
    }

    /**
     * Set `groupBy` by the specified dimension
     * @param GroupBys `groupBy` by the specified dimension
     */
    public void setGroupBys(String [] GroupBys) {
        this.GroupBys = GroupBys;
    }

    public DescribeStatisticDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStatisticDataRequest(DescribeStatisticDataRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.Conditions != null) {
            this.Conditions = new MidQueryCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new MidQueryCondition(source.Conditions[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.GroupBys != null) {
            this.GroupBys = new String[source.GroupBys.length];
            for (int i = 0; i < source.GroupBys.length; i++) {
                this.GroupBys[i] = new String(source.GroupBys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "GroupBys.", this.GroupBys);

    }
}

