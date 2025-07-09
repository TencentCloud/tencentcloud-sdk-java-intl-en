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

public class AssetWebLocationBaseInfo extends AbstractModel {

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Private IP address
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Public IP address
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Host name
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
    * Domain name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Site port
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Site protocol
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * Service type
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Number of site paths
    */
    @SerializedName("PathCount")
    @Expose
    private Long PathCount;

    /**
    * Running user
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Home directory
    */
    @SerializedName("MainPath")
    @Expose
    private String MainPath;

    /**
    * Home directory owner
    */
    @SerializedName("MainPathOwner")
    @Expose
    private String MainPathOwner;

    /**
    * Owner permissions
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
    * Host business group ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Host tag
    */
    @SerializedName("Tag")
    @Expose
    private MachineTag [] Tag;

    /**
    * Web site ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

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
    * Whether the web service is newly added [0 - no|1 - yes]
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Private IP address 
     * @return MachineIp Private IP address
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Private IP address
     * @param MachineIp Private IP address
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Public IP address 
     * @return MachineWanIp Public IP address
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Public IP address
     * @param MachineWanIp Public IP address
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
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
     * Get Domain name 
     * @return Name Domain name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Domain name
     * @param Name Domain name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Site port 
     * @return Port Site port
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Site port
     * @param Port Site port
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Site protocol 
     * @return Proto Site protocol
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set Site protocol
     * @param Proto Site protocol
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
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
     * Get Number of site paths 
     * @return PathCount Number of site paths
     */
    public Long getPathCount() {
        return this.PathCount;
    }

    /**
     * Set Number of site paths
     * @param PathCount Number of site paths
     */
    public void setPathCount(Long PathCount) {
        this.PathCount = PathCount;
    }

    /**
     * Get Running user 
     * @return User Running user
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Running user
     * @param User Running user
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Home directory 
     * @return MainPath Home directory
     */
    public String getMainPath() {
        return this.MainPath;
    }

    /**
     * Set Home directory
     * @param MainPath Home directory
     */
    public void setMainPath(String MainPath) {
        this.MainPath = MainPath;
    }

    /**
     * Get Home directory owner 
     * @return MainPathOwner Home directory owner
     */
    public String getMainPathOwner() {
        return this.MainPathOwner;
    }

    /**
     * Set Home directory owner
     * @param MainPathOwner Home directory owner
     */
    public void setMainPathOwner(String MainPathOwner) {
        this.MainPathOwner = MainPathOwner;
    }

    /**
     * Get Owner permissions 
     * @return Permission Owner permissions
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set Owner permissions
     * @param Permission Owner permissions
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
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
     * @return Tag Host tag
     */
    public MachineTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Host tag
     * @param Tag Host tag
     */
    public void setTag(MachineTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Web site ID 
     * @return Id Web site ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Web site ID
     * @param Id Web site ID
     */
    public void setId(String Id) {
        this.Id = Id;
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
     * Get Whether the web service is newly added [0 - no|1 - yes]
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsNew Whether the web service is newly added [0 - no|1 - yes]
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set Whether the web service is newly added [0 - no|1 - yes]
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsNew Whether the web service is newly added [0 - no|1 - yes]
Note: This field may return null, indicating that no valid values can be obtained.
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

    public AssetWebLocationBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetWebLocationBaseInfo(AssetWebLocationBaseInfo source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.OsInfo != null) {
            this.OsInfo = new String(source.OsInfo);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.PathCount != null) {
            this.PathCount = new Long(source.PathCount);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.MainPath != null) {
            this.MainPath = new String(source.MainPath);
        }
        if (source.MainPathOwner != null) {
            this.MainPathOwner = new String(source.MainPathOwner);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
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
        if (source.Id != null) {
            this.Id = new String(source.Id);
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
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "PathCount", this.PathCount);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "MainPath", this.MainPath);
        this.setParamSimple(map, prefix + "MainPathOwner", this.MainPathOwner);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

