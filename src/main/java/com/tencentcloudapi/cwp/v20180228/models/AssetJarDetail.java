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

public class AssetJarDetail extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Type: 1: application; 2: system library; 3: Web service built-in library; 8: other
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Whether executable: 0: unknown; 1: yes; 2: no
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

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
    * Reference process list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Process")
    @Expose
    private AssetAppProcessInfo [] Process;

    /**
    * Jar package Md5
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * Data update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * Get Type: 1: application; 2: system library; 3: Web service built-in library; 8: other 
     * @return Type Type: 1: application; 2: system library; 3: Web service built-in library; 8: other
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Type: 1: application; 2: system library; 3: Web service built-in library; 8: other
     * @param Type Type: 1: application; 2: system library; 3: Web service built-in library; 8: other
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Whether executable: 0: unknown; 1: yes; 2: no 
     * @return Status Whether executable: 0: unknown; 1: yes; 2: no
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Whether executable: 0: unknown; 1: yes; 2: no
     * @param Status Whether executable: 0: unknown; 1: yes; 2: no
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get Reference process list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Process Reference process list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AssetAppProcessInfo [] getProcess() {
        return this.Process;
    }

    /**
     * Set Reference process list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Process Reference process list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcess(AssetAppProcessInfo [] Process) {
        this.Process = Process;
    }

    /**
     * Get Jar package Md5
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Md5 Jar package Md5
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set Jar package Md5
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Md5 Jar package Md5
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
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

    public AssetJarDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetJarDetail(AssetJarDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
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
        if (source.Process != null) {
            this.Process = new AssetAppProcessInfo[source.Process.length];
            for (int i = 0; i < source.Process.length; i++) {
                this.Process[i] = new AssetAppProcessInfo(source.Process[i]);
            }
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "OsInfo", this.OsInfo);
        this.setParamArrayObj(map, prefix + "Process.", this.Process);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

