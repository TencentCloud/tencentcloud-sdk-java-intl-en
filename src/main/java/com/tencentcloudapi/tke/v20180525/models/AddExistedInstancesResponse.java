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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddExistedInstancesResponse extends AbstractModel{

    /**
    * IDs of failed nodes
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("FailedInstanceIds")
    @Expose
    private String [] FailedInstanceIds;

    /**
    * IDs of successful nodes
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("SuccInstanceIds")
    @Expose
    private String [] SuccInstanceIds;

    /**
    * IDs of (successful or failed) nodes that timed out
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("TimeoutInstanceIds")
    @Expose
    private String [] TimeoutInstanceIds;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get IDs of failed nodes
Note: This field may return null, indicating that no valid value was found. 
     * @return FailedInstanceIds IDs of failed nodes
Note: This field may return null, indicating that no valid value was found.
     */
    public String [] getFailedInstanceIds() {
        return this.FailedInstanceIds;
    }

    /**
     * Set IDs of failed nodes
Note: This field may return null, indicating that no valid value was found.
     * @param FailedInstanceIds IDs of failed nodes
Note: This field may return null, indicating that no valid value was found.
     */
    public void setFailedInstanceIds(String [] FailedInstanceIds) {
        this.FailedInstanceIds = FailedInstanceIds;
    }

    /**
     * Get IDs of successful nodes
Note: This field may return null, indicating that no valid value was found. 
     * @return SuccInstanceIds IDs of successful nodes
Note: This field may return null, indicating that no valid value was found.
     */
    public String [] getSuccInstanceIds() {
        return this.SuccInstanceIds;
    }

    /**
     * Set IDs of successful nodes
Note: This field may return null, indicating that no valid value was found.
     * @param SuccInstanceIds IDs of successful nodes
Note: This field may return null, indicating that no valid value was found.
     */
    public void setSuccInstanceIds(String [] SuccInstanceIds) {
        this.SuccInstanceIds = SuccInstanceIds;
    }

    /**
     * Get IDs of (successful or failed) nodes that timed out
Note: This field may return null, indicating that no valid value was found. 
     * @return TimeoutInstanceIds IDs of (successful or failed) nodes that timed out
Note: This field may return null, indicating that no valid value was found.
     */
    public String [] getTimeoutInstanceIds() {
        return this.TimeoutInstanceIds;
    }

    /**
     * Set IDs of (successful or failed) nodes that timed out
Note: This field may return null, indicating that no valid value was found.
     * @param TimeoutInstanceIds IDs of (successful or failed) nodes that timed out
Note: This field may return null, indicating that no valid value was found.
     */
    public void setTimeoutInstanceIds(String [] TimeoutInstanceIds) {
        this.TimeoutInstanceIds = TimeoutInstanceIds;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FailedInstanceIds.", this.FailedInstanceIds);
        this.setParamArraySimple(map, prefix + "SuccInstanceIds.", this.SuccInstanceIds);
        this.setParamArraySimple(map, prefix + "TimeoutInstanceIds.", this.TimeoutInstanceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

