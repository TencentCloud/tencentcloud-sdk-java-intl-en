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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Route extends AbstractModel {

    /**
    * Destination IPv4 IP range
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * Next hop type
NORMAL_CVM: general CVM;
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * Next hop address
You simply need to specify the gateway ID of a different next hop type, and the system will automatically match the next hop address
When `GatewayType` is `EIP`, the value of `GatewayId` will be fixed at `0`
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Unique routing policy ID
    */
    @SerializedName("RouteItemId")
    @Expose
    private String RouteItemId;

    /**
    * Routing policy description
    */
    @SerializedName("RouteDescription")
    @Expose
    private String RouteDescription;

    /**
    * Whether to enable
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Route type. Valid values:
USER: user route;
NETD: network probe route, which will be delivered by the system by default when you create a network probe instance and cannot be edited or deleted;
CCN: CCN route, which will be delivered by the system by default and cannot be edited or deleted.
You can only add and manipulate routes of `USER` type.
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
    * Routing policy ID. The IPv4 routing policy will have a meaningful value, while the IPv6 routing policy is always 0. We recommend you use the unique ID `RouteItemId` for the routing policy
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
     * Get Destination IPv4 IP range 
     * @return DestinationCidrBlock Destination IPv4 IP range
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set Destination IPv4 IP range
     * @param DestinationCidrBlock Destination IPv4 IP range
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get Next hop type
NORMAL_CVM: general CVM; 
     * @return GatewayType Next hop type
NORMAL_CVM: general CVM;
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set Next hop type
NORMAL_CVM: general CVM;
     * @param GatewayType Next hop type
NORMAL_CVM: general CVM;
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get Next hop address
You simply need to specify the gateway ID of a different next hop type, and the system will automatically match the next hop address
When `GatewayType` is `EIP`, the value of `GatewayId` will be fixed at `0` 
     * @return GatewayId Next hop address
You simply need to specify the gateway ID of a different next hop type, and the system will automatically match the next hop address
When `GatewayType` is `EIP`, the value of `GatewayId` will be fixed at `0`
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Next hop address
You simply need to specify the gateway ID of a different next hop type, and the system will automatically match the next hop address
When `GatewayType` is `EIP`, the value of `GatewayId` will be fixed at `0`
     * @param GatewayId Next hop address
You simply need to specify the gateway ID of a different next hop type, and the system will automatically match the next hop address
When `GatewayType` is `EIP`, the value of `GatewayId` will be fixed at `0`
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Unique routing policy ID 
     * @return RouteItemId Unique routing policy ID
     */
    public String getRouteItemId() {
        return this.RouteItemId;
    }

    /**
     * Set Unique routing policy ID
     * @param RouteItemId Unique routing policy ID
     */
    public void setRouteItemId(String RouteItemId) {
        this.RouteItemId = RouteItemId;
    }

    /**
     * Get Routing policy description 
     * @return RouteDescription Routing policy description
     */
    public String getRouteDescription() {
        return this.RouteDescription;
    }

    /**
     * Set Routing policy description
     * @param RouteDescription Routing policy description
     */
    public void setRouteDescription(String RouteDescription) {
        this.RouteDescription = RouteDescription;
    }

    /**
     * Get Whether to enable 
     * @return Enabled Whether to enable
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether to enable
     * @param Enabled Whether to enable
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Route type. Valid values:
USER: user route;
NETD: network probe route, which will be delivered by the system by default when you create a network probe instance and cannot be edited or deleted;
CCN: CCN route, which will be delivered by the system by default and cannot be edited or deleted.
You can only add and manipulate routes of `USER` type. 
     * @return RouteType Route type. Valid values:
USER: user route;
NETD: network probe route, which will be delivered by the system by default when you create a network probe instance and cannot be edited or deleted;
CCN: CCN route, which will be delivered by the system by default and cannot be edited or deleted.
You can only add and manipulate routes of `USER` type.
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * Set Route type. Valid values:
USER: user route;
NETD: network probe route, which will be delivered by the system by default when you create a network probe instance and cannot be edited or deleted;
CCN: CCN route, which will be delivered by the system by default and cannot be edited or deleted.
You can only add and manipulate routes of `USER` type.
     * @param RouteType Route type. Valid values:
USER: user route;
NETD: network probe route, which will be delivered by the system by default when you create a network probe instance and cannot be edited or deleted;
CCN: CCN route, which will be delivered by the system by default and cannot be edited or deleted.
You can only add and manipulate routes of `USER` type.
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Get Routing policy ID. The IPv4 routing policy will have a meaningful value, while the IPv6 routing policy is always 0. We recommend you use the unique ID `RouteItemId` for the routing policy 
     * @return RouteId Routing policy ID. The IPv4 routing policy will have a meaningful value, while the IPv6 routing policy is always 0. We recommend you use the unique ID `RouteItemId` for the routing policy
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set Routing policy ID. The IPv4 routing policy will have a meaningful value, while the IPv6 routing policy is always 0. We recommend you use the unique ID `RouteItemId` for the routing policy
     * @param RouteId Routing policy ID. The IPv4 routing policy will have a meaningful value, while the IPv6 routing policy is always 0. We recommend you use the unique ID `RouteItemId` for the routing policy
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    public Route() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Route(Route source) {
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.RouteItemId != null) {
            this.RouteItemId = new String(source.RouteItemId);
        }
        if (source.RouteDescription != null) {
            this.RouteDescription = new String(source.RouteDescription);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.RouteType != null) {
            this.RouteType = new String(source.RouteType);
        }
        if (source.RouteId != null) {
            this.RouteId = new Long(source.RouteId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "RouteItemId", this.RouteItemId);
        this.setParamSimple(map, prefix + "RouteDescription", this.RouteDescription);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);

    }
}

