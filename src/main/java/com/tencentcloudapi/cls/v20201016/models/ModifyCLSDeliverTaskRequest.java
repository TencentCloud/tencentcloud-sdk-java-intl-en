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

public class ModifyCLSDeliverTaskRequest extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Task name</p><p>Parameter format: <code>^[a-zA-Z0-9_-]{1,64}$</code></p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>Source topic information</p>
    */
    @SerializedName("SourceTopicConfig")
    @Expose
    private SourceTopicConfig SourceTopicConfig;

    /**
    * <p>Target topic information</p>
    */
    @SerializedName("TargetTopicConfig")
    @Expose
    private TargetTopicConfig TargetTopicConfig;

    /**
    * <p>Shipping Rule</p>
    */
    @SerializedName("DeliverRule")
    @Expose
    private DeliverRule DeliverRule;

    /**
    * <p>Status.</p><p>Enumeration values: </p><ul><li>0: Running, </li><li>1: Suspension.</li></ul>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>Whether delivery service log is enabled.</p><p>Enumeration values:</p><ul><li>1: Disabled</li><li>2: Enabled</li></ul>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Task name</p><p>Parameter format: <code>^[a-zA-Z0-9_-]{1,64}$</code></p> 
     * @return TaskName <p>Task name</p><p>Parameter format: <code>^[a-zA-Z0-9_-]{1,64}$</code></p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>Task name</p><p>Parameter format: <code>^[a-zA-Z0-9_-]{1,64}$</code></p>
     * @param TaskName <p>Task name</p><p>Parameter format: <code>^[a-zA-Z0-9_-]{1,64}$</code></p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>Source topic information</p> 
     * @return SourceTopicConfig <p>Source topic information</p>
     */
    public SourceTopicConfig getSourceTopicConfig() {
        return this.SourceTopicConfig;
    }

    /**
     * Set <p>Source topic information</p>
     * @param SourceTopicConfig <p>Source topic information</p>
     */
    public void setSourceTopicConfig(SourceTopicConfig SourceTopicConfig) {
        this.SourceTopicConfig = SourceTopicConfig;
    }

    /**
     * Get <p>Target topic information</p> 
     * @return TargetTopicConfig <p>Target topic information</p>
     */
    public TargetTopicConfig getTargetTopicConfig() {
        return this.TargetTopicConfig;
    }

    /**
     * Set <p>Target topic information</p>
     * @param TargetTopicConfig <p>Target topic information</p>
     */
    public void setTargetTopicConfig(TargetTopicConfig TargetTopicConfig) {
        this.TargetTopicConfig = TargetTopicConfig;
    }

    /**
     * Get <p>Shipping Rule</p> 
     * @return DeliverRule <p>Shipping Rule</p>
     */
    public DeliverRule getDeliverRule() {
        return this.DeliverRule;
    }

    /**
     * Set <p>Shipping Rule</p>
     * @param DeliverRule <p>Shipping Rule</p>
     */
    public void setDeliverRule(DeliverRule DeliverRule) {
        this.DeliverRule = DeliverRule;
    }

    /**
     * Get <p>Status.</p><p>Enumeration values: </p><ul><li>0: Running, </li><li>1: Suspension.</li></ul> 
     * @return Enable <p>Status.</p><p>Enumeration values: </p><ul><li>0: Running, </li><li>1: Suspension.</li></ul>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Status.</p><p>Enumeration values: </p><ul><li>0: Running, </li><li>1: Suspension.</li></ul>
     * @param Enable <p>Status.</p><p>Enumeration values: </p><ul><li>0: Running, </li><li>1: Suspension.</li></ul>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>Whether delivery service log is enabled.</p><p>Enumeration values:</p><ul><li>1: Disabled</li><li>2: Enabled</li></ul> 
     * @return HasServicesLog <p>Whether delivery service log is enabled.</p><p>Enumeration values:</p><ul><li>1: Disabled</li><li>2: Enabled</li></ul>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>Whether delivery service log is enabled.</p><p>Enumeration values:</p><ul><li>1: Disabled</li><li>2: Enabled</li></ul>
     * @param HasServicesLog <p>Whether delivery service log is enabled.</p><p>Enumeration values:</p><ul><li>1: Disabled</li><li>2: Enabled</li></ul>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    public ModifyCLSDeliverTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCLSDeliverTaskRequest(ModifyCLSDeliverTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.SourceTopicConfig != null) {
            this.SourceTopicConfig = new SourceTopicConfig(source.SourceTopicConfig);
        }
        if (source.TargetTopicConfig != null) {
            this.TargetTopicConfig = new TargetTopicConfig(source.TargetTopicConfig);
        }
        if (source.DeliverRule != null) {
            this.DeliverRule = new DeliverRule(source.DeliverRule);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamObj(map, prefix + "SourceTopicConfig.", this.SourceTopicConfig);
        this.setParamObj(map, prefix + "TargetTopicConfig.", this.TargetTopicConfig);
        this.setParamObj(map, prefix + "DeliverRule.", this.DeliverRule);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);

    }
}

