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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddExistedInstancesResponse extends AbstractModel {

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
    * Causes of the failure to add a node to a cluster
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("FailedReasons")
    @Expose
    private String [] FailedReasons;

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
     * Get Causes of the failure to add a node to a cluster
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return FailedReasons Causes of the failure to add a node to a cluster
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String [] getFailedReasons() {
        return this.FailedReasons;
    }

    /**
     * Set Causes of the failure to add a node to a cluster
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param FailedReasons Causes of the failure to add a node to a cluster
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setFailedReasons(String [] FailedReasons) {
        this.FailedReasons = FailedReasons;
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

    public AddExistedInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddExistedInstancesResponse(AddExistedInstancesResponse source) {
        if (source.FailedInstanceIds != null) {
            this.FailedInstanceIds = new String[source.FailedInstanceIds.length];
            for (int i = 0; i < source.FailedInstanceIds.length; i++) {
                this.FailedInstanceIds[i] = new String(source.FailedInstanceIds[i]);
            }
        }
        if (source.SuccInstanceIds != null) {
            this.SuccInstanceIds = new String[source.SuccInstanceIds.length];
            for (int i = 0; i < source.SuccInstanceIds.length; i++) {
                this.SuccInstanceIds[i] = new String(source.SuccInstanceIds[i]);
            }
        }
        if (source.TimeoutInstanceIds != null) {
            this.TimeoutInstanceIds = new String[source.TimeoutInstanceIds.length];
            for (int i = 0; i < source.TimeoutInstanceIds.length; i++) {
                this.TimeoutInstanceIds[i] = new String(source.TimeoutInstanceIds[i]);
            }
        }
        if (source.FailedReasons != null) {
            this.FailedReasons = new String[source.FailedReasons.length];
            for (int i = 0; i < source.FailedReasons.length; i++) {
                this.FailedReasons[i] = new String(source.FailedReasons[i]);
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
        this.setParamArraySimple(map, prefix + "FailedInstanceIds.", this.FailedInstanceIds);
        this.setParamArraySimple(map, prefix + "SuccInstanceIds.", this.SuccInstanceIds);
        this.setParamArraySimple(map, prefix + "TimeoutInstanceIds.", this.TimeoutInstanceIds);
        this.setParamArraySimple(map, prefix + "FailedReasons.", this.FailedReasons);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

