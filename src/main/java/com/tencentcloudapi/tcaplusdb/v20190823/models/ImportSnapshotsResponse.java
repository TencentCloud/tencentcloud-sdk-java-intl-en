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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportSnapshotsResponse extends AbstractModel {

    /**
    * `TaskId` is in the format of `AppInstanceId-taskId`, used to identify tasks of different clusters.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * `ApplicationId` is in the format of `AppInstanceId-applicationId`, which is used to identify applications of different clusters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get `TaskId` is in the format of `AppInstanceId-taskId`, used to identify tasks of different clusters.
Note: `null` may be returned for this field, indicating that no valid values can be obtained. 
     * @return TaskId `TaskId` is in the format of `AppInstanceId-taskId`, used to identify tasks of different clusters.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set `TaskId` is in the format of `AppInstanceId-taskId`, used to identify tasks of different clusters.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     * @param TaskId `TaskId` is in the format of `AppInstanceId-taskId`, used to identify tasks of different clusters.
Note: `null` may be returned for this field, indicating that no valid values can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get `ApplicationId` is in the format of `AppInstanceId-applicationId`, which is used to identify applications of different clusters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationId `ApplicationId` is in the format of `AppInstanceId-applicationId`, which is used to identify applications of different clusters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set `ApplicationId` is in the format of `AppInstanceId-applicationId`, which is used to identify applications of different clusters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationId `ApplicationId` is in the format of `AppInstanceId-applicationId`, which is used to identify applications of different clusters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
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

    public ImportSnapshotsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportSnapshotsResponse(ImportSnapshotsResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

