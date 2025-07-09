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

public class NetAttackEventInfo extends AbstractModel {

    /**
    * Processing Status: 0 Pending, 1 Processed, 2 Allowlisted, 3 Ignored, 4 Deleted, 5: Defense Enabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Attack source IP address
    */
    @SerializedName("SrcIP")
    @Expose
    private String SrcIP;

    /**
    * Attack Source
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Vulnerability CVE ID
    */
    @SerializedName("CVEId")
    @Expose
    private String CVEId;

    /**
    * Vulnerability attack level
    */
    @SerializedName("AttackLevel")
    @Expose
    private Long AttackLevel;

    /**
    * Vulnerability Defense Status: 0 Disabled, 1 Enabled.
    */
    @SerializedName("VulDefenceStatus")
    @Expose
    private Long VulDefenceStatus;

    /**
    * Whether vulnerabilities support defense. 0: No 1: Yes
    */
    @SerializedName("VulSupportDefense")
    @Expose
    private Long VulSupportDefense;

    /**
    * Service Process Base64 
    */
    @SerializedName("SvcPs")
    @Expose
    private String SvcPs;

    /**
    * Attack packet
    */
    @SerializedName("NetPayload")
    @Expose
    private String NetPayload;

    /**
    * Abnormal behavior
    */
    @SerializedName("AbnormalAction")
    @Expose
    private String AbnormalAction;

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Event ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * Target port
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * Attack count
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Machine payment edition. 0: Basic Edition; 1: Professional Edition; 2: Premium Edition; 3: General Discount Edition
    */
    @SerializedName("PayVersion")
    @Expose
    private Long PayVersion;

    /**
    * cvm uuid
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Time of Attack
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MergeTime")
    @Expose
    private String MergeTime;

    /**
    * 0: Attack Attempt 1: Successful Attack
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 0: No Compromised Behavior 1: RCE (command execution) 2: Dnslog 3: Writefile
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostOpType")
    @Expose
    private Long HostOpType;

    /**
    * Process Tree, needs to be decoded with base64.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostOpProcessTree")
    @Expose
    private String HostOpProcessTree;

    /**
     * Get Processing Status: 0 Pending, 1 Processed, 2 Allowlisted, 3 Ignored, 4 Deleted, 5: Defense Enabled. 
     * @return Status Processing Status: 0 Pending, 1 Processed, 2 Allowlisted, 3 Ignored, 4 Deleted, 5: Defense Enabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Processing Status: 0 Pending, 1 Processed, 2 Allowlisted, 3 Ignored, 4 Deleted, 5: Defense Enabled.
     * @param Status Processing Status: 0 Pending, 1 Processed, 2 Allowlisted, 3 Ignored, 4 Deleted, 5: Defense Enabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Attack source IP address 
     * @return SrcIP Attack source IP address
     */
    public String getSrcIP() {
        return this.SrcIP;
    }

    /**
     * Set Attack source IP address
     * @param SrcIP Attack source IP address
     */
    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    /**
     * Get Attack Source 
     * @return Location Attack Source
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Attack Source
     * @param Location Attack Source
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Vulnerability name 
     * @return VulName Vulnerability name
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name
     * @param VulName Vulnerability name
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Vulnerability ID 
     * @return VulId Vulnerability ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID
     * @param VulId Vulnerability ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Vulnerability CVE ID 
     * @return CVEId Vulnerability CVE ID
     */
    public String getCVEId() {
        return this.CVEId;
    }

    /**
     * Set Vulnerability CVE ID
     * @param CVEId Vulnerability CVE ID
     */
    public void setCVEId(String CVEId) {
        this.CVEId = CVEId;
    }

    /**
     * Get Vulnerability attack level 
     * @return AttackLevel Vulnerability attack level
     */
    public Long getAttackLevel() {
        return this.AttackLevel;
    }

    /**
     * Set Vulnerability attack level
     * @param AttackLevel Vulnerability attack level
     */
    public void setAttackLevel(Long AttackLevel) {
        this.AttackLevel = AttackLevel;
    }

    /**
     * Get Vulnerability Defense Status: 0 Disabled, 1 Enabled. 
     * @return VulDefenceStatus Vulnerability Defense Status: 0 Disabled, 1 Enabled.
     */
    public Long getVulDefenceStatus() {
        return this.VulDefenceStatus;
    }

    /**
     * Set Vulnerability Defense Status: 0 Disabled, 1 Enabled.
     * @param VulDefenceStatus Vulnerability Defense Status: 0 Disabled, 1 Enabled.
     */
    public void setVulDefenceStatus(Long VulDefenceStatus) {
        this.VulDefenceStatus = VulDefenceStatus;
    }

    /**
     * Get Whether vulnerabilities support defense. 0: No 1: Yes 
     * @return VulSupportDefense Whether vulnerabilities support defense. 0: No 1: Yes
     */
    public Long getVulSupportDefense() {
        return this.VulSupportDefense;
    }

    /**
     * Set Whether vulnerabilities support defense. 0: No 1: Yes
     * @param VulSupportDefense Whether vulnerabilities support defense. 0: No 1: Yes
     */
    public void setVulSupportDefense(Long VulSupportDefense) {
        this.VulSupportDefense = VulSupportDefense;
    }

    /**
     * Get Service Process Base64  
     * @return SvcPs Service Process Base64 
     */
    public String getSvcPs() {
        return this.SvcPs;
    }

    /**
     * Set Service Process Base64 
     * @param SvcPs Service Process Base64 
     */
    public void setSvcPs(String SvcPs) {
        this.SvcPs = SvcPs;
    }

