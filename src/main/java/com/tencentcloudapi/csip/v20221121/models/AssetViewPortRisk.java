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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetViewPortRisk extends AbstractModel {

    /**
    * Port
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
    * Risk level
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
    * Suggested action. `0`: Keep as it is; `1`: Block access requests; `2`: Block the port
    */
    @SerializedName("Suggestion")
    @Expose
    private Long Suggestion;

    /**
    * Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
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
    * Frontend index
    */
    @SerializedName("Index")
    @Expose
    private String Index;

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
    * User `appid`
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
    * Source of the task
    */
    @SerializedName("From")
    @Expose
    private String From;

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
     * @return Status Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
     * @param Status Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
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
     * Get Frontend index 
     * @return Index Frontend index
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set Frontend index
     * @param Index Frontend index
     */
    public void setIndex(String Index) {
        this.Index = Index;
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
     * Get Source of the task 
     * @return From Source of the task
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Source of the task
     * @param From Source of the task
     */
    public void setFrom(String From) {
        this.From = From;
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

    }
}

