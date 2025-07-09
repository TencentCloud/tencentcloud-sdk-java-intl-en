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

public class SyncTaskBindResourceResult extends AbstractModel {

    /**
    * The task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The associated cloud resources.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindResourceResult")
    @Expose
    private BindResourceResult [] BindResourceResult;

    /**
    * The status of the async task. Valid values: `0` for querying, `1` for successful, and `2` for abnormal. If the status is `1`, the result of `BindResourceResult` will be displayed; if the status is `2`, the error causes will be displayed.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The error occurred when querying the associated cloud resources.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Error")
    @Expose
    private Error Error;

    /**
    * The cache time of the current result.
    */
    @SerializedName("CacheTime")
    @Expose
    private String CacheTime;

    /**
     * Get The task ID. 
     * @return TaskId The task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set The task ID.
     * @param TaskId The task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get The associated cloud resources.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BindResourceResult The associated cloud resources.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BindResourceResult [] getBindResourceResult() {
        return this.BindResourceResult;
    }

    /**
     * Set The associated cloud resources.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BindResourceResult The associated cloud resources.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBindResourceResult(BindResourceResult [] BindResourceResult) {
        this.BindResourceResult = BindResourceResult;
    }

    /**
     * Get The status of the async task. Valid values: `0` for querying, `1` for successful, and `2` for abnormal. If the status is `1`, the result of `BindResourceResult` will be displayed; if the status is `2`, the error causes will be displayed. 
     * @return Status The status of the async task. Valid values: `0` for querying, `1` for successful, and `2` for abnormal. If the status is `1`, the result of `BindResourceResult` will be displayed; if the status is `2`, the error causes will be displayed.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set The status of the async task. Valid values: `0` for querying, `1` for successful, and `2` for abnormal. If the status is `1`, the result of `BindResourceResult` will be displayed; if the status is `2`, the error causes will be displayed.
     * @param Status The status of the async task. Valid values: `0` for querying, `1` for successful, and `2` for abnormal. If the status is `1`, the result of `BindResourceResult` will be displayed; if the status is `2`, the error causes will be displayed.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The error occurred when querying the associated cloud resources.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Error The error occurred when querying the associated cloud resources.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Error getError() {
        return this.Error;
    }

    /**
     * Set The error occurred when querying the associated cloud resources.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Error The error occurred when querying the associated cloud resources.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setError(Error Error) {
        this.Error = Error;
    }

    /**
     * Get The cache time of the current result. 
     * @return CacheTime The cache time of the current result.
     */
    public String getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set The cache time of the current result.
     * @param CacheTime The cache time of the current result.
     */
    public void setCacheTime(String CacheTime) {
        this.CacheTime = CacheTime;
    }

    public SyncTaskBindResourceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncTaskBindResourceResult(SyncTaskBindResourceResult source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.BindResourceResult != null) {
            this.BindResourceResult = new BindResourceResult[source.BindResourceResult.length];
            for (int i = 0; i < source.BindResourceResult.length; i++) {
                this.BindResourceResult[i] = new BindResourceResult(source.BindResourceResult[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Error != null) {
            this.Error = new Error(source.Error);
        }
        if (source.CacheTime != null) {
            this.CacheTime = new String(source.CacheTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "BindResourceResult.", this.BindResourceResult);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Error.", this.Error);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);

    }
}

