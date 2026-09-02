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

public class CreateDspmExportTaskRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Risk level (0-Safe, 1-Low risk, 2-Medium-risk, 3-High-risk, -1-All)</p>
    */
    @SerializedName("DangerLevel")
    @Expose
    private Long DangerLevel;

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
    * <p>Session ID</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>Client IP address</p>
    */
    @SerializedName("ClientSideIp")
    @Expose
    private String ClientSideIp;

    /**
    * <p>End time.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>Hit rule.</p>
    */
    @SerializedName("HitRule")
    @Expose
    private Long HitRule;

    /**
    * <p>Start time.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>Fuzzy query</p>
    */
    @SerializedName("FuzzySearch")
    @Expose
    private String FuzzySearch;

    /**
    * <p>Username.</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Client</p>
    */
    @SerializedName("ClientName")
    @Expose
    private String ClientName;

    /**
    * <p>Traffic source. Parameter value: Agent/Proxy/empty. If Agent is passed, agent logs will be returned. If Proxy is passed, proxy logs will be returned. If both or neither are passed, return all.</p>
    */
    @SerializedName("SourceTypes")
    @Expose
    private String [] SourceTypes;

    /**
    * <p>Table name, length limited to 64. For multiple table name queries, use space-separated.</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>Field name, length limited to 64. For multiple field name queries, use space-separated.</p>
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * <p>Main SQL types: DDL, DML, DCL, TCL</p>
    */
    @SerializedName("SqlMainTypes")
    @Expose
    private String [] SqlMainTypes;

    /**
    * <p>Operation type</p>
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * <p>Minimum number of affected rows</p>
    */
    @SerializedName("RowNumMin")
    @Expose
    private Long RowNumMin;

    /**
    * <p>Maximum number of affected rows</p>
    */
    @SerializedName("RowNumMax")
    @Expose
    private Long RowNumMax;

    /**
    * <p>Database type</p>
    */
    @SerializedName("DbTypes")
    @Expose
    private String [] DbTypes;

    /**
    * <p>Response code</p>
    */
    @SerializedName("RetNo")
    @Expose
    private Long RetNo;

    /**
    * <p>Client tool</p>
    */
    @SerializedName("ClientDriverName")
    @Expose
    private String ClientDriverName;

    /**
    * <p>Client port</p>
    */
    @SerializedName("ClientPort")
    @Expose
    private Long ClientPort;

    /**
    * <p>Audit log ID.</p>
    */
    @SerializedName("LogId")
    @Expose
    private String LogId;

    /**
    * <p>Risk level array (0-secure, 1-low risk, 2-medium-risk, 3-high-risk). To select all, import all values. If empty, see the DangerLevel input parameter.</p>
    */
    @SerializedName("DangerLevels")
    @Expose
    private Long [] DangerLevels;

    /**
    * <p>Field classification</p>
    */
    @SerializedName("SensitiveCategoryRule")
    @Expose
    private String SensitiveCategoryRule;

    /**
    * <p>Field classification</p>
    */
    @SerializedName("SensitiveLevelRisk")
    @Expose
    private String SensitiveLevelRisk;

    /**
    * <p>Transaction Id.</p>
    */
    @SerializedName("TrxId")
    @Expose
    private Long TrxId;

    /**
    * <p>clientMac</p>
    */
    @SerializedName("ClientMac")
    @Expose
    private String ClientMac;

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
     * Get <p>Risk level (0-Safe, 1-Low risk, 2-Medium-risk, 3-High-risk, -1-All)</p> 
     * @return DangerLevel <p>Risk level (0-Safe, 1-Low risk, 2-Medium-risk, 3-High-risk, -1-All)</p>
     */
    public Long getDangerLevel() {
        return this.DangerLevel;
    }

    /**
     * Set <p>Risk level (0-Safe, 1-Low risk, 2-Medium-risk, 3-High-risk, -1-All)</p>
     * @param DangerLevel <p>Risk level (0-Safe, 1-Low risk, 2-Medium-risk, 3-High-risk, -1-All)</p>
     */
    public void setDangerLevel(Long DangerLevel) {
        this.DangerLevel = DangerLevel;
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
     * Get <p>Session ID</p> 
     * @return SessionId <p>Session ID</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>Session ID</p>
     * @param SessionId <p>Session ID</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>Client IP address</p> 
     * @return ClientSideIp <p>Client IP address</p>
     */
    public String getClientSideIp() {
        return this.ClientSideIp;
    }

    /**
     * Set <p>Client IP address</p>
     * @param ClientSideIp <p>Client IP address</p>
     */
    public void setClientSideIp(String ClientSideIp) {
        this.ClientSideIp = ClientSideIp;
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
     * Get <p>Hit rule.</p> 
     * @return HitRule <p>Hit rule.</p>
     */
    public Long getHitRule() {
        return this.HitRule;
    }

    /**
     * Set <p>Hit rule.</p>
     * @param HitRule <p>Hit rule.</p>
     */
    public void setHitRule(Long HitRule) {
        this.HitRule = HitRule;
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
     * Get <p>Fuzzy query</p> 
     * @return FuzzySearch <p>Fuzzy query</p>
     */
    public String getFuzzySearch() {
        return this.FuzzySearch;
    }

    /**
     * Set <p>Fuzzy query</p>
     * @param FuzzySearch <p>Fuzzy query</p>
     */
    public void setFuzzySearch(String FuzzySearch) {
        this.FuzzySearch = FuzzySearch;
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
     * Get <p>Client</p> 
     * @return ClientName <p>Client</p>
     */
    public String getClientName() {
        return this.ClientName;
    }

    /**
     * Set <p>Client</p>
     * @param ClientName <p>Client</p>
     */
    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    /**
     * Get <p>Traffic source. Parameter value: Agent/Proxy/empty. If Agent is passed, agent logs will be returned. If Proxy is passed, proxy logs will be returned. If both or neither are passed, return all.</p> 
     * @return SourceTypes <p>Traffic source. Parameter value: Agent/Proxy/empty. If Agent is passed, agent logs will be returned. If Proxy is passed, proxy logs will be returned. If both or neither are passed, return all.</p>
     */
    public String [] getSourceTypes() {
        return this.SourceTypes;
    }

    /**
     * Set <p>Traffic source. Parameter value: Agent/Proxy/empty. If Agent is passed, agent logs will be returned. If Proxy is passed, proxy logs will be returned. If both or neither are passed, return all.</p>
     * @param SourceTypes <p>Traffic source. Parameter value: Agent/Proxy/empty. If Agent is passed, agent logs will be returned. If Proxy is passed, proxy logs will be returned. If both or neither are passed, return all.</p>
     */
    public void setSourceTypes(String [] SourceTypes) {
        this.SourceTypes = SourceTypes;
    }

    /**
     * Get <p>Table name, length limited to 64. For multiple table name queries, use space-separated.</p> 
     * @return TableName <p>Table name, length limited to 64. For multiple table name queries, use space-separated.</p>
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>Table name, length limited to 64. For multiple table name queries, use space-separated.</p>
     * @param TableName <p>Table name, length limited to 64. For multiple table name queries, use space-separated.</p>
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>Field name, length limited to 64. For multiple field name queries, use space-separated.</p> 
     * @return FieldName <p>Field name, length limited to 64. For multiple field name queries, use space-separated.</p>
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set <p>Field name, length limited to 64. For multiple field name queries, use space-separated.</p>
     * @param FieldName <p>Field name, length limited to 64. For multiple field name queries, use space-separated.</p>
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get <p>Main SQL types: DDL, DML, DCL, TCL</p> 
     * @return SqlMainTypes <p>Main SQL types: DDL, DML, DCL, TCL</p>
     */
    public String [] getSqlMainTypes() {
        return this.SqlMainTypes;
    }

    /**
     * Set <p>Main SQL types: DDL, DML, DCL, TCL</p>
     * @param SqlMainTypes <p>Main SQL types: DDL, DML, DCL, TCL</p>
     */
    public void setSqlMainTypes(String [] SqlMainTypes) {
        this.SqlMainTypes = SqlMainTypes;
    }

    /**
     * Get <p>Operation type</p> 
     * @return SqlType <p>Operation type</p>
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set <p>Operation type</p>
     * @param SqlType <p>Operation type</p>
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get <p>Minimum number of affected rows</p> 
     * @return RowNumMin <p>Minimum number of affected rows</p>
     */
    public Long getRowNumMin() {
        return this.RowNumMin;
    }

    /**
     * Set <p>Minimum number of affected rows</p>
     * @param RowNumMin <p>Minimum number of affected rows</p>
     */
    public void setRowNumMin(Long RowNumMin) {
        this.RowNumMin = RowNumMin;
    }

    /**
     * Get <p>Maximum number of affected rows</p> 
     * @return RowNumMax <p>Maximum number of affected rows</p>
     */
    public Long getRowNumMax() {
        return this.RowNumMax;
    }

    /**
     * Set <p>Maximum number of affected rows</p>
     * @param RowNumMax <p>Maximum number of affected rows</p>
     */
    public void setRowNumMax(Long RowNumMax) {
        this.RowNumMax = RowNumMax;
    }

    /**
     * Get <p>Database type</p> 
     * @return DbTypes <p>Database type</p>
     */
    public String [] getDbTypes() {
        return this.DbTypes;
    }

    /**
     * Set <p>Database type</p>
     * @param DbTypes <p>Database type</p>
     */
    public void setDbTypes(String [] DbTypes) {
        this.DbTypes = DbTypes;
    }

    /**
     * Get <p>Response code</p> 
     * @return RetNo <p>Response code</p>
     */
    public Long getRetNo() {
        return this.RetNo;
    }

    /**
     * Set <p>Response code</p>
     * @param RetNo <p>Response code</p>
     */
    public void setRetNo(Long RetNo) {
        this.RetNo = RetNo;
    }

    /**
     * Get <p>Client tool</p> 
     * @return ClientDriverName <p>Client tool</p>
     */
    public String getClientDriverName() {
        return this.ClientDriverName;
    }

    /**
     * Set <p>Client tool</p>
     * @param ClientDriverName <p>Client tool</p>
     */
    public void setClientDriverName(String ClientDriverName) {
        this.ClientDriverName = ClientDriverName;
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
     * Get <p>Audit log ID.</p> 
     * @return LogId <p>Audit log ID.</p>
     */
    public String getLogId() {
        return this.LogId;
    }

    /**
     * Set <p>Audit log ID.</p>
     * @param LogId <p>Audit log ID.</p>
     */
    public void setLogId(String LogId) {
        this.LogId = LogId;
    }

    /**
     * Get <p>Risk level array (0-secure, 1-low risk, 2-medium-risk, 3-high-risk). To select all, import all values. If empty, see the DangerLevel input parameter.</p> 
     * @return DangerLevels <p>Risk level array (0-secure, 1-low risk, 2-medium-risk, 3-high-risk). To select all, import all values. If empty, see the DangerLevel input parameter.</p>
     */
    public Long [] getDangerLevels() {
        return this.DangerLevels;
    }

    /**
     * Set <p>Risk level array (0-secure, 1-low risk, 2-medium-risk, 3-high-risk). To select all, import all values. If empty, see the DangerLevel input parameter.</p>
     * @param DangerLevels <p>Risk level array (0-secure, 1-low risk, 2-medium-risk, 3-high-risk). To select all, import all values. If empty, see the DangerLevel input parameter.</p>
     */
    public void setDangerLevels(Long [] DangerLevels) {
        this.DangerLevels = DangerLevels;
    }

    /**
     * Get <p>Field classification</p> 
     * @return SensitiveCategoryRule <p>Field classification</p>
     */
    public String getSensitiveCategoryRule() {
        return this.SensitiveCategoryRule;
    }

    /**
     * Set <p>Field classification</p>
     * @param SensitiveCategoryRule <p>Field classification</p>
     */
    public void setSensitiveCategoryRule(String SensitiveCategoryRule) {
        this.SensitiveCategoryRule = SensitiveCategoryRule;
    }

    /**
     * Get <p>Field classification</p> 
     * @return SensitiveLevelRisk <p>Field classification</p>
     */
    public String getSensitiveLevelRisk() {
        return this.SensitiveLevelRisk;
    }

    /**
     * Set <p>Field classification</p>
     * @param SensitiveLevelRisk <p>Field classification</p>
     */
    public void setSensitiveLevelRisk(String SensitiveLevelRisk) {
        this.SensitiveLevelRisk = SensitiveLevelRisk;
    }

    /**
     * Get <p>Transaction Id.</p> 
     * @return TrxId <p>Transaction Id.</p>
     */
    public Long getTrxId() {
        return this.TrxId;
    }

    /**
     * Set <p>Transaction Id.</p>
     * @param TrxId <p>Transaction Id.</p>
     */
    public void setTrxId(Long TrxId) {
        this.TrxId = TrxId;
    }

    /**
     * Get <p>clientMac</p> 
     * @return ClientMac <p>clientMac</p>
     */
    public String getClientMac() {
        return this.ClientMac;
    }

    /**
     * Set <p>clientMac</p>
     * @param ClientMac <p>clientMac</p>
     */
    public void setClientMac(String ClientMac) {
        this.ClientMac = ClientMac;
    }

    public CreateDspmExportTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDspmExportTaskRequest(CreateDspmExportTaskRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.DangerLevel != null) {
            this.DangerLevel = new Long(source.DangerLevel);
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
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.HitRule != null) {
            this.HitRule = new Long(source.HitRule);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.FuzzySearch != null) {
            this.FuzzySearch = new String(source.FuzzySearch);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.ClientName != null) {
            this.ClientName = new String(source.ClientName);
        }
        if (source.SourceTypes != null) {
            this.SourceTypes = new String[source.SourceTypes.length];
            for (int i = 0; i < source.SourceTypes.length; i++) {
                this.SourceTypes[i] = new String(source.SourceTypes[i]);
            }
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.SqlMainTypes != null) {
            this.SqlMainTypes = new String[source.SqlMainTypes.length];
            for (int i = 0; i < source.SqlMainTypes.length; i++) {
                this.SqlMainTypes[i] = new String(source.SqlMainTypes[i]);
            }
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.RowNumMin != null) {
            this.RowNumMin = new Long(source.RowNumMin);
        }
        if (source.RowNumMax != null) {
            this.RowNumMax = new Long(source.RowNumMax);
        }
        if (source.DbTypes != null) {
            this.DbTypes = new String[source.DbTypes.length];
            for (int i = 0; i < source.DbTypes.length; i++) {
                this.DbTypes[i] = new String(source.DbTypes[i]);
            }
        }
        if (source.RetNo != null) {
            this.RetNo = new Long(source.RetNo);
        }
        if (source.ClientDriverName != null) {
            this.ClientDriverName = new String(source.ClientDriverName);
        }
        if (source.ClientPort != null) {
            this.ClientPort = new Long(source.ClientPort);
        }
        if (source.LogId != null) {
            this.LogId = new String(source.LogId);
        }
        if (source.DangerLevels != null) {
            this.DangerLevels = new Long[source.DangerLevels.length];
            for (int i = 0; i < source.DangerLevels.length; i++) {
                this.DangerLevels[i] = new Long(source.DangerLevels[i]);
            }
        }
        if (source.SensitiveCategoryRule != null) {
            this.SensitiveCategoryRule = new String(source.SensitiveCategoryRule);
        }
        if (source.SensitiveLevelRisk != null) {
            this.SensitiveLevelRisk = new String(source.SensitiveLevelRisk);
        }
        if (source.TrxId != null) {
            this.TrxId = new Long(source.TrxId);
        }
        if (source.ClientMac != null) {
            this.ClientMac = new String(source.ClientMac);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "DangerLevel", this.DangerLevel);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "DbPort", this.DbPort);
        this.setParamSimple(map, prefix + "DbIp", this.DbIp);
        this.setParamSimple(map, prefix + "AssetsId", this.AssetsId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "ClientSideIp", this.ClientSideIp);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "HitRule", this.HitRule);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FuzzySearch", this.FuzzySearch);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "ClientName", this.ClientName);
        this.setParamArraySimple(map, prefix + "SourceTypes.", this.SourceTypes);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamArraySimple(map, prefix + "SqlMainTypes.", this.SqlMainTypes);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "RowNumMin", this.RowNumMin);
        this.setParamSimple(map, prefix + "RowNumMax", this.RowNumMax);
        this.setParamArraySimple(map, prefix + "DbTypes.", this.DbTypes);
        this.setParamSimple(map, prefix + "RetNo", this.RetNo);
        this.setParamSimple(map, prefix + "ClientDriverName", this.ClientDriverName);
        this.setParamSimple(map, prefix + "ClientPort", this.ClientPort);
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamArraySimple(map, prefix + "DangerLevels.", this.DangerLevels);
        this.setParamSimple(map, prefix + "SensitiveCategoryRule", this.SensitiveCategoryRule);
        this.setParamSimple(map, prefix + "SensitiveLevelRisk", this.SensitiveLevelRisk);
        this.setParamSimple(map, prefix + "TrxId", this.TrxId);
        this.setParamSimple(map, prefix + "ClientMac", this.ClientMac);

    }
}

