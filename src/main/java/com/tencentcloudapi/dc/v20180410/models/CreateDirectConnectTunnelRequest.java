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

public class CreateDirectConnectTunnelRequest extends AbstractModel{

    /**
    * Direct Connect ID, such as `dc-kd7d06of`.
    */
    @SerializedName("DirectConnectId")
    @Expose
    private String DirectConnectId;

    /**
    * Dedicated tunnel name.
    */
    @SerializedName("DirectConnectTunnelName")
    @Expose
    private String DirectConnectTunnelName;

    /**
    * Connection owner, who is the current customer by default.
The developer account ID should be entered for shared connections.
    */
    @SerializedName("DirectConnectOwnerAccount")
    @Expose
    private String DirectConnectOwnerAccount;

    /**
    * Network type. Valid values: VPC, BMVPC, CCN. Default value: VPC.
VPC: Virtual Private Cloud.
BMVPC: BM VPC.
CCN: Cloud Connect Network.
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * Network region.
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
    * Direct connect gateway ID, such as `dcg-d545ddf`.
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
    * Direct Connect bandwidth in Mbps.
Default value: connection bandwidth value.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * BGP: BGP routing.
STATIC: Static routing.
Default value: BGP routing.
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
    * BgpPeer, which is BGP information on the user side and includes Asn and AuthKey.
    */
    @SerializedName("BgpPeer")
    @Expose
    private BgpPeer BgpPeer;

    /**
    * Static routing, i.e., IP range of the user's IDC.
    */
    @SerializedName("RouteFilterPrefixes")
    @Expose
    private RouteFilterPrefix [] RouteFilterPrefixes;

    /**
    * VLAN. Value range: 0-3,000.
0: sub-interface not enabled.
Default value: Non-zero.
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
    * TencentBackupAddress, i.e., Tencent-side standby IP address
    */
    @SerializedName("TencentBackupAddress")
    @Expose
    private String TencentBackupAddress;

    /**
    * Cloud Attached Connection Service ID
    */
    @SerializedName("CloudAttachId")
    @Expose
    private String CloudAttachId;

    /**
     * Get Direct Connect ID, such as `dc-kd7d06of`. 
     * @return DirectConnectId Direct Connect ID, such as `dc-kd7d06of`.
     */
    public String getDirectConnectId() {
        return this.DirectConnectId;
    }

