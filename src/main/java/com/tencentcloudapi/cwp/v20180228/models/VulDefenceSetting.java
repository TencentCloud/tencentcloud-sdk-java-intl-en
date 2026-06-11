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

public class VulDefenceSetting extends AbstractModel {

    /**
    * Policy name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * System policy
Create a custom policy
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * Threat level
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ThreatLevel")
    @Expose
    private Long ThreatLevel;

    /**
    * All Flagship Edition Hosts
Specified hosts
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * Number of supported vulnerabilities.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportVulNum")
    @Expose
    private Long SupportVulNum;

    /**
    * 0: disabled, 1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * User appid.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * User's member ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * Policy action
Alarm
1. Defense
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyAction")
    @Expose
    private Long StrategyAction;

    /**
    * User UIN
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * User Nickname
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * Protection type
Vulnerability defense
Attack detection
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefenceType")
    @Expose
    private Long DefenceType;

    /**
    * Number of custom hosts.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
     * Get Policy name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StrategyName Policy name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Policy name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StrategyName Policy name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get System policy
Create a custom policy
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StrategyType System policy
Create a custom policy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set System policy
Create a custom policy
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StrategyType System policy
Create a custom policy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get Threat level
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ThreatLevel Threat level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getThreatLevel() {
        return this.ThreatLevel;
    }

    /**
     * Set Threat level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ThreatLevel Threat level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setThreatLevel(Long ThreatLevel) {
        this.ThreatLevel = ThreatLevel;
    }

    /**
     * Get All Flagship Edition Hosts
Specified hosts
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Scope All Flagship Edition Hosts
Specified hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set All Flagship Edition Hosts
Specified hosts
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Scope All Flagship Edition Hosts
Specified hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get Number of supported vulnerabilities.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportVulNum Number of supported vulnerabilities.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSupportVulNum() {
        return this.SupportVulNum;
    }

    /**
     * Set Number of supported vulnerabilities.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportVulNum Number of supported vulnerabilities.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportVulNum(Long SupportVulNum) {
        this.SupportVulNum = SupportVulNum;
    }

    /**
     * Get 0: disabled, 1: enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enable 0: disabled, 1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 0: disabled, 1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enable 0: disabled, 1: enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get User appid.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppId User appid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User appid.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppId User appid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User's member ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemberId User's member ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set User's member ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemberId User's member ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Policy action
Alarm
1. Defense
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StrategyAction Policy action
Alarm
1. Defense
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStrategyAction() {
        return this.StrategyAction;
    }

    /**
     * Set Policy action
Alarm
1. Defense
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StrategyAction Policy action
Alarm
1. Defense
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategyAction(Long StrategyAction) {
        this.StrategyAction = StrategyAction;
    }

    /**
     * Get User UIN
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uin User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uin User UIN
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get User Nickname
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nickname User Nickname
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set User Nickname
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nickname User Nickname
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get Protection type
Vulnerability defense
Attack detection
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefenceType Protection type
Vulnerability defense
Attack detection
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefenceType() {
        return this.DefenceType;
    }

    /**
     * Set Protection type
Vulnerability defense
Attack detection
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefenceType Protection type
Vulnerability defense
Attack detection
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefenceType(Long DefenceType) {
        this.DefenceType = DefenceType;
    }

    /**
     * Get Number of custom hosts.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceNum Number of custom hosts.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set Number of custom hosts.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceNum Number of custom hosts.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get Policy ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StrategyId Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StrategyId Policy ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    public VulDefenceSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefenceSetting(VulDefenceSetting source) {
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.ThreatLevel != null) {
            this.ThreatLevel = new Long(source.ThreatLevel);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.SupportVulNum != null) {
            this.SupportVulNum = new Long(source.SupportVulNum);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.StrategyAction != null) {
            this.StrategyAction = new Long(source.StrategyAction);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.DefenceType != null) {
            this.DefenceType = new Long(source.DefenceType);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "ThreatLevel", this.ThreatLevel);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "SupportVulNum", this.SupportVulNum);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "StrategyAction", this.StrategyAction);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "DefenceType", this.DefenceType);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);

    }
}

