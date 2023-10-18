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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxiesResponse extends AbstractModel {

    /**
    * Number of connections.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Connection instance information list; It’s an old parameter, please switch to ProxySet.
    */
    @SerializedName("InstanceSet")
    @Expose
    private ProxyInfo [] InstanceSet;

    /**
    * Connection instance information list; It’s a new parameter.
    */
    @SerializedName("ProxySet")
    @Expose
    private ProxyInfo [] ProxySet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of connections. 
     * @return TotalCount Number of connections.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of connections.
     * @param TotalCount Number of connections.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Connection instance information list; It’s an old parameter, please switch to ProxySet. 
     * @return InstanceSet Connection instance information list; It’s an old parameter, please switch to ProxySet.
     */
    public ProxyInfo [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set Connection instance information list; It’s an old parameter, please switch to ProxySet.
     * @param InstanceSet Connection instance information list; It’s an old parameter, please switch to ProxySet.
     */
    public void setInstanceSet(ProxyInfo [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    /**
     * Get Connection instance information list; It’s a new parameter. 
     * @return ProxySet Connection instance information list; It’s a new parameter.
     */
    public ProxyInfo [] getProxySet() {
        return this.ProxySet;
    }

    /**
     * Set Connection instance information list; It’s a new parameter.
     * @param ProxySet Connection instance information list; It’s a new parameter.
     */
    public void setProxySet(ProxyInfo [] ProxySet) {
        this.ProxySet = ProxySet;
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

    public DescribeProxiesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxiesResponse(DescribeProxiesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InstanceSet != null) {
            this.InstanceSet = new ProxyInfo[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new ProxyInfo(source.InstanceSet[i]);
            }
        }
        if (source.ProxySet != null) {
            this.ProxySet = new ProxyInfo[source.ProxySet.length];
            for (int i = 0; i < source.ProxySet.length; i++) {
                this.ProxySet[i] = new ProxyInfo(source.ProxySet[i]);
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
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);
        this.setParamArrayObj(map, prefix + "ProxySet.", this.ProxySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

