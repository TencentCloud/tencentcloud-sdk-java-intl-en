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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUpgradeInstanceCheckRequest extends AbstractModel {

    /**
    * Database instance ID, in the format of mssql-njj2mtpl.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Number of CPU cores after instance configuration adjustment. If it is left blank, no modification is required.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Memory size after instance configuration adjustment, in GB. If it is left blank, no modification is required.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Disk size after instance configuration adjustment, in GB. If it is left blank, no modification is required.
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Instance version. If it is left blank, no modification is required.
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * Type after instance configuration adjustment. Valid values: CLUSTER - cluster. If it is left blank, no modification is required.
    */
    @SerializedName("HAType")
    @Expose
    private String HAType;

    /**
    * Cross-AZ type after instance configuration adjustment. Valid values: SameZones - change to the same AZ; MultiZones - change to cross-AZ. If it is left blank, no modification is required.
    */
    @SerializedName("MultiZones")
    @Expose
    private String MultiZones;

    /**
    * Secondary node AZ of the multi-node architecture instance. The default value is null. It should be specified when modifying the AZ of the specified secondary node needs to be performed during configuration adjustment. When MultiZones = MultiZones, the AZs of the primary nodes and secondary nodes cannot all be the same. The collection of AZs of the secondary node can include 2-5 AZs.
    */
    @SerializedName("DrZones")
    @Expose
    private DrZoneInfo [] DrZones;

    /**
     * Get Database instance ID, in the format of mssql-njj2mtpl. 
     * @return InstanceId Database instance ID, in the format of mssql-njj2mtpl.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Database instance ID, in the format of mssql-njj2mtpl.
     * @param InstanceId Database instance ID, in the format of mssql-njj2mtpl.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Number of CPU cores after instance configuration adjustment. If it is left blank, no modification is required. 
     * @return Cpu Number of CPU cores after instance configuration adjustment. If it is left blank, no modification is required.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Number of CPU cores after instance configuration adjustment. If it is left blank, no modification is required.
     * @param Cpu Number of CPU cores after instance configuration adjustment. If it is left blank, no modification is required.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory size after instance configuration adjustment, in GB. If it is left blank, no modification is required. 
     * @return Memory Memory size after instance configuration adjustment, in GB. If it is left blank, no modification is required.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size after instance configuration adjustment, in GB. If it is left blank, no modification is required.
     * @param Memory Memory size after instance configuration adjustment, in GB. If it is left blank, no modification is required.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Disk size after instance configuration adjustment, in GB. If it is left blank, no modification is required. 
     * @return Storage Disk size after instance configuration adjustment, in GB. If it is left blank, no modification is required.
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Disk size after instance configuration adjustment, in GB. If it is left blank, no modification is required.
     * @param Storage Disk size after instance configuration adjustment, in GB. If it is left blank, no modification is required.
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Instance version. If it is left blank, no modification is required. 
     * @return DBVersion Instance version. If it is left blank, no modification is required.
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set Instance version. If it is left blank, no modification is required.
     * @param DBVersion Instance version. If it is left blank, no modification is required.
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get Type after instance configuration adjustment. Valid values: CLUSTER - cluster. If it is left blank, no modification is required. 
     * @return HAType Type after instance configuration adjustment. Valid values: CLUSTER - cluster. If it is left blank, no modification is required.
     */
    public String getHAType() {
        return this.HAType;
    }

    /**
     * Set Type after instance configuration adjustment. Valid values: CLUSTER - cluster. If it is left blank, no modification is required.
     * @param HAType Type after instance configuration adjustment. Valid values: CLUSTER - cluster. If it is left blank, no modification is required.
     */
    public void setHAType(String HAType) {
        this.HAType = HAType;
    }

    /**
     * Get Cross-AZ type after instance configuration adjustment. Valid values: SameZones - change to the same AZ; MultiZones - change to cross-AZ. If it is left blank, no modification is required. 
     * @return MultiZones Cross-AZ type after instance configuration adjustment. Valid values: SameZones - change to the same AZ; MultiZones - change to cross-AZ. If it is left blank, no modification is required.
     */
    public String getMultiZones() {
        return this.MultiZones;
    }

    /**
     * Set Cross-AZ type after instance configuration adjustment. Valid values: SameZones - change to the same AZ; MultiZones - change to cross-AZ. If it is left blank, no modification is required.
     * @param MultiZones Cross-AZ type after instance configuration adjustment. Valid values: SameZones - change to the same AZ; MultiZones - change to cross-AZ. If it is left blank, no modification is required.
     */
    public void setMultiZones(String MultiZones) {
        this.MultiZones = MultiZones;
    }

    /**
     * Get Secondary node AZ of the multi-node architecture instance. The default value is null. It should be specified when modifying the AZ of the specified secondary node needs to be performed during configuration adjustment. When MultiZones = MultiZones, the AZs of the primary nodes and secondary nodes cannot all be the same. The collection of AZs of the secondary node can include 2-5 AZs. 
     * @return DrZones Secondary node AZ of the multi-node architecture instance. The default value is null. It should be specified when modifying the AZ of the specified secondary node needs to be performed during configuration adjustment. When MultiZones = MultiZones, the AZs of the primary nodes and secondary nodes cannot all be the same. The collection of AZs of the secondary node can include 2-5 AZs.
     */
    public DrZoneInfo [] getDrZones() {
        return this.DrZones;
    }

    /**
     * Set Secondary node AZ of the multi-node architecture instance. The default value is null. It should be specified when modifying the AZ of the specified secondary node needs to be performed during configuration adjustment. When MultiZones = MultiZones, the AZs of the primary nodes and secondary nodes cannot all be the same. The collection of AZs of the secondary node can include 2-5 AZs.
     * @param DrZones Secondary node AZ of the multi-node architecture instance. The default value is null. It should be specified when modifying the AZ of the specified secondary node needs to be performed during configuration adjustment. When MultiZones = MultiZones, the AZs of the primary nodes and secondary nodes cannot all be the same. The collection of AZs of the secondary node can include 2-5 AZs.
     */
    public void setDrZones(DrZoneInfo [] DrZones) {
        this.DrZones = DrZones;
    }

    public DescribeUpgradeInstanceCheckRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUpgradeInstanceCheckRequest(DescribeUpgradeInstanceCheckRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.HAType != null) {
            this.HAType = new String(source.HAType);
        }
        if (source.MultiZones != null) {
            this.MultiZones = new String(source.MultiZones);
        }
        if (source.DrZones != null) {
            this.DrZones = new DrZoneInfo[source.DrZones.length];
            for (int i = 0; i < source.DrZones.length; i++) {
                this.DrZones[i] = new DrZoneInfo(source.DrZones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "HAType", this.HAType);
        this.setParamSimple(map, prefix + "MultiZones", this.MultiZones);
        this.setParamArrayObj(map, prefix + "DrZones.", this.DrZones);

    }
}

