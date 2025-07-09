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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetMachineBaseInfo extends AbstractModel {

    /**
    * Server QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Server UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Private IP address of server
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Server name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Operating system name
    */
    @SerializedName("OsInfo")
    @Expose
    private String OsInfo;

    /**
    * CPU information
    */
    @SerializedName("Cpu")
    @Expose
    private String Cpu;

    /**
    * Memory capacity, in GB
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Memory utilization, in percentage
    */
    @SerializedName("MemLoad")
    @Expose
    private String MemLoad;

    /**
    * Hard disk capacity, in GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Hard disk utilization, in percentage
    */
    @SerializedName("DiskLoad")
    @Expose
    private String DiskLoad;

    /**
    * Number of partitions
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * Host public IP address
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Business group ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * CPU count
    */
    @SerializedName("CpuSize")
    @Expose
    private Long CpuSize;

    /**
    * CPU utilization, in percentage
    */
    @SerializedName("CpuLoad")
    @Expose
    private String CpuLoad;

    /**
    * Tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private MachineTag [] Tag;

    /**
    * Data update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Whether it is newly added [0 - no;1 - yes]
    */
    @SerializedName("IsNew")
    @Expose
    private Long IsNew;

    /**
    * First collection time
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Additional information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * CPU load readings (only valid for Linux systems)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CpuLoadNum")
    @Expose
    private String CpuLoadNum;

    /**
     * Get Server QUUID 
     * @return Quuid Server QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Server QUUID
     * @param Quuid Server QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Server UUID 
     * @return Uuid Server UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Server UUID
     * @param Uuid Server UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Private IP address of server 
     * @return MachineIp Private IP address of server
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Private IP address of server
     * @param MachineIp Private IP address of server
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Server name 
     * @return MachineName Server name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Server name
     * @param MachineName Server name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Operating system name 
     * @return OsInfo Operating system name
     */
    public String getOsInfo() {
        return this.OsInfo;
    }

    /**
     * Set Operating system name
     * @param OsInfo Operating system name
     */
    public void setOsInfo(String OsInfo) {
        this.OsInfo = OsInfo;
    }

    /**
     * Get CPU information 
     * @return Cpu CPU information
     */
    public String getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU information
     * @param Cpu CPU information
     */
    public void setCpu(String Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Memory capacity, in GB 
     * @return MemSize Memory capacity, in GB
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Memory capacity, in GB
     * @param MemSize Memory capacity, in GB
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Memory utilization, in percentage 
     * @return MemLoad Memory utilization, in percentage
     */
    public String getMemLoad() {
        return this.MemLoad;
    }

    /**
     * Set Memory utilization, in percentage
     * @param MemLoad Memory utilization, in percentage
     */
    public void setMemLoad(String MemLoad) {
        this.MemLoad = MemLoad;
    }

    /**
     * Get Hard disk capacity, in GB 
     * @return DiskSize Hard disk capacity, in GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Hard disk capacity, in GB
     * @param DiskSize Hard disk capacity, in GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Hard disk utilization, in percentage 
     * @return DiskLoad Hard disk utilization, in percentage
     */
    public String getDiskLoad() {
        return this.DiskLoad;
    }

    /**
     * Set Hard disk utilization, in percentage
     * @param DiskLoad Hard disk utilization, in percentage
     */
    public void setDiskLoad(String DiskLoad) {
        this.DiskLoad = DiskLoad;
    }

    /**
     * Get Number of partitions 
     * @return PartitionCount Number of partitions
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set Number of partitions
     * @param PartitionCount Number of partitions
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get Host public IP address 
     * @return MachineWanIp Host public IP address
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Host public IP address
     * @param MachineWanIp Host public IP address
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get Business group ID 
     * @return ProjectId Business group ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Business group ID
     * @param ProjectId Business group ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get CPU count 
     * @return CpuSize CPU count
     */
    public Long getCpuSize() {
        return this.CpuSize;
    }

    /**
     * Set CPU count
     * @param CpuSize CPU count
     */
    public void setCpuSize(Long CpuSize) {
        this.CpuSize = CpuSize;
    }

    /**
     * Get CPU utilization, in percentage 
     * @return CpuLoad CPU utilization, in percentage
     */
    public String getCpuLoad() {
        return this.CpuLoad;
    }

    /**
     * Set CPU utilization, in percentage
     * @param CpuLoad CPU utilization, in percentage
     */
    public void setCpuLoad(String CpuLoad) {
        this.CpuLoad = CpuLoad;
    }

    /**
     * Get Tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tag Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tag Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTag(MachineTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Data update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Data update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Data update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Data update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Whether it is newly added [0 - no;1 - yes] 
     * @return IsNew Whether it is newly added [0 - no;1 - yes]
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set Whether it is newly added [0 - no;1 - yes]
     * @param IsNew Whether it is newly added [0 - no;1 - yes]
     */
    public void setIsNew(Long IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * Get First collection time 
     * @return FirstTime First collection time
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set First collection time
     * @param FirstTime First collection time
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get Additional information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineExtraInfo Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineExtraInfo Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get CPU load readings (only valid for Linux systems)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CpuLoadNum CPU load readings (only valid for Linux systems)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCpuLoadNum() {
        return this.CpuLoadNum;
    }

    /**
     * Set CPU load readings (only valid for Linux systems)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CpuLoadNum CPU load readings (only valid for Linux systems)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCpuLoadNum(String CpuLoadNum) {
        this.CpuLoadNum = CpuLoadNum;
    }

    public AssetMachineBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetMachineBaseInfo(AssetMachineBaseInfo source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.OsInfo != null) {
            this.OsInfo = new String(source.OsInfo);
        }
        if (source.Cpu != null) {
            this.Cpu = new String(source.Cpu);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.MemLoad != null) {
            this.MemLoad = new String(source.MemLoad);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskLoad != null) {
            this.DiskLoad = new String(source.DiskLoad);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.CpuSize != null) {
            this.CpuSize = new Long(source.CpuSize);
        }
        if (source.CpuLoad != null) {
            this.CpuLoad = new String(source.CpuLoad);
        }
        if (source.Tag != null) {
            this.Tag = new MachineTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new MachineTag(source.Tag[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsNew != null) {
            this.IsNew = new Long(source.IsNew);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.CpuLoadNum != null) {
            this.CpuLoadNum = new String(source.CpuLoadNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "MemLoad", this.MemLoad);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskLoad", this.DiskLoad);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CpuSize", this.CpuSize);
        this.setParamSimple(map, prefix + "CpuLoad", this.CpuLoad);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "CpuLoadNum", this.CpuLoadNum);

    }
}

