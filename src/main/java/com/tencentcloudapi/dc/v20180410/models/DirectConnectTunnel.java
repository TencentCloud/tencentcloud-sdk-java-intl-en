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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DirectConnectTunnel extends AbstractModel{

    /**
    * Dedicated tunnel ID.
    */
    @SerializedName("DirectConnectTunnelId")
    @Expose
    private String DirectConnectTunnelId;

    /**
    * Connection ID.
    */
    @SerializedName("DirectConnectId")
    @Expose
    private String DirectConnectId;

    /**
    * Dedicated tunnel status.
AVAILABLE: Ready or connected.
PENDING: Applying.
ALLOCATING: Configuring.
ALLOCATED: Configured.
ALTERING: Modifying.
DELETING: Deleting.
DELETED: Deleted.
COMFIRMING: To be accepted.
REJECTED: Rejected.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Connection owner, i.e., developer account ID.
    */
    @SerializedName("DirectConnectOwnerAccount")
    @Expose
    private String DirectConnectOwnerAccount;

    /**
    * Dedicated tunnel owner, i.e., developer account ID.
    */
    @SerializedName("OwnerAccount")
    @Expose
    private String OwnerAccount;

    /**
    * Network type. Valid values: VPC, BMVPC, CCN.
 VPC: Virtual Private Cloud; BMVPC: BM VPC; CCN: Cloud Connect Network.
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * Network of the VPC region, such as `ap-guangzhou`.
    */
    @SerializedName("NetworkRegion")
    @Expose
    private String NetworkRegion;

    /**
    * Unified VPC ID or BMVPC ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Direct connect gateway ID.
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
    * BGP: BGP routing; STATIC: Static routing. Default value: BGP routing.
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
    * User-side BGP, including Asn and AuthKey.
    */
    @SerializedName("BgpPeer")
    @Expose
    private BgpPeer BgpPeer;

    /**
    * User-side IP range.
    */
    @SerializedName("RouteFilterPrefixes")
    @Expose
    private RouteFilterPrefix [] RouteFilterPrefixes;

    /**
    * VLAN of a dedicated tunnel.
    */
    @SerializedName("Vlan")
    @Expose
    private Long Vlan;

    /**
    * TencentAddress: Tencent-side IP address.
    */
    @SerializedName("TencentAddress")
    @Expose
    private String TencentAddress;

    /**
    * CustomerAddress: User-side IP address.
    */
    @SerializedName("CustomerAddress")
    @Expose
    private String CustomerAddress;

    /**
    * Dedicated tunnel name.
    */
    @SerializedName("DirectConnectTunnelName")
    @Expose
    private String DirectConnectTunnelName;

    /**
    * Creation time of a dedicated tunnel.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Bandwidth value of a dedicated tunnel.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Tag value of a dedicated tunnel.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * Associated custom network probe ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NetDetectId")
    @Expose
    private String NetDetectId;

    /**
    * BGP community switch
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableBGPCommunity")
    @Expose
    private Boolean EnableBGPCommunity;

    /**
    * Whether it is a NAT tunnel
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NatType")
    @Expose
    private Long NatType;

    /**
    * VPC region abbreviation, such as `gz`, `cd`.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcRegion")
    @Expose
    private String VpcRegion;

    /**
    * Whether to enable BFD
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BfdEnable")
    @Expose
    private Long BfdEnable;

    /**
    * Access point type of a dedicated tunnel.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessPointType")
    @Expose
    private String AccessPointType;

    /**
    * Direct connect gateway name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DirectConnectGatewayName")
    @Expose
    private String DirectConnectGatewayName;

    /**
    * VPC name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * Backup IP address on the Tencent side.
    */
    @SerializedName("TencentBackupAddress")
    @Expose
    private String TencentBackupAddress;

    /**
    * Whether the connection associated with the dedicated tunnel has the service agreement signed.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("SignLaw")
    @Expose
    private Boolean SignLaw;

    /**
    * Cloud Attached Connection Service ID
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("CloudAttachId")
    @Expose
    private String CloudAttachId;

    /**
     * Get Dedicated tunnel ID. 
     * @return DirectConnectTunnelId Dedicated tunnel ID.
     */
    public String getDirectConnectTunnelId() {
        return this.DirectConnectTunnelId;
    }

    /**
     * Set Dedicated tunnel ID.
     * @param DirectConnectTunnelId Dedicated tunnel ID.
     */
    public void setDirectConnectTunnelId(String DirectConnectTunnelId) {
        this.DirectConnectTunnelId = DirectConnectTunnelId;
    }

    /**
     * Get Connection ID. 
     * @return DirectConnectId Connection ID.
     */
    public String getDirectConnectId() {
        return this.DirectConnectId;
    }

    /**
     * Set Connection ID.
     * @param DirectConnectId Connection ID.
     */
    public void setDirectConnectId(String DirectConnectId) {
        this.DirectConnectId = DirectConnectId;
    }

    /**
     * Get Dedicated tunnel status.
AVAILABLE: Ready or connected.
PENDING: Applying.
ALLOCATING: Configuring.
ALLOCATED: Configured.
ALTERING: Modifying.
DELETING: Deleting.
DELETED: Deleted.
COMFIRMING: To be accepted.
REJECTED: Rejected. 
     * @return State Dedicated tunnel status.
AVAILABLE: Ready or connected.
PENDING: Applying.
ALLOCATING: Configuring.
ALLOCATED: Configured.
ALTERING: Modifying.
DELETING: Deleting.
DELETED: Deleted.
COMFIRMING: To be accepted.
REJECTED: Rejected.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Dedicated tunnel status.
AVAILABLE: Ready or connected.
PENDING: Applying.
ALLOCATING: Configuring.
ALLOCATED: Configured.
ALTERING: Modifying.
DELETING: Deleting.
DELETED: Deleted.
COMFIRMING: To be accepted.
REJECTED: Rejected.
     * @param State Dedicated tunnel status.
AVAILABLE: Ready or connected.
PENDING: Applying.
ALLOCATING: Configuring.
ALLOCATED: Configured.
ALTERING: Modifying.
DELETING: Deleting.
DELETED: Deleted.
COMFIRMING: To be accepted.
REJECTED: Rejected.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Connection owner, i.e., developer account ID. 
     * @return DirectConnectOwnerAccount Connection owner, i.e., developer account ID.
     */
    public String getDirectConnectOwnerAccount() {
        return this.DirectConnectOwnerAccount;
    }

    /**
     * Set Connection owner, i.e., developer account ID.
     * @param DirectConnectOwnerAccount Connection owner, i.e., developer account ID.
     */
    public void setDirectConnectOwnerAccount(String DirectConnectOwnerAccount) {
        this.DirectConnectOwnerAccount = DirectConnectOwnerAccount;
    }

    /**
     * Get Dedicated tunnel owner, i.e., developer account ID. 
     * @return OwnerAccount Dedicated tunnel owner, i.e., developer account ID.
     */
    public String getOwnerAccount() {
        return this.OwnerAccount;
    }

    /**
     * Set Dedicated tunnel owner, i.e., developer account ID.
     * @param OwnerAccount Dedicated tunnel owner, i.e., developer account ID.
     */
    public void setOwnerAccount(String OwnerAccount) {
        this.OwnerAccount = OwnerAccount;
    }

    /**
     * Get Network type. Valid values: VPC, BMVPC, CCN.
 VPC: Virtual Private Cloud; BMVPC: BM VPC; CCN: Cloud Connect Network. 
     * @return NetworkType Network type. Valid values: VPC, BMVPC, CCN.
 VPC: Virtual Private Cloud; BMVPC: BM VPC; CCN: Cloud Connect Network.
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set Network type. Valid values: VPC, BMVPC, CCN.
 VPC: Virtual Private Cloud; BMVPC: BM VPC; CCN: Cloud Connect Network.
     * @param NetworkType Network type. Valid values: VPC, BMVPC, CCN.
 VPC: Virtual Private Cloud; BMVPC: BM VPC; CCN: Cloud Connect Network.
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get Network of the VPC region, such as `ap-guangzhou`. 
     * @return NetworkRegion Network of the VPC region, such as `ap-guangzhou`.
     */
    public String getNetworkRegion() {
        return this.NetworkRegion;
    }

    /**
     * Set Network of the VPC region, such as `ap-guangzhou`.
     * @param NetworkRegion Network of the VPC region, such as `ap-guangzhou`.
     */
    public void setNetworkRegion(String NetworkRegion) {
        this.NetworkRegion = NetworkRegion;
    }

    /**
     * Get Unified VPC ID or BMVPC ID. 
     * @return VpcId Unified VPC ID or BMVPC ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unified VPC ID or BMVPC ID.
     * @param VpcId Unified VPC ID or BMVPC ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Direct connect gateway ID. 
     * @return DirectConnectGatewayId Direct connect gateway ID.
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * Set Direct connect gateway ID.
     * @param DirectConnectGatewayId Direct connect gateway ID.
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * Get BGP: BGP routing; STATIC: Static routing. Default value: BGP routing. 
     * @return RouteType BGP: BGP routing; STATIC: Static routing. Default value: BGP routing.
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * Set BGP: BGP routing; STATIC: Static routing. Default value: BGP routing.
     * @param RouteType BGP: BGP routing; STATIC: Static routing. Default value: BGP routing.
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Get User-side BGP, including Asn and AuthKey. 
     * @return BgpPeer User-side BGP, including Asn and AuthKey.
     */
    public BgpPeer getBgpPeer() {
        return this.BgpPeer;
    }

    /**
     * Set User-side BGP, including Asn and AuthKey.
     * @param BgpPeer User-side BGP, including Asn and AuthKey.
     */
    public void setBgpPeer(BgpPeer BgpPeer) {
        this.BgpPeer = BgpPeer;
    }

    /**
     * Get User-side IP range. 
     * @return RouteFilterPrefixes User-side IP range.
     */
    public RouteFilterPrefix [] getRouteFilterPrefixes() {
        return this.RouteFilterPrefixes;
    }

    /**
     * Set User-side IP range.
     * @param RouteFilterPrefixes User-side IP range.
     */
    public void setRouteFilterPrefixes(RouteFilterPrefix [] RouteFilterPrefixes) {
        this.RouteFilterPrefixes = RouteFilterPrefixes;
    }

    /**
     * Get VLAN of a dedicated tunnel. 
     * @return Vlan VLAN of a dedicated tunnel.
     */
    public Long getVlan() {
        return this.Vlan;
    }

    /**
     * Set VLAN of a dedicated tunnel.
     * @param Vlan VLAN of a dedicated tunnel.
     */
    public void setVlan(Long Vlan) {
        this.Vlan = Vlan;
    }

    /**
     * Get TencentAddress: Tencent-side IP address. 
     * @return TencentAddress TencentAddress: Tencent-side IP address.
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * Set TencentAddress: Tencent-side IP address.
     * @param TencentAddress TencentAddress: Tencent-side IP address.
     */
    public void setTencentAddress(String TencentAddress) {
        this.TencentAddress = TencentAddress;
    }

    /**
     * Get CustomerAddress: User-side IP address. 
     * @return CustomerAddress CustomerAddress: User-side IP address.
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * Set CustomerAddress: User-side IP address.
     * @param CustomerAddress CustomerAddress: User-side IP address.
     */
    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    /**
     * Get Dedicated tunnel name. 
     * @return DirectConnectTunnelName Dedicated tunnel name.
     */
    public String getDirectConnectTunnelName() {
        return this.DirectConnectTunnelName;
    }

    /**
     * Set Dedicated tunnel name.
     * @param DirectConnectTunnelName Dedicated tunnel name.
     */
    public void setDirectConnectTunnelName(String DirectConnectTunnelName) {
        this.DirectConnectTunnelName = DirectConnectTunnelName;
    }

    /**
     * Get Creation time of a dedicated tunnel. 
     * @return CreatedTime Creation time of a dedicated tunnel.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time of a dedicated tunnel.
     * @param CreatedTime Creation time of a dedicated tunnel.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Bandwidth value of a dedicated tunnel. 
     * @return Bandwidth Bandwidth value of a dedicated tunnel.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Bandwidth value of a dedicated tunnel.
     * @param Bandwidth Bandwidth value of a dedicated tunnel.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Tag value of a dedicated tunnel. 
     * @return TagSet Tag value of a dedicated tunnel.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag value of a dedicated tunnel.
     * @param TagSet Tag value of a dedicated tunnel.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Associated custom network probe ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NetDetectId Associated custom network probe ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNetDetectId() {
        return this.NetDetectId;
    }

    /**
     * Set Associated custom network probe ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NetDetectId Associated custom network probe ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNetDetectId(String NetDetectId) {
        this.NetDetectId = NetDetectId;
    }

    /**
     * Get BGP community switch
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EnableBGPCommunity BGP community switch
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnableBGPCommunity() {
        return this.EnableBGPCommunity;
    }

    /**
     * Set BGP community switch
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EnableBGPCommunity BGP community switch
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableBGPCommunity(Boolean EnableBGPCommunity) {
        this.EnableBGPCommunity = EnableBGPCommunity;
    }

    /**
     * Get Whether it is a NAT tunnel
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NatType Whether it is a NAT tunnel
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getNatType() {
        return this.NatType;
    }

    /**
     * Set Whether it is a NAT tunnel
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NatType Whether it is a NAT tunnel
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNatType(Long NatType) {
        this.NatType = NatType;
    }

    /**
     * Get VPC region abbreviation, such as `gz`, `cd`.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VpcRegion VPC region abbreviation, such as `gz`, `cd`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcRegion() {
        return this.VpcRegion;
    }

    /**
     * Set VPC region abbreviation, such as `gz`, `cd`.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VpcRegion VPC region abbreviation, such as `gz`, `cd`.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcRegion(String VpcRegion) {
        this.VpcRegion = VpcRegion;
    }

    /**
     * Get Whether to enable BFD
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BfdEnable Whether to enable BFD
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getBfdEnable() {
        return this.BfdEnable;
    }

    /**
     * Set Whether to enable BFD
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BfdEnable Whether to enable BFD
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBfdEnable(Long BfdEnable) {
        this.BfdEnable = BfdEnable;
    }

    /**
     * Get Access point type of a dedicated tunnel.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AccessPointType Access point type of a dedicated tunnel.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAccessPointType() {
        return this.AccessPointType;
    }

    /**
     * Set Access point type of a dedicated tunnel.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AccessPointType Access point type of a dedicated tunnel.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessPointType(String AccessPointType) {
        this.AccessPointType = AccessPointType;
    }

    /**
     * Get Direct connect gateway name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DirectConnectGatewayName Direct connect gateway name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDirectConnectGatewayName() {
        return this.DirectConnectGatewayName;
    }

    /**
     * Set Direct connect gateway name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DirectConnectGatewayName Direct connect gateway name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDirectConnectGatewayName(String DirectConnectGatewayName) {
        this.DirectConnectGatewayName = DirectConnectGatewayName;
    }

    /**
     * Get VPC name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VpcName VPC name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VpcName VPC name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get Backup IP address on the Tencent side. 
     * @return TencentBackupAddress Backup IP address on the Tencent side.
     */
    public String getTencentBackupAddress() {
        return this.TencentBackupAddress;
    }

    /**
     * Set Backup IP address on the Tencent side.
     * @param TencentBackupAddress Backup IP address on the Tencent side.
     */
    public void setTencentBackupAddress(String TencentBackupAddress) {
        this.TencentBackupAddress = TencentBackupAddress;
    }

    /**
     * Get Whether the connection associated with the dedicated tunnel has the service agreement signed.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return SignLaw Whether the connection associated with the dedicated tunnel has the service agreement signed.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Boolean getSignLaw() {
        return this.SignLaw;
    }

    /**
     * Set Whether the connection associated with the dedicated tunnel has the service agreement signed.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param SignLaw Whether the connection associated with the dedicated tunnel has the service agreement signed.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setSignLaw(Boolean SignLaw) {
        this.SignLaw = SignLaw;
    }

    /**
     * Get Cloud Attached Connection Service ID
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return CloudAttachId Cloud Attached Connection Service ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCloudAttachId() {
        return this.CloudAttachId;
    }

    /**
     * Set Cloud Attached Connection Service ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param CloudAttachId Cloud Attached Connection Service ID
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCloudAttachId(String CloudAttachId) {
        this.CloudAttachId = CloudAttachId;
    }

    public DirectConnectTunnel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DirectConnectTunnel(DirectConnectTunnel source) {
        if (source.DirectConnectTunnelId != null) {
            this.DirectConnectTunnelId = new String(source.DirectConnectTunnelId);
        }
        if (source.DirectConnectId != null) {
            this.DirectConnectId = new String(source.DirectConnectId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.DirectConnectOwnerAccount != null) {
            this.DirectConnectOwnerAccount = new String(source.DirectConnectOwnerAccount);
        }
        if (source.OwnerAccount != null) {
            this.OwnerAccount = new String(source.OwnerAccount);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.NetworkRegion != null) {
            this.NetworkRegion = new String(source.NetworkRegion);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.DirectConnectGatewayId != null) {
            this.DirectConnectGatewayId = new String(source.DirectConnectGatewayId);
        }
        if (source.RouteType != null) {
            this.RouteType = new String(source.RouteType);
        }
        if (source.BgpPeer != null) {
            this.BgpPeer = new BgpPeer(source.BgpPeer);
        }
        if (source.RouteFilterPrefixes != null) {
            this.RouteFilterPrefixes = new RouteFilterPrefix[source.RouteFilterPrefixes.length];
            for (int i = 0; i < source.RouteFilterPrefixes.length; i++) {
                this.RouteFilterPrefixes[i] = new RouteFilterPrefix(source.RouteFilterPrefixes[i]);
            }
        }
        if (source.Vlan != null) {
            this.Vlan = new Long(source.Vlan);
        }
        if (source.TencentAddress != null) {
            this.TencentAddress = new String(source.TencentAddress);
        }
        if (source.CustomerAddress != null) {
            this.CustomerAddress = new String(source.CustomerAddress);
        }
        if (source.DirectConnectTunnelName != null) {
            this.DirectConnectTunnelName = new String(source.DirectConnectTunnelName);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.NetDetectId != null) {
            this.NetDetectId = new String(source.NetDetectId);
        }
        if (source.EnableBGPCommunity != null) {
            this.EnableBGPCommunity = new Boolean(source.EnableBGPCommunity);
        }
        if (source.NatType != null) {
            this.NatType = new Long(source.NatType);
        }
        if (source.VpcRegion != null) {
            this.VpcRegion = new String(source.VpcRegion);
        }
        if (source.BfdEnable != null) {
            this.BfdEnable = new Long(source.BfdEnable);
        }
        if (source.AccessPointType != null) {
            this.AccessPointType = new String(source.AccessPointType);
        }
        if (source.DirectConnectGatewayName != null) {
            this.DirectConnectGatewayName = new String(source.DirectConnectGatewayName);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.TencentBackupAddress != null) {
            this.TencentBackupAddress = new String(source.TencentBackupAddress);
        }
        if (source.SignLaw != null) {
            this.SignLaw = new Boolean(source.SignLaw);
        }
        if (source.CloudAttachId != null) {
            this.CloudAttachId = new String(source.CloudAttachId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectTunnelId", this.DirectConnectTunnelId);
        this.setParamSimple(map, prefix + "DirectConnectId", this.DirectConnectId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "DirectConnectOwnerAccount", this.DirectConnectOwnerAccount);
        this.setParamSimple(map, prefix + "OwnerAccount", this.OwnerAccount);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "NetworkRegion", this.NetworkRegion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "DirectConnectGatewayId", this.DirectConnectGatewayId);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamObj(map, prefix + "BgpPeer.", this.BgpPeer);
        this.setParamArrayObj(map, prefix + "RouteFilterPrefixes.", this.RouteFilterPrefixes);
        this.setParamSimple(map, prefix + "Vlan", this.Vlan);
        this.setParamSimple(map, prefix + "TencentAddress", this.TencentAddress);
        this.setParamSimple(map, prefix + "CustomerAddress", this.CustomerAddress);
        this.setParamSimple(map, prefix + "DirectConnectTunnelName", this.DirectConnectTunnelName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "NetDetectId", this.NetDetectId);
        this.setParamSimple(map, prefix + "EnableBGPCommunity", this.EnableBGPCommunity);
        this.setParamSimple(map, prefix + "NatType", this.NatType);
        this.setParamSimple(map, prefix + "VpcRegion", this.VpcRegion);
        this.setParamSimple(map, prefix + "BfdEnable", this.BfdEnable);
        this.setParamSimple(map, prefix + "AccessPointType", this.AccessPointType);
        this.setParamSimple(map, prefix + "DirectConnectGatewayName", this.DirectConnectGatewayName);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "TencentBackupAddress", this.TencentBackupAddress);
        this.setParamSimple(map, prefix + "SignLaw", this.SignLaw);
        this.setParamSimple(map, prefix + "CloudAttachId", this.CloudAttachId);

    }
}

