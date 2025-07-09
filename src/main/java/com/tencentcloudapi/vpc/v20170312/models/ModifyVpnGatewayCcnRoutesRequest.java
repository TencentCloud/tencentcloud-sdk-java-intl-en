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

public class ModifyVpnGatewayCcnRoutesRequest extends AbstractModel {

    /**
    * Instance ID of the VPN gateway
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * The CCN route (IDC IP range) list.
    */
    @SerializedName("Routes")
    @Expose
    private VpngwCcnRoutes [] Routes;

    /**
     * Get Instance ID of the VPN gateway 
     * @return VpnGatewayId Instance ID of the VPN gateway
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set Instance ID of the VPN gateway
     * @param VpnGatewayId Instance ID of the VPN gateway
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get The CCN route (IDC IP range) list. 
     * @return Routes The CCN route (IDC IP range) list.
     */
    public VpngwCcnRoutes [] getRoutes() {
        return this.Routes;
    }

    /**
     * Set The CCN route (IDC IP range) list.
     * @param Routes The CCN route (IDC IP range) list.
     */
    public void setRoutes(VpngwCcnRoutes [] Routes) {
        this.Routes = Routes;
    }

    public ModifyVpnGatewayCcnRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVpnGatewayCcnRoutesRequest(ModifyVpnGatewayCcnRoutesRequest source) {
        if (source.VpnGatewayId != null) {
            this.VpnGatewayId = new String(source.VpnGatewayId);
        }
        if (source.Routes != null) {
            this.Routes = new VpngwCcnRoutes[source.Routes.length];
            for (int i = 0; i < source.Routes.length; i++) {
                this.Routes[i] = new VpngwCcnRoutes(source.Routes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamArrayObj(map, prefix + "Routes.", this.Routes);

    }
}

