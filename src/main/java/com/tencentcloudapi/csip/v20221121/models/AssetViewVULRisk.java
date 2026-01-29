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

public class AssetViewVULRisk extends AbstractModel {

    /**
    * Affected assets
    */
    @SerializedName("AffectAsset")
    @Expose
    private String AffectAsset;

    /**
    * Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - critical.

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
    * Status of the risk. `0`: Not handled, `1`: Handled; `2`: Ignored
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
    * Vulnerability type
    */
    @SerializedName("VULType")
    @Expose
    private String VULType;

    /**
    * Port
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Vulnerability description
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * Vulnerability impact component.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Technology reference.
    */
    @SerializedName("References")
    @Expose
    private String References;

    /**
    * Vulnerability impact version.
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * Risks.
    */
    @SerializedName("VULURL")
    @Expose
    private String VULURL;

    /**
    * Vulnerability name
    */
    @SerializedName("VULName")
    @Expose
    private String VULName;

    /**
    * CVE number
    */
    @SerializedName("CVE")
    @Expose
    private String CVE;

    /**
    * Fixing solution
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * POC ID
    */
    @SerializedName("POCId")
    @Expose
    private String POCId;

    /**
    * Scan Source
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * CWPP edition
    */
    @SerializedName("CWPVersion")
    @Expose
    private Long CWPVersion;

    /**
    * Whether it can be fixed 
    */
    @SerializedName("IsSupportRepair")
    @Expose
    private Boolean IsSupportRepair;

    /**
    * Whether it can be detected
    */
    @SerializedName("IsSupportDetect")
    @Expose
    private Boolean IsSupportDetect;

    /**
    * Instance UUID
    */
    @SerializedName("InstanceUUID")
    @Expose
    private String InstanceUUID;

    /**
    * Payload
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
    */
    @SerializedName("EMGCVulType")
    @Expose
    private Long EMGCVulType;

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
     * Get Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - critical.
 
     * @return Level Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - critical.

     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - critical.

     * @param Level Risk level: low - low risk, high - high risk, middle - medium risk, info - note, extreme - critical.

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
     * Get Vulnerability type 
     * @return VULType Vulnerability type
     */
    public String getVULType() {
        return this.VULType;
    }

    /**
     * Set Vulnerability type
     * @param VULType Vulnerability type
     */
    public void setVULType(String VULType) {
        this.VULType = VULType;
    }

    /**
     * Get Port 
     * @return Port Port
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port
     * @param Port Port
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Vulnerability description 
     * @return Describe Vulnerability description
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Vulnerability description
     * @param Describe Vulnerability description
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get Vulnerability impact component. 
     * @return AppName Vulnerability impact component.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Vulnerability impact component.
     * @param AppName Vulnerability impact component.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Technology reference. 
     * @return References Technology reference.
     */
    public String getReferences() {
        return this.References;
    }

    /**
     * Set Technology reference.
     * @param References Technology reference.
     */
    public void setReferences(String References) {
        this.References = References;
    }

    /**
     * Get Vulnerability impact version. 
     * @return AppVersion Vulnerability impact version.
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set Vulnerability impact version.
     * @param AppVersion Vulnerability impact version.
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get Risks. 
     * @return VULURL Risks.
     */
    public String getVULURL() {
        return this.VULURL;
    }

    /**
     * Set Risks.
     * @param VULURL Risks.
     */
    public void setVULURL(String VULURL) {
        this.VULURL = VULURL;
    }

    /**
     * Get Vulnerability name 
     * @return VULName Vulnerability name
     */
    public String getVULName() {
        return this.VULName;
    }

    /**
     * Set Vulnerability name
     * @param VULName Vulnerability name
     */
    public void setVULName(String VULName) {
        this.VULName = VULName;
    }

    /**
     * Get CVE number 
     * @return CVE CVE number
     */
    public String getCVE() {
        return this.CVE;
    }

    /**
     * Set CVE number
     * @param CVE CVE number
     */
    public void setCVE(String CVE) {
        this.CVE = CVE;
    }

    /**
     * Get Fixing solution 
     * @return Fix Fixing solution
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set Fixing solution
     * @param Fix Fixing solution
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get POC ID 
     * @return POCId POC ID
     */
    public String getPOCId() {
        return this.POCId;
    }

