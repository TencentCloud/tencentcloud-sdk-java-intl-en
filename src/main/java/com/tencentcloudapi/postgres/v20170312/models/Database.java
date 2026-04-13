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

public class Database extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * Specifies the database owner.
    */
    @SerializedName("DatabaseOwner")
    @Expose
    private String DatabaseOwner;

    /**
    * Specifies the database character encoding.
    */
    @SerializedName("Encoding")
    @Expose
    private String Encoding;

    /**
    * Specifies the database sorting rule.
    */
    @SerializedName("Collate")
    @Expose
    private String Collate;

    /**
    * Specifies the character category of the database.
    */
    @SerializedName("Ctype")
    @Expose
    private String Ctype;

    /**
    * Specifies whether the database allows connections.
    */
    @SerializedName("AllowConn")
    @Expose
    private Boolean AllowConn;

    /**
    * Maximum number of connections for the database. -1 indicates unlimited.
    */
    @SerializedName("ConnLimit")
    @Expose
    private Long ConnLimit;

    /**
    * Specifies the database permission list.
    */
    @SerializedName("Privileges")
    @Expose
    private String Privileges;

    /**
     * Get Database name 
     * @return DatabaseName Database name
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set Database name
     * @param DatabaseName Database name
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get Specifies the database owner. 
     * @return DatabaseOwner Specifies the database owner.
     */
    public String getDatabaseOwner() {
        return this.DatabaseOwner;
    }

    /**
     * Set Specifies the database owner.
     * @param DatabaseOwner Specifies the database owner.
     */
    public void setDatabaseOwner(String DatabaseOwner) {
        this.DatabaseOwner = DatabaseOwner;
    }

    /**
     * Get Specifies the database character encoding. 
     * @return Encoding Specifies the database character encoding.
     */
    public String getEncoding() {
        return this.Encoding;
    }

    /**
     * Set Specifies the database character encoding.
     * @param Encoding Specifies the database character encoding.
     */
    public void setEncoding(String Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get Specifies the database sorting rule. 
     * @return Collate Specifies the database sorting rule.
     */
    public String getCollate() {
        return this.Collate;
    }

    /**
     * Set Specifies the database sorting rule.
     * @param Collate Specifies the database sorting rule.
     */
    public void setCollate(String Collate) {
        this.Collate = Collate;
    }

    /**
     * Get Specifies the character category of the database. 
     * @return Ctype Specifies the character category of the database.
     */
    public String getCtype() {
        return this.Ctype;
    }

    /**
     * Set Specifies the character category of the database.
     * @param Ctype Specifies the character category of the database.
     */
    public void setCtype(String Ctype) {
        this.Ctype = Ctype;
    }

    /**
     * Get Specifies whether the database allows connections. 
     * @return AllowConn Specifies whether the database allows connections.
     */
    public Boolean getAllowConn() {
        return this.AllowConn;
    }

    /**
     * Set Specifies whether the database allows connections.
     * @param AllowConn Specifies whether the database allows connections.
     */
    public void setAllowConn(Boolean AllowConn) {
        this.AllowConn = AllowConn;
    }

    /**
     * Get Maximum number of connections for the database. -1 indicates unlimited. 
     * @return ConnLimit Maximum number of connections for the database. -1 indicates unlimited.
     */
    public Long getConnLimit() {
        return this.ConnLimit;
    }

    /**
     * Set Maximum number of connections for the database. -1 indicates unlimited.
     * @param ConnLimit Maximum number of connections for the database. -1 indicates unlimited.
     */
    public void setConnLimit(Long ConnLimit) {
        this.ConnLimit = ConnLimit;
    }

    /**
     * Get Specifies the database permission list. 
     * @return Privileges Specifies the database permission list.
     */
    public String getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set Specifies the database permission list.
     * @param Privileges Specifies the database permission list.
     */
    public void setPrivileges(String Privileges) {
        this.Privileges = Privileges;
    }

    public Database() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Database(Database source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DatabaseOwner != null) {
            this.DatabaseOwner = new String(source.DatabaseOwner);
        }
        if (source.Encoding != null) {
            this.Encoding = new String(source.Encoding);
        }
        if (source.Collate != null) {
            this.Collate = new String(source.Collate);
        }
        if (source.Ctype != null) {
            this.Ctype = new String(source.Ctype);
        }
        if (source.AllowConn != null) {
            this.AllowConn = new Boolean(source.AllowConn);
        }
        if (source.ConnLimit != null) {
            this.ConnLimit = new Long(source.ConnLimit);
        }
        if (source.Privileges != null) {
            this.Privileges = new String(source.Privileges);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DatabaseOwner", this.DatabaseOwner);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamSimple(map, prefix + "Collate", this.Collate);
        this.setParamSimple(map, prefix + "Ctype", this.Ctype);
        this.setParamSimple(map, prefix + "AllowConn", this.AllowConn);
        this.setParamSimple(map, prefix + "ConnLimit", this.ConnLimit);
        this.setParamSimple(map, prefix + "Privileges", this.Privileges);

    }
}

