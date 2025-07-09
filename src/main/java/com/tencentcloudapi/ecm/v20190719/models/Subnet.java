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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Subnet extends AbstractModel {

    /**
    * VPC instance ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet instance ID, such as `subnet-bthucmmy`.
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
    * IPv4 CIDR block of the subnet.
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
    * Route table instance ID, such as `rtb-l2h8d7c2`.
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * Creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Number of available IPs.
    */
    @SerializedName("AvailableIpAddressCount")
    @Expose
    private Long AvailableIpAddressCount;

    /**
    * IPv6 CIDR block of the subnet.
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * Associated ACLID
    */
    @SerializedName("NetworkAclId")
    @Expose
    private String NetworkAclId;

    /**
    * Whether it is an SNAT address pool subnet.
    */
    @SerializedName("IsRemoteVpcSnat")
    @Expose
    private Boolean IsRemoteVpcSnat;

    /**
    * Tag key-value pairs.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * Region
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * AZ name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Number of instances
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * IPv4 CIDR block of the VPC.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * IPv6 CIDR block of the VPC.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcIpv6CidrBlock")
    @Expose
    private String VpcIpv6CidrBlock;

    /**
    * Region
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

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
     * Get Subnet instance ID, such as `subnet-bthucmmy`. 
     * @return SubnetId Subnet instance ID, such as `subnet-bthucmmy`.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet instance ID, such as `subnet-bthucmmy`.
     * @param SubnetId Subnet instance ID, such as `subnet-bthucmmy`.
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
     * Get IPv4 CIDR block of the subnet. 
     * @return CidrBlock IPv4 CIDR block of the subnet.
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set IPv4 CIDR block of the subnet.
     * @param CidrBlock IPv4 CIDR block of the subnet.
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
     * Get Route table instance ID, such as `rtb-l2h8d7c2`. 
     * @return RouteTableId Route table instance ID, such as `rtb-l2h8d7c2`.
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set Route table instance ID, such as `rtb-l2h8d7c2`.
     * @param RouteTableId Route table instance ID, such as `rtb-l2h8d7c2`.
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get Creation time. 
     * @return CreatedTime Creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time.
     * @param CreatedTime Creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Number of available IPs. 
     * @return AvailableIpAddressCount Number of available IPs.
     */
    public Long getAvailableIpAddressCount() {
        return this.AvailableIpAddressCount;
    }

    /**
     * Set Number of available IPs.
     * @param AvailableIpAddressCount Number of available IPs.
     */
    public void setAvailableIpAddressCount(Long AvailableIpAddressCount) {
        this.AvailableIpAddressCount = AvailableIpAddressCount;
    }

    /**
     * Get IPv6 CIDR block of the subnet. 
     * @return Ipv6CidrBlock IPv6 CIDR block of the subnet.
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set IPv6 CIDR block of the subnet.
     * @param Ipv6CidrBlock IPv6 CIDR block of the subnet.
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get Associated ACLID 
     * @return NetworkAclId Associated ACLID
     */
    public String getNetworkAclId() {
        return this.NetworkAclId;
    }

    /**
     * Set Associated ACLID
     * @param NetworkAclId Associated ACLID
     */
    public void setNetworkAclId(String NetworkAclId) {
        this.NetworkAclId = NetworkAclId;
    }

    /**
     * Get Whether it is an SNAT address pool subnet. 
     * @return IsRemoteVpcSnat Whether it is an SNAT address pool subnet.
     */
    public Boolean getIsRemoteVpcSnat() {
        return this.IsRemoteVpcSnat;
    }

    /**
     * Set Whether it is an SNAT address pool subnet.
     * @param IsRemoteVpcSnat Whether it is an SNAT address pool subnet.
     */
    public void setIsRemoteVpcSnat(Boolean IsRemoteVpcSnat) {
        this.IsRemoteVpcSnat = IsRemoteVpcSnat;
    }

    /**
     * Get Tag key-value pairs.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TagSet Tag key-value pairs.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag key-value pairs.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TagSet Tag key-value pairs.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Region 
     * @return Zone Region
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region
     * @param Zone Region
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get AZ name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ZoneName AZ name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set AZ name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ZoneName AZ name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Number of instances
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InstanceCount Number of instances
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of instances
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InstanceCount Number of instances
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get IPv4 CIDR block of the VPC.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VpcCidrBlock IPv4 CIDR block of the VPC.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set IPv4 CIDR block of the VPC.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VpcCidrBlock IPv4 CIDR block of the VPC.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get IPv6 CIDR block of the VPC.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return VpcIpv6CidrBlock IPv6 CIDR block of the VPC.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcIpv6CidrBlock() {
        return this.VpcIpv6CidrBlock;
    }

    /**
     * Set IPv6 CIDR block of the VPC.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param VpcIpv6CidrBlock IPv6 CIDR block of the VPC.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcIpv6CidrBlock(String VpcIpv6CidrBlock) {
        this.VpcIpv6CidrBlock = VpcIpv6CidrBlock;
    }

    /**
     * Get Region
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Region Region
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Region Region
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public Subnet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Subnet(Subnet source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.EnableBroadcast != null) {
            this.EnableBroadcast = new Boolean(source.EnableBroadcast);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.AvailableIpAddressCount != null) {
            this.AvailableIpAddressCount = new Long(source.AvailableIpAddressCount);
        }
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
        }
        if (source.NetworkAclId != null) {
            this.NetworkAclId = new String(source.NetworkAclId);
        }
        if (source.IsRemoteVpcSnat != null) {
            this.IsRemoteVpcSnat = new Boolean(source.IsRemoteVpcSnat);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new String(source.VpcCidrBlock);
        }
        if (source.VpcIpv6CidrBlock != null) {
            this.VpcIpv6CidrBlock = new String(source.VpcIpv6CidrBlock);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
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
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "AvailableIpAddressCount", this.AvailableIpAddressCount);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamSimple(map, prefix + "NetworkAclId", this.NetworkAclId);
        this.setParamSimple(map, prefix + "IsRemoteVpcSnat", this.IsRemoteVpcSnat);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "VpcIpv6CidrBlock", this.VpcIpv6CidrBlock);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

