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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MatchInfo extends AbstractModel {

    /**
    * MatchCode
    */
    @SerializedName("MatchCode")
    @Expose
    private String MatchCode;

    /**
    * Match name
    */
    @SerializedName("MatchName")
    @Expose
    private String MatchName;

    /**
    * Matchmaking description
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("MatchDesc")
    @Expose
    private String MatchDesc;

    /**
    * RuleCode
    */
    @SerializedName("RuleCode")
    @Expose
    private String RuleCode;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Timeout period
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Receiving notification address
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * Whether to request server resources for the match results. 0: no, 1: request GSE resources
    */
    @SerializedName("ServerType")
    @Expose
    private Long ServerType;

    /**
    * Region of the server queue
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("ServerRegion")
    @Expose
    private String ServerRegion;

    /**
    * Server queue
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("ServerQueue")
    @Expose
    private String ServerQueue;

    /**
    * Custom push data
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("CustomPushData")
    @Expose
    private String CustomPushData;

    /**
    * Game server session data
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("ServerSessionData")
    @Expose
    private String ServerSessionData;

    /**
    * Game attributes
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("GameProperties")
    @Expose
    private StringKV [] GameProperties;

    /**
    * Enable or disable the log. 0: disable, 1: enable
    */
    @SerializedName("LogSwitch")
    @Expose
    private Long LogSwitch;

    /**
    * Logset ID
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Logset name
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * Log topic ID
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * Log topic name
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("LogTopicName")
    @Expose
    private String LogTopicName;

    /**
    * Tag
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Tags")
    @Expose
    private StringKV [] Tags;

    /**
    * Region
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * User AppId
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * User root account UIN
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Create user account UIN
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * Rule Name
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Log status. 0: normal, 1: the log set does not exist, 2: the log topic does not exist, 3: neither the log set nor the log topic exists.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("LogStatus")
    @Expose
    private Long LogStatus;

    /**
     * Get MatchCode 
     * @return MatchCode MatchCode
     */
    public String getMatchCode() {
        return this.MatchCode;
    }

    /**
     * Set MatchCode
     * @param MatchCode MatchCode
     */
    public void setMatchCode(String MatchCode) {
        this.MatchCode = MatchCode;
    }

    /**
     * Get Match name 
     * @return MatchName Match name
     */
    public String getMatchName() {
        return this.MatchName;
    }

    /**
     * Set Match name
     * @param MatchName Match name
     */
    public void setMatchName(String MatchName) {
        this.MatchName = MatchName;
    }

    /**
     * Get Matchmaking description
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return MatchDesc Matchmaking description
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getMatchDesc() {
        return this.MatchDesc;
    }

    /**
     * Set Matchmaking description
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param MatchDesc Matchmaking description
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setMatchDesc(String MatchDesc) {
        this.MatchDesc = MatchDesc;
    }

    /**
     * Get RuleCode 
     * @return RuleCode RuleCode
     */
    public String getRuleCode() {
        return this.RuleCode;
    }

    /**
     * Set RuleCode
     * @param RuleCode RuleCode
     */
    public void setRuleCode(String RuleCode) {
        this.RuleCode = RuleCode;
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
     * Get Timeout period 
     * @return Timeout Timeout period
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout period
     * @param Timeout Timeout period
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Receiving notification address 
     * @return NotifyUrl Receiving notification address
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set Receiving notification address
     * @param NotifyUrl Receiving notification address
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get Whether to request server resources for the match results. 0: no, 1: request GSE resources 
     * @return ServerType Whether to request server resources for the match results. 0: no, 1: request GSE resources
     */
    public Long getServerType() {
        return this.ServerType;
    }

    /**
     * Set Whether to request server resources for the match results. 0: no, 1: request GSE resources
     * @param ServerType Whether to request server resources for the match results. 0: no, 1: request GSE resources
     */
    public void setServerType(Long ServerType) {
        this.ServerType = ServerType;
    }

    /**
     * Get Region of the server queue
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return ServerRegion Region of the server queue
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getServerRegion() {
        return this.ServerRegion;
    }

    /**
     * Set Region of the server queue
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param ServerRegion Region of the server queue
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setServerRegion(String ServerRegion) {
        this.ServerRegion = ServerRegion;
    }

    /**
     * Get Server queue
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return ServerQueue Server queue
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getServerQueue() {
        return this.ServerQueue;
    }

    /**
     * Set Server queue
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param ServerQueue Server queue
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setServerQueue(String ServerQueue) {
        this.ServerQueue = ServerQueue;
    }

    /**
     * Get Custom push data
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return CustomPushData Custom push data
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getCustomPushData() {
        return this.CustomPushData;
    }

    /**
     * Set Custom push data
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param CustomPushData Custom push data
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setCustomPushData(String CustomPushData) {
        this.CustomPushData = CustomPushData;
    }

    /**
     * Get Game server session data
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return ServerSessionData Game server session data
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getServerSessionData() {
        return this.ServerSessionData;
    }

    /**
     * Set Game server session data
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param ServerSessionData Game server session data
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setServerSessionData(String ServerSessionData) {
        this.ServerSessionData = ServerSessionData;
    }

    /**
     * Get Game attributes
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return GameProperties Game attributes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public StringKV [] getGameProperties() {
        return this.GameProperties;
    }

    /**
     * Set Game attributes
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param GameProperties Game attributes
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setGameProperties(StringKV [] GameProperties) {
        this.GameProperties = GameProperties;
    }

    /**
     * Get Enable or disable the log. 0: disable, 1: enable 
     * @return LogSwitch Enable or disable the log. 0: disable, 1: enable
     */
    public Long getLogSwitch() {
        return this.LogSwitch;
    }

    /**
     * Set Enable or disable the log. 0: disable, 1: enable
     * @param LogSwitch Enable or disable the log. 0: disable, 1: enable
     */
    public void setLogSwitch(Long LogSwitch) {
        this.LogSwitch = LogSwitch;
    }

    /**
     * Get Logset ID
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return LogsetId Logset ID
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param LogsetId Logset ID
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Logset name
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return LogsetName Logset name
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set Logset name
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param LogsetName Logset name
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get Log topic ID
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return LogTopicId Log topic ID
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set Log topic ID
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param LogTopicId Log topic ID
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get Log topic name
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return LogTopicName Log topic name
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getLogTopicName() {
        return this.LogTopicName;
    }

    /**
     * Set Log topic name
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param LogTopicName Log topic name
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setLogTopicName(String LogTopicName) {
        this.LogTopicName = LogTopicName;
    }

    /**
     * Get Tag
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Tags Tag
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public StringKV [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Tags Tag
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setTags(StringKV [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Region
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Region Region
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Region Region
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get User AppId
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return AppId User AppId
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set User AppId
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param AppId User AppId
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get User root account UIN
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return Uin User root account UIN
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User root account UIN
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param Uin User root account UIN
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Create user account UIN
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return CreateUin Create user account UIN
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set Create user account UIN
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param CreateUin Create user account UIN
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Rule Name
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return RuleName Rule Name
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule Name
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param RuleName Rule Name
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Log status. 0: normal, 1: the log set does not exist, 2: the log topic does not exist, 3: neither the log set nor the log topic exists.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return LogStatus Log status. 0: normal, 1: the log set does not exist, 2: the log topic does not exist, 3: neither the log set nor the log topic exists.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getLogStatus() {
        return this.LogStatus;
    }

    /**
     * Set Log status. 0: normal, 1: the log set does not exist, 2: the log topic does not exist, 3: neither the log set nor the log topic exists.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param LogStatus Log status. 0: normal, 1: the log set does not exist, 2: the log topic does not exist, 3: neither the log set nor the log topic exists.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setLogStatus(Long LogStatus) {
        this.LogStatus = LogStatus;
    }

    public MatchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MatchInfo(MatchInfo source) {
        if (source.MatchCode != null) {
            this.MatchCode = new String(source.MatchCode);
        }
        if (source.MatchName != null) {
            this.MatchName = new String(source.MatchName);
        }
        if (source.MatchDesc != null) {
            this.MatchDesc = new String(source.MatchDesc);
        }
        if (source.RuleCode != null) {
            this.RuleCode = new String(source.RuleCode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.ServerType != null) {
            this.ServerType = new Long(source.ServerType);
        }
        if (source.ServerRegion != null) {
            this.ServerRegion = new String(source.ServerRegion);
        }
        if (source.ServerQueue != null) {
            this.ServerQueue = new String(source.ServerQueue);
        }
        if (source.CustomPushData != null) {
            this.CustomPushData = new String(source.CustomPushData);
        }
        if (source.ServerSessionData != null) {
            this.ServerSessionData = new String(source.ServerSessionData);
        }
        if (source.GameProperties != null) {
            this.GameProperties = new StringKV[source.GameProperties.length];
            for (int i = 0; i < source.GameProperties.length; i++) {
                this.GameProperties[i] = new StringKV(source.GameProperties[i]);
            }
        }
        if (source.LogSwitch != null) {
            this.LogSwitch = new Long(source.LogSwitch);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
        if (source.LogTopicName != null) {
            this.LogTopicName = new String(source.LogTopicName);
        }
        if (source.Tags != null) {
            this.Tags = new StringKV[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new StringKV(source.Tags[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new String(source.CreateUin);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.LogStatus != null) {
            this.LogStatus = new Long(source.LogStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchCode", this.MatchCode);
        this.setParamSimple(map, prefix + "MatchName", this.MatchName);
        this.setParamSimple(map, prefix + "MatchDesc", this.MatchDesc);
        this.setParamSimple(map, prefix + "RuleCode", this.RuleCode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "ServerType", this.ServerType);
        this.setParamSimple(map, prefix + "ServerRegion", this.ServerRegion);
        this.setParamSimple(map, prefix + "ServerQueue", this.ServerQueue);
        this.setParamSimple(map, prefix + "CustomPushData", this.CustomPushData);
        this.setParamSimple(map, prefix + "ServerSessionData", this.ServerSessionData);
        this.setParamArrayObj(map, prefix + "GameProperties.", this.GameProperties);
        this.setParamSimple(map, prefix + "LogSwitch", this.LogSwitch);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);
        this.setParamSimple(map, prefix + "LogTopicName", this.LogTopicName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "LogStatus", this.LogStatus);

    }
}

