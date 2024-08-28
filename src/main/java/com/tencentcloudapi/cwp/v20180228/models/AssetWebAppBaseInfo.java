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

public class AssetWebAppBaseInfo extends AbstractModel {

    /**
    * Host private IP address
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Host public IP address
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

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
    * Operating system information
    */
    @SerializedName("OsInfo")
    @Expose
    private String OsInfo;

    /**
    * Host business group ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Host tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private MachineTag [] Tag;

    /**
    * Application name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Root path
    */
    @SerializedName("RootPath")
    @Expose
    private String RootPath;

    /**
    * Service type
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Site domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Virtual path
    */
    @SerializedName("VirtualPath")
    @Expose
    private String VirtualPath;

    /**
    * Number of plugins
    */
    @SerializedName("PluginCount")
    @Expose
    private Long PluginCount;

    /**
    * Application ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Application description
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Host name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

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
    * Whether it is newly added [0: no | 1: yes]
    */
    @SerializedName("IsNew")
    @Expose
    private Long IsNew;

    /**
    * Additional information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get Host private IP address 
     * @return MachineIp Host private IP address
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Host private IP address
     * @param MachineIp Host private IP address
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
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
     * Get Operating system information 
     * @return OsInfo Operating system information
     */
    public String getOsInfo() {
        return this.OsInfo;
    }

    /**
     * Set Operating system information
     * @param OsInfo Operating system information
     */
    public void setOsInfo(String OsInfo) {
        this.OsInfo = OsInfo;
    }

    /**
     * Get Host business group ID 
     * @return ProjectId Host business group ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Host business group ID
     * @param ProjectId Host business group ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Host tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tag Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tag Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTag(MachineTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Application name 
     * @return Name Application name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Application name
     * @param Name Application name
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get Root path 
     * @return RootPath Root path
     */
    public String getRootPath() {
        return this.RootPath;
    }

    /**
     * Set Root path
     * @param RootPath Root path
     */
    public void setRootPath(String RootPath) {
        this.RootPath = RootPath;
    }

    /**
     * Get Service type 
     * @return ServiceType Service type
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Service type
     * @param ServiceType Service type
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Site domain name 
     * @return Domain Site domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Site domain name
     * @param Domain Site domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Virtual path 
     * @return VirtualPath Virtual path
     */
    public String getVirtualPath() {
        return this.VirtualPath;
    }

    /**
     * Set Virtual path
     * @param VirtualPath Virtual path
     */
    public void setVirtualPath(String VirtualPath) {
        this.VirtualPath = VirtualPath;
    }

    /**
     * Get Number of plugins 
     * @return PluginCount Number of plugins
     */
    public Long getPluginCount() {
        return this.PluginCount;
    }

    /**
     * Set Number of plugins
     * @param PluginCount Number of plugins
     */
    public void setPluginCount(Long PluginCount) {
        this.PluginCount = PluginCount;
    }

    /**
     * Get Application ID 
     * @return Id Application ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Application ID
     * @param Id Application ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Application description 
     * @return Desc Application description
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Application description
     * @param Desc Application description
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Host name 
     * @return MachineName Host name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Host name
     * @param MachineName Host name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
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
     * Get Whether it is newly added [0: no | 1: yes] 
     * @return IsNew Whether it is newly added [0: no | 1: yes]
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set Whether it is newly added [0: no | 1: yes]
     * @param IsNew Whether it is newly added [0: no | 1: yes]
     */
    public void setIsNew(Long IsNew) {
        this.IsNew = IsNew;
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

    public AssetWebAppBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetWebAppBaseInfo(AssetWebAppBaseInfo source) {
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.OsInfo != null) {
            this.OsInfo = new String(source.OsInfo);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Tag != null) {
            this.Tag = new MachineTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new MachineTag(source.Tag[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.RootPath != null) {
            this.RootPath = new String(source.RootPath);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.VirtualPath != null) {
            this.VirtualPath = new String(source.VirtualPath);
        }
        if (source.PluginCount != null) {
            this.PluginCount = new Long(source.PluginCount);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
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
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "RootPath", this.RootPath);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "VirtualPath", this.VirtualPath);
        this.setParamSimple(map, prefix + "PluginCount", this.PluginCount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

