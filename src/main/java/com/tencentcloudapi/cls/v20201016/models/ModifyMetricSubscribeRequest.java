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

public class ModifyMetricSubscribeRequest extends AbstractModel {

    /**
    * Log topic ID of a metric collection task. This parameter is required.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Metric collection task ID. This parameter is required.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Name. It can contain a maximum of 64 characters and should start with a letter. Digits (0-9), uppercase letters (A-Z), lowercase letters (a-z), underscores (_), and Chinese characters are allowed.
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
    * Task status.

1: disabled

2: Enable
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get Log topic ID of a metric collection task. This parameter is required. 
     * @return TopicId Log topic ID of a metric collection task. This parameter is required.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID of a metric collection task. This parameter is required.
     * @param TopicId Log topic ID of a metric collection task. This parameter is required.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Metric collection task ID. This parameter is required. 
     * @return TaskId Metric collection task ID. This parameter is required.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Metric collection task ID. This parameter is required.
     * @param TaskId Metric collection task ID. This parameter is required.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Name. It can contain a maximum of 64 characters and should start with a letter. Digits (0-9), uppercase letters (A-Z), lowercase letters (a-z), underscores (_), and Chinese characters are allowed. 
     * @return Name Name. It can contain a maximum of 64 characters and should start with a letter. Digits (0-9), uppercase letters (A-Z), lowercase letters (a-z), underscores (_), and Chinese characters are allowed.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name. It can contain a maximum of 64 characters and should start with a letter. Digits (0-9), uppercase letters (A-Z), lowercase letters (a-z), underscores (_), and Chinese characters are allowed.
     * @param Name Name. It can contain a maximum of 64 characters and should start with a letter. Digits (0-9), uppercase letters (A-Z), lowercase letters (a-z), underscores (_), and Chinese characters are allowed.
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
     * Get Task status.

1: disabled

2: Enable 
     * @return Enable Task status.

1: disabled

2: Enable
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Task status.

1: disabled

2: Enable
     * @param Enable Task status.

1: disabled

2: Enable
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public ModifyMetricSubscribeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMetricSubscribeRequest(ModifyMetricSubscribeRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamObj(map, prefix + "InstanceInfo.", this.InstanceInfo);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

