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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOnlineDDLJobRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the DDL statement to be executed. Common online DDL refer to this API documentation example section.
    */
    @SerializedName("Alter")
    @Expose
    private String Alter;

    /**
    * Specifies the database to be modified.	
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Specifies the table to be modified.
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * Specifies the account to execute DDL. Ensure the account has ALTER, CREATE, INSERT, UPDATE, DROP, DELETE, INDEX, CREATE TEMPORARY TABLES, LOCK TABLES, TRIGGER, REPLICATION CLIENT, REPLICATION SLAVE permissions. If not specified, the system account will be used by default.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Specifies the password for the account.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Indicates that DDL will terminate if the number of running threads exceeds this value. Default is 58 if not specified.
    */
    @SerializedName("CriticalLoad")
    @Expose
    private Long CriticalLoad;

    /**
    * Specifies whether to check auto-increment fields. If set to 1, modification of auto-increment fields is not allowed; if set to 0 or left empty, no check is performed.
    */
    @SerializedName("CheckAutoInc")
    @Expose
    private Long CheckAutoInc;

    /**
    * Allowed primary-secondary delay time (in seconds). If set to 0 or left empty, do not check delay.
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * Indicates whether to use pt-osc tool for DDL.
    */
    @SerializedName("UsePt")
    @Expose
    private Long UsePt;

    /**
    * Start Execution Time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the DDL statement to be executed. Common online DDL refer to this API documentation example section. 
     * @return Alter Specifies the DDL statement to be executed. Common online DDL refer to this API documentation example section.
     */
    public String getAlter() {
        return this.Alter;
    }

    /**
     * Set Specifies the DDL statement to be executed. Common online DDL refer to this API documentation example section.
     * @param Alter Specifies the DDL statement to be executed. Common online DDL refer to this API documentation example section.
     */
    public void setAlter(String Alter) {
        this.Alter = Alter;
    }

    /**
     * Get Specifies the database to be modified.	 
     * @return DbName Specifies the database to be modified.	
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Specifies the database to be modified.	
     * @param DbName Specifies the database to be modified.	
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Specifies the table to be modified. 
     * @return Table Specifies the table to be modified.
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set Specifies the table to be modified.
     * @param Table Specifies the table to be modified.
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get Specifies the account to execute DDL. Ensure the account has ALTER, CREATE, INSERT, UPDATE, DROP, DELETE, INDEX, CREATE TEMPORARY TABLES, LOCK TABLES, TRIGGER, REPLICATION CLIENT, REPLICATION SLAVE permissions. If not specified, the system account will be used by default. 
     * @return User Specifies the account to execute DDL. Ensure the account has ALTER, CREATE, INSERT, UPDATE, DROP, DELETE, INDEX, CREATE TEMPORARY TABLES, LOCK TABLES, TRIGGER, REPLICATION CLIENT, REPLICATION SLAVE permissions. If not specified, the system account will be used by default.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Specifies the account to execute DDL. Ensure the account has ALTER, CREATE, INSERT, UPDATE, DROP, DELETE, INDEX, CREATE TEMPORARY TABLES, LOCK TABLES, TRIGGER, REPLICATION CLIENT, REPLICATION SLAVE permissions. If not specified, the system account will be used by default.
     * @param User Specifies the account to execute DDL. Ensure the account has ALTER, CREATE, INSERT, UPDATE, DROP, DELETE, INDEX, CREATE TEMPORARY TABLES, LOCK TABLES, TRIGGER, REPLICATION CLIENT, REPLICATION SLAVE permissions. If not specified, the system account will be used by default.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Specifies the password for the account. 
     * @return Password Specifies the password for the account.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Specifies the password for the account.
     * @param Password Specifies the password for the account.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Indicates that DDL will terminate if the number of running threads exceeds this value. Default is 58 if not specified. 
     * @return CriticalLoad Indicates that DDL will terminate if the number of running threads exceeds this value. Default is 58 if not specified.
     */
    public Long getCriticalLoad() {
        return this.CriticalLoad;
    }

    /**
     * Set Indicates that DDL will terminate if the number of running threads exceeds this value. Default is 58 if not specified.
     * @param CriticalLoad Indicates that DDL will terminate if the number of running threads exceeds this value. Default is 58 if not specified.
     */
    public void setCriticalLoad(Long CriticalLoad) {
        this.CriticalLoad = CriticalLoad;
    }

    /**
     * Get Specifies whether to check auto-increment fields. If set to 1, modification of auto-increment fields is not allowed; if set to 0 or left empty, no check is performed. 
     * @return CheckAutoInc Specifies whether to check auto-increment fields. If set to 1, modification of auto-increment fields is not allowed; if set to 0 or left empty, no check is performed.
     */
    public Long getCheckAutoInc() {
        return this.CheckAutoInc;
    }

    /**
     * Set Specifies whether to check auto-increment fields. If set to 1, modification of auto-increment fields is not allowed; if set to 0 or left empty, no check is performed.
     * @param CheckAutoInc Specifies whether to check auto-increment fields. If set to 1, modification of auto-increment fields is not allowed; if set to 0 or left empty, no check is performed.
     */
    public void setCheckAutoInc(Long CheckAutoInc) {
        this.CheckAutoInc = CheckAutoInc;
    }

    /**
     * Get Allowed primary-secondary delay time (in seconds). If set to 0 or left empty, do not check delay. 
     * @return MaxDelay Allowed primary-secondary delay time (in seconds). If set to 0 or left empty, do not check delay.
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set Allowed primary-secondary delay time (in seconds). If set to 0 or left empty, do not check delay.
     * @param MaxDelay Allowed primary-secondary delay time (in seconds). If set to 0 or left empty, do not check delay.
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get Indicates whether to use pt-osc tool for DDL. 
     * @return UsePt Indicates whether to use pt-osc tool for DDL.
     */
    public Long getUsePt() {
        return this.UsePt;
    }

    /**
     * Set Indicates whether to use pt-osc tool for DDL.
     * @param UsePt Indicates whether to use pt-osc tool for DDL.
     */
    public void setUsePt(Long UsePt) {
        this.UsePt = UsePt;
    }

    /**
     * Get Start Execution Time 
     * @return StartTime Start Execution Time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start Execution Time
     * @param StartTime Start Execution Time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public CreateOnlineDDLJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOnlineDDLJobRequest(CreateOnlineDDLJobRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Alter != null) {
            this.Alter = new String(source.Alter);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.CriticalLoad != null) {
            this.CriticalLoad = new Long(source.CriticalLoad);
        }
        if (source.CheckAutoInc != null) {
            this.CheckAutoInc = new Long(source.CheckAutoInc);
        }
        if (source.MaxDelay != null) {
            this.MaxDelay = new Long(source.MaxDelay);
        }
        if (source.UsePt != null) {
            this.UsePt = new Long(source.UsePt);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Alter", this.Alter);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "CriticalLoad", this.CriticalLoad);
        this.setParamSimple(map, prefix + "CheckAutoInc", this.CheckAutoInc);
        this.setParamSimple(map, prefix + "MaxDelay", this.MaxDelay);
        this.setParamSimple(map, prefix + "UsePt", this.UsePt);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

