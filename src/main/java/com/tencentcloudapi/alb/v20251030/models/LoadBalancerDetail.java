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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancerDetail extends AbstractModel {

    /**
    * Access log configuration.
    */
    @SerializedName("AccessLogConfig")
    @Expose
    private AccessLogConfig AccessLogConfig;

    /**
    * IP address version. Value: IPv4 or IPv6.
    */
    @SerializedName("AddressIpVersion")
    @Expose
    private String AddressIpVersion;

    /**
    * Network address type of the application CLB instance. Valid values:

- **Internet/Public**: The load balancing has a public IP address, and the DNS domain name is resolved to the public IP, so it can be accessed via the public network.

- **Intranet/Internal**: The load balancer only has a private IP address, and the DNS domain name resolves to the private IP, so it can only be accessed from the private network environment of the VPC where the load balancer is located.


    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * Resource creation time in the format of `yyyy-MM-ddTHH:mm:ss±hh:mm`.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Deletion protection setting information.
    */
    @SerializedName("DeletionProtection")
    @Expose
    private DeletionProtectionConfig DeletionProtection;

    /**
    * DNS domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Billing configuration information of a load balancing instance.
    */
    @SerializedName("LoadBalancerBillingConfig")
    @Expose
    private LoadBalancerBillingConfig LoadBalancerBillingConfig;

    /**
    * CLB instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Instance name.

Length: 1 to 80 characters. It can contain Chinese, letters, digits, hyphens (-), forward slashes (/), half-width periods (.), and underscores (_).
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * Application CLB operation lock configuration.
    */
    @SerializedName("LoadBalancerOperationLocks")
    @Expose
    private LoadBalancerOperationLocksItem [] LoadBalancerOperationLocks;

    /**
    * Application CLB instance status. Valid values:

- **Provisioning**: Under creation.
- **Active**: Running.
- **Configuring**: The configuration is being changed.
- **Deleting**: deleting.
- **ProvisionFailed**: Creation failed.
- **ConfigureFailed**: Configuration adjustment failure.
- **DeletionFailed**: Deletion failed.
- **Abnormal**: abnormal status. For the specific exception reason, see the LoadBalancerOperationLocks field.
    */
    @SerializedName("LoadBalancerStatus")
    @Expose
    private String LoadBalancerStatus;

    /**
    * Protection configuration modification information.
    */
    @SerializedName("ModificationProtection")
    @Expose
    private ModificationProtectionInfo ModificationProtection;

    /**
    * ID set of the security group bound to the application CLB instance.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * Virtual Private Cloud (VPC) ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Mapping list of AZs and subnets. A maximum of 10 AZs can be returned. If the current region supports 2 or more AZs, at least 2 AZs are returned.
    */
    @SerializedName("ZoneMappings")
    @Expose
    private ZoneMappingInfo [] ZoneMappings;

    /**
     * Get Access log configuration. 
     * @return AccessLogConfig Access log configuration.
     */
    public AccessLogConfig getAccessLogConfig() {
        return this.AccessLogConfig;
    }

    /**
     * Set Access log configuration.
     * @param AccessLogConfig Access log configuration.
     */
    public void setAccessLogConfig(AccessLogConfig AccessLogConfig) {
        this.AccessLogConfig = AccessLogConfig;
    }

    /**
     * Get IP address version. Value: IPv4 or IPv6. 
     * @return AddressIpVersion IP address version. Value: IPv4 or IPv6.
     */
    public String getAddressIpVersion() {
        return this.AddressIpVersion;
    }

    /**
     * Set IP address version. Value: IPv4 or IPv6.
     * @param AddressIpVersion IP address version. Value: IPv4 or IPv6.
     */
    public void setAddressIpVersion(String AddressIpVersion) {
        this.AddressIpVersion = AddressIpVersion;
    }

    /**
     * Get Network address type of the application CLB instance. Valid values:

- **Internet/Public**: The load balancing has a public IP address, and the DNS domain name is resolved to the public IP, so it can be accessed via the public network.

- **Intranet/Internal**: The load balancer only has a private IP address, and the DNS domain name resolves to the private IP, so it can only be accessed from the private network environment of the VPC where the load balancer is located.

 
     * @return AddressType Network address type of the application CLB instance. Valid values:

- **Internet/Public**: The load balancing has a public IP address, and the DNS domain name is resolved to the public IP, so it can be accessed via the public network.

- **Intranet/Internal**: The load balancer only has a private IP address, and the DNS domain name resolves to the private IP, so it can only be accessed from the private network environment of the VPC where the load balancer is located.


     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set Network address type of the application CLB instance. Valid values:

- **Internet/Public**: The load balancing has a public IP address, and the DNS domain name is resolved to the public IP, so it can be accessed via the public network.

- **Intranet/Internal**: The load balancer only has a private IP address, and the DNS domain name resolves to the private IP, so it can only be accessed from the private network environment of the VPC where the load balancer is located.


     * @param AddressType Network address type of the application CLB instance. Valid values:

- **Internet/Public**: The load balancing has a public IP address, and the DNS domain name is resolved to the public IP, so it can be accessed via the public network.

- **Intranet/Internal**: The load balancer only has a private IP address, and the DNS domain name resolves to the private IP, so it can only be accessed from the private network environment of the VPC where the load balancer is located.


     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get Resource creation time in the format of `yyyy-MM-ddTHH:mm:ss±hh:mm`. 
     * @return CreateTime Resource creation time in the format of `yyyy-MM-ddTHH:mm:ss±hh:mm`.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Resource creation time in the format of `yyyy-MM-ddTHH:mm:ss±hh:mm`.
     * @param CreateTime Resource creation time in the format of `yyyy-MM-ddTHH:mm:ss±hh:mm`.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Deletion protection setting information. 
     * @return DeletionProtection Deletion protection setting information.
     */
    public DeletionProtectionConfig getDeletionProtection() {
        return this.DeletionProtection;
    }

    /**
     * Set Deletion protection setting information.
     * @param DeletionProtection Deletion protection setting information.
     */
    public void setDeletionProtection(DeletionProtectionConfig DeletionProtection) {
        this.DeletionProtection = DeletionProtection;
    }

    /**
     * Get DNS domain name. 
     * @return Domain DNS domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set DNS domain name.
     * @param Domain DNS domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Billing configuration information of a load balancing instance. 
     * @return LoadBalancerBillingConfig Billing configuration information of a load balancing instance.
     */
    public LoadBalancerBillingConfig getLoadBalancerBillingConfig() {
        return this.LoadBalancerBillingConfig;
    }

    /**
     * Set Billing configuration information of a load balancing instance.
     * @param LoadBalancerBillingConfig Billing configuration information of a load balancing instance.
     */
    public void setLoadBalancerBillingConfig(LoadBalancerBillingConfig LoadBalancerBillingConfig) {
        this.LoadBalancerBillingConfig = LoadBalancerBillingConfig;
    }

    /**
     * Get CLB instance ID, in the format of "alb-" followed by 8 alphanumeric characters. 
     * @return LoadBalancerId CLB instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     * @param LoadBalancerId CLB instance ID, in the format of "alb-" followed by 8 alphanumeric characters.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Instance name.

Length: 1 to 80 characters. It can contain Chinese, letters, digits, hyphens (-), forward slashes (/), half-width periods (.), and underscores (_). 
     * @return LoadBalancerName Instance name.

Length: 1 to 80 characters. It can contain Chinese, letters, digits, hyphens (-), forward slashes (/), half-width periods (.), and underscores (_).
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set Instance name.

Length: 1 to 80 characters. It can contain Chinese, letters, digits, hyphens (-), forward slashes (/), half-width periods (.), and underscores (_).
     * @param LoadBalancerName Instance name.

Length: 1 to 80 characters. It can contain Chinese, letters, digits, hyphens (-), forward slashes (/), half-width periods (.), and underscores (_).
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get Application CLB operation lock configuration. 
     * @return LoadBalancerOperationLocks Application CLB operation lock configuration.
     */
    public LoadBalancerOperationLocksItem [] getLoadBalancerOperationLocks() {
        return this.LoadBalancerOperationLocks;
    }

    /**
     * Set Application CLB operation lock configuration.
     * @param LoadBalancerOperationLocks Application CLB operation lock configuration.
     */
    public void setLoadBalancerOperationLocks(LoadBalancerOperationLocksItem [] LoadBalancerOperationLocks) {
        this.LoadBalancerOperationLocks = LoadBalancerOperationLocks;
    }

    /**
     * Get Application CLB instance status. Valid values:

- **Provisioning**: Under creation.
- **Active**: Running.
- **Configuring**: The configuration is being changed.
- **Deleting**: deleting.
- **ProvisionFailed**: Creation failed.
- **ConfigureFailed**: Configuration adjustment failure.
- **DeletionFailed**: Deletion failed.
- **Abnormal**: abnormal status. For the specific exception reason, see the LoadBalancerOperationLocks field. 
     * @return LoadBalancerStatus Application CLB instance status. Valid values:

- **Provisioning**: Under creation.
- **Active**: Running.
- **Configuring**: The configuration is being changed.
- **Deleting**: deleting.
- **ProvisionFailed**: Creation failed.
- **ConfigureFailed**: Configuration adjustment failure.
- **DeletionFailed**: Deletion failed.
- **Abnormal**: abnormal status. For the specific exception reason, see the LoadBalancerOperationLocks field.
     */
    public String getLoadBalancerStatus() {
        return this.LoadBalancerStatus;
    }

    /**
     * Set Application CLB instance status. Valid values:

- **Provisioning**: Under creation.
- **Active**: Running.
- **Configuring**: The configuration is being changed.
- **Deleting**: deleting.
- **ProvisionFailed**: Creation failed.
- **ConfigureFailed**: Configuration adjustment failure.
- **DeletionFailed**: Deletion failed.
- **Abnormal**: abnormal status. For the specific exception reason, see the LoadBalancerOperationLocks field.
     * @param LoadBalancerStatus Application CLB instance status. Valid values:

- **Provisioning**: Under creation.
- **Active**: Running.
- **Configuring**: The configuration is being changed.
- **Deleting**: deleting.
- **ProvisionFailed**: Creation failed.
- **ConfigureFailed**: Configuration adjustment failure.
- **DeletionFailed**: Deletion failed.
- **Abnormal**: abnormal status. For the specific exception reason, see the LoadBalancerOperationLocks field.
     */
    public void setLoadBalancerStatus(String LoadBalancerStatus) {
        this.LoadBalancerStatus = LoadBalancerStatus;
    }

    /**
     * Get Protection configuration modification information. 
     * @return ModificationProtection Protection configuration modification information.
     */
    public ModificationProtectionInfo getModificationProtection() {
        return this.ModificationProtection;
    }

    /**
     * Set Protection configuration modification information.
     * @param ModificationProtection Protection configuration modification information.
     */
    public void setModificationProtection(ModificationProtectionInfo ModificationProtection) {
        this.ModificationProtection = ModificationProtection;
    }

    /**
     * Get ID set of the security group bound to the application CLB instance. 
     * @return SecurityGroupIds ID set of the security group bound to the application CLB instance.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set ID set of the security group bound to the application CLB instance.
     * @param SecurityGroupIds ID set of the security group bound to the application CLB instance.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Tag. 
     * @return Tags Tag.
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
     * @param Tags Tag.
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Virtual Private Cloud (VPC) ID. 
     * @return VpcId Virtual Private Cloud (VPC) ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Virtual Private Cloud (VPC) ID.
     * @param VpcId Virtual Private Cloud (VPC) ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Mapping list of AZs and subnets. A maximum of 10 AZs can be returned. If the current region supports 2 or more AZs, at least 2 AZs are returned. 
     * @return ZoneMappings Mapping list of AZs and subnets. A maximum of 10 AZs can be returned. If the current region supports 2 or more AZs, at least 2 AZs are returned.
     */
    public ZoneMappingInfo [] getZoneMappings() {
        return this.ZoneMappings;
    }

    /**
     * Set Mapping list of AZs and subnets. A maximum of 10 AZs can be returned. If the current region supports 2 or more AZs, at least 2 AZs are returned.
     * @param ZoneMappings Mapping list of AZs and subnets. A maximum of 10 AZs can be returned. If the current region supports 2 or more AZs, at least 2 AZs are returned.
     */
    public void setZoneMappings(ZoneMappingInfo [] ZoneMappings) {
        this.ZoneMappings = ZoneMappings;
    }

    public LoadBalancerDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancerDetail(LoadBalancerDetail source) {
        if (source.AccessLogConfig != null) {
            this.AccessLogConfig = new AccessLogConfig(source.AccessLogConfig);
        }
        if (source.AddressIpVersion != null) {
            this.AddressIpVersion = new String(source.AddressIpVersion);
        }
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DeletionProtection != null) {
            this.DeletionProtection = new DeletionProtectionConfig(source.DeletionProtection);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LoadBalancerBillingConfig != null) {
            this.LoadBalancerBillingConfig = new LoadBalancerBillingConfig(source.LoadBalancerBillingConfig);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.LoadBalancerOperationLocks != null) {
            this.LoadBalancerOperationLocks = new LoadBalancerOperationLocksItem[source.LoadBalancerOperationLocks.length];
            for (int i = 0; i < source.LoadBalancerOperationLocks.length; i++) {
                this.LoadBalancerOperationLocks[i] = new LoadBalancerOperationLocksItem(source.LoadBalancerOperationLocks[i]);
            }
        }
        if (source.LoadBalancerStatus != null) {
            this.LoadBalancerStatus = new String(source.LoadBalancerStatus);
        }
        if (source.ModificationProtection != null) {
            this.ModificationProtection = new ModificationProtectionInfo(source.ModificationProtection);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ZoneMappings != null) {
            this.ZoneMappings = new ZoneMappingInfo[source.ZoneMappings.length];
            for (int i = 0; i < source.ZoneMappings.length; i++) {
                this.ZoneMappings[i] = new ZoneMappingInfo(source.ZoneMappings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AccessLogConfig.", this.AccessLogConfig);
        this.setParamSimple(map, prefix + "AddressIpVersion", this.AddressIpVersion);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "DeletionProtection.", this.DeletionProtection);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "LoadBalancerBillingConfig.", this.LoadBalancerBillingConfig);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamArrayObj(map, prefix + "LoadBalancerOperationLocks.", this.LoadBalancerOperationLocks);
        this.setParamSimple(map, prefix + "LoadBalancerStatus", this.LoadBalancerStatus);
        this.setParamObj(map, prefix + "ModificationProtection.", this.ModificationProtection);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArrayObj(map, prefix + "ZoneMappings.", this.ZoneMappings);

    }
}

