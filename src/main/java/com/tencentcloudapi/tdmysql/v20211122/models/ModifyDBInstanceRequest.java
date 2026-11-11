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

public class ModifyDBInstanceRequest extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Whether to only perform pre-check without actually executing the configuration change. true: only return the configuration change plan and pre-check result; false: actually execute the configuration change (default)</p>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>Number of CPU cores of peer nodes. If not passed, maintain current value unchanged</p>
    */
    @SerializedName("HybridNodeCpu")
    @Expose
    private Long HybridNodeCpu;

    /**
    * <p>Peer-to-peer node memory size in GB. If not passed, maintain current value unchanged</p>
    */
    @SerializedName("HybridNodeMem")
    @Expose
    private Long HybridNodeMem;

    /**
    * <p>Number of peer nodes. If not passed, maintain current value unchanged</p>
    */
    @SerializedName("HybridNodeNum")
    @Expose
    private Long HybridNodeNum;

    /**
    * <p>Peer-to-peer node disk capacity in GB. If not passed, maintain current value unchanged</p>
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * <p>Storage type. Available values: CLOUD_HSSD (enhanced SSD cloud disk), CLOUD_TCS (local disk), CLOUD_BSSD (universal SSD cloud disk). If not specified, the current value remains unchanged.</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>Specification code, for example, 4c8g, 16c32g</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>Target AZ list. If not passed, maintain current value unchanged</p>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>Availability zone mode. 1: single availability zone. 3: multi-availability zone primary AZ mode</p>
    */
    @SerializedName("AZMode")
    @Expose
    private Long AZMode;

    /**
    * <p>Primary AZ. This parameter is valid only when AZMode is 3</p>
    */
    @SerializedName("PrimaryAZ")
    @Expose
    private String PrimaryAZ;

    /**
    * <p>Number of replicas, value ranges from 1 to 3</p>
    */
    @SerializedName("FullReplications")
    @Expose
    private Long FullReplications;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Whether to only perform pre-check without actually executing the configuration change. true: only return the configuration change plan and pre-check result; false: actually execute the configuration change (default)</p> 
     * @return DryRun <p>Whether to only perform pre-check without actually executing the configuration change. true: only return the configuration change plan and pre-check result; false: actually execute the configuration change (default)</p>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>Whether to only perform pre-check without actually executing the configuration change. true: only return the configuration change plan and pre-check result; false: actually execute the configuration change (default)</p>
     * @param DryRun <p>Whether to only perform pre-check without actually executing the configuration change. true: only return the configuration change plan and pre-check result; false: actually execute the configuration change (default)</p>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get <p>Number of CPU cores of peer nodes. If not passed, maintain current value unchanged</p> 
     * @return HybridNodeCpu <p>Number of CPU cores of peer nodes. If not passed, maintain current value unchanged</p>
     */
    public Long getHybridNodeCpu() {
        return this.HybridNodeCpu;
    }

    /**
     * Set <p>Number of CPU cores of peer nodes. If not passed, maintain current value unchanged</p>
     * @param HybridNodeCpu <p>Number of CPU cores of peer nodes. If not passed, maintain current value unchanged</p>
     */
    public void setHybridNodeCpu(Long HybridNodeCpu) {
        this.HybridNodeCpu = HybridNodeCpu;
    }

    /**
     * Get <p>Peer-to-peer node memory size in GB. If not passed, maintain current value unchanged</p> 
     * @return HybridNodeMem <p>Peer-to-peer node memory size in GB. If not passed, maintain current value unchanged</p>
     */
    public Long getHybridNodeMem() {
        return this.HybridNodeMem;
    }

    /**
     * Set <p>Peer-to-peer node memory size in GB. If not passed, maintain current value unchanged</p>
     * @param HybridNodeMem <p>Peer-to-peer node memory size in GB. If not passed, maintain current value unchanged</p>
     */
    public void setHybridNodeMem(Long HybridNodeMem) {
        this.HybridNodeMem = HybridNodeMem;
    }

    /**
     * Get <p>Number of peer nodes. If not passed, maintain current value unchanged</p> 
     * @return HybridNodeNum <p>Number of peer nodes. If not passed, maintain current value unchanged</p>
     */
    public Long getHybridNodeNum() {
        return this.HybridNodeNum;
    }

    /**
     * Set <p>Number of peer nodes. If not passed, maintain current value unchanged</p>
     * @param HybridNodeNum <p>Number of peer nodes. If not passed, maintain current value unchanged</p>
     */
    public void setHybridNodeNum(Long HybridNodeNum) {
        this.HybridNodeNum = HybridNodeNum;
    }

    /**
     * Get <p>Peer-to-peer node disk capacity in GB. If not passed, maintain current value unchanged</p> 
     * @return Disk <p>Peer-to-peer node disk capacity in GB. If not passed, maintain current value unchanged</p>
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set <p>Peer-to-peer node disk capacity in GB. If not passed, maintain current value unchanged</p>
     * @param Disk <p>Peer-to-peer node disk capacity in GB. If not passed, maintain current value unchanged</p>
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get <p>Storage type. Available values: CLOUD_HSSD (enhanced SSD cloud disk), CLOUD_TCS (local disk), CLOUD_BSSD (universal SSD cloud disk). If not specified, the current value remains unchanged.</p> 
     * @return StorageType <p>Storage type. Available values: CLOUD_HSSD (enhanced SSD cloud disk), CLOUD_TCS (local disk), CLOUD_BSSD (universal SSD cloud disk). If not specified, the current value remains unchanged.</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>Storage type. Available values: CLOUD_HSSD (enhanced SSD cloud disk), CLOUD_TCS (local disk), CLOUD_BSSD (universal SSD cloud disk). If not specified, the current value remains unchanged.</p>
     * @param StorageType <p>Storage type. Available values: CLOUD_HSSD (enhanced SSD cloud disk), CLOUD_TCS (local disk), CLOUD_BSSD (universal SSD cloud disk). If not specified, the current value remains unchanged.</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>Specification code, for example, 4c8g, 16c32g</p> 
     * @return SpecCode <p>Specification code, for example, 4c8g, 16c32g</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>Specification code, for example, 4c8g, 16c32g</p>
     * @param SpecCode <p>Specification code, for example, 4c8g, 16c32g</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>Target AZ list. If not passed, maintain current value unchanged</p> 
     * @return Zones <p>Target AZ list. If not passed, maintain current value unchanged</p>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>Target AZ list. If not passed, maintain current value unchanged</p>
     * @param Zones <p>Target AZ list. If not passed, maintain current value unchanged</p>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get <p>Availability zone mode. 1: single availability zone. 3: multi-availability zone primary AZ mode</p> 
     * @return AZMode <p>Availability zone mode. 1: single availability zone. 3: multi-availability zone primary AZ mode</p>
     */
    public Long getAZMode() {
        return this.AZMode;
    }

    /**
     * Set <p>Availability zone mode. 1: single availability zone. 3: multi-availability zone primary AZ mode</p>
     * @param AZMode <p>Availability zone mode. 1: single availability zone. 3: multi-availability zone primary AZ mode</p>
     */
    public void setAZMode(Long AZMode) {
        this.AZMode = AZMode;
    }

    /**
     * Get <p>Primary AZ. This parameter is valid only when AZMode is 3</p> 
     * @return PrimaryAZ <p>Primary AZ. This parameter is valid only when AZMode is 3</p>
     */
    public String getPrimaryAZ() {
        return this.PrimaryAZ;
    }

    /**
     * Set <p>Primary AZ. This parameter is valid only when AZMode is 3</p>
     * @param PrimaryAZ <p>Primary AZ. This parameter is valid only when AZMode is 3</p>
     */
    public void setPrimaryAZ(String PrimaryAZ) {
        this.PrimaryAZ = PrimaryAZ;
    }

    /**
     * Get <p>Number of replicas, value ranges from 1 to 3</p> 
     * @return FullReplications <p>Number of replicas, value ranges from 1 to 3</p>
     */
    public Long getFullReplications() {
        return this.FullReplications;
    }

    /**
     * Set <p>Number of replicas, value ranges from 1 to 3</p>
     * @param FullReplications <p>Number of replicas, value ranges from 1 to 3</p>
     */
    public void setFullReplications(Long FullReplications) {
        this.FullReplications = FullReplications;
    }

    public ModifyDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceRequest(ModifyDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.HybridNodeCpu != null) {
            this.HybridNodeCpu = new Long(source.HybridNodeCpu);
        }
        if (source.HybridNodeMem != null) {
            this.HybridNodeMem = new Long(source.HybridNodeMem);
        }
        if (source.HybridNodeNum != null) {
            this.HybridNodeNum = new Long(source.HybridNodeNum);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.AZMode != null) {
            this.AZMode = new Long(source.AZMode);
        }
        if (source.PrimaryAZ != null) {
            this.PrimaryAZ = new String(source.PrimaryAZ);
        }
        if (source.FullReplications != null) {
            this.FullReplications = new Long(source.FullReplications);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "HybridNodeCpu", this.HybridNodeCpu);
        this.setParamSimple(map, prefix + "HybridNodeMem", this.HybridNodeMem);
        this.setParamSimple(map, prefix + "HybridNodeNum", this.HybridNodeNum);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "AZMode", this.AZMode);
        this.setParamSimple(map, prefix + "PrimaryAZ", this.PrimaryAZ);
        this.setParamSimple(map, prefix + "FullReplications", this.FullReplications);

    }
}

