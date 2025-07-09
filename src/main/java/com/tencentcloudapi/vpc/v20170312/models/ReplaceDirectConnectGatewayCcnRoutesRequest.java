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

public class ReplaceDirectConnectGatewayCcnRoutesRequest extends AbstractModel {

    /**
    * The ID of the Direct Connect gateway, such as `dcg-prpqlmg1`
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
    * The list of IDC IP range that must be connected
    */
    @SerializedName("Routes")
    @Expose
    private DirectConnectGatewayCcnRoute [] Routes;

    /**
     * Get The ID of the Direct Connect gateway, such as `dcg-prpqlmg1` 
     * @return DirectConnectGatewayId The ID of the Direct Connect gateway, such as `dcg-prpqlmg1`
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * Set The ID of the Direct Connect gateway, such as `dcg-prpqlmg1`
     * @param DirectConnectGatewayId The ID of the Direct Connect gateway, such as `dcg-prpqlmg1`
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * Get The list of IDC IP range that must be connected 
     * @return Routes The list of IDC IP range that must be connected
     */
    public DirectConnectGatewayCcnRoute [] getRoutes() {
        return this.Routes;
    }

    /**
     * Set The list of IDC IP range that must be connected
     * @param Routes The list of IDC IP range that must be connected
     */
    public void setRoutes(DirectConnectGatewayCcnRoute [] Routes) {
        this.Routes = Routes;
    }

    public ReplaceDirectConnectGatewayCcnRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceDirectConnectGatewayCcnRoutesRequest(ReplaceDirectConnectGatewayCcnRoutesRequest source) {
        if (source.DirectConnectGatewayId != null) {
            this.DirectConnectGatewayId = new String(source.DirectConnectGatewayId);
        }
        if (source.Routes != null) {
            this.Routes = new DirectConnectGatewayCcnRoute[source.Routes.length];
            for (int i = 0; i < source.Routes.length; i++) {
                this.Routes[i] = new DirectConnectGatewayCcnRoute(source.Routes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectGatewayId", this.DirectConnectGatewayId);
        this.setParamArrayObj(map, prefix + "Routes.", this.Routes);

    }
}

