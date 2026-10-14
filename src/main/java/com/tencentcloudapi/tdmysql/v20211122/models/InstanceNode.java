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
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Node Id
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Instance Ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Instance EniIp
    */
    @SerializedName("EniIp")
    @Expose
    private String EniIp;

    /**
    * Instance Port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Instance SpecCode
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * Instance NodeName
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Instance Cpu
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * Instance memory
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * Instance Disk
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * Instance type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Instance status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Instance version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Instance region
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance LocalDNS
    */
    @SerializedName("LocalDNS")
    @Expose
    private String LocalDNS;

    /**
    * Instance Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Instance log disk
    */
    @SerializedName("LogDisk")
    @Expose
    private Long LogDisk;

    /**
    * Instance data disk
    */
    @SerializedName("DataDisk")
    @Expose
    private Long DataDisk;

    /**
    * Instance Zone ID
    */
    @SerializedName("ZoneID")
    @Expose
    private String ZoneID;

    /**
    * Instance SpecName
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Instance Replicas
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * Instance Shards
    */
    @SerializedName("Shards")
    @Expose
    private Long Shards;

    /**
    * Instance data replica
    */
    @SerializedName("DataReplicas")
    @Expose
    private Long DataReplicas;

    /**
    * Instance initialization parameter
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * Storage medium, CLOUD_PREMIUM: Premium Cloud Disk, CLOUD_SSD: SSD cloud disk, CLOUD_HSSD: HSSD cloud disk
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get Primary key 
     * @return ID Primary key
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Primary key
     * @param ID Primary key
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Node Id 
     * @return NodeId Node Id
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node Id
     * @param NodeId Node Id
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Instance Ip 
     * @return Ip Instance Ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Instance Ip
     * @param Ip Instance Ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Instance EniIp 
     * @return EniIp Instance EniIp
     */
    public String getEniIp() {
        return this.EniIp;
    }

    /**
     * Set Instance EniIp
     * @param EniIp Instance EniIp
     */
    public void setEniIp(String EniIp) {
        this.EniIp = EniIp;
    }

    /**
     * Get Instance Port 
     * @return Port Instance Port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Instance Port
     * @param Port Instance Port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Instance SpecCode 
     * @return SpecCode Instance SpecCode
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set Instance SpecCode
     * @param SpecCode Instance SpecCode
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get Instance NodeName 
     * @return NodeName Instance NodeName
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Instance NodeName
     * @param NodeName Instance NodeName
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Instance Cpu 
     * @return Cpu Instance Cpu
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Instance Cpu
     * @param Cpu Instance Cpu
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Instance memory 
     * @return Mem Instance memory
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set Instance memory
     * @param Mem Instance memory
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get Instance Disk 
     * @return Disk Instance Disk
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set Instance Disk
     * @param Disk Instance Disk
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get Instance type 
     * @return Type Instance type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Instance type
     * @param Type Instance type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Instance status 
     * @return Status Instance status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status
     * @param Status Instance status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Instance version 
     * @return Version Instance version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Instance version
     * @param Version Instance version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Instance region 
     * @return Zone Instance region
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance region
     * @param Zone Instance region
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Instance LocalDNS 
     * @return LocalDNS Instance LocalDNS
     */
    public String getLocalDNS() {
        return this.LocalDNS;
    }

    /**
     * Set Instance LocalDNS
     * @param LocalDNS Instance LocalDNS
     */
    public void setLocalDNS(String LocalDNS) {
        this.LocalDNS = LocalDNS;
    }

    /**
     * Get Instance Region 
     * @return Region Instance Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance Region
     * @param Region Instance Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Instance log disk 
     * @return LogDisk Instance log disk
     */
    public Long getLogDisk() {
        return this.LogDisk;
    }

    /**
     * Set Instance log disk
     * @param LogDisk Instance log disk
     */
    public void setLogDisk(Long LogDisk) {
        this.LogDisk = LogDisk;
    }

    /**
     * Get Instance data disk 
     * @return DataDisk Instance data disk
     */
    public Long getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set Instance data disk
     * @param DataDisk Instance data disk
     */
    public void setDataDisk(Long DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get Instance Zone ID 
     * @return ZoneID Instance Zone ID
     */
    public String getZoneID() {
        return this.ZoneID;
    }

    /**
     * Set Instance Zone ID
     * @param ZoneID Instance Zone ID
     */
    public void setZoneID(String ZoneID) {
        this.ZoneID = ZoneID;
    }

    /**
     * Get Instance SpecName 
     * @return SpecName Instance SpecName
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Instance SpecName
     * @param SpecName Instance SpecName
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Instance Replicas 
     * @return Replicas Instance Replicas
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set Instance Replicas
     * @param Replicas Instance Replicas
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get Instance Shards 
     * @return Shards Instance Shards
     */
    public Long getShards() {
        return this.Shards;
    }

    /**
     * Set Instance Shards
     * @param Shards Instance Shards
     */
    public void setShards(Long Shards) {
        this.Shards = Shards;
    }

    /**
     * Get Instance data replica 
     * @return DataReplicas Instance data replica
     */
    public Long getDataReplicas() {
        return this.DataReplicas;
    }

    /**
     * Set Instance data replica
     * @param DataReplicas Instance data replica
     */
    public void setDataReplicas(Long DataReplicas) {
        this.DataReplicas = DataReplicas;
    }

    /**
     * Get Instance initialization parameter 
     * @return Params Instance initialization parameter
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set Instance initialization parameter
     * @param Params Instance initialization parameter
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get Storage medium, CLOUD_PREMIUM: Premium Cloud Disk, CLOUD_SSD: SSD cloud disk, CLOUD_HSSD: HSSD cloud disk 
     * @return StorageType Storage medium, CLOUD_PREMIUM: Premium Cloud Disk, CLOUD_SSD: SSD cloud disk, CLOUD_HSSD: HSSD cloud disk
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage medium, CLOUD_PREMIUM: Premium Cloud Disk, CLOUD_SSD: SSD cloud disk, CLOUD_HSSD: HSSD cloud disk
     * @param StorageType Storage medium, CLOUD_PREMIUM: Premium Cloud Disk, CLOUD_SSD: SSD cloud disk, CLOUD_HSSD: HSSD cloud disk
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

