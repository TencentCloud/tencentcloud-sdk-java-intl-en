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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableGatewayFlowMonitorRequest extends AbstractModel {

    /**
    * Gateway instance ID. Supported types:
Direct connect gateway instance, such as `dcg-ltjahce6`;
NAT gateway instance, such as `nat-ltjahce6`;
VPN gateway instance, such as `vpn-ltjahce6`.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
     * Get Gateway instance ID. Supported types:
Direct connect gateway instance, such as `dcg-ltjahce6`;
NAT gateway instance, such as `nat-ltjahce6`;
VPN gateway instance, such as `vpn-ltjahce6`. 
     * @return GatewayId Gateway instance ID. Supported types:
Direct connect gateway instance, such as `dcg-ltjahce6`;
NAT gateway instance, such as `nat-ltjahce6`;
VPN gateway instance, such as `vpn-ltjahce6`.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway instance ID. Supported types:
Direct connect gateway instance, such as `dcg-ltjahce6`;
NAT gateway instance, such as `nat-ltjahce6`;
VPN gateway instance, such as `vpn-ltjahce6`.
     * @param GatewayId Gateway instance ID. Supported types:
Direct connect gateway instance, such as `dcg-ltjahce6`;
NAT gateway instance, such as `nat-ltjahce6`;
VPN gateway instance, such as `vpn-ltjahce6`.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    public EnableGatewayFlowMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableGatewayFlowMonitorRequest(EnableGatewayFlowMonitorRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);

    }
}

