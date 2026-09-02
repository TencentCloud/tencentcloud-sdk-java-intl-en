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

public class AuditLogInfo extends AbstractModel {

    /**
    * AI score.
    */
    @SerializedName("AiScore")
    @Expose
    private Float AiScore;

    /**
    * Application user.
    */
    @SerializedName("AppUser")
    @Expose
    private String AppUser;

    /**
    * Backup data package.
    */
    @SerializedName("BackPacket")
    @Expose
    private String BackPacket;

    /**
    * Client IP
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * Client Mac.
    */
    @SerializedName("ClientMac")
    @Expose
    private String ClientMac;

    /**
    * Terminal name. When the value is Proxy, it indicates CASB proxy traffic. Otherwise, it indicates agent traffic.
    */
    @SerializedName("ClientName")
    @Expose
    private String ClientName;

    /**
    * Client user.
    */
    @SerializedName("ClientUser")
    @Expose
    private String ClientUser;

    /**
    * Client port
    */
    @SerializedName("ClientPort")
    @Expose
    private Long ClientPort;

    /**
    * Risk level
    */
    @SerializedName("DangerLevel")
    @Expose
    private Long DangerLevel;

    /**
    * Database IP.
    */
    @SerializedName("DbIp")
    @Expose
    private String DbIp;

    /**
    * Database name.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Database port.
    */
    @SerializedName("DbPort")
    @Expose
    private Long DbPort;

    /**
    * Database user
    */
    @SerializedName("DbUser")
    @Expose
    private String DbUser;

    /**
    * Number of affected rows
    */
    @SerializedName("EffectRow")
    @Expose
    private Long EffectRow;

    /**
    * Execution time, unit: ms
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * Matched rule
    */
    @SerializedName("HitRule")
    @Expose
    private String HitRule;

    /**
    * Log ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Data asset name
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * Audit unit name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Operational statement (SQL statement).
    */
    @SerializedName("OpSql")
    @Expose
    private String OpSql;

    /**
    * Operation time (time).
    */
    @SerializedName("OpTime")
    @Expose
    private Long OpTime;

    /**
    * message
    */
    @SerializedName("RetMsg")
    @Expose
    private String RetMsg;

    /**
    * code
    */
    @SerializedName("RetNo")
    @Expose
    private Long RetNo;

    /**
    * Session ID
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Operation type.
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * Table name
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Data asset name
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Rule set.
    */
    @SerializedName("HitRules")
    @Expose
    private HitRules [] HitRules;

    /**
    * Traffic source
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * Single audit log ID.
    */
    @SerializedName("ReqId")
    @Expose
    private String ReqId;

    /**
    * Main SQL types: DML, DDL, DCL, and TCL.
    */
    @SerializedName("SqlMainType")
    @Expose
    private String SqlMainType;

    /**
    * Table name collection.
    */
    @SerializedName("TableNames")
    @Expose
    private String [] TableNames;

    /**
    * Field name collection
    */
    @SerializedName("FieldNames")
    @Expose
    private String [] FieldNames;

    /**
    * Field name
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * Database type
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * Client tool.
    */
    @SerializedName("ClientDriverName")
    @Expose
    private String ClientDriverName;

    /**
    * Location information
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
    * Field information (contains sensitive information).
    */
    @SerializedName("FieldDetails")
    @Expose
    private TableField [] FieldDetails;

    /**
    * app id of the account that owns the asset
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Account nickname
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Account uin of the asset owner
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get AI score. 
     * @return AiScore AI score.
     */
    public Float getAiScore() {
        return this.AiScore;
    }

    /**
     * Set AI score.
     * @param AiScore AI score.
     */
    public void setAiScore(Float AiScore) {
        this.AiScore = AiScore;
    }

    /**
     * Get Application user. 
     * @return AppUser Application user.
     */
    public String getAppUser() {
        return this.AppUser;
    }

    /**
     * Set Application user.
     * @param AppUser Application user.
     */
    public void setAppUser(String AppUser) {
        this.AppUser = AppUser;
    }

    /**
     * Get Backup data package. 
     * @return BackPacket Backup data package.
     */
    public String getBackPacket() {
        return this.BackPacket;
    }

    /**
     * Set Backup data package.
     * @param BackPacket Backup data package.
     */
    public void setBackPacket(String BackPacket) {
        this.BackPacket = BackPacket;
    }

