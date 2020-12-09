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

public class CreateAndAttachNetworkInterfaceRequest extends AbstractModel{

    /**
    * The ID of the VPC instance. You can obtain the parameter value from the `VpcId` field in the returned result of the `DescribeVpcs` API.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The name of the ENI. The maximum length is 60 bytes.
    */
    @SerializedName("NetworkInterfaceName")
    @Expose
    private String NetworkInterfaceName;

    /**
    * The subnet instance ID of the ENI, such as 'subnet-0ap8nwca'.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * CVM instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The information of the specified private IPs. You can specify a maximum of 10 IPs each time.
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private PrivateIpAddressSpecification [] PrivateIpAddresses;

    /**
    * The number of private IP addresses you can apply for. The total number of private IP addresses cannot exceed the quota.
    */
    @SerializedName("SecondaryPrivateIpAddressCount")
    @Expose
    private Long SecondaryPrivateIpAddressCount;

    /**
    * The security group to be bound with, such as ['sg-1dd51d'].
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * The ENI description. You can enter any information within 60 characters.
    */
    @SerializedName("NetworkInterfaceDescription")
    @Expose
    private String NetworkInterfaceDescription;

    /**
    * Bound tags, such as [{"Key": "city", "Value": "shanghai"}].
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get The ID of the VPC instance. You can obtain the parameter value from the `VpcId` field in the returned result of the `DescribeVpcs` API. 
     * @return VpcId The ID of the VPC instance. You can obtain the parameter value from the `VpcId` field in the returned result of the `DescribeVpcs` API.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The ID of the VPC instance. You can obtain the parameter value from the `VpcId` field in the returned result of the `DescribeVpcs` API.
     * @param VpcId The ID of the VPC instance. You can obtain the parameter value from the `VpcId` field in the returned result of the `DescribeVpcs` API.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The name of the ENI. The maximum length is 60 bytes. 
     * @return NetworkInterfaceName The name of the ENI. The maximum length is 60 bytes.
     */
    public String getNetworkInterfaceName() {
        return this.NetworkInterfaceName;
    }

    /**
     * Set The name of the ENI. The maximum length is 60 bytes.
     * @param NetworkInterfaceName The name of the ENI. The maximum length is 60 bytes.
     */
    public void setNetworkInterfaceName(String NetworkInterfaceName) {
        this.NetworkInterfaceName = NetworkInterfaceName;
    }

    /**
     * Get The subnet instance ID of the ENI, such as 'subnet-0ap8nwca'. 
     * @return SubnetId The subnet instance ID of the ENI, such as 'subnet-0ap8nwca'.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set The subnet instance ID of the ENI, such as 'subnet-0ap8nwca'.
     * @param SubnetId The subnet instance ID of the ENI, such as 'subnet-0ap8nwca'.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get CVM instance ID. 
     * @return InstanceId CVM instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CVM instance ID.
     * @param InstanceId CVM instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The information of the specified private IPs. You can specify a maximum of 10 IPs each time. 
     * @return PrivateIpAddresses The information of the specified private IPs. You can specify a maximum of 10 IPs each time.
     */
    public PrivateIpAddressSpecification [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set The information of the specified private IPs. You can specify a maximum of 10 IPs each time.
     * @param PrivateIpAddresses The information of the specified private IPs. You can specify a maximum of 10 IPs each time.
     */
    public void setPrivateIpAddresses(PrivateIpAddressSpecification [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get The number of private IP addresses you can apply for. The total number of private IP addresses cannot exceed the quota. 
     * @return SecondaryPrivateIpAddressCount The number of private IP addresses you can apply for. The total number of private IP addresses cannot exceed the quota.
     */
    public Long getSecondaryPrivateIpAddressCount() {
        return this.SecondaryPrivateIpAddressCount;
    }

    /**
     * Set The number of private IP addresses you can apply for. The total number of private IP addresses cannot exceed the quota.
     * @param SecondaryPrivateIpAddressCount The number of private IP addresses you can apply for. The total number of private IP addresses cannot exceed the quota.
     */
    public void setSecondaryPrivateIpAddressCount(Long SecondaryPrivateIpAddressCount) {
        this.SecondaryPrivateIpAddressCount = SecondaryPrivateIpAddressCount;
    }

    /**
     * Get The security group to be bound with, such as ['sg-1dd51d']. 
     * @return SecurityGroupIds The security group to be bound with, such as ['sg-1dd51d'].
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set The security group to be bound with, such as ['sg-1dd51d'].
     * @param SecurityGroupIds The security group to be bound with, such as ['sg-1dd51d'].
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get The ENI description. You can enter any information within 60 characters. 
     * @return NetworkInterfaceDescription The ENI description. You can enter any information within 60 characters.
     */
    public String getNetworkInterfaceDescription() {
        return this.NetworkInterfaceDescription;
    }

    /**
     * Set The ENI description. You can enter any information within 60 characters.
     * @param NetworkInterfaceDescription The ENI description. You can enter any information within 60 characters.
     */
    public void setNetworkInterfaceDescription(String NetworkInterfaceDescription) {
        this.NetworkInterfaceDescription = NetworkInterfaceDescription;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NetworkInterfaceName", this.NetworkInterfaceName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "SecondaryPrivateIpAddressCount", this.SecondaryPrivateIpAddressCount);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "NetworkInterfaceDescription", this.NetworkInterfaceDescription);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

