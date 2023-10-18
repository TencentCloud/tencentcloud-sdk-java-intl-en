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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceInfo extends AbstractModel {

    /**
    * Service ID
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * Server ID
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * Server IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Container name
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * Service name, such as `nginx` and `redis`
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Version
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Account
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

    /**
    * Listened port
    */
    @SerializedName("Listen")
    @Expose
    private String [] Listen;

    /**
    * Configuration
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * Number of associated processes
    */
    @SerializedName("ProcessCnt")
    @Expose
    private Long ProcessCnt;

    /**
    * Access log
    */
    @SerializedName("AccessLog")
    @Expose
    private String AccessLog;

    /**
    * Error log
    */
    @SerializedName("ErrorLog")
    @Expose
    private String ErrorLog;

    /**
    * Data directory
    */
    @SerializedName("DataPath")
    @Expose
    private String DataPath;

    /**
    * Web directory
    */
    @SerializedName("WebRoot")
    @Expose
    private String WebRoot;

    /**
    * ID of the associated process
    */
    @SerializedName("Pids")
    @Expose
    private Long [] Pids;

    /**
    * Service type. Valid values: `app`, `web`, `db`.
    */
    @SerializedName("MainType")
    @Expose
    private String MainType;

    /**
    * Execution file
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * Service command line parameter
    */
    @SerializedName("Parameter")
    @Expose
    private String Parameter;

    /**
    * Container ID
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * Server name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Public IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
     * Get Service ID 
     * @return ServiceID Service ID
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set Service ID
     * @param ServiceID Service ID
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get Server ID 
     * @return HostID Server ID
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set Server ID
     * @param HostID Server ID
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get Server IP 
     * @return HostIP Server IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Server IP
     * @param HostIP Server IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get Container name 
     * @return ContainerName Container name
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set Container name
     * @param ContainerName Container name
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get Service name, such as `nginx` and `redis` 
     * @return Type Service name, such as `nginx` and `redis`
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Service name, such as `nginx` and `redis`
     * @param Type Service name, such as `nginx` and `redis`
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * Get Account 
     * @return RunAs Account
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set Account
     * @param RunAs Account
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
    }

    /**
     * Get Listened port 
     * @return Listen Listened port
     */
    public String [] getListen() {
        return this.Listen;
    }

    /**
     * Set Listened port
     * @param Listen Listened port
     */
    public void setListen(String [] Listen) {
        this.Listen = Listen;
    }

    /**
     * Get Configuration 
     * @return Config Configuration
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set Configuration
     * @param Config Configuration
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get Number of associated processes 
     * @return ProcessCnt Number of associated processes
     */
    public Long getProcessCnt() {
        return this.ProcessCnt;
    }

    /**
     * Set Number of associated processes
     * @param ProcessCnt Number of associated processes
     */
    public void setProcessCnt(Long ProcessCnt) {
        this.ProcessCnt = ProcessCnt;
    }

    /**
     * Get Access log 
     * @return AccessLog Access log
     */
    public String getAccessLog() {
        return this.AccessLog;
    }

    /**
     * Set Access log
     * @param AccessLog Access log
     */
    public void setAccessLog(String AccessLog) {
        this.AccessLog = AccessLog;
    }

    /**
     * Get Error log 
     * @return ErrorLog Error log
     */
    public String getErrorLog() {
        return this.ErrorLog;
    }

    /**
     * Set Error log
     * @param ErrorLog Error log
     */
    public void setErrorLog(String ErrorLog) {
        this.ErrorLog = ErrorLog;
    }

    /**
     * Get Data directory 
     * @return DataPath Data directory
     */
    public String getDataPath() {
        return this.DataPath;
    }

    /**
     * Set Data directory
     * @param DataPath Data directory
     */
    public void setDataPath(String DataPath) {
        this.DataPath = DataPath;
    }

    /**
     * Get Web directory 
     * @return WebRoot Web directory
     */
    public String getWebRoot() {
        return this.WebRoot;
    }

    /**
     * Set Web directory
     * @param WebRoot Web directory
     */
    public void setWebRoot(String WebRoot) {
        this.WebRoot = WebRoot;
    }

    /**
     * Get ID of the associated process 
     * @return Pids ID of the associated process
     */
    public Long [] getPids() {
        return this.Pids;
    }

    /**
     * Set ID of the associated process
     * @param Pids ID of the associated process
     */
    public void setPids(Long [] Pids) {
        this.Pids = Pids;
    }

    /**
     * Get Service type. Valid values: `app`, `web`, `db`. 
     * @return MainType Service type. Valid values: `app`, `web`, `db`.
     */
    public String getMainType() {
        return this.MainType;
    }

    /**
     * Set Service type. Valid values: `app`, `web`, `db`.
     * @param MainType Service type. Valid values: `app`, `web`, `db`.
     */
    public void setMainType(String MainType) {
        this.MainType = MainType;
    }

    /**
     * Get Execution file 
     * @return Exe Execution file
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set Execution file
     * @param Exe Execution file
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get Service command line parameter 
     * @return Parameter Service command line parameter
     */
    public String getParameter() {
        return this.Parameter;
    }

    /**
     * Set Service command line parameter
     * @param Parameter Service command line parameter
     */
    public void setParameter(String Parameter) {
        this.Parameter = Parameter;
    }

    /**
     * Get Container ID 
     * @return ContainerId Container ID
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set Container ID
     * @param ContainerId Container ID
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get Server name 
     * @return HostName Server name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Server name
     * @param HostName Server name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Public IP 
     * @return PublicIp Public IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP
     * @param PublicIp Public IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    public ServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceInfo(ServiceInfo source) {
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
        }
        if (source.Listen != null) {
            this.Listen = new String[source.Listen.length];
            for (int i = 0; i < source.Listen.length; i++) {
                this.Listen[i] = new String(source.Listen[i]);
            }
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.ProcessCnt != null) {
            this.ProcessCnt = new Long(source.ProcessCnt);
        }
        if (source.AccessLog != null) {
            this.AccessLog = new String(source.AccessLog);
        }
        if (source.ErrorLog != null) {
            this.ErrorLog = new String(source.ErrorLog);
        }
        if (source.DataPath != null) {
            this.DataPath = new String(source.DataPath);
        }
        if (source.WebRoot != null) {
            this.WebRoot = new String(source.WebRoot);
        }
        if (source.Pids != null) {
            this.Pids = new Long[source.Pids.length];
            for (int i = 0; i < source.Pids.length; i++) {
                this.Pids[i] = new Long(source.Pids[i]);
            }
        }
        if (source.MainType != null) {
            this.MainType = new String(source.MainType);
        }
        if (source.Exe != null) {
            this.Exe = new String(source.Exe);
        }
        if (source.Parameter != null) {
            this.Parameter = new String(source.Parameter);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamArraySimple(map, prefix + "Listen.", this.Listen);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "ProcessCnt", this.ProcessCnt);
        this.setParamSimple(map, prefix + "AccessLog", this.AccessLog);
        this.setParamSimple(map, prefix + "ErrorLog", this.ErrorLog);
        this.setParamSimple(map, prefix + "DataPath", this.DataPath);
        this.setParamSimple(map, prefix + "WebRoot", this.WebRoot);
        this.setParamArraySimple(map, prefix + "Pids.", this.Pids);
        this.setParamSimple(map, prefix + "MainType", this.MainType);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "Parameter", this.Parameter);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);

    }
}

