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

public class CreateNetworkInterfaceRequest extends AbstractModel{

    /**
    * The ID of the VPC instance. You can obtain the parameter value from the VpcId field in the returned result of DescribeVpcs API.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The name of the ENI. The maximum length is 60 characters.
    */
    @SerializedName("NetworkInterfaceName")
    @Expose
    private String NetworkInterfaceName;

    /**
    * The subnet instance ID of the ENI, such as `subnet-0ap8nwca`.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * ENI description can be named freely, but the maximum length is 60 characters.
    */
    @SerializedName("NetworkInterfaceDescription")
    @Expose
    private String NetworkInterfaceDescription;

    /**
    * The number of private IP addresses you apply for. The total number of private IP addresses cannot exceed the quota.
    */
    @SerializedName("SecondaryPrivateIpAddressCount")
    @Expose
    private Long SecondaryPrivateIpAddressCount;

    /**
    * IP u200dservice level. It is used together with `SecondaryPrivateIpAddressCount`. Values: `PT` u200d(Gold), `AU` u200d(Silver), `AG` (Bronze) and `DEFAULT` (Default).
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
    * Specifies the security group to be bound with, such as ['sg-1dd51d'].
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * The information of the specified private IPs. You can specify a maximum of 10 each time.
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private PrivateIpAddressSpecification [] PrivateIpAddresses;

    /**
    * Bound tags, such as [{"Key": "city", "Value": "shanghai"}].
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Configuration of the ENI trunking mode. Valid values: `Enable` and `Disable`. Default value: `Disable`.
    */
    @SerializedName("TrunkingFlag")
    @Expose
    private String TrunkingFlag;

    /**
     * Get The ID of the VPC instance. You can obtain the parameter value from the VpcId field in the returned result of DescribeVpcs API. 
     * @return VpcId The ID of the VPC instance. You can obtain the parameter value from the VpcId field in the returned result of DescribeVpcs API.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The ID of the VPC instance. You can obtain the parameter value from the VpcId field in the returned result of DescribeVpcs API.
     * @param VpcId The ID of the VPC instance. You can obtain the parameter value from the VpcId field in the returned result of DescribeVpcs API.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The name of the ENI. The maximum length is 60 characters. 
     * @return NetworkInterfaceName The name of the ENI. The maximum length is 60 characters.
     */
    public String getNetworkInterfaceName() {
        return this.NetworkInterfaceName;
    }

    /**
     * Set The name of the ENI. The maximum length is 60 characters.
     * @param NetworkInterfaceName The name of the ENI. The maximum length is 60 characters.
     */
    public void setNetworkInterfaceName(String NetworkInterfaceName) {
        this.NetworkInterfaceName = NetworkInterfaceName;
    }

    /**
     * Get The subnet instance ID of the ENI, such as `subnet-0ap8nwca`. 
     * @return SubnetId The subnet instance ID of the ENI, such as `subnet-0ap8nwca`.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set The subnet instance ID of the ENI, such as `subnet-0ap8nwca`.
     * @param SubnetId The subnet instance ID of the ENI, such as `subnet-0ap8nwca`.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get ENI description can be named freely, but the maximum length is 60 characters. 
     * @return NetworkInterfaceDescription ENI description can be named freely, but the maximum length is 60 characters.
     */
    public String getNetworkInterfaceDescription() {
        return this.NetworkInterfaceDescription;
    }

    /**
     * Set ENI description can be named freely, but the maximum length is 60 characters.
     * @param NetworkInterfaceDescription ENI description can be named freely, but the maximum length is 60 characters.
     */
    public void setNetworkInterfaceDescription(String NetworkInterfaceDescription) {
        this.NetworkInterfaceDescription = NetworkInterfaceDescription;
    }

    /**
     * Get The number of private IP addresses you apply for. The total number of private IP addresses cannot exceed the quota. 
     * @return SecondaryPrivateIpAddressCount The number of private IP addresses you apply for. The total number of private IP addresses cannot exceed the quota.
     */
    public Long getSecondaryPrivateIpAddressCount() {
        return this.SecondaryPrivateIpAddressCount;
    }

