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

public class Route extends AbstractModel{

    /**
    * Destination IP range, such as 112.20.51.0/24. Values cannot be in the VPC IP range.
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * The type of the next hop. Currently supported types include:
CVM: Public gateway-type CVM;
VPN: VPN gateway;
DIRECTCONNECT: Direct connect gateway;
PEERCONNECTION: Peering connection;
SSLVPN: sslvpn gateway;
NAT: NAT gateway; 
NORMAL_CVM: Normal CVM;
EIP: The public IP of the CVM;
CCN: Cloud Connect Network.
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * Next hop address. You simply need to specify the gateway ID of a different next hop type, and the system will automatically match the next hop address.
Important note: When the GatewayType is EIP, the GatewayId has a fixed value `0`
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * The ID of the routing policy.
    */
    @SerializedName("RouteId")
    @Expose
    private Long RouteId;

    /**
    * The description of the routing policy.
    */
    @SerializedName("RouteDescription")
    @Expose
    private String RouteDescription;

    /**
    * Whether it is enabled
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * The route type. Currently, the following types are supported:
USER: User route;
NETD: Network probe route. When creating a network probe route, the system delivers by default. It cannot be edited or deleted;
CCN: CCN route. The system delivers by default. It cannot be edited or deleted.
Users can only add and operate USER-type routes.
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
     * Get Destination IP range, such as 112.20.51.0/24. Values cannot be in the VPC IP range. 
     * @return DestinationCidrBlock Destination IP range, such as 112.20.51.0/24. Values cannot be in the VPC IP range.
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set Destination IP range, such as 112.20.51.0/24. Values cannot be in the VPC IP range.
     * @param DestinationCidrBlock Destination IP range, such as 112.20.51.0/24. Values cannot be in the VPC IP range.
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get The type of the next hop. Currently supported types include:
CVM: Public gateway-type CVM;
VPN: VPN gateway;
DIRECTCONNECT: Direct connect gateway;
PEERCONNECTION: Peering connection;
SSLVPN: sslvpn gateway;
NAT: NAT gateway; 
NORMAL_CVM: Normal CVM;
EIP: The public IP of the CVM;
CCN: Cloud Connect Network. 
     * @return GatewayType The type of the next hop. Currently supported types include:
CVM: Public gateway-type CVM;
VPN: VPN gateway;
DIRECTCONNECT: Direct connect gateway;
PEERCONNECTION: Peering connection;
SSLVPN: sslvpn gateway;
NAT: NAT gateway; 
NORMAL_CVM: Normal CVM;
EIP: The public IP of the CVM;
CCN: Cloud Connect Network.
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set The type of the next hop. Currently supported types include:
CVM: Public gateway-type CVM;
VPN: VPN gateway;
DIRECTCONNECT: Direct connect gateway;
PEERCONNECTION: Peering connection;
SSLVPN: sslvpn gateway;
NAT: NAT gateway; 
NORMAL_CVM: Normal CVM;
EIP: The public IP of the CVM;
CCN: Cloud Connect Network.
     * @param GatewayType The type of the next hop. Currently supported types include:
CVM: Public gateway-type CVM;
VPN: VPN gateway;
DIRECTCONNECT: Direct connect gateway;
PEERCONNECTION: Peering connection;
SSLVPN: sslvpn gateway;
NAT: NAT gateway; 
NORMAL_CVM: Normal CVM;
EIP: The public IP of the CVM;
CCN: Cloud Connect Network.
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get Next hop address. You simply need to specify the gateway ID of a different next hop type, and the system will automatically match the next hop address.
Important note: When the GatewayType is EIP, the GatewayId has a fixed value `0` 
     * @return GatewayId Next hop address. You simply need to specify the gateway ID of a different next hop type, and the system will automatically match the next hop address.
Important note: When the GatewayType is EIP, the GatewayId has a fixed value `0`
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Next hop address. You simply need to specify the gateway ID of a different next hop type, and the system will automatically match the next hop address.
Important note: When the GatewayType is EIP, the GatewayId has a fixed value `0`
     * @param GatewayId Next hop address. You simply need to specify the gateway ID of a different next hop type, and the system will automatically match the next hop address.
Important note: When the GatewayType is EIP, the GatewayId has a fixed value `0`
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get The ID of the routing policy. 
     * @return RouteId The ID of the routing policy.
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set The ID of the routing policy.
     * @param RouteId The ID of the routing policy.
     */
    public void setRouteId(Long RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get The description of the routing policy. 
     * @return RouteDescription The description of the routing policy.
     */
    public String getRouteDescription() {
        return this.RouteDescription;
    }

    /**
     * Set The description of the routing policy.
     * @param RouteDescription The description of the routing policy.
     */
    public void setRouteDescription(String RouteDescription) {
        this.RouteDescription = RouteDescription;
    }

    /**
     * Get Whether it is enabled 
     * @return Enabled Whether it is enabled
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether it is enabled
     * @param Enabled Whether it is enabled
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get The route type. Currently, the following types are supported:
USER: User route;
NETD: Network probe route. When creating a network probe route, the system delivers by default. It cannot be edited or deleted;
CCN: CCN route. The system delivers by default. It cannot be edited or deleted.
Users can only add and operate USER-type routes. 
     * @return RouteType The route type. Currently, the following types are supported:
USER: User route;
NETD: Network probe route. When creating a network probe route, the system delivers by default. It cannot be edited or deleted;
CCN: CCN route. The system delivers by default. It cannot be edited or deleted.
Users can only add and operate USER-type routes.
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * Set The route type. Currently, the following types are supported:
USER: User route;
NETD: Network probe route. When creating a network probe route, the system delivers by default. It cannot be edited or deleted;
CCN: CCN route. The system delivers by default. It cannot be edited or deleted.
Users can only add and operate USER-type routes.
     * @param RouteType The route type. Currently, the following types are supported:
USER: User route;
NETD: Network probe route. When creating a network probe route, the system delivers by default. It cannot be edited or deleted;
CCN: CCN route. The system delivers by default. It cannot be edited or deleted.
Users can only add and operate USER-type routes.
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "RouteDescription", this.RouteDescription);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);

    }
}

