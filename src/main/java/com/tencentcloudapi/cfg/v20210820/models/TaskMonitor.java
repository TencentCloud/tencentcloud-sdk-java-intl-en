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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskMonitor extends AbstractModel {

    /**
    * Experiment monitoring metric ID
    */
    @SerializedName("TaskMonitorId")
    @Expose
    private Long TaskMonitorId;

    /**
    * Monitoring metric ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * Object type ID of the monitoring metric
    */
    @SerializedName("TaskMonitorObjectTypeId")
    @Expose
    private Long TaskMonitorObjectTypeId;

    /**
    * Metric name
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * Instance ID list
    */
    @SerializedName("InstancesIds")
    @Expose
    private String [] InstancesIds;

    /**
    * Metric in Chinese
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MetricChineseName")
    @Expose
    private String MetricChineseName;

    /**
    * Unit
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
     * Get Experiment monitoring metric ID 
     * @return TaskMonitorId Experiment monitoring metric ID
     */
    public Long getTaskMonitorId() {
        return this.TaskMonitorId;
    }

    /**
     * Set Experiment monitoring metric ID
     * @param TaskMonitorId Experiment monitoring metric ID
     */
    public void setTaskMonitorId(Long TaskMonitorId) {
        this.TaskMonitorId = TaskMonitorId;
    }

    /**
     * Get Monitoring metric ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetricId Monitoring metric ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMetricId() {
        return this.MetricId;
    }

    /**
     * Set Monitoring metric ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetricId Monitoring metric ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetricId(Long MetricId) {
        this.MetricId = MetricId;
    }

    /**
     * Get Object type ID of the monitoring metric 
     * @return TaskMonitorObjectTypeId Object type ID of the monitoring metric
     */
    public Long getTaskMonitorObjectTypeId() {
        return this.TaskMonitorObjectTypeId;
    }

    /**
     * Set Object type ID of the monitoring metric
     * @param TaskMonitorObjectTypeId Object type ID of the monitoring metric
     */
    public void setTaskMonitorObjectTypeId(Long TaskMonitorObjectTypeId) {
        this.TaskMonitorObjectTypeId = TaskMonitorObjectTypeId;
    }

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
     * Get Instance ID list 
     * @return InstancesIds Instance ID list
     */
    public String [] getInstancesIds() {
        return this.InstancesIds;
    }

    /**
     * Set Instance ID list
     * @param InstancesIds Instance ID list
     */
    public void setInstancesIds(String [] InstancesIds) {
        this.InstancesIds = InstancesIds;
    }

    /**
     * Get Metric in Chinese
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MetricChineseName Metric in Chinese
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMetricChineseName() {
        return this.MetricChineseName;
    }

    /**
     * Set Metric in Chinese
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MetricChineseName Metric in Chinese
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetricChineseName(String MetricChineseName) {
        this.MetricChineseName = MetricChineseName;
    }

    /**
     * Get Unit
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Unit Unit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Unit
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Unit Unit
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public TaskMonitor() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskMonitor(TaskMonitor source) {
        if (source.TaskMonitorId != null) {
            this.TaskMonitorId = new Long(source.TaskMonitorId);
        }
        if (source.MetricId != null) {
            this.MetricId = new Long(source.MetricId);
        }
        if (source.TaskMonitorObjectTypeId != null) {
            this.TaskMonitorObjectTypeId = new Long(source.TaskMonitorObjectTypeId);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.InstancesIds != null) {
            this.InstancesIds = new String[source.InstancesIds.length];
            for (int i = 0; i < source.InstancesIds.length; i++) {
                this.InstancesIds[i] = new String(source.InstancesIds[i]);
            }
        }
        if (source.MetricChineseName != null) {
            this.MetricChineseName = new String(source.MetricChineseName);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskMonitorId", this.TaskMonitorId);
        this.setParamSimple(map, prefix + "MetricId", this.MetricId);
        this.setParamSimple(map, prefix + "TaskMonitorObjectTypeId", this.TaskMonitorObjectTypeId);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamArraySimple(map, prefix + "InstancesIds.", this.InstancesIds);
        this.setParamSimple(map, prefix + "MetricChineseName", this.MetricChineseName);
        this.setParamSimple(map, prefix + "Unit", this.Unit);

    }
}

