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
    * CWP client UUID.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Host IP address
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * host name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Username.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Source IP
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * SUCCESS: cracking successful; FAILED: cracking failed
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Country/Region ID
    */
    @SerializedName("Country")
    @Expose
    private Long Country;

    /**
    * City ID
    */
    @SerializedName("City")
    @Expose
    private Long City;

    /**
    * Province id
    */
    @SerializedName("Province")
    @Expose
    private Long Province;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 0 - No blocking (not supported by the client version)
1: blocked
2: Blocking failed (program exception)
3: No blocking (No blocking for the private network)
4: Availability zone does not support blocking
10: blocking
81: no blocking (blocking disabled)
82-No Blocking (Non-Pro Edition)
83: no blocking (added to the allowlist)
86: no blocking (system allowlist)
87: No blocking (client offline)
88-No blocking (Source Ip belongs to the same customer)
89: no blocking (blocking is not supported for ipv6)
    */
    @SerializedName("BanStatus")
    @Expose
    private Long BanStatus;

    /**
    * Event type: 200 - brute force cracking event; 300 - successful brute force cracking event (the status is displayed on the page); 400 - brute force cracking event for non-existent accounts.
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * Occurrence count
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * CVM instance UUID.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Whether it is the Pro Edition (true/false)
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
    * Username of the attacked service
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Last attack time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 0: pending; 1: ignored; 5: fixed; 6: added to allowlist
    */
    @SerializedName("DataStatus")
    @Expose
    private Long DataStatus;

    /**
    * Additional information
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * Chinese name of a geo location.
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Threat level. 0: low risk, 1: medium risk, 2: high risk.
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * Event source. 0: blocking rule, 1: threat intelligence.
    */
    @SerializedName("DataFrom")
    @Expose
    private Long DataFrom;

    /**
    * Cracking status description.
    */
    @SerializedName("AttackStatusDesc")
    @Expose
    private String AttackStatusDesc;

    /**
    * Block expiration time (only valid for blocked events).
    */
    @SerializedName("BanExpiredTime")
    @Expose
    private String BanExpiredTime;

    /**
    * IP analysis
    */
    @SerializedName("IPAnalyse")
    @Expose
    private IPAnalyse IPAnalyse;

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
     * Get CWP client UUID. 
     * @return Uuid CWP client UUID.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWP client UUID.
     * @param Uuid CWP client UUID.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Host IP address 
     * @return MachineIp Host IP address
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Host IP address
     * @param MachineIp Host IP address
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get host name 
     * @return MachineName host name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set host name
     * @param MachineName host name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Username. 
     * @return UserName Username.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username.
     * @param UserName Username.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Source IP 
     * @return SrcIp Source IP
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Source IP
     * @param SrcIp Source IP
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get SUCCESS: cracking successful; FAILED: cracking failed 
     * @return Status SUCCESS: cracking successful; FAILED: cracking failed
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set SUCCESS: cracking successful; FAILED: cracking failed
     * @param Status SUCCESS: cracking successful; FAILED: cracking failed
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Country/Region ID 
     * @return Country Country/Region ID
     */
    public Long getCountry() {
        return this.Country;
    }

    /**
     * Set Country/Region ID
     * @param Country Country/Region ID
     */
    public void setCountry(Long Country) {
        this.Country = Country;
    }

    /**
     * Get City ID 
     * @return City City ID
     */
    public Long getCity() {
        return this.City;
    }

    /**
     * Set City ID
     * @param City City ID
     */
    public void setCity(Long City) {
        this.City = City;
    }

    /**
     * Get Province id 
     * @return Province Province id
     */
    public Long getProvince() {
        return this.Province;
    }

    /**
     * Set Province id
     * @param Province Province id
     */
    public void setProvince(Long Province) {
        this.Province = Province;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 0 - No blocking (not supported by the client version)
1: blocked
2: Blocking failed (program exception)
3: No blocking (No blocking for the private network)
4: Availability zone does not support blocking
10: blocking
81: no blocking (blocking disabled)
82-No Blocking (Non-Pro Edition)
83: no blocking (added to the allowlist)
86: no blocking (system allowlist)
87: No blocking (client offline)
88-No blocking (Source Ip belongs to the same customer)
89: no blocking (blocking is not supported for ipv6) 
     * @return BanStatus 0 - No blocking (not supported by the client version)
1: blocked
2: Blocking failed (program exception)
3: No blocking (No blocking for the private network)
4: Availability zone does not support blocking
10: blocking
81: no blocking (blocking disabled)
82-No Blocking (Non-Pro Edition)
83: no blocking (added to the allowlist)
86: no blocking (system allowlist)
87: No blocking (client offline)
88-No blocking (Source Ip belongs to the same customer)
89: no blocking (blocking is not supported for ipv6)
     */
    public Long getBanStatus() {
        return this.BanStatus;
    }

    /**
     * Set 0 - No blocking (not supported by the client version)
1: blocked
2: Blocking failed (program exception)
3: No blocking (No blocking for the private network)
4: Availability zone does not support blocking
10: blocking
81: no blocking (blocking disabled)
82-No Blocking (Non-Pro Edition)
83: no blocking (added to the allowlist)
86: no blocking (system allowlist)
87: No blocking (client offline)
88-No blocking (Source Ip belongs to the same customer)
89: no blocking (blocking is not supported for ipv6)
     * @param BanStatus 0 - No blocking (not supported by the client version)
1: blocked
2: Blocking failed (program exception)
3: No blocking (No blocking for the private network)
4: Availability zone does not support blocking
10: blocking
81: no blocking (blocking disabled)
82-No Blocking (Non-Pro Edition)
83: no blocking (added to the allowlist)
86: no blocking (system allowlist)
87: No blocking (client offline)
88-No blocking (Source Ip belongs to the same customer)
89: no blocking (blocking is not supported for ipv6)
     */
    public void setBanStatus(Long BanStatus) {
        this.BanStatus = BanStatus;
    }

    /**
     * Get Event type: 200 - brute force cracking event; 300 - successful brute force cracking event (the status is displayed on the page); 400 - brute force cracking event for non-existent accounts. 
     * @return EventType Event type: 200 - brute force cracking event; 300 - successful brute force cracking event (the status is displayed on the page); 400 - brute force cracking event for non-existent accounts.
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set Event type: 200 - brute force cracking event; 300 - successful brute force cracking event (the status is displayed on the page); 400 - brute force cracking event for non-existent accounts.
     * @param EventType Event type: 200 - brute force cracking event; 300 - successful brute force cracking event (the status is displayed on the page); 400 - brute force cracking event for non-existent accounts.
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Occurrence count 
     * @return Count Occurrence count
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Occurrence count
     * @param Count Occurrence count
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get CVM instance UUID. 
     * @return Quuid CVM instance UUID.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set CVM instance UUID.
     * @param Quuid CVM instance UUID.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Whether it is the Pro Edition (true/false) 
     * @return IsProVersion Whether it is the Pro Edition (true/false)
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set Whether it is the Pro Edition (true/false)
     * @param IsProVersion Whether it is the Pro Edition (true/false)
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get Username of the attacked service 
     * @return Protocol Username of the attacked service
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Username of the attacked service
     * @param Protocol Username of the attacked service
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Port 
     * @return Port Port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port
     * @param Port Port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Last attack time 
     * @return ModifyTime Last attack time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last attack time
     * @param ModifyTime Last attack time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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
     * Get 0: pending; 1: ignored; 5: fixed; 6: added to allowlist 
     * @return DataStatus 0: pending; 1: ignored; 5: fixed; 6: added to allowlist
     */
    public Long getDataStatus() {
        return this.DataStatus;
    }

    /**
     * Set 0: pending; 1: ignored; 5: fixed; 6: added to allowlist
     * @param DataStatus 0: pending; 1: ignored; 5: fixed; 6: added to allowlist
     */
    public void setDataStatus(Long DataStatus) {
        this.DataStatus = DataStatus;
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
     * Get Chinese name of a geo location. 
     * @return Location Chinese name of a geo location.
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Chinese name of a geo location.
     * @param Location Chinese name of a geo location.
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get Threat level. 0: low risk, 1: medium risk, 2: high risk. 
     * @return RiskLevel Threat level. 0: low risk, 1: medium risk, 2: high risk.
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Threat level. 0: low risk, 1: medium risk, 2: high risk.
     * @param RiskLevel Threat level. 0: low risk, 1: medium risk, 2: high risk.
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Event source. 0: blocking rule, 1: threat intelligence. 
     * @return DataFrom Event source. 0: blocking rule, 1: threat intelligence.
     */
    public Long getDataFrom() {
        return this.DataFrom;
    }

    /**
     * Set Event source. 0: blocking rule, 1: threat intelligence.
     * @param DataFrom Event source. 0: blocking rule, 1: threat intelligence.
     */
    public void setDataFrom(Long DataFrom) {
        this.DataFrom = DataFrom;
    }

    /**
     * Get Cracking status description. 
     * @return AttackStatusDesc Cracking status description.
     */
    public String getAttackStatusDesc() {
        return this.AttackStatusDesc;
    }

    /**
     * Set Cracking status description.
     * @param AttackStatusDesc Cracking status description.
     */
    public void setAttackStatusDesc(String AttackStatusDesc) {
        this.AttackStatusDesc = AttackStatusDesc;
    }

    /**
     * Get Block expiration time (only valid for blocked events). 
     * @return BanExpiredTime Block expiration time (only valid for blocked events).
     */
    public String getBanExpiredTime() {
        return this.BanExpiredTime;
    }

    /**
     * Set Block expiration time (only valid for blocked events).
     * @param BanExpiredTime Block expiration time (only valid for blocked events).
     */
    public void setBanExpiredTime(String BanExpiredTime) {
        this.BanExpiredTime = BanExpiredTime;
    }

    /**
     * Get IP analysis 
     * @return IPAnalyse IP analysis
     */
    public IPAnalyse getIPAnalyse() {
        return this.IPAnalyse;
    }

    /**
     * Set IP analysis
     * @param IPAnalyse IP analysis
     */
    public void setIPAnalyse(IPAnalyse IPAnalyse) {
        this.IPAnalyse = IPAnalyse;
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
        if (source.IPAnalyse != null) {
            this.IPAnalyse = new IPAnalyse(source.IPAnalyse);
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
        this.setParamObj(map, prefix + "IPAnalyse.", this.IPAnalyse);

    }
}

