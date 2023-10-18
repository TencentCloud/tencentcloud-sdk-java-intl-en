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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IsolateDBInstanceResponse extends AbstractModel {

    /**
    * IDs of isolated instances
    */
    @SerializedName("SuccessInstanceIds")
    @Expose
    private String [] SuccessInstanceIds;

    /**
    * IDs of instances failed to be isolated
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
     * Get IDs of isolated instances 
     * @return SuccessInstanceIds IDs of isolated instances
     */
    public String [] getSuccessInstanceIds() {
        return this.SuccessInstanceIds;
    }

    /**
     * Set IDs of isolated instances
     * @param SuccessInstanceIds IDs of isolated instances
     */
    public void setSuccessInstanceIds(String [] SuccessInstanceIds) {
        this.SuccessInstanceIds = SuccessInstanceIds;
    }

    /**
     * Get IDs of instances failed to be isolated 
     * @return FailedInstanceIds IDs of instances failed to be isolated
     */
    public String [] getFailedInstanceIds() {
        return this.FailedInstanceIds;
    }

    /**
     * Set IDs of instances failed to be isolated
     * @param FailedInstanceIds IDs of instances failed to be isolated
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

    public IsolateDBInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IsolateDBInstanceResponse(IsolateDBInstanceResponse source) {
        if (source.SuccessInstanceIds != null) {
            this.SuccessInstanceIds = new String[source.SuccessInstanceIds.length];
            for (int i = 0; i < source.SuccessInstanceIds.length; i++) {
                this.SuccessInstanceIds[i] = new String(source.SuccessInstanceIds[i]);
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
        this.setParamArraySimple(map, prefix + "SuccessInstanceIds.", this.SuccessInstanceIds);
        this.setParamArraySimple(map, prefix + "FailedInstanceIds.", this.FailedInstanceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

