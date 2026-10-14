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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Operation extends AbstractModel {

    /**
    * <p>Unique id of the operation</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Operation start time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Operation type.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Operation details.</p>
    */
    @SerializedName("Detail")
    @Expose
    private OperationDetail Detail;

    /**
    * <p>Operation result.</p>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>Process task info</p>
    */
    @SerializedName("Tasks")
    @Expose
    private TaskDetail [] Tasks;

    /**
    * <p>Operation progress.</p>
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * <p>Rollback tag. 0: not rolled back, 1: rolling back, 2: rolled back</p>
    */
    @SerializedName("RollbackTag")
    @Expose
    private Long RollbackTag;

    /**
    * <p>Operator Uin</p>
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * <p>Auto scaling flag. Valid values: 0 (non-auto) and 1 (auto).</p>
    */
    @SerializedName("AutoScaleTag")
    @Expose
    private Long AutoScaleTag;

    /**
    * <p>Process exception cause</p>
    */
    @SerializedName("SuspendedReason")
    @Expose
    private String SuspendedReason;

    /**
     * Get <p>Unique id of the operation</p> 
     * @return Id <p>Unique id of the operation</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Unique id of the operation</p>
     * @param Id <p>Unique id of the operation</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Operation start time.</p> 
     * @return StartTime <p>Operation start time.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Operation start time.</p>
     * @param StartTime <p>Operation start time.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Operation type.</p> 
     * @return Type <p>Operation type.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Operation type.</p>
     * @param Type <p>Operation type.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Operation details.</p> 
     * @return Detail <p>Operation details.</p>
     */
    public OperationDetail getDetail() {
        return this.Detail;
    }

    /**
     * Set <p>Operation details.</p>
     * @param Detail <p>Operation details.</p>
     */
    public void setDetail(OperationDetail Detail) {
        this.Detail = Detail;
    }

    /**
     * Get <p>Operation result.</p> 
     * @return Result <p>Operation result.</p>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>Operation result.</p>
     * @param Result <p>Operation result.</p>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>Process task info</p> 
     * @return Tasks <p>Process task info</p>
     */
    public TaskDetail [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>Process task info</p>
     * @param Tasks <p>Process task info</p>
     */
    public void setTasks(TaskDetail [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get <p>Operation progress.</p> 
     * @return Progress <p>Operation progress.</p>
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>Operation progress.</p>
     * @param Progress <p>Operation progress.</p>
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>Rollback tag. 0: not rolled back, 1: rolling back, 2: rolled back</p> 
     * @return RollbackTag <p>Rollback tag. 0: not rolled back, 1: rolling back, 2: rolled back</p>
     */
    public Long getRollbackTag() {
        return this.RollbackTag;
    }

    /**
     * Set <p>Rollback tag. 0: not rolled back, 1: rolling back, 2: rolled back</p>
     * @param RollbackTag <p>Rollback tag. 0: not rolled back, 1: rolling back, 2: rolled back</p>
     */
    public void setRollbackTag(Long RollbackTag) {
        this.RollbackTag = RollbackTag;
    }

    /**
     * Get <p>Operator Uin</p> 
     * @return SubAccountUin <p>Operator Uin</p>
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>Operator Uin</p>
     * @param SubAccountUin <p>Operator Uin</p>
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get <p>Auto scaling flag. Valid values: 0 (non-auto) and 1 (auto).</p> 
     * @return AutoScaleTag <p>Auto scaling flag. Valid values: 0 (non-auto) and 1 (auto).</p>
     */
    public Long getAutoScaleTag() {
        return this.AutoScaleTag;
    }

    /**
     * Set <p>Auto scaling flag. Valid values: 0 (non-auto) and 1 (auto).</p>
     * @param AutoScaleTag <p>Auto scaling flag. Valid values: 0 (non-auto) and 1 (auto).</p>
     */
    public void setAutoScaleTag(Long AutoScaleTag) {
        this.AutoScaleTag = AutoScaleTag;
    }

    /**
     * Get <p>Process exception cause</p> 
     * @return SuspendedReason <p>Process exception cause</p>
     */
    public String getSuspendedReason() {
        return this.SuspendedReason;
    }

    /**
     * Set <p>Process exception cause</p>
     * @param SuspendedReason <p>Process exception cause</p>
     */
    public void setSuspendedReason(String SuspendedReason) {
        this.SuspendedReason = SuspendedReason;
    }

    public Operation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Operation(Operation source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Detail != null) {
            this.Detail = new OperationDetail(source.Detail);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Tasks != null) {
            this.Tasks = new TaskDetail[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new TaskDetail(source.Tasks[i]);
            }
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.RollbackTag != null) {
            this.RollbackTag = new Long(source.RollbackTag);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.AutoScaleTag != null) {
            this.AutoScaleTag = new Long(source.AutoScaleTag);
        }
        if (source.SuspendedReason != null) {
            this.SuspendedReason = new String(source.SuspendedReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "RollbackTag", this.RollbackTag);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "AutoScaleTag", this.AutoScaleTag);
        this.setParamSimple(map, prefix + "SuspendedReason", this.SuspendedReason);

    }
}

