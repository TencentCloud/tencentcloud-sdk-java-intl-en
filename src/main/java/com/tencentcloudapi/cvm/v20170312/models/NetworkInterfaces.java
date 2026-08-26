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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkInterfaces extends AbstractModel {

    /**
    * Specifies whether the network interface is primary or secondary. Valid values must be uppercase. The `NetworkInterfaces` array must contain exactly one `PRIMARY` network interface and can contain multiple `SECONDARY` network interfaces. Valid values:<li>`PRIMARY`: Primary network interface.</li><li>`SECONDARY`: Secondary network interface.</li>
    */
    @SerializedName("InterfaceType")
    @Expose
    private String InterfaceType;

    /**
    * VPC ID in the format of `vpc-xxx`. You can obtain a valid VPC ID from the [VPC console](https://console.tencentcloud.com/vpc/vpc?rid=1) or from the `VpcId` field returned by the [DescribeVpcs](https://www.tencentcloud.com/document/product/215/15778) API. If both `VpcId` and `SubnetId` are set to `DEFAULT` when creating an instance, the default VPC is used.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID in the format of `subnet-xxx`. You can obtain a valid subnet ID from the [subnet console](https://console.tencentcloud.com/vpc/subnet) or from the `SubnetId` field returned by the [DescribeSubnets](https://www.tencentcloud.com/document/product/215/15784) API. If both `SubnetId` and `VpcId` are set to `DEFAULT` when creating an instance, the default VPC is used.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Required. Specifies the number of private IPv4 addresses automatically assigned to each network interface. Manually specifying IP addresses and automatically assigning IP addresses at the same time is not supported. Valid range: [1, 50].
    */
    @SerializedName("PrivateIpv4AddressCount")
    @Expose
    private Long PrivateIpv4AddressCount;

    /**
    * ID of an existing elastic network interface (ENI) to be attached. This parameter applies only to secondary network interfaces. The primary network interface is created automatically through the existing process and cannot be specified using this parameter. When an existing ENI is specified, `InstanceCount` must be set to 1.
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * Security groups associated with the instance. You can obtain the security group IDs from the `SecurityGroupId` field returned by the [DescribeSecurityGroups](https://www.tencentcloud.com/document/api/215/15808) API. If this parameter is not specified, the default security group of the specified project is associated. If no default security group exists, one is automatically created. Each user can configure up to 50 security groups per project in each region.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Specifies whether the associated elastic network interface (ENI) is deleted when the CVM instance is terminated. This parameter applies only to secondary network interfaces. By default, secondary network interfaces are retained to preserve the existing behavior. This parameter does not apply to the primary network interface, which is always deleted when the instance is terminated. Default value: `false`.
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
     * Get Specifies whether the network interface is primary or secondary. Valid values must be uppercase. The `NetworkInterfaces` array must contain exactly one `PRIMARY` network interface and can contain multiple `SECONDARY` network interfaces. Valid values:<li>`PRIMARY`: Primary network interface.</li><li>`SECONDARY`: Secondary network interface.</li> 
     * @return InterfaceType Specifies whether the network interface is primary or secondary. Valid values must be uppercase. The `NetworkInterfaces` array must contain exactly one `PRIMARY` network interface and can contain multiple `SECONDARY` network interfaces. Valid values:<li>`PRIMARY`: Primary network interface.</li><li>`SECONDARY`: Secondary network interface.</li>
     */
    public String getInterfaceType() {
        return this.InterfaceType;
    }

    /**
     * Set Specifies whether the network interface is primary or secondary. Valid values must be uppercase. The `NetworkInterfaces` array must contain exactly one `PRIMARY` network interface and can contain multiple `SECONDARY` network interfaces. Valid values:<li>`PRIMARY`: Primary network interface.</li><li>`SECONDARY`: Secondary network interface.</li>
     * @param InterfaceType Specifies whether the network interface is primary or secondary. Valid values must be uppercase. The `NetworkInterfaces` array must contain exactly one `PRIMARY` network interface and can contain multiple `SECONDARY` network interfaces. Valid values:<li>`PRIMARY`: Primary network interface.</li><li>`SECONDARY`: Secondary network interface.</li>
     */
    public void setInterfaceType(String InterfaceType) {
        this.InterfaceType = InterfaceType;
    }

    /**
     * Get VPC ID in the format of `vpc-xxx`. You can obtain a valid VPC ID from the [VPC console](https://console.tencentcloud.com/vpc/vpc?rid=1) or from the `VpcId` field returned by the [DescribeVpcs](https://www.tencentcloud.com/document/product/215/15778) API. If both `VpcId` and `SubnetId` are set to `DEFAULT` when creating an instance, the default VPC is used. 
     * @return VpcId VPC ID in the format of `vpc-xxx`. You can obtain a valid VPC ID from the [VPC console](https://console.tencentcloud.com/vpc/vpc?rid=1) or from the `VpcId` field returned by the [DescribeVpcs](https://www.tencentcloud.com/document/product/215/15778) API. If both `VpcId` and `SubnetId` are set to `DEFAULT` when creating an instance, the default VPC is used.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID in the format of `vpc-xxx`. You can obtain a valid VPC ID from the [VPC console](https://console.tencentcloud.com/vpc/vpc?rid=1) or from the `VpcId` field returned by the [DescribeVpcs](https://www.tencentcloud.com/document/product/215/15778) API. If both `VpcId` and `SubnetId` are set to `DEFAULT` when creating an instance, the default VPC is used.
     * @param VpcId VPC ID in the format of `vpc-xxx`. You can obtain a valid VPC ID from the [VPC console](https://console.tencentcloud.com/vpc/vpc?rid=1) or from the `VpcId` field returned by the [DescribeVpcs](https://www.tencentcloud.com/document/product/215/15778) API. If both `VpcId` and `SubnetId` are set to `DEFAULT` when creating an instance, the default VPC is used.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID in the format of `subnet-xxx`. You can obtain a valid subnet ID from the [subnet console](https://console.tencentcloud.com/vpc/subnet) or from the `SubnetId` field returned by the [DescribeSubnets](https://www.tencentcloud.com/document/product/215/15784) API. If both `SubnetId` and `VpcId` are set to `DEFAULT` when creating an instance, the default VPC is used. 
     * @return SubnetId VPC subnet ID in the format of `subnet-xxx`. You can obtain a valid subnet ID from the [subnet console](https://console.tencentcloud.com/vpc/subnet) or from the `SubnetId` field returned by the [DescribeSubnets](https://www.tencentcloud.com/document/product/215/15784) API. If both `SubnetId` and `VpcId` are set to `DEFAULT` when creating an instance, the default VPC is used.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID in the format of `subnet-xxx`. You can obtain a valid subnet ID from the [subnet console](https://console.tencentcloud.com/vpc/subnet) or from the `SubnetId` field returned by the [DescribeSubnets](https://www.tencentcloud.com/document/product/215/15784) API. If both `SubnetId` and `VpcId` are set to `DEFAULT` when creating an instance, the default VPC is used.
     * @param SubnetId VPC subnet ID in the format of `subnet-xxx`. You can obtain a valid subnet ID from the [subnet console](https://console.tencentcloud.com/vpc/subnet) or from the `SubnetId` field returned by the [DescribeSubnets](https://www.tencentcloud.com/document/product/215/15784) API. If both `SubnetId` and `VpcId` are set to `DEFAULT` when creating an instance, the default VPC is used.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Required. Specifies the number of private IPv4 addresses automatically assigned to each network interface. Manually specifying IP addresses and automatically assigning IP addresses at the same time is not supported. Valid range: [1, 50]. 
     * @return PrivateIpv4AddressCount Required. Specifies the number of private IPv4 addresses automatically assigned to each network interface. Manually specifying IP addresses and automatically assigning IP addresses at the same time is not supported. Valid range: [1, 50].
     */
    public Long getPrivateIpv4AddressCount() {
        return this.PrivateIpv4AddressCount;
    }

    /**
     * Set Required. Specifies the number of private IPv4 addresses automatically assigned to each network interface. Manually specifying IP addresses and automatically assigning IP addresses at the same time is not supported. Valid range: [1, 50].
     * @param PrivateIpv4AddressCount Required. Specifies the number of private IPv4 addresses automatically assigned to each network interface. Manually specifying IP addresses and automatically assigning IP addresses at the same time is not supported. Valid range: [1, 50].
     */
    public void setPrivateIpv4AddressCount(Long PrivateIpv4AddressCount) {
        this.PrivateIpv4AddressCount = PrivateIpv4AddressCount;
    }

    /**
     * Get ID of an existing elastic network interface (ENI) to be attached. This parameter applies only to secondary network interfaces. The primary network interface is created automatically through the existing process and cannot be specified using this parameter. When an existing ENI is specified, `InstanceCount` must be set to 1. 
     * @return NetworkInterfaceId ID of an existing elastic network interface (ENI) to be attached. This parameter applies only to secondary network interfaces. The primary network interface is created automatically through the existing process and cannot be specified using this parameter. When an existing ENI is specified, `InstanceCount` must be set to 1.
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set ID of an existing elastic network interface (ENI) to be attached. This parameter applies only to secondary network interfaces. The primary network interface is created automatically through the existing process and cannot be specified using this parameter. When an existing ENI is specified, `InstanceCount` must be set to 1.
     * @param NetworkInterfaceId ID of an existing elastic network interface (ENI) to be attached. This parameter applies only to secondary network interfaces. The primary network interface is created automatically through the existing process and cannot be specified using this parameter. When an existing ENI is specified, `InstanceCount` must be set to 1.
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get Security groups associated with the instance. You can obtain the security group IDs from the `SecurityGroupId` field returned by the [DescribeSecurityGroups](https://www.tencentcloud.com/document/api/215/15808) API. If this parameter is not specified, the default security group of the specified project is associated. If no default security group exists, one is automatically created. Each user can configure up to 50 security groups per project in each region. 
     * @return SecurityGroupIds Security groups associated with the instance. You can obtain the security group IDs from the `SecurityGroupId` field returned by the [DescribeSecurityGroups](https://www.tencentcloud.com/document/api/215/15808) API. If this parameter is not specified, the default security group of the specified project is associated. If no default security group exists, one is automatically created. Each user can configure up to 50 security groups per project in each region.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security groups associated with the instance. You can obtain the security group IDs from the `SecurityGroupId` field returned by the [DescribeSecurityGroups](https://www.tencentcloud.com/document/api/215/15808) API. If this parameter is not specified, the default security group of the specified project is associated. If no default security group exists, one is automatically created. Each user can configure up to 50 security groups per project in each region.
     * @param SecurityGroupIds Security groups associated with the instance. You can obtain the security group IDs from the `SecurityGroupId` field returned by the [DescribeSecurityGroups](https://www.tencentcloud.com/document/api/215/15808) API. If this parameter is not specified, the default security group of the specified project is associated. If no default security group exists, one is automatically created. Each user can configure up to 50 security groups per project in each region.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Specifies whether the associated elastic network interface (ENI) is deleted when the CVM instance is terminated. This parameter applies only to secondary network interfaces. By default, secondary network interfaces are retained to preserve the existing behavior. This parameter does not apply to the primary network interface, which is always deleted when the instance is terminated. Default value: `false`. 
     * @return DeleteWithInstance Specifies whether the associated elastic network interface (ENI) is deleted when the CVM instance is terminated. This parameter applies only to secondary network interfaces. By default, secondary network interfaces are retained to preserve the existing behavior. This parameter does not apply to the primary network interface, which is always deleted when the instance is terminated. Default value: `false`.
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set Specifies whether the associated elastic network interface (ENI) is deleted when the CVM instance is terminated. This parameter applies only to secondary network interfaces. By default, secondary network interfaces are retained to preserve the existing behavior. This parameter does not apply to the primary network interface, which is always deleted when the instance is terminated. Default value: `false`.
     * @param DeleteWithInstance Specifies whether the associated elastic network interface (ENI) is deleted when the CVM instance is terminated. This parameter applies only to secondary network interfaces. By default, secondary network interfaces are retained to preserve the existing behavior. This parameter does not apply to the primary network interface, which is always deleted when the instance is terminated. Default value: `false`.
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    public NetworkInterfaces() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkInterfaces(NetworkInterfaces source) {
        if (source.InterfaceType != null) {
            this.InterfaceType = new String(source.InterfaceType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.PrivateIpv4AddressCount != null) {
            this.PrivateIpv4AddressCount = new Long(source.PrivateIpv4AddressCount);
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.DeleteWithInstance != null) {
            this.DeleteWithInstance = new Boolean(source.DeleteWithInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InterfaceType", this.InterfaceType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PrivateIpv4AddressCount", this.PrivateIpv4AddressCount);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);

    }
}