    /**
     * Set The number of private IP addresses you apply for. The total number of private IP addresses cannot exceed the quota.
     * @param SecondaryPrivateIpAddressCount The number of private IP addresses you apply for. The total number of private IP addresses cannot exceed the quota.
     */
    public void setSecondaryPrivateIpAddressCount(Long SecondaryPrivateIpAddressCount) {
        this.SecondaryPrivateIpAddressCount = SecondaryPrivateIpAddressCount;
    }

    /**
     * Get IP u200dservice level. It is used together with `SecondaryPrivateIpAddressCount`. Values: `PT` u200d(Gold), `AU` u200d(Silver), `AG` (Bronze) and `DEFAULT` (Default). 
     * @return QosLevel IP u200dservice level. It is used together with `SecondaryPrivateIpAddressCount`. Values: `PT` u200d(Gold), `AU` u200d(Silver), `AG` (Bronze) and `DEFAULT` (Default).
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set IP u200dservice level. It is used together with `SecondaryPrivateIpAddressCount`. Values: `PT` u200d(Gold), `AU` u200d(Silver), `AG` (Bronze) and `DEFAULT` (Default).
     * @param QosLevel IP u200dservice level. It is used together with `SecondaryPrivateIpAddressCount`. Values: `PT` u200d(Gold), `AU` u200d(Silver), `AG` (Bronze) and `DEFAULT` (Default).
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * Get Specifies the security group to be bound with, such as ['sg-1dd51d']. 
     * @return SecurityGroupIds Specifies the security group to be bound with, such as ['sg-1dd51d'].
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Specifies the security group to be bound with, such as ['sg-1dd51d'].
     * @param SecurityGroupIds Specifies the security group to be bound with, such as ['sg-1dd51d'].
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get The information of the specified private IPs. You can specify a maximum of 10 each time. 
     * @return PrivateIpAddresses The information of the specified private IPs. You can specify a maximum of 10 each time.
     */
    public PrivateIpAddressSpecification [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set The information of the specified private IPs. You can specify a maximum of 10 each time.
     * @param PrivateIpAddresses The information of the specified private IPs. You can specify a maximum of 10 each time.
     */
    public void setPrivateIpAddresses(PrivateIpAddressSpecification [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get Bound tags, such as [{"Key": "city", "Value": "shanghai"}]. 
     * @return Tags Bound tags, such as [{"Key": "city", "Value": "shanghai"}].
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Bound tags, such as [{"Key": "city", "Value": "shanghai"}].
     * @param Tags Bound tags, such as [{"Key": "city", "Value": "shanghai"}].
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Configuration of the ENI trunking mode. Valid values: `Enable` and `Disable`. Default value: `Disable`. 
     * @return TrunkingFlag Configuration of the ENI trunking mode. Valid values: `Enable` and `Disable`. Default value: `Disable`.
     */
    public String getTrunkingFlag() {
        return this.TrunkingFlag;
    }

    /**
     * Set Configuration of the ENI trunking mode. Valid values: `Enable` and `Disable`. Default value: `Disable`.
     * @param TrunkingFlag Configuration of the ENI trunking mode. Valid values: `Enable` and `Disable`. Default value: `Disable`.
     */
    public void setTrunkingFlag(String TrunkingFlag) {
        this.TrunkingFlag = TrunkingFlag;
    }

    public CreateNetworkInterfaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNetworkInterfaceRequest(CreateNetworkInterfaceRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.NetworkInterfaceName != null) {
            this.NetworkInterfaceName = new String(source.NetworkInterfaceName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.NetworkInterfaceDescription != null) {
            this.NetworkInterfaceDescription = new String(source.NetworkInterfaceDescription);
        }
        if (source.SecondaryPrivateIpAddressCount != null) {
            this.SecondaryPrivateIpAddressCount = new Long(source.SecondaryPrivateIpAddressCount);
        }
        if (source.QosLevel != null) {
            this.QosLevel = new String(source.QosLevel);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new PrivateIpAddressSpecification[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new PrivateIpAddressSpecification(source.PrivateIpAddresses[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.TrunkingFlag != null) {
            this.TrunkingFlag = new String(source.TrunkingFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NetworkInterfaceName", this.NetworkInterfaceName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "NetworkInterfaceDescription", this.NetworkInterfaceDescription);
        this.setParamSimple(map, prefix + "SecondaryPrivateIpAddressCount", this.SecondaryPrivateIpAddressCount);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TrunkingFlag", this.TrunkingFlag);

    }
}

