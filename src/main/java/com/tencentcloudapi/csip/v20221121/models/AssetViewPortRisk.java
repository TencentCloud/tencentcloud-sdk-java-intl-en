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

public class AssetViewPortRisk extends AbstractModel {

    /**
    * Port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Affect assets
    */
    @SerializedName("AffectAsset")
    @Expose
    private String AffectAsset;

    /**
    * Risk level. low: low risk. high: high risk. middle: medium risk. info: notification. extreme: critical.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Asset type
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Protocol
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Component
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * Service.
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * Latest Recognition Time
    */
    @SerializedName("RecentTime")
    @Expose
    private String RecentTime;

    /**
    * First Recognition Time
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Disposal Suggestions. 0: Maintain Status Quo; 1: Restrict Access; 2: Block Port.
    */
    @SerializedName("Suggestion")
    @Expose
    private Long Suggestion;

    /**
    * Status. 0-Unprocessed; 1-Disposed; 2-Ignored; 3-Defended by Cloud Firewall.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Risk ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Front-end Index
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * User appid.
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
    * Recognition Source. See Enumeration Return for details.
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Service judgment. high_risk_service: high-risk service. web_service: web service. other_service: other service.
    */
    @SerializedName("ServiceJudge")
    @Expose
    private String ServiceJudge;

    /**
    * Status. 0: unprocessed; 1: processed; 2: ignored; 3: defended by Cloud Firewall; 4: no action is required.
    */
    @SerializedName("XspmStatus")
    @Expose
    private Long XspmStatus;

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
     * Get Affect assets 
     * @return AffectAsset Affect assets
     */
    public String getAffectAsset() {
        return this.AffectAsset;
    }

    /**
     * Set Affect assets
     * @param AffectAsset Affect assets
     */
    public void setAffectAsset(String AffectAsset) {
        this.AffectAsset = AffectAsset;
    }

    /**
     * Get Risk level. low: low risk. high: high risk. middle: medium risk. info: notification. extreme: critical. 
     * @return Level Risk level. low: low risk. high: high risk. middle: medium risk. info: notification. extreme: critical.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level. low: low risk. high: high risk. middle: medium risk. info: notification. extreme: critical.
     * @param Level Risk level. low: low risk. high: high risk. middle: medium risk. info: notification. extreme: critical.
     */
    public void setLevel(String Level) {
        this.Level = Level;
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
     * Get Protocol 
     * @return Protocol Protocol
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol
     * @param Protocol Protocol
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Component 
     * @return Component Component
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set Component
     * @param Component Component
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get Service. 
     * @return Service Service.
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set Service.
     * @param Service Service.
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get Latest Recognition Time 
     * @return RecentTime Latest Recognition Time
     */
    public String getRecentTime() {
        return this.RecentTime;
    }

    /**
     * Set Latest Recognition Time
     * @param RecentTime Latest Recognition Time
     */
    public void setRecentTime(String RecentTime) {
        this.RecentTime = RecentTime;
    }

    /**
     * Get First Recognition Time 
     * @return FirstTime First Recognition Time
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set First Recognition Time
     * @param FirstTime First Recognition Time
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get Disposal Suggestions. 0: Maintain Status Quo; 1: Restrict Access; 2: Block Port. 
     * @return Suggestion Disposal Suggestions. 0: Maintain Status Quo; 1: Restrict Access; 2: Block Port.
     */
    public Long getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Disposal Suggestions. 0: Maintain Status Quo; 1: Restrict Access; 2: Block Port.
     * @param Suggestion Disposal Suggestions. 0: Maintain Status Quo; 1: Restrict Access; 2: Block Port.
     */
    public void setSuggestion(Long Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Status. 0-Unprocessed; 1-Disposed; 2-Ignored; 3-Defended by Cloud Firewall. 
     * @return Status Status. 0-Unprocessed; 1-Disposed; 2-Ignored; 3-Defended by Cloud Firewall.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0-Unprocessed; 1-Disposed; 2-Ignored; 3-Defended by Cloud Firewall.
     * @param Status Status. 0-Unprocessed; 1-Disposed; 2-Ignored; 3-Defended by Cloud Firewall.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Risk ID 
     * @return Id Risk ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Risk ID
     * @param Id Risk ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Front-end Index 
     * @return Index Front-end Index
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Front-end Index
     * @param Index Front-end Index
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get User appid. 
     * @return AppId User appid.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User appid.
     * @param AppId User appid.
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
     * Get Recognition Source. See Enumeration Return for details. 
     * @return From Recognition Source. See Enumeration Return for details.
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Recognition Source. See Enumeration Return for details.
     * @param From Recognition Source. See Enumeration Return for details.
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Service judgment. high_risk_service: high-risk service. web_service: web service. other_service: other service. 
     * @return ServiceJudge Service judgment. high_risk_service: high-risk service. web_service: web service. other_service: other service.
     */
    public String getServiceJudge() {
        return this.ServiceJudge;
    }

    /**
     * Set Service judgment. high_risk_service: high-risk service. web_service: web service. other_service: other service.
     * @param ServiceJudge Service judgment. high_risk_service: high-risk service. web_service: web service. other_service: other service.
     */
    public void setServiceJudge(String ServiceJudge) {
        this.ServiceJudge = ServiceJudge;
    }

    /**
     * Get Status. 0: unprocessed; 1: processed; 2: ignored; 3: defended by Cloud Firewall; 4: no action is required. 
     * @return XspmStatus Status. 0: unprocessed; 1: processed; 2: ignored; 3: defended by Cloud Firewall; 4: no action is required.
     */
    public Long getXspmStatus() {
        return this.XspmStatus;
    }

    /**
     * Set Status. 0: unprocessed; 1: processed; 2: ignored; 3: defended by Cloud Firewall; 4: no action is required.
     * @param XspmStatus Status. 0: unprocessed; 1: processed; 2: ignored; 3: defended by Cloud Firewall; 4: no action is required.
     */
    public void setXspmStatus(Long XspmStatus) {
        this.XspmStatus = XspmStatus;
    }

    public AssetViewPortRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetViewPortRisk(AssetViewPortRisk source) {
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.AffectAsset != null) {
            this.AffectAsset = new String(source.AffectAsset);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
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
        if (source.Suggestion != null) {
            this.Suggestion = new Long(source.Suggestion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
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
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.ServiceJudge != null) {
            this.ServiceJudge = new String(source.ServiceJudge);
        }
        if (source.XspmStatus != null) {
            this.XspmStatus = new Long(source.XspmStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "AffectAsset", this.AffectAsset);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "RecentTime", this.RecentTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "ServiceJudge", this.ServiceJudge);
        this.setParamSimple(map, prefix + "XspmStatus", this.XspmStatus);

    }
}

