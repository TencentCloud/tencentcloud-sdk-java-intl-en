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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstance extends AbstractModel{

    /**
    * Instance region such as ap-guangzhou, which corresponds to the `Region` field of `RegionSet`
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance AZ such as ap-guangzhou-3, which corresponds to the `Zone` field of `ZoneSet`
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * SubnetId
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Instance ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Instance name
    */
    @SerializedName("DBInstanceName")
    @Expose
    private String DBInstanceName;

    /**
    * Instance status
    */
    @SerializedName("DBInstanceStatus")
    @Expose
    private String DBInstanceStatus;

    /**
    * Assigned instance memory size in GB
    */
    @SerializedName("DBInstanceMemory")
    @Expose
    private Long DBInstanceMemory;

    /**
    * Assigned instance storage capacity in GB
    */
    @SerializedName("DBInstanceStorage")
    @Expose
    private Long DBInstanceStorage;

    /**
    * Number of assigned CPUs
    */
    @SerializedName("DBInstanceCpu")
    @Expose
    private Long DBInstanceCpu;

    /**
    * Purchasable specification ID
    */
    @SerializedName("DBInstanceClass")
    @Expose
    private String DBInstanceClass;

    /**
    * Instance type. 1: primary (master instance), 2: readonly (read-only instance), 3: guard (disaster recovery instance), 4: temp (temp instance)
    */
    @SerializedName("DBInstanceType")
    @Expose
    private String DBInstanceType;

    /**
    * Instance edition. Currently, only `standard` edition (dual-server high-availability one-master-one-slave edition) is supported
    */
    @SerializedName("DBInstanceVersion")
    @Expose
    private String DBInstanceVersion;

    /**
    * Instance database character set
    */
    @SerializedName("DBCharset")
    @Expose
    private String DBCharset;

    /**
    * PostgreSQL kernel version
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * Instance creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Instance last modified time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Instance expiration time
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Instance isolation time
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * Billing mode. postpaid: pay-as-you-go
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * Whether to renew automatically. 1: yes, 0: no
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * Instance network connection information
    */
    @SerializedName("DBInstanceNetInfo")
    @Expose
    private DBInstanceNetInfo [] DBInstanceNetInfo;

    /**
    * Machine type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * User `AppId`
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Instance `Uid`
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * Whether the instance supports IPv6 address access. Valid values: 1 (yes), 0 (no)
    */
    @SerializedName("SupportIpv6")
    @Expose
    private Long SupportIpv6;

    /**
    * The information of tags associated with instances.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * Primary instance information, which is returned only when the instance is read-only
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MasterDBInstanceId")
    @Expose
    private String MasterDBInstanceId;

    /**
    * Number of read-only instances
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReadOnlyInstanceNum")
    @Expose
    private Long ReadOnlyInstanceNum;

    /**
    * The status of a instance in a read-only group
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusInReadonlyGroup")
    @Expose
    private String StatusInReadonlyGroup;

    /**
    * Elimination time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OfflineTime")
    @Expose
    private String OfflineTime;

    /**
     * Get Instance region such as ap-guangzhou, which corresponds to the `Region` field of `RegionSet` 
     * @return Region Instance region such as ap-guangzhou, which corresponds to the `Region` field of `RegionSet`
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region such as ap-guangzhou, which corresponds to the `Region` field of `RegionSet`
     * @param Region Instance region such as ap-guangzhou, which corresponds to the `Region` field of `RegionSet`
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance AZ such as ap-guangzhou-3, which corresponds to the `Zone` field of `ZoneSet` 
     * @return Zone Instance AZ such as ap-guangzhou-3, which corresponds to the `Zone` field of `ZoneSet`
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ such as ap-guangzhou-3, which corresponds to the `Zone` field of `ZoneSet`
     * @param Zone Instance AZ such as ap-guangzhou-3, which corresponds to the `Zone` field of `ZoneSet`
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
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
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get SubnetId 
     * @return SubnetId SubnetId
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set SubnetId
     * @param SubnetId SubnetId
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Instance ID 
     * @return DBInstanceId Instance ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID
     * @param DBInstanceId Instance ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Instance name 
     * @return DBInstanceName Instance name
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * Set Instance name
     * @param DBInstanceName Instance name
     */
    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    /**
     * Get Instance status 
     * @return DBInstanceStatus Instance status
     */
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    /**
     * Set Instance status
     * @param DBInstanceStatus Instance status
     */
    public void setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
    }

    /**
     * Get Assigned instance memory size in GB 
     * @return DBInstanceMemory Assigned instance memory size in GB
     */
    public Long getDBInstanceMemory() {
        return this.DBInstanceMemory;
    }

    /**
     * Set Assigned instance memory size in GB
     * @param DBInstanceMemory Assigned instance memory size in GB
     */
    public void setDBInstanceMemory(Long DBInstanceMemory) {
        this.DBInstanceMemory = DBInstanceMemory;
    }

    /**
     * Get Assigned instance storage capacity in GB 
     * @return DBInstanceStorage Assigned instance storage capacity in GB
     */
    public Long getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * Set Assigned instance storage capacity in GB
     * @param DBInstanceStorage Assigned instance storage capacity in GB
     */
    public void setDBInstanceStorage(Long DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
    }

    /**
     * Get Number of assigned CPUs 
     * @return DBInstanceCpu Number of assigned CPUs
     */
    public Long getDBInstanceCpu() {
        return this.DBInstanceCpu;
    }

    /**
     * Set Number of assigned CPUs
     * @param DBInstanceCpu Number of assigned CPUs
     */
    public void setDBInstanceCpu(Long DBInstanceCpu) {
        this.DBInstanceCpu = DBInstanceCpu;
    }

    /**
     * Get Purchasable specification ID 
     * @return DBInstanceClass Purchasable specification ID
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * Set Purchasable specification ID
     * @param DBInstanceClass Purchasable specification ID
     */
    public void setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
    }

    /**
     * Get Instance type. 1: primary (master instance), 2: readonly (read-only instance), 3: guard (disaster recovery instance), 4: temp (temp instance) 
     * @return DBInstanceType Instance type. 1: primary (master instance), 2: readonly (read-only instance), 3: guard (disaster recovery instance), 4: temp (temp instance)
     */
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    /**
     * Set Instance type. 1: primary (master instance), 2: readonly (read-only instance), 3: guard (disaster recovery instance), 4: temp (temp instance)
     * @param DBInstanceType Instance type. 1: primary (master instance), 2: readonly (read-only instance), 3: guard (disaster recovery instance), 4: temp (temp instance)
     */
    public void setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
    }

    /**
     * Get Instance edition. Currently, only `standard` edition (dual-server high-availability one-master-one-slave edition) is supported 
     * @return DBInstanceVersion Instance edition. Currently, only `standard` edition (dual-server high-availability one-master-one-slave edition) is supported
     */
    public String getDBInstanceVersion() {
        return this.DBInstanceVersion;
    }

    /**
     * Set Instance edition. Currently, only `standard` edition (dual-server high-availability one-master-one-slave edition) is supported
     * @param DBInstanceVersion Instance edition. Currently, only `standard` edition (dual-server high-availability one-master-one-slave edition) is supported
     */
    public void setDBInstanceVersion(String DBInstanceVersion) {
        this.DBInstanceVersion = DBInstanceVersion;
    }

    /**
     * Get Instance database character set 
     * @return DBCharset Instance database character set
     */
    public String getDBCharset() {
        return this.DBCharset;
    }

    /**
     * Set Instance database character set
     * @param DBCharset Instance database character set
     */
    public void setDBCharset(String DBCharset) {
        this.DBCharset = DBCharset;
    }

    /**
     * Get PostgreSQL kernel version 
     * @return DBVersion PostgreSQL kernel version
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set PostgreSQL kernel version
     * @param DBVersion PostgreSQL kernel version
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get Instance creation time 
     * @return CreateTime Instance creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Instance creation time
     * @param CreateTime Instance creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Instance last modified time 
     * @return UpdateTime Instance last modified time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Instance last modified time
     * @param UpdateTime Instance last modified time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Instance expiration time 
     * @return ExpireTime Instance expiration time
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Instance expiration time
     * @param ExpireTime Instance expiration time
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Instance isolation time 
     * @return IsolatedTime Instance isolation time
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set Instance isolation time
     * @param IsolatedTime Instance isolation time
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get Billing mode. postpaid: pay-as-you-go 
     * @return PayType Billing mode. postpaid: pay-as-you-go
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set Billing mode. postpaid: pay-as-you-go
     * @param PayType Billing mode. postpaid: pay-as-you-go
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Whether to renew automatically. 1: yes, 0: no 
     * @return AutoRenew Whether to renew automatically. 1: yes, 0: no
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set Whether to renew automatically. 1: yes, 0: no
     * @param AutoRenew Whether to renew automatically. 1: yes, 0: no
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get Instance network connection information 
     * @return DBInstanceNetInfo Instance network connection information
     */
    public DBInstanceNetInfo [] getDBInstanceNetInfo() {
        return this.DBInstanceNetInfo;
    }

    /**
     * Set Instance network connection information
     * @param DBInstanceNetInfo Instance network connection information
     */
    public void setDBInstanceNetInfo(DBInstanceNetInfo [] DBInstanceNetInfo) {
        this.DBInstanceNetInfo = DBInstanceNetInfo;
    }

    /**
     * Get Machine type 
     * @return Type Machine type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Machine type
     * @param Type Machine type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get User `AppId` 
     * @return AppId User `AppId`
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User `AppId`
     * @param AppId User `AppId`
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Instance `Uid` 
     * @return Uid Instance `Uid`
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set Instance `Uid`
     * @param Uid Instance `Uid`
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Whether the instance supports IPv6 address access. Valid values: 1 (yes), 0 (no) 
     * @return SupportIpv6 Whether the instance supports IPv6 address access. Valid values: 1 (yes), 0 (no)
     */
    public Long getSupportIpv6() {
        return this.SupportIpv6;
    }

    /**
     * Set Whether the instance supports IPv6 address access. Valid values: 1 (yes), 0 (no)
     * @param SupportIpv6 Whether the instance supports IPv6 address access. Valid values: 1 (yes), 0 (no)
     */
    public void setSupportIpv6(Long SupportIpv6) {
        this.SupportIpv6 = SupportIpv6;
    }

    /**
     * Get The information of tags associated with instances.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TagList The information of tags associated with instances.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set The information of tags associated with instances.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TagList The information of tags associated with instances.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Primary instance information, which is returned only when the instance is read-only
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MasterDBInstanceId Primary instance information, which is returned only when the instance is read-only
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMasterDBInstanceId() {
        return this.MasterDBInstanceId;
    }

    /**
     * Set Primary instance information, which is returned only when the instance is read-only
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MasterDBInstanceId Primary instance information, which is returned only when the instance is read-only
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMasterDBInstanceId(String MasterDBInstanceId) {
        this.MasterDBInstanceId = MasterDBInstanceId;
    }

    /**
     * Get Number of read-only instances
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ReadOnlyInstanceNum Number of read-only instances
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getReadOnlyInstanceNum() {
        return this.ReadOnlyInstanceNum;
    }

    /**
     * Set Number of read-only instances
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ReadOnlyInstanceNum Number of read-only instances
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReadOnlyInstanceNum(Long ReadOnlyInstanceNum) {
        this.ReadOnlyInstanceNum = ReadOnlyInstanceNum;
    }

    /**
     * Get The status of a instance in a read-only group
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StatusInReadonlyGroup The status of a instance in a read-only group
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStatusInReadonlyGroup() {
        return this.StatusInReadonlyGroup;
    }

    /**
     * Set The status of a instance in a read-only group
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StatusInReadonlyGroup The status of a instance in a read-only group
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusInReadonlyGroup(String StatusInReadonlyGroup) {
        this.StatusInReadonlyGroup = StatusInReadonlyGroup;
    }

    /**
     * Get Elimination time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OfflineTime Elimination time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getOfflineTime() {
        return this.OfflineTime;
    }

    /**
     * Set Elimination time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OfflineTime Elimination time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOfflineTime(String OfflineTime) {
        this.OfflineTime = OfflineTime;
    }

    public DBInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBInstance(DBInstance source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.DBInstanceName != null) {
            this.DBInstanceName = new String(source.DBInstanceName);
        }
        if (source.DBInstanceStatus != null) {
            this.DBInstanceStatus = new String(source.DBInstanceStatus);
        }
        if (source.DBInstanceMemory != null) {
            this.DBInstanceMemory = new Long(source.DBInstanceMemory);
        }
        if (source.DBInstanceStorage != null) {
            this.DBInstanceStorage = new Long(source.DBInstanceStorage);
        }
        if (source.DBInstanceCpu != null) {
            this.DBInstanceCpu = new Long(source.DBInstanceCpu);
        }
        if (source.DBInstanceClass != null) {
            this.DBInstanceClass = new String(source.DBInstanceClass);
        }
        if (source.DBInstanceType != null) {
            this.DBInstanceType = new String(source.DBInstanceType);
        }
        if (source.DBInstanceVersion != null) {
            this.DBInstanceVersion = new String(source.DBInstanceVersion);
        }
        if (source.DBCharset != null) {
            this.DBCharset = new String(source.DBCharset);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.DBInstanceNetInfo != null) {
            this.DBInstanceNetInfo = new DBInstanceNetInfo[source.DBInstanceNetInfo.length];
            for (int i = 0; i < source.DBInstanceNetInfo.length; i++) {
                this.DBInstanceNetInfo[i] = new DBInstanceNetInfo(source.DBInstanceNetInfo[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uid != null) {
            this.Uid = new Long(source.Uid);
        }
        if (source.SupportIpv6 != null) {
            this.SupportIpv6 = new Long(source.SupportIpv6);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.MasterDBInstanceId != null) {
            this.MasterDBInstanceId = new String(source.MasterDBInstanceId);
        }
        if (source.ReadOnlyInstanceNum != null) {
            this.ReadOnlyInstanceNum = new Long(source.ReadOnlyInstanceNum);
        }
        if (source.StatusInReadonlyGroup != null) {
            this.StatusInReadonlyGroup = new String(source.StatusInReadonlyGroup);
        }
        if (source.OfflineTime != null) {
            this.OfflineTime = new String(source.OfflineTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "DBInstanceName", this.DBInstanceName);
        this.setParamSimple(map, prefix + "DBInstanceStatus", this.DBInstanceStatus);
        this.setParamSimple(map, prefix + "DBInstanceMemory", this.DBInstanceMemory);
        this.setParamSimple(map, prefix + "DBInstanceStorage", this.DBInstanceStorage);
        this.setParamSimple(map, prefix + "DBInstanceCpu", this.DBInstanceCpu);
        this.setParamSimple(map, prefix + "DBInstanceClass", this.DBInstanceClass);
        this.setParamSimple(map, prefix + "DBInstanceType", this.DBInstanceType);
        this.setParamSimple(map, prefix + "DBInstanceVersion", this.DBInstanceVersion);
        this.setParamSimple(map, prefix + "DBCharset", this.DBCharset);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamArrayObj(map, prefix + "DBInstanceNetInfo.", this.DBInstanceNetInfo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "SupportIpv6", this.SupportIpv6);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "MasterDBInstanceId", this.MasterDBInstanceId);
        this.setParamSimple(map, prefix + "ReadOnlyInstanceNum", this.ReadOnlyInstanceNum);
        this.setParamSimple(map, prefix + "StatusInReadonlyGroup", this.StatusInReadonlyGroup);
        this.setParamSimple(map, prefix + "OfflineTime", this.OfflineTime);

    }
}

