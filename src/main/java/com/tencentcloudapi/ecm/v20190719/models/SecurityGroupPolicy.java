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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupPolicy extends AbstractModel {

    /**
    * Security group policy index number
    */
    @SerializedName("PolicyIndex")
    @Expose
    private Long PolicyIndex;

    /**
    * Protocol. Valid values: TCP, UDP, ICMP.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Port. Valid values: all, discrete port, range.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Protocol port ID or protocol port group ID. `ServiceTemplate` and `Protocol+Port` are mutually exclusive.
    */
    @SerializedName("ServiceTemplate")
    @Expose
    private ServiceTemplateSpecification ServiceTemplate;

    /**
    * IP range or IP address (mutually exclusive).
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * Security group instance ID, such as `esg-ohuuioma`.
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
    * `ACCEPT` or `DROP`.
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
    * Modification time, such as `2020-07-22 19:27:23`
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * IP range or IPv6 address (mutually exclusive).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
     * Get Security group policy index number 
     * @return PolicyIndex Security group policy index number
     */
    public Long getPolicyIndex() {
        return this.PolicyIndex;
    }

    /**
     * Set Security group policy index number
     * @param PolicyIndex Security group policy index number
     */
    public void setPolicyIndex(Long PolicyIndex) {
        this.PolicyIndex = PolicyIndex;
    }

    /**
     * Get Protocol. Valid values: TCP, UDP, ICMP. 
     * @return Protocol Protocol. Valid values: TCP, UDP, ICMP.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. Valid values: TCP, UDP, ICMP.
     * @param Protocol Protocol. Valid values: TCP, UDP, ICMP.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Port. Valid values: all, discrete port, range. 
     * @return Port Port. Valid values: all, discrete port, range.
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port. Valid values: all, discrete port, range.
     * @param Port Port. Valid values: all, discrete port, range.
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Protocol port ID or protocol port group ID. `ServiceTemplate` and `Protocol+Port` are mutually exclusive. 
     * @return ServiceTemplate Protocol port ID or protocol port group ID. `ServiceTemplate` and `Protocol+Port` are mutually exclusive.
     */
    public ServiceTemplateSpecification getServiceTemplate() {
        return this.ServiceTemplate;
    }

    /**
     * Set Protocol port ID or protocol port group ID. `ServiceTemplate` and `Protocol+Port` are mutually exclusive.
     * @param ServiceTemplate Protocol port ID or protocol port group ID. `ServiceTemplate` and `Protocol+Port` are mutually exclusive.
     */
    public void setServiceTemplate(ServiceTemplateSpecification ServiceTemplate) {
        this.ServiceTemplate = ServiceTemplate;
    }

    /**
     * Get IP range or IP address (mutually exclusive). 
     * @return CidrBlock IP range or IP address (mutually exclusive).
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set IP range or IP address (mutually exclusive).
     * @param CidrBlock IP range or IP address (mutually exclusive).
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get Security group instance ID, such as `esg-ohuuioma`. 
     * @return SecurityGroupId Security group instance ID, such as `esg-ohuuioma`.
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group instance ID, such as `esg-ohuuioma`.
     * @param SecurityGroupId Security group instance ID, such as `esg-ohuuioma`.
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
     * Get `ACCEPT` or `DROP`. 
     * @return Action `ACCEPT` or `DROP`.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set `ACCEPT` or `DROP`.
     * @param Action `ACCEPT` or `DROP`.
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
     * Get Modification time, such as `2020-07-22 19:27:23`
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Modification time, such as `2020-07-22 19:27:23`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time, such as `2020-07-22 19:27:23`
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Modification time, such as `2020-07-22 19:27:23`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get IP range or IPv6 address (mutually exclusive).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Ipv6CidrBlock IP range or IPv6 address (mutually exclusive).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set IP range or IPv6 address (mutually exclusive).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Ipv6CidrBlock IP range or IPv6 address (mutually exclusive).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
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
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
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
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamObj(map, prefix + "AddressTemplate.", this.AddressTemplate);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "PolicyDescription", this.PolicyDescription);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);

    }
}

