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

public class AlertInfo extends AbstractModel {

    /**
    * alarm ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * alarm name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Alarm source
CFW: Cloud Firewall
WAF: Web application firewall
CWP: Host Security
CSIP: Cloud Security Center
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * alarm level
Prompt.
2: Low risk
3: Medium risk
4: High risk
5: Critical
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * attacker
    */
    @SerializedName("Attacker")
    @Expose
    private RoleInfo Attacker;

    /**
    * victim
    */
    @SerializedName("Victim")
    @Expose
    private RoleInfo Victim;

    /**
    * Evidence data (such as attack content, base64 encoded)
    */
    @SerializedName("EvidenceData")
    @Expose
    private String EvidenceData;

    /**
    * evidence location (for example protocol port)
    */
    @SerializedName("EvidenceLocation")
    @Expose
    private String EvidenceLocation;

    /**
    * Evidence Path
    */
    @SerializedName("EvidencePath")
    @Expose
    private String EvidencePath;

    /**
    * Initial alarm time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Latest Alarm Time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Alarm count
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Emergency Mitigation Suggestions
    */
    @SerializedName("UrgentSuggestion")
    @Expose
    private String UrgentSuggestion;

    /**
    * Radical Treatment Suggestion
    */
    @SerializedName("RemediationSuggestion")
    @Expose
    private String RemediationSuggestion;

    /**
    * Processing status
0: unprocessed, 1: ignored, 2: processed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Alarm Handling Type
    */
    @SerializedName("ProcessType")
    @Expose
    private String ProcessType;

    /**
    * Major Category of Alarm
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Alarm Subcategory
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * Dropdown Field
    */
    @SerializedName("ExtraInfo")
    @Expose
    private AlertExtraInfo ExtraInfo;

    /**
    * Aggregate Fields
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Alarm Date
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * appid
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * Account name
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * account ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Behavior
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * risk detection
    */
    @SerializedName("RiskInvestigation")
    @Expose
    private String RiskInvestigation;

    /**
    * Risk handling
    */
    @SerializedName("RiskTreatment")
    @Expose
    private String RiskTreatment;

    /**
    * log type
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Statement retrieval
    */
    @SerializedName("LogSearch")
    @Expose
    private String LogSearch;

    /**
     * Get alarm ID 
     * @return ID alarm ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set alarm ID
     * @param ID alarm ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get alarm name 
     * @return Name alarm name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set alarm name
     * @param Name alarm name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Alarm source
CFW: Cloud Firewall
WAF: Web application firewall
CWP: Host Security
CSIP: Cloud Security Center 
     * @return Source Alarm source
CFW: Cloud Firewall
WAF: Web application firewall
CWP: Host Security
CSIP: Cloud Security Center
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Alarm source
CFW: Cloud Firewall
WAF: Web application firewall
CWP: Host Security
CSIP: Cloud Security Center
     * @param Source Alarm source
CFW: Cloud Firewall
WAF: Web application firewall
CWP: Host Security
CSIP: Cloud Security Center
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get alarm level
Prompt.
2: Low risk
3: Medium risk
4: High risk
5: Critical 
     * @return Level alarm level
Prompt.
2: Low risk
3: Medium risk
4: High risk
5: Critical
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set alarm level
Prompt.
2: Low risk
3: Medium risk
4: High risk
5: Critical
     * @param Level alarm level
Prompt.
2: Low risk
3: Medium risk
4: High risk
5: Critical
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get attacker 
     * @return Attacker attacker
     */
    public RoleInfo getAttacker() {
        return this.Attacker;
    }

    /**
     * Set attacker
     * @param Attacker attacker
     */
    public void setAttacker(RoleInfo Attacker) {
        this.Attacker = Attacker;
    }

    /**
     * Get victim 
     * @return Victim victim
     */
    public RoleInfo getVictim() {
        return this.Victim;
    }

    /**
     * Set victim
     * @param Victim victim
     */
    public void setVictim(RoleInfo Victim) {
        this.Victim = Victim;
    }

    /**
     * Get Evidence data (such as attack content, base64 encoded) 
     * @return EvidenceData Evidence data (such as attack content, base64 encoded)
     */
    public String getEvidenceData() {
        return this.EvidenceData;
    }

    /**
     * Set Evidence data (such as attack content, base64 encoded)
     * @param EvidenceData Evidence data (such as attack content, base64 encoded)
     */
    public void setEvidenceData(String EvidenceData) {
        this.EvidenceData = EvidenceData;
    }

    /**
     * Get evidence location (for example protocol port) 
     * @return EvidenceLocation evidence location (for example protocol port)
     */
    public String getEvidenceLocation() {
        return this.EvidenceLocation;
    }

    /**
     * Set evidence location (for example protocol port)
     * @param EvidenceLocation evidence location (for example protocol port)
     */
    public void setEvidenceLocation(String EvidenceLocation) {
        this.EvidenceLocation = EvidenceLocation;
    }

    /**
     * Get Evidence Path 
     * @return EvidencePath Evidence Path
     */
    public String getEvidencePath() {
        return this.EvidencePath;
    }

    /**
     * Set Evidence Path
     * @param EvidencePath Evidence Path
     */
    public void setEvidencePath(String EvidencePath) {
        this.EvidencePath = EvidencePath;
    }

    /**
     * Get Initial alarm time 
     * @return CreateTime Initial alarm time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Initial alarm time
     * @param CreateTime Initial alarm time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Latest Alarm Time 
     * @return UpdateTime Latest Alarm Time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Latest Alarm Time
     * @param UpdateTime Latest Alarm Time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Alarm count 
     * @return Count Alarm count
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Alarm count
     * @param Count Alarm count
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Emergency Mitigation Suggestions 
     * @return UrgentSuggestion Emergency Mitigation Suggestions
     */
    public String getUrgentSuggestion() {
        return this.UrgentSuggestion;
    }

