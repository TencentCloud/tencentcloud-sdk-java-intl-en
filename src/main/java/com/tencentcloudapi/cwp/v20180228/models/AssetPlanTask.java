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

public class AssetPlanTask extends AbstractModel {

    /**
    * Default enabling status. 1 - enabled; 2 - not enabled
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Execution cycle
    */
    @SerializedName("Cycle")
    @Expose
    private String Cycle;

    /**
    * Execute command or script
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * Startup user
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Configuration file path
    */
    @SerializedName("ConfigPath")
    @Expose
    private String ConfigPath;

    /**
    * Server IP
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Name
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
    * Whether newly added [0: no|1: yes]
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
     * Get Default enabling status. 1 - enabled; 2 - not enabled 
     * @return Status Default enabling status. 1 - enabled; 2 - not enabled
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Default enabling status. 1 - enabled; 2 - not enabled
     * @param Status Default enabling status. 1 - enabled; 2 - not enabled
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Execution cycle 
     * @return Cycle Execution cycle
     */
    public String getCycle() {
        return this.Cycle;
    }

    /**
     * Set Execution cycle
     * @param Cycle Execution cycle
     */
    public void setCycle(String Cycle) {
        this.Cycle = Cycle;
    }

    /**
     * Get Execute command or script 
     * @return Command Execute command or script
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Execute command or script
     * @param Command Execute command or script
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get Startup user 
     * @return User Startup user
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Startup user
     * @param User Startup user
     */
    public void setUser(String User) {
        this.User = User;
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
     * Get Name 
     * @return MachineName Name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Name
     * @param MachineName Name
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

    public AssetPlanTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetPlanTask(AssetPlanTask source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Cycle != null) {
            this.Cycle = new String(source.Cycle);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.ConfigPath != null) {
            this.ConfigPath = new String(source.ConfigPath);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cycle", this.Cycle);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "ConfigPath", this.ConfigPath);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