    /**
     * Get Client IP 
     * @return ClientIp Client IP
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set Client IP
     * @param ClientIp Client IP
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get Client Mac. 
     * @return ClientMac Client Mac.
     */
    public String getClientMac() {
        return this.ClientMac;
    }

    /**
     * Set Client Mac.
     * @param ClientMac Client Mac.
     */
    public void setClientMac(String ClientMac) {
        this.ClientMac = ClientMac;
    }

    /**
     * Get Terminal name. When the value is Proxy, it indicates CASB proxy traffic. Otherwise, it indicates agent traffic. 
     * @return ClientName Terminal name. When the value is Proxy, it indicates CASB proxy traffic. Otherwise, it indicates agent traffic.
     */
    public String getClientName() {
        return this.ClientName;
    }

    /**
     * Set Terminal name. When the value is Proxy, it indicates CASB proxy traffic. Otherwise, it indicates agent traffic.
     * @param ClientName Terminal name. When the value is Proxy, it indicates CASB proxy traffic. Otherwise, it indicates agent traffic.
     */
    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    /**
     * Get Client user. 
     * @return ClientUser Client user.
     */
    public String getClientUser() {
        return this.ClientUser;
    }

    /**
     * Set Client user.
     * @param ClientUser Client user.
     */
    public void setClientUser(String ClientUser) {
        this.ClientUser = ClientUser;
    }

    /**
     * Get Client port 
     * @return ClientPort Client port
     */
    public Long getClientPort() {
        return this.ClientPort;
    }

    /**
     * Set Client port
     * @param ClientPort Client port
     */
    public void setClientPort(Long ClientPort) {
        this.ClientPort = ClientPort;
    }

    /**
     * Get Risk level 
     * @return DangerLevel Risk level
     */
    public Long getDangerLevel() {
        return this.DangerLevel;
    }

    /**
     * Set Risk level
     * @param DangerLevel Risk level
     */
    public void setDangerLevel(Long DangerLevel) {
        this.DangerLevel = DangerLevel;
    }

    /**
     * Get Database IP. 
     * @return DbIp Database IP.
     */
    public String getDbIp() {
        return this.DbIp;
    }

    /**
     * Set Database IP.
     * @param DbIp Database IP.
     */
    public void setDbIp(String DbIp) {
        this.DbIp = DbIp;
    }

    /**
     * Get Database name. 
     * @return DbName Database name.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name.
     * @param DbName Database name.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Database port. 
     * @return DbPort Database port.
     */
    public Long getDbPort() {
        return this.DbPort;
    }

    /**
     * Set Database port.
     * @param DbPort Database port.
     */
    public void setDbPort(Long DbPort) {
        this.DbPort = DbPort;
    }

    /**
     * Get Database user 
     * @return DbUser Database user
     */
    public String getDbUser() {
        return this.DbUser;
    }

    /**
     * Set Database user
     * @param DbUser Database user
     */
    public void setDbUser(String DbUser) {
        this.DbUser = DbUser;
    }

    /**
     * Get Number of affected rows 
     * @return EffectRow Number of affected rows
     */
    public Long getEffectRow() {
        return this.EffectRow;
    }

    /**
     * Set Number of affected rows
     * @param EffectRow Number of affected rows
     */
    public void setEffectRow(Long EffectRow) {
        this.EffectRow = EffectRow;
    }

    /**
     * Get Execution time, unit: ms 
     * @return ExecTime Execution time, unit: ms
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set Execution time, unit: ms
     * @param ExecTime Execution time, unit: ms
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get Matched rule 
     * @return HitRule Matched rule
     */
    public String getHitRule() {
        return this.HitRule;
    }

    /**
     * Set Matched rule
     * @param HitRule Matched rule
     */
    public void setHitRule(String HitRule) {
        this.HitRule = HitRule;
    }

    /**
     * Get Log ID 
     * @return Id Log ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Log ID
     * @param Id Log ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Data asset name 
     * @return InstanceId Data asset name
     */
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Data asset name
     * @param InstanceId Data asset name
     */
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Audit unit name. 
     * @return InstanceName Audit unit name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Audit unit name.
     * @param InstanceName Audit unit name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Operational statement (SQL statement). 
     * @return OpSql Operational statement (SQL statement).
     */
    public String getOpSql() {
        return this.OpSql;
    }

    /**
     * Set Operational statement (SQL statement).
     * @param OpSql Operational statement (SQL statement).
     */
    public void setOpSql(String OpSql) {
        this.OpSql = OpSql;
    }

    /**
     * Get Operation time (time). 
     * @return OpTime Operation time (time).
     */
    public Long getOpTime() {
        return this.OpTime;
    }

