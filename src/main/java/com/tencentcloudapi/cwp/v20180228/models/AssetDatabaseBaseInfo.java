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

public class AssetDatabaseBaseInfo extends AbstractModel {

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
    * Operating System Information
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
    * Database name
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
    * Listening port
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Protocol
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
    * Running user
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Bound IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Configuration file path
    */
    @SerializedName("ConfigPath")
    @Expose
    private String ConfigPath;

    /**
    * Log file path
    */
    @SerializedName("LogPath")
    @Expose
    private String LogPath;

    /**
    * Data path
    */
    @SerializedName("DataPath")
    @Expose
    private String DataPath;

    /**
    * Running permission
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
    * Error log path
    */
    @SerializedName("ErrorLogPath")
    @Expose
    private String ErrorLogPath;

    /**
    * Plugin path
    */
    @SerializedName("PlugInPath")
    @Expose
    private String PlugInPath;

    /**
    * Binary path
    */
    @SerializedName("BinPath")
    @Expose
    private String BinPath;

    /**
    * Startup parameter
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * Database ID
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
    * Whether newly added [0: no|1: yes]
    */
    @SerializedName("IsNew")
    @Expose
    private Long IsNew;

    /**
    * Host name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

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
     * Get Operating System Information 
     * @return OsInfo Operating System Information
     */
    public String getOsInfo() {
        return this.OsInfo;
    }

    /**
     * Set Operating System Information
     * @param OsInfo Operating System Information
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
     * Get Database name 
     * @return Name Database name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Database name
     * @param Name Database name
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
     * Get Listening port 
     * @return Port Listening port
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Listening port
     * @param Port Listening port
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Protocol 
     * @return Proto Protocol
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set Protocol
     * @param Proto Protocol
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
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
     * Get Bound IP 
     * @return Ip Bound IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Bound IP
     * @param Ip Bound IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Configuration file path 
     * @return ConfigPath Configuration file path
     */
    public String getConfigPath() {
        return this.ConfigPath;
    }

    /**
     * Set Configuration file path
     * @param ConfigPath Configuration file path
     */
    public void setConfigPath(String ConfigPath) {
        this.ConfigPath = ConfigPath;
    }

    /**
     * Get Log file path 
     * @return LogPath Log file path
     */
    public String getLogPath() {
        return this.LogPath;
    }

    /**
     * Set Log file path
     * @param LogPath Log file path
     */
    public void setLogPath(String LogPath) {
        this.LogPath = LogPath;
    }

    /**
     * Get Data path 
     * @return DataPath Data path
     */
    public String getDataPath() {
        return this.DataPath;
    }

    /**
     * Set Data path
     * @param DataPath Data path
     */
    public void setDataPath(String DataPath) {
        this.DataPath = DataPath;
    }

    /**
     * Get Running permission 
     * @return Permission Running permission
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set Running permission
     * @param Permission Running permission
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    /**
     * Get Error log path 
     * @return ErrorLogPath Error log path
     */
    public String getErrorLogPath() {
        return this.ErrorLogPath;
    }

    /**
     * Set Error log path
     * @param ErrorLogPath Error log path
     */
    public void setErrorLogPath(String ErrorLogPath) {
        this.ErrorLogPath = ErrorLogPath;
    }

    /**
     * Get Plugin path 
     * @return PlugInPath Plugin path
     */
    public String getPlugInPath() {
        return this.PlugInPath;
    }

    /**
     * Set Plugin path
     * @param PlugInPath Plugin path
     */
    public void setPlugInPath(String PlugInPath) {
        this.PlugInPath = PlugInPath;
    }

    /**
     * Get Binary path 
     * @return BinPath Binary path
     */
    public String getBinPath() {
        return this.BinPath;
    }

    /**
     * Set Binary path
     * @param BinPath Binary path
     */
    public void setBinPath(String BinPath) {
        this.BinPath = BinPath;
    }

    /**
     * Get Startup parameter 
     * @return Param Startup parameter
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set Startup parameter
     * @param Param Startup parameter
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get Database ID 
     * @return Id Database ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Database ID
     * @param Id Database ID
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
     * Get Whether newly added [0: no|1: yes] 
     * @return IsNew Whether newly added [0: no|1: yes]
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set Whether newly added [0: no|1: yes]
     * @param IsNew Whether newly added [0: no|1: yes]
     */
    public void setIsNew(Long IsNew) {
        this.IsNew = IsNew;
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

    public AssetDatabaseBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetDatabaseBaseInfo(AssetDatabaseBaseInfo source) {
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
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.ConfigPath != null) {
            this.ConfigPath = new String(source.ConfigPath);
        }
        if (source.LogPath != null) {
            this.LogPath = new String(source.LogPath);
        }
        if (source.DataPath != null) {
            this.DataPath = new String(source.DataPath);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
        if (source.ErrorLogPath != null) {
            this.ErrorLogPath = new String(source.ErrorLogPath);
        }
        if (source.PlugInPath != null) {
            this.PlugInPath = new String(source.PlugInPath);
        }
        if (source.BinPath != null) {
            this.BinPath = new String(source.BinPath);
        }
        if (source.Param != null) {
            this.Param = new String(source.Param);
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
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
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
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Proto", this.Proto);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "ConfigPath", this.ConfigPath);
        this.setParamSimple(map, prefix + "LogPath", this.LogPath);
        this.setParamSimple(map, prefix + "DataPath", this.DataPath);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "ErrorLogPath", this.ErrorLogPath);
        this.setParamSimple(map, prefix + "PlugInPath", this.PlugInPath);
        this.setParamSimple(map, prefix + "BinPath", this.BinPath);
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

