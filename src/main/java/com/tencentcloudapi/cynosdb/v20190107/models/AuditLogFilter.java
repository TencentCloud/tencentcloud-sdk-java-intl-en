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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLogFilter extends AbstractModel {

    /**
    * Client address.
    */
    @SerializedName("Host")
    @Expose
    private String [] Host;

    /**
    * Username.
    */
    @SerializedName("User")
    @Expose
    private String [] User;

    /**
    * Database name.
    */
    @SerializedName("DBName")
    @Expose
    private String [] DBName;

    /**
    * Table name.
    */
    @SerializedName("TableName")
    @Expose
    private String [] TableName;

    /**
    * Audit policy name.
    */
    @SerializedName("PolicyName")
    @Expose
    private String [] PolicyName;

    /**
    * SQL statement. Fuzzy matching supported.
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * SQL type. Currently supports: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE".
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * Execution time. Unit: ms. Filter audit logs with an execution time more than this value.
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * Number of affected rows. Filter audit logs where the number of affected rows is more than this value.
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * SQL type. Supports simultaneous query of multiple types. Currently supports: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE".
    */
    @SerializedName("SqlTypes")
    @Expose
    private String [] SqlTypes;

    /**
    * SQL statement. Supports transmission of multiple sql statements.
    */
    @SerializedName("Sqls")
    @Expose
    private String [] Sqls;

    /**
    * Number of rows returned.
    */
    @SerializedName("SentRows")
    @Expose
    private Long SentRows;

    /**
    * Thread ID.
    */
    @SerializedName("ThreadId")
    @Expose
    private String [] ThreadId;

    /**
     * Get Client address. 
     * @return Host Client address.
     */
    public String [] getHost() {
        return this.Host;
    }

    /**
     * Set Client address.
     * @param Host Client address.
     */
    public void setHost(String [] Host) {
        this.Host = Host;
    }

    /**
     * Get Username. 
     * @return User Username.
     */
    public String [] getUser() {
        return this.User;
    }

    /**
     * Set Username.
     * @param User Username.
     */
    public void setUser(String [] User) {
        this.User = User;
    }

    /**
     * Get Database name. 
     * @return DBName Database name.
     */
    public String [] getDBName() {
        return this.DBName;
    }

    /**
     * Set Database name.
     * @param DBName Database name.
     */
    public void setDBName(String [] DBName) {
        this.DBName = DBName;
    }

    /**
     * Get Table name. 
     * @return TableName Table name.
     */
    public String [] getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name.
     * @param TableName Table name.
     */
    public void setTableName(String [] TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Audit policy name. 
     * @return PolicyName Audit policy name.
     */
    public String [] getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Audit policy name.
     * @param PolicyName Audit policy name.
     */
    public void setPolicyName(String [] PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get SQL statement. Fuzzy matching supported. 
     * @return Sql SQL statement. Fuzzy matching supported.
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set SQL statement. Fuzzy matching supported.
     * @param Sql SQL statement. Fuzzy matching supported.
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get SQL type. Currently supports: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE". 
     * @return SqlType SQL type. Currently supports: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE".
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set SQL type. Currently supports: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE".
     * @param SqlType SQL type. Currently supports: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE".
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get Execution time. Unit: ms. Filter audit logs with an execution time more than this value. 
     * @return ExecTime Execution time. Unit: ms. Filter audit logs with an execution time more than this value.
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set Execution time. Unit: ms. Filter audit logs with an execution time more than this value.
     * @param ExecTime Execution time. Unit: ms. Filter audit logs with an execution time more than this value.
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get Number of affected rows. Filter audit logs where the number of affected rows is more than this value. 
     * @return AffectRows Number of affected rows. Filter audit logs where the number of affected rows is more than this value.
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set Number of affected rows. Filter audit logs where the number of affected rows is more than this value.
     * @param AffectRows Number of affected rows. Filter audit logs where the number of affected rows is more than this value.
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get SQL type. Supports simultaneous query of multiple types. Currently supports: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE". 
     * @return SqlTypes SQL type. Supports simultaneous query of multiple types. Currently supports: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE".
     */
    public String [] getSqlTypes() {
        return this.SqlTypes;
    }

    /**
     * Set SQL type. Supports simultaneous query of multiple types. Currently supports: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE".
     * @param SqlTypes SQL type. Supports simultaneous query of multiple types. Currently supports: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "ALTER", "SET", "REPLACE", "EXECUTE".
     */
    public void setSqlTypes(String [] SqlTypes) {
        this.SqlTypes = SqlTypes;
    }

    /**
     * Get SQL statement. Supports transmission of multiple sql statements. 
     * @return Sqls SQL statement. Supports transmission of multiple sql statements.
     */
    public String [] getSqls() {
        return this.Sqls;
    }

    /**
     * Set SQL statement. Supports transmission of multiple sql statements.
     * @param Sqls SQL statement. Supports transmission of multiple sql statements.
     */
    public void setSqls(String [] Sqls) {
        this.Sqls = Sqls;
    }

    /**
     * Get Number of rows returned. 
     * @return SentRows Number of rows returned.
     */
    public Long getSentRows() {
        return this.SentRows;
    }

    /**
     * Set Number of rows returned.
     * @param SentRows Number of rows returned.
     */
    public void setSentRows(Long SentRows) {
        this.SentRows = SentRows;
    }

    /**
     * Get Thread ID. 
     * @return ThreadId Thread ID.
     */
    public String [] getThreadId() {
        return this.ThreadId;
    }

    /**
     * Set Thread ID.
     * @param ThreadId Thread ID.
     */
    public void setThreadId(String [] ThreadId) {
        this.ThreadId = ThreadId;
    }

    public AuditLogFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogFilter(AuditLogFilter source) {
        if (source.Host != null) {
            this.Host = new String[source.Host.length];
            for (int i = 0; i < source.Host.length; i++) {
                this.Host[i] = new String(source.Host[i]);
            }
        }
        if (source.User != null) {
            this.User = new String[source.User.length];
            for (int i = 0; i < source.User.length; i++) {
                this.User[i] = new String(source.User[i]);
            }
        }
        if (source.DBName != null) {
            this.DBName = new String[source.DBName.length];
            for (int i = 0; i < source.DBName.length; i++) {
                this.DBName[i] = new String(source.DBName[i]);
            }
        }
        if (source.TableName != null) {
            this.TableName = new String[source.TableName.length];
            for (int i = 0; i < source.TableName.length; i++) {
                this.TableName[i] = new String(source.TableName[i]);
            }
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String[source.PolicyName.length];
            for (int i = 0; i < source.PolicyName.length; i++) {
                this.PolicyName[i] = new String(source.PolicyName[i]);
            }
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.SqlType != null) {
            this.SqlType = new String(source.SqlType);
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.SqlTypes != null) {
            this.SqlTypes = new String[source.SqlTypes.length];
            for (int i = 0; i < source.SqlTypes.length; i++) {
                this.SqlTypes[i] = new String(source.SqlTypes[i]);
            }
        }
        if (source.Sqls != null) {
            this.Sqls = new String[source.Sqls.length];
            for (int i = 0; i < source.Sqls.length; i++) {
                this.Sqls[i] = new String(source.Sqls[i]);
            }
        }
        if (source.SentRows != null) {
            this.SentRows = new Long(source.SentRows);
        }
        if (source.ThreadId != null) {
            this.ThreadId = new String[source.ThreadId.length];
            for (int i = 0; i < source.ThreadId.length; i++) {
                this.ThreadId[i] = new String(source.ThreadId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Host.", this.Host);
        this.setParamArraySimple(map, prefix + "User.", this.User);
        this.setParamArraySimple(map, prefix + "DBName.", this.DBName);
        this.setParamArraySimple(map, prefix + "TableName.", this.TableName);
        this.setParamArraySimple(map, prefix + "PolicyName.", this.PolicyName);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamSimple(map, prefix + "SqlType", this.SqlType);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamArraySimple(map, prefix + "SqlTypes.", this.SqlTypes);
        this.setParamArraySimple(map, prefix + "Sqls.", this.Sqls);
        this.setParamSimple(map, prefix + "SentRows", this.SentRows);
        this.setParamArraySimple(map, prefix + "ThreadId.", this.ThreadId);

    }
}

