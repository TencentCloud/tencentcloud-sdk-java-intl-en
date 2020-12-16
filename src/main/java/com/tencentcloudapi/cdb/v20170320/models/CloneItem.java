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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneItem extends AbstractModel{

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

    }
}

