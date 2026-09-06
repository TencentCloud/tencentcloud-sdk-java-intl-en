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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStandbyDBInstanceRequest extends AbstractModel {

    /**
    * <p>Primary instance id</p>
    */
    @SerializedName("PrimaryInstanceId")
    @Expose
    private String PrimaryInstanceId;

    /**
    * <p>Creating an Instance Region</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Character type vpcid</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Character type subnetid</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Purchase specification</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>Node disk capacity (unit: GB)</p>
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * <p>Number of storage nodes</p>
    */
    @SerializedName("StorageNodeNum")
    @Expose
    private Long StorageNodeNum;

    /**
    * <p>Number of node replicas for storage, up to 5, must be an odd number</p>
    */
    @SerializedName("Replications")
    @Expose
    private Long Replications;

    /**
    * <p>Number of replicas</p>
    */
    @SerializedName("FullReplications")
    @Expose
    private Long FullReplications;

    /**
    * <p>Instance name. The required length is 1-60. It can contain Chinese characters, English case, digits, hyphens (-), and underscores (_).</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Time unit. y: year, m: month, d: day</p>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>Commodity duration size</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>CPU cores of the storage node</p>
    */
    @SerializedName("StorageNodeCpu")
    @Expose
    private Long StorageNodeCpu;

    /**
    * <p>Storage node memory size</p>
    */
    @SerializedName("StorageNodeMem")
    @Expose
    private Long StorageNodeMem;

    /**
    * <p>Payment mode. 0 means pay-as-you-go/postpaid, 1 means prepaid.</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>Custom port</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>Multi-AZ availability zone list</p>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>Whether to use a coupon.</p>
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * <p>Coupon list</p>
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
    * <p>Instance Architecture Type. "hybrid" is supported since v19.0.0</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>Disk Type, CLOUD_HSSD enhanced SSD, CLOUD_TCS local SSD disk</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>Tag key-value pair array</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>Region of the primary instance</p>
    */
    @SerializedName("PrimaryInstanceRegion")
    @Expose
    private String PrimaryInstanceRegion;

    /**
    * <p>Instance mode, normal: standard type; enhanced: enhanced</p>
    */
    @SerializedName("InstanceMode")
    @Expose
    private String InstanceMode;

    /**
    * <p>dbaadmin password</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Bind the security group id list</p>
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get <p>Primary instance id</p> 
     * @return PrimaryInstanceId <p>Primary instance id</p>
     */
    public String getPrimaryInstanceId() {
        return this.PrimaryInstanceId;
    }

    /**
     * Set <p>Primary instance id</p>
     * @param PrimaryInstanceId <p>Primary instance id</p>
     */
    public void setPrimaryInstanceId(String PrimaryInstanceId) {
        this.PrimaryInstanceId = PrimaryInstanceId;
    }

    /**
     * Get <p>Creating an Instance Region</p> 
     * @return Zone <p>Creating an Instance Region</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>Creating an Instance Region</p>
     * @param Zone <p>Creating an Instance Region</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Character type vpcid</p> 
     * @return VpcId <p>Character type vpcid</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>Character type vpcid</p>
     * @param VpcId <p>Character type vpcid</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Character type subnetid</p> 
     * @return SubnetId <p>Character type subnetid</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Character type subnetid</p>
     * @param SubnetId <p>Character type subnetid</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Purchase specification</p> 
     * @return SpecCode <p>Purchase specification</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>Purchase specification</p>
     * @param SpecCode <p>Purchase specification</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>Node disk capacity (unit: GB)</p> 
     * @return Disk <p>Node disk capacity (unit: GB)</p>
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set <p>Node disk capacity (unit: GB)</p>
     * @param Disk <p>Node disk capacity (unit: GB)</p>
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get <p>Number of storage nodes</p> 
     * @return StorageNodeNum <p>Number of storage nodes</p>
     */
    public Long getStorageNodeNum() {
        return this.StorageNodeNum;
    }

    /**
     * Set <p>Number of storage nodes</p>
     * @param StorageNodeNum <p>Number of storage nodes</p>
     */
    public void setStorageNodeNum(Long StorageNodeNum) {
        this.StorageNodeNum = StorageNodeNum;
    }

    /**
     * Get <p>Number of node replicas for storage, up to 5, must be an odd number</p> 
     * @return Replications <p>Number of node replicas for storage, up to 5, must be an odd number</p>
     */
    public Long getReplications() {
        return this.Replications;
    }

    /**
     * Set <p>Number of node replicas for storage, up to 5, must be an odd number</p>
     * @param Replications <p>Number of node replicas for storage, up to 5, must be an odd number</p>
     */
    public void setReplications(Long Replications) {
        this.Replications = Replications;
    }

    /**
     * Get <p>Number of replicas</p> 
     * @return FullReplications <p>Number of replicas</p>
     */
    public Long getFullReplications() {
        return this.FullReplications;
    }

    /**
     * Set <p>Number of replicas</p>
     * @param FullReplications <p>Number of replicas</p>
     */
    public void setFullReplications(Long FullReplications) {
        this.FullReplications = FullReplications;
    }

    /**
     * Get <p>Instance name. The required length is 1-60. It can contain Chinese characters, English case, digits, hyphens (-), and underscores (_).</p> 
     * @return InstanceName <p>Instance name. The required length is 1-60. It can contain Chinese characters, English case, digits, hyphens (-), and underscores (_).</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name. The required length is 1-60. It can contain Chinese characters, English case, digits, hyphens (-), and underscores (_).</p>
     * @param InstanceName <p>Instance name. The required length is 1-60. It can contain Chinese characters, English case, digits, hyphens (-), and underscores (_).</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Time unit. y: year, m: month, d: day</p> 
     * @return TimeUnit <p>Time unit. y: year, m: month, d: day</p>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>Time unit. y: year, m: month, d: day</p>
     * @param TimeUnit <p>Time unit. y: year, m: month, d: day</p>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>Commodity duration size</p> 
     * @return TimeSpan <p>Commodity duration size</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>Commodity duration size</p>
     * @param TimeSpan <p>Commodity duration size</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>CPU cores of the storage node</p> 
     * @return StorageNodeCpu <p>CPU cores of the storage node</p>
     */
    public Long getStorageNodeCpu() {
        return this.StorageNodeCpu;
    }

    /**
     * Set <p>CPU cores of the storage node</p>
     * @param StorageNodeCpu <p>CPU cores of the storage node</p>
     */
    public void setStorageNodeCpu(Long StorageNodeCpu) {
        this.StorageNodeCpu = StorageNodeCpu;
    }

    /**
     * Get <p>Storage node memory size</p> 
     * @return StorageNodeMem <p>Storage node memory size</p>
     */
    public Long getStorageNodeMem() {
        return this.StorageNodeMem;
    }

    /**
     * Set <p>Storage node memory size</p>
     * @param StorageNodeMem <p>Storage node memory size</p>
     */
    public void setStorageNodeMem(Long StorageNodeMem) {
        this.StorageNodeMem = StorageNodeMem;
    }

    /**
     * Get <p>Payment mode. 0 means pay-as-you-go/postpaid, 1 means prepaid.</p> 
     * @return PayMode <p>Payment mode. 0 means pay-as-you-go/postpaid, 1 means prepaid.</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Payment mode. 0 means pay-as-you-go/postpaid, 1 means prepaid.</p>
     * @param PayMode <p>Payment mode. 0 means pay-as-you-go/postpaid, 1 means prepaid.</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Custom port</p> 
     * @return Vport <p>Custom port</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>Custom port</p>
     * @param Vport <p>Custom port</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>Multi-AZ availability zone list</p> 
     * @return Zones <p>Multi-AZ availability zone list</p>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>Multi-AZ availability zone list</p>
     * @param Zones <p>Multi-AZ availability zone list</p>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get <p>Whether to use a coupon.</p> 
     * @return AutoVoucher <p>Whether to use a coupon.</p>
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set <p>Whether to use a coupon.</p>
     * @param AutoVoucher <p>Whether to use a coupon.</p>
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get <p>Coupon list</p> 
     * @return VoucherIds <p>Coupon list</p>
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set <p>Coupon list</p>
     * @param VoucherIds <p>Coupon list</p>
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * Get <p>Instance Architecture Type. "hybrid" is supported since v19.0.0</p> 
     * @return InstanceType <p>Instance Architecture Type. "hybrid" is supported since v19.0.0</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance Architecture Type. "hybrid" is supported since v19.0.0</p>
     * @param InstanceType <p>Instance Architecture Type. "hybrid" is supported since v19.0.0</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>Disk Type, CLOUD_HSSD enhanced SSD, CLOUD_TCS local SSD disk</p> 
     * @return StorageType <p>Disk Type, CLOUD_HSSD enhanced SSD, CLOUD_TCS local SSD disk</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Disk Type, CLOUD_HSSD enhanced SSD, CLOUD_TCS local SSD disk</p>
     * @param StorageType <p>Disk Type, CLOUD_HSSD enhanced SSD, CLOUD_TCS local SSD disk</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>Tag key-value pair array</p> 
     * @return ResourceTags <p>Tag key-value pair array</p>
     */
    public ResourceTag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>Tag key-value pair array</p>
     * @param ResourceTags <p>Tag key-value pair array</p>
     */
    public void setResourceTags(ResourceTag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>Region of the primary instance</p> 
     * @return PrimaryInstanceRegion <p>Region of the primary instance</p>
     */
    public String getPrimaryInstanceRegion() {
        return this.PrimaryInstanceRegion;
    }

    /**
     * Set <p>Region of the primary instance</p>
     * @param PrimaryInstanceRegion <p>Region of the primary instance</p>
     */
    public void setPrimaryInstanceRegion(String PrimaryInstanceRegion) {
        this.PrimaryInstanceRegion = PrimaryInstanceRegion;
    }

    /**
     * Get <p>Instance mode, normal: standard type; enhanced: enhanced</p> 
     * @return InstanceMode <p>Instance mode, normal: standard type; enhanced: enhanced</p>
     */
    public String getInstanceMode() {
        return this.InstanceMode;
    }

    /**
     * Set <p>Instance mode, normal: standard type; enhanced: enhanced</p>
     * @param InstanceMode <p>Instance mode, normal: standard type; enhanced: enhanced</p>
     */
    public void setInstanceMode(String InstanceMode) {
        this.InstanceMode = InstanceMode;
    }

    /**
     * Get <p>dbaadmin password</p> 
     * @return Password <p>dbaadmin password</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>dbaadmin password</p>
     * @param Password <p>dbaadmin password</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Bind the security group id list</p> 
     * @return SecurityGroupIds <p>Bind the security group id list</p>
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <p>Bind the security group id list</p>
     * @param SecurityGroupIds <p>Bind the security group id list</p>
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public CreateStandbyDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStandbyDBInstanceRequest(CreateStandbyDBInstanceRequest source) {
        if (source.PrimaryInstanceId != null) {
            this.PrimaryInstanceId = new String(source.PrimaryInstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.StorageNodeNum != null) {
            this.StorageNodeNum = new Long(source.StorageNodeNum);
        }
        if (source.Replications != null) {
            this.Replications = new Long(source.Replications);
        }
        if (source.FullReplications != null) {
            this.FullReplications = new Long(source.FullReplications);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.StorageNodeCpu != null) {
            this.StorageNodeCpu = new Long(source.StorageNodeCpu);
        }
        if (source.StorageNodeMem != null) {
            this.StorageNodeMem = new Long(source.StorageNodeMem);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.PrimaryInstanceRegion != null) {
            this.PrimaryInstanceRegion = new String(source.PrimaryInstanceRegion);
        }
        if (source.InstanceMode != null) {
            this.InstanceMode = new String(source.InstanceMode);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrimaryInstanceId", this.PrimaryInstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "StorageNodeNum", this.StorageNodeNum);
        this.setParamSimple(map, prefix + "Replications", this.Replications);
        this.setParamSimple(map, prefix + "FullReplications", this.FullReplications);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "StorageNodeCpu", this.StorageNodeCpu);
        this.setParamSimple(map, prefix + "StorageNodeMem", this.StorageNodeMem);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "PrimaryInstanceRegion", this.PrimaryInstanceRegion);
        this.setParamSimple(map, prefix + "InstanceMode", this.InstanceMode);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

