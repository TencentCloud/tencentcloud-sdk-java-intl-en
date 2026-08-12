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

public class VulFixableMachineItem extends AbstractModel {

    /**
    * <p>Vulnerability ID list, grouped by SupportAutoFix dimension: repairable vulnerability IDs when SupportAutoFix=1, non-repairable vulnerability IDs when SupportAutoFix=0</p>
    */
    @SerializedName("VulIds")
    @Expose
    private Long [] VulIds;

    /**
    * <p>Host instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Host name.</p>
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * <p>Host IP address.</p>
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * <p>public IP address</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>OS type<br>Enumeration value:<br>linux: Linux operating system<br>windows: Windows operating system</p>
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * <p>Operating system name.</p>
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * <p>Host online status<br>Enumeration value:<br>ONLINE: online<br>OFFLINE: offline</p>
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * <p>Is auto-repair supported<br>Enumeration value:<br>0: No support<br>1: Support</p>
    */
    @SerializedName("SupportAutoFix")
    @Expose
    private Long SupportAutoFix;

    /**
    * <p>Current remediation status<br>Enumeration value:<br>0: Unfixed<br>1: In remediation<br>2: Fix failure<br>3: Repair successful<br>4: Timeout</p>
    */
    @SerializedName("FixStatus")
    @Expose
    private Long FixStatus;

    /**
    * <p>Last repair time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
    */
    @SerializedName("LatestFixTime")
    @Expose
    private String LatestFixTime;

    /**
    * <p>Non-repairable reason. Returned when SupportAutoFix is 0.</p>
    */
    @SerializedName("NotFixableReason")
    @Expose
    private String NotFixableReason;

    /**
    * <p>Fix command list, returned when SupportAutoFix is 1</p>
    */
    @SerializedName("FixCommands")
    @Expose
    private String [] FixCommands;

    /**
    * <p>Associated component list</p>
    */
    @SerializedName("Components")
    @Expose
    private String [] Components;

    /**
    * <p>Asset tag list</p>
    */
    @SerializedName("TagItems")
    @Expose
    private MiniTagItem [] TagItems;

    /**
    * <p>Account AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Paid edition info<br>Enumeration value:<br>BASIC: Basic version<br>PRO: Pro edition<br>ULTIMATE: Flagship edition</p>
    */
    @SerializedName("PayVersion")
    @Expose
    private String PayVersion;

    /**
     * Get <p>Vulnerability ID list, grouped by SupportAutoFix dimension: repairable vulnerability IDs when SupportAutoFix=1, non-repairable vulnerability IDs when SupportAutoFix=0</p> 
     * @return VulIds <p>Vulnerability ID list, grouped by SupportAutoFix dimension: repairable vulnerability IDs when SupportAutoFix=1, non-repairable vulnerability IDs when SupportAutoFix=0</p>
     */
    public Long [] getVulIds() {
        return this.VulIds;
    }

    /**
     * Set <p>Vulnerability ID list, grouped by SupportAutoFix dimension: repairable vulnerability IDs when SupportAutoFix=1, non-repairable vulnerability IDs when SupportAutoFix=0</p>
     * @param VulIds <p>Vulnerability ID list, grouped by SupportAutoFix dimension: repairable vulnerability IDs when SupportAutoFix=1, non-repairable vulnerability IDs when SupportAutoFix=0</p>
     */
    public void setVulIds(Long [] VulIds) {
        this.VulIds = VulIds;
    }

