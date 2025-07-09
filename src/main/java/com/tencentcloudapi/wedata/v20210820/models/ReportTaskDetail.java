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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportTaskDetail extends AbstractModel {

    /**
    * Engine task id.
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
    * Task type id.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * Business information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BusinessInfo")
    @Expose
    private String BusinessInfo;

    /**
    * Engine task information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EngineTaskInfo")
    @Expose
    private EngineTaskInfo EngineTaskInfo;

    /**
     * Get Engine task id.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineTaskId Engine task id.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEngineTaskId() {
        return this.EngineTaskId;
    }

    /**
     * Set Engine task id.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineTaskId Engine task id.
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
     * Get Business information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BusinessInfo Business information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBusinessInfo() {
        return this.BusinessInfo;
    }

    /**
     * Set Business information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BusinessInfo Business information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBusinessInfo(String BusinessInfo) {
        this.BusinessInfo = BusinessInfo;
    }

    /**
     * Get Engine task information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EngineTaskInfo Engine task information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public EngineTaskInfo getEngineTaskInfo() {
        return this.EngineTaskInfo;
    }

    /**
     * Set Engine task information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EngineTaskInfo Engine task information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEngineTaskInfo(EngineTaskInfo EngineTaskInfo) {
        this.EngineTaskInfo = EngineTaskInfo;
    }

    public ReportTaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportTaskDetail(ReportTaskDetail source) {
        if (source.EngineTaskId != null) {
            this.EngineTaskId = new String(source.EngineTaskId);
        }
        if (source.EngineExeStatus != null) {
            this.EngineExeStatus = new String(source.EngineExeStatus);
        }
        if (source.EngineExeStartTime != null) {
            this.EngineExeStartTime = new String(source.EngineExeStartTime);
        }
        if (source.EngineExeEndTime != null) {
            this.EngineExeEndTime = new String(source.EngineExeEndTime);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.BusinessInfo != null) {
            this.BusinessInfo = new String(source.BusinessInfo);
        }
        if (source.EngineTaskInfo != null) {
            this.EngineTaskInfo = new EngineTaskInfo(source.EngineTaskInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineTaskId", this.EngineTaskId);
        this.setParamSimple(map, prefix + "EngineExeStatus", this.EngineExeStatus);
        this.setParamSimple(map, prefix + "EngineExeStartTime", this.EngineExeStartTime);
        this.setParamSimple(map, prefix + "EngineExeEndTime", this.EngineExeEndTime);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "BusinessInfo", this.BusinessInfo);
        this.setParamObj(map, prefix + "EngineTaskInfo.", this.EngineTaskInfo);

    }
}

