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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHostsResponse extends AbstractModel {

    /**
    * Total number of CDH instances meeting the query conditions
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Information on CDH instances
    */
    @SerializedName("HostSet")
    @Expose
    private HostItem [] HostSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of CDH instances meeting the query conditions 
     * @return TotalCount Total number of CDH instances meeting the query conditions
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of CDH instances meeting the query conditions
     * @param TotalCount Total number of CDH instances meeting the query conditions
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Information on CDH instances 
     * @return HostSet Information on CDH instances
     */
    public HostItem [] getHostSet() {
        return this.HostSet;
    }

    /**
     * Set Information on CDH instances
     * @param HostSet Information on CDH instances
     */
    public void setHostSet(HostItem [] HostSet) {
        this.HostSet = HostSet;
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

    public DescribeHostsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHostsResponse(DescribeHostsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.HostSet != null) {
            this.HostSet = new HostItem[source.HostSet.length];
            for (int i = 0; i < source.HostSet.length; i++) {
                this.HostSet[i] = new HostItem(source.HostSet[i]);
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
        this.setParamArrayObj(map, prefix + "HostSet.", this.HostSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