    /**
     * Set Direct Connect ID, such as `dc-kd7d06of`.
     * @param DirectConnectId Direct Connect ID, such as `dc-kd7d06of`.
     */
    public void setDirectConnectId(String DirectConnectId) {
        this.DirectConnectId = DirectConnectId;
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
     * Get Connection owner, who is the current customer by default.
The developer account ID should be entered for shared connections. 
     * @return DirectConnectOwnerAccount Connection owner, who is the current customer by default.
The developer account ID should be entered for shared connections.
     */
    public String getDirectConnectOwnerAccount() {
        return this.DirectConnectOwnerAccount;
    }

    /**
     * Set Connection owner, who is the current customer by default.
The developer account ID should be entered for shared connections.
     * @param DirectConnectOwnerAccount Connection owner, who is the current customer by default.
The developer account ID should be entered for shared connections.
     */
    public void setDirectConnectOwnerAccount(String DirectConnectOwnerAccount) {
        this.DirectConnectOwnerAccount = DirectConnectOwnerAccount;
    }

    /**
     * Get Network type. Valid values: VPC, BMVPC, CCN. Default value: VPC.
VPC: Virtual Private Cloud.
BMVPC: BM VPC.
CCN: Cloud Connect Network. 
     * @return NetworkType Network type. Valid values: VPC, BMVPC, CCN. Default value: VPC.
VPC: Virtual Private Cloud.
BMVPC: BM VPC.
CCN: Cloud Connect Network.
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set Network type. Valid values: VPC, BMVPC, CCN. Default value: VPC.
VPC: Virtual Private Cloud.
BMVPC: BM VPC.
CCN: Cloud Connect Network.
     * @param NetworkType Network type. Valid values: VPC, BMVPC, CCN. Default value: VPC.
VPC: Virtual Private Cloud.
BMVPC: BM VPC.
CCN: Cloud Connect Network.
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get Network region. 
     * @return NetworkRegion Network region.
     */
    public String getNetworkRegion() {
        return this.NetworkRegion;
    }

    /**
     * Set Network region.
     * @param NetworkRegion Network region.
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
     * Get Direct connect gateway ID, such as `dcg-d545ddf`. 
     * @return DirectConnectGatewayId Direct connect gateway ID, such as `dcg-d545ddf`.
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * Set Direct connect gateway ID, such as `dcg-d545ddf`.
     * @param DirectConnectGatewayId Direct connect gateway ID, such as `dcg-d545ddf`.
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * Get Direct Connect bandwidth in Mbps.
Default value: connection bandwidth value. 
     * @return Bandwidth Direct Connect bandwidth in Mbps.
Default value: connection bandwidth value.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Direct Connect bandwidth in Mbps.
Default value: connection bandwidth value.
     * @param Bandwidth Direct Connect bandwidth in Mbps.
Default value: connection bandwidth value.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get BGP: BGP routing.
STATIC: Static routing.
Default value: BGP routing. 
     * @return RouteType BGP: BGP routing.
STATIC: Static routing.
Default value: BGP routing.
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * Set BGP: BGP routing.
STATIC: Static routing.
Default value: BGP routing.
     * @param RouteType BGP: BGP routing.
STATIC: Static routing.
Default value: BGP routing.
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Get BgpPeer, which is BGP information on the user side and includes Asn and AuthKey. 
     * @return BgpPeer BgpPeer, which is BGP information on the user side and includes Asn and AuthKey.
     */
    public BgpPeer getBgpPeer() {
        return this.BgpPeer;
    }

    /**
     * Set BgpPeer, which is BGP information on the user side and includes Asn and AuthKey.
     * @param BgpPeer BgpPeer, which is BGP information on the user side and includes Asn and AuthKey.
     */
    public void setBgpPeer(BgpPeer BgpPeer) {
        this.BgpPeer = BgpPeer;
    }

    /**
     * Get Static routing, i.e., IP range of the user's IDC. 
     * @return RouteFilterPrefixes Static routing, i.e., IP range of the user's IDC.
     */
    public RouteFilterPrefix [] getRouteFilterPrefixes() {
        return this.RouteFilterPrefixes;
    }

    /**
     * Set Static routing, i.e., IP range of the user's IDC.
     * @param RouteFilterPrefixes Static routing, i.e., IP range of the user's IDC.
     */
    public void setRouteFilterPrefixes(RouteFilterPrefix [] RouteFilterPrefixes) {
        this.RouteFilterPrefixes = RouteFilterPrefixes;
    }

    /**
     * Get VLAN. Value range: 0-3,000.
0: sub-interface not enabled.
Default value: Non-zero. 
     * @return Vlan VLAN. Value range: 0-3,000.
0: sub-interface not enabled.
Default value: Non-zero.
     */
    public Long getVlan() {
        return this.Vlan;
    }

    /**
     * Set VLAN. Value range: 0-3,000.
0: sub-interface not enabled.
Default value: Non-zero.
     * @param Vlan VLAN. Value range: 0-3,000.
0: sub-interface not enabled.
Default value: Non-zero.
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
     * Get TencentBackupAddress, i.e., Tencent-side standby IP address 
     * @return TencentBackupAddress TencentBackupAddress, i.e., Tencent-side standby IP address
     */
    public String getTencentBackupAddress() {
        return this.TencentBackupAddress;
    }

    /**
     * Set TencentBackupAddress, i.e., Tencent-side standby IP address
     * @param TencentBackupAddress TencentBackupAddress, i.e., Tencent-side standby IP address
     */
    public void setTencentBackupAddress(String TencentBackupAddress) {
        this.TencentBackupAddress = TencentBackupAddress;
    }

    /**
     * Get Cloud Attached Connection Service ID 
     * @return CloudAttachId Cloud Attached Connection Service ID
     */
    public String getCloudAttachId() {
        return this.CloudAttachId;
    }

    /**
     * Set Cloud Attached Connection Service ID
     * @param CloudAttachId Cloud Attached Connection Service ID
     */
    public void setCloudAttachId(String CloudAttachId) {
        this.CloudAttachId = CloudAttachId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectId", this.DirectConnectId);
        this.setParamSimple(map, prefix + "DirectConnectTunnelName", this.DirectConnectTunnelName);
        this.setParamSimple(map, prefix + "DirectConnectOwnerAccount", this.DirectConnectOwnerAccount);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "NetworkRegion", this.NetworkRegion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "DirectConnectGatewayId", this.DirectConnectGatewayId);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamObj(map, prefix + "BgpPeer.", this.BgpPeer);
        this.setParamArrayObj(map, prefix + "RouteFilterPrefixes.", this.RouteFilterPrefixes);
        this.setParamSimple(map, prefix + "Vlan", this.Vlan);
        this.setParamSimple(map, prefix + "TencentAddress", this.TencentAddress);
        this.setParamSimple(map, prefix + "CustomerAddress", this.CustomerAddress);
        this.setParamSimple(map, prefix + "TencentBackupAddress", this.TencentBackupAddress);
        this.setParamSimple(map, prefix + "CloudAttachId", this.CloudAttachId);

    }
}

