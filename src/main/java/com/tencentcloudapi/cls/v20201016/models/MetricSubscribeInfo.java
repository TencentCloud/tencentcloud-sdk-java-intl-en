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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricSubscribeInfo extends AbstractModel {

    /**
    * Subscription task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Log topic ID.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Subscription task name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Cloud product namespace.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Metric configuration information.
    */
    @SerializedName("Metrics")
    @Expose
    private MetricConfig [] Metrics;

    /**
    * Instance configuration information.
    */
    @SerializedName("InstanceInfo")
    @Expose
    private InstanceConfig InstanceInfo;

    /**
    * Subscription task switch. Valid values: 1: paused; 2: enabled.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Subscription task running status. Valid values: 0 creating; 1: paused; 2: running; 3: abnormal.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Error information occurred when a subscription task runs abnormally.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * Creation time (timestamp in seconds)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Update time (second-level timestamp)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Subscription task ID. 
     * @return TaskId Subscription task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Subscription task ID.
     * @param TaskId Subscription task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Log topic ID. 
     * @return TopicId Log topic ID.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID.
     * @param TopicId Log topic ID.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Subscription task name. 
     * @return Name Subscription task name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Subscription task name.
     * @param Name Subscription task name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Cloud product namespace. 
     * @return Namespace Cloud product namespace.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Cloud product namespace.
     * @param Namespace Cloud product namespace.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Metric configuration information. 
     * @return Metrics Metric configuration information.
     */
    public MetricConfig [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set Metric configuration information.
     * @param Metrics Metric configuration information.
     */
    public void setMetrics(MetricConfig [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get Instance configuration information. 
     * @return InstanceInfo Instance configuration information.
     */
    public InstanceConfig getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set Instance configuration information.
     * @param InstanceInfo Instance configuration information.
     */
    public void setInstanceInfo(InstanceConfig InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    /**
     * Get Subscription task switch. Valid values: 1: paused; 2: enabled. 
     * @return Enable Subscription task switch. Valid values: 1: paused; 2: enabled.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Subscription task switch. Valid values: 1: paused; 2: enabled.
     * @param Enable Subscription task switch. Valid values: 1: paused; 2: enabled.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Subscription task running status. Valid values: 0 creating; 1: paused; 2: running; 3: abnormal. 
     * @return Status Subscription task running status. Valid values: 0 creating; 1: paused; 2: running; 3: abnormal.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Subscription task running status. Valid values: 0 creating; 1: paused; 2: running; 3: abnormal.
     * @param Status Subscription task running status. Valid values: 0 creating; 1: paused; 2: running; 3: abnormal.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Error information occurred when a subscription task runs abnormally.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErrMsg Error information occurred when a subscription task runs abnormally.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set Error information occurred when a subscription task runs abnormally.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErrMsg Error information occurred when a subscription task runs abnormally.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Get Creation time (timestamp in seconds)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time (timestamp in seconds)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time (timestamp in seconds)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time (timestamp in seconds)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time (second-level timestamp)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time (second-level timestamp)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time (second-level timestamp)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time (second-level timestamp)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public MetricSubscribeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricSubscribeInfo(MetricSubscribeInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Metrics != null) {
            this.Metrics = new MetricConfig[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new MetricConfig(source.Metrics[i]);
            }
        }
        if (source.InstanceInfo != null) {
            this.InstanceInfo = new InstanceConfig(source.InstanceInfo);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