    /**
     * Get <p>Host instance ID.</p> 
     * @return InstanceId <p>Host instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Host instance ID.</p>
     * @param InstanceId <p>Host instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Host name.</p> 
     * @return MachineName <p>Host name.</p>
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set <p>Host name.</p>
     * @param MachineName <p>Host name.</p>
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get <p>Host IP address.</p> 
     * @return MachineIp <p>Host IP address.</p>
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set <p>Host IP address.</p>
     * @param MachineIp <p>Host IP address.</p>
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get <p>public IP address</p> 
     * @return PublicIp <p>public IP address</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>public IP address</p>
     * @param PublicIp <p>public IP address</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>OS type<br>Enumeration value:<br>linux: Linux operating system<br>windows: Windows operating system</p> 
     * @return OsType <p>OS type<br>Enumeration value:<br>linux: Linux operating system<br>windows: Windows operating system</p>
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set <p>OS type<br>Enumeration value:<br>linux: Linux operating system<br>windows: Windows operating system</p>
     * @param OsType <p>OS type<br>Enumeration value:<br>linux: Linux operating system<br>windows: Windows operating system</p>
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get <p>Operating system name.</p> 
     * @return OsName <p>Operating system name.</p>
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set <p>Operating system name.</p>
     * @param OsName <p>Operating system name.</p>
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get <p>Host online status<br>Enumeration value:<br>ONLINE: online<br>OFFLINE: offline</p> 
     * @return MachineStatus <p>Host online status<br>Enumeration value:<br>ONLINE: online<br>OFFLINE: offline</p>
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set <p>Host online status<br>Enumeration value:<br>ONLINE: online<br>OFFLINE: offline</p>
     * @param MachineStatus <p>Host online status<br>Enumeration value:<br>ONLINE: online<br>OFFLINE: offline</p>
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get <p>Is auto-repair supported<br>Enumeration value:<br>0: No support<br>1: Support</p> 
     * @return SupportAutoFix <p>Is auto-repair supported<br>Enumeration value:<br>0: No support<br>1: Support</p>
     */
    public Long getSupportAutoFix() {
        return this.SupportAutoFix;
    }

    /**
     * Set <p>Is auto-repair supported<br>Enumeration value:<br>0: No support<br>1: Support</p>
     * @param SupportAutoFix <p>Is auto-repair supported<br>Enumeration value:<br>0: No support<br>1: Support</p>
     */
    public void setSupportAutoFix(Long SupportAutoFix) {
        this.SupportAutoFix = SupportAutoFix;
    }

    /**
     * Get <p>Current remediation status<br>Enumeration value:<br>0: Unfixed<br>1: In remediation<br>2: Fix failure<br>3: Repair successful<br>4: Timeout</p> 
     * @return FixStatus <p>Current remediation status<br>Enumeration value:<br>0: Unfixed<br>1: In remediation<br>2: Fix failure<br>3: Repair successful<br>4: Timeout</p>
     */
    public Long getFixStatus() {
        return this.FixStatus;
    }

    /**
     * Set <p>Current remediation status<br>Enumeration value:<br>0: Unfixed<br>1: In remediation<br>2: Fix failure<br>3: Repair successful<br>4: Timeout</p>
     * @param FixStatus <p>Current remediation status<br>Enumeration value:<br>0: Unfixed<br>1: In remediation<br>2: Fix failure<br>3: Repair successful<br>4: Timeout</p>
     */
    public void setFixStatus(Long FixStatus) {
        this.FixStatus = FixStatus;
    }

    /**
     * Get <p>Last repair time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p> 
     * @return LatestFixTime <p>Last repair time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public String getLatestFixTime() {
        return this.LatestFixTime;
    }

    /**
     * Set <p>Last repair time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     * @param LatestFixTime <p>Last repair time<br>Parameter format: YYYY-MM-DDTHH:mm:ssZ (ISO8601 format)</p>
     */
    public void setLatestFixTime(String LatestFixTime) {
        this.LatestFixTime = LatestFixTime;
    }

    /**
     * Get <p>Non-repairable reason. Returned when SupportAutoFix is 0.</p> 
     * @return NotFixableReason <p>Non-repairable reason. Returned when SupportAutoFix is 0.</p>
     */
    public String getNotFixableReason() {
        return this.NotFixableReason;
    }

    /**
     * Set <p>Non-repairable reason. Returned when SupportAutoFix is 0.</p>
     * @param NotFixableReason <p>Non-repairable reason. Returned when SupportAutoFix is 0.</p>
     */
    public void setNotFixableReason(String NotFixableReason) {
        this.NotFixableReason = NotFixableReason;
    }

    /**
     * Get <p>Fix command list, returned when SupportAutoFix is 1</p> 
     * @return FixCommands <p>Fix command list, returned when SupportAutoFix is 1</p>
     */
    public String [] getFixCommands() {
        return this.FixCommands;
    }

