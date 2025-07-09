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

public class BruteAttackInfo extends AbstractModel {

    /**
    * Unique ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * CWPP client UUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Host IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Host name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Username
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Source IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * SUCCESS: cracking successful; FAILED: cracking failed
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Country/Region ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Country")
    @Expose
    private Long Country;

    /**
    * City ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("City")
    @Expose
    private Long City;

    /**
    * Province ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Province")
    @Expose
    private Long Province;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 0: no blocking (not supported for the client version)1: blocked
2: blocking failed (program exception)
3: no blocking (do not block for the private network)
4: availability zone does not support blocking
10: blocking
81: no blocking (blocking disabled)
82: no blocking (non-Pro Edition)
83: no blocking (added to the allowlist)
86: no blocking (system allowlist)
87: no blocking (client offline)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BanStatus")
    @Expose
    private Long BanStatus;

    /**
    * Event type. 200: brute force cracking event; 300: event of successful brute force cracking (page display); 400: event of brute force cracking on a non-existent account.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * Occurrence count
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Machine UUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Whether it is of the Pro Edition (true/false)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
    * Username of the attacked service
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Port
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Last attack time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 0: pending; 1: ignored; 5: fixed; 6: added to allowlist
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataStatus")
    @Expose
    private Long DataStatus;

    /**
    * Additional information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * Geo-location in Chinese
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Threat level. 0: low-risk; 1: medium-risk; 2: high-risk.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * Event source. 0: blocking rule; 1: threat intelligence.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataFrom")
    @Expose
    private Long DataFrom;

    /**
    * Description of the brute force cracking status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackStatusDesc")
    @Expose
    private String AttackStatusDesc;

    /**
    * Blocking expiration time (valid only for events in blocking status)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BanExpiredTime")
    @Expose
    private String BanExpiredTime;

    /**
     * Get Unique ID 
     * @return Id Unique ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique ID
     * @param Id Unique ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get CWPP client UUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uuid CWPP client UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWPP client UUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uuid CWPP client UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Host IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineIp Host IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Host IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineIp Host IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Host name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineName Host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Host name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineName Host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Username
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserName Username
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserName Username
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Source IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SrcIp Source IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Source IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SrcIp Source IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get SUCCESS: cracking successful; FAILED: cracking failed
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status SUCCESS: cracking successful; FAILED: cracking failed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set SUCCESS: cracking successful; FAILED: cracking failed
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status SUCCESS: cracking successful; FAILED: cracking failed
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Country/Region ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Country Country/Region ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCountry() {
        return this.Country;
    }

    /**
     * Set Country/Region ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Country Country/Region ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCountry(Long Country) {
        this.Country = Country;
    }

    /**
     * Get City ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return City City ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCity() {
        return this.City;
    }

    /**
     * Set City ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param City City ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCity(Long City) {
        this.City = City;
    }

    /**
     * Get Province ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Province Province ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProvince() {
        return this.Province;
    }

    /**
     * Set Province ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Province Province ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProvince(Long Province) {
        this.Province = Province;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 0: no blocking (not supported for the client version)1: blocked
2: blocking failed (program exception)
3: no blocking (do not block for the private network)
4: availability zone does not support blocking
10: blocking
81: no blocking (blocking disabled)
82: no blocking (non-Pro Edition)
83: no blocking (added to the allowlist)
86: no blocking (system allowlist)
87: no blocking (client offline)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BanStatus 0: no blocking (not supported for the client version)1: blocked
2: blocking failed (program exception)
3: no blocking (do not block for the private network)
4: availability zone does not support blocking
10: blocking
81: no blocking (blocking disabled)
82: no blocking (non-Pro Edition)
83: no blocking (added to the allowlist)
86: no blocking (system allowlist)
87: no blocking (client offline)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBanStatus() {
        return this.BanStatus;
    }

    /**
     * Set 0: no blocking (not supported for the client version)1: blocked
2: blocking failed (program exception)
3: no blocking (do not block for the private network)
4: availability zone does not support blocking
10: blocking
81: no blocking (blocking disabled)
82: no blocking (non-Pro Edition)
83: no blocking (added to the allowlist)
86: no blocking (system allowlist)
87: no blocking (client offline)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BanStatus 0: no blocking (not supported for the client version)1: blocked
2: blocking failed (program exception)
3: no blocking (do not block for the private network)
4: availability zone does not support blocking
10: blocking
81: no blocking (blocking disabled)
82: no blocking (non-Pro Edition)
83: no blocking (added to the allowlist)
86: no blocking (system allowlist)
87: no blocking (client offline)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBanStatus(Long BanStatus) {
        this.BanStatus = BanStatus;
    }

    /**
     * Get Event type. 200: brute force cracking event; 300: event of successful brute force cracking (page display); 400: event of brute force cracking on a non-existent account.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventType Event type. 200: brute force cracking event; 300: event of successful brute force cracking (page display); 400: event of brute force cracking on a non-existent account.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type. 200: brute force cracking event; 300: event of successful brute force cracking (page display); 400: event of brute force cracking on a non-existent account.Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventType Event type. 200: brute force cracking event; 300: event of successful brute force cracking (page display); 400: event of brute force cracking on a non-existent account.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Occurrence count
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Count Occurrence count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Occurrence count
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Count Occurrence count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Machine UUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Quuid Machine UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Machine UUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Quuid Machine UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Whether it is of the Pro Edition (true/false)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsProVersion Whether it is of the Pro Edition (true/false)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set Whether it is of the Pro Edition (true/false)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsProVersion Whether it is of the Pro Edition (true/false)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get Username of the attacked service
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Protocol Username of the attacked service
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Username of the attacked service
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Protocol Username of the attacked service
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Port
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Port Port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Port Port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Last attack time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Last attack time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last attack time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Last attack time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 0: pending; 1: ignored; 5: fixed; 6: added to allowlist
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataStatus 0: pending; 1: ignored; 5: fixed; 6: added to allowlist
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDataStatus() {
        return this.DataStatus;
    }

    /**
     * Set 0: pending; 1: ignored; 5: fixed; 6: added to allowlist
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataStatus 0: pending; 1: ignored; 5: fixed; 6: added to allowlist
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataStatus(Long DataStatus) {
        this.DataStatus = DataStatus;
    }

    /**
     * Get Additional information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineExtraInfo Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineExtraInfo Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get Geo-location in Chinese
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Location Geo-location in Chinese
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Geo-location in Chinese
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Location Geo-location in Chinese
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Threat level. 0: low-risk; 1: medium-risk; 2: high-risk.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskLevel Threat level. 0: low-risk; 1: medium-risk; 2: high-risk.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Threat level. 0: low-risk; 1: medium-risk; 2: high-risk.Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskLevel Threat level. 0: low-risk; 1: medium-risk; 2: high-risk.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Event source. 0: blocking rule; 1: threat intelligence.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataFrom Event source. 0: blocking rule; 1: threat intelligence.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDataFrom() {
        return this.DataFrom;
    }

    /**
     * Set Event source. 0: blocking rule; 1: threat intelligence.Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataFrom Event source. 0: blocking rule; 1: threat intelligence.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataFrom(Long DataFrom) {
        this.DataFrom = DataFrom;
    }

    /**
     * Get Description of the brute force cracking status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackStatusDesc Description of the brute force cracking status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAttackStatusDesc() {
        return this.AttackStatusDesc;
    }

    /**
     * Set Description of the brute force cracking status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackStatusDesc Description of the brute force cracking status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackStatusDesc(String AttackStatusDesc) {
        this.AttackStatusDesc = AttackStatusDesc;
    }

    /**
     * Get Blocking expiration time (valid only for events in blocking status)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BanExpiredTime Blocking expiration time (valid only for events in blocking status)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBanExpiredTime() {
        return this.BanExpiredTime;
    }

    /**
     * Set Blocking expiration time (valid only for events in blocking status)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BanExpiredTime Blocking expiration time (valid only for events in blocking status)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBanExpiredTime(String BanExpiredTime) {
        this.BanExpiredTime = BanExpiredTime;
    }

    public BruteAttackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BruteAttackInfo(BruteAttackInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Country != null) {
            this.Country = new Long(source.Country);
        }
        if (source.City != null) {
            this.City = new Long(source.City);
        }
        if (source.Province != null) {
            this.Province = new Long(source.Province);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.BanStatus != null) {
            this.BanStatus = new Long(source.BanStatus);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.IsProVersion != null) {
            this.IsProVersion = new Boolean(source.IsProVersion);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DataStatus != null) {
            this.DataStatus = new Long(source.DataStatus);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.DataFrom != null) {
            this.DataFrom = new Long(source.DataFrom);
        }
        if (source.AttackStatusDesc != null) {
            this.AttackStatusDesc = new String(source.AttackStatusDesc);
        }
        if (source.BanExpiredTime != null) {
            this.BanExpiredTime = new String(source.BanExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BanStatus", this.BanStatus);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DataStatus", this.DataStatus);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "DataFrom", this.DataFrom);
        this.setParamSimple(map, prefix + "AttackStatusDesc", this.AttackStatusDesc);
        this.setParamSimple(map, prefix + "BanExpiredTime", this.BanExpiredTime);

    }
}

