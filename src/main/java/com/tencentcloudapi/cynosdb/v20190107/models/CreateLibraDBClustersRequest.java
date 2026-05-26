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

public class CreateLibraDBClustersRequest extends AbstractModel {

    /**
    * Quantity.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance initialization information
    */
    @SerializedName("InstanceInitInfos")
    @Expose
    private LibraDBInstanceInitInfo [] InstanceInitInfos;

    /**
    * user password
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * Whether to perform auto-renewal.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Whether to automatically select a voucher.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Order placement mode
    */
    @SerializedName("DealMode")
    @Expose
    private String DealMode;

    /**
    * Encryption method
    */
    @SerializedName("EncryptMethod")
    @Expose
    private String EncryptMethod;

    /**
    * LibraDBVersion version. Defaults to the latest version.
    */
    @SerializedName("LibraDBVersion")
    @Expose
    private String LibraDBVersion;

    /**
    * Order Source
    */
    @SerializedName("OrderSource")
    @Expose
    private String OrderSource;

    /**
    * Payment mode
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Security group
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * Duration
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Time unit
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Instance creation binds Tag array information
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * VPC ID of the cluster location
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID of the cluster location
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Port.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
     * Get Quantity. 
     * @return Count Quantity.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Quantity.
     * @param Count Quantity.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

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
     * Get Instance initialization information 
     * @return InstanceInitInfos Instance initialization information
     */
    public LibraDBInstanceInitInfo [] getInstanceInitInfos() {
        return this.InstanceInitInfos;
    }

    /**
     * Set Instance initialization information
     * @param InstanceInitInfos Instance initialization information
     */
    public void setInstanceInitInfos(LibraDBInstanceInitInfo [] InstanceInitInfos) {
        this.InstanceInitInfos = InstanceInitInfos;
    }

    /**
     * Get user password 
     * @return AdminPassword user password
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set user password
     * @param AdminPassword user password
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get Whether to perform auto-renewal. 
     * @return AutoRenewFlag Whether to perform auto-renewal.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether to perform auto-renewal.
     * @param AutoRenewFlag Whether to perform auto-renewal.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Whether to automatically select a voucher. 
     * @return AutoVoucher Whether to automatically select a voucher.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically select a voucher.
     * @param AutoVoucher Whether to automatically select a voucher.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Cluster name. 
     * @return ClusterName Cluster name.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name.
     * @param ClusterName Cluster name.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Order placement mode 
     * @return DealMode Order placement mode
     */
    public String getDealMode() {
        return this.DealMode;
    }

    /**
     * Set Order placement mode
     * @param DealMode Order placement mode
     */
    public void setDealMode(String DealMode) {
        this.DealMode = DealMode;
    }

    /**
     * Get Encryption method 
     * @return EncryptMethod Encryption method
     */
    public String getEncryptMethod() {
        return this.EncryptMethod;
    }

    /**
     * Set Encryption method
     * @param EncryptMethod Encryption method
     */
    public void setEncryptMethod(String EncryptMethod) {
        this.EncryptMethod = EncryptMethod;
    }

    /**
     * Get LibraDBVersion version. Defaults to the latest version. 
     * @return LibraDBVersion LibraDBVersion version. Defaults to the latest version.
     */
    public String getLibraDBVersion() {
        return this.LibraDBVersion;
    }

    /**
     * Set LibraDBVersion version. Defaults to the latest version.
     * @param LibraDBVersion LibraDBVersion version. Defaults to the latest version.
     */
    public void setLibraDBVersion(String LibraDBVersion) {
        this.LibraDBVersion = LibraDBVersion;
    }

    /**
     * Get Order Source 
     * @return OrderSource Order Source
     */
    public String getOrderSource() {
        return this.OrderSource;
    }

    /**
     * Set Order Source
     * @param OrderSource Order Source
     */
    public void setOrderSource(String OrderSource) {
        this.OrderSource = OrderSource;
    }

    /**
     * Get Payment mode 
     * @return PayMode Payment mode
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode
     * @param PayMode Payment mode
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Security group 
     * @return SecurityGroupIds Security group
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group
     * @param SecurityGroupIds Security group
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get Duration 
     * @return TimeSpan Duration
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Duration
     * @param TimeSpan Duration
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Time unit 
     * @return TimeUnit Time unit
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Time unit
     * @param TimeUnit Time unit
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Instance creation binds Tag array information 
     * @return ResourceTags Instance creation binds Tag array information
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Instance creation binds Tag array information
     * @param ResourceTags Instance creation binds Tag array information
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get VPC ID of the cluster location 
     * @return VpcId VPC ID of the cluster location
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID of the cluster location
     * @param VpcId VPC ID of the cluster location
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID of the cluster location 
     * @return SubnetId Subnet ID of the cluster location
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID of the cluster location
     * @param SubnetId Subnet ID of the cluster location
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Port. 
     * @return Port Port.
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port.
     * @param Port Port.
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    public CreateLibraDBClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLibraDBClustersRequest(CreateLibraDBClustersRequest source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceInitInfos != null) {
            this.InstanceInitInfos = new LibraDBInstanceInitInfo[source.InstanceInitInfos.length];
            for (int i = 0; i < source.InstanceInitInfos.length; i++) {
                this.InstanceInitInfos[i] = new LibraDBInstanceInitInfo(source.InstanceInitInfos[i]);
            }
        }
        if (source.AdminPassword != null) {
            this.AdminPassword = new String(source.AdminPassword);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.DealMode != null) {
            this.DealMode = new String(source.DealMode);
        }
        if (source.EncryptMethod != null) {
            this.EncryptMethod = new String(source.EncryptMethod);
        }
        if (source.LibraDBVersion != null) {
            this.LibraDBVersion = new String(source.LibraDBVersion);
        }
        if (source.OrderSource != null) {
            this.OrderSource = new String(source.OrderSource);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "InstanceInitInfos.", this.InstanceInitInfos);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);
        this.setParamSimple(map, prefix + "EncryptMethod", this.EncryptMethod);
        this.setParamSimple(map, prefix + "LibraDBVersion", this.LibraDBVersion);
        this.setParamSimple(map, prefix + "OrderSource", this.OrderSource);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

