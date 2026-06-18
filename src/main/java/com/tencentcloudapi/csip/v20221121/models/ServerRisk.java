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

public class ServerRisk extends AbstractModel {

    /**
    * Service tag
    */
    @SerializedName("ServiceTag")
    @Expose
    private String ServiceTag;

    /**
    * Port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Affected assets
    */
    @SerializedName("AffectAsset")
    @Expose
    private String AffectAsset;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Asset type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Risk level, low - low risk, high - high risk, middle - medium risk, info - notification, extreme - critical.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Network protocol
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Components
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * Service
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * Last detected 
    */
    @SerializedName("RecentTime")
    @Expose
    private String RecentTime;

    /**
    * First detected
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Risk details
    */
    @SerializedName("RiskDetails")
    @Expose
    private String RiskDetails;

    /**
    * Handling suggestion
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Status, 0 unprocessed, 1 processed, 2 ignored, 3 defended by cloud protection
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Unique ID of the asset
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * User `appid`
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * User Nickname
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * User UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Service Snapshot
    */
    @SerializedName("ServiceSnapshot")
    @Expose
    private String ServiceSnapshot;

    /**
    * Service Access URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * List Index Value
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * Risk list
    */
    @SerializedName("RiskList")
    @Expose
    private ServerRiskSuggestion [] RiskList;

    /**
    * Recommendation List
    */
    @SerializedName("SuggestionList")
    @Expose
    private ServerRiskSuggestion [] SuggestionList;

    /**
    * HTTP Response Status Code
    */
    @SerializedName("StatusCode")
    @Expose
    private String StatusCode;

    /**
    * New risk level, high_risk high risk suspect Suspected Normal Does not have risks currently
    */
    @SerializedName("NewLevel")
    @Expose
    private String NewLevel;

    /**
    * Status, 0 unprocessed, 1 processed, 2 ignored, 3 defended by cloud protection, 4 no action is required
    */
    @SerializedName("XspmStatus")
    @Expose
    private Long XspmStatus;

    /**
     * Get Service tag 
     * @return ServiceTag Service tag
     */
    public String getServiceTag() {
        return this.ServiceTag;
    }

    /**
     * Set Service tag
     * @param ServiceTag Service tag
     */
    public void setServiceTag(String ServiceTag) {
        this.ServiceTag = ServiceTag;
    }

    /**
     * Get Port. 
     * @return Port Port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port.
     * @param Port Port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Affected assets 
     * @return AffectAsset Affected assets
     */
    public String getAffectAsset() {
        return this.AffectAsset;
    }

