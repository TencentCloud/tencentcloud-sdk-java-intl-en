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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfoDetail extends AbstractModel {

    /**
    * Task ID 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Task start time 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task type. Valid values:  - `FLOW_CREATE`: Create an instance. - `FLOW_MODIFYCONNECTIONCONFIG`: Adjust the number of bandwidth connections. - `FLOW_MODIFYINSTANCEPASSWORDFREE`: Modify the process of password-free access. - `FLOW_CLEARNETWORK`: Returning VPC - `FLOW_SETPWD`: Set the access password. - `FLOW_EXPORSHR`: Expand or reduce the capacity. - `FLOW_UpgradeArch`: Upgrade the instance architecture. - `FLOW_MODIFYINSTANCEPARAMS`: Modify the instance parameters. - `FLOW_MODIFYINSTACEREADONLY`: Modify read-only process. - `FLOW_CLOSE`: Disable the instance. - `FLOW_DELETE`: Delete the instance. - `FLOW_OPEN_WAN`: Enable the public network. - `FLOW_FLOW_CLEAN`: Clear the instance. - `FLOW_MODIFYINSTANCEACCOUNT`: Modify the instance account. - `FLOW_ENABLEINSTANCE_REPLICATE`: Enable the replica read-only feature. - `FLOW_DISABLEINSTANCE_REPLICATE`: Disable the replica read-only feature. - `FLOW_SWITCHINSTANCEVIP`: Swap the VIPs of instances. - FLOW_CHANGE_REPLICA_TO_MSTER: Promote the replica node to the mater node. Backup instance 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Instance name 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance ID 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Project ID 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Task progress 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * Task end time 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Task execution status. Valid values: - `0` (initilized) - `1` (executing) - `2` (completed) - `4` (failed) 
Note:  This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
     * Get Task ID 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task start time 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Task start time 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Task start time 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task type. Valid values:  - `FLOW_CREATE`: Create an instance. - `FLOW_MODIFYCONNECTIONCONFIG`: Adjust the number of bandwidth connections. - `FLOW_MODIFYINSTANCEPASSWORDFREE`: Modify the process of password-free access. - `FLOW_CLEARNETWORK`: Returning VPC - `FLOW_SETPWD`: Set the access password. - `FLOW_EXPORSHR`: Expand or reduce the capacity. - `FLOW_UpgradeArch`: Upgrade the instance architecture. - `FLOW_MODIFYINSTANCEPARAMS`: Modify the instance parameters. - `FLOW_MODIFYINSTACEREADONLY`: Modify read-only process. - `FLOW_CLOSE`: Disable the instance. - `FLOW_DELETE`: Delete the instance. - `FLOW_OPEN_WAN`: Enable the public network. - `FLOW_FLOW_CLEAN`: Clear the instance. - `FLOW_MODIFYINSTANCEACCOUNT`: Modify the instance account. - `FLOW_ENABLEINSTANCE_REPLICATE`: Enable the replica read-only feature. - `FLOW_DISABLEINSTANCE_REPLICATE`: Disable the replica read-only feature. - `FLOW_SWITCHINSTANCEVIP`: Swap the VIPs of instances. - FLOW_CHANGE_REPLICA_TO_MSTER: Promote the replica node to the mater node. Backup instance 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return TaskType Task type. Valid values:  - `FLOW_CREATE`: Create an instance. - `FLOW_MODIFYCONNECTIONCONFIG`: Adjust the number of bandwidth connections. - `FLOW_MODIFYINSTANCEPASSWORDFREE`: Modify the process of password-free access. - `FLOW_CLEARNETWORK`: Returning VPC - `FLOW_SETPWD`: Set the access password. - `FLOW_EXPORSHR`: Expand or reduce the capacity. - `FLOW_UpgradeArch`: Upgrade the instance architecture. - `FLOW_MODIFYINSTANCEPARAMS`: Modify the instance parameters. - `FLOW_MODIFYINSTACEREADONLY`: Modify read-only process. - `FLOW_CLOSE`: Disable the instance. - `FLOW_DELETE`: Delete the instance. - `FLOW_OPEN_WAN`: Enable the public network. - `FLOW_FLOW_CLEAN`: Clear the instance. - `FLOW_MODIFYINSTANCEACCOUNT`: Modify the instance account. - `FLOW_ENABLEINSTANCE_REPLICATE`: Enable the replica read-only feature. - `FLOW_DISABLEINSTANCE_REPLICATE`: Disable the replica read-only feature. - `FLOW_SWITCHINSTANCEVIP`: Swap the VIPs of instances. - FLOW_CHANGE_REPLICA_TO_MSTER: Promote the replica node to the mater node. Backup instance 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type. Valid values:  - `FLOW_CREATE`: Create an instance. - `FLOW_MODIFYCONNECTIONCONFIG`: Adjust the number of bandwidth connections. - `FLOW_MODIFYINSTANCEPASSWORDFREE`: Modify the process of password-free access. - `FLOW_CLEARNETWORK`: Returning VPC - `FLOW_SETPWD`: Set the access password. - `FLOW_EXPORSHR`: Expand or reduce the capacity. - `FLOW_UpgradeArch`: Upgrade the instance architecture. - `FLOW_MODIFYINSTANCEPARAMS`: Modify the instance parameters. - `FLOW_MODIFYINSTACEREADONLY`: Modify read-only process. - `FLOW_CLOSE`: Disable the instance. - `FLOW_DELETE`: Delete the instance. - `FLOW_OPEN_WAN`: Enable the public network. - `FLOW_FLOW_CLEAN`: Clear the instance. - `FLOW_MODIFYINSTANCEACCOUNT`: Modify the instance account. - `FLOW_ENABLEINSTANCE_REPLICATE`: Enable the replica read-only feature. - `FLOW_DISABLEINSTANCE_REPLICATE`: Disable the replica read-only feature. - `FLOW_SWITCHINSTANCEVIP`: Swap the VIPs of instances. - FLOW_CHANGE_REPLICA_TO_MSTER: Promote the replica node to the mater node. Backup instance 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param TaskType Task type. Valid values:  - `FLOW_CREATE`: Create an instance. - `FLOW_MODIFYCONNECTIONCONFIG`: Adjust the number of bandwidth connections. - `FLOW_MODIFYINSTANCEPASSWORDFREE`: Modify the process of password-free access. - `FLOW_CLEARNETWORK`: Returning VPC - `FLOW_SETPWD`: Set the access password. - `FLOW_EXPORSHR`: Expand or reduce the capacity. - `FLOW_UpgradeArch`: Upgrade the instance architecture. - `FLOW_MODIFYINSTANCEPARAMS`: Modify the instance parameters. - `FLOW_MODIFYINSTACEREADONLY`: Modify read-only process. - `FLOW_CLOSE`: Disable the instance. - `FLOW_DELETE`: Delete the instance. - `FLOW_OPEN_WAN`: Enable the public network. - `FLOW_FLOW_CLEAN`: Clear the instance. - `FLOW_MODIFYINSTANCEACCOUNT`: Modify the instance account. - `FLOW_ENABLEINSTANCE_REPLICATE`: Enable the replica read-only feature. - `FLOW_DISABLEINSTANCE_REPLICATE`: Disable the replica read-only feature. - `FLOW_SWITCHINSTANCEVIP`: Swap the VIPs of instances. - FLOW_CHANGE_REPLICA_TO_MSTER: Promote the replica node to the mater node. Backup instance 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Instance name 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceName Instance name 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param InstanceName Instance name 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance ID 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Project ID 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Task progress 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return Progress Task progress 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set Task progress 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param Progress Task progress 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get Task end time 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime Task end time 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param EndTime Task end time 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Task execution status. Valid values: - `0` (initilized) - `1` (executing) - `2` (completed) - `4` (failed) 
Note:  This field may return null, indicating that no valid values can be obtained. 
     * @return Result Task execution status. Valid values: - `0` (initilized) - `1` (executing) - `2` (completed) - `4` (failed) 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set Task execution status. Valid values: - `0` (initilized) - `1` (executing) - `2` (completed) - `4` (failed) 
Note:  This field may return null, indicating that no valid values can be obtained.
     * @param Result Task execution status. Valid values: - `0` (initilized) - `1` (executing) - `2` (completed) - `4` (failed) 
Note:  This field may return null, indicating that no valid values can be obtained.
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    public TaskInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfoDetail(TaskInfoDetail source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

