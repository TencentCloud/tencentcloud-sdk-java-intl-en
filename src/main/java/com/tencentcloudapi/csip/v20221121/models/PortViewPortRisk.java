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

public class PortViewPortRisk extends AbstractModel {

    /**
    * Unprocessed quantity.
    */
    @SerializedName("NoHandleCount")
    @Expose
    private Long NoHandleCount;

    /**
    * Risk level. low: low risk, high: high risk, middle: medium risk, info: notification, extreme: severe.
    */
    @SerializedName("Level")
    @Expose
    private String Level;

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
    * Port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

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
    * Number of Affected Assets
    */
    @SerializedName("AffectAssetCount")
    @Expose
    private String AffectAssetCount;

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Source recognition
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Front-end Index
    */
    @SerializedName("Index")
    @Expose
    private String Index;

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
    * Service.
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
     * Get Unprocessed quantity. 
     * @return NoHandleCount Unprocessed quantity.
     */
    public Long getNoHandleCount() {
        return this.NoHandleCount;
    }

    /**
     * Set Unprocessed quantity.
     * @param NoHandleCount Unprocessed quantity.
     */
    public void setNoHandleCount(Long NoHandleCount) {
        this.NoHandleCount = NoHandleCount;
    }

    /**
     * Get Risk level. low: low risk, high: high risk, middle: medium risk, info: notification, extreme: severe. 
     * @return Level Risk level. low: low risk, high: high risk, middle: medium risk, info: notification, extreme: severe.
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level. low: low risk, high: high risk, middle: medium risk, info: notification, extreme: severe.
     * @param Level Risk level. low: low risk, high: high risk, middle: medium risk, info: notification, extreme: severe.
     */
    public void setLevel(String Level) {
        this.Level = Level;
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
     * Get Number of Affected Assets 
     * @return AffectAssetCount Number of Affected Assets
     */
    public String getAffectAssetCount() {
        return this.AffectAssetCount;
    }

    /**
     * Set Number of Affected Assets
     * @param AffectAssetCount Number of Affected Assets
     */
    public void setAffectAssetCount(String AffectAssetCount) {
        this.AffectAssetCount = AffectAssetCount;
    }

    /**
     * Get ID 
     * @return Id ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID
     * @param Id ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Source recognition 
     * @return From Source recognition
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Source recognition
     * @param From Source recognition
     */
    public void setFrom(String From) {
        this.From = From;
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

    public PortViewPortRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortViewPortRisk(PortViewPortRisk source) {
        if (source.NoHandleCount != null) {
            this.NoHandleCount = new Long(source.NoHandleCount);
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
        if (source.Port != null) {
            this.Port = new Long(source.Port);
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
        if (source.AffectAssetCount != null) {
            this.AffectAssetCount = new String(source.AffectAssetCount);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
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
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoHandleCount", this.NoHandleCount);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "RecentTime", this.RecentTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "AffectAssetCount", this.AffectAssetCount);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Service", this.Service);

    }
}

