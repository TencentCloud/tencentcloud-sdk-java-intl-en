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

public class DescribeProxyAndStatisticsListenersResponse extends AbstractModel {

    /**
    * Information of connections that the statistics can be derived from
    */
    @SerializedName("ProxySet")
    @Expose
    private ProxySimpleInfo [] ProxySet;

    /**
    * Quantity of connections
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Information of connections that the statistics can be derived from 
     * @return ProxySet Information of connections that the statistics can be derived from
     */
    public ProxySimpleInfo [] getProxySet() {
        return this.ProxySet;
    }

    /**
     * Set Information of connections that the statistics can be derived from
     * @param ProxySet Information of connections that the statistics can be derived from
     */
    public void setProxySet(ProxySimpleInfo [] ProxySet) {
        this.ProxySet = ProxySet;
    }

    /**
     * Get Quantity of connections 
     * @return TotalCount Quantity of connections
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Quantity of connections
     * @param TotalCount Quantity of connections
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeProxyAndStatisticsListenersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxyAndStatisticsListenersResponse(DescribeProxyAndStatisticsListenersResponse source) {
        if (source.ProxySet != null) {
            this.ProxySet = new ProxySimpleInfo[source.ProxySet.length];
            for (int i = 0; i < source.ProxySet.length; i++) {
                this.ProxySet[i] = new ProxySimpleInfo(source.ProxySet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ProxySet.", this.ProxySet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

