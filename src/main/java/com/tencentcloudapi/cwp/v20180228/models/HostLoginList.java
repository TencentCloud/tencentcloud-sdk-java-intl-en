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

public class HostLoginList extends AbstractModel {

    /**
    * Record ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Host UUID
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
    * Host name
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
    * 1: normal log-in; 2: cross-region log-in; 5: allowlisted; 14: processed; 15: ignored
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
    * Log-in time
    */
    @SerializedName("LoginTime")
    @Expose
    private String LoginTime;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Whether hit the exception of cross-region log-in: 1 means hit the exception, 0 means not hit
    */
    @SerializedName("IsRiskArea")
    @Expose
    private Long IsRiskArea;

    /**
    * Whether hit the exception of abnormal user: 1: yes; 0: no
    */
    @SerializedName("IsRiskUser")
    @Expose
    private Long IsRiskUser;

    /**
    * Whether hit the exception of abnormal time: 1: yes; 0: no
    */
    @SerializedName("IsRiskTime")
    @Expose
    private Long IsRiskTime;

    /**
    * Whether hit the exception of abnormal IP: 1: yes; 0: no
    */
    @SerializedName("IsRiskSrcIp")
    @Expose
    private Long IsRiskSrcIp;

    /**
    * Risk level:
0: high risk
1: Suspicious
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * Location name
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * Host QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * High-risk information description:
ABROAD - IP outside Chinese mainland
XTI - Threat Intelligence
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Additional information
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * Request destination port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * ip analysis
    */
    @SerializedName("IPAnalyse")
    @Expose
    private IPAnalyse IPAnalyse;

    /**
     * Get Record ID 
     * @return Id Record ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Record ID
     * @param Id Record ID
     */
    public void setId(Long Id) {
        this.Id = Id;
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
     * Get Host name 
     * @return MachineName Host name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Host name
     * @param MachineName Host name
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
     * Get 1: normal log-in; 2: cross-region log-in; 5: allowlisted; 14: processed; 15: ignored 
     * @return Status 1: normal log-in; 2: cross-region log-in; 5: allowlisted; 14: processed; 15: ignored
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1: normal log-in; 2: cross-region log-in; 5: allowlisted; 14: processed; 15: ignored
     * @param Status 1: normal log-in; 2: cross-region log-in; 5: allowlisted; 14: processed; 15: ignored
     */
    public void setStatus(Long Status) {
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
     * Get Log-in time 
     * @return LoginTime Log-in time
     */
    public String getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set Log-in time
     * @param LoginTime Log-in time
     */
    public void setLoginTime(String LoginTime) {
        this.LoginTime = LoginTime;
    }

    /**
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Whether hit the exception of cross-region log-in: 1 means hit the exception, 0 means not hit 
     * @return IsRiskArea Whether hit the exception of cross-region log-in: 1 means hit the exception, 0 means not hit
     */
    public Long getIsRiskArea() {
        return this.IsRiskArea;
    }

    /**
     * Set Whether hit the exception of cross-region log-in: 1 means hit the exception, 0 means not hit
     * @param IsRiskArea Whether hit the exception of cross-region log-in: 1 means hit the exception, 0 means not hit
     */
    public void setIsRiskArea(Long IsRiskArea) {
        this.IsRiskArea = IsRiskArea;
    }

    /**
     * Get Whether hit the exception of abnormal user: 1: yes; 0: no 
     * @return IsRiskUser Whether hit the exception of abnormal user: 1: yes; 0: no
     */
    public Long getIsRiskUser() {
        return this.IsRiskUser;
    }

    /**
     * Set Whether hit the exception of abnormal user: 1: yes; 0: no
     * @param IsRiskUser Whether hit the exception of abnormal user: 1: yes; 0: no
     */
    public void setIsRiskUser(Long IsRiskUser) {
        this.IsRiskUser = IsRiskUser;
    }

    /**
     * Get Whether hit the exception of abnormal time: 1: yes; 0: no 
     * @return IsRiskTime Whether hit the exception of abnormal time: 1: yes; 0: no
     */
    public Long getIsRiskTime() {
        return this.IsRiskTime;
    }

    /**
     * Set Whether hit the exception of abnormal time: 1: yes; 0: no
     * @param IsRiskTime Whether hit the exception of abnormal time: 1: yes; 0: no
     */
    public void setIsRiskTime(Long IsRiskTime) {
        this.IsRiskTime = IsRiskTime;
    }

    /**
     * Get Whether hit the exception of abnormal IP: 1: yes; 0: no 
     * @return IsRiskSrcIp Whether hit the exception of abnormal IP: 1: yes; 0: no
     */
    public Long getIsRiskSrcIp() {
        return this.IsRiskSrcIp;
    }

    /**
     * Set Whether hit the exception of abnormal IP: 1: yes; 0: no
     * @param IsRiskSrcIp Whether hit the exception of abnormal IP: 1: yes; 0: no
     */
    public void setIsRiskSrcIp(Long IsRiskSrcIp) {
        this.IsRiskSrcIp = IsRiskSrcIp;
    }

    /**
     * Get Risk level:
0: high risk
1: Suspicious 
     * @return RiskLevel Risk level:
0: high risk
1: Suspicious
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set Risk level:
0: high risk
1: Suspicious
     * @param RiskLevel Risk level:
0: high risk
1: Suspicious
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get Location name 
     * @return Location Location name
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set Location name
     * @param Location Location name
     */
    public void setLocation(String Location) {
        this.Location = Location;
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
     * Get High-risk information description:
ABROAD - IP outside Chinese mainland
XTI - Threat Intelligence 
     * @return Desc High-risk information description:
ABROAD - IP outside Chinese mainland
XTI - Threat Intelligence
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set High-risk information description:
ABROAD - IP outside Chinese mainland
XTI - Threat Intelligence
     * @param Desc High-risk information description:
ABROAD - IP outside Chinese mainland
XTI - Threat Intelligence
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
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
     * Get Request destination port. 
     * @return Port Request destination port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Request destination port.
     * @param Port Request destination port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get ip analysis 
     * @return IPAnalyse ip analysis
     */
    public IPAnalyse getIPAnalyse() {
        return this.IPAnalyse;
    }

    /**
     * Set ip analysis
     * @param IPAnalyse ip analysis
     */
    public void setIPAnalyse(IPAnalyse IPAnalyse) {
        this.IPAnalyse = IPAnalyse;
    }

    public HostLoginList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostLoginList(HostLoginList source) {
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
            this.Status = new Long(source.Status);
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
        if (source.LoginTime != null) {
            this.LoginTime = new String(source.LoginTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.IsRiskArea != null) {
            this.IsRiskArea = new Long(source.IsRiskArea);
        }
        if (source.IsRiskUser != null) {
            this.IsRiskUser = new Long(source.IsRiskUser);
        }
        if (source.IsRiskTime != null) {
            this.IsRiskTime = new Long(source.IsRiskTime);
        }
        if (source.IsRiskSrcIp != null) {
            this.IsRiskSrcIp = new Long(source.IsRiskSrcIp);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
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
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "IsRiskArea", this.IsRiskArea);
        this.setParamSimple(map, prefix + "IsRiskUser", this.IsRiskUser);
        this.setParamSimple(map, prefix + "IsRiskTime", this.IsRiskTime);
        this.setParamSimple(map, prefix + "IsRiskSrcIp", this.IsRiskSrcIp);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamObj(map, prefix + "IPAnalyse.", this.IPAnalyse);

    }
}

