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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateIntegrateClusterRequest extends AbstractModel {

    /**
    * Availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC network ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Database version. Valid values: 
<li> MYSQL available values: 5.7, 8.0 </li>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Cluster name. The length must be less than 64 characters. Each character can be an uppercase or lowercase letter, digit, or special symbol (-, _, .).
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Account (8-64 characters, containing any three of the following: uppercase and lowercase letters, digits, and symbols ~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/)
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * Port. Default value: 3306. Value range: [0, 65535).
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Billing mode. Pay-as-you-go: 0; monthly subscription: 1. Default: pay-as-you-go.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Number of clusters to purchase. Range of optional values: [1,3]. Default value: 1
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Storage limit of a regular instance in GB
When `DbType` is `MYSQL` and the storage billing mode is prepaid, this parameter cannot exceed the maximum storage specification corresponding to the cpu and memory.
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * Annual and monthly subscription duration.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Unit of the annual and monthly subscription duration. Valid values: s, d, m, y.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Whether Annual/Monthly Subscription is auto-renewed. Default value: 0.
0: default renewal method. 1: auto-renew. 2: no auto-renewal.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * tag array information that needs to be bound for cluster creation
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * Cluster storage billing mode. Pay-as-you-go: 0. Monthly subscription: 1. Default: pay-as-you-go.
When `DbType` is `MYSQL` and the cluster compute billing mode is pay-as-you-go (including when `DbMode` is `SERVERLESS`), the storage billing mode can only be pay-as-you-go.
Rollback and clone do not support monthly subscription storage.
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * Security group id array
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Alarm policy Id array
    */
    @SerializedName("AlarmPolicyIds")
    @Expose
    private String [] AlarmPolicyIds;

    /**
    * Parameter array. It temporarily supports `character_set_server` (utf8 | latin1 | gbk | utf8mb4) and `lower_case_table_names`. 1: not case-sensitive; 0: case-sensitive.
    */
    @SerializedName("ClusterParams")
    @Expose
    private ParamItem [] ClusterParams;

    /**
    * Transaction mode. 0: Place order and pay. 1: Place order
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
    * Parameter template ID, which can be obtained by querying parameter template information through DescribeParamTemplates.
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * Multi-az address
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * Instance initialization configuration information, primarily used for selecting different specification instances during cluster purchase.
    */
    @SerializedName("InstanceInitInfos")
    @Expose
    private IntegrateInstanceInfo [] InstanceInitInfos;

    /**
    * Global database unique ID
    */
    @SerializedName("GdnId")
    @Expose
    private String GdnId;

    /**
    * Database proxy configuration
    */
    @SerializedName("ProxyConfig")
    @Expose
    private ProxyConfigInfo ProxyConfig;

    /**
    * Whether to automatically archive
    */
    @SerializedName("AutoArchive")
    @Expose
    private String AutoArchive;

    /**
    * Archiving processing time after pausing
    */
    @SerializedName("AutoArchiveDelayHours")
    @Expose
    private Long AutoArchiveDelayHours;

    /**
    * Encryption method (consists of the encryption algorithm and key pair version)
    */
    @SerializedName("EncryptMethod")
    @Expose
    private String EncryptMethod;

    /**
    * Integrated cluster configuration information
    */
    @SerializedName("IntegrateCreateClusterConfig")
    @Expose
    private IntegrateCreateClusterConfig IntegrateCreateClusterConfig;

    /**
    * Storage architecture type. Enumeration values: 1.0/2.0. Default value: 1.0
    */
    @SerializedName("StorageVersion")
    @Expose
    private String StorageVersion;

    /**
     * Get Availability zone 
     * @return Zone Availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
     * @param Zone Availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get VPC network ID 
     * @return VpcId VPC network ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC network ID
     * @param VpcId VPC network ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Database version. Valid values: 
<li> MYSQL available values: 5.7, 8.0 </li> 
     * @return DbVersion Database version. Valid values: 
<li> MYSQL available values: 5.7, 8.0 </li>
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set Database version. Valid values: 
<li> MYSQL available values: 5.7, 8.0 </li>
     * @param DbVersion Database version. Valid values: 
<li> MYSQL available values: 5.7, 8.0 </li>
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Cluster name. The length must be less than 64 characters. Each character can be an uppercase or lowercase letter, digit, or special symbol (-, _, .). 
     * @return ClusterName Cluster name. The length must be less than 64 characters. Each character can be an uppercase or lowercase letter, digit, or special symbol (-, _, .).
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name. The length must be less than 64 characters. Each character can be an uppercase or lowercase letter, digit, or special symbol (-, _, .).
     * @param ClusterName Cluster name. The length must be less than 64 characters. Each character can be an uppercase or lowercase letter, digit, or special symbol (-, _, .).
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Account (8-64 characters, containing any three of the following: uppercase and lowercase letters, digits, and symbols ~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/) 
     * @return AdminPassword Account (8-64 characters, containing any three of the following: uppercase and lowercase letters, digits, and symbols ~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/)
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set Account (8-64 characters, containing any three of the following: uppercase and lowercase letters, digits, and symbols ~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/)
     * @param AdminPassword Account (8-64 characters, containing any three of the following: uppercase and lowercase letters, digits, and symbols ~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/)
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get Port. Default value: 3306. Value range: [0, 65535). 
     * @return Port Port. Default value: 3306. Value range: [0, 65535).
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port. Default value: 3306. Value range: [0, 65535).
     * @param Port Port. Default value: 3306. Value range: [0, 65535).
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Billing mode. Pay-as-you-go: 0; monthly subscription: 1. Default: pay-as-you-go. 
     * @return PayMode Billing mode. Pay-as-you-go: 0; monthly subscription: 1. Default: pay-as-you-go.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. Pay-as-you-go: 0; monthly subscription: 1. Default: pay-as-you-go.
     * @param PayMode Billing mode. Pay-as-you-go: 0; monthly subscription: 1. Default: pay-as-you-go.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Number of clusters to purchase. Range of optional values: [1,3]. Default value: 1 
     * @return Count Number of clusters to purchase. Range of optional values: [1,3]. Default value: 1
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of clusters to purchase. Range of optional values: [1,3]. Default value: 1
     * @param Count Number of clusters to purchase. Range of optional values: [1,3]. Default value: 1
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Storage limit of a regular instance in GB
When `DbType` is `MYSQL` and the storage billing mode is prepaid, this parameter cannot exceed the maximum storage specification corresponding to the cpu and memory. 
     * @return StorageLimit Storage limit of a regular instance in GB
When `DbType` is `MYSQL` and the storage billing mode is prepaid, this parameter cannot exceed the maximum storage specification corresponding to the cpu and memory.
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Storage limit of a regular instance in GB
When `DbType` is `MYSQL` and the storage billing mode is prepaid, this parameter cannot exceed the maximum storage specification corresponding to the cpu and memory.
     * @param StorageLimit Storage limit of a regular instance in GB
When `DbType` is `MYSQL` and the storage billing mode is prepaid, this parameter cannot exceed the maximum storage specification corresponding to the cpu and memory.
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get Annual and monthly subscription duration. 
     * @return TimeSpan Annual and monthly subscription duration.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Annual and monthly subscription duration.
     * @param TimeSpan Annual and monthly subscription duration.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Unit of the annual and monthly subscription duration. Valid values: s, d, m, y. 
     * @return TimeUnit Unit of the annual and monthly subscription duration. Valid values: s, d, m, y.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Unit of the annual and monthly subscription duration. Valid values: s, d, m, y.
     * @param TimeUnit Unit of the annual and monthly subscription duration. Valid values: s, d, m, y.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Whether Annual/Monthly Subscription is auto-renewed. Default value: 0.
0: default renewal method. 1: auto-renew. 2: no auto-renewal. 
     * @return AutoRenewFlag Whether Annual/Monthly Subscription is auto-renewed. Default value: 0.
0: default renewal method. 1: auto-renew. 2: no auto-renewal.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether Annual/Monthly Subscription is auto-renewed. Default value: 0.
0: default renewal method. 1: auto-renew. 2: no auto-renewal.
     * @param AutoRenewFlag Whether Annual/Monthly Subscription is auto-renewed. Default value: 0.
0: default renewal method. 1: auto-renew. 2: no auto-renewal.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0. 
     * @return AutoVoucher Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.
     * @param AutoVoucher Whether to automatically select a voucher. 1: Yes; 0: No. Default is 0.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get tag array information that needs to be bound for cluster creation 
     * @return ResourceTags tag array information that needs to be bound for cluster creation
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set tag array information that needs to be bound for cluster creation
     * @param ResourceTags tag array information that needs to be bound for cluster creation
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Cluster storage billing mode. Pay-as-you-go: 0. Monthly subscription: 1. Default: pay-as-you-go.
When `DbType` is `MYSQL` and the cluster compute billing mode is pay-as-you-go (including when `DbMode` is `SERVERLESS`), the storage billing mode can only be pay-as-you-go.
Rollback and clone do not support monthly subscription storage. 
     * @return StoragePayMode Cluster storage billing mode. Pay-as-you-go: 0. Monthly subscription: 1. Default: pay-as-you-go.
When `DbType` is `MYSQL` and the cluster compute billing mode is pay-as-you-go (including when `DbMode` is `SERVERLESS`), the storage billing mode can only be pay-as-you-go.
Rollback and clone do not support monthly subscription storage.
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set Cluster storage billing mode. Pay-as-you-go: 0. Monthly subscription: 1. Default: pay-as-you-go.
When `DbType` is `MYSQL` and the cluster compute billing mode is pay-as-you-go (including when `DbMode` is `SERVERLESS`), the storage billing mode can only be pay-as-you-go.
Rollback and clone do not support monthly subscription storage.
     * @param StoragePayMode Cluster storage billing mode. Pay-as-you-go: 0. Monthly subscription: 1. Default: pay-as-you-go.
When `DbType` is `MYSQL` and the cluster compute billing mode is pay-as-you-go (including when `DbMode` is `SERVERLESS`), the storage billing mode can only be pay-as-you-go.
Rollback and clone do not support monthly subscription storage.
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get Security group id array 
     * @return SecurityGroupIds Security group id array
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group id array
     * @param SecurityGroupIds Security group id array
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Alarm policy Id array 
     * @return AlarmPolicyIds Alarm policy Id array
     */
    public String [] getAlarmPolicyIds() {
        return this.AlarmPolicyIds;
    }

    /**
     * Set Alarm policy Id array
     * @param AlarmPolicyIds Alarm policy Id array
     */
    public void setAlarmPolicyIds(String [] AlarmPolicyIds) {
        this.AlarmPolicyIds = AlarmPolicyIds;
    }

    /**
     * Get Parameter array. It temporarily supports `character_set_server` (utf8 | latin1 | gbk | utf8mb4) and `lower_case_table_names`. 1: not case-sensitive; 0: case-sensitive. 
     * @return ClusterParams Parameter array. It temporarily supports `character_set_server` (utf8 | latin1 | gbk | utf8mb4) and `lower_case_table_names`. 1: not case-sensitive; 0: case-sensitive.
     */
    public ParamItem [] getClusterParams() {
        return this.ClusterParams;
    }

    /**
     * Set Parameter array. It temporarily supports `character_set_server` (utf8 | latin1 | gbk | utf8mb4) and `lower_case_table_names`. 1: not case-sensitive; 0: case-sensitive.
     * @param ClusterParams Parameter array. It temporarily supports `character_set_server` (utf8 | latin1 | gbk | utf8mb4) and `lower_case_table_names`. 1: not case-sensitive; 0: case-sensitive.
     */
    public void setClusterParams(ParamItem [] ClusterParams) {
        this.ClusterParams = ClusterParams;
    }

    /**
     * Get Transaction mode. 0: Place order and pay. 1: Place order 
     * @return DealMode Transaction mode. 0: Place order and pay. 1: Place order
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set Transaction mode. 0: Place order and pay. 1: Place order
     * @param DealMode Transaction mode. 0: Place order and pay. 1: Place order
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get Parameter template ID, which can be obtained by querying parameter template information through DescribeParamTemplates. 
     * @return ParamTemplateId Parameter template ID, which can be obtained by querying parameter template information through DescribeParamTemplates.
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set Parameter template ID, which can be obtained by querying parameter template information through DescribeParamTemplates.
     * @param ParamTemplateId Parameter template ID, which can be obtained by querying parameter template information through DescribeParamTemplates.
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get Multi-az address 
     * @return SlaveZone Multi-az address
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set Multi-az address
     * @param SlaveZone Multi-az address
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get Instance initialization configuration information, primarily used for selecting different specification instances during cluster purchase. 
     * @return InstanceInitInfos Instance initialization configuration information, primarily used for selecting different specification instances during cluster purchase.
     */
    public IntegrateInstanceInfo [] getInstanceInitInfos() {
        return this.InstanceInitInfos;
    }

    /**
     * Set Instance initialization configuration information, primarily used for selecting different specification instances during cluster purchase.
     * @param InstanceInitInfos Instance initialization configuration information, primarily used for selecting different specification instances during cluster purchase.
     */
    public void setInstanceInitInfos(IntegrateInstanceInfo [] InstanceInitInfos) {
        this.InstanceInitInfos = InstanceInitInfos;
    }

    /**
     * Get Global database unique ID 
     * @return GdnId Global database unique ID
     */
    public String getGdnId() {
        return this.GdnId;
    }

    /**
     * Set Global database unique ID
     * @param GdnId Global database unique ID
     */
    public void setGdnId(String GdnId) {
        this.GdnId = GdnId;
    }

    /**
     * Get Database proxy configuration 
     * @return ProxyConfig Database proxy configuration
     */
    public ProxyConfigInfo getProxyConfig() {
        return this.ProxyConfig;
    }

    /**
     * Set Database proxy configuration
     * @param ProxyConfig Database proxy configuration
     */
    public void setProxyConfig(ProxyConfigInfo ProxyConfig) {
        this.ProxyConfig = ProxyConfig;
    }

    /**
     * Get Whether to automatically archive 
     * @return AutoArchive Whether to automatically archive
     */
    public String getAutoArchive() {
        return this.AutoArchive;
    }

    /**
     * Set Whether to automatically archive
     * @param AutoArchive Whether to automatically archive
     */
    public void setAutoArchive(String AutoArchive) {
        this.AutoArchive = AutoArchive;
    }

    /**
     * Get Archiving processing time after pausing 
     * @return AutoArchiveDelayHours Archiving processing time after pausing
     */
    public Long getAutoArchiveDelayHours() {
        return this.AutoArchiveDelayHours;
    }

    /**
     * Set Archiving processing time after pausing
     * @param AutoArchiveDelayHours Archiving processing time after pausing
     */
    public void setAutoArchiveDelayHours(Long AutoArchiveDelayHours) {
        this.AutoArchiveDelayHours = AutoArchiveDelayHours;
    }

    /**
     * Get Encryption method (consists of the encryption algorithm and key pair version) 
     * @return EncryptMethod Encryption method (consists of the encryption algorithm and key pair version)
     */
    public String getEncryptMethod() {
        return this.EncryptMethod;
    }

    /**
     * Set Encryption method (consists of the encryption algorithm and key pair version)
     * @param EncryptMethod Encryption method (consists of the encryption algorithm and key pair version)
     */
    public void setEncryptMethod(String EncryptMethod) {
        this.EncryptMethod = EncryptMethod;
    }

    /**
     * Get Integrated cluster configuration information 
     * @return IntegrateCreateClusterConfig Integrated cluster configuration information
     */
    public IntegrateCreateClusterConfig getIntegrateCreateClusterConfig() {
        return this.IntegrateCreateClusterConfig;
    }

    /**
     * Set Integrated cluster configuration information
     * @param IntegrateCreateClusterConfig Integrated cluster configuration information
     */
    public void setIntegrateCreateClusterConfig(IntegrateCreateClusterConfig IntegrateCreateClusterConfig) {
        this.IntegrateCreateClusterConfig = IntegrateCreateClusterConfig;
    }

    /**
     * Get Storage architecture type. Enumeration values: 1.0/2.0. Default value: 1.0 
     * @return StorageVersion Storage architecture type. Enumeration values: 1.0/2.0. Default value: 1.0
     */
    public String getStorageVersion() {
        return this.StorageVersion;
    }

    /**
     * Set Storage architecture type. Enumeration values: 1.0/2.0. Default value: 1.0
     * @param StorageVersion Storage architecture type. Enumeration values: 1.0/2.0. Default value: 1.0
     */
    public void setStorageVersion(String StorageVersion) {
        this.StorageVersion = StorageVersion;
    }

    public CreateIntegrateClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIntegrateClusterRequest(CreateIntegrateClusterRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.AdminPassword != null) {
            this.AdminPassword = new String(source.AdminPassword);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.StoragePayMode != null) {
            this.StoragePayMode = new Long(source.StoragePayMode);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.AlarmPolicyIds != null) {
            this.AlarmPolicyIds = new String[source.AlarmPolicyIds.length];
            for (int i = 0; i < source.AlarmPolicyIds.length; i++) {
                this.AlarmPolicyIds[i] = new String(source.AlarmPolicyIds[i]);
            }
        }
        if (source.ClusterParams != null) {
            this.ClusterParams = new ParamItem[source.ClusterParams.length];
            for (int i = 0; i < source.ClusterParams.length; i++) {
                this.ClusterParams[i] = new ParamItem(source.ClusterParams[i]);
            }
        }
        if (source.DealMode != null) {
            this.DealMode = new Long(source.DealMode);
        }
        if (source.ParamTemplateId != null) {
            this.ParamTemplateId = new Long(source.ParamTemplateId);
        }
        if (source.SlaveZone != null) {
            this.SlaveZone = new String(source.SlaveZone);
        }
        if (source.InstanceInitInfos != null) {
            this.InstanceInitInfos = new IntegrateInstanceInfo[source.InstanceInitInfos.length];
            for (int i = 0; i < source.InstanceInitInfos.length; i++) {
                this.InstanceInitInfos[i] = new IntegrateInstanceInfo(source.InstanceInitInfos[i]);
            }
        }
        if (source.GdnId != null) {
            this.GdnId = new String(source.GdnId);
        }
        if (source.ProxyConfig != null) {
            this.ProxyConfig = new ProxyConfigInfo(source.ProxyConfig);
        }
        if (source.AutoArchive != null) {
            this.AutoArchive = new String(source.AutoArchive);
        }
        if (source.AutoArchiveDelayHours != null) {
            this.AutoArchiveDelayHours = new Long(source.AutoArchiveDelayHours);
        }
        if (source.EncryptMethod != null) {
            this.EncryptMethod = new String(source.EncryptMethod);
        }
        if (source.IntegrateCreateClusterConfig != null) {
            this.IntegrateCreateClusterConfig = new IntegrateCreateClusterConfig(source.IntegrateCreateClusterConfig);
        }
        if (source.StorageVersion != null) {
            this.StorageVersion = new String(source.StorageVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "StoragePayMode", this.StoragePayMode);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArraySimple(map, prefix + "AlarmPolicyIds.", this.AlarmPolicyIds);
        this.setParamArrayObj(map, prefix + "ClusterParams.", this.ClusterParams);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);
        this.setParamSimple(map, prefix + "ParamTemplateId", this.ParamTemplateId);
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamArrayObj(map, prefix + "InstanceInitInfos.", this.InstanceInitInfos);
        this.setParamSimple(map, prefix + "GdnId", this.GdnId);
        this.setParamObj(map, prefix + "ProxyConfig.", this.ProxyConfig);
        this.setParamSimple(map, prefix + "AutoArchive", this.AutoArchive);
        this.setParamSimple(map, prefix + "AutoArchiveDelayHours", this.AutoArchiveDelayHours);
        this.setParamSimple(map, prefix + "EncryptMethod", this.EncryptMethod);
        this.setParamObj(map, prefix + "IntegrateCreateClusterConfig.", this.IntegrateCreateClusterConfig);
        this.setParamSimple(map, prefix + "StorageVersion", this.StorageVersion);

    }
}

