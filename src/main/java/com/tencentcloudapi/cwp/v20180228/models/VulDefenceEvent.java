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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulDefenceEvent extends AbstractModel {

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
    * CVE ID
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * Vulnerability event ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Host name
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Private IP address
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Public IP address
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 0: Attack Attempt (WeDetect); 1: Successful Attack Attempt (WeDetect); 2: RASP Defense Event
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * Attack source IP address
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * City of the attack source IP address
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Attack source port
    */
    @SerializedName("SourcePort")
    @Expose
    private Long [] SourcePort;

    /**
    * Event Creation Time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update Event Time
    */
    @SerializedName("MergeTime")
    @Expose
    private String MergeTime;

    /**
    * Number of Occurrences
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Status. 0: Pending; 1: Defended; 2: Processed; 3: Ignored; 4: Deleted
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 0: Pro Edition; 1: Ultimate Edition; 2: LH Inclusive Edition (for Lighthouse only); 3: CVM Inclusive Edition (for CVM only).
    */
    @SerializedName("UpgradeType")
    @Expose
    private Long UpgradeType;

    /**
    * 0: do not support fixing; 1: support fixing.
    */
    @SerializedName("FixType")
    @Expose
    private Long FixType;

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

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
     * Get CVE ID 
     * @return CveId CVE ID
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set CVE ID
     * @param CveId CVE ID
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get Vulnerability event ID 
     * @return Id Vulnerability event ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Vulnerability event ID
     * @param Id Vulnerability event ID
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get Host name 
     * @return Alias Host name
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Host name
     * @param Alias Host name
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
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
     * Get 0: Attack Attempt (WeDetect); 1: Successful Attack Attempt (WeDetect); 2: RASP Defense Event 
     * @return EventType 0: Attack Attempt (WeDetect); 1: Successful Attack Attempt (WeDetect); 2: RASP Defense Event
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 0: Attack Attempt (WeDetect); 1: Successful Attack Attempt (WeDetect); 2: RASP Defense Event
     * @param EventType 0: Attack Attempt (WeDetect); 1: Successful Attack Attempt (WeDetect); 2: RASP Defense Event
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Attack source IP address 
     * @return SourceIp Attack source IP address
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set Attack source IP address
     * @param SourceIp Attack source IP address
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get City of the attack source IP address 
     * @return City City of the attack source IP address
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set City of the attack source IP address
     * @param City City of the attack source IP address
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Attack source port 
     * @return SourcePort Attack source port
     */
    public Long [] getSourcePort() {
        return this.SourcePort;
    }

    /**
     * Set Attack source port
     * @param SourcePort Attack source port
     */
    public void setSourcePort(Long [] SourcePort) {
        this.SourcePort = SourcePort;
    }

    /**
     * Get Event Creation Time 
     * @return CreateTime Event Creation Time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Event Creation Time
     * @param CreateTime Event Creation Time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update Event Time 
     * @return MergeTime Update Event Time
     */
    public String getMergeTime() {
        return this.MergeTime;
    }

    /**
     * Set Update Event Time
     * @param MergeTime Update Event Time
     */
    public void setMergeTime(String MergeTime) {
        this.MergeTime = MergeTime;
    }

    /**
     * Get Number of Occurrences 
     * @return Count Number of Occurrences
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of Occurrences
     * @param Count Number of Occurrences
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Status. 0: Pending; 1: Defended; 2: Processed; 3: Ignored; 4: Deleted 
     * @return Status Status. 0: Pending; 1: Defended; 2: Processed; 3: Ignored; 4: Deleted
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: Pending; 1: Defended; 2: Processed; 3: Ignored; 4: Deleted
     * @param Status Status. 0: Pending; 1: Defended; 2: Processed; 3: Ignored; 4: Deleted
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 0: Pro Edition; 1: Ultimate Edition; 2: LH Inclusive Edition (for Lighthouse only); 3: CVM Inclusive Edition (for CVM only). 
     * @return UpgradeType 0: Pro Edition; 1: Ultimate Edition; 2: LH Inclusive Edition (for Lighthouse only); 3: CVM Inclusive Edition (for CVM only).
     */
    public Long getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set 0: Pro Edition; 1: Ultimate Edition; 2: LH Inclusive Edition (for Lighthouse only); 3: CVM Inclusive Edition (for CVM only).
     * @param UpgradeType 0: Pro Edition; 1: Ultimate Edition; 2: LH Inclusive Edition (for Lighthouse only); 3: CVM Inclusive Edition (for CVM only).
     */
    public void setUpgradeType(Long UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get 0: do not support fixing; 1: support fixing. 
     * @return FixType 0: do not support fixing; 1: support fixing.
     */
    public Long getFixType() {
        return this.FixType;
    }

    /**
     * Set 0: do not support fixing; 1: support fixing.
     * @param FixType 0: do not support fixing; 1: support fixing.
     */
    public void setFixType(Long FixType) {
        this.FixType = FixType;
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

    public VulDefenceEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefenceEvent(VulDefenceEvent source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.SourcePort != null) {
            this.SourcePort = new Long[source.SourcePort.length];
            for (int i = 0; i < source.SourcePort.length; i++) {
                this.SourcePort[i] = new Long(source.SourcePort[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.MergeTime != null) {
            this.MergeTime = new String(source.MergeTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new Long(source.UpgradeType);
        }
        if (source.FixType != null) {
            this.FixType = new Long(source.FixType);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamArraySimple(map, prefix + "SourcePort.", this.SourcePort);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "MergeTime", this.MergeTime);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamSimple(map, prefix + "FixType", this.FixType);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