    /**
     * Set Operation time (time).
     * @param OpTime Operation time (time).
     */
    public void setOpTime(Long OpTime) {
        this.OpTime = OpTime;
    }

    /**
     * Get message 
     * @return RetMsg message
     */
    public String getRetMsg() {
        return this.RetMsg;
    }

    /**
     * Set message
     * @param RetMsg message
     */
    public void setRetMsg(String RetMsg) {
        this.RetMsg = RetMsg;
    }

    /**
     * Get code 
     * @return RetNo code
     */
    public Long getRetNo() {
        return this.RetNo;
    }

    /**
     * Set code
     * @param RetNo code
     */
    public void setRetNo(Long RetNo) {
        this.RetNo = RetNo;
    }

    /**
     * Get Session ID 
     * @return SessionId Session ID
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session ID
     * @param SessionId Session ID
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Operation type. 
     * @return SqlType Operation type.
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set Operation type.
     * @param SqlType Operation type.
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get Table name 
     * @return TableName Table name
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
     * @param TableName Table name
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Data asset name 
     * @return AssetName Data asset name
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Data asset name
     * @param AssetName Data asset name
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Rule set. 
     * @return HitRules Rule set.
     */
    public HitRules [] getHitRules() {
        return this.HitRules;
    }

    /**
     * Set Rule set.
     * @param HitRules Rule set.
     */
    public void setHitRules(HitRules [] HitRules) {
        this.HitRules = HitRules;
    }

    /**
     * Get Traffic source 
     * @return SourceType Traffic source
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Traffic source
     * @param SourceType Traffic source
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Single audit log ID. 
     * @return ReqId Single audit log ID.
     */
    public String getReqId() {
        return this.ReqId;
    }

    /**
     * Set Single audit log ID.
     * @param ReqId Single audit log ID.
     */
    public void setReqId(String ReqId) {
        this.ReqId = ReqId;
    }

    /**
     * Get Main SQL types: DML, DDL, DCL, and TCL. 
     * @return SqlMainType Main SQL types: DML, DDL, DCL, and TCL.
     */
    public String getSqlMainType() {
        return this.SqlMainType;
    }

    /**
     * Set Main SQL types: DML, DDL, DCL, and TCL.
     * @param SqlMainType Main SQL types: DML, DDL, DCL, and TCL.
     */
    public void setSqlMainType(String SqlMainType) {
        this.SqlMainType = SqlMainType;
    }

    /**
     * Get Table name collection. 
     * @return TableNames Table name collection.
     */
    public String [] getTableNames() {
        return this.TableNames;
    }

    /**
     * Set Table name collection.
     * @param TableNames Table name collection.
     */
    public void setTableNames(String [] TableNames) {
        this.TableNames = TableNames;
    }

    /**
     * Get Field name collection 
     * @return FieldNames Field name collection
     */
    public String [] getFieldNames() {
        return this.FieldNames;
    }

    /**
     * Set Field name collection
     * @param FieldNames Field name collection
     */
    public void setFieldNames(String [] FieldNames) {
        this.FieldNames = FieldNames;
    }

    /**
     * Get Field name 
     * @return FieldName Field name
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set Field name
     * @param FieldName Field name
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get Database type 
     * @return DbType Database type
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set Database type
     * @param DbType Database type
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get Client tool. 
     * @return ClientDriverName Client tool.
     */
    public String getClientDriverName() {
        return this.ClientDriverName;
    }

    /**
     * Set Client tool.
     * @param ClientDriverName Client tool.
     */
    public void setClientDriverName(String ClientDriverName) {
        this.ClientDriverName = ClientDriverName;
    }

    /**
     * Get Location information 
     * @return Location Location information
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set Location information
     * @param Location Location information
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    /**
     * Get Field information (contains sensitive information). 
     * @return FieldDetails Field information (contains sensitive information).
     */
    public TableField [] getFieldDetails() {
        return this.FieldDetails;
    }

    /**
     * Set Field information (contains sensitive information).
     * @param FieldDetails Field information (contains sensitive information).
     */
    public void setFieldDetails(TableField [] FieldDetails) {
        this.FieldDetails = FieldDetails;
    }

