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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRiskCenterScanTaskResponse extends AbstractModel {

    /**
    * Task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * `0`: Task created successfully. `-1`: There are unauthorized assets. 
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * List of unauthorized assets
    */
    @SerializedName("UnAuthAsset")
    @Expose
    private String [] UnAuthAsset;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Task ID. 
     * @return TaskId Task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID.
     * @param TaskId Task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get `0`: Task created successfully. `-1`: There are unauthorized assets.  
     * @return Status `0`: Task created successfully. `-1`: There are unauthorized assets. 
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set `0`: Task created successfully. `-1`: There are unauthorized assets. 
     * @param Status `0`: Task created successfully. `-1`: There are unauthorized assets. 
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get List of unauthorized assets 
     * @return UnAuthAsset List of unauthorized assets
     */
    public String [] getUnAuthAsset() {
        return this.UnAuthAsset;
    }

    /**
     * Set List of unauthorized assets
     * @param UnAuthAsset List of unauthorized assets
     */
    public void setUnAuthAsset(String [] UnAuthAsset) {
        this.UnAuthAsset = UnAuthAsset;
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

    public CreateRiskCenterScanTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRiskCenterScanTaskResponse(CreateRiskCenterScanTaskResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UnAuthAsset != null) {
            this.UnAuthAsset = new String[source.UnAuthAsset.length];
            for (int i = 0; i < source.UnAuthAsset.length; i++) {
                this.UnAuthAsset[i] = new String(source.UnAuthAsset[i]);
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
        this.setParamArraySimple(map, prefix + "UnAuthAsset.", this.UnAuthAsset);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

