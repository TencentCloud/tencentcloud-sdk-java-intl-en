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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxiesResponse extends AbstractModel {

    /**
    * Number of database proxy groups
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of database proxy groups
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyGroupInfos")
    @Expose
    private ProxyGroupInfo [] ProxyGroupInfos;

    /**
    * Database proxy node
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyNodeInfos")
    @Expose
    private ProxyNodeInfo [] ProxyNodeInfos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of database proxy groups 
     * @return TotalCount Number of database proxy groups
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of database proxy groups
     * @param TotalCount Number of database proxy groups
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of database proxy groups
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained. 
     * @return ProxyGroupInfos List of database proxy groups
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     */
    public ProxyGroupInfo [] getProxyGroupInfos() {
        return this.ProxyGroupInfos;
    }

    /**
     * Set List of database proxy groups
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     * @param ProxyGroupInfos List of database proxy groups
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     */
    public void setProxyGroupInfos(ProxyGroupInfo [] ProxyGroupInfos) {
        this.ProxyGroupInfos = ProxyGroupInfos;
    }

    /**
     * Get Database proxy node
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained. 
     * @return ProxyNodeInfos Database proxy node
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     */
    public ProxyNodeInfo [] getProxyNodeInfos() {
        return this.ProxyNodeInfos;
    }

    /**
     * Set Database proxy node
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     * @param ProxyNodeInfos Database proxy node
Note: u200dThis field may returnu200d·nullu200d·, indicating that no valid values can be obtained.
     */
    public void setProxyNodeInfos(ProxyNodeInfo [] ProxyNodeInfos) {
        this.ProxyNodeInfos = ProxyNodeInfos;
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
        if (source.ProxyGroupInfos != null) {
            this.ProxyGroupInfos = new ProxyGroupInfo[source.ProxyGroupInfos.length];
            for (int i = 0; i < source.ProxyGroupInfos.length; i++) {
                this.ProxyGroupInfos[i] = new ProxyGroupInfo(source.ProxyGroupInfos[i]);
            }
        }
        if (source.ProxyNodeInfos != null) {
            this.ProxyNodeInfos = new ProxyNodeInfo[source.ProxyNodeInfos.length];
            for (int i = 0; i < source.ProxyNodeInfos.length; i++) {
                this.ProxyNodeInfos[i] = new ProxyNodeInfo(source.ProxyNodeInfos[i]);
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
        this.setParamArrayObj(map, prefix + "ProxyGroupInfos.", this.ProxyGroupInfos);
        this.setParamArrayObj(map, prefix + "ProxyNodeInfos.", this.ProxyNodeInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

