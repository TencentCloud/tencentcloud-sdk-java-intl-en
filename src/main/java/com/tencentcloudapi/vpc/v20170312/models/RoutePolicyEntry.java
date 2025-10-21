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

public class RoutePolicyEntry extends AbstractModel {

    /**
    * Specifies the unique ID of the IPv4 routing strategy entry.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("RoutePolicyEntryId")
    @Expose
    private String RoutePolicyEntryId;

    /**
    * Destination ip range.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * Describes the routing strategy rule.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Routing Type

Specifies the USER-customized data type.
NETD: specifies the route for network detection.
CCN: CCN route.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
    * Next hop type. types currently supported:.
CVM: cloud virtual machine with public network gateway type.
VPN: vpn gateway.
DIRECTCONNECT: direct connect gateway.
PEERCONNECTION: peering connection.
HAVIP: high availability virtual ip.
NAT: specifies the nat gateway. 
EIP: specifies the public ip address of the cloud virtual machine.
LOCAL_GATEWAY: specifies the local gateway.
PVGW: pvgw gateway.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * Gateway unique ID.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Priority. a smaller value indicates a higher priority.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Action.
DROP: drop.
DISABLE: receive and disable.
ACCEPT: receive and enable.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Creation time.

Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Specifies the region.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Specifies the unique ID of the IPv4 routing strategy entry.
Note: This field may return null, indicating that no valid value was found. 
     * @return RoutePolicyEntryId Specifies the unique ID of the IPv4 routing strategy entry.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getRoutePolicyEntryId() {
        return this.RoutePolicyEntryId;
    }

    /**
     * Set Specifies the unique ID of the IPv4 routing strategy entry.
Note: This field may return null, indicating that no valid value was found.
     * @param RoutePolicyEntryId Specifies the unique ID of the IPv4 routing strategy entry.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setRoutePolicyEntryId(String RoutePolicyEntryId) {
        this.RoutePolicyEntryId = RoutePolicyEntryId;
    }

    /**
     * Get Destination ip range.
Note: This field may return null, indicating that no valid value was found. 
     * @return CidrBlock Destination ip range.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set Destination ip range.
Note: This field may return null, indicating that no valid value was found.
     * @param CidrBlock Destination ip range.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get Describes the routing strategy rule.
Note: This field may return null, indicating that no valid value was found. 
     * @return Description Describes the routing strategy rule.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Describes the routing strategy rule.
Note: This field may return null, indicating that no valid value was found.
     * @param Description Describes the routing strategy rule.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Routing Type

Specifies the USER-customized data type.
NETD: specifies the route for network detection.
CCN: CCN route.
Note: This field may return null, indicating that no valid value was found. 
     * @return RouteType Routing Type

Specifies the USER-customized data type.
NETD: specifies the route for network detection.
CCN: CCN route.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * Set Routing Type

Specifies the USER-customized data type.
NETD: specifies the route for network detection.
CCN: CCN route.
Note: This field may return null, indicating that no valid value was found.
     * @param RouteType Routing Type

Specifies the USER-customized data type.
NETD: specifies the route for network detection.
CCN: CCN route.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Get Next hop type. types currently supported:.
CVM: cloud virtual machine with public network gateway type.
VPN: vpn gateway.
DIRECTCONNECT: direct connect gateway.
PEERCONNECTION: peering connection.
HAVIP: high availability virtual ip.
NAT: specifies the nat gateway. 
EIP: specifies the public ip address of the cloud virtual machine.
LOCAL_GATEWAY: specifies the local gateway.
PVGW: pvgw gateway.
Note: This field may return null, indicating that no valid value was found. 
     * @return GatewayType Next hop type. types currently supported:.
CVM: cloud virtual machine with public network gateway type.
VPN: vpn gateway.
DIRECTCONNECT: direct connect gateway.
PEERCONNECTION: peering connection.
HAVIP: high availability virtual ip.
NAT: specifies the nat gateway. 
EIP: specifies the public ip address of the cloud virtual machine.
LOCAL_GATEWAY: specifies the local gateway.
PVGW: pvgw gateway.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set Next hop type. types currently supported:.
CVM: cloud virtual machine with public network gateway type.
VPN: vpn gateway.
DIRECTCONNECT: direct connect gateway.
PEERCONNECTION: peering connection.
HAVIP: high availability virtual ip.
NAT: specifies the nat gateway. 
EIP: specifies the public ip address of the cloud virtual machine.
LOCAL_GATEWAY: specifies the local gateway.
PVGW: pvgw gateway.
Note: This field may return null, indicating that no valid value was found.
     * @param GatewayType Next hop type. types currently supported:.
CVM: cloud virtual machine with public network gateway type.
VPN: vpn gateway.
DIRECTCONNECT: direct connect gateway.
PEERCONNECTION: peering connection.
HAVIP: high availability virtual ip.
NAT: specifies the nat gateway. 
EIP: specifies the public ip address of the cloud virtual machine.
LOCAL_GATEWAY: specifies the local gateway.
PVGW: pvgw gateway.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get Gateway unique ID.
Note: This field may return null, indicating that no valid value was found. 
     * @return GatewayId Gateway unique ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway unique ID.
Note: This field may return null, indicating that no valid value was found.
     * @param GatewayId Gateway unique ID.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Priority. a smaller value indicates a higher priority.
Note: This field may return null, indicating that no valid value was found. 
     * @return Priority Priority. a smaller value indicates a higher priority.
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority. a smaller value indicates a higher priority.
Note: This field may return null, indicating that no valid value was found.
     * @param Priority Priority. a smaller value indicates a higher priority.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Action.
DROP: drop.
DISABLE: receive and disable.
ACCEPT: receive and enable.
Note: This field may return null, indicating that no valid value was found. 
     * @return Action Action.
DROP: drop.
DISABLE: receive and disable.
ACCEPT: receive and enable.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action.
DROP: drop.
DISABLE: receive and disable.
ACCEPT: receive and enable.
Note: This field may return null, indicating that no valid value was found.
     * @param Action Action.
DROP: drop.
DISABLE: receive and disable.
ACCEPT: receive and enable.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Creation time.

Note: This field may return null, indicating that no valid value was found. 
     * @return CreatedTime Creation time.

Note: This field may return null, indicating that no valid value was found.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time.

Note: This field may return null, indicating that no valid value was found.
     * @param CreatedTime Creation time.

Note: This field may return null, indicating that no valid value was found.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Specifies the region.
Note: This field may return null, indicating that no valid value was found. 
     * @return Region Specifies the region.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Specifies the region.
Note: This field may return null, indicating that no valid value was found.
     * @param Region Specifies the region.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public RoutePolicyEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoutePolicyEntry(RoutePolicyEntry source) {
        if (source.RoutePolicyEntryId != null) {
            this.RoutePolicyEntryId = new String(source.RoutePolicyEntryId);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RouteType != null) {
            this.RouteType = new String(source.RouteType);
        }
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoutePolicyEntryId", this.RoutePolicyEntryId);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