    /**
     * Set <p>Fix command list, returned when SupportAutoFix is 1</p>
     * @param FixCommands <p>Fix command list, returned when SupportAutoFix is 1</p>
     */
    public void setFixCommands(String [] FixCommands) {
        this.FixCommands = FixCommands;
    }

    /**
     * Get <p>Associated component list</p> 
     * @return Components <p>Associated component list</p>
     */
    public String [] getComponents() {
        return this.Components;
    }

    /**
     * Set <p>Associated component list</p>
     * @param Components <p>Associated component list</p>
     */
    public void setComponents(String [] Components) {
        this.Components = Components;
    }

    /**
     * Get <p>Asset tag list</p> 
     * @return TagItems <p>Asset tag list</p>
     */
    public MiniTagItem [] getTagItems() {
        return this.TagItems;
    }

    /**
     * Set <p>Asset tag list</p>
     * @param TagItems <p>Asset tag list</p>
     */
    public void setTagItems(MiniTagItem [] TagItems) {
        this.TagItems = TagItems;
    }

    /**
     * Get <p>Account AppId</p> 
     * @return AppId <p>Account AppId</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Account AppId</p>
     * @param AppId <p>Account AppId</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Paid edition info<br>Enumeration value:<br>BASIC: Basic version<br>PRO: Pro edition<br>ULTIMATE: Flagship edition</p> 
     * @return PayVersion <p>Paid edition info<br>Enumeration value:<br>BASIC: Basic version<br>PRO: Pro edition<br>ULTIMATE: Flagship edition</p>
     */
    public String getPayVersion() {
        return this.PayVersion;
    }

    /**
     * Set <p>Paid edition info<br>Enumeration value:<br>BASIC: Basic version<br>PRO: Pro edition<br>ULTIMATE: Flagship edition</p>
     * @param PayVersion <p>Paid edition info<br>Enumeration value:<br>BASIC: Basic version<br>PRO: Pro edition<br>ULTIMATE: Flagship edition</p>
     */
    public void setPayVersion(String PayVersion) {
        this.PayVersion = PayVersion;
    }

    public VulFixableMachineItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixableMachineItem(VulFixableMachineItem source) {
        if (source.VulIds != null) {
            this.VulIds = new Long[source.VulIds.length];
            for (int i = 0; i < source.VulIds.length; i++) {
                this.VulIds[i] = new Long(source.VulIds[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.OsType != null) {
            this.OsType = new String(source.OsType);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.SupportAutoFix != null) {
            this.SupportAutoFix = new Long(source.SupportAutoFix);
        }
        if (source.FixStatus != null) {
            this.FixStatus = new Long(source.FixStatus);
        }
        if (source.LatestFixTime != null) {
            this.LatestFixTime = new String(source.LatestFixTime);
        }
        if (source.NotFixableReason != null) {
            this.NotFixableReason = new String(source.NotFixableReason);
        }
        if (source.FixCommands != null) {
            this.FixCommands = new String[source.FixCommands.length];
            for (int i = 0; i < source.FixCommands.length; i++) {
                this.FixCommands[i] = new String(source.FixCommands[i]);
            }
        }
        if (source.Components != null) {
            this.Components = new String[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new String(source.Components[i]);
            }
        }
        if (source.TagItems != null) {
            this.TagItems = new MiniTagItem[source.TagItems.length];
            for (int i = 0; i < source.TagItems.length; i++) {
                this.TagItems[i] = new MiniTagItem(source.TagItems[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PayVersion != null) {
            this.PayVersion = new String(source.PayVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VulIds.", this.VulIds);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "SupportAutoFix", this.SupportAutoFix);
        this.setParamSimple(map, prefix + "FixStatus", this.FixStatus);
        this.setParamSimple(map, prefix + "LatestFixTime", this.LatestFixTime);
        this.setParamSimple(map, prefix + "NotFixableReason", this.NotFixableReason);
        this.setParamArraySimple(map, prefix + "FixCommands.", this.FixCommands);
        this.setParamArraySimple(map, prefix + "Components.", this.Components);
        this.setParamArrayObj(map, prefix + "TagItems.", this.TagItems);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PayVersion", this.PayVersion);

    }
}

