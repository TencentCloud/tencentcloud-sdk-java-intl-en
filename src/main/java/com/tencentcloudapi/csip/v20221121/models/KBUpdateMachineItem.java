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

public class KBUpdateMachineItem extends AbstractModel {

    /**
    * <p>KB patch ID</p>
    */
    @SerializedName("KBId")
    @Expose
    private Long KBId;

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
    * <p>Public IP address</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>OS name</p>
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * <p>Host online status<br>Enumeration values:<br>ONLINE: online<br>OFFLINE: offline</p>
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * <p>Whether auto-update patch is supported<br>Enumeration values:<br>0: unsupported<br>1: supported</p>
    */
    @SerializedName("SupportAutoFix")
    @Expose
    private Long SupportAutoFix;

    /**
    * <p>Current remediation status<br>Enumeration values:<br>0: Unfixed<br>1: In remediation<br>2: Fix failed<br>3: Repair successful<br>4: Remediation timeout</p>
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
    * <p>Payment version information<br>Enumeration values:<br>BASIC: basic version<br>PRO: pro edition<br>ULTIMATE: flagship edition</p>
    */
    @SerializedName("PayVersion")
    @Expose
    private String PayVersion;

    /**
     * Get <p>KB patch ID</p> 
     * @return KBId <p>KB patch ID</p>
     */
    public Long getKBId() {
        return this.KBId;
    }

    /**
     * Set <p>KB patch ID</p>
     * @param KBId <p>KB patch ID</p>
     */
    public void setKBId(Long KBId) {
        this.KBId = KBId;
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
     * Get <p>OS name</p> 
     * @return OsName <p>OS name</p>
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set <p>OS name</p>
     * @param OsName <p>OS name</p>
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get <p>Host online status<br>Enumeration values:<br>ONLINE: online<br>OFFLINE: offline</p> 
     * @return MachineStatus <p>Host online status<br>Enumeration values:<br>ONLINE: online<br>OFFLINE: offline</p>
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set <p>Host online status<br>Enumeration values:<br>ONLINE: online<br>OFFLINE: offline</p>
     * @param MachineStatus <p>Host online status<br>Enumeration values:<br>ONLINE: online<br>OFFLINE: offline</p>
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get <p>Whether auto-update patch is supported<br>Enumeration values:<br>0: unsupported<br>1: supported</p> 
     * @return SupportAutoFix <p>Whether auto-update patch is supported<br>Enumeration values:<br>0: unsupported<br>1: supported</p>
     */
    public Long getSupportAutoFix() {
        return this.SupportAutoFix;
    }

    /**
     * Set <p>Whether auto-update patch is supported<br>Enumeration values:<br>0: unsupported<br>1: supported</p>
     * @param SupportAutoFix <p>Whether auto-update patch is supported<br>Enumeration values:<br>0: unsupported<br>1: supported</p>
     */
    public void setSupportAutoFix(Long SupportAutoFix) {
        this.SupportAutoFix = SupportAutoFix;
    }

    /**
     * Get <p>Current remediation status<br>Enumeration values:<br>0: Unfixed<br>1: In remediation<br>2: Fix failed<br>3: Repair successful<br>4: Remediation timeout</p> 
     * @return FixStatus <p>Current remediation status<br>Enumeration values:<br>0: Unfixed<br>1: In remediation<br>2: Fix failed<br>3: Repair successful<br>4: Remediation timeout</p>
     */
    public Long getFixStatus() {
        return this.FixStatus;
    }

    /**
     * Set <p>Current remediation status<br>Enumeration values:<br>0: Unfixed<br>1: In remediation<br>2: Fix failed<br>3: Repair successful<br>4: Remediation timeout</p>
     * @param FixStatus <p>Current remediation status<br>Enumeration values:<br>0: Unfixed<br>1: In remediation<br>2: Fix failed<br>3: Repair successful<br>4: Remediation timeout</p>
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
     * Get <p>Payment version information<br>Enumeration values:<br>BASIC: basic version<br>PRO: pro edition<br>ULTIMATE: flagship edition</p> 
     * @return PayVersion <p>Payment version information<br>Enumeration values:<br>BASIC: basic version<br>PRO: pro edition<br>ULTIMATE: flagship edition</p>
     */
    public String getPayVersion() {
        return this.PayVersion;
    }

    /**
     * Set <p>Payment version information<br>Enumeration values:<br>BASIC: basic version<br>PRO: pro edition<br>ULTIMATE: flagship edition</p>
     * @param PayVersion <p>Payment version information<br>Enumeration values:<br>BASIC: basic version<br>PRO: pro edition<br>ULTIMATE: flagship edition</p>
     */
    public void setPayVersion(String PayVersion) {
        this.PayVersion = PayVersion;
    }

    public KBUpdateMachineItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBUpdateMachineItem(KBUpdateMachineItem source) {
        if (source.KBId != null) {
            this.KBId = new Long(source.KBId);
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
        this.setParamSimple(map, prefix + "KBId", this.KBId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "SupportAutoFix", this.SupportAutoFix);
        this.setParamSimple(map, prefix + "FixStatus", this.FixStatus);
        this.setParamSimple(map, prefix + "LatestFixTime", this.LatestFixTime);
        this.setParamSimple(map, prefix + "NotFixableReason", this.NotFixableReason);
        this.setParamArrayObj(map, prefix + "TagItems.", this.TagItems);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PayVersion", this.PayVersion);

    }
}

