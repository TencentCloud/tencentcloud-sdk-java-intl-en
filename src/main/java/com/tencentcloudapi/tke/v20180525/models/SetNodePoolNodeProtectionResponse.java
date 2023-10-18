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

public class SetNodePoolNodeProtectionResponse extends AbstractModel {

    /**
    * ID of the node that has successfully set the removal protection
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SucceedInstanceIds")
    @Expose
    private String [] SucceedInstanceIds;

    /**
    * ID of the node that fails to set the removal protection
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("FailedInstanceIds")
    @Expose
    private String [] FailedInstanceIds;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ID of the node that has successfully set the removal protection
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SucceedInstanceIds ID of the node that has successfully set the removal protection
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getSucceedInstanceIds() {
        return this.SucceedInstanceIds;
    }

    /**
     * Set ID of the node that has successfully set the removal protection
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SucceedInstanceIds ID of the node that has successfully set the removal protection
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSucceedInstanceIds(String [] SucceedInstanceIds) {
        this.SucceedInstanceIds = SucceedInstanceIds;
    }

    /**
     * Get ID of the node that fails to set the removal protection
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return FailedInstanceIds ID of the node that fails to set the removal protection
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getFailedInstanceIds() {
        return this.FailedInstanceIds;
    }

    /**
     * Set ID of the node that fails to set the removal protection
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param FailedInstanceIds ID of the node that fails to set the removal protection
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFailedInstanceIds(String [] FailedInstanceIds) {
        this.FailedInstanceIds = FailedInstanceIds;
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

    public SetNodePoolNodeProtectionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetNodePoolNodeProtectionResponse(SetNodePoolNodeProtectionResponse source) {
        if (source.SucceedInstanceIds != null) {
            this.SucceedInstanceIds = new String[source.SucceedInstanceIds.length];
            for (int i = 0; i < source.SucceedInstanceIds.length; i++) {
                this.SucceedInstanceIds[i] = new String(source.SucceedInstanceIds[i]);
            }
        }
        if (source.FailedInstanceIds != null) {
            this.FailedInstanceIds = new String[source.FailedInstanceIds.length];
            for (int i = 0; i < source.FailedInstanceIds.length; i++) {
                this.FailedInstanceIds[i] = new String(source.FailedInstanceIds[i]);
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
        this.setParamArraySimple(map, prefix + "SucceedInstanceIds.", this.SucceedInstanceIds);
        this.setParamArraySimple(map, prefix + "FailedInstanceIds.", this.FailedInstanceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

