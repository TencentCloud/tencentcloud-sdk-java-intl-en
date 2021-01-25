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

public class NatGateway extends AbstractModel{

    /**
    * NAT gateway ID.
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * NAT gateway name.
    */
    @SerializedName("NatGatewayName")
    @Expose
    private String NatGatewayName;

    /**
    * NAT gateway creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * The status of the NAT gateway.
 'PENDING': Creating, 'DELETING': Deleting, 'AVAILABLE': Operating, 'UPDATING': Upgrading,
‘FAILED’: Failed.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * The maximum outbound bandwidth of the gateway. Unit: Mbps.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * The concurrent connections cap of the gateway.
    */
    @SerializedName("MaxConcurrentConnection")
    @Expose
    private Long MaxConcurrentConnection;

    /**
    * The public IP object array of the bound NAT gateway.
    */
    @SerializedName("PublicIpAddressSet")
    @Expose
    private NatGatewayAddress [] PublicIpAddressSet;

    /**
    * The NAT gateway status. `AVAILABLE`: Operating, `UNAVAILABLE`: Unavailable, `INSUFFICIENT`: Account is in arrears and the service is suspended.
    */
    @SerializedName("NetworkState")
    @Expose
    private String NetworkState;

    /**
    * The port forwarding rules of the NAT gateway.
    */
    @SerializedName("DestinationIpPortTranslationNatRuleSet")
    @Expose
    private DestinationIpPortTranslationNatRule [] DestinationIpPortTranslationNatRuleSet;

    /**
    * VPC instance ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The availability zone in which the NAT gateway is located.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * IDs of direct connect gateway associated.
    */
    @SerializedName("DirectConnectGatewayIds")
    @Expose
    private String [] DirectConnectGatewayIds;

    /**
    * Subnet ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Tag key-value pair.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * The list of the security groups bound to the NAT Gateway
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityGroupSet")
    @Expose
    private String [] SecurityGroupSet;

    /**
     * Get NAT gateway ID. 
     * @return NatGatewayId NAT gateway ID.
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set NAT gateway ID.
     * @param NatGatewayId NAT gateway ID.
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get NAT gateway name. 
     * @return NatGatewayName NAT gateway name.
     */
    public String getNatGatewayName() {
        return this.NatGatewayName;
    }

    /**
     * Set NAT gateway name.
     * @param NatGatewayName NAT gateway name.
     */
    public void setNatGatewayName(String NatGatewayName) {
        this.NatGatewayName = NatGatewayName;
    }

    /**
     * Get NAT gateway creation time. 
     * @return CreatedTime NAT gateway creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set NAT gateway creation time.
     * @param CreatedTime NAT gateway creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get The status of the NAT gateway.
 'PENDING': Creating, 'DELETING': Deleting, 'AVAILABLE': Operating, 'UPDATING': Upgrading,
‘FAILED’: Failed. 
     * @return State The status of the NAT gateway.
 'PENDING': Creating, 'DELETING': Deleting, 'AVAILABLE': Operating, 'UPDATING': Upgrading,
‘FAILED’: Failed.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set The status of the NAT gateway.
 'PENDING': Creating, 'DELETING': Deleting, 'AVAILABLE': Operating, 'UPDATING': Upgrading,
‘FAILED’: Failed.
     * @param State The status of the NAT gateway.
 'PENDING': Creating, 'DELETING': Deleting, 'AVAILABLE': Operating, 'UPDATING': Upgrading,
‘FAILED’: Failed.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get The maximum outbound bandwidth of the gateway. Unit: Mbps. 
     * @return InternetMaxBandwidthOut The maximum outbound bandwidth of the gateway. Unit: Mbps.
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set The maximum outbound bandwidth of the gateway. Unit: Mbps.
     * @param InternetMaxBandwidthOut The maximum outbound bandwidth of the gateway. Unit: Mbps.
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get The concurrent connections cap of the gateway. 
     * @return MaxConcurrentConnection The concurrent connections cap of the gateway.
     */
    public Long getMaxConcurrentConnection() {
        return this.MaxConcurrentConnection;
    }

    /**
     * Set The concurrent connections cap of the gateway.
     * @param MaxConcurrentConnection The concurrent connections cap of the gateway.
     */
    public void setMaxConcurrentConnection(Long MaxConcurrentConnection) {
        this.MaxConcurrentConnection = MaxConcurrentConnection;
    }

    /**
     * Get The public IP object array of the bound NAT gateway. 
     * @return PublicIpAddressSet The public IP object array of the bound NAT gateway.
     */
    public NatGatewayAddress [] getPublicIpAddressSet() {
        return this.PublicIpAddressSet;
    }

