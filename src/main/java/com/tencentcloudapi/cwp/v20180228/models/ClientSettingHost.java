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

public class ClientSettingHost extends AbstractModel {

    /**
    * Record ID of the corresponding database host
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Host name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Public IP address
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Private IP address
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host status
<li>OFFLINE: Offline</li>
<li>ONLINE: Online</li>
<li>SHUTDOWN: Shut down</li>
<li>UNINSTALLED: Unprotected</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * ins-sad143
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Region information
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * Additional information
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * <li>0: disabled</li>
<li>1:  Enable</li>
<li>2: Enabled </li>
<li>3: Turning off</li>
<li>9: not set</li>
    */
    @SerializedName("FunctionStatus")
    @Expose
    private Long FunctionStatus;

    /**
    * The following fixed values require special handling by the frontend, other failures can be shown directly.
1. UNINSTALLED -- Not installed
2. NEED_UPGRADE -- Upgrade required
3. NOT_RUNNING -- Shutdown
4. NO_PASSWORD -- Password login is not enabled and cannot be enabled.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Reason for failure
    */
    @SerializedName("MessageDesc")
    @Expose
    private String MessageDesc;

    /**
    * Instance status
<li>RUNNING: running</li>
<li>STOPPED: Shut down</li>
<li>EXPIRED: To be recycled</li>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
     * Get Record ID of the corresponding database host 
     * @return Id Record ID of the corresponding database host
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Record ID of the corresponding database host
     * @param Id Record ID of the corresponding database host
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Host name. 
     * @return Name Host name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Host name.
     * @param Name Host name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Public IP address 
     * @return PublicIp Public IP address
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP address
     * @param PublicIp Public IP address
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Private IP address 
     * @return PrivateIp Private IP address
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private IP address
     * @param PrivateIp Private IP address
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
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
     * Get Host status
<li>OFFLINE: Offline</li>
<li>ONLINE: Online</li>
<li>SHUTDOWN: Shut down</li>
<li>UNINSTALLED: Unprotected</li> 
     * @return Status Host status
<li>OFFLINE: Offline</li>
<li>ONLINE: Online</li>
<li>SHUTDOWN: Shut down</li>
<li>UNINSTALLED: Unprotected</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Host status
<li>OFFLINE: Offline</li>
<li>ONLINE: Online</li>
<li>SHUTDOWN: Shut down</li>
<li>UNINSTALLED: Unprotected</li>
     * @param Status Host status
<li>OFFLINE: Offline</li>
<li>ONLINE: Online</li>
<li>SHUTDOWN: Shut down</li>
<li>UNINSTALLED: Unprotected</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get ins-sad143 
     * @return VpcId ins-sad143
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ins-sad143
     * @param VpcId ins-sad143
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Region information 
     * @return RegionInfo Region information
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set Region information
     * @param RegionInfo Region information
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get Additional information 
     * @return MachineExtraInfo Additional information
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Additional information
     * @param MachineExtraInfo Additional information
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get <li>0: disabled</li>
<li>1:  Enable</li>
<li>2: Enabled </li>
<li>3: Turning off</li>
<li>9: not set</li> 
     * @return FunctionStatus <li>0: disabled</li>
<li>1:  Enable</li>
<li>2: Enabled </li>
<li>3: Turning off</li>
<li>9: not set</li>
     */
    public Long getFunctionStatus() {
        return this.FunctionStatus;
    }

    /**
     * Set <li>0: disabled</li>
<li>1:  Enable</li>
<li>2: Enabled </li>
<li>3: Turning off</li>
<li>9: not set</li>
     * @param FunctionStatus <li>0: disabled</li>
<li>1:  Enable</li>
<li>2: Enabled </li>
<li>3: Turning off</li>
<li>9: not set</li>
     */
    public void setFunctionStatus(Long FunctionStatus) {
        this.FunctionStatus = FunctionStatus;
    }

    /**
     * Get The following fixed values require special handling by the frontend, other failures can be shown directly.
1. UNINSTALLED -- Not installed
2. NEED_UPGRADE -- Upgrade required
3. NOT_RUNNING -- Shutdown
4. NO_PASSWORD -- Password login is not enabled and cannot be enabled. 
     * @return Message The following fixed values require special handling by the frontend, other failures can be shown directly.
1. UNINSTALLED -- Not installed
2. NEED_UPGRADE -- Upgrade required
3. NOT_RUNNING -- Shutdown
4. NO_PASSWORD -- Password login is not enabled and cannot be enabled.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set The following fixed values require special handling by the frontend, other failures can be shown directly.
1. UNINSTALLED -- Not installed
2. NEED_UPGRADE -- Upgrade required
3. NOT_RUNNING -- Shutdown
4. NO_PASSWORD -- Password login is not enabled and cannot be enabled.
     * @param Message The following fixed values require special handling by the frontend, other failures can be shown directly.
1. UNINSTALLED -- Not installed
2. NEED_UPGRADE -- Upgrade required
3. NOT_RUNNING -- Shutdown
4. NO_PASSWORD -- Password login is not enabled and cannot be enabled.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Reason for failure 
     * @return MessageDesc Reason for failure
     */
    public String getMessageDesc() {
        return this.MessageDesc;
    }

    /**
     * Set Reason for failure
     * @param MessageDesc Reason for failure
     */
    public void setMessageDesc(String MessageDesc) {
        this.MessageDesc = MessageDesc;
    }

    /**
     * Get Instance status
<li>RUNNING: running</li>
<li>STOPPED: Shut down</li>
<li>EXPIRED: To be recycled</li> 
     * @return InstanceStatus Instance status
<li>RUNNING: running</li>
<li>STOPPED: Shut down</li>
<li>EXPIRED: To be recycled</li>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance status
<li>RUNNING: running</li>
<li>STOPPED: Shut down</li>
<li>EXPIRED: To be recycled</li>
     * @param InstanceStatus Instance status
<li>RUNNING: running</li>
<li>STOPPED: Shut down</li>
<li>EXPIRED: To be recycled</li>
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    public ClientSettingHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientSettingHost(ClientSettingHost source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.RegionInfo != null) {
            this.RegionInfo = new RegionInfo(source.RegionInfo);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.FunctionStatus != null) {
            this.FunctionStatus = new Long(source.FunctionStatus);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.MessageDesc != null) {
            this.MessageDesc = new String(source.MessageDesc);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamObj(map, prefix + "RegionInfo.", this.RegionInfo);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "FunctionStatus", this.FunctionStatus);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "MessageDesc", this.MessageDesc);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);

    }
}

