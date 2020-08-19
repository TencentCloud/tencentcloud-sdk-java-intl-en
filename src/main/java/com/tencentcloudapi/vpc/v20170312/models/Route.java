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
    * Type of the next hop. Currently supported types are:
CVM: CVM of the public gateway type;
VPN: VPN gateway;
DIRECTCONNECT: direct connect gateway;
PEERCONNECTION: peering connection;
SSLVPN: sslvpn gateway;
NAT: NAT gateway; 
NORMAL_CVM: normal CVM;
EIP: public IP address of the CVM;
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
    * Routing policy ID. The IPv4 routing policy will have a meaningful value, while the IPv6 routing policy is always 0. We recommend using the unique ID `RouteItemId` for the routing policy.
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
    * Route table instance ID, such as rtb-azd4dt1c.
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * Destination IPv6 IP range, which cannot be included in VPC IP range, such as 2402:4e00:1000:810b::/64.
    */
    @SerializedName("DestinationIpv6CidrBlock")
    @Expose
    private String DestinationIpv6CidrBlock;

    /**
    * Unique routing policy ID.
    */
    @SerializedName("RouteItemId")
    @Expose
    private String RouteItemId;

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
     * Get Type of the next hop. Currently supported types are:
CVM: CVM of the public gateway type;
VPN: VPN gateway;
DIRECTCONNECT: direct connect gateway;
PEERCONNECTION: peering connection;
SSLVPN: sslvpn gateway;
NAT: NAT gateway; 
NORMAL_CVM: normal CVM;
EIP: public IP address of the CVM;
CCN: Cloud Connect Network. 
     * @return GatewayType Type of the next hop. Currently supported types are:
CVM: CVM of the public gateway type;
VPN: VPN gateway;
DIRECTCONNECT: direct connect gateway;
PEERCONNECTION: peering connection;
SSLVPN: sslvpn gateway;
NAT: NAT gateway; 
NORMAL_CVM: normal CVM;
EIP: public IP address of the CVM;
CCN: Cloud Connect Network.
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set Type of the next hop. Currently supported types are:
CVM: CVM of the public gateway type;
VPN: VPN gateway;
DIRECTCONNECT: direct connect gateway;
PEERCONNECTION: peering connection;
SSLVPN: sslvpn gateway;
NAT: NAT gateway; 
NORMAL_CVM: normal CVM;
EIP: public IP address of the CVM;
CCN: Cloud Connect Network.
     * @param GatewayType Type of the next hop. Currently supported types are:
CVM: CVM of the public gateway type;
VPN: VPN gateway;
DIRECTCONNECT: direct connect gateway;
PEERCONNECTION: peering connection;
SSLVPN: sslvpn gateway;
NAT: NAT gateway; 
NORMAL_CVM: normal CVM;
EIP: public IP address of the CVM;
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
     * Get Routing policy ID. The IPv4 routing policy will have a meaningful value, while the IPv6 routing policy is always 0. We recommend using the unique ID `RouteItemId` for the routing policy. 
     * @return RouteId Routing policy ID. The IPv4 routing policy will have a meaningful value, while the IPv6 routing policy is always 0. We recommend using the unique ID `RouteItemId` for the routing policy.
     */
    public Long getRouteId() {
        return this.RouteId;
    }

    /**
     * Set Routing policy ID. The IPv4 routing policy will have a meaningful value, while the IPv6 routing policy is always 0. We recommend using the unique ID `RouteItemId` for the routing policy.
     * @param RouteId Routing policy ID. The IPv4 routing policy will have a meaningful value, while the IPv6 routing policy is always 0. We recommend using the unique ID `RouteItemId` for the routing policy.
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
     * Get Route table instance ID, such as rtb-azd4dt1c. 
     * @return RouteTableId Route table instance ID, such as rtb-azd4dt1c.
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set Route table instance ID, such as rtb-azd4dt1c.
     * @param RouteTableId Route table instance ID, such as rtb-azd4dt1c.
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get Destination IPv6 IP range, which cannot be included in VPC IP range, such as 2402:4e00:1000:810b::/64. 
     * @return DestinationIpv6CidrBlock Destination IPv6 IP range, which cannot be included in VPC IP range, such as 2402:4e00:1000:810b::/64.
     */
    public String getDestinationIpv6CidrBlock() {
        return this.DestinationIpv6CidrBlock;
    }

    /**
     * Set Destination IPv6 IP range, which cannot be included in VPC IP range, such as 2402:4e00:1000:810b::/64.
     * @param DestinationIpv6CidrBlock Destination IPv6 IP range, which cannot be included in VPC IP range, such as 2402:4e00:1000:810b::/64.
     */
    public void setDestinationIpv6CidrBlock(String DestinationIpv6CidrBlock) {
        this.DestinationIpv6CidrBlock = DestinationIpv6CidrBlock;
    }

    /**
     * Get Unique routing policy ID. 
     * @return RouteItemId Unique routing policy ID.
     */
    public String getRouteItemId() {
        return this.RouteItemId;
    }

    /**
     * Set Unique routing policy ID.
     * @param RouteItemId Unique routing policy ID.
     */
    public void setRouteItemId(String RouteItemId) {
        this.RouteItemId = RouteItemId;
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
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "DestinationIpv6CidrBlock", this.DestinationIpv6CidrBlock);
        this.setParamSimple(map, prefix + "RouteItemId", this.RouteItemId);

    }
}

