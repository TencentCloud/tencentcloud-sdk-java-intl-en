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

public class NetAttackEvent extends AbstractModel {

    /**
    * Log ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Client ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Target port
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * Source IP
    */
    @SerializedName("SrcIP")
    @Expose
    private String SrcIP;

    /**
    * Source location
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Vulnerability name
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Attack time
    */
    @SerializedName("MergeTime")
    @Expose
    private String MergeTime;

    /**
    * Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * Attack Status: 0: Attack Attempt 1: Confirmed Attack (Successful Attack).
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Processing Status: 0 Pending, 1 Processed, 2 Allowlisted, 3 Ignored, 4 Deleted, 5: Defense Enabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Whether vulnerabilities support defense. 0: No 1: Yes
    */
    @SerializedName("VulSupportDefense")
    @Expose
    private Long VulSupportDefense;

    /**
    * Whether to enable vulnerability defense: 0 - No, 1 - Yes
    */
    @SerializedName("VulDefenceStatus")
    @Expose
    private Long VulDefenceStatus;

    /**
    * Machine payment edition. 0: Basic Edition; 1: Professional Edition; 2: Premium Edition; 3: General Discount Edition
    */
    @SerializedName("PayVersion")
    @Expose
    private Long PayVersion;

    /**
    * cvm uuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Attacks
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Whether to add new hosts today
    */
    @SerializedName("New")
    @Expose
    private Boolean New;

    /**
     * Get Log ID 
     * @return Id Log ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Log ID
     * @param Id Log ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Client ID 
     * @return Uuid Client ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Client ID
     * @param Uuid Client ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
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
     * Get Source IP 
     * @return SrcIP Source IP
     */
    public String getSrcIP() {
        return this.SrcIP;
    }

    /**
     * Set Source IP
     * @param SrcIP Source IP
     */
    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    /**
     * Get Source location 
     * @return Location Source location
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Source location
     * @param Location Source location
     */
    public void setLocation(String Location) {
        this.Location = Location;
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
     * Get Attack time 
     * @return MergeTime Attack time
     */
    public String getMergeTime() {
        return this.MergeTime;
    }

    /**
     * Set Attack time
     * @param MergeTime Attack time
     */
    public void setMergeTime(String MergeTime) {
        this.MergeTime = MergeTime;
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
     * Get Attack Status: 0: Attack Attempt 1: Confirmed Attack (Successful Attack). 
     * @return Type Attack Status: 0: Attack Attempt 1: Confirmed Attack (Successful Attack).
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Attack Status: 0: Attack Attempt 1: Confirmed Attack (Successful Attack).
     * @param Type Attack Status: 0: Attack Attempt 1: Confirmed Attack (Successful Attack).
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

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
     * Get Whether to enable vulnerability defense: 0 - No, 1 - Yes 
     * @return VulDefenceStatus Whether to enable vulnerability defense: 0 - No, 1 - Yes
     */
    public Long getVulDefenceStatus() {
        return this.VulDefenceStatus;
    }

    /**
     * Set Whether to enable vulnerability defense: 0 - No, 1 - Yes
     * @param VulDefenceStatus Whether to enable vulnerability defense: 0 - No, 1 - Yes
     */
    public void setVulDefenceStatus(Long VulDefenceStatus) {
        this.VulDefenceStatus = VulDefenceStatus;
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
     * @return Quuid cvm uuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set cvm uuid
     * @param Quuid cvm uuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Attacks 
     * @return Count Attacks
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Attacks
     * @param Count Attacks
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Whether to add new hosts today 
     * @return New Whether to add new hosts today
     */
    public Boolean getNew() {
        return this.New;
    }

    /**
     * Set Whether to add new hosts today
     * @param New Whether to add new hosts today
     */
    public void setNew(Boolean New) {
        this.New = New;
    }

    public NetAttackEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetAttackEvent(NetAttackEvent source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.DstPort != null) {
            this.DstPort = new Long(source.DstPort);
        }
        if (source.SrcIP != null) {
            this.SrcIP = new String(source.SrcIP);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.MergeTime != null) {
            this.MergeTime = new String(source.MergeTime);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.VulSupportDefense != null) {
            this.VulSupportDefense = new Long(source.VulSupportDefense);
        }
        if (source.VulDefenceStatus != null) {
            this.VulDefenceStatus = new Long(source.VulDefenceStatus);
        }
        if (source.PayVersion != null) {
            this.PayVersion = new Long(source.PayVersion);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.New != null) {
            this.New = new Boolean(source.New);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "SrcIP", this.SrcIP);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "MergeTime", this.MergeTime);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "VulSupportDefense", this.VulSupportDefense);
        this.setParamSimple(map, prefix + "VulDefenceStatus", this.VulDefenceStatus);
        this.setParamSimple(map, prefix + "PayVersion", this.PayVersion);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "New", this.New);

    }
}

