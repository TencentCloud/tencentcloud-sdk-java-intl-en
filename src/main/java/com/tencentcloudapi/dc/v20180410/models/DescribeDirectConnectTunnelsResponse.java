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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDirectConnectTunnelsResponse extends AbstractModel {

    /**
    * List of dedicated tunnels.
    */
    @SerializedName("DirectConnectTunnelSet")
    @Expose
    private DirectConnectTunnel [] DirectConnectTunnelSet;

    /**
    * Number of eligible dedicated tunnels.
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
     * Get List of dedicated tunnels. 
     * @return DirectConnectTunnelSet List of dedicated tunnels.
     */
    public DirectConnectTunnel [] getDirectConnectTunnelSet() {
        return this.DirectConnectTunnelSet;
    }

    /**
     * Set List of dedicated tunnels.
     * @param DirectConnectTunnelSet List of dedicated tunnels.
     */
    public void setDirectConnectTunnelSet(DirectConnectTunnel [] DirectConnectTunnelSet) {
        this.DirectConnectTunnelSet = DirectConnectTunnelSet;
    }

    /**
     * Get Number of eligible dedicated tunnels. 
     * @return TotalCount Number of eligible dedicated tunnels.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible dedicated tunnels.
     * @param TotalCount Number of eligible dedicated tunnels.
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

    public DescribeDirectConnectTunnelsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDirectConnectTunnelsResponse(DescribeDirectConnectTunnelsResponse source) {
        if (source.DirectConnectTunnelSet != null) {
            this.DirectConnectTunnelSet = new DirectConnectTunnel[source.DirectConnectTunnelSet.length];
            for (int i = 0; i < source.DirectConnectTunnelSet.length; i++) {
                this.DirectConnectTunnelSet[i] = new DirectConnectTunnel(source.DirectConnectTunnelSet[i]);
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
        this.setParamArrayObj(map, prefix + "DirectConnectTunnelSet.", this.DirectConnectTunnelSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

