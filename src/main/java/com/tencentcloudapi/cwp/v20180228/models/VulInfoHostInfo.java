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

public class VulInfoHostInfo extends AbstractModel {

    /**
    * host name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Host IP address
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Host tag
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 0: Vulnerability cannot be automatically repaired, 1: Can be automatically repaired, 2: Client offline, 3: Manual fixing supported for non-flagship hosts, 4: Not supported for this model, 5: In remediation, 6: Fixed, 7: Detecting, 9: Fix failed, 10: Ignored, 11: Vulnerability supported only on linux, not Windows, 12: Vulnerability supported only on Windows, not linux.
    */
    @SerializedName("IsSupportAutoFix")
    @Expose
    private Long IsSupportAutoFix;

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Host instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Host type
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * agent online status; 0 for offline, 1 for online.
    */
    @SerializedName("AgentStatus")
    @Expose
    private Long AgentStatus;

    /**
     * Get host name 
     * @return HostName host name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set host name
     * @param HostName host name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Host IP address 
     * @return HostIp Host IP address
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host IP address
     * @param HostIp Host IP address
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Host tag 
     * @return Tags Host tag
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Host tag
     * @param Tags Host tag
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
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
     * Get 0: Vulnerability cannot be automatically repaired, 1: Can be automatically repaired, 2: Client offline, 3: Manual fixing supported for non-flagship hosts, 4: Not supported for this model, 5: In remediation, 6: Fixed, 7: Detecting, 9: Fix failed, 10: Ignored, 11: Vulnerability supported only on linux, not Windows, 12: Vulnerability supported only on Windows, not linux. 
     * @return IsSupportAutoFix 0: Vulnerability cannot be automatically repaired, 1: Can be automatically repaired, 2: Client offline, 3: Manual fixing supported for non-flagship hosts, 4: Not supported for this model, 5: In remediation, 6: Fixed, 7: Detecting, 9: Fix failed, 10: Ignored, 11: Vulnerability supported only on linux, not Windows, 12: Vulnerability supported only on Windows, not linux.
     */
    public Long getIsSupportAutoFix() {
        return this.IsSupportAutoFix;
    }

    /**
     * Set 0: Vulnerability cannot be automatically repaired, 1: Can be automatically repaired, 2: Client offline, 3: Manual fixing supported for non-flagship hosts, 4: Not supported for this model, 5: In remediation, 6: Fixed, 7: Detecting, 9: Fix failed, 10: Ignored, 11: Vulnerability supported only on linux, not Windows, 12: Vulnerability supported only on Windows, not linux.
     * @param IsSupportAutoFix 0: Vulnerability cannot be automatically repaired, 1: Can be automatically repaired, 2: Client offline, 3: Manual fixing supported for non-flagship hosts, 4: Not supported for this model, 5: In remediation, 6: Fixed, 7: Detecting, 9: Fix failed, 10: Ignored, 11: Vulnerability supported only on linux, not Windows, 12: Vulnerability supported only on Windows, not linux.
     */
    public void setIsSupportAutoFix(Long IsSupportAutoFix) {
        this.IsSupportAutoFix = IsSupportAutoFix;
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
     * Get Host instance ID. 
     * @return InstanceId Host instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Host instance ID.
     * @param InstanceId Host instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Host type 
     * @return MachineType Host type
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Host type
     * @param MachineType Host type
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get agent online status; 0 for offline, 1 for online. 
     * @return AgentStatus agent online status; 0 for offline, 1 for online.
     */
    public Long getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set agent online status; 0 for offline, 1 for online.
     * @param AgentStatus agent online status; 0 for offline, 1 for online.
     */
    public void setAgentStatus(Long AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    public VulInfoHostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulInfoHostInfo(VulInfoHostInfo source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.IsSupportAutoFix != null) {
            this.IsSupportAutoFix = new Long(source.IsSupportAutoFix);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new Long(source.AgentStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "IsSupportAutoFix", this.IsSupportAutoFix);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);

    }
}

