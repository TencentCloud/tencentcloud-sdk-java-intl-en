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

public class DescribeProxyNodesResponse extends AbstractModel {

    /**
    * Number of the database proxy nodes
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of the database proxy nodes
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
     * Get Number of the database proxy nodes 
     * @return TotalCount Number of the database proxy nodes
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of the database proxy nodes
     * @param TotalCount Number of the database proxy nodes
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of the database proxy nodes 
     * @return ProxyNodeInfos List of the database proxy nodes
     */
    public ProxyNodeInfo [] getProxyNodeInfos() {
        return this.ProxyNodeInfos;
    }

    /**
     * Set List of the database proxy nodes
     * @param ProxyNodeInfos List of the database proxy nodes
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

    public DescribeProxyNodesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxyNodesResponse(DescribeProxyNodesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
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
        this.setParamArrayObj(map, prefix + "ProxyNodeInfos.", this.ProxyNodeInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