    /**
     * Set POC ID
     * @param POCId POC ID
     */
    public void setPOCId(String POCId) {
        this.POCId = POCId;
    }

    /**
     * Get Scan Source 
     * @return From Scan Source
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Scan Source
     * @param From Scan Source
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get CWPP edition 
     * @return CWPVersion CWPP edition
     */
    public Long getCWPVersion() {
        return this.CWPVersion;
    }

    /**
     * Set CWPP edition
     * @param CWPVersion CWPP edition
     */
    public void setCWPVersion(Long CWPVersion) {
        this.CWPVersion = CWPVersion;
    }

    /**
     * Get Whether it can be fixed  
     * @return IsSupportRepair Whether it can be fixed 
     */
    public Boolean getIsSupportRepair() {
        return this.IsSupportRepair;
    }

    /**
     * Set Whether it can be fixed 
     * @param IsSupportRepair Whether it can be fixed 
     */
    public void setIsSupportRepair(Boolean IsSupportRepair) {
        this.IsSupportRepair = IsSupportRepair;
    }

    /**
     * Get Whether it can be detected 
     * @return IsSupportDetect Whether it can be detected
     */
    public Boolean getIsSupportDetect() {
        return this.IsSupportDetect;
    }

    /**
     * Set Whether it can be detected
     * @param IsSupportDetect Whether it can be detected
     */
    public void setIsSupportDetect(Boolean IsSupportDetect) {
        this.IsSupportDetect = IsSupportDetect;
    }

    /**
     * Get Instance UUID 
     * @return InstanceUUID Instance UUID
     */
    public String getInstanceUUID() {
        return this.InstanceUUID;
    }

    /**
     * Set Instance UUID
     * @param InstanceUUID Instance UUID
     */
    public void setInstanceUUID(String InstanceUUID) {
        this.InstanceUUID = InstanceUUID;
    }

    /**
     * Get Payload 
     * @return Payload Payload
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set Payload
     * @param Payload Payload
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability. 
     * @return EMGCVulType Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
     */
    public Long getEMGCVulType() {
        return this.EMGCVulType;
    }

    /**
     * Set Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
     * @param EMGCVulType Emergency Vulnerability Type. 1-Emergency Vulnerability; 0-Non-emergency Vulnerability.
     */
    public void setEMGCVulType(Long EMGCVulType) {
        this.EMGCVulType = EMGCVulType;
    }

    public AssetViewVULRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetViewVULRisk(AssetViewVULRisk source) {
        if (source.AffectAsset != null) {
            this.AffectAsset = new String(source.AffectAsset);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
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
        if (source.VULType != null) {
            this.VULType = new String(source.VULType);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.References != null) {
            this.References = new String(source.References);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.VULURL != null) {
            this.VULURL = new String(source.VULURL);
        }
        if (source.VULName != null) {
            this.VULName = new String(source.VULName);
        }
        if (source.CVE != null) {
            this.CVE = new String(source.CVE);
        }
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.POCId != null) {
            this.POCId = new String(source.POCId);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.CWPVersion != null) {
            this.CWPVersion = new Long(source.CWPVersion);
        }
        if (source.IsSupportRepair != null) {
            this.IsSupportRepair = new Boolean(source.IsSupportRepair);
        }
        if (source.IsSupportDetect != null) {
            this.IsSupportDetect = new Boolean(source.IsSupportDetect);
        }
        if (source.InstanceUUID != null) {
            this.InstanceUUID = new String(source.InstanceUUID);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.EMGCVulType != null) {
            this.EMGCVulType = new Long(source.EMGCVulType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AffectAsset", this.AffectAsset);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "RecentTime", this.RecentTime);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "VULType", this.VULType);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "References", this.References);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "VULURL", this.VULURL);
        this.setParamSimple(map, prefix + "VULName", this.VULName);
        this.setParamSimple(map, prefix + "CVE", this.CVE);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "POCId", this.POCId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "CWPVersion", this.CWPVersion);
        this.setParamSimple(map, prefix + "IsSupportRepair", this.IsSupportRepair);
        this.setParamSimple(map, prefix + "IsSupportDetect", this.IsSupportDetect);
        this.setParamSimple(map, prefix + "InstanceUUID", this.InstanceUUID);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "EMGCVulType", this.EMGCVulType);

    }
}

