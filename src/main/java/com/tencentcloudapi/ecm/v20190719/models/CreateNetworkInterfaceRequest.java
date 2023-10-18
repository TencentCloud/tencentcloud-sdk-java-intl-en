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

public class CreateNetworkInterfaceRequest extends AbstractModel {

    /**
    * VPC instance ID, which can be obtained from the `VpcId` field in the returned value of the `DescribeVpcs` API.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ENI name, which can contain up to 60 bytes.
    */
    @SerializedName("NetworkInterfaceName")
    @Expose
    private String NetworkInterfaceName;

    /**
    * Subnet instance ID of the ENI, such as 'subnet-0ap8nwca'.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * ECM region, such as `ap-xian-ecm`.
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * ENI description. You can enter any information within 60 characters.
    */
    @SerializedName("NetworkInterfaceDescription")
    @Expose
    private String NetworkInterfaceDescription;

    /**
    * Number of private IP addresses applied for. The total number of private IP addresses cannot exceed the quota.
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
    * Information of the specified private IPs. You can specify up to 10 IPs at a time.
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private PrivateIpAddressSpecification [] PrivateIpAddresses;

    /**
    * List of bound tags, such as [{"Key": "city", "Value": "shanghai"}].
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get VPC instance ID, which can be obtained from the `VpcId` field in the returned value of the `DescribeVpcs` API. 
     * @return VpcId VPC instance ID, which can be obtained from the `VpcId` field in the returned value of the `DescribeVpcs` API.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID, which can be obtained from the `VpcId` field in the returned value of the `DescribeVpcs` API.
     * @param VpcId VPC instance ID, which can be obtained from the `VpcId` field in the returned value of the `DescribeVpcs` API.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ENI name, which can contain up to 60 bytes. 
     * @return NetworkInterfaceName ENI name, which can contain up to 60 bytes.
     */
    public String getNetworkInterfaceName() {
        return this.NetworkInterfaceName;
    }

    /**
     * Set ENI name, which can contain up to 60 bytes.
     * @param NetworkInterfaceName ENI name, which can contain up to 60 bytes.
     */
    public void setNetworkInterfaceName(String NetworkInterfaceName) {
        this.NetworkInterfaceName = NetworkInterfaceName;
    }

    /**
     * Get Subnet instance ID of the ENI, such as 'subnet-0ap8nwca'. 
     * @return SubnetId Subnet instance ID of the ENI, such as 'subnet-0ap8nwca'.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet instance ID of the ENI, such as 'subnet-0ap8nwca'.
     * @param SubnetId Subnet instance ID of the ENI, such as 'subnet-0ap8nwca'.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get ECM region, such as `ap-xian-ecm`. 
     * @return EcmRegion ECM region, such as `ap-xian-ecm`.
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM region, such as `ap-xian-ecm`.
     * @param EcmRegion ECM region, such as `ap-xian-ecm`.
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get ENI description. You can enter any information within 60 characters. 
     * @return NetworkInterfaceDescription ENI description. You can enter any information within 60 characters.
     */
    public String getNetworkInterfaceDescription() {
        return this.NetworkInterfaceDescription;
    }

    /**
     * Set ENI description. You can enter any information within 60 characters.
     * @param NetworkInterfaceDescription ENI description. You can enter any information within 60 characters.
     */
    public void setNetworkInterfaceDescription(String NetworkInterfaceDescription) {
        this.NetworkInterfaceDescription = NetworkInterfaceDescription;
    }

    /**
     * Get Number of private IP addresses applied for. The total number of private IP addresses cannot exceed the quota. 
     * @return SecondaryPrivateIpAddressCount Number of private IP addresses applied for. The total number of private IP addresses cannot exceed the quota.
     */
    public Long getSecondaryPrivateIpAddressCount() {
        return this.SecondaryPrivateIpAddressCount;
    }

    /**
     * Set Number of private IP addresses applied for. The total number of private IP addresses cannot exceed the quota.
     * @param SecondaryPrivateIpAddressCount Number of private IP addresses applied for. The total number of private IP addresses cannot exceed the quota.
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
     * Get Information of the specified private IPs. You can specify up to 10 IPs at a time. 
     * @return PrivateIpAddresses Information of the specified private IPs. You can specify up to 10 IPs at a time.
     */
    public PrivateIpAddressSpecification [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set Information of the specified private IPs. You can specify up to 10 IPs at a time.
     * @param PrivateIpAddresses Information of the specified private IPs. You can specify up to 10 IPs at a time.
     */
    public void setPrivateIpAddresses(PrivateIpAddressSpecification [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get List of bound tags, such as [{"Key": "city", "Value": "shanghai"}]. 
     * @return Tags List of bound tags, such as [{"Key": "city", "Value": "shanghai"}].
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of bound tags, such as [{"Key": "city", "Value": "shanghai"}].
     * @param Tags List of bound tags, such as [{"Key": "city", "Value": "shanghai"}].
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
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
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.NetworkInterfaceDescription != null) {
            this.NetworkInterfaceDescription = new String(source.NetworkInterfaceDescription);
        }
        if (source.SecondaryPrivateIpAddressCount != null) {
            this.SecondaryPrivateIpAddressCount = new Long(source.SecondaryPrivateIpAddressCount);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NetworkInterfaceName", this.NetworkInterfaceName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "NetworkInterfaceDescription", this.NetworkInterfaceDescription);
        this.setParamSimple(map, prefix + "SecondaryPrivateIpAddressCount", this.SecondaryPrivateIpAddressCount);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

