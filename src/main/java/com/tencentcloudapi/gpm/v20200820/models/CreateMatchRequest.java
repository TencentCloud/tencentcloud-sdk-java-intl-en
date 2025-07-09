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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMatchRequest extends AbstractModel {

    /**
    * Match name. It can contain up to 128 bytes, supporting [a-zA-Z0-9-\.]*.
    */
    @SerializedName("MatchName")
    @Expose
    private String MatchName;

    /**
    * RuleCode
    */
    @SerializedName("RuleCode")
    @Expose
    private String RuleCode;

    /**
    * Timeout period in seconds. Value range: 1 600
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Whether to request server resources for the matchmaking results. 0: no, 1: request GSE resources
    */
    @SerializedName("ServerType")
    @Expose
    private Long ServerType;

    /**
    * Matchmaking description. Up to 1024 bytes are allowed.
    */
    @SerializedName("MatchDesc")
    @Expose
    private String MatchDesc;

    /**
    * Only HTTP and HTTPS protocols are supported.
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * Region of the game server queue
    */
    @SerializedName("ServerRegion")
    @Expose
    private String ServerRegion;

    /**
    * Game server queue
    */
    @SerializedName("ServerQueue")
    @Expose
    private String ServerQueue;

    /**
    * Custom push data
    */
    @SerializedName("CustomPushData")
    @Expose
    private String CustomPushData;

    /**
    * Game server session data
    */
    @SerializedName("ServerSessionData")
    @Expose
    private String ServerSessionData;

    /**
    * Game attribute. It is an array of key-value structure.
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
    * Tag. It is an array of key-value structure.
    */
    @SerializedName("Tags")
    @Expose
    private StringKV [] Tags;

    /**
     * Get Match name. It can contain up to 128 bytes, supporting [a-zA-Z0-9-\.]*. 
     * @return MatchName Match name. It can contain up to 128 bytes, supporting [a-zA-Z0-9-\.]*.
     */
    public String getMatchName() {
        return this.MatchName;
    }

    /**
     * Set Match name. It can contain up to 128 bytes, supporting [a-zA-Z0-9-\.]*.
     * @param MatchName Match name. It can contain up to 128 bytes, supporting [a-zA-Z0-9-\.]*.
     */
    public void setMatchName(String MatchName) {
        this.MatchName = MatchName;
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
     * Get Timeout period in seconds. Value range: 1 600 
     * @return Timeout Timeout period in seconds. Value range: 1 600
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Timeout period in seconds. Value range: 1 600
     * @param Timeout Timeout period in seconds. Value range: 1 600
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Whether to request server resources for the matchmaking results. 0: no, 1: request GSE resources 
     * @return ServerType Whether to request server resources for the matchmaking results. 0: no, 1: request GSE resources
     */
    public Long getServerType() {
        return this.ServerType;
    }

    /**
     * Set Whether to request server resources for the matchmaking results. 0: no, 1: request GSE resources
     * @param ServerType Whether to request server resources for the matchmaking results. 0: no, 1: request GSE resources
     */
    public void setServerType(Long ServerType) {
        this.ServerType = ServerType;
    }

    /**
     * Get Matchmaking description. Up to 1024 bytes are allowed. 
     * @return MatchDesc Matchmaking description. Up to 1024 bytes are allowed.
     */
    public String getMatchDesc() {
        return this.MatchDesc;
    }

    /**
     * Set Matchmaking description. Up to 1024 bytes are allowed.
     * @param MatchDesc Matchmaking description. Up to 1024 bytes are allowed.
     */
    public void setMatchDesc(String MatchDesc) {
        this.MatchDesc = MatchDesc;
    }

    /**
     * Get Only HTTP and HTTPS protocols are supported. 
     * @return NotifyUrl Only HTTP and HTTPS protocols are supported.
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set Only HTTP and HTTPS protocols are supported.
     * @param NotifyUrl Only HTTP and HTTPS protocols are supported.
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get Region of the game server queue 
     * @return ServerRegion Region of the game server queue
     */
    public String getServerRegion() {
        return this.ServerRegion;
    }

    /**
     * Set Region of the game server queue
     * @param ServerRegion Region of the game server queue
     */
    public void setServerRegion(String ServerRegion) {
        this.ServerRegion = ServerRegion;
    }

    /**
     * Get Game server queue 
     * @return ServerQueue Game server queue
     */
    public String getServerQueue() {
        return this.ServerQueue;
    }

    /**
     * Set Game server queue
     * @param ServerQueue Game server queue
     */
    public void setServerQueue(String ServerQueue) {
        this.ServerQueue = ServerQueue;
    }

    /**
     * Get Custom push data 
     * @return CustomPushData Custom push data
     */
    public String getCustomPushData() {
        return this.CustomPushData;
    }

    /**
     * Set Custom push data
     * @param CustomPushData Custom push data
     */
    public void setCustomPushData(String CustomPushData) {
        this.CustomPushData = CustomPushData;
    }

    /**
     * Get Game server session data 
     * @return ServerSessionData Game server session data
     */
    public String getServerSessionData() {
        return this.ServerSessionData;
    }

    /**
     * Set Game server session data
     * @param ServerSessionData Game server session data
     */
    public void setServerSessionData(String ServerSessionData) {
        this.ServerSessionData = ServerSessionData;
    }

    /**
     * Get Game attribute. It is an array of key-value structure. 
     * @return GameProperties Game attribute. It is an array of key-value structure.
     */
    public StringKV [] getGameProperties() {
        return this.GameProperties;
    }

    /**
     * Set Game attribute. It is an array of key-value structure.
     * @param GameProperties Game attribute. It is an array of key-value structure.
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
     * Get Tag. It is an array of key-value structure. 
     * @return Tags Tag. It is an array of key-value structure.
     */
    public StringKV [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag. It is an array of key-value structure.
     * @param Tags Tag. It is an array of key-value structure.
     */
    public void setTags(StringKV [] Tags) {
        this.Tags = Tags;
    }

    public CreateMatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMatchRequest(CreateMatchRequest source) {
        if (source.MatchName != null) {
            this.MatchName = new String(source.MatchName);
        }
        if (source.RuleCode != null) {
            this.RuleCode = new String(source.RuleCode);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.ServerType != null) {
            this.ServerType = new Long(source.ServerType);
        }
        if (source.MatchDesc != null) {
            this.MatchDesc = new String(source.MatchDesc);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
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
        if (source.Tags != null) {
            this.Tags = new StringKV[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new StringKV(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchName", this.MatchName);
        this.setParamSimple(map, prefix + "RuleCode", this.RuleCode);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "ServerType", this.ServerType);
        this.setParamSimple(map, prefix + "MatchDesc", this.MatchDesc);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "ServerRegion", this.ServerRegion);
        this.setParamSimple(map, prefix + "ServerQueue", this.ServerQueue);
        this.setParamSimple(map, prefix + "CustomPushData", this.CustomPushData);
        this.setParamSimple(map, prefix + "ServerSessionData", this.ServerSessionData);
        this.setParamArrayObj(map, prefix + "GameProperties.", this.GameProperties);
        this.setParamSimple(map, prefix + "LogSwitch", this.LogSwitch);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

