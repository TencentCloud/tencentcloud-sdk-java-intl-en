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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpsAsyncJobDetail extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Operation ID
    */
    @SerializedName("AsyncId")
    @Expose
    private String AsyncId;

    /**
    * Asynchronous operation type.
    */
    @SerializedName("AsyncType")
    @Expose
    private String AsyncType;

    /**
    * Asynchronous operation status: initial status: INIT; Running: RUNNING; Success: SUCCESS; failure: FAIL; partially successful: PART_SUCCESS.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error message.


    */
    @SerializedName("ErrorDesc")
    @Expose
    private String ErrorDesc;

    /**
    * Total sub-processes.
    */
    @SerializedName("TotalSubProcessCount")
    @Expose
    private Long TotalSubProcessCount;

    /**
    * Number of completed sub-processes.

    */
    @SerializedName("FinishedSubProcessCount")
    @Expose
    private Long FinishedSubProcessCount;

    /**
    * Count of successful sub-processes.

    */
    @SerializedName("SuccessSubProcessCount")
    @Expose
    private Long SuccessSubProcessCount;

    /**
    * Operator id.
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Operation ID 
     * @return AsyncId Operation ID
     */
    public String getAsyncId() {
        return this.AsyncId;
    }

    /**
     * Set Operation ID
     * @param AsyncId Operation ID
     */
    public void setAsyncId(String AsyncId) {
        this.AsyncId = AsyncId;
    }

    /**
     * Get Asynchronous operation type. 
     * @return AsyncType Asynchronous operation type.
     */
    public String getAsyncType() {
        return this.AsyncType;
    }

    /**
     * Set Asynchronous operation type.
     * @param AsyncType Asynchronous operation type.
     */
    public void setAsyncType(String AsyncType) {
        this.AsyncType = AsyncType;
    }

    /**
     * Get Asynchronous operation status: initial status: INIT; Running: RUNNING; Success: SUCCESS; failure: FAIL; partially successful: PART_SUCCESS. 
     * @return Status Asynchronous operation status: initial status: INIT; Running: RUNNING; Success: SUCCESS; failure: FAIL; partially successful: PART_SUCCESS.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Asynchronous operation status: initial status: INIT; Running: RUNNING; Success: SUCCESS; failure: FAIL; partially successful: PART_SUCCESS.
     * @param Status Asynchronous operation status: initial status: INIT; Running: RUNNING; Success: SUCCESS; failure: FAIL; partially successful: PART_SUCCESS.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error message.

 
     * @return ErrorDesc Error message.


     */
    public String getErrorDesc() {
        return this.ErrorDesc;
    }

    /**
     * Set Error message.


     * @param ErrorDesc Error message.


     */
    public void setErrorDesc(String ErrorDesc) {
        this.ErrorDesc = ErrorDesc;
    }

    /**
     * Get Total sub-processes. 
     * @return TotalSubProcessCount Total sub-processes.
     */
    public Long getTotalSubProcessCount() {
        return this.TotalSubProcessCount;
    }

    /**
     * Set Total sub-processes.
     * @param TotalSubProcessCount Total sub-processes.
     */
    public void setTotalSubProcessCount(Long TotalSubProcessCount) {
        this.TotalSubProcessCount = TotalSubProcessCount;
    }

    /**
     * Get Number of completed sub-processes.
 
     * @return FinishedSubProcessCount Number of completed sub-processes.

     */
    public Long getFinishedSubProcessCount() {
        return this.FinishedSubProcessCount;
    }

    /**
     * Set Number of completed sub-processes.

     * @param FinishedSubProcessCount Number of completed sub-processes.

     */
    public void setFinishedSubProcessCount(Long FinishedSubProcessCount) {
        this.FinishedSubProcessCount = FinishedSubProcessCount;
    }

    /**
     * Get Count of successful sub-processes.
 
     * @return SuccessSubProcessCount Count of successful sub-processes.

     */
    public Long getSuccessSubProcessCount() {
        return this.SuccessSubProcessCount;
    }

    /**
     * Set Count of successful sub-processes.

     * @param SuccessSubProcessCount Count of successful sub-processes.

     */
    public void setSuccessSubProcessCount(Long SuccessSubProcessCount) {
        this.SuccessSubProcessCount = SuccessSubProcessCount;
    }

    /**
     * Get Operator id. 
     * @return CreateUserUin Operator id.
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set Operator id.
     * @param CreateUserUin Operator id.
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time. 
     * @return UpdateTime Update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.
     * @param UpdateTime Update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public OpsAsyncJobDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpsAsyncJobDetail(OpsAsyncJobDetail source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AsyncId != null) {
            this.AsyncId = new String(source.AsyncId);
        }
        if (source.AsyncType != null) {
            this.AsyncType = new String(source.AsyncType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorDesc != null) {
            this.ErrorDesc = new String(source.ErrorDesc);
        }
        if (source.TotalSubProcessCount != null) {
            this.TotalSubProcessCount = new Long(source.TotalSubProcessCount);
        }
        if (source.FinishedSubProcessCount != null) {
            this.FinishedSubProcessCount = new Long(source.FinishedSubProcessCount);
        }
        if (source.SuccessSubProcessCount != null) {
            this.SuccessSubProcessCount = new Long(source.SuccessSubProcessCount);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AsyncId", this.AsyncId);
        this.setParamSimple(map, prefix + "AsyncType", this.AsyncType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorDesc", this.ErrorDesc);
        this.setParamSimple(map, prefix + "TotalSubProcessCount", this.TotalSubProcessCount);
        this.setParamSimple(map, prefix + "FinishedSubProcessCount", this.FinishedSubProcessCount);
        this.setParamSimple(map, prefix + "SuccessSubProcessCount", this.SuccessSubProcessCount);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

