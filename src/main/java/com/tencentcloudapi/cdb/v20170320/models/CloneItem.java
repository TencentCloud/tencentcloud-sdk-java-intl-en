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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneItem extends AbstractModel {

    /**
    * ID of the original instance in a clone task
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * ID of the cloned instance in a clone task
    */
    @SerializedName("DstInstanceId")
    @Expose
    private String DstInstanceId;

    /**
    * Clone task ID
    */
    @SerializedName("CloneJobId")
    @Expose
    private Long CloneJobId;

    /**
    * The policy used in a clone task. Valid values: `timepoint` (roll back to a specific point in time), `backupset` (roll back by using a specific backup file).
    */
    @SerializedName("RollbackStrategy")
    @Expose
    private String RollbackStrategy;

    /**
    * The point in time to which the cloned instance will be rolled back
    */
    @SerializedName("RollbackTargetTime")
    @Expose
    private String RollbackTargetTime;

    /**
    * Task start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task status. Valid values: `initial`, `running`, `wait_complete`, `success`, `failed`.
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * Clone instance region ID
    */
    @SerializedName("NewRegionId")
    @Expose
    private Long NewRegionId;

    /**
    * Source instance region ID
    */
    @SerializedName("SrcRegionId")
    @Expose
    private Long SrcRegionId;

    /**
     * Get ID of the original instance in a clone task 
     * @return SrcInstanceId ID of the original instance in a clone task
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set ID of the original instance in a clone task
     * @param SrcInstanceId ID of the original instance in a clone task
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get ID of the cloned instance in a clone task 
     * @return DstInstanceId ID of the cloned instance in a clone task
     */
    public String getDstInstanceId() {
        return this.DstInstanceId;
    }

    /**
     * Set ID of the cloned instance in a clone task
     * @param DstInstanceId ID of the cloned instance in a clone task
     */
    public void setDstInstanceId(String DstInstanceId) {
        this.DstInstanceId = DstInstanceId;
    }

    /**
     * Get Clone task ID 
     * @return CloneJobId Clone task ID
     */
    public Long getCloneJobId() {
        return this.CloneJobId;
    }

    /**
     * Set Clone task ID
     * @param CloneJobId Clone task ID
     */
    public void setCloneJobId(Long CloneJobId) {
        this.CloneJobId = CloneJobId;
    }

    /**
     * Get The policy used in a clone task. Valid values: `timepoint` (roll back to a specific point in time), `backupset` (roll back by using a specific backup file). 
     * @return RollbackStrategy The policy used in a clone task. Valid values: `timepoint` (roll back to a specific point in time), `backupset` (roll back by using a specific backup file).
     */
    public String getRollbackStrategy() {
        return this.RollbackStrategy;
    }

    /**
     * Set The policy used in a clone task. Valid values: `timepoint` (roll back to a specific point in time), `backupset` (roll back by using a specific backup file).
     * @param RollbackStrategy The policy used in a clone task. Valid values: `timepoint` (roll back to a specific point in time), `backupset` (roll back by using a specific backup file).
     */
    public void setRollbackStrategy(String RollbackStrategy) {
        this.RollbackStrategy = RollbackStrategy;
    }

    /**
     * Get The point in time to which the cloned instance will be rolled back 
     * @return RollbackTargetTime The point in time to which the cloned instance will be rolled back
     */
    public String getRollbackTargetTime() {
        return this.RollbackTargetTime;
    }

    /**
     * Set The point in time to which the cloned instance will be rolled back
     * @param RollbackTargetTime The point in time to which the cloned instance will be rolled back
     */
    public void setRollbackTargetTime(String RollbackTargetTime) {
        this.RollbackTargetTime = RollbackTargetTime;
    }

    /**
     * Get Task start time 
     * @return StartTime Task start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time
     * @param StartTime Task start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task end time 
     * @return EndTime Task end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time
     * @param EndTime Task end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task status. Valid values: `initial`, `running`, `wait_complete`, `success`, `failed`. 
     * @return TaskStatus Task status. Valid values: `initial`, `running`, `wait_complete`, `success`, `failed`.
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Task status. Valid values: `initial`, `running`, `wait_complete`, `success`, `failed`.
     * @param TaskStatus Task status. Valid values: `initial`, `running`, `wait_complete`, `success`, `failed`.
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Clone instance region ID 
     * @return NewRegionId Clone instance region ID
     */
    public Long getNewRegionId() {
        return this.NewRegionId;
    }

    /**
     * Set Clone instance region ID
     * @param NewRegionId Clone instance region ID
     */
    public void setNewRegionId(Long NewRegionId) {
        this.NewRegionId = NewRegionId;
    }

    /**
     * Get Source instance region ID 
     * @return SrcRegionId Source instance region ID
     */
    public Long getSrcRegionId() {
        return this.SrcRegionId;
    }

    /**
     * Set Source instance region ID
     * @param SrcRegionId Source instance region ID
     */
    public void setSrcRegionId(Long SrcRegionId) {
        this.SrcRegionId = SrcRegionId;
    }

    public CloneItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneItem(CloneItem source) {
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
        if (source.DstInstanceId != null) {
            this.DstInstanceId = new String(source.DstInstanceId);
        }
        if (source.CloneJobId != null) {
            this.CloneJobId = new Long(source.CloneJobId);
        }
        if (source.RollbackStrategy != null) {
            this.RollbackStrategy = new String(source.RollbackStrategy);
        }
        if (source.RollbackTargetTime != null) {
            this.RollbackTargetTime = new String(source.RollbackTargetTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.NewRegionId != null) {
            this.NewRegionId = new Long(source.NewRegionId);
        }
        if (source.SrcRegionId != null) {
            this.SrcRegionId = new Long(source.SrcRegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "DstInstanceId", this.DstInstanceId);
        this.setParamSimple(map, prefix + "CloneJobId", this.CloneJobId);
        this.setParamSimple(map, prefix + "RollbackStrategy", this.RollbackStrategy);
        this.setParamSimple(map, prefix + "RollbackTargetTime", this.RollbackTargetTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "NewRegionId", this.NewRegionId);
        this.setParamSimple(map, prefix + "SrcRegionId", this.SrcRegionId);

    }
}

