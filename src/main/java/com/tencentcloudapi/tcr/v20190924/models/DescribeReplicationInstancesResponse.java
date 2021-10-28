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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReplicationInstancesResponse extends AbstractModel{

    /**
    * Total number of instances
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Replication instance list
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ReplicationRegistries")
    @Expose
    private ReplicationRegistry [] ReplicationRegistries;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of instances 
     * @return TotalCount Total number of instances
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of instances
     * @param TotalCount Total number of instances
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Replication instance list
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ReplicationRegistries Replication instance list
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ReplicationRegistry [] getReplicationRegistries() {
        return this.ReplicationRegistries;
    }

    /**
     * Set Replication instance list
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ReplicationRegistries Replication instance list
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setReplicationRegistries(ReplicationRegistry [] ReplicationRegistries) {
        this.ReplicationRegistries = ReplicationRegistries;
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

    public DescribeReplicationInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReplicationInstancesResponse(DescribeReplicationInstancesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ReplicationRegistries != null) {
            this.ReplicationRegistries = new ReplicationRegistry[source.ReplicationRegistries.length];
            for (int i = 0; i < source.ReplicationRegistries.length; i++) {
                this.ReplicationRegistries[i] = new ReplicationRegistry(source.ReplicationRegistries[i]);
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
        this.setParamArrayObj(map, prefix + "ReplicationRegistries.", this.ReplicationRegistries);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
