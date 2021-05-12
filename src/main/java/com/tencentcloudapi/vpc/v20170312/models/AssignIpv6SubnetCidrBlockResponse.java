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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssignIpv6SubnetCidrBlockResponse extends AbstractModel{

    /**
    * The assigned `IPv6` subnet IP range list.
    */
    @SerializedName("Ipv6SubnetCidrBlockSet")
    @Expose
    private Ipv6SubnetCidrBlock [] Ipv6SubnetCidrBlockSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The assigned `IPv6` subnet IP range list. 
     * @return Ipv6SubnetCidrBlockSet The assigned `IPv6` subnet IP range list.
     */
    public Ipv6SubnetCidrBlock [] getIpv6SubnetCidrBlockSet() {
        return this.Ipv6SubnetCidrBlockSet;
    }

    /**
     * Set The assigned `IPv6` subnet IP range list.
     * @param Ipv6SubnetCidrBlockSet The assigned `IPv6` subnet IP range list.
     */
    public void setIpv6SubnetCidrBlockSet(Ipv6SubnetCidrBlock [] Ipv6SubnetCidrBlockSet) {
        this.Ipv6SubnetCidrBlockSet = Ipv6SubnetCidrBlockSet;
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

    public AssignIpv6SubnetCidrBlockResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssignIpv6SubnetCidrBlockResponse(AssignIpv6SubnetCidrBlockResponse source) {
        if (source.Ipv6SubnetCidrBlockSet != null) {
            this.Ipv6SubnetCidrBlockSet = new Ipv6SubnetCidrBlock[source.Ipv6SubnetCidrBlockSet.length];
            for (int i = 0; i < source.Ipv6SubnetCidrBlockSet.length; i++) {
                this.Ipv6SubnetCidrBlockSet[i] = new Ipv6SubnetCidrBlock(source.Ipv6SubnetCidrBlockSet[i]);
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
        this.setParamArrayObj(map, prefix + "Ipv6SubnetCidrBlockSet.", this.Ipv6SubnetCidrBlockSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

