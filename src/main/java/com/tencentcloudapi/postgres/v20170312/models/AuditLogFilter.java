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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLogFilter extends AbstractModel {

    /**
    * <p>Impact function</p>
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * <p>Database name</p>
    */
    @SerializedName("DBName")
    @Expose
    private String [] DBName;

    /**
    * <p>Execution time</p>
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * <p>Host</p>
    */
    @SerializedName("Host")
    @Expose
    private String [] Host;

    /**
    * <p>sql statement</p>
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * <p>Login name</p>
    */
    @SerializedName("User")
    @Expose
    private String [] User;

    /**
    * <p>Audit type</p>
    */
    @SerializedName("SqlType")
    @Expose
    private String [] SqlType;

    /**
     * Get <p>Impact function</p> 
     * @return AffectRows <p>Impact function</p>
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set <p>Impact function</p>
     * @param AffectRows <p>Impact function</p>
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get <p>Database name</p> 
     * @return DBName <p>Database name</p>
     */
    public String [] getDBName() {
        return this.DBName;
    }

    /**
     * Set <p>Database name</p>
     * @param DBName <p>Database name</p>
     */
    public void setDBName(String [] DBName) {
        this.DBName = DBName;
    }

    /**
     * Get <p>Execution time</p> 
     * @return ExecTime <p>Execution time</p>
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set <p>Execution time</p>
     * @param ExecTime <p>Execution time</p>
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get <p>Host</p> 
     * @return Host <p>Host</p>
     */
    public String [] getHost() {
        return this.Host;
    }

    /**
     * Set <p>Host</p>
     * @param Host <p>Host</p>
     */
    public void setHost(String [] Host) {
        this.Host = Host;
    }

    /**
     * Get <p>sql statement</p> 
     * @return Sql <p>sql statement</p>
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set <p>sql statement</p>
     * @param Sql <p>sql statement</p>
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get <p>Login name</p> 
     * @return User <p>Login name</p>
     */
    public String [] getUser() {
        return this.User;
    }

    /**
     * Set <p>Login name</p>
     * @param User <p>Login name</p>
     */
    public void setUser(String [] User) {
        this.User = User;
    }

    /**
     * Get <p>Audit type</p> 
     * @return SqlType <p>Audit type</p>
     */
    public String [] getSqlType() {
        return this.SqlType;
    }

    /**
     * Set <p>Audit type</p>
     * @param SqlType <p>Audit type</p>
     */
    public void setSqlType(String [] SqlType) {
        this.SqlType = SqlType;
    }

    public AuditLogFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogFilter(AuditLogFilter source) {
        if (source.AffectRows != null) {
            this.AffectRows = new Long(source.AffectRows);
        }
        if (source.DBName != null) {
            this.DBName = new String[source.DBName.length];
            for (int i = 0; i < source.DBName.length; i++) {
                this.DBName[i] = new String(source.DBName[i]);
            }
        }
        if (source.ExecTime != null) {
            this.ExecTime = new Long(source.ExecTime);
        }
        if (source.Host != null) {
            this.Host = new String[source.Host.length];
            for (int i = 0; i < source.Host.length; i++) {
                this.Host[i] = new String(source.Host[i]);
            }
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.User != null) {
            this.User = new String[source.User.length];
            for (int i = 0; i < source.User.length; i++) {
                this.User[i] = new String(source.User[i]);
            }
        }
        if (source.SqlType != null) {
            this.SqlType = new String[source.SqlType.length];
            for (int i = 0; i < source.SqlType.length; i++) {
                this.SqlType[i] = new String(source.SqlType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AffectRows", this.AffectRows);
        this.setParamArraySimple(map, prefix + "DBName.", this.DBName);
        this.setParamSimple(map, prefix + "ExecTime", this.ExecTime);
        this.setParamArraySimple(map, prefix + "Host.", this.Host);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamArraySimple(map, prefix + "User.", this.User);
        this.setParamArraySimple(map, prefix + "SqlType.", this.SqlType);

    }
}

