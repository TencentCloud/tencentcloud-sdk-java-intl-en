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

public class ResetNatGatewayConnectionRequest extends AbstractModel{

    /**
    * The NAT gateway ID.
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * Concurrent connections cap of the NAT gateway, such as 1000000, 3000000, 10000000.
    */
    @SerializedName("MaxConcurrentConnection")
    @Expose
    private Long MaxConcurrentConnection;

    /**
     * Get The NAT gateway ID. 
     * @return NatGatewayId The NAT gateway ID.
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set The NAT gateway ID.
     * @param NatGatewayId The NAT gateway ID.
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get Concurrent connections cap of the NAT gateway, such as 1000000, 3000000, 10000000. 
     * @return MaxConcurrentConnection Concurrent connections cap of the NAT gateway, such as 1000000, 3000000, 10000000.
     */
    public Long getMaxConcurrentConnection() {
        return this.MaxConcurrentConnection;
    }

    /**
     * Set Concurrent connections cap of the NAT gateway, such as 1000000, 3000000, 10000000.
     * @param MaxConcurrentConnection Concurrent connections cap of the NAT gateway, such as 1000000, 3000000, 10000000.
     */
    public void setMaxConcurrentConnection(Long MaxConcurrentConnection) {
        this.MaxConcurrentConnection = MaxConcurrentConnection;
    }

    public ResetNatGatewayConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetNatGatewayConnectionRequest(ResetNatGatewayConnectionRequest source) {
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.MaxConcurrentConnection != null) {
            this.MaxConcurrentConnection = new Long(source.MaxConcurrentConnection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "MaxConcurrentConnection", this.MaxConcurrentConnection);

    }
}

