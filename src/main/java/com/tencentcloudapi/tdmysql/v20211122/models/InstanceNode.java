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
    * 
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 
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
    * 
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 
    */
    @SerializedName("EniIp")
    @Expose
    private String EniIp;

    /**
    * 
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * 
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 
    */
    @SerializedName("LocalDNS")
    @Expose
    private String LocalDNS;

    /**
    * 
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 
    */
    @SerializedName("LogDisk")
    @Expose
    private Long LogDisk;

    /**
    * 
    */
    @SerializedName("DataDisk")
    @Expose
    private Long DataDisk;

    /**
    * 
    */
    @SerializedName("ZoneID")
    @Expose
    private String ZoneID;

    /**
    * 
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * 
    */
    @SerializedName("Shards")
    @Expose
    private Long Shards;

    /**
    * 
    */
    @SerializedName("DataReplicas")
    @Expose
    private Long DataReplicas;

    /**
    * 
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * 
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get  
     * @return ID 
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 
     * @param ID 
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get  
     * @return InstanceId 
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 
     * @param InstanceId 
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
     * Get  
     * @return Ip 
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 
     * @param Ip 
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get  
     * @return EniIp 
     */
    public String getEniIp() {
        return this.EniIp;
    }

    /**
     * Set 
     * @param EniIp 
     */
    public void setEniIp(String EniIp) {
        this.EniIp = EniIp;
    }

    /**
     * Get  
     * @return Port 
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 
     * @param Port 
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get  
     * @return SpecCode 
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set 
     * @param SpecCode 
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get  
     * @return NodeName 
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 
     * @param NodeName 
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get  
     * @return Cpu 
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 
     * @param Cpu 
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get  
     * @return Mem 
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 
     * @param Mem 
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get  
     * @return Disk 
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set 
     * @param Disk 
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return Version 
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 
     * @param Version 
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get  
     * @return Zone 
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 
     * @param Zone 
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get  
     * @return LocalDNS 
     */
    public String getLocalDNS() {
        return this.LocalDNS;
    }

    /**
     * Set 
     * @param LocalDNS 
     */
    public void setLocalDNS(String LocalDNS) {
        this.LocalDNS = LocalDNS;
    }

    /**
     * Get  
     * @return Region 
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 
     * @param Region 
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get  
     * @return LogDisk 
     */
    public Long getLogDisk() {
        return this.LogDisk;
    }

    /**
     * Set 
     * @param LogDisk 
     */
    public void setLogDisk(Long LogDisk) {
        this.LogDisk = LogDisk;
    }

    /**
     * Get  
     * @return DataDisk 
     */
    public Long getDataDisk() {
        return this.DataDisk;
    }

    /**
     * Set 
     * @param DataDisk 
     */
    public void setDataDisk(Long DataDisk) {
        this.DataDisk = DataDisk;
    }

    /**
     * Get  
     * @return ZoneID 
     */
    public String getZoneID() {
        return this.ZoneID;
    }

    /**
     * Set 
     * @param ZoneID 
     */
    public void setZoneID(String ZoneID) {
        this.ZoneID = ZoneID;
    }

    /**
     * Get  
     * @return SpecName 
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 
     * @param SpecName 
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get  
     * @return Replicas 
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 
     * @param Replicas 
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get  
     * @return Shards 
     */
    public Long getShards() {
        return this.Shards;
    }

    /**
     * Set 
     * @param Shards 
     */
    public void setShards(Long Shards) {
        this.Shards = Shards;
    }

    /**
     * Get  
     * @return DataReplicas 
     */
    public Long getDataReplicas() {
        return this.DataReplicas;
    }

    /**
     * Set 
     * @param DataReplicas 
     */
    public void setDataReplicas(Long DataReplicas) {
        this.DataReplicas = DataReplicas;
    }

    /**
     * Get  
     * @return Params 
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set 
     * @param Params 
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get  
     * @return StorageType 
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 
     * @param StorageType 
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