    /**
     * Set Emergency Mitigation Suggestions
     * @param UrgentSuggestion Emergency Mitigation Suggestions
     */
    public void setUrgentSuggestion(String UrgentSuggestion) {
        this.UrgentSuggestion = UrgentSuggestion;
    }

    /**
     * Get Radical Treatment Suggestion 
     * @return RemediationSuggestion Radical Treatment Suggestion
     */
    public String getRemediationSuggestion() {
        return this.RemediationSuggestion;
    }

    /**
     * Set Radical Treatment Suggestion
     * @param RemediationSuggestion Radical Treatment Suggestion
     */
    public void setRemediationSuggestion(String RemediationSuggestion) {
        this.RemediationSuggestion = RemediationSuggestion;
    }

    /**
     * Get Processing status
0: unprocessed, 1: ignored, 2: processed 
     * @return Status Processing status
0: unprocessed, 1: ignored, 2: processed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Processing status
0: unprocessed, 1: ignored, 2: processed
     * @param Status Processing status
0: unprocessed, 1: ignored, 2: processed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Alarm Handling Type 
     * @return ProcessType Alarm Handling Type
     */
    public String getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set Alarm Handling Type
     * @param ProcessType Alarm Handling Type
     */
    public void setProcessType(String ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get Major Category of Alarm 
     * @return Type Major Category of Alarm
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Major Category of Alarm
     * @param Type Major Category of Alarm
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Alarm Subcategory 
     * @return SubType Alarm Subcategory
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set Alarm Subcategory
     * @param SubType Alarm Subcategory
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get Dropdown Field 
     * @return ExtraInfo Dropdown Field
     */
    public AlertExtraInfo getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set Dropdown Field
     * @param ExtraInfo Dropdown Field
     */
    public void setExtraInfo(AlertExtraInfo ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get Aggregate Fields 
     * @return Key Aggregate Fields
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Aggregate Fields
     * @param Key Aggregate Fields
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Alarm Date 
     * @return Date Alarm Date
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Alarm Date
     * @param Date Alarm Date
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get appid 
     * @return AppID appid
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set appid
     * @param AppID appid
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get Account name 
     * @return NickName Account name
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Account name
     * @param NickName Account name
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get account ID 
     * @return Uin account ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set account ID
     * @param Uin account ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Behavior 
     * @return Action Behavior
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set Behavior
     * @param Action Behavior
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get risk detection 
     * @return RiskInvestigation risk detection
     */
    public String getRiskInvestigation() {
        return this.RiskInvestigation;
    }

    /**
     * Set risk detection
     * @param RiskInvestigation risk detection
     */
    public void setRiskInvestigation(String RiskInvestigation) {
        this.RiskInvestigation = RiskInvestigation;
    }

    /**
     * Get Risk handling 
     * @return RiskTreatment Risk handling
     */
    public String getRiskTreatment() {
        return this.RiskTreatment;
    }

    /**
     * Set Risk handling
     * @param RiskTreatment Risk handling
     */
    public void setRiskTreatment(String RiskTreatment) {
        this.RiskTreatment = RiskTreatment;
    }

    /**
     * Get log type 
     * @return LogType log type
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set log type
     * @param LogType log type
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Statement retrieval 
     * @return LogSearch Statement retrieval
     */
    public String getLogSearch() {
        return this.LogSearch;
    }

    /**
     * Set Statement retrieval
     * @param LogSearch Statement retrieval
     */
    public void setLogSearch(String LogSearch) {
        this.LogSearch = LogSearch;
    }

    public AlertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlertInfo(AlertInfo source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Attacker != null) {
            this.Attacker = new RoleInfo(source.Attacker);
        }
        if (source.Victim != null) {
            this.Victim = new RoleInfo(source.Victim);
        }
        if (source.EvidenceData != null) {
            this.EvidenceData = new String(source.EvidenceData);
        }
        if (source.EvidenceLocation != null) {
            this.EvidenceLocation = new String(source.EvidenceLocation);
        }
        if (source.EvidencePath != null) {
            this.EvidencePath = new String(source.EvidencePath);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.UrgentSuggestion != null) {
            this.UrgentSuggestion = new String(source.UrgentSuggestion);
        }
        if (source.RemediationSuggestion != null) {
            this.RemediationSuggestion = new String(source.RemediationSuggestion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new String(source.ProcessType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new AlertExtraInfo(source.ExtraInfo);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.AppID != null) {
            this.AppID = new String(source.AppID);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.RiskInvestigation != null) {
            this.RiskInvestigation = new String(source.RiskInvestigation);
        }
        if (source.RiskTreatment != null) {
            this.RiskTreatment = new String(source.RiskTreatment);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.LogSearch != null) {
            this.LogSearch = new String(source.LogSearch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamObj(map, prefix + "Attacker.", this.Attacker);
        this.setParamObj(map, prefix + "Victim.", this.Victim);
        this.setParamSimple(map, prefix + "EvidenceData", this.EvidenceData);
        this.setParamSimple(map, prefix + "EvidenceLocation", this.EvidenceLocation);
        this.setParamSimple(map, prefix + "EvidencePath", this.EvidencePath);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "UrgentSuggestion", this.UrgentSuggestion);
        this.setParamSimple(map, prefix + "RemediationSuggestion", this.RemediationSuggestion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamObj(map, prefix + "ExtraInfo.", this.ExtraInfo);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RiskInvestigation", this.RiskInvestigation);
        this.setParamSimple(map, prefix + "RiskTreatment", this.RiskTreatment);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "LogSearch", this.LogSearch);

    }
}

