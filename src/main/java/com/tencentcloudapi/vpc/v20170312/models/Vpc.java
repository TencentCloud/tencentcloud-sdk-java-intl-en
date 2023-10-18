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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Vpc extends AbstractModel {

    /**
    * `VPC` name.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * `VPC` instance `ID`, such as `vpc-azd4dt1c`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The `IPv4` `CIDR` of the `VPC`.
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * Whether it is the default `VPC`.
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * Whether multicast is enabled.
    */
    @SerializedName("EnableMulticast")
    @Expose
    private Boolean EnableMulticast;

    /**
    * Creation Time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * `DNS` list.
    */
    @SerializedName("DnsServerSet")
    @Expose
    private String [] DnsServerSet;

    /**
    * DHCP domain name option value.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * `DHCP` option set `ID`.
    */
    @SerializedName("DhcpOptionsId")
    @Expose
    private String DhcpOptionsId;

    /**
    * Whether `DHCP` is enabled.
    */
    @SerializedName("EnableDhcp")
    @Expose
    private Boolean EnableDhcp;

    /**
    * The `IPv6` `CIDR` of the `VPC`.
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * Tag key-value pair
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * The secondary CIDR block.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssistantCidrSet")
    @Expose
    private AssistantCidr [] AssistantCidrSet;

    /**
     * Get `VPC` name. 
     * @return VpcName `VPC` name.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set `VPC` name.
     * @param VpcName `VPC` name.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get `VPC` instance `ID`, such as `vpc-azd4dt1c`. 
     * @return VpcId `VPC` instance `ID`, such as `vpc-azd4dt1c`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `VPC` instance `ID`, such as `vpc-azd4dt1c`.
     * @param VpcId `VPC` instance `ID`, such as `vpc-azd4dt1c`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The `IPv4` `CIDR` of the `VPC`. 
     * @return CidrBlock The `IPv4` `CIDR` of the `VPC`.
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set The `IPv4` `CIDR` of the `VPC`.
     * @param CidrBlock The `IPv4` `CIDR` of the `VPC`.
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get Whether it is the default `VPC`. 
     * @return IsDefault Whether it is the default `VPC`.
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default `VPC`.
     * @param IsDefault Whether it is the default `VPC`.
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Whether multicast is enabled. 
     * @return EnableMulticast Whether multicast is enabled.
     */
    public Boolean getEnableMulticast() {
        return this.EnableMulticast;
    }

    /**
     * Set Whether multicast is enabled.
     * @param EnableMulticast Whether multicast is enabled.
     */
    public void setEnableMulticast(Boolean EnableMulticast) {
        this.EnableMulticast = EnableMulticast;
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
     * Get `DNS` list. 
     * @return DnsServerSet `DNS` list.
     */
    public String [] getDnsServerSet() {
        return this.DnsServerSet;
    }

    /**
     * Set `DNS` list.
     * @param DnsServerSet `DNS` list.
     */
    public void setDnsServerSet(String [] DnsServerSet) {
        this.DnsServerSet = DnsServerSet;
    }

    /**
     * Get DHCP domain name option value. 
     * @return DomainName DHCP domain name option value.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set DHCP domain name option value.
     * @param DomainName DHCP domain name option value.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get `DHCP` option set `ID`. 
     * @return DhcpOptionsId `DHCP` option set `ID`.
     */
    public String getDhcpOptionsId() {
        return this.DhcpOptionsId;
    }

    /**
     * Set `DHCP` option set `ID`.
     * @param DhcpOptionsId `DHCP` option set `ID`.
     */
    public void setDhcpOptionsId(String DhcpOptionsId) {
        this.DhcpOptionsId = DhcpOptionsId;
    }

    /**
     * Get Whether `DHCP` is enabled. 
     * @return EnableDhcp Whether `DHCP` is enabled.
     */
    public Boolean getEnableDhcp() {
        return this.EnableDhcp;
    }

    /**
     * Set Whether `DHCP` is enabled.
     * @param EnableDhcp Whether `DHCP` is enabled.
     */
    public void setEnableDhcp(Boolean EnableDhcp) {
        this.EnableDhcp = EnableDhcp;
    }

    /**
     * Get The `IPv6` `CIDR` of the `VPC`. 
     * @return Ipv6CidrBlock The `IPv6` `CIDR` of the `VPC`.
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set The `IPv6` `CIDR` of the `VPC`.
     * @param Ipv6CidrBlock The `IPv6` `CIDR` of the `VPC`.
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get Tag key-value pair 
     * @return TagSet Tag key-value pair
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag key-value pair
     * @param TagSet Tag key-value pair
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get The secondary CIDR block.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AssistantCidrSet The secondary CIDR block.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AssistantCidr [] getAssistantCidrSet() {
        return this.AssistantCidrSet;
    }

    /**
     * Set The secondary CIDR block.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AssistantCidrSet The secondary CIDR block.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAssistantCidrSet(AssistantCidr [] AssistantCidrSet) {
        this.AssistantCidrSet = AssistantCidrSet;
    }

    public Vpc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Vpc(Vpc source) {
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

    }
}

