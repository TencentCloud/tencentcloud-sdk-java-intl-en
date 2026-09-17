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

public class CLSDeliverTaskInfo extends AbstractModel {

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Task name</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>Main account id</p>
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

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
    * <p>Compliance guarantee</p>
    */
    @SerializedName("Compliance")
    @Expose
    private Long Compliance;

    /**
    * <p>Task status.</p><p>Enumeration values: </p><ul><li>0: Running, </li><li>1: Paused, </li><li>2: Completed, </li><li>3: Exception.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Status.</p><p>Enumeration values: </p><ul><li>0: Running, </li><li>1: Suspended.</li></ul>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>Task progress percentage</p>
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * <p>Whether delivery service log is enabled.</p><p>Enumeration values:</p><ul><li>1: Disabled</li><li>2: Enabled</li></ul>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * <p>Creation time.</p><p>Unit: unix second-level timestamp</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>Update time</p><p>Unit: unix second-level timestamp</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

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
     * Get <p>Task name</p> 
     * @return TaskName <p>Task name</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>Task name</p>
     * @param TaskName <p>Task name</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>Main account id</p> 
     * @return Uin <p>Main account id</p>
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set <p>Main account id</p>
     * @param Uin <p>Main account id</p>
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
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
     * Get <p>Compliance guarantee</p> 
     * @return Compliance <p>Compliance guarantee</p>
     */
    public Long getCompliance() {
        return this.Compliance;
    }

    /**
     * Set <p>Compliance guarantee</p>
     * @param Compliance <p>Compliance guarantee</p>
     */
    public void setCompliance(Long Compliance) {
        this.Compliance = Compliance;
    }

    /**
     * Get <p>Task status.</p><p>Enumeration values: </p><ul><li>0: Running, </li><li>1: Paused, </li><li>2: Completed, </li><li>3: Exception.</li></ul> 
     * @return Status <p>Task status.</p><p>Enumeration values: </p><ul><li>0: Running, </li><li>1: Paused, </li><li>2: Completed, </li><li>3: Exception.</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Task status.</p><p>Enumeration values: </p><ul><li>0: Running, </li><li>1: Paused, </li><li>2: Completed, </li><li>3: Exception.</li></ul>
     * @param Status <p>Task status.</p><p>Enumeration values: </p><ul><li>0: Running, </li><li>1: Paused, </li><li>2: Completed, </li><li>3: Exception.</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Status.</p><p>Enumeration values: </p><ul><li>0: Running, </li><li>1: Suspended.</li></ul> 
     * @return Enable <p>Status.</p><p>Enumeration values: </p><ul><li>0: Running, </li><li>1: Suspended.</li></ul>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Status.</p><p>Enumeration values: </p><ul><li>0: Running, </li><li>1: Suspended.</li></ul>
     * @param Enable <p>Status.</p><p>Enumeration values: </p><ul><li>0: Running, </li><li>1: Suspended.</li></ul>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>Task progress percentage</p> 
     * @return Progress <p>Task progress percentage</p>
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>Task progress percentage</p>
     * @param Progress <p>Task progress percentage</p>
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
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

    /**
     * Get <p>Creation time.</p><p>Unit: unix second-level timestamp</p> 
     * @return CreateTime <p>Creation time.</p><p>Unit: unix second-level timestamp</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p><p>Unit: unix second-level timestamp</p>
     * @param CreateTime <p>Creation time.</p><p>Unit: unix second-level timestamp</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time</p><p>Unit: unix second-level timestamp</p> 
     * @return UpdateTime <p>Update time</p><p>Unit: unix second-level timestamp</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time</p><p>Unit: unix second-level timestamp</p>
     * @param UpdateTime <p>Update time</p><p>Unit: unix second-level timestamp</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public CLSDeliverTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CLSDeliverTaskInfo(CLSDeliverTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
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
        if (source.Compliance != null) {
            this.Compliance = new Long(source.Compliance);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
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
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamObj(map, prefix + "SourceTopicConfig.", this.SourceTopicConfig);
        this.setParamObj(map, prefix + "TargetTopicConfig.", this.TargetTopicConfig);
        this.setParamObj(map, prefix + "DeliverRule.", this.DeliverRule);
        this.setParamSimple(map, prefix + "Compliance", this.Compliance);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