    /**
     * Get app id of the account that owns the asset 
     * @return AppId app id of the account that owns the asset
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set app id of the account that owns the asset
     * @param AppId app id of the account that owns the asset
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Account nickname 
     * @return NickName Account nickname
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Account nickname
     * @param NickName Account nickname
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get Account uin of the asset owner 
     * @return Uin Account uin of the asset owner
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Account uin of the asset owner
     * @param Uin Account uin of the asset owner
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    public AuditLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogInfo(AuditLogInfo source) {
        if (source.AiScore != null) {
            this.AiScore = new Float(source.AiScore);
        }
        if (source.AppUser != null) {
            this.AppUser = new String(source.AppUser);
        }
        if (source.BackPacket != null) {
            this.BackPacket = new String(source.BackPacket);
        }
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.ClientMac != null) {
            this.ClientMac = new String(source.ClientMac);
        }
        if (source.ClientName != null) {
            this.ClientName = new String(source.ClientName);
        }
        if (source.ClientUser != null) {
            this.ClientUser = new String(source.ClientUser);
        }
        if (source.ClientPort != null) {
            this.ClientPort = new Long(source.ClientPort);
        }
        if (source.DangerLevel != null) {
            this.DangerLevel = new Long(source.DangerLevel);
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
        if (source.EffectRow != null) {
            this.EffectRow = new Long(source.EffectRow);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.HitRule != null) {
            this.HitRule = new String(source.HitRule);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.OpSql != null) {
            this.OpSql = new String(source.OpSql);
        }
        if (source.OpTime != null) {
            this.OpTime = new Long(source.OpTime);
        }
        if (source.RetMsg != null) {
            this.RetMsg = new String(source.RetMsg);
        }
        if (source.RetNo != null) {
            this.RetNo = new Long(source.RetNo);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.HitRules != null) {
            this.HitRules = new HitRules[source.HitRules.length];
            for (int i = 0; i < source.HitRules.length; i++) {
                this.HitRules[i] = new HitRules(source.HitRules[i]);
            }
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.ReqId != null) {
            this.ReqId = new String(source.ReqId);
        }
        if (source.SqlMainType != null) {
            this.SqlMainType = new String(source.SqlMainType);
        }
        if (source.TableNames != null) {
            this.TableNames = new String[source.TableNames.length];
            for (int i = 0; i < source.TableNames.length; i++) {
                this.TableNames[i] = new String(source.TableNames[i]);
            }
        }
        if (source.FieldNames != null) {
            this.FieldNames = new String[source.FieldNames.length];
            for (int i = 0; i < source.FieldNames.length; i++) {
                this.FieldNames[i] = new String(source.FieldNames[i]);
            }
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.ClientDriverName != null) {
            this.ClientDriverName = new String(source.ClientDriverName);
        }
        if (source.Location != null) {
            this.Location = new Location(source.Location);
        }
        if (source.FieldDetails != null) {
            this.FieldDetails = new TableField[source.FieldDetails.length];
            for (int i = 0; i < source.FieldDetails.length; i++) {
                this.FieldDetails[i] = new TableField(source.FieldDetails[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AiScore", this.AiScore);
        this.setParamSimple(map, prefix + "AppUser", this.AppUser);
        this.setParamSimple(map, prefix + "BackPacket", this.BackPacket);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "ClientMac", this.ClientMac);
        this.setParamSimple(map, prefix + "ClientName", this.ClientName);
        this.setParamSimple(map, prefix + "ClientUser", this.ClientUser);
        this.setParamSimple(map, prefix + "ClientPort", this.ClientPort);
        this.setParamSimple(map, prefix + "DangerLevel", this.DangerLevel);
        this.setParamSimple(map, prefix + "DbIp", this.DbIp);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "DbPort", this.DbPort);
        this.setParamSimple(map, prefix + "DbUser", this.DbUser);
        this.setParamSimple(map, prefix + "EffectRow", this.EffectRow);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "HitRule", this.HitRule);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "OpSql", this.OpSql);
        this.setParamSimple(map, prefix + "OpTime", this.OpTime);
        this.setParamSimple(map, prefix + "RetMsg", this.RetMsg);
        this.setParamSimple(map, prefix + "RetNo", this.RetNo);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamArrayObj(map, prefix + "HitRules.", this.HitRules);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "ReqId", this.ReqId);
        this.setParamSimple(map, prefix + "SqlMainType", this.SqlMainType);
        this.setParamArraySimple(map, prefix + "TableNames.", this.TableNames);
        this.setParamArraySimple(map, prefix + "FieldNames.", this.FieldNames);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "ClientDriverName", this.ClientDriverName);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamArrayObj(map, prefix + "FieldDetails.", this.FieldDetails);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

