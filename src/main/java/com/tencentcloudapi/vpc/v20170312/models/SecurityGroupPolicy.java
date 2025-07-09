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

public class SecurityGroupPolicy extends AbstractModel {

    /**
    * The index number of security group rules, which dynamically changes with the rules. This parameter can be obtained via the `DescribeSecurityGroupPolicies` API and used with the `Version` field in the returned value of the API.
    */
    @SerializedName("PolicyIndex")
    @Expose
    private Long PolicyIndex;

    /**
    * Protocol. Valid values: TCP, UDP, ICMP, ICMPv6, ALL.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Port (`all`, a single port, or a port range).
Note: If the `Protocol` value is set to `ALL`, the `Port` value also needs to be set to `all`.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Protocol port ID or protocol port group ID. ServiceTemplate and Protocol+Port are mutually exclusive.
    */
    @SerializedName("ServiceTemplate")
    @Expose
    private ServiceTemplateSpecification ServiceTemplate;

    /**
    * Either `CidrBlock` or `Ipv6CidrBlock can be specified. Note that if `0.0.0.0/n` is entered, it is mapped to 0.0.0.0/0.
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * The CIDR block or IPv6 (mutually exclusive).
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * The security group instance ID, such as `sg-ohuuioma`.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * IP address ID or IP address group ID.
    */
    @SerializedName("AddressTemplate")
    @Expose
    private AddressTemplateSpecification AddressTemplate;

    /**
    * ACCEPT or DROP.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Security group policy description.
    */
    @SerializedName("PolicyDescription")
    @Expose
    private String PolicyDescription;

    /**
    * The last modification time of the security group.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get The index number of security group rules, which dynamically changes with the rules. This parameter can be obtained via the `DescribeSecurityGroupPolicies` API and used with the `Version` field in the returned value of the API. 
     * @return PolicyIndex The index number of security group rules, which dynamically changes with the rules. This parameter can be obtained via the `DescribeSecurityGroupPolicies` API and used with the `Version` field in the returned value of the API.
     */
    public Long getPolicyIndex() {
        return this.PolicyIndex;
    }

    /**
     * Set The index number of security group rules, which dynamically changes with the rules. This parameter can be obtained via the `DescribeSecurityGroupPolicies` API and used with the `Version` field in the returned value of the API.
     * @param PolicyIndex The index number of security group rules, which dynamically changes with the rules. This parameter can be obtained via the `DescribeSecurityGroupPolicies` API and used with the `Version` field in the returned value of the API.
     */
    public void setPolicyIndex(Long PolicyIndex) {
        this.PolicyIndex = PolicyIndex;
    }

    /**
     * Get Protocol. Valid values: TCP, UDP, ICMP, ICMPv6, ALL. 
     * @return Protocol Protocol. Valid values: TCP, UDP, ICMP, ICMPv6, ALL.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. Valid values: TCP, UDP, ICMP, ICMPv6, ALL.
     * @param Protocol Protocol. Valid values: TCP, UDP, ICMP, ICMPv6, ALL.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Port (`all`, a single port, or a port range).
Note: If the `Protocol` value is set to `ALL`, the `Port` value also needs to be set to `all`. 
     * @return Port Port (`all`, a single port, or a port range).
Note: If the `Protocol` value is set to `ALL`, the `Port` value also needs to be set to `all`.
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port (`all`, a single port, or a port range).
Note: If the `Protocol` value is set to `ALL`, the `Port` value also needs to be set to `all`.
     * @param Port Port (`all`, a single port, or a port range).
Note: If the `Protocol` value is set to `ALL`, the `Port` value also needs to be set to `all`.
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Protocol port ID or protocol port group ID. ServiceTemplate and Protocol+Port are mutually exclusive. 
     * @return ServiceTemplate Protocol port ID or protocol port group ID. ServiceTemplate and Protocol+Port are mutually exclusive.
     */
    public ServiceTemplateSpecification getServiceTemplate() {
        return this.ServiceTemplate;
    }

