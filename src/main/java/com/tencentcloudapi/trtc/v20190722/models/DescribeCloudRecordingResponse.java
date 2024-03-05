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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudRecordingResponse extends AbstractModel {

    /**
    * The unique ID of the recording task.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The status of the on-cloud recording task.
Idle: The task is idle.
InProgress: The task is in progress.
Exited: The task is being ended.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The information of the recording files.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageFileList")
    @Expose
    private StorageFile [] StorageFileList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The unique ID of the recording task. 
     * @return TaskId The unique ID of the recording task.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The unique ID of the recording task.
     * @param TaskId The unique ID of the recording task.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The status of the on-cloud recording task.
Idle: The task is idle.
InProgress: The task is in progress.
Exited: The task is being ended. 
     * @return Status The status of the on-cloud recording task.
Idle: The task is idle.
InProgress: The task is in progress.
Exited: The task is being ended.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The status of the on-cloud recording task.
Idle: The task is idle.
InProgress: The task is in progress.
Exited: The task is being ended.
     * @param Status The status of the on-cloud recording task.
Idle: The task is idle.
InProgress: The task is in progress.
Exited: The task is being ended.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The information of the recording files.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return StorageFileList The information of the recording files.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public StorageFile [] getStorageFileList() {
        return this.StorageFileList;
    }

    /**
     * Set The information of the recording files.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param StorageFileList The information of the recording files.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStorageFileList(StorageFile [] StorageFileList) {
        this.StorageFileList = StorageFileList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCloudRecordingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudRecordingResponse(DescribeCloudRecordingResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StorageFileList != null) {
            this.StorageFileList = new StorageFile[source.StorageFileList.length];
            for (int i = 0; i < source.StorageFileList.length; i++) {
                this.StorageFileList[i] = new StorageFile(source.StorageFileList[i]);
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
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "StorageFileList.", this.StorageFileList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

