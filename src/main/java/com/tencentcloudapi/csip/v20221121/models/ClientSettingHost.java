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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientSettingHost extends AbstractModel {

    /**
    * <p>Database record ID corresponding to the host.</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Host name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Public IP address</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>Private IP address.</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>Host Quuid</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>Host status<br>OFFLINE: offline<br>ONLINE: online<br>SHUTDOWN: is shut down<br>UNINSTALLED: no protection</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>ins-sad143</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Region information.</p>
    */
    @SerializedName("RegionInfo")
    @Expose
    private RegionInfo RegionInfo;

    /**
    * <p>Additional information.</p>
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * <p>0: Disabled<br>1: Enabled<br>2: Enabling<br>3: Disabling<br>9: Not set</p>
    */
    @SerializedName("FunctionStatus")
    @Expose
    private Long FunctionStatus;

    /**
    * <p>The following fixed values require special handling on the frontend, while other failure reasons can be shown directly:</p><ol><li>UNINSTALLED   -- not installed</li><li>NEED_UPGRADE -- Upgrade required</li><li>NOT_RUNNING -- is shut down</li><li>NO_PASSWORD -- Password login is not enabled, so QR code login cannot be enabled</li></ol>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>Failure reason</p>
    */
    @SerializedName("MessageDesc")
    @Expose
    private String MessageDesc;

    /**
    * <p>Instance status<br>RUNNING: Running<br>STOPED: Shut down<br>EXPIRED: To be recycled</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
     * Get <p>Database record ID corresponding to the host.</p> 
     * @return Id <p>Database record ID corresponding to the host.</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Database record ID corresponding to the host.</p>
     * @param Id <p>Database record ID corresponding to the host.</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Host name.</p> 
     * @return Name <p>Host name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Host name.</p>
     * @param Name <p>Host name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Public IP address</p> 
     * @return PublicIp <p>Public IP address</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>Public IP address</p>
     * @param PublicIp <p>Public IP address</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>Private IP address.</p> 
     * @return PrivateIp <p>Private IP address.</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>Private IP address.</p>
     * @param PrivateIp <p>Private IP address.</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>Host Quuid</p> 
     * @return Quuid <p>Host Quuid</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>Host Quuid</p>
     * @param Quuid <p>Host Quuid</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>Host status<br>OFFLINE: offline<br>ONLINE: online<br>SHUTDOWN: is shut down<br>UNINSTALLED: no protection</p> 
     * @return Status <p>Host status<br>OFFLINE: offline<br>ONLINE: online<br>SHUTDOWN: is shut down<br>UNINSTALLED: no protection</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Host status<br>OFFLINE: offline<br>ONLINE: online<br>SHUTDOWN: is shut down<br>UNINSTALLED: no protection</p>
     * @param Status <p>Host status<br>OFFLINE: offline<br>ONLINE: online<br>SHUTDOWN: is shut down<br>UNINSTALLED: no protection</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>ins-sad143</p> 
     * @return VpcId <p>ins-sad143</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>ins-sad143</p>
     * @param VpcId <p>ins-sad143</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Region information.</p> 
     * @return RegionInfo <p>Region information.</p>
     */
    public RegionInfo getRegionInfo() {
        return this.RegionInfo;
    }

    /**
     * Set <p>Region information.</p>
     * @param RegionInfo <p>Region information.</p>
     */
    public void setRegionInfo(RegionInfo RegionInfo) {
        this.RegionInfo = RegionInfo;
    }

    /**
     * Get <p>Additional information.</p> 
     * @return MachineExtraInfo <p>Additional information.</p>
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set <p>Additional information.</p>
     * @param MachineExtraInfo <p>Additional information.</p>
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get <p>0: Disabled<br>1: Enabled<br>2: Enabling<br>3: Disabling<br>9: Not set</p> 
     * @return FunctionStatus <p>0: Disabled<br>1: Enabled<br>2: Enabling<br>3: Disabling<br>9: Not set</p>
     */
    public Long getFunctionStatus() {
        return this.FunctionStatus;
    }

    /**
     * Set <p>0: Disabled<br>1: Enabled<br>2: Enabling<br>3: Disabling<br>9: Not set</p>
     * @param FunctionStatus <p>0: Disabled<br>1: Enabled<br>2: Enabling<br>3: Disabling<br>9: Not set</p>
     */
    public void setFunctionStatus(Long FunctionStatus) {
        this.FunctionStatus = FunctionStatus;
    }

    /**
     * Get <p>The following fixed values require special handling on the frontend, while other failure reasons can be shown directly:</p><ol><li>UNINSTALLED   -- not installed</li><li>NEED_UPGRADE -- Upgrade required</li><li>NOT_RUNNING -- is shut down</li><li>NO_PASSWORD -- Password login is not enabled, so QR code login cannot be enabled</li></ol> 
     * @return Message <p>The following fixed values require special handling on the frontend, while other failure reasons can be shown directly:</p><ol><li>UNINSTALLED   -- not installed</li><li>NEED_UPGRADE -- Upgrade required</li><li>NOT_RUNNING -- is shut down</li><li>NO_PASSWORD -- Password login is not enabled, so QR code login cannot be enabled</li></ol>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>The following fixed values require special handling on the frontend, while other failure reasons can be shown directly:</p><ol><li>UNINSTALLED   -- not installed</li><li>NEED_UPGRADE -- Upgrade required</li><li>NOT_RUNNING -- is shut down</li><li>NO_PASSWORD -- Password login is not enabled, so QR code login cannot be enabled</li></ol>
     * @param Message <p>The following fixed values require special handling on the frontend, while other failure reasons can be shown directly:</p><ol><li>UNINSTALLED   -- not installed</li><li>NEED_UPGRADE -- Upgrade required</li><li>NOT_RUNNING -- is shut down</li><li>NO_PASSWORD -- Password login is not enabled, so QR code login cannot be enabled</li></ol>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>Failure reason</p> 
     * @return MessageDesc <p>Failure reason</p>
     */
    public String getMessageDesc() {
        return this.MessageDesc;
    }

    /**
     * Set <p>Failure reason</p>
     * @param MessageDesc <p>Failure reason</p>
     */
    public void setMessageDesc(String MessageDesc) {
        this.MessageDesc = MessageDesc;
    }

    /**
     * Get <p>Instance status<br>RUNNING: Running<br>STOPED: Shut down<br>EXPIRED: To be recycled</p> 
     * @return InstanceStatus <p>Instance status<br>RUNNING: Running<br>STOPED: Shut down<br>EXPIRED: To be recycled</p>
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>Instance status<br>RUNNING: Running<br>STOPED: Shut down<br>EXPIRED: To be recycled</p>
     * @param InstanceStatus <p>Instance status<br>RUNNING: Running<br>STOPED: Shut down<br>EXPIRED: To be recycled</p>
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

