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

public class DescribeDspmSessionListRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Number limit.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Login status</p><p>Enumeration values:</p><ul><li>0: all</li><li>1: successful</li><li>2: failed</li></ul>
    */
    @SerializedName("LoginType")
    @Expose
    private Long LoginType;

    /**
    * <p>Database port</p>
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * <p>Database name</p>
    */
    @SerializedName("DbPort")
    @Expose
    private Long DbPort;

    /**
    * <p>Database IP</p>
    */
    @SerializedName("DbIp")
    @Expose
    private String DbIp;

    /**
    * <p>Asset ID.</p>
    */
    @SerializedName("AssetsId")
    @Expose
    private Long AssetsId;

    /**
    * <p>Conversation ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Client IP</p>
    */
    @SerializedName("ClientSideIp")
    @Expose
    private String ClientSideIp;

    /**
    * <p>Username.</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>End time.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>Start time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>Traffic source. Value: Agent/Proxy/empty. If Agent is passed, agent logs will be returned. If Proxy is passed, proxy logs will be returned. If both or neither is passed, all logs will be returned.</p>
    */
    @SerializedName("SourceTypes")
    @Expose
    private String [] SourceTypes;

    /**
    * <p>[&quot;MySQL&quot;]</p>
    */
    @SerializedName("DbTypes")
    @Expose
    private String [] DbTypes;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Number limit.</p> 
     * @return Limit <p>Number limit.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number limit.</p>
     * @param Limit <p>Number limit.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset.</p> 
     * @return Offset <p>Offset.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset.</p>
     * @param Offset <p>Offset.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Login status</p><p>Enumeration values:</p><ul><li>0: all</li><li>1: successful</li><li>2: failed</li></ul> 
     * @return LoginType <p>Login status</p><p>Enumeration values:</p><ul><li>0: all</li><li>1: successful</li><li>2: failed</li></ul>
     */
    public Long getLoginType() {
        return this.LoginType;
    }

    /**
     * Set <p>Login status</p><p>Enumeration values:</p><ul><li>0: all</li><li>1: successful</li><li>2: failed</li></ul>
     * @param LoginType <p>Login status</p><p>Enumeration values:</p><ul><li>0: all</li><li>1: successful</li><li>2: failed</li></ul>
     */
    public void setLoginType(Long LoginType) {
        this.LoginType = LoginType;
    }

    /**
     * Get <p>Database port</p> 
     * @return DbName <p>Database port</p>
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set <p>Database port</p>
     * @param DbName <p>Database port</p>
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get <p>Database name</p> 
     * @return DbPort <p>Database name</p>
     */
    public Long getDbPort() {
        return this.DbPort;
    }

    /**
     * Set <p>Database name</p>
     * @param DbPort <p>Database name</p>
     */
    public void setDbPort(Long DbPort) {
        this.DbPort = DbPort;
    }

    /**
     * Get <p>Database IP</p> 
     * @return DbIp <p>Database IP</p>
     */
    public String getDbIp() {
        return this.DbIp;
    }

    /**
     * Set <p>Database IP</p>
     * @param DbIp <p>Database IP</p>
     */
    public void setDbIp(String DbIp) {
        this.DbIp = DbIp;
    }

    /**
     * Get <p>Asset ID.</p> 
     * @return AssetsId <p>Asset ID.</p>
     */
    public Long getAssetsId() {
        return this.AssetsId;
    }

    /**
     * Set <p>Asset ID.</p>
     * @param AssetsId <p>Asset ID.</p>
     */
    public void setAssetsId(Long AssetsId) {
        this.AssetsId = AssetsId;
    }

    /**
     * Get <p>Conversation ID</p> 
     * @return SessionId <p>Conversation ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Conversation ID</p>
     * @param SessionId <p>Conversation ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Client IP</p> 
     * @return ClientSideIp <p>Client IP</p>
     */
    public String getClientSideIp() {
        return this.ClientSideIp;
    }

    /**
     * Set <p>Client IP</p>
     * @param ClientSideIp <p>Client IP</p>
     */
    public void setClientSideIp(String ClientSideIp) {
        this.ClientSideIp = ClientSideIp;
    }

    /**
     * Get <p>Username.</p> 
     * @return UserName <p>Username.</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Username.</p>
     * @param UserName <p>Username.</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>End time.</p> 
     * @return EndTime <p>End time.</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End time.</p>
     * @param EndTime <p>End time.</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Start time.</p> 
     * @return StartTime <p>Start time.</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start time.</p>
     * @param StartTime <p>Start time.</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Traffic source. Value: Agent/Proxy/empty. If Agent is passed, agent logs will be returned. If Proxy is passed, proxy logs will be returned. If both or neither is passed, all logs will be returned.</p> 
     * @return SourceTypes <p>Traffic source. Value: Agent/Proxy/empty. If Agent is passed, agent logs will be returned. If Proxy is passed, proxy logs will be returned. If both or neither is passed, all logs will be returned.</p>
     */
    public String [] getSourceTypes() {
        return this.SourceTypes;
    }

    /**
     * Set <p>Traffic source. Value: Agent/Proxy/empty. If Agent is passed, agent logs will be returned. If Proxy is passed, proxy logs will be returned. If both or neither is passed, all logs will be returned.</p>
     * @param SourceTypes <p>Traffic source. Value: Agent/Proxy/empty. If Agent is passed, agent logs will be returned. If Proxy is passed, proxy logs will be returned. If both or neither is passed, all logs will be returned.</p>
     */
    public void setSourceTypes(String [] SourceTypes) {
        this.SourceTypes = SourceTypes;
    }

    /**
     * Get <p>[&quot;MySQL&quot;]</p> 
     * @return DbTypes <p>[&quot;MySQL&quot;]</p>
     */
    public String [] getDbTypes() {
        return this.DbTypes;
    }

    /**
     * Set <p>[&quot;MySQL&quot;]</p>
     * @param DbTypes <p>[&quot;MySQL&quot;]</p>
     */
    public void setDbTypes(String [] DbTypes) {
        this.DbTypes = DbTypes;
    }

    public DescribeDspmSessionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmSessionListRequest(DescribeDspmSessionListRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.LoginType != null) {
            this.LoginType = new Long(source.LoginType);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.DbPort != null) {
            this.DbPort = new Long(source.DbPort);
        }
        if (source.DbIp != null) {
            this.DbIp = new String(source.DbIp);
        }
        if (source.AssetsId != null) {
            this.AssetsId = new Long(source.AssetsId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.ClientSideIp != null) {
            this.ClientSideIp = new String(source.ClientSideIp);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.SourceTypes != null) {
            this.SourceTypes = new String[source.SourceTypes.length];
            for (int i = 0; i < source.SourceTypes.length; i++) {
                this.SourceTypes[i] = new String(source.SourceTypes[i]);
            }
        }
        if (source.DbTypes != null) {
            this.DbTypes = new String[source.DbTypes.length];
            for (int i = 0; i < source.DbTypes.length; i++) {
                this.DbTypes[i] = new String(source.DbTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "LoginType", this.LoginType);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "DbPort", this.DbPort);
        this.setParamSimple(map, prefix + "DbIp", this.DbIp);
        this.setParamSimple(map, prefix + "AssetsId", this.AssetsId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ClientSideIp", this.ClientSideIp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArraySimple(map, prefix + "SourceTypes.", this.SourceTypes);
        this.setParamArraySimple(map, prefix + "DbTypes.", this.DbTypes);

    }
}

