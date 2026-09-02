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

public class DspmAuditSessionInfo extends AbstractModel {

    /**
    * <p>Audit log count.</p>
    */
    @SerializedName("SqlCount")
    @Expose
    private Long SqlCount;

    /**
    * <p>Logout time.</p>
    */
    @SerializedName("LogoutTime")
    @Expose
    private Long LogoutTime;

    /**
    * <p>Client IP</p>
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * <p>Client port</p>
    */
    @SerializedName("ClientPort")
    @Expose
    private Long ClientPort;

    /**
    * <p>Database IP</p>
    */
    @SerializedName("DbIp")
    @Expose
    private String DbIp;

    /**
    * <p>Database name</p>
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * <p>Database port</p>
    */
    @SerializedName("DbPort")
    @Expose
    private Long DbPort;

    /**
    * <p>Database users.</p>
    */
    @SerializedName("DbUser")
    @Expose
    private String DbUser;

    /**
    * <p>Audit unit ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * <p>Operation time.</p>
    */
    @SerializedName("OpTime")
    @Expose
    private Long OpTime;

    /**
    * <p>Status code</p>
    */
    @SerializedName("RetNo")
    @Expose
    private Long RetNo;

    /**
    * <p>Session Id</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Login time.</p>
    */
    @SerializedName("LoginTime")
    @Expose
    private Long LoginTime;

    /**
    * <p>Data asset name.</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Data asset name.</p>
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * <p>Traffic source.</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>Traffic source in English</p>
    */
    @SerializedName("SourceTypeEn")
    @Expose
    private String SourceTypeEn;

    /**
    * <p>app id of the account associated with the asset</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Traffic source.</p>
    */
    @SerializedName("SourceTypeEnDisplayName")
    @Expose
    private String SourceTypeEnDisplayName;

    /**
    * <p>Nickname</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>uid</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>Database type</p><p>Enumeration values:</p><ul><li>MongoDB: mongodb</li></ul>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * <p>Asset type</p><p>Enumeration values:</p><ul><li>cdb: mysql</li><li>mongodb: mongodb</li></ul>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
     * Get <p>Audit log count.</p> 
     * @return SqlCount <p>Audit log count.</p>
     */
    public Long getSqlCount() {
        return this.SqlCount;
    }

    /**
     * Set <p>Audit log count.</p>
     * @param SqlCount <p>Audit log count.</p>
     */
    public void setSqlCount(Long SqlCount) {
        this.SqlCount = SqlCount;
    }

    /**
     * Get <p>Logout time.</p> 
     * @return LogoutTime <p>Logout time.</p>
     */
    public Long getLogoutTime() {
        return this.LogoutTime;
    }

    /**
     * Set <p>Logout time.</p>
     * @param LogoutTime <p>Logout time.</p>
     */
    public void setLogoutTime(Long LogoutTime) {
        this.LogoutTime = LogoutTime;
    }

    /**
     * Get <p>Client IP</p> 
     * @return ClientIp <p>Client IP</p>
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set <p>Client IP</p>
     * @param ClientIp <p>Client IP</p>
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get <p>Client port</p> 
     * @return ClientPort <p>Client port</p>
     */
    public Long getClientPort() {
        return this.ClientPort;
    }

