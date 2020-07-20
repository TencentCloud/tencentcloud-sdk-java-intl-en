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

public class Subnet extends AbstractModel{

    /**
    * The `ID` of the `VPC` instance.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet instance `ID`, such as `subnet-bthucmmy`.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Subnet name.
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * The `IPv4` `CIDR` of the subnet.
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * Whether it is the default subnet.
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * Whether to enable broadcast.
    */
    @SerializedName("EnableBroadcast")
    @Expose
    private Boolean EnableBroadcast;

    /**
    * Availability Zone.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * The route table instance ID, such as `rtb-l2h8d7c2`.
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * Creation Time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * The number of available IPv4 addresses
    */
    @SerializedName("AvailableIpAddressCount")
    @Expose
    private Long AvailableIpAddressCount;

    /**
    * The `IPv6` `CIDR` of the subnet.
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * The associated `ACL`ID
    */
    @SerializedName("NetworkAclId")
    @Expose
    private String NetworkAclId;

    /**
    * Whether it is a `SNAT` address pool subnet.
    */
    @SerializedName("IsRemoteVpcSnat")
    @Expose
    private Boolean IsRemoteVpcSnat;

    /**
    * The total number of IPv4 addresses in the subnet.
    */
    @SerializedName("TotalIpAddressCount")
    @Expose
    private Long TotalIpAddressCount;

    /**
    * Tag key-value pairs
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get The `ID` of the `VPC` instance. 
     * @return VpcId The `ID` of the `VPC` instance.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The `ID` of the `VPC` instance.
     * @param VpcId The `ID` of the `VPC` instance.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet instance `ID`, such as `subnet-bthucmmy`. 
     * @return SubnetId Subnet instance `ID`, such as `subnet-bthucmmy`.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet instance `ID`, such as `subnet-bthucmmy`.
     * @param SubnetId Subnet instance `ID`, such as `subnet-bthucmmy`.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Subnet name. 
     * @return SubnetName Subnet name.
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set Subnet name.
     * @param SubnetName Subnet name.
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get The `IPv4` `CIDR` of the subnet. 
     * @return CidrBlock The `IPv4` `CIDR` of the subnet.
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set The `IPv4` `CIDR` of the subnet.
     * @param CidrBlock The `IPv4` `CIDR` of the subnet.
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get Whether it is the default subnet. 
     * @return IsDefault Whether it is the default subnet.
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default subnet.
     * @param IsDefault Whether it is the default subnet.
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Whether to enable broadcast. 
     * @return EnableBroadcast Whether to enable broadcast.
     */
    public Boolean getEnableBroadcast() {
        return this.EnableBroadcast;
    }

    /**
     * Set Whether to enable broadcast.
     * @param EnableBroadcast Whether to enable broadcast.
     */
    public void setEnableBroadcast(Boolean EnableBroadcast) {
        this.EnableBroadcast = EnableBroadcast;
    }

    /**
     * Get Availability Zone. 
     * @return Zone Availability Zone.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability Zone.
     * @param Zone Availability Zone.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get The route table instance ID, such as `rtb-l2h8d7c2`. 
     * @return RouteTableId The route table instance ID, such as `rtb-l2h8d7c2`.
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set The route table instance ID, such as `rtb-l2h8d7c2`.
     * @param RouteTableId The route table instance ID, such as `rtb-l2h8d7c2`.
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get Creation Time. 
     * @return CreatedTime Creation Time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation Time.
     * @param CreatedTime Creation Time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get The number of available IPv4 addresses 
     * @return AvailableIpAddressCount The number of available IPv4 addresses
     */
    public Long getAvailableIpAddressCount() {
        return this.AvailableIpAddressCount;
    }

    /**
     * Set The number of available IPv4 addresses
     * @param AvailableIpAddressCount The number of available IPv4 addresses
     */
    public void setAvailableIpAddressCount(Long AvailableIpAddressCount) {
        this.AvailableIpAddressCount = AvailableIpAddressCount;
    }

    /**
     * Get The `IPv6` `CIDR` of the subnet. 
     * @return Ipv6CidrBlock The `IPv6` `CIDR` of the subnet.
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set The `IPv6` `CIDR` of the subnet.
     * @param Ipv6CidrBlock The `IPv6` `CIDR` of the subnet.
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get The associated `ACL`ID 
     * @return NetworkAclId The associated `ACL`ID
     */
    public String getNetworkAclId() {
        return this.NetworkAclId;
    }

    /**
     * Set The associated `ACL`ID
     * @param NetworkAclId The associated `ACL`ID
     */
    public void setNetworkAclId(String NetworkAclId) {
        this.NetworkAclId = NetworkAclId;
    }

    /**
     * Get Whether it is a `SNAT` address pool subnet. 
     * @return IsRemoteVpcSnat Whether it is a `SNAT` address pool subnet.
     */
    public Boolean getIsRemoteVpcSnat() {
        return this.IsRemoteVpcSnat;
    }

    /**
     * Set Whether it is a `SNAT` address pool subnet.
     * @param IsRemoteVpcSnat Whether it is a `SNAT` address pool subnet.
     */
    public void setIsRemoteVpcSnat(Boolean IsRemoteVpcSnat) {
        this.IsRemoteVpcSnat = IsRemoteVpcSnat;
    }

    /**
     * Get The total number of IPv4 addresses in the subnet. 
     * @return TotalIpAddressCount The total number of IPv4 addresses in the subnet.
     */
    public Long getTotalIpAddressCount() {
        return this.TotalIpAddressCount;
    }

    /**
     * Set The total number of IPv4 addresses in the subnet.
     * @param TotalIpAddressCount The total number of IPv4 addresses in the subnet.
     */
    public void setTotalIpAddressCount(Long TotalIpAddressCount) {
        this.TotalIpAddressCount = TotalIpAddressCount;
    }

    /**
     * Get Tag key-value pairs 
     * @return TagSet Tag key-value pairs
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag key-value pairs
     * @param TagSet Tag key-value pairs
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "EnableBroadcast", this.EnableBroadcast);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "AvailableIpAddressCount", this.AvailableIpAddressCount);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamSimple(map, prefix + "NetworkAclId", this.NetworkAclId);
        this.setParamSimple(map, prefix + "IsRemoteVpcSnat", this.IsRemoteVpcSnat);
        this.setParamSimple(map, prefix + "TotalIpAddressCount", this.TotalIpAddressCount);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

