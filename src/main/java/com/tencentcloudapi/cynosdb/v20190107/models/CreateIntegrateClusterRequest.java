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
    * Specifies the ID of the VPC network it belongs to.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Database version. valid values:. 
<li>Specifies the available values for MYSQL: 5.7, 8.0.</li>.
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
    * Cluster name, length less than 64 characters. each character value ranges from uppercase/lowercase letters, digits, special symbols ('-','_','.').
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Account password (8-64 characters, a combination of uppercase and lowercase letters, digits and symbols ~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/ with any three types).
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * Port, default 3306, in the range of [0, 65535).
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Billing mode. 0: pay-as-you-go; 1: monthly subscription. default is pay-as-you-go.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Number of clusters to purchase. value range: [1,3]. default is 1.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Maximum storage limit of a regular instance, in GB.
When DbType is MYSQL and the storage billing mode is prepaid, this parameter should not exceed the maximum storage specification corresponding to cpu and memory.
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * Specifies the annual and monthly subscription duration.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Specifies the measurement unit for annual and monthly subscription duration. valid values: 's', 'd', 'm', 'y'.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Whether annual/monthly subscription is auto-renewed. default value is 0.
0 identifies the default renewal method, 1 means auto-renew, 2 indicates no auto-renewal.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Whether to automatically select a voucher. 1: yes; 0: no. default value: 0.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Specifies the tag array information that needs to be bound during cluster creation.
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * Specifies the cluster storage billing mode. 0: pay-as-you-go; 1: monthly subscription. default is pay-as-you-go.
When DbType is MYSQL and the cluster billing mode for computing is postpaid (including DbMode as SERVERLESS), the storage billing mode can only be pay-as-you-go.
Rollback and clone do not support monthly subscription storage.
    */
    @SerializedName("StoragePayMode")
    @Expose
    private Long StoragePayMode;

    /**
    * Security group id array.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Specifies the Alarm policy Id array.
    */
    @SerializedName("AlarmPolicyIds")
    @Expose
    private String [] AlarmPolicyIds;

    /**
    * Parameter array, temporarily supports character_set_server (utf8|latin1|gbk|utf8mb4), lower_case_table_names. valid values: 1 (case-insensitive), 0 (case-sensitive).
    */
    @SerializedName("ClusterParams")
    @Expose
    private ParamItem [] ClusterParams;

    /**
    * Transaction mode. valid values: 0 (place order and pay), 1 (place order).
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
    * Parameter template ID. can be obtained through querying parameter template information DescribeParamTemplates.
    */
    @SerializedName("ParamTemplateId")
    @Expose
    private Long ParamTemplateId;

    /**
    * Multi-AZ address.
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * Initializes configuration information, mainly used to purchase clusters with different specification instances.
    */
    @SerializedName("InstanceInitInfos")
    @Expose
    private IntegrateInstanceInfo [] InstanceInitInfos;

    /**
    * Global database unique identifier.
    */
    @SerializedName("GdnId")
    @Expose
    private String GdnId;

    /**
    * Database proxy configuration.
    */
    @SerializedName("ProxyConfig")
    @Expose
    private ProxyConfigInfo ProxyConfig;

    /**
    * Specifies whether to automatically archive.
    */
    @SerializedName("AutoArchive")
    @Expose
    private String AutoArchive;

    /**
    * Processing time after pausing.
    */
    @SerializedName("AutoArchiveDelayHours")
    @Expose
    private Long AutoArchiveDelayHours;

    /**
    * Encryption method (consists of encryption algorithm and key pair version).
    */
    @SerializedName("EncryptMethod")
    @Expose
    private String EncryptMethod;

    /**
    * Describes the cluster configuration information.
    */
    @SerializedName("IntegrateCreateClusterConfig")
    @Expose
    private IntegrateCreateClusterConfig IntegrateCreateClusterConfig;

    /**
    * Storage architecture type. valid values: 1.0/2.0. default value: 1.0.
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
     * Get Specifies the ID of the VPC network it belongs to. 
     * @return VpcId Specifies the ID of the VPC network it belongs to.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Specifies the ID of the VPC network it belongs to.
     * @param VpcId Specifies the ID of the VPC network it belongs to.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID. 
     * @return SubnetId Subnet ID.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID.
     * @param SubnetId Subnet ID.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Database version. valid values:. 
<li>Specifies the available values for MYSQL: 5.7, 8.0.</li>. 
     * @return DbVersion Database version. valid values:. 
<li>Specifies the available values for MYSQL: 5.7, 8.0.</li>.
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set Database version. valid values:. 
<li>Specifies the available values for MYSQL: 5.7, 8.0.</li>.
     * @param DbVersion Database version. valid values:. 
<li>Specifies the available values for MYSQL: 5.7, 8.0.</li>.
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
     * Get Cluster name, length less than 64 characters. each character value ranges from uppercase/lowercase letters, digits, special symbols ('-','_','.'). 
     * @return ClusterName Cluster name, length less than 64 characters. each character value ranges from uppercase/lowercase letters, digits, special symbols ('-','_','.').
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name, length less than 64 characters. each character value ranges from uppercase/lowercase letters, digits, special symbols ('-','_','.').
     * @param ClusterName Cluster name, length less than 64 characters. each character value ranges from uppercase/lowercase letters, digits, special symbols ('-','_','.').
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Account password (8-64 characters, a combination of uppercase and lowercase letters, digits and symbols ~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/ with any three types). 
     * @return AdminPassword Account password (8-64 characters, a combination of uppercase and lowercase letters, digits and symbols ~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/ with any three types).
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set Account password (8-64 characters, a combination of uppercase and lowercase letters, digits and symbols ~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/ with any three types).
     * @param AdminPassword Account password (8-64 characters, a combination of uppercase and lowercase letters, digits and symbols ~!@#$%^&*_-+=`|\(){}[]:;'<>,.?/ with any three types).
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get Port, default 3306, in the range of [0, 65535). 
     * @return Port Port, default 3306, in the range of [0, 65535).
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port, default 3306, in the range of [0, 65535).
     * @param Port Port, default 3306, in the range of [0, 65535).
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Billing mode. 0: pay-as-you-go; 1: monthly subscription. default is pay-as-you-go. 
     * @return PayMode Billing mode. 0: pay-as-you-go; 1: monthly subscription. default is pay-as-you-go.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. 0: pay-as-you-go; 1: monthly subscription. default is pay-as-you-go.
     * @param PayMode Billing mode. 0: pay-as-you-go; 1: monthly subscription. default is pay-as-you-go.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Number of clusters to purchase. value range: [1,3]. default is 1. 
     * @return Count Number of clusters to purchase. value range: [1,3]. default is 1.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of clusters to purchase. value range: [1,3]. default is 1.
     * @param Count Number of clusters to purchase. value range: [1,3]. default is 1.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Maximum storage limit of a regular instance, in GB.
When DbType is MYSQL and the storage billing mode is prepaid, this parameter should not exceed the maximum storage specification corresponding to cpu and memory. 
     * @return StorageLimit Maximum storage limit of a regular instance, in GB.
When DbType is MYSQL and the storage billing mode is prepaid, this parameter should not exceed the maximum storage specification corresponding to cpu and memory.
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set Maximum storage limit of a regular instance, in GB.
When DbType is MYSQL and the storage billing mode is prepaid, this parameter should not exceed the maximum storage specification corresponding to cpu and memory.
     * @param StorageLimit Maximum storage limit of a regular instance, in GB.
When DbType is MYSQL and the storage billing mode is prepaid, this parameter should not exceed the maximum storage specification corresponding to cpu and memory.
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get Specifies the annual and monthly subscription duration. 
     * @return TimeSpan Specifies the annual and monthly subscription duration.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Specifies the annual and monthly subscription duration.
     * @param TimeSpan Specifies the annual and monthly subscription duration.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Specifies the measurement unit for annual and monthly subscription duration. valid values: 's', 'd', 'm', 'y'. 
     * @return TimeUnit Specifies the measurement unit for annual and monthly subscription duration. valid values: 's', 'd', 'm', 'y'.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Specifies the measurement unit for annual and monthly subscription duration. valid values: 's', 'd', 'm', 'y'.
     * @param TimeUnit Specifies the measurement unit for annual and monthly subscription duration. valid values: 's', 'd', 'm', 'y'.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Whether annual/monthly subscription is auto-renewed. default value is 0.
0 identifies the default renewal method, 1 means auto-renew, 2 indicates no auto-renewal. 
     * @return AutoRenewFlag Whether annual/monthly subscription is auto-renewed. default value is 0.
0 identifies the default renewal method, 1 means auto-renew, 2 indicates no auto-renewal.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether annual/monthly subscription is auto-renewed. default value is 0.
0 identifies the default renewal method, 1 means auto-renew, 2 indicates no auto-renewal.
     * @param AutoRenewFlag Whether annual/monthly subscription is auto-renewed. default value is 0.
0 identifies the default renewal method, 1 means auto-renew, 2 indicates no auto-renewal.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Whether to automatically select a voucher. 1: yes; 0: no. default value: 0. 
     * @return AutoVoucher Whether to automatically select a voucher. 1: yes; 0: no. default value: 0.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically select a voucher. 1: yes; 0: no. default value: 0.
     * @param AutoVoucher Whether to automatically select a voucher. 1: yes; 0: no. default value: 0.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Specifies the tag array information that needs to be bound during cluster creation. 
     * @return ResourceTags Specifies the tag array information that needs to be bound during cluster creation.
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Specifies the tag array information that needs to be bound during cluster creation.
     * @param ResourceTags Specifies the tag array information that needs to be bound during cluster creation.
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get Specifies the cluster storage billing mode. 0: pay-as-you-go; 1: monthly subscription. default is pay-as-you-go.
When DbType is MYSQL and the cluster billing mode for computing is postpaid (including DbMode as SERVERLESS), the storage billing mode can only be pay-as-you-go.
Rollback and clone do not support monthly subscription storage. 
     * @return StoragePayMode Specifies the cluster storage billing mode. 0: pay-as-you-go; 1: monthly subscription. default is pay-as-you-go.
When DbType is MYSQL and the cluster billing mode for computing is postpaid (including DbMode as SERVERLESS), the storage billing mode can only be pay-as-you-go.
Rollback and clone do not support monthly subscription storage.
     */
    public Long getStoragePayMode() {
        return this.StoragePayMode;
    }

    /**
     * Set Specifies the cluster storage billing mode. 0: pay-as-you-go; 1: monthly subscription. default is pay-as-you-go.
When DbType is MYSQL and the cluster billing mode for computing is postpaid (including DbMode as SERVERLESS), the storage billing mode can only be pay-as-you-go.
Rollback and clone do not support monthly subscription storage.
     * @param StoragePayMode Specifies the cluster storage billing mode. 0: pay-as-you-go; 1: monthly subscription. default is pay-as-you-go.
When DbType is MYSQL and the cluster billing mode for computing is postpaid (including DbMode as SERVERLESS), the storage billing mode can only be pay-as-you-go.
Rollback and clone do not support monthly subscription storage.
     */
    public void setStoragePayMode(Long StoragePayMode) {
        this.StoragePayMode = StoragePayMode;
    }

    /**
     * Get Security group id array. 
     * @return SecurityGroupIds Security group id array.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group id array.
     * @param SecurityGroupIds Security group id array.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Specifies the Alarm policy Id array. 
     * @return AlarmPolicyIds Specifies the Alarm policy Id array.
     */
    public String [] getAlarmPolicyIds() {
        return this.AlarmPolicyIds;
    }

    /**
     * Set Specifies the Alarm policy Id array.
     * @param AlarmPolicyIds Specifies the Alarm policy Id array.
     */
    public void setAlarmPolicyIds(String [] AlarmPolicyIds) {
        this.AlarmPolicyIds = AlarmPolicyIds;
    }

    /**
     * Get Parameter array, temporarily supports character_set_server (utf8|latin1|gbk|utf8mb4), lower_case_table_names. valid values: 1 (case-insensitive), 0 (case-sensitive). 
     * @return ClusterParams Parameter array, temporarily supports character_set_server (utf8|latin1|gbk|utf8mb4), lower_case_table_names. valid values: 1 (case-insensitive), 0 (case-sensitive).
     */
    public ParamItem [] getClusterParams() {
        return this.ClusterParams;
    }

    /**
     * Set Parameter array, temporarily supports character_set_server (utf8|latin1|gbk|utf8mb4), lower_case_table_names. valid values: 1 (case-insensitive), 0 (case-sensitive).
     * @param ClusterParams Parameter array, temporarily supports character_set_server (utf8|latin1|gbk|utf8mb4), lower_case_table_names. valid values: 1 (case-insensitive), 0 (case-sensitive).
     */
    public void setClusterParams(ParamItem [] ClusterParams) {
        this.ClusterParams = ClusterParams;
    }

    /**
     * Get Transaction mode. valid values: 0 (place order and pay), 1 (place order). 
     * @return DealMode Transaction mode. valid values: 0 (place order and pay), 1 (place order).
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set Transaction mode. valid values: 0 (place order and pay), 1 (place order).
     * @param DealMode Transaction mode. valid values: 0 (place order and pay), 1 (place order).
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get Parameter template ID. can be obtained through querying parameter template information DescribeParamTemplates. 
     * @return ParamTemplateId Parameter template ID. can be obtained through querying parameter template information DescribeParamTemplates.
     */
    public Long getParamTemplateId() {
        return this.ParamTemplateId;
    }

    /**
     * Set Parameter template ID. can be obtained through querying parameter template information DescribeParamTemplates.
     * @param ParamTemplateId Parameter template ID. can be obtained through querying parameter template information DescribeParamTemplates.
     */
    public void setParamTemplateId(Long ParamTemplateId) {
        this.ParamTemplateId = ParamTemplateId;
    }

    /**
     * Get Multi-AZ address. 
     * @return SlaveZone Multi-AZ address.
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set Multi-AZ address.
     * @param SlaveZone Multi-AZ address.
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get Initializes configuration information, mainly used to purchase clusters with different specification instances. 
     * @return InstanceInitInfos Initializes configuration information, mainly used to purchase clusters with different specification instances.
     */
    public IntegrateInstanceInfo [] getInstanceInitInfos() {
        return this.InstanceInitInfos;
    }

    /**
     * Set Initializes configuration information, mainly used to purchase clusters with different specification instances.
     * @param InstanceInitInfos Initializes configuration information, mainly used to purchase clusters with different specification instances.
     */
    public void setInstanceInitInfos(IntegrateInstanceInfo [] InstanceInitInfos) {
        this.InstanceInitInfos = InstanceInitInfos;
    }

    /**
     * Get Global database unique identifier. 
     * @return GdnId Global database unique identifier.
     */
    public String getGdnId() {
        return this.GdnId;
    }

    /**
     * Set Global database unique identifier.
     * @param GdnId Global database unique identifier.
     */
    public void setGdnId(String GdnId) {
        this.GdnId = GdnId;
    }

    /**
     * Get Database proxy configuration. 
     * @return ProxyConfig Database proxy configuration.
     */
    public ProxyConfigInfo getProxyConfig() {
        return this.ProxyConfig;
    }

    /**
     * Set Database proxy configuration.
     * @param ProxyConfig Database proxy configuration.
     */
    public void setProxyConfig(ProxyConfigInfo ProxyConfig) {
        this.ProxyConfig = ProxyConfig;
    }

    /**
     * Get Specifies whether to automatically archive. 
     * @return AutoArchive Specifies whether to automatically archive.
     */
    public String getAutoArchive() {
        return this.AutoArchive;
    }

    /**
     * Set Specifies whether to automatically archive.
     * @param AutoArchive Specifies whether to automatically archive.
     */
    public void setAutoArchive(String AutoArchive) {
        this.AutoArchive = AutoArchive;
    }

    /**
     * Get Processing time after pausing. 
     * @return AutoArchiveDelayHours Processing time after pausing.
     */
    public Long getAutoArchiveDelayHours() {
        return this.AutoArchiveDelayHours;
    }

    /**
     * Set Processing time after pausing.
     * @param AutoArchiveDelayHours Processing time after pausing.
     */
    public void setAutoArchiveDelayHours(Long AutoArchiveDelayHours) {
        this.AutoArchiveDelayHours = AutoArchiveDelayHours;
    }

    /**
     * Get Encryption method (consists of encryption algorithm and key pair version). 
     * @return EncryptMethod Encryption method (consists of encryption algorithm and key pair version).
     */
    public String getEncryptMethod() {
        return this.EncryptMethod;
    }

    /**
     * Set Encryption method (consists of encryption algorithm and key pair version).
     * @param EncryptMethod Encryption method (consists of encryption algorithm and key pair version).
     */
    public void setEncryptMethod(String EncryptMethod) {
        this.EncryptMethod = EncryptMethod;
    }

    /**
     * Get Describes the cluster configuration information. 
     * @return IntegrateCreateClusterConfig Describes the cluster configuration information.
     */
    public IntegrateCreateClusterConfig getIntegrateCreateClusterConfig() {
        return this.IntegrateCreateClusterConfig;
    }

    /**
     * Set Describes the cluster configuration information.
     * @param IntegrateCreateClusterConfig Describes the cluster configuration information.
     */
    public void setIntegrateCreateClusterConfig(IntegrateCreateClusterConfig IntegrateCreateClusterConfig) {
        this.IntegrateCreateClusterConfig = IntegrateCreateClusterConfig;
    }

    /**
     * Get Storage architecture type. valid values: 1.0/2.0. default value: 1.0. 
     * @return StorageVersion Storage architecture type. valid values: 1.0/2.0. default value: 1.0.
     */
    public String getStorageVersion() {
        return this.StorageVersion;
    }

    /**
     * Set Storage architecture type. valid values: 1.0/2.0. default value: 1.0.
     * @param StorageVersion Storage architecture type. valid values: 1.0/2.0. default value: 1.0.
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

