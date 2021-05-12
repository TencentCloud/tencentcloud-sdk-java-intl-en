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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxySlowLogResponse extends AbstractModel{

    /**
    * Total number of slow queries
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Slow query details
    */
    @SerializedName("InstanceProxySlowLogDetail")
    @Expose
    private InstanceProxySlowlogDetail [] InstanceProxySlowLogDetail;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of slow queries 
     * @return TotalCount Total number of slow queries
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of slow queries
     * @param TotalCount Total number of slow queries
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Slow query details 
     * @return InstanceProxySlowLogDetail Slow query details
     */
    public InstanceProxySlowlogDetail [] getInstanceProxySlowLogDetail() {
        return this.InstanceProxySlowLogDetail;
    }

    /**
     * Set Slow query details
     * @param InstanceProxySlowLogDetail Slow query details
     */
    public void setInstanceProxySlowLogDetail(InstanceProxySlowlogDetail [] InstanceProxySlowLogDetail) {
        this.InstanceProxySlowLogDetail = InstanceProxySlowLogDetail;
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

    public DescribeProxySlowLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxySlowLogResponse(DescribeProxySlowLogResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InstanceProxySlowLogDetail != null) {
            this.InstanceProxySlowLogDetail = new InstanceProxySlowlogDetail[source.InstanceProxySlowLogDetail.length];
            for (int i = 0; i < source.InstanceProxySlowLogDetail.length; i++) {
                this.InstanceProxySlowLogDetail[i] = new InstanceProxySlowlogDetail(source.InstanceProxySlowLogDetail[i]);
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
        this.setParamArrayObj(map, prefix + "InstanceProxySlowLogDetail.", this.InstanceProxySlowLogDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