    /**
     * Set <p>Client port</p>
     * @param ClientPort <p>Client port</p>
     */
    public void setClientPort(Long ClientPort) {
        this.ClientPort = ClientPort;
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
     * Get <p>Database name</p> 
     * @return DbName <p>Database name</p>
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set <p>Database name</p>
     * @param DbName <p>Database name</p>
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get <p>Database port</p> 
     * @return DbPort <p>Database port</p>
     */
    public Long getDbPort() {
        return this.DbPort;
    }

    /**
     * Set <p>Database port</p>
     * @param DbPort <p>Database port</p>
     */
    public void setDbPort(Long DbPort) {
        this.DbPort = DbPort;
    }

    /**
     * Get <p>Database users.</p> 
     * @return DbUser <p>Database users.</p>
     */
    public String getDbUser() {
        return this.DbUser;
    }

    /**
     * Set <p>Database users.</p>
     * @param DbUser <p>Database users.</p>
     */
    public void setDbUser(String DbUser) {
        this.DbUser = DbUser;
    }

    /**
     * Get <p>Audit unit ID</p> 
     * @return InstanceId <p>Audit unit ID</p>
     */
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Audit unit ID</p>
     * @param InstanceId <p>Audit unit ID</p>
     */
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Operation time.</p> 
     * @return OpTime <p>Operation time.</p>
     */
    public Long getOpTime() {
        return this.OpTime;
    }

    /**
     * Set <p>Operation time.</p>
     * @param OpTime <p>Operation time.</p>
     */
    public void setOpTime(Long OpTime) {
        this.OpTime = OpTime;
    }

    /**
     * Get <p>Status code</p> 
     * @return RetNo <p>Status code</p>
     */
    public Long getRetNo() {
        return this.RetNo;
    }

    /**
     * Set <p>Status code</p>
     * @param RetNo <p>Status code</p>
     */
    public void setRetNo(Long RetNo) {
        this.RetNo = RetNo;
    }

    /**
     * Get <p>Session Id</p> 
     * @return SessionId <p>Session Id</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Session Id</p>
     * @param SessionId <p>Session Id</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Login time.</p> 
     * @return LoginTime <p>Login time.</p>
     */
    public Long getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set <p>Login time.</p>
     * @param LoginTime <p>Login time.</p>
     */
    public void setLoginTime(Long LoginTime) {
        this.LoginTime = LoginTime;
    }

    /**
     * Get <p>Data asset name.</p> 
     * @return InstanceName <p>Data asset name.</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Data asset name.</p>
     * @param InstanceName <p>Data asset name.</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Data asset name.</p> 
     * @return AssetName <p>Data asset name.</p>
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set <p>Data asset name.</p>
     * @param AssetName <p>Data asset name.</p>
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get <p>Traffic source.</p> 
     * @return SourceType <p>Traffic source.</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>Traffic source.</p>
     * @param SourceType <p>Traffic source.</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>Traffic source in English</p> 
     * @return SourceTypeEn <p>Traffic source in English</p>
     */
    public String getSourceTypeEn() {
        return this.SourceTypeEn;
    }

    /**
     * Set <p>Traffic source in English</p>
     * @param SourceTypeEn <p>Traffic source in English</p>
     */
    public void setSourceTypeEn(String SourceTypeEn) {
        this.SourceTypeEn = SourceTypeEn;
    }

    /**
     * Get <p>app id of the account associated with the asset</p> 
     * @return AppId <p>app id of the account associated with the asset</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>app id of the account associated with the asset</p>
     * @param AppId <p>app id of the account associated with the asset</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Traffic source.</p> 
     * @return SourceTypeEnDisplayName <p>Traffic source.</p>
     */
    public String getSourceTypeEnDisplayName() {
        return this.SourceTypeEnDisplayName;
    }

    /**
     * Set <p>Traffic source.</p>
     * @param SourceTypeEnDisplayName <p>Traffic source.</p>
     */
    public void setSourceTypeEnDisplayName(String SourceTypeEnDisplayName) {
        this.SourceTypeEnDisplayName = SourceTypeEnDisplayName;
    }

    /**
     * Get <p>Nickname</p> 
     * @return NickName <p>Nickname</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>Nickname</p>
     * @param NickName <p>Nickname</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>uid</p> 
     * @return Uin <p>uid</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>uid</p>
     * @param Uin <p>uid</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Database type</p><p>Enumeration values:</p><ul><li>MongoDB: mongodb</li></ul> 
     * @return DbType <p>Database type</p><p>Enumeration values:</p><ul><li>MongoDB: mongodb</li></ul>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set <p>Database type</p><p>Enumeration values:</p><ul><li>MongoDB: mongodb</li></ul>
     * @param DbType <p>Database type</p><p>Enumeration values:</p><ul><li>MongoDB: mongodb</li></ul>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get <p>Asset type</p><p>Enumeration values:</p><ul><li>cdb: mysql</li><li>mongodb: mongodb</li></ul> 
     * @return AssetType <p>Asset type</p><p>Enumeration values:</p><ul><li>cdb: mysql</li><li>mongodb: mongodb</li></ul>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>Asset type</p><p>Enumeration values:</p><ul><li>cdb: mysql</li><li>mongodb: mongodb</li></ul>
     * @param AssetType <p>Asset type</p><p>Enumeration values:</p><ul><li>cdb: mysql</li><li>mongodb: mongodb</li></ul>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    public DspmAuditSessionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAuditSessionInfo(DspmAuditSessionInfo source) {
        if (source.SqlCount != null) {
            this.SqlCount = new Long(source.SqlCount);
        }
        if (source.LogoutTime != null) {
            this.LogoutTime = new Long(source.LogoutTime);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.ClientPort != null) {
            this.ClientPort = new Long(source.ClientPort);
        }
        if (source.DbIp != null) {
            this.DbIp = new String(source.DbIp);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.DbPort != null) {
            this.DbPort = new Long(source.DbPort);
        }
        if (source.DbUser != null) {
            this.DbUser = new String(source.DbUser);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.OpTime != null) {
            this.OpTime = new Long(source.OpTime);
        }
        if (source.RetNo != null) {
            this.RetNo = new Long(source.RetNo);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.LoginTime != null) {
            this.LoginTime = new Long(source.LoginTime);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceTypeEn != null) {
            this.SourceTypeEn = new String(source.SourceTypeEn);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.SourceTypeEnDisplayName != null) {
            this.SourceTypeEnDisplayName = new String(source.SourceTypeEnDisplayName);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SqlCount", this.SqlCount);
        this.setParamSimple(map, prefix + "LogoutTime", this.LogoutTime);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "ClientPort", this.ClientPort);
        this.setParamSimple(map, prefix + "DbIp", this.DbIp);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "DbPort", this.DbPort);
        this.setParamSimple(map, prefix + "DbUser", this.DbUser);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OpTime", this.OpTime);
        this.setParamSimple(map, prefix + "RetNo", this.RetNo);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceTypeEn", this.SourceTypeEn);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "SourceTypeEnDisplayName", this.SourceTypeEnDisplayName);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);

    }
}

