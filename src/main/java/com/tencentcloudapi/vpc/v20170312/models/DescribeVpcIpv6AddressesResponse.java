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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcIpv6AddressesResponse extends AbstractModel {

    /**
    * The `IPv6` address list.
    */
    @SerializedName("Ipv6AddressSet")
    @Expose
    private VpcIpv6Address [] Ipv6AddressSet;

    /**
    * The total number of `IPv6` addresses.
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
     * Get The `IPv6` address list. 
     * @return Ipv6AddressSet The `IPv6` address list.
     */
    public VpcIpv6Address [] getIpv6AddressSet() {
        return this.Ipv6AddressSet;
    }

    /**
     * Set The `IPv6` address list.
     * @param Ipv6AddressSet The `IPv6` address list.
     */
    public void setIpv6AddressSet(VpcIpv6Address [] Ipv6AddressSet) {
        this.Ipv6AddressSet = Ipv6AddressSet;
    }

    /**
     * Get The total number of `IPv6` addresses. 
     * @return TotalCount The total number of `IPv6` addresses.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The total number of `IPv6` addresses.
     * @param TotalCount The total number of `IPv6` addresses.
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

    public DescribeVpcIpv6AddressesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcIpv6AddressesResponse(DescribeVpcIpv6AddressesResponse source) {
        if (source.Ipv6AddressSet != null) {
            this.Ipv6AddressSet = new VpcIpv6Address[source.Ipv6AddressSet.length];
            for (int i = 0; i < source.Ipv6AddressSet.length; i++) {
                this.Ipv6AddressSet[i] = new VpcIpv6Address(source.Ipv6AddressSet[i]);
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
        this.setParamArrayObj(map, prefix + "Ipv6AddressSet.", this.Ipv6AddressSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

