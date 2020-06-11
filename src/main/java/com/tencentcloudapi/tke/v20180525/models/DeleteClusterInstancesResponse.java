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

public class DeleteClusterInstancesResponse extends AbstractModel{

    /**
    * IDs of deleted instances
    */
    @SerializedName("SuccInstanceIds")
    @Expose
    private String [] SuccInstanceIds;

    /**
    * IDs of instances failed to be deleted
    */
    @SerializedName("FailedInstanceIds")
    @Expose
    private String [] FailedInstanceIds;

    /**
    * IDs of instances that cannot be found
    */
    @SerializedName("NotFoundInstanceIds")
    @Expose
    private String [] NotFoundInstanceIds;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get IDs of deleted instances 
     * @return SuccInstanceIds IDs of deleted instances
     */
    public String [] getSuccInstanceIds() {
        return this.SuccInstanceIds;
    }

    /**
     * Set IDs of deleted instances
     * @param SuccInstanceIds IDs of deleted instances
     */
    public void setSuccInstanceIds(String [] SuccInstanceIds) {
        this.SuccInstanceIds = SuccInstanceIds;
    }

    /**
     * Get IDs of instances failed to be deleted 
     * @return FailedInstanceIds IDs of instances failed to be deleted
     */
    public String [] getFailedInstanceIds() {
        return this.FailedInstanceIds;
    }

    /**
     * Set IDs of instances failed to be deleted
     * @param FailedInstanceIds IDs of instances failed to be deleted
     */
    public void setFailedInstanceIds(String [] FailedInstanceIds) {
        this.FailedInstanceIds = FailedInstanceIds;
    }

    /**
     * Get IDs of instances that cannot be found 
     * @return NotFoundInstanceIds IDs of instances that cannot be found
     */
    public String [] getNotFoundInstanceIds() {
        return this.NotFoundInstanceIds;
    }

    /**
     * Set IDs of instances that cannot be found
     * @param NotFoundInstanceIds IDs of instances that cannot be found
     */
    public void setNotFoundInstanceIds(String [] NotFoundInstanceIds) {
        this.NotFoundInstanceIds = NotFoundInstanceIds;
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
        this.setParamArraySimple(map, prefix + "SuccInstanceIds.", this.SuccInstanceIds);
        this.setParamArraySimple(map, prefix + "FailedInstanceIds.", this.FailedInstanceIds);
        this.setParamArraySimple(map, prefix + "NotFoundInstanceIds.", this.NotFoundInstanceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

