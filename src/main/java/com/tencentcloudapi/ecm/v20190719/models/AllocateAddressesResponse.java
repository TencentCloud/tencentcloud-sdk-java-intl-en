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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocateAddressesResponse extends AbstractModel {

    /**
    * List of unique IDs of the EIPs applied for.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddressSet")
    @Expose
    private String [] AddressSet;

    /**
    * Async task ID (TaskId). You can use the `DescribeTaskResult` API to query the task status.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of unique IDs of the EIPs applied for.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AddressSet List of unique IDs of the EIPs applied for.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAddressSet() {
        return this.AddressSet;
    }

    /**
     * Set List of unique IDs of the EIPs applied for.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AddressSet List of unique IDs of the EIPs applied for.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAddressSet(String [] AddressSet) {
        this.AddressSet = AddressSet;
    }

    /**
     * Get Async task ID (TaskId). You can use the `DescribeTaskResult` API to query the task status. 
     * @return TaskId Async task ID (TaskId). You can use the `DescribeTaskResult` API to query the task status.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Async task ID (TaskId). You can use the `DescribeTaskResult` API to query the task status.
     * @param TaskId Async task ID (TaskId). You can use the `DescribeTaskResult` API to query the task status.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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

    public AllocateAddressesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocateAddressesResponse(AllocateAddressesResponse source) {
        if (source.AddressSet != null) {
            this.AddressSet = new String[source.AddressSet.length];
            for (int i = 0; i < source.AddressSet.length; i++) {
                this.AddressSet[i] = new String(source.AddressSet[i]);
            }
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressSet.", this.AddressSet);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

