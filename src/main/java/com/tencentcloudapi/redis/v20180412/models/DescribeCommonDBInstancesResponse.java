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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCommonDBInstancesResponse extends AbstractModel {

    /**
    * Number of instances
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Instance information
    */
    @SerializedName("InstanceDetails")
    @Expose
    private RedisCommonInstanceList [] InstanceDetails;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of instances 
     * @return TotalCount Number of instances
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of instances
     * @param TotalCount Number of instances
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Instance information 
     * @return InstanceDetails Instance information
     */
    public RedisCommonInstanceList [] getInstanceDetails() {
        return this.InstanceDetails;
    }

    /**
     * Set Instance information
     * @param InstanceDetails Instance information
     */
    public void setInstanceDetails(RedisCommonInstanceList [] InstanceDetails) {
        this.InstanceDetails = InstanceDetails;
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

    public DescribeCommonDBInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCommonDBInstancesResponse(DescribeCommonDBInstancesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InstanceDetails != null) {
            this.InstanceDetails = new RedisCommonInstanceList[source.InstanceDetails.length];
            for (int i = 0; i < source.InstanceDetails.length; i++) {
                this.InstanceDetails[i] = new RedisCommonInstanceList(source.InstanceDetails[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "InstanceDetails.", this.InstanceDetails);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

