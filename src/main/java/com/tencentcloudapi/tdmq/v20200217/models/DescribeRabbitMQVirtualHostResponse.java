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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQVirtualHostResponse extends AbstractModel {

    /**
    * Returned number of vhosts
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of vhost details
    */
    @SerializedName("VirtualHostList")
    @Expose
    private RabbitMQVirtualHostInfo [] VirtualHostList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Returned number of vhosts 
     * @return TotalCount Returned number of vhosts
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Returned number of vhosts
     * @param TotalCount Returned number of vhosts
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of vhost details 
     * @return VirtualHostList List of vhost details
     */
    public RabbitMQVirtualHostInfo [] getVirtualHostList() {
        return this.VirtualHostList;
    }

    /**
     * Set List of vhost details
     * @param VirtualHostList List of vhost details
     */
    public void setVirtualHostList(RabbitMQVirtualHostInfo [] VirtualHostList) {
        this.VirtualHostList = VirtualHostList;
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

    public DescribeRabbitMQVirtualHostResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQVirtualHostResponse(DescribeRabbitMQVirtualHostResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.VirtualHostList != null) {
            this.VirtualHostList = new RabbitMQVirtualHostInfo[source.VirtualHostList.length];
            for (int i = 0; i < source.VirtualHostList.length; i++) {
                this.VirtualHostList[i] = new RabbitMQVirtualHostInfo(source.VirtualHostList[i]);
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
        this.setParamArrayObj(map, prefix + "VirtualHostList.", this.VirtualHostList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

