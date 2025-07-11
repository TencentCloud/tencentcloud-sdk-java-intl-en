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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadUpdateCertificateInstanceResponse extends AbstractModel {

    /**
    * The tencent cloud resource update task ID. DeployRecordId equals 0 indicates the task is in progress. Repeatedly request this API, and when DeployRecordId is greater than 0, it means the task has been successfully created. If not successfully created, an exception will be thrown.
    */
    @SerializedName("DeployRecordId")
    @Expose
    private Long DeployRecordId;

    /**
    * Update task creation status: 1 indicates successful creation; 0 indicates an existing ongoing update task, and no new update task was created. The return value DeployRecordId represents the ID of the ongoing update task.
    */
    @SerializedName("DeployStatus")
    @Expose
    private Long DeployStatus;

    /**
    * Create progress details for asynchronous update tasks.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateSyncProgress")
    @Expose
    private UpdateSyncProgress [] UpdateSyncProgress;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The tencent cloud resource update task ID. DeployRecordId equals 0 indicates the task is in progress. Repeatedly request this API, and when DeployRecordId is greater than 0, it means the task has been successfully created. If not successfully created, an exception will be thrown. 
     * @return DeployRecordId The tencent cloud resource update task ID. DeployRecordId equals 0 indicates the task is in progress. Repeatedly request this API, and when DeployRecordId is greater than 0, it means the task has been successfully created. If not successfully created, an exception will be thrown.
     */
    public Long getDeployRecordId() {
        return this.DeployRecordId;
    }

    /**
     * Set The tencent cloud resource update task ID. DeployRecordId equals 0 indicates the task is in progress. Repeatedly request this API, and when DeployRecordId is greater than 0, it means the task has been successfully created. If not successfully created, an exception will be thrown.
     * @param DeployRecordId The tencent cloud resource update task ID. DeployRecordId equals 0 indicates the task is in progress. Repeatedly request this API, and when DeployRecordId is greater than 0, it means the task has been successfully created. If not successfully created, an exception will be thrown.
     */
    public void setDeployRecordId(Long DeployRecordId) {
        this.DeployRecordId = DeployRecordId;
    }

    /**
     * Get Update task creation status: 1 indicates successful creation; 0 indicates an existing ongoing update task, and no new update task was created. The return value DeployRecordId represents the ID of the ongoing update task. 
     * @return DeployStatus Update task creation status: 1 indicates successful creation; 0 indicates an existing ongoing update task, and no new update task was created. The return value DeployRecordId represents the ID of the ongoing update task.
     */
    public Long getDeployStatus() {
        return this.DeployStatus;
    }

    /**
     * Set Update task creation status: 1 indicates successful creation; 0 indicates an existing ongoing update task, and no new update task was created. The return value DeployRecordId represents the ID of the ongoing update task.
     * @param DeployStatus Update task creation status: 1 indicates successful creation; 0 indicates an existing ongoing update task, and no new update task was created. The return value DeployRecordId represents the ID of the ongoing update task.
     */
    public void setDeployStatus(Long DeployStatus) {
        this.DeployStatus = DeployStatus;
    }

    /**
     * Get Create progress details for asynchronous update tasks.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateSyncProgress Create progress details for asynchronous update tasks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UpdateSyncProgress [] getUpdateSyncProgress() {
        return this.UpdateSyncProgress;
    }

    /**
     * Set Create progress details for asynchronous update tasks.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateSyncProgress Create progress details for asynchronous update tasks.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateSyncProgress(UpdateSyncProgress [] UpdateSyncProgress) {
        this.UpdateSyncProgress = UpdateSyncProgress;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public UploadUpdateCertificateInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadUpdateCertificateInstanceResponse(UploadUpdateCertificateInstanceResponse source) {
        if (source.DeployRecordId != null) {
            this.DeployRecordId = new Long(source.DeployRecordId);
        }
        if (source.DeployStatus != null) {
            this.DeployStatus = new Long(source.DeployStatus);
        }
        if (source.UpdateSyncProgress != null) {
            this.UpdateSyncProgress = new UpdateSyncProgress[source.UpdateSyncProgress.length];
            for (int i = 0; i < source.UpdateSyncProgress.length; i++) {
                this.UpdateSyncProgress[i] = new UpdateSyncProgress(source.UpdateSyncProgress[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployRecordId", this.DeployRecordId);
        this.setParamSimple(map, prefix + "DeployStatus", this.DeployStatus);
        this.setParamArrayObj(map, prefix + "UpdateSyncProgress.", this.UpdateSyncProgress);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

