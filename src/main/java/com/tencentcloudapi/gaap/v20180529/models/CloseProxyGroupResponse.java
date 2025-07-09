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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloseProxyGroupResponse extends AbstractModel {

    /**
    * List of IDs of the connection instances that are not running, which cannot be enabled.
    */
    @SerializedName("InvalidStatusInstanceSet")
    @Expose
    private String [] InvalidStatusInstanceSet;

    /**
    * List of IDs of the connection instances failed to be enabled.
    */
    @SerializedName("OperationFailedInstanceSet")
    @Expose
    private String [] OperationFailedInstanceSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of IDs of the connection instances that are not running, which cannot be enabled. 
     * @return InvalidStatusInstanceSet List of IDs of the connection instances that are not running, which cannot be enabled.
     */
    public String [] getInvalidStatusInstanceSet() {
        return this.InvalidStatusInstanceSet;
    }

    /**
     * Set List of IDs of the connection instances that are not running, which cannot be enabled.
     * @param InvalidStatusInstanceSet List of IDs of the connection instances that are not running, which cannot be enabled.
     */
    public void setInvalidStatusInstanceSet(String [] InvalidStatusInstanceSet) {
        this.InvalidStatusInstanceSet = InvalidStatusInstanceSet;
    }

    /**
     * Get List of IDs of the connection instances failed to be enabled. 
     * @return OperationFailedInstanceSet List of IDs of the connection instances failed to be enabled.
     */
    public String [] getOperationFailedInstanceSet() {
        return this.OperationFailedInstanceSet;
    }

    /**
     * Set List of IDs of the connection instances failed to be enabled.
     * @param OperationFailedInstanceSet List of IDs of the connection instances failed to be enabled.
     */
    public void setOperationFailedInstanceSet(String [] OperationFailedInstanceSet) {
        this.OperationFailedInstanceSet = OperationFailedInstanceSet;
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

    public CloseProxyGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloseProxyGroupResponse(CloseProxyGroupResponse source) {
        if (source.InvalidStatusInstanceSet != null) {
            this.InvalidStatusInstanceSet = new String[source.InvalidStatusInstanceSet.length];
            for (int i = 0; i < source.InvalidStatusInstanceSet.length; i++) {
                this.InvalidStatusInstanceSet[i] = new String(source.InvalidStatusInstanceSet[i]);
            }
        }
        if (source.OperationFailedInstanceSet != null) {
            this.OperationFailedInstanceSet = new String[source.OperationFailedInstanceSet.length];
            for (int i = 0; i < source.OperationFailedInstanceSet.length; i++) {
                this.OperationFailedInstanceSet[i] = new String(source.OperationFailedInstanceSet[i]);
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
        this.setParamArraySimple(map, prefix + "InvalidStatusInstanceSet.", this.InvalidStatusInstanceSet);
        this.setParamArraySimple(map, prefix + "OperationFailedInstanceSet.", this.OperationFailedInstanceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

