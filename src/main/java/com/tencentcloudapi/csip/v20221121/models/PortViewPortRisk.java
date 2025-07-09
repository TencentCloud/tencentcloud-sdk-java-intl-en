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
    * Affected assets
    */
    @SerializedName("NoHandleCount")
    @Expose
    private Long NoHandleCount;

    /**
    * Risk level
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
    * Port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

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
    * Suggested action. `0`: Keep as it is; `1`: Block access requests; `2`: Block the port
    */
    @SerializedName("Suggestion")
    @Expose
    private Long Suggestion;

    /**
    * Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
    */
    @SerializedName("AffectAssetCount")
    @Expose
    private String AffectAssetCount;

    /**
    * Unique ID of the asset
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Asset sub-category
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Data entry key
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * User AppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * User name.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * User `uin`
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Service
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
     * Get Affected assets 
     * @return NoHandleCount Affected assets
     */
    public Long getNoHandleCount() {
        return this.NoHandleCount;
    }

    /**
     * Set Affected assets
     * @param NoHandleCount Affected assets
     */
    public void setNoHandleCount(Long NoHandleCount) {
        this.NoHandleCount = NoHandleCount;
    }

    /**
     * Get Risk level 
     * @return Level Risk level
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level
     * @param Level Risk level
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
     * Get Suggested action. `0`: Keep as it is; `1`: Block access requests; `2`: Block the port 
     * @return Suggestion Suggested action. `0`: Keep as it is; `1`: Block access requests; `2`: Block the port
     */
    public Long getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Suggested action. `0`: Keep as it is; `1`: Block access requests; `2`: Block the port
     * @param Suggestion Suggested action. `0`: Keep as it is; `1`: Block access requests; `2`: Block the port
     */
    public void setSuggestion(Long Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored 
     * @return AffectAssetCount Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
     */
    public String getAffectAssetCount() {
        return this.AffectAssetCount;
    }

    /**
     * Set Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
     * @param AffectAssetCount Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
     */
    public void setAffectAssetCount(String AffectAssetCount) {
        this.AffectAssetCount = AffectAssetCount;
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
     * Get Asset sub-category 
     * @return From Asset sub-category
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Asset sub-category
     * @param From Asset sub-category
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Data entry key 
     * @return Index Data entry key
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Data entry key
     * @param Index Data entry key
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get User AppId 
     * @return AppId User AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppId
     * @param AppId User AppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User name.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Nick User name.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set User name.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Nick User name.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get User `uin`
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Uin User `uin`
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User `uin`
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Uin User `uin`
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
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