    /**
     * Set Affected assets
     * @param AffectAsset Affected assets
     */
    public void setAffectAsset(String AffectAsset) {
        this.AffectAsset = AffectAsset;
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
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Asset type 
     * @return InstanceType Asset type
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Asset type
     * @param InstanceType Asset type
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Risk level, low - low risk, high - high risk, middle - medium risk, info - notification, extreme - critical. 
     * @return Level Risk level, low - low risk, high - high risk, middle - medium risk, info - notification, extreme - critical.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level, low - low risk, high - high risk, middle - medium risk, info - notification, extreme - critical.
     * @param Level Risk level, low - low risk, high - high risk, middle - medium risk, info - notification, extreme - critical.
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Network protocol 
     * @return Protocol Network protocol
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Network protocol
     * @param Protocol Network protocol
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Components 
     * @return Component Components
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set Components
     * @param Component Components
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get Service 
     * @return Service Service
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set Service
     * @param Service Service
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get Last detected  
     * @return RecentTime Last detected 
     */
    public String getRecentTime() {
        return this.RecentTime;
    }

    /**
     * Set Last detected 
     * @param RecentTime Last detected 
     */
    public void setRecentTime(String RecentTime) {
        this.RecentTime = RecentTime;
    }

    /**
     * Get First detected 
     * @return FirstTime First detected
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set First detected
     * @param FirstTime First detected
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get Risk details 
     * @return RiskDetails Risk details
     */
    public String getRiskDetails() {
        return this.RiskDetails;
    }

    /**
     * Set Risk details
     * @param RiskDetails Risk details
     */
    public void setRiskDetails(String RiskDetails) {
        this.RiskDetails = RiskDetails;
    }

    /**
     * Get Handling suggestion 
     * @return Suggestion Handling suggestion
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Handling suggestion
     * @param Suggestion Handling suggestion
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Status, 0 unprocessed, 1 processed, 2 ignored, 3 defended by cloud protection 
     * @return Status Status, 0 unprocessed, 1 processed, 2 ignored, 3 defended by cloud protection
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status, 0 unprocessed, 1 processed, 2 ignored, 3 defended by cloud protection
     * @param Status Status, 0 unprocessed, 1 processed, 2 ignored, 3 defended by cloud protection
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Unique ID of the asset 
     * @return Id Unique ID of the asset
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Unique ID of the asset
     * @param Id Unique ID of the asset
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get User `appid` 
     * @return AppId User `appid`
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User `appid`
     * @param AppId User `appid`
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User Nickname 
     * @return Nick User Nickname
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set User Nickname
     * @param Nick User Nickname
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get User UIN 
     * @return Uin User UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
     * @param Uin User UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Service Snapshot 
     * @return ServiceSnapshot Service Snapshot
     */
    public String getServiceSnapshot() {
        return this.ServiceSnapshot;
    }

    /**
     * Set Service Snapshot
     * @param ServiceSnapshot Service Snapshot
     */
    public void setServiceSnapshot(String ServiceSnapshot) {
        this.ServiceSnapshot = ServiceSnapshot;
    }

    /**
     * Get Service Access URL 
     * @return Url Service Access URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Service Access URL
     * @param Url Service Access URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get List Index Value 
     * @return Index List Index Value
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set List Index Value
     * @param Index List Index Value
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get Risk list 
     * @return RiskList Risk list
     */
    public ServerRiskSuggestion [] getRiskList() {
        return this.RiskList;
    }

    /**
     * Set Risk list
     * @param RiskList Risk list
     */
    public void setRiskList(ServerRiskSuggestion [] RiskList) {
        this.RiskList = RiskList;
    }

    /**
     * Get Recommendation List 
     * @return SuggestionList Recommendation List
     */
    public ServerRiskSuggestion [] getSuggestionList() {
        return this.SuggestionList;
    }

    /**
     * Set Recommendation List
     * @param SuggestionList Recommendation List
     */
    public void setSuggestionList(ServerRiskSuggestion [] SuggestionList) {
        this.SuggestionList = SuggestionList;
    }

    /**
     * Get HTTP Response Status Code 
     * @return StatusCode HTTP Response Status Code
     */
    public String getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set HTTP Response Status Code
     * @param StatusCode HTTP Response Status Code
     */
    public void setStatusCode(String StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get New risk level, high_risk high risk suspect Suspected Normal Does not have risks currently 
     * @return NewLevel New risk level, high_risk high risk suspect Suspected Normal Does not have risks currently
     */
    public String getNewLevel() {
        return this.NewLevel;
    }

    /**
     * Set New risk level, high_risk high risk suspect Suspected Normal Does not have risks currently
     * @param NewLevel New risk level, high_risk high risk suspect Suspected Normal Does not have risks currently
     */
    public void setNewLevel(String NewLevel) {
        this.NewLevel = NewLevel;
    }

    /**
     * Get Status, 0 unprocessed, 1 processed, 2 ignored, 3 defended by cloud protection, 4 no action is required 
     * @return XspmStatus Status, 0 unprocessed, 1 processed, 2 ignored, 3 defended by cloud protection, 4 no action is required
     */
    public Long getXspmStatus() {
        return this.XspmStatus;
    }

    /**
     * Set Status, 0 unprocessed, 1 processed, 2 ignored, 3 defended by cloud protection, 4 no action is required
     * @param XspmStatus Status, 0 unprocessed, 1 processed, 2 ignored, 3 defended by cloud protection, 4 no action is required
     */
    public void setXspmStatus(Long XspmStatus) {
        this.XspmStatus = XspmStatus;
    }

    public ServerRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerRisk(ServerRisk source) {
        if (source.ServiceTag != null) {
            this.ServiceTag = new String(source.ServiceTag);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.AffectAsset != null) {
            this.AffectAsset = new String(source.AffectAsset);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.RecentTime != null) {
            this.RecentTime = new String(source.RecentTime);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.RiskDetails != null) {
            this.RiskDetails = new String(source.RiskDetails);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ServiceSnapshot != null) {
            this.ServiceSnapshot = new String(source.ServiceSnapshot);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.RiskList != null) {
            this.RiskList = new ServerRiskSuggestion[source.RiskList.length];
            for (int i = 0; i < source.RiskList.length; i++) {
                this.RiskList[i] = new ServerRiskSuggestion(source.RiskList[i]);
            }
        }
        if (source.SuggestionList != null) {
            this.SuggestionList = new ServerRiskSuggestion[source.SuggestionList.length];
            for (int i = 0; i < source.SuggestionList.length; i++) {
                this.SuggestionList[i] = new ServerRiskSuggestion(source.SuggestionList[i]);
            }
        }
        if (source.StatusCode != null) {
            this.StatusCode = new String(source.StatusCode);
        }
        if (source.NewLevel != null) {
            this.NewLevel = new String(source.NewLevel);
        }
        if (source.XspmStatus != null) {
            this.XspmStatus = new Long(source.XspmStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTag", this.ServiceTag);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "AffectAsset", this.AffectAsset);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "RecentTime", this.RecentTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "RiskDetails", this.RiskDetails);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ServiceSnapshot", this.ServiceSnapshot);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamArrayObj(map, prefix + "RiskList.", this.RiskList);
        this.setParamArrayObj(map, prefix + "SuggestionList.", this.SuggestionList);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "NewLevel", this.NewLevel);
        this.setParamSimple(map, prefix + "XspmStatus", this.XspmStatus);

    }
}

