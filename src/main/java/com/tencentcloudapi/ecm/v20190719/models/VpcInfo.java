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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpcInfo extends AbstractModel{

    /**
    * VPC name.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * VPC instance ID, such as `vpc-azd4dt1c`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * IPv4 CIDR block of the VPC.
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * Whether it is the default VPC.
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * Whether to enable multicast.
    */
    @SerializedName("EnableMulticast")
    @Expose
    private Boolean EnableMulticast;

    /**
    * Creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * List of DNS servers.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DnsServerSet")
    @Expose
    private String [] DnsServerSet;

    /**
    * DHCP domain option value.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * DHCP option set ID.
    */
    @SerializedName("DhcpOptionsId")
    @Expose
    private String DhcpOptionsId;

    /**
    * Whether to enable DHCP.
    */
    @SerializedName("EnableDhcp")
    @Expose
    private Boolean EnableDhcp;

    /**
    * IPv6 CIDR block of the VPC.
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * Tag key-value pair
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * Secondary CIDR block
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssistantCidrSet")
    @Expose
    private AssistantCidr [] AssistantCidrSet;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Region name
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Number of included subnets
    */
    @SerializedName("SubnetCount")
    @Expose
    private Long SubnetCount;

    /**
    * Number of included instances
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
     * Get VPC name. 
     * @return VpcName VPC name.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name.
     * @param VpcName VPC name.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get VPC instance ID, such as `vpc-azd4dt1c`. 
     * @return VpcId VPC instance ID, such as `vpc-azd4dt1c`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID, such as `vpc-azd4dt1c`.
     * @param VpcId VPC instance ID, such as `vpc-azd4dt1c`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get IPv4 CIDR block of the VPC. 
     * @return CidrBlock IPv4 CIDR block of the VPC.
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set IPv4 CIDR block of the VPC.
     * @param CidrBlock IPv4 CIDR block of the VPC.
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get Whether it is the default VPC. 
     * @return IsDefault Whether it is the default VPC.
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default VPC.
     * @param IsDefault Whether it is the default VPC.
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Whether to enable multicast. 
     * @return EnableMulticast Whether to enable multicast.
     */
    public Boolean getEnableMulticast() {
        return this.EnableMulticast;
    }

    /**
     * Set Whether to enable multicast.
     * @param EnableMulticast Whether to enable multicast.
     */
    public void setEnableMulticast(Boolean EnableMulticast) {
        this.EnableMulticast = EnableMulticast;
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
     * Get List of DNS servers.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DnsServerSet List of DNS servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getDnsServerSet() {
        return this.DnsServerSet;
    }

    /**
     * Set List of DNS servers.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DnsServerSet List of DNS servers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDnsServerSet(String [] DnsServerSet) {
        this.DnsServerSet = DnsServerSet;
    }

    /**
     * Get DHCP domain option value. 
     * @return DomainName DHCP domain option value.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set DHCP domain option value.
     * @param DomainName DHCP domain option value.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get DHCP option set ID. 
     * @return DhcpOptionsId DHCP option set ID.
     */
    public String getDhcpOptionsId() {
        return this.DhcpOptionsId;
    }

    /**
     * Set DHCP option set ID.
     * @param DhcpOptionsId DHCP option set ID.
     */
    public void setDhcpOptionsId(String DhcpOptionsId) {
        this.DhcpOptionsId = DhcpOptionsId;
    }

    /**
     * Get Whether to enable DHCP. 
     * @return EnableDhcp Whether to enable DHCP.
     */
    public Boolean getEnableDhcp() {
        return this.EnableDhcp;
    }

    /**
     * Set Whether to enable DHCP.
     * @param EnableDhcp Whether to enable DHCP.
     */
    public void setEnableDhcp(Boolean EnableDhcp) {
        this.EnableDhcp = EnableDhcp;
    }

    /**
     * Get IPv6 CIDR block of the VPC. 
     * @return Ipv6CidrBlock IPv6 CIDR block of the VPC.
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set IPv6 CIDR block of the VPC.
     * @param Ipv6CidrBlock IPv6 CIDR block of the VPC.
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get Tag key-value pair
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TagSet Tag key-value pair
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag key-value pair
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TagSet Tag key-value pair
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get Secondary CIDR block
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AssistantCidrSet Secondary CIDR block
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AssistantCidr [] getAssistantCidrSet() {
        return this.AssistantCidrSet;
    }

    /**
     * Set Secondary CIDR block
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AssistantCidrSet Secondary CIDR block
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAssistantCidrSet(AssistantCidr [] AssistantCidrSet) {
        this.AssistantCidrSet = AssistantCidrSet;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Region name 
     * @return RegionName Region name
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name
     * @param RegionName Region name
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Number of included subnets 
     * @return SubnetCount Number of included subnets
     */
    public Long getSubnetCount() {
        return this.SubnetCount;
    }

    /**
     * Set Number of included subnets
     * @param SubnetCount Number of included subnets
     */
    public void setSubnetCount(Long SubnetCount) {
        this.SubnetCount = SubnetCount;
    }

    /**
     * Get Number of included instances 
     * @return InstanceCount Number of included instances
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of included instances
     * @param InstanceCount Number of included instances
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    public VpcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpcInfo(VpcInfo source) {
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.EnableMulticast != null) {
            this.EnableMulticast = new Boolean(source.EnableMulticast);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.DnsServerSet != null) {
            this.DnsServerSet = new String[source.DnsServerSet.length];
            for (int i = 0; i < source.DnsServerSet.length; i++) {
                this.DnsServerSet[i] = new String(source.DnsServerSet[i]);
            }
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.DhcpOptionsId != null) {
            this.DhcpOptionsId = new String(source.DhcpOptionsId);
        }
        if (source.EnableDhcp != null) {
            this.EnableDhcp = new Boolean(source.EnableDhcp);
        }
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.AssistantCidrSet != null) {
            this.AssistantCidrSet = new AssistantCidr[source.AssistantCidrSet.length];
            for (int i = 0; i < source.AssistantCidrSet.length; i++) {
                this.AssistantCidrSet[i] = new AssistantCidr(source.AssistantCidrSet[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.SubnetCount != null) {
            this.SubnetCount = new Long(source.SubnetCount);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "EnableMulticast", this.EnableMulticast);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArraySimple(map, prefix + "DnsServerSet.", this.DnsServerSet);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "DhcpOptionsId", this.DhcpOptionsId);
        this.setParamSimple(map, prefix + "EnableDhcp", this.EnableDhcp);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArrayObj(map, prefix + "AssistantCidrSet.", this.AssistantCidrSet);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "SubnetCount", this.SubnetCount);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);

    }
}