    /**
     * Set Protocol port ID or protocol port group ID. ServiceTemplate and Protocol+Port are mutually exclusive.
     * @param ServiceTemplate Protocol port ID or protocol port group ID. ServiceTemplate and Protocol+Port are mutually exclusive.
     */
    public void setServiceTemplate(ServiceTemplateSpecification ServiceTemplate) {
        this.ServiceTemplate = ServiceTemplate;
    }

    /**
     * Get Either `CidrBlock` or `Ipv6CidrBlock can be specified. Note that if `0.0.0.0/n` is entered, it is mapped to 0.0.0.0/0. 
     * @return CidrBlock Either `CidrBlock` or `Ipv6CidrBlock can be specified. Note that if `0.0.0.0/n` is entered, it is mapped to 0.0.0.0/0.
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set Either `CidrBlock` or `Ipv6CidrBlock can be specified. Note that if `0.0.0.0/n` is entered, it is mapped to 0.0.0.0/0.
     * @param CidrBlock Either `CidrBlock` or `Ipv6CidrBlock can be specified. Note that if `0.0.0.0/n` is entered, it is mapped to 0.0.0.0/0.
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get The CIDR block or IPv6 (mutually exclusive). 
     * @return Ipv6CidrBlock The CIDR block or IPv6 (mutually exclusive).
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set The CIDR block or IPv6 (mutually exclusive).
     * @param Ipv6CidrBlock The CIDR block or IPv6 (mutually exclusive).
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get The security group instance ID, such as `sg-ohuuioma`. 
     * @return SecurityGroupId The security group instance ID, such as `sg-ohuuioma`.
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set The security group instance ID, such as `sg-ohuuioma`.
     * @param SecurityGroupId The security group instance ID, such as `sg-ohuuioma`.
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get IP address ID or IP address group ID. 
     * @return AddressTemplate IP address ID or IP address group ID.
     */
    public AddressTemplateSpecification getAddressTemplate() {
        return this.AddressTemplate;
    }

    /**
     * Set IP address ID or IP address group ID.
     * @param AddressTemplate IP address ID or IP address group ID.
     */
    public void setAddressTemplate(AddressTemplateSpecification AddressTemplate) {
        this.AddressTemplate = AddressTemplate;
    }

    /**
     * Get ACCEPT or DROP. 
     * @return Action ACCEPT or DROP.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set ACCEPT or DROP.
     * @param Action ACCEPT or DROP.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Security group policy description. 
     * @return PolicyDescription Security group policy description.
     */
    public String getPolicyDescription() {
        return this.PolicyDescription;
    }

    /**
     * Set Security group policy description.
     * @param PolicyDescription Security group policy description.
     */
    public void setPolicyDescription(String PolicyDescription) {
        this.PolicyDescription = PolicyDescription;
    }

    /**
     * Get The last modification time of the security group. 
     * @return ModifyTime The last modification time of the security group.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set The last modification time of the security group.
     * @param ModifyTime The last modification time of the security group.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public SecurityGroupPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupPolicy(SecurityGroupPolicy source) {
        if (source.PolicyIndex != null) {
            this.PolicyIndex = new Long(source.PolicyIndex);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.ServiceTemplate != null) {
            this.ServiceTemplate = new ServiceTemplateSpecification(source.ServiceTemplate);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.AddressTemplate != null) {
            this.AddressTemplate = new AddressTemplateSpecification(source.AddressTemplate);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.PolicyDescription != null) {
            this.PolicyDescription = new String(source.PolicyDescription);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyIndex", this.PolicyIndex);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamObj(map, prefix + "ServiceTemplate.", this.ServiceTemplate);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamObj(map, prefix + "AddressTemplate.", this.AddressTemplate);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "PolicyDescription", this.PolicyDescription);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

