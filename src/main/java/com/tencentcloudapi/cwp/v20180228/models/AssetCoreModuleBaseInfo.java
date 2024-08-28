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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetCoreModuleBaseInfo extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Server IP
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
    * Operating system
    */
    @SerializedName("OsInfo")
    @Expose
    private String OsInfo;

    /**
    * Module size
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Number of dependent processes
    */
    @SerializedName("ProcessCount")
    @Expose
    private Long ProcessCount;

    /**
    * Number of dependent modules
    */
    @SerializedName("ModuleCount")
    @Expose
    private Long ModuleCount;

    /**
    * Module ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Data update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * First collection time
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Whether new [0: no|1: yes]
    */
    @SerializedName("IsNew")
    @Expose
    private Long IsNew;

    /**
    * Server Public IP
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Additional information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description 
     * @return Desc Description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description
     * @param Desc Description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Path 
     * @return Path Path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path
     * @param Path Path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Version 
     * @return Version Version
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version
     * @param Version Version
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Server IP 
     * @return MachineIp Server IP
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Server IP
     * @param MachineIp Server IP
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
     * Get Operating system 
     * @return OsInfo Operating system
     */
    public String getOsInfo() {
        return this.OsInfo;
    }

    /**
     * Set Operating system
     * @param OsInfo Operating system
     */
    public void setOsInfo(String OsInfo) {
        this.OsInfo = OsInfo;
    }

    /**
     * Get Module size 
     * @return Size Module size
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Module size
     * @param Size Module size
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Number of dependent processes 
     * @return ProcessCount Number of dependent processes
     */
    public Long getProcessCount() {
        return this.ProcessCount;
    }

    /**
     * Set Number of dependent processes
     * @param ProcessCount Number of dependent processes
     */
    public void setProcessCount(Long ProcessCount) {
        this.ProcessCount = ProcessCount;
    }

    /**
     * Get Number of dependent modules 
     * @return ModuleCount Number of dependent modules
     */
    public Long getModuleCount() {
        return this.ModuleCount;
    }

    /**
     * Set Number of dependent modules
     * @param ModuleCount Number of dependent modules
     */
    public void setModuleCount(Long ModuleCount) {
        this.ModuleCount = ModuleCount;
    }

    /**
     * Get Module ID 
     * @return Id Module ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Module ID
     * @param Id Module ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Host QUUID 
     * @return Quuid Host QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
     * @param Quuid Host QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Host UUID 
     * @return Uuid Host UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host UUID
     * @param Uuid Host UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
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
     * Get Whether new [0: no|1: yes] 
     * @return IsNew Whether new [0: no|1: yes]
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set Whether new [0: no|1: yes]
     * @param IsNew Whether new [0: no|1: yes]
     */
    public void setIsNew(Long IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * Get Server Public IP 
     * @return MachineWanIp Server Public IP
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Server Public IP
     * @param MachineWanIp Server Public IP
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
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

    public AssetCoreModuleBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetCoreModuleBaseInfo(AssetCoreModuleBaseInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
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
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.ProcessCount != null) {
            this.ProcessCount = new Long(source.ProcessCount);
        }
        if (source.ModuleCount != null) {
            this.ModuleCount = new Long(source.ModuleCount);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.IsNew != null) {
            this.IsNew = new Long(source.IsNew);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "ProcessCount", this.ProcessCount);
        this.setParamSimple(map, prefix + "ModuleCount", this.ModuleCount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