    /**
     * Get Attack packet 
     * @return NetPayload Attack packet
     */
    public String getNetPayload() {
        return this.NetPayload;
    }

    /**
     * Set Attack packet
     * @param NetPayload Attack packet
     */
    public void setNetPayload(String NetPayload) {
        this.NetPayload = NetPayload;
    }

    /**
     * Get Abnormal behavior 
     * @return AbnormalAction Abnormal behavior
     */
    public String getAbnormalAction() {
        return this.AbnormalAction;
    }

    /**
     * Set Abnormal behavior
     * @param AbnormalAction Abnormal behavior
     */
    public void setAbnormalAction(String AbnormalAction) {
        this.AbnormalAction = AbnormalAction;
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
     * Get Event ID 
     * @return Id Event ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Event ID
     * @param Id Event ID
     */
    public void setId(Long Id) {
        this.Id = Id;
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

    /**
     * Get Target port 
     * @return DstPort Target port
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set Target port
     * @param DstPort Target port
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get Attack count 
     * @return Count Attack count
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Attack count
     * @param Count Attack count
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Machine payment edition. 0: Basic Edition; 1: Professional Edition; 2: Premium Edition; 3: General Discount Edition 
     * @return PayVersion Machine payment edition. 0: Basic Edition; 1: Professional Edition; 2: Premium Edition; 3: General Discount Edition
     */
    public Long getPayVersion() {
        return this.PayVersion;
    }

    /**
     * Set Machine payment edition. 0: Basic Edition; 1: Professional Edition; 2: Premium Edition; 3: General Discount Edition
     * @param PayVersion Machine payment edition. 0: Basic Edition; 1: Professional Edition; 2: Premium Edition; 3: General Discount Edition
     */
    public void setPayVersion(Long PayVersion) {
        this.PayVersion = PayVersion;
    }

    /**
     * Get cvm uuid
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Quuid cvm uuid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set cvm uuid
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Quuid cvm uuid
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Time of Attack
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MergeTime Time of Attack
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMergeTime() {
        return this.MergeTime;
    }

    /**
     * Set Time of Attack
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MergeTime Time of Attack
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMergeTime(String MergeTime) {
        this.MergeTime = MergeTime;
    }

    /**
     * Get 0: Attack Attempt 1: Successful Attack
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type 0: Attack Attempt 1: Successful Attack
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0: Attack Attempt 1: Successful Attack
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type 0: Attack Attempt 1: Successful Attack
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 0: No Compromised Behavior 1: RCE (command execution) 2: Dnslog 3: Writefile
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostOpType 0: No Compromised Behavior 1: RCE (command execution) 2: Dnslog 3: Writefile
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHostOpType() {
        return this.HostOpType;
    }

    /**
     * Set 0: No Compromised Behavior 1: RCE (command execution) 2: Dnslog 3: Writefile
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostOpType 0: No Compromised Behavior 1: RCE (command execution) 2: Dnslog 3: Writefile
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostOpType(Long HostOpType) {
        this.HostOpType = HostOpType;
    }

    /**
     * Get Process Tree, needs to be decoded with base64.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostOpProcessTree Process Tree, needs to be decoded with base64.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostOpProcessTree() {
        return this.HostOpProcessTree;
    }

    /**
     * Set Process Tree, needs to be decoded with base64.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostOpProcessTree Process Tree, needs to be decoded with base64.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostOpProcessTree(String HostOpProcessTree) {
        this.HostOpProcessTree = HostOpProcessTree;
    }

    public NetAttackEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetAttackEventInfo(NetAttackEventInfo source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SrcIP != null) {
            this.SrcIP = new String(source.SrcIP);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.CVEId != null) {
            this.CVEId = new String(source.CVEId);
        }
        if (source.AttackLevel != null) {
            this.AttackLevel = new Long(source.AttackLevel);
        }
        if (source.VulDefenceStatus != null) {
            this.VulDefenceStatus = new Long(source.VulDefenceStatus);
        }
        if (source.VulSupportDefense != null) {
            this.VulSupportDefense = new Long(source.VulSupportDefense);
        }
        if (source.SvcPs != null) {
            this.SvcPs = new String(source.SvcPs);
        }
        if (source.NetPayload != null) {
            this.NetPayload = new String(source.NetPayload);
        }
        if (source.AbnormalAction != null) {
            this.AbnormalAction = new String(source.AbnormalAction);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.DstPort != null) {
            this.DstPort = new Long(source.DstPort);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.PayVersion != null) {
            this.PayVersion = new Long(source.PayVersion);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.MergeTime != null) {
            this.MergeTime = new String(source.MergeTime);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.HostOpType != null) {
            this.HostOpType = new Long(source.HostOpType);
        }
        if (source.HostOpProcessTree != null) {
            this.HostOpProcessTree = new String(source.HostOpProcessTree);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SrcIP", this.SrcIP);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "CVEId", this.CVEId);
        this.setParamSimple(map, prefix + "AttackLevel", this.AttackLevel);
        this.setParamSimple(map, prefix + "VulDefenceStatus", this.VulDefenceStatus);
        this.setParamSimple(map, prefix + "VulSupportDefense", this.VulSupportDefense);
        this.setParamSimple(map, prefix + "SvcPs", this.SvcPs);
        this.setParamSimple(map, prefix + "NetPayload", this.NetPayload);
        this.setParamSimple(map, prefix + "AbnormalAction", this.AbnormalAction);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "PayVersion", this.PayVersion);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "MergeTime", this.MergeTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "HostOpType", this.HostOpType);
        this.setParamSimple(map, prefix + "HostOpProcessTree", this.HostOpProcessTree);

    }
}

