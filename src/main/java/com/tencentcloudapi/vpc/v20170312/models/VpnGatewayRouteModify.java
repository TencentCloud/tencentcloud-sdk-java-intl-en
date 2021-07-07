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

public class VpnGatewayRouteModify extends AbstractModel{

    /**
    * Route ID of the VPN gateway
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * Route status of the VPN gateway. Valid values: `ENABLE`, and `DISABLE`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Route ID of the VPN gateway 
     * @return RouteId Route ID of the VPN gateway
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set Route ID of the VPN gateway
     * @param RouteId Route ID of the VPN gateway
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get Route status of the VPN gateway. Valid values: `ENABLE`, and `DISABLE`. 
     * @return Status Route status of the VPN gateway. Valid values: `ENABLE`, and `DISABLE`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Route status of the VPN gateway. Valid values: `ENABLE`, and `DISABLE`.
     * @param Status Route status of the VPN gateway. Valid values: `ENABLE`, and `DISABLE`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public VpnGatewayRouteModify() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpnGatewayRouteModify(VpnGatewayRouteModify source) {
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

