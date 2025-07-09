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

public class LicenseBindDetail extends AbstractModel {

    /**
    * Machine Alias
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Machine Public IP address
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * Machine Private IP address
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * CVM UUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * CWPP client UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Tag information
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * CWPP client status: OFFLINE, ONLINE, and UNINSTALL.
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * Whether unbinding is allowed: false - unbinding is not allowed.
    */
    @SerializedName("IsUnBind")
    @Expose
    private Boolean IsUnBind;

    /**
    * Whether rebinding is allowed: false - rebinding is not allowed.
    */
    @SerializedName("IsSwitchBind")
    @Expose
    private Boolean IsSwitchBind;

    /**
    * Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get Machine Alias 
     * @return MachineName Machine Alias
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Machine Alias
     * @param MachineName Machine Alias
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Machine Public IP address 
     * @return MachineWanIp Machine Public IP address
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Machine Public IP address
     * @param MachineWanIp Machine Public IP address
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get Machine Private IP address 
     * @return MachineIp Machine Private IP address
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Machine Private IP address
     * @param MachineIp Machine Private IP address
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get CVM UUID 
     * @return Quuid CVM UUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set CVM UUID
     * @param Quuid CVM UUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get CWPP client UUID 
     * @return Uuid CWPP client UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWPP client UUID
     * @param Uuid CWPP client UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Tag information 
     * @return Tags Tag information
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information
     * @param Tags Tag information
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get CWPP client status: OFFLINE, ONLINE, and UNINSTALL. 
     * @return AgentStatus CWPP client status: OFFLINE, ONLINE, and UNINSTALL.
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set CWPP client status: OFFLINE, ONLINE, and UNINSTALL.
     * @param AgentStatus CWPP client status: OFFLINE, ONLINE, and UNINSTALL.
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get Whether unbinding is allowed: false - unbinding is not allowed. 
     * @return IsUnBind Whether unbinding is allowed: false - unbinding is not allowed.
     */
    public Boolean getIsUnBind() {
        return this.IsUnBind;
    }

    /**
     * Set Whether unbinding is allowed: false - unbinding is not allowed.
     * @param IsUnBind Whether unbinding is allowed: false - unbinding is not allowed.
     */
    public void setIsUnBind(Boolean IsUnBind) {
        this.IsUnBind = IsUnBind;
    }

    /**
     * Get Whether rebinding is allowed: false - rebinding is not allowed. 
     * @return IsSwitchBind Whether rebinding is allowed: false - rebinding is not allowed.
     */
    public Boolean getIsSwitchBind() {
        return this.IsSwitchBind;
    }

    /**
     * Set Whether rebinding is allowed: false - rebinding is not allowed.
     * @param IsSwitchBind Whether rebinding is allowed: false - rebinding is not allowed.
     */
    public void setIsSwitchBind(Boolean IsSwitchBind) {
        this.IsSwitchBind = IsSwitchBind;
    }

    /**
     * Get Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineExtraInfo Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineExtraInfo Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public LicenseBindDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseBindDetail(LicenseBindDetail source) {
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.IsUnBind != null) {
            this.IsUnBind = new Boolean(source.IsUnBind);
        }
        if (source.IsSwitchBind != null) {
            this.IsSwitchBind = new Boolean(source.IsSwitchBind);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "IsUnBind", this.IsUnBind);
        this.setParamSimple(map, prefix + "IsSwitchBind", this.IsSwitchBind);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