    /**
     * Set The public IP object array of the bound NAT gateway.
     * @param PublicIpAddressSet The public IP object array of the bound NAT gateway.
     */
    public void setPublicIpAddressSet(NatGatewayAddress [] PublicIpAddressSet) {
        this.PublicIpAddressSet = PublicIpAddressSet;
    }

    /**
     * Get The NAT gateway status. `AVAILABLE`: Operating, `UNAVAILABLE`: Unavailable, `INSUFFICIENT`: Account is in arrears and the service is suspended. 
     * @return NetworkState The NAT gateway status. `AVAILABLE`: Operating, `UNAVAILABLE`: Unavailable, `INSUFFICIENT`: Account is in arrears and the service is suspended.
     */
    public String getNetworkState() {
        return this.NetworkState;
    }

    /**
     * Set The NAT gateway status. `AVAILABLE`: Operating, `UNAVAILABLE`: Unavailable, `INSUFFICIENT`: Account is in arrears and the service is suspended.
     * @param NetworkState The NAT gateway status. `AVAILABLE`: Operating, `UNAVAILABLE`: Unavailable, `INSUFFICIENT`: Account is in arrears and the service is suspended.
     */
    public void setNetworkState(String NetworkState) {
        this.NetworkState = NetworkState;
    }

    /**
     * Get The port forwarding rules of the NAT gateway. 
     * @return DestinationIpPortTranslationNatRuleSet The port forwarding rules of the NAT gateway.
     */
    public DestinationIpPortTranslationNatRule [] getDestinationIpPortTranslationNatRuleSet() {
        return this.DestinationIpPortTranslationNatRuleSet;
    }

    /**
     * Set The port forwarding rules of the NAT gateway.
     * @param DestinationIpPortTranslationNatRuleSet The port forwarding rules of the NAT gateway.
     */
    public void setDestinationIpPortTranslationNatRuleSet(DestinationIpPortTranslationNatRule [] DestinationIpPortTranslationNatRuleSet) {
        this.DestinationIpPortTranslationNatRuleSet = DestinationIpPortTranslationNatRuleSet;
    }

    /**
     * Get VPC instance ID. 
     * @return VpcId VPC instance ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID.
     * @param VpcId VPC instance ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The availability zone in which the NAT gateway is located. 
     * @return Zone The availability zone in which the NAT gateway is located.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The availability zone in which the NAT gateway is located.
     * @param Zone The availability zone in which the NAT gateway is located.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get IDs of direct connect gateway associated. 
     * @return DirectConnectGatewayIds IDs of direct connect gateway associated.
     */
    public String [] getDirectConnectGatewayIds() {
        return this.DirectConnectGatewayIds;
    }

    /**
     * Set IDs of direct connect gateway associated.
     * @param DirectConnectGatewayIds IDs of direct connect gateway associated.
     */
    public void setDirectConnectGatewayIds(String [] DirectConnectGatewayIds) {
        this.DirectConnectGatewayIds = DirectConnectGatewayIds;
    }

    /**
     * Get Subnet ID. 
     * @return SubnetId Subnet ID.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID.
     * @param SubnetId Subnet ID.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Tag key-value pair. 
     * @return TagSet Tag key-value pair.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag key-value pair.
     * @param TagSet Tag key-value pair.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get The list of the security groups bound to the NAT Gateway
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SecurityGroupSet The list of the security groups bound to the NAT Gateway
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getSecurityGroupSet() {
        return this.SecurityGroupSet;
    }

    /**
     * Set The list of the security groups bound to the NAT Gateway
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SecurityGroupSet The list of the security groups bound to the NAT Gateway
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSecurityGroupSet(String [] SecurityGroupSet) {
        this.SecurityGroupSet = SecurityGroupSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "NatGatewayName", this.NatGatewayName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "MaxConcurrentConnection", this.MaxConcurrentConnection);
        this.setParamArrayObj(map, prefix + "PublicIpAddressSet.", this.PublicIpAddressSet);
        this.setParamSimple(map, prefix + "NetworkState", this.NetworkState);
        this.setParamArrayObj(map, prefix + "DestinationIpPortTranslationNatRuleSet.", this.DestinationIpPortTranslationNatRuleSet);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "DirectConnectGatewayIds.", this.DirectConnectGatewayIds);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArraySimple(map, prefix + "SecurityGroupSet.", this.SecurityGroupSet);

    }
}

