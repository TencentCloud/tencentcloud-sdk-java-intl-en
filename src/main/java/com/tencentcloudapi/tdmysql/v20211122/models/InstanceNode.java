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

public class InstanceNode extends AbstractModel {

    /**
    * Primary key
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Node Id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Instance Ip
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Eni IP of the instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EniIp")
    @Expose
    private String EniIp;

    /**
    * Instance Port
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Instance SpecCode
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * Instance NodeName
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Instance Cpu
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Instance memory
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * Instance Disk
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * Instance type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Instance status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * instance version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance LocalDNS
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LocalDNS")
    @Expose
    private String LocalDNS;

    /**
    * Instance Region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance log disk
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LogDisk")
    @Expose
    private Long LogDisk;

    /**
    * Instance data disk
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataDisk")
    @Expose
    private Long DataDisk;

    /**
    * Zone ID of the instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneID")
    @Expose
    private String ZoneID;

    /**
    * Instance SpecName
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Instance Replicas
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * Instance Shards
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Shards")
    @Expose
    private Long Shards;

    /**
    * Instance data replica
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataReplicas")
    @Expose
    private Long DataReplicas;

    /**
    * Initialize parameter
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * Storage medium, CLOUD_PREMIUM: Premium Cloud Disk, CLOUD_SSD: SSD cloud disk, CLOUD_HSSD: HSSD cloud disk
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get Primary key
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ID Primary key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Primary key
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ID Primary key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Instance ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Node Id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeId Node Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node Id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeId Node Id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Instance Ip
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Ip Instance Ip
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Instance Ip
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Ip Instance Ip
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Eni IP of the instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EniIp Eni IP of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEniIp() {
        return this.EniIp;
    }

    /**
     * Set Eni IP of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EniIp Eni IP of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEniIp(String EniIp) {
        this.EniIp = EniIp;
    }

    /**
     * Get Instance Port
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Port Instance Port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Instance Port
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Port Instance Port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Instance SpecCode
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpecCode Instance SpecCode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set Instance SpecCode
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpecCode Instance SpecCode
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get Instance NodeName
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeName Instance NodeName
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Instance NodeName
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeName Instance NodeName
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Instance Cpu
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Cpu Instance Cpu
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Instance Cpu
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Cpu Instance Cpu
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Instance memory
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Mem Instance memory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set Instance memory
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Mem Instance memory
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get Instance Disk
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Disk Instance Disk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set Instance Disk
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Disk Instance Disk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get Instance type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Instance type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Instance type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Instance type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Instance status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Instance status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Instance status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get instance version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Version instance version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set instance version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Version instance version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Zone Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Zone Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance LocalDNS
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LocalDNS Instance LocalDNS
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLocalDNS() {
        return this.LocalDNS;
    }

    /**
     * Set Instance LocalDNS
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LocalDNS Instance LocalDNS
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocalDNS(String LocalDNS) {
        this.LocalDNS = LocalDNS;
    }

    /**
     * Get Instance Region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Instance Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance Region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Instance Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance log disk
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LogDisk Instance log disk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLogDisk() {
        return this.LogDisk;
    }

    /**
     * Set Instance log disk
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LogDisk Instance log disk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLogDisk(Long LogDisk) {
        this.LogDisk = LogDisk;
    }

    /**
     * Get Instance data disk
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataDisk Instance data disk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set Instance data disk
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataDisk Instance data disk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataDisk(Long DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get Zone ID of the instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneID Zone ID of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getZoneID() {
        return this.ZoneID;
    }

    /**
     * Set Zone ID of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneID Zone ID of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneID(String ZoneID) {
        this.ZoneID = ZoneID;
    }

    /**
     * Get Instance SpecName
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpecName Instance SpecName
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Instance SpecName
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpecName Instance SpecName
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Instance Replicas
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Replicas Instance Replicas
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set Instance Replicas
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Replicas Instance Replicas
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get Instance Shards
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Shards Instance Shards
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getShards() {
        return this.Shards;
    }

    /**
     * Set Instance Shards
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Shards Instance Shards
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShards(Long Shards) {
        this.Shards = Shards;
    }

    /**
     * Get Instance data replica
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataReplicas Instance data replica
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDataReplicas() {
        return this.DataReplicas;
    }

    /**
     * Set Instance data replica
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataReplicas Instance data replica
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataReplicas(Long DataReplicas) {
        this.DataReplicas = DataReplicas;
    }

    /**
     * Get Initialize parameter
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Params Initialize parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set Initialize parameter
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Params Initialize parameter
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get Storage medium, CLOUD_PREMIUM: Premium Cloud Disk, CLOUD_SSD: SSD cloud disk, CLOUD_HSSD: HSSD cloud disk
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StorageType Storage medium, CLOUD_PREMIUM: Premium Cloud Disk, CLOUD_SSD: SSD cloud disk, CLOUD_HSSD: HSSD cloud disk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage medium, CLOUD_PREMIUM: Premium Cloud Disk, CLOUD_SSD: SSD cloud disk, CLOUD_HSSD: HSSD cloud disk
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StorageType Storage medium, CLOUD_PREMIUM: Premium Cloud Disk, CLOUD_SSD: SSD cloud disk, CLOUD_HSSD: HSSD cloud disk
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public InstanceNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNode(InstanceNode source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.EniIp != null) {
            this.EniIp = new String(source.EniIp);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.LocalDNS != null) {
            this.LocalDNS = new String(source.LocalDNS);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.LogDisk != null) {
            this.LogDisk = new Long(source.LogDisk);
        }
        if (source.DataDisk != null) {
            this.DataDisk = new Long(source.DataDisk);
        }
        if (source.ZoneID != null) {
            this.ZoneID = new String(source.ZoneID);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.Shards != null) {
            this.Shards = new Long(source.Shards);
        }
        if (source.DataReplicas != null) {
            this.DataReplicas = new Long(source.DataReplicas);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "EniIp", this.EniIp);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "LocalDNS", this.LocalDNS);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "LogDisk", this.LogDisk);
        this.setParamSimple(map, prefix + "DataDisk", this.DataDisk);
        this.setParamSimple(map, prefix + "ZoneID", this.ZoneID);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "Shards", this.Shards);
        this.setParamSimple(map, prefix + "DataReplicas", this.DataReplicas);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

