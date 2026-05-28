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

public class CreateCloneInstanceRequest extends AbstractModel {

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
    * <p>Source instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Instance name. The required length is 1-60. It can contain Chinese characters, English case, digits, hyphens (-), and underscores (_).</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Tag key-value pair array</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private ResourceTag [] ResourceTags;

    /**
    * <p>Backup and rollback name</p>
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

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
    * <p>Create version</p>
    */
    @SerializedName("CreateVersion")
    @Expose
    private String CreateVersion;

    /**
    * <p>Create port number</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>Recovery time point</p>
    */
    @SerializedName("RecoverTime")
    @Expose
    private String RecoverTime;

    /**
    * <p>Instance Architecture Type, separate: decoupled architecture; hybrid: peer-to-peer architecture</p>
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
    * <p>Multi-AZ list, Zones[0] refers to the primary AZ</p>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>Number of replicas</p>
    */
    @SerializedName("FullReplications")
    @Expose
    private Long FullReplications;

    /**
    * <p>Instance mode, normal: standard type; enhanced: enhanced</p>
    */
    @SerializedName("InstanceMode")
    @Expose
    private String InstanceMode;

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
     * Get <p>Source instance id</p> 
     * @return InstanceId <p>Source instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Source instance id</p>
     * @param InstanceId <p>Source instance id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get <p>Backup and rollback name</p> 
     * @return BackupName <p>Backup and rollback name</p>
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set <p>Backup and rollback name</p>
     * @param BackupName <p>Backup and rollback name</p>
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
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
     * Get <p>Create version</p> 
     * @return CreateVersion <p>Create version</p>
     */
    public String getCreateVersion() {
        return this.CreateVersion;
    }

    /**
     * Set <p>Create version</p>
     * @param CreateVersion <p>Create version</p>
     */
    public void setCreateVersion(String CreateVersion) {
        this.CreateVersion = CreateVersion;
    }

    /**
     * Get <p>Create port number</p> 
     * @return Vport <p>Create port number</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>Create port number</p>
     * @param Vport <p>Create port number</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>Recovery time point</p> 
     * @return RecoverTime <p>Recovery time point</p>
     */
    public String getRecoverTime() {
        return this.RecoverTime;
    }

    /**
     * Set <p>Recovery time point</p>
     * @param RecoverTime <p>Recovery time point</p>
     */
    public void setRecoverTime(String RecoverTime) {
        this.RecoverTime = RecoverTime;
    }

    /**
     * Get <p>Instance Architecture Type, separate: decoupled architecture; hybrid: peer-to-peer architecture</p> 
     * @return InstanceType <p>Instance Architecture Type, separate: decoupled architecture; hybrid: peer-to-peer architecture</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>Instance Architecture Type, separate: decoupled architecture; hybrid: peer-to-peer architecture</p>
     * @param InstanceType <p>Instance Architecture Type, separate: decoupled architecture; hybrid: peer-to-peer architecture</p>
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
     * Get <p>Multi-AZ list, Zones[0] refers to the primary AZ</p> 
     * @return Zones <p>Multi-AZ list, Zones[0] refers to the primary AZ</p>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>Multi-AZ list, Zones[0] refers to the primary AZ</p>
     * @param Zones <p>Multi-AZ list, Zones[0] refers to the primary AZ</p>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
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

    public CreateCloneInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloneInstanceRequest(CreateCloneInstanceRequest source) {
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
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new ResourceTag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new ResourceTag(source.ResourceTags[i]);
            }
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.StorageNodeCpu != null) {
            this.StorageNodeCpu = new Long(source.StorageNodeCpu);
        }
        if (source.StorageNodeMem != null) {
            this.StorageNodeMem = new Long(source.StorageNodeMem);
        }
        if (source.CreateVersion != null) {
            this.CreateVersion = new String(source.CreateVersion);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.RecoverTime != null) {
            this.RecoverTime = new String(source.RecoverTime);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.FullReplications != null) {
            this.FullReplications = new Long(source.FullReplications);
        }
        if (source.InstanceMode != null) {
            this.InstanceMode = new String(source.InstanceMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "StorageNodeNum", this.StorageNodeNum);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "StorageNodeCpu", this.StorageNodeCpu);
        this.setParamSimple(map, prefix + "StorageNodeMem", this.StorageNodeMem);
        this.setParamSimple(map, prefix + "CreateVersion", this.CreateVersion);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "RecoverTime", this.RecoverTime);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "FullReplications", this.FullReplications);
        this.setParamSimple(map, prefix + "InstanceMode", this.InstanceMode);

    }
}

