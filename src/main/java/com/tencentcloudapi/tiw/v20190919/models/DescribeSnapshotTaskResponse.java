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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotTaskResponse extends AbstractModel{

    /**
    * Task ID.
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * Task status.
Running: The task is running.
Finished: The task is finished.
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Creation time of the task. Unit: seconds.
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Completion time of the task. Unit: seconds.
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FinishTime")
    @Expose
    private Long FinishTime;

    /**
    * Task result information.
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Result")
    @Expose
    private SnapshotResult Result;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Task ID.
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return TaskID Task ID.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set Task ID.
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param TaskID Task ID.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get Task status.
Running: The task is running.
Finished: The task is finished.
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return Status Task status.
Running: The task is running.
Finished: The task is finished.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status.
Running: The task is running.
Finished: The task is finished.
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param Status Task status.
Running: The task is running.
Finished: The task is finished.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time of the task. Unit: seconds.
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time of the task. Unit: seconds.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the task. Unit: seconds.
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time of the task. Unit: seconds.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Completion time of the task. Unit: seconds.
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return FinishTime Completion time of the task. Unit: seconds.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public Long getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Completion time of the task. Unit: seconds.
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param FinishTime Completion time of the task. Unit: seconds.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setFinishTime(Long FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get Task result information.
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return Result Task result information.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public SnapshotResult getResult() {
        return this.Result;
    }

    /**
     * Set Task result information.
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param Result Task result information.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setResult(SnapshotResult Result) {
        this.Result = Result;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSnapshotTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotTaskResponse(DescribeSnapshotTaskResponse source) {
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new Long(source.FinishTime);
        }
        if (source.Result != null) {
            this.Result = new SnapshotResult(source.Result);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

