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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBInstancesRequest extends AbstractModel {

    /**
    * Purchasable specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeClasses` API.
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * Instance capacity size in GB.
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Number of instances purchased at a time. Value range: 1-100.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Length of purchase in months. Currently, only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36 are supported.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * AZ ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * PostgreSQL community major version + minor version number.
It's generally not recommended to pass in this parameter. If needed, only the latest minor version number under the current major version can be passed.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * Instance billing type.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Whether to automatically use vouchers. 1: yes, 0: no. Default value: no.
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * Voucher ID list (only one voucher can be specified currently).
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * VPC ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC subnet ID.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Renewal flag. 0: normal renewal (default), 1: auto-renewal.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Activity ID
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * Instance name (which will be supported in the future)
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether to support IPv6 address access. Valid values: 1 (yes), 0 (no)
    */
    @SerializedName("NeedSupportIpv6")
    @Expose
    private Long NeedSupportIpv6;

    /**
    * The information of tags to be associated with instances. This parameter is left empty by default.
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * Security group ID
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * The major version number of PostgreSQL (this parameter is currently required), and the version information can be obtained from [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1). Currently major versions `10`, `11`, `12`, `13`, `14`, and `15` are supported. For details, see [Kernel Version Overview](https://intl.cloud.tencent.com/document/product/409/67018).
When this parameter is entered, an instance running the latest kernel version of the latest minor version will be created based on this major version number.
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * PostgreSQL kernel version number.
It's generally not recommended to pass in this parameter. If needed, only the latest kernel version number under the current major version can be passed.
    */
    @SerializedName("DBKernelVersion")
    @Expose
    private String DBKernelVersion;

    /**
     * Get Purchasable specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeClasses` API. 
     * @return SpecCode Purchasable specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeClasses` API.
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set Purchasable specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeClasses` API.
     * @param SpecCode Purchasable specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeClasses` API.
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get Instance capacity size in GB. 
     * @return Storage Instance capacity size in GB.
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Instance capacity size in GB.
     * @param Storage Instance capacity size in GB.
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Number of instances purchased at a time. Value range: 1-100. 
     * @return InstanceCount Number of instances purchased at a time. Value range: 1-100.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of instances purchased at a time. Value range: 1-100.
     * @param InstanceCount Number of instances purchased at a time. Value range: 1-100.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Length of purchase in months. Currently, only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36 are supported. 
     * @return Period Length of purchase in months. Currently, only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36 are supported.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Length of purchase in months. Currently, only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36 are supported.
     * @param Period Length of purchase in months. Currently, only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36 are supported.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get AZ ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API. 
     * @return Zone AZ ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API.
     * @param Zone AZ ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get PostgreSQL community major version + minor version number.
It's generally not recommended to pass in this parameter. If needed, only the latest minor version number under the current major version can be passed. 
     * @return DBVersion PostgreSQL community major version + minor version number.
It's generally not recommended to pass in this parameter. If needed, only the latest minor version number under the current major version can be passed.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set PostgreSQL community major version + minor version number.
It's generally not recommended to pass in this parameter. If needed, only the latest minor version number under the current major version can be passed.
     * @param DBVersion PostgreSQL community major version + minor version number.
It's generally not recommended to pass in this parameter. If needed, only the latest minor version number under the current major version can be passed.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get Instance billing type. 
     * @return InstanceChargeType Instance billing type.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing type.
     * @param InstanceChargeType Instance billing type.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Whether to automatically use vouchers. 1: yes, 0: no. Default value: no. 
     * @return AutoVoucher Whether to automatically use vouchers. 1: yes, 0: no. Default value: no.
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set Whether to automatically use vouchers. 1: yes, 0: no. Default value: no.
     * @param AutoVoucher Whether to automatically use vouchers. 1: yes, 0: no. Default value: no.
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get Voucher ID list (only one voucher can be specified currently). 
     * @return VoucherIds Voucher ID list (only one voucher can be specified currently).
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set Voucher ID list (only one voucher can be specified currently).
     * @param VoucherIds Voucher ID list (only one voucher can be specified currently).
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get VPC ID. 
     * @return VpcId VPC ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID.
     * @param VpcId VPC ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC subnet ID. 
     * @return SubnetId VPC subnet ID.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set VPC subnet ID.
     * @param SubnetId VPC subnet ID.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Renewal flag. 0: normal renewal (default), 1: auto-renewal. 
     * @return AutoRenewFlag Renewal flag. 0: normal renewal (default), 1: auto-renewal.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Renewal flag. 0: normal renewal (default), 1: auto-renewal.
     * @param AutoRenewFlag Renewal flag. 0: normal renewal (default), 1: auto-renewal.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Activity ID 
     * @return ActivityId Activity ID
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set Activity ID
     * @param ActivityId Activity ID
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get Instance name (which will be supported in the future) 
     * @return Name Instance name (which will be supported in the future)
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Instance name (which will be supported in the future)
     * @param Name Instance name (which will be supported in the future)
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether to support IPv6 address access. Valid values: 1 (yes), 0 (no) 
     * @return NeedSupportIpv6 Whether to support IPv6 address access. Valid values: 1 (yes), 0 (no)
     */
    public Long getNeedSupportIpv6() {
        return this.NeedSupportIpv6;
    }

    /**
     * Set Whether to support IPv6 address access. Valid values: 1 (yes), 0 (no)
     * @param NeedSupportIpv6 Whether to support IPv6 address access. Valid values: 1 (yes), 0 (no)
     */
    public void setNeedSupportIpv6(Long NeedSupportIpv6) {
        this.NeedSupportIpv6 = NeedSupportIpv6;
    }

    /**
     * Get The information of tags to be associated with instances. This parameter is left empty by default. 
     * @return TagList The information of tags to be associated with instances. This parameter is left empty by default.
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set The information of tags to be associated with instances. This parameter is left empty by default.
     * @param TagList The information of tags to be associated with instances. This parameter is left empty by default.
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Security group ID 
     * @return SecurityGroupIds Security group ID
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set Security group ID
     * @param SecurityGroupIds Security group ID
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get The major version number of PostgreSQL (this parameter is currently required), and the version information can be obtained from [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1). Currently major versions `10`, `11`, `12`, `13`, `14`, and `15` are supported. For details, see [Kernel Version Overview](https://intl.cloud.tencent.com/document/product/409/67018).
When this parameter is entered, an instance running the latest kernel version of the latest minor version will be created based on this major version number. 
     * @return DBMajorVersion The major version number of PostgreSQL (this parameter is currently required), and the version information can be obtained from [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1). Currently major versions `10`, `11`, `12`, `13`, `14`, and `15` are supported. For details, see [Kernel Version Overview](https://intl.cloud.tencent.com/document/product/409/67018).
When this parameter is entered, an instance running the latest kernel version of the latest minor version will be created based on this major version number.
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set The major version number of PostgreSQL (this parameter is currently required), and the version information can be obtained from [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1). Currently major versions `10`, `11`, `12`, `13`, `14`, and `15` are supported. For details, see [Kernel Version Overview](https://intl.cloud.tencent.com/document/product/409/67018).
When this parameter is entered, an instance running the latest kernel version of the latest minor version will be created based on this major version number.
     * @param DBMajorVersion The major version number of PostgreSQL (this parameter is currently required), and the version information can be obtained from [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1). Currently major versions `10`, `11`, `12`, `13`, `14`, and `15` are supported. For details, see [Kernel Version Overview](https://intl.cloud.tencent.com/document/product/409/67018).
When this parameter is entered, an instance running the latest kernel version of the latest minor version will be created based on this major version number.
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get PostgreSQL kernel version number.
It's generally not recommended to pass in this parameter. If needed, only the latest kernel version number under the current major version can be passed. 
     * @return DBKernelVersion PostgreSQL kernel version number.
It's generally not recommended to pass in this parameter. If needed, only the latest kernel version number under the current major version can be passed.
     */
    public String getDBKernelVersion() {
        return this.DBKernelVersion;
    }

    /**
     * Set PostgreSQL kernel version number.
It's generally not recommended to pass in this parameter. If needed, only the latest kernel version number under the current major version can be passed.
     * @param DBKernelVersion PostgreSQL kernel version number.
It's generally not recommended to pass in this parameter. If needed, only the latest kernel version number under the current major version can be passed.
     */
    public void setDBKernelVersion(String DBKernelVersion) {
        this.DBKernelVersion = DBKernelVersion;
    }

    public CreateDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBInstancesRequest(CreateDBInstancesRequest source) {
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NeedSupportIpv6 != null) {
            this.NeedSupportIpv6 = new Long(source.NeedSupportIpv6);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
        if (source.DBKernelVersion != null) {
            this.DBKernelVersion = new String(source.DBKernelVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NeedSupportIpv6", this.NeedSupportIpv6);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "DBKernelVersion", this.DBKernelVersion);

    }
}

