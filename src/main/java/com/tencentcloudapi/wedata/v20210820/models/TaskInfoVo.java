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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfoVo extends AbstractModel {

    /**
    * Tenant id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * Project ID.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Task ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Task type id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * Main account id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OnwerUid")
    @Expose
    private String OnwerUid;

    /**
    * Person in charge.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InChargeId")
    @Expose
    private String InChargeId;

    /**
    * Instance ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * jobId
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Engine type, DLC, EMR.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * Engine name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * Engine sub-type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineSubType")
    @Expose
    private String EngineSubType;

    /**
    * Engine taskId.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineTaskId")
    @Expose
    private String EngineTaskId;

    /**
    * Engine execution status, enumerate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineExeStatus")
    @Expose
    private String EngineExeStatus;

    /**
    * Engine execution user.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineExeUser")
    @Expose
    private String EngineExeUser;

    /**
    * Engine execution start time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineExeStartTime")
    @Expose
    private String EngineExeStartTime;

    /**
    * Engine execution end time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineExeEndTime")
    @Expose
    private String EngineExeEndTime;

    /**
    * DATA source, such as DATA_INTEGRATION, DATA_EXPLORATION, DATA_QUALITY, OM_CENTER.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductSource")
    @Expose
    private String ProductSource;

    /**
     * Get Tenant id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppID Tenant id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set Tenant id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppID Tenant id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get Project ID.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Task ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskId Task ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskId Task ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskName Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskName Task name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Task type id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskTypeId Task type id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set Task type id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskTypeId Task type id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get Main account id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OnwerUid Main account id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOnwerUid() {
        return this.OnwerUid;
    }

    /**
     * Set Main account id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OnwerUid Main account id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOnwerUid(String OnwerUid) {
        this.OnwerUid = OnwerUid;
    }

    /**
     * Get Person in charge.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InChargeId Person in charge.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInChargeId() {
        return this.InChargeId;
    }

    /**
     * Set Person in charge.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InChargeId Person in charge.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInChargeId(String InChargeId) {
        this.InChargeId = InChargeId;
    }

    /**
     * Get Instance ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get jobId
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobId jobId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set jobId
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobId jobId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Engine type, DLC, EMR.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineType Engine type, DLC, EMR.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Engine type, DLC, EMR.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineType Engine type, DLC, EMR.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get Engine name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineName Engine name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set Engine name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineName Engine name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get Engine sub-type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineSubType Engine sub-type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineSubType() {
        return this.EngineSubType;
    }

    /**
     * Set Engine sub-type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineSubType Engine sub-type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineSubType(String EngineSubType) {
        this.EngineSubType = EngineSubType;
    }

    /**
     * Get Engine taskId.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineTaskId Engine taskId.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineTaskId() {
        return this.EngineTaskId;
    }

    /**
     * Set Engine taskId.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineTaskId Engine taskId.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineTaskId(String EngineTaskId) {
        this.EngineTaskId = EngineTaskId;
    }

    /**
     * Get Engine execution status, enumerate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineExeStatus Engine execution status, enumerate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineExeStatus() {
        return this.EngineExeStatus;
    }

    /**
     * Set Engine execution status, enumerate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineExeStatus Engine execution status, enumerate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineExeStatus(String EngineExeStatus) {
        this.EngineExeStatus = EngineExeStatus;
    }

    /**
     * Get Engine execution user.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineExeUser Engine execution user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineExeUser() {
        return this.EngineExeUser;
    }

    /**
     * Set Engine execution user.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineExeUser Engine execution user.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineExeUser(String EngineExeUser) {
        this.EngineExeUser = EngineExeUser;
    }

    /**
     * Get Engine execution start time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineExeStartTime Engine execution start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineExeStartTime() {
        return this.EngineExeStartTime;
    }

    /**
     * Set Engine execution start time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineExeStartTime Engine execution start time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineExeStartTime(String EngineExeStartTime) {
        this.EngineExeStartTime = EngineExeStartTime;
    }

    /**
     * Get Engine execution end time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineExeEndTime Engine execution end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineExeEndTime() {
        return this.EngineExeEndTime;
    }

    /**
     * Set Engine execution end time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineExeEndTime Engine execution end time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineExeEndTime(String EngineExeEndTime) {
        this.EngineExeEndTime = EngineExeEndTime;
    }

    /**
     * Get DATA source, such as DATA_INTEGRATION, DATA_EXPLORATION, DATA_QUALITY, OM_CENTER.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProductSource DATA source, such as DATA_INTEGRATION, DATA_EXPLORATION, DATA_QUALITY, OM_CENTER.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProductSource() {
        return this.ProductSource;
    }

    /**
     * Set DATA source, such as DATA_INTEGRATION, DATA_EXPLORATION, DATA_QUALITY, OM_CENTER.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProductSource DATA source, such as DATA_INTEGRATION, DATA_EXPLORATION, DATA_QUALITY, OM_CENTER.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProductSource(String ProductSource) {
        this.ProductSource = ProductSource;
    }

    public TaskInfoVo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfoVo(TaskInfoVo source) {
        if (source.AppID != null) {
            this.AppID = new String(source.AppID);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.OnwerUid != null) {
            this.OnwerUid = new String(source.OnwerUid);
        }
        if (source.InChargeId != null) {
            this.InChargeId = new String(source.InChargeId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.EngineSubType != null) {
            this.EngineSubType = new String(source.EngineSubType);
        }
        if (source.EngineTaskId != null) {
            this.EngineTaskId = new String(source.EngineTaskId);
        }
        if (source.EngineExeStatus != null) {
            this.EngineExeStatus = new String(source.EngineExeStatus);
        }
        if (source.EngineExeUser != null) {
            this.EngineExeUser = new String(source.EngineExeUser);
        }
        if (source.EngineExeStartTime != null) {
            this.EngineExeStartTime = new String(source.EngineExeStartTime);
        }
        if (source.EngineExeEndTime != null) {
            this.EngineExeEndTime = new String(source.EngineExeEndTime);
        }
        if (source.ProductSource != null) {
            this.ProductSource = new String(source.ProductSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "OnwerUid", this.OnwerUid);
        this.setParamSimple(map, prefix + "InChargeId", this.InChargeId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamSimple(map, prefix + "EngineSubType", this.EngineSubType);
        this.setParamSimple(map, prefix + "EngineTaskId", this.EngineTaskId);
        this.setParamSimple(map, prefix + "EngineExeStatus", this.EngineExeStatus);
        this.setParamSimple(map, prefix + "EngineExeUser", this.EngineExeUser);
        this.setParamSimple(map, prefix + "EngineExeStartTime", this.EngineExeStartTime);
        this.setParamSimple(map, prefix + "EngineExeEndTime", this.EngineExeEndTime);
        this.setParamSimple(map, prefix + "ProductSource", this.ProductSource);

    }
}

