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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLogFilter extends AbstractModel{

    /**
    * Client address
    */
    @SerializedName("Host")
    @Expose
    private String [] Host;

    /**
    * Username
    */
    @SerializedName("User")
    @Expose
    private String [] User;

    /**
    * 
    */
    @SerializedName("DBName")
    @Expose
    private String [] DBName;

    /**
    * Table name
    */
    @SerializedName("TableName")
    @Expose
    private String [] TableName;

    /**
    * Audit policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String [] PolicyName;

    /**
    * 
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * 
    */
    @SerializedName("SqlType")
    @Expose
    private String SqlType;

    /**
    * Execution time in ms, which is used to filter the audit log with execution time greater than this value.
    */
    @SerializedName("ExecTime")
    @Expose
    private Long ExecTime;

    /**
    * Number of affected rows, which is used to filter the audit log with affected rows greater than this value.
    */
    @SerializedName("AffectRows")
    @Expose
    private Long AffectRows;

    /**
    * SQL type (Multiple types can be queried at same time). Valid values: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `DROP`, `ALTER`, `SET`, `REPLACE`, `EXECUTE`.
    */
    @SerializedName("SqlTypes")
    @Expose
    private String [] SqlTypes;

    /**
    * SQL statement. Multiple SQL statements can be passed in.
    */
    @SerializedName("Sqls")
    @Expose
    private String [] Sqls;

    /**
    * Number of rows affected in the format of M-N, such as 10-200.
    */
    @SerializedName("AffectRowsSection")
    @Expose
    private String AffectRowsSection;

    /**
    * Number of rows returned in the format of M-N, such as 10-200.
    */
    @SerializedName("SentRowsSection")
    @Expose
    private String SentRowsSection;

    /**
    * Execution time in the format of M-N, such as 10-200.
    */
    @SerializedName("ExecTimeSection")
    @Expose
    private String ExecTimeSection;

    /**
    * Lock wait time in the format of M-N, such as 10-200.
    */
    @SerializedName("LockWaitTimeSection")
    @Expose
    private String LockWaitTimeSection;

    /**
    * IO wait time in the format of M-N, such as 10-200.
    */
    @SerializedName("IoWaitTimeSection")
    @Expose
    private String IoWaitTimeSection;

    /**
    * Transaction duration in the format of M-N, such as 10-200.
    */
    @SerializedName("TransactionLivingTimeSection")
    @Expose
    private String TransactionLivingTimeSection;

    /**
     * Get Client address 
     * @return Host Client address
     */
    public String [] getHost() {
        return this.Host;
    }

    /**
     * Set Client address
     * @param Host Client address
     */
    public void setHost(String [] Host) {
        this.Host = Host;
    }

    /**
     * Get Username 
     * @return User Username
     */
    public String [] getUser() {
        return this.User;
    }

    /**
     * Set Username
     * @param User Username
     */
    public void setUser(String [] User) {
        this.User = User;
    }

    /**
     * Get  
     * @return DBName 
     */
    public String [] getDBName() {
        return this.DBName;
    }

    /**
     * Set 
     * @param DBName 
     */
    public void setDBName(String [] DBName) {
        this.DBName = DBName;
    }

    /**
     * Get Table name 
     * @return TableName Table name
     */
    public String [] getTableName() {
        return this.TableName;
    }

    /**
     * Set Table name
     * @param TableName Table name
     */
    public void setTableName(String [] TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Audit policy name 
     * @return PolicyName Audit policy name
     */
    public String [] getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Audit policy name
     * @param PolicyName Audit policy name
     */
    public void setPolicyName(String [] PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get  
     * @return Sql 
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set 
     * @param Sql 
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get  
     * @return SqlType 
     */
    public String getSqlType() {
        return this.SqlType;
    }

    /**
     * Set 
     * @param SqlType 
     */
    public void setSqlType(String SqlType) {
        this.SqlType = SqlType;
    }

    /**
     * Get Execution time in ms, which is used to filter the audit log with execution time greater than this value. 
     * @return ExecTime Execution time in ms, which is used to filter the audit log with execution time greater than this value.
     */
    public Long getExecTime() {
        return this.ExecTime;
    }

    /**
     * Set Execution time in ms, which is used to filter the audit log with execution time greater than this value.
     * @param ExecTime Execution time in ms, which is used to filter the audit log with execution time greater than this value.
     */
    public void setExecTime(Long ExecTime) {
        this.ExecTime = ExecTime;
    }

    /**
     * Get Number of affected rows, which is used to filter the audit log with affected rows greater than this value. 
     * @return AffectRows Number of affected rows, which is used to filter the audit log with affected rows greater than this value.
     */
    public Long getAffectRows() {
        return this.AffectRows;
    }

    /**
     * Set Number of affected rows, which is used to filter the audit log with affected rows greater than this value.
     * @param AffectRows Number of affected rows, which is used to filter the audit log with affected rows greater than this value.
     */
    public void setAffectRows(Long AffectRows) {
        this.AffectRows = AffectRows;
    }

    /**
     * Get SQL type (Multiple types can be queried at same time). Valid values: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `DROP`, `ALTER`, `SET`, `REPLACE`, `EXECUTE`. 
     * @return SqlTypes SQL type (Multiple types can be queried at same time). Valid values: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `DROP`, `ALTER`, `SET`, `REPLACE`, `EXECUTE`.
     */
    public String [] getSqlTypes() {
        return this.SqlTypes;
    }

    /**
     * Set SQL type (Multiple types can be queried at same time). Valid values: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `DROP`, `ALTER`, `SET`, `REPLACE`, `EXECUTE`.
     * @param SqlTypes SQL type (Multiple types can be queried at same time). Valid values: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `DROP`, `ALTER`, `SET`, `REPLACE`, `EXECUTE`.
     */
    public void setSqlTypes(String [] SqlTypes) {
        this.SqlTypes = SqlTypes;
    }

    /**
     * Get SQL statement. Multiple SQL statements can be passed in. 
     * @return Sqls SQL statement. Multiple SQL statements can be passed in.
     */
    public String [] getSqls() {
        return this.Sqls;
    }

    /**
     * Set SQL statement. Multiple SQL statements can be passed in.
     * @param Sqls SQL statement. Multiple SQL statements can be passed in.
     */
    public void setSqls(String [] Sqls) {
        this.Sqls = Sqls;
    }

    /**
     * Get Number of rows affected in the format of M-N, such as 10-200. 
     * @return AffectRowsSection Number of rows affected in the format of M-N, such as 10-200.
     */
    public String getAffectRowsSection() {
        return this.AffectRowsSection;
    }

    /**
     * Set Number of rows affected in the format of M-N, such as 10-200.
     * @param AffectRowsSection Number of rows affected in the format of M-N, such as 10-200.
     */
    public void setAffectRowsSection(String AffectRowsSection) {
        this.AffectRowsSection = AffectRowsSection;
    }

    /**
     * Get Number of rows returned in the format of M-N, such as 10-200. 
     * @return SentRowsSection Number of rows returned in the format of M-N, such as 10-200.
     */
    public String getSentRowsSection() {
        return this.SentRowsSection;
    }

    /**
     * Set Number of rows returned in the format of M-N, such as 10-200.
     * @param SentRowsSection Number of rows returned in the format of M-N, such as 10-200.
     */
    public void setSentRowsSection(String SentRowsSection) {
        this.SentRowsSection = SentRowsSection;
    }

    /**
     * Get Execution time in the format of M-N, such as 10-200. 
     * @return ExecTimeSection Execution time in the format of M-N, such as 10-200.
     */
    public String getExecTimeSection() {
        return this.ExecTimeSection;
    }

    /**
     * Set Execution time in the format of M-N, such as 10-200.
     * @param ExecTimeSection Execution time in the format of M-N, such as 10-200.
     */
    public void setExecTimeSection(String ExecTimeSection) {
        this.ExecTimeSection = ExecTimeSection;
    }

    /**
     * Get Lock wait time in the format of M-N, such as 10-200. 
     * @return LockWaitTimeSection Lock wait time in the format of M-N, such as 10-200.
     */
    public String getLockWaitTimeSection() {
        return this.LockWaitTimeSection;
    }

    /**
     * Set Lock wait time in the format of M-N, such as 10-200.
     * @param LockWaitTimeSection Lock wait time in the format of M-N, such as 10-200.
     */
    public void setLockWaitTimeSection(String LockWaitTimeSection) {
        this.LockWaitTimeSection = LockWaitTimeSection;
    }

    /**
     * Get IO wait time in the format of M-N, such as 10-200. 
     * @return IoWaitTimeSection IO wait time in the format of M-N, such as 10-200.
     */
    public String getIoWaitTimeSection() {
        return this.IoWaitTimeSection;
    }

    /**
     * Set IO wait time in the format of M-N, such as 10-200.
     * @param IoWaitTimeSection IO wait time in the format of M-N, such as 10-200.
     */
    public void setIoWaitTimeSection(String IoWaitTimeSection) {
        this.IoWaitTimeSection = IoWaitTimeSection;
    }

    /**
     * Get Transaction duration in the format of M-N, such as 10-200. 
     * @return TransactionLivingTimeSection Transaction duration in the format of M-N, such as 10-200.
     */
    public String getTransactionLivingTimeSection() {
        return this.TransactionLivingTimeSection;
    }

    /**
     * Set Transaction duration in the format of M-N, such as 10-200.
     * @param TransactionLivingTimeSection Transaction duration in the format of M-N, such as 10-200.
     */
    public void setTransactionLivingTimeSection(String TransactionLivingTimeSection) {
        this.TransactionLivingTimeSection = TransactionLivingTimeSection;
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
        if (source.AffectRowsSection != null) {
            this.AffectRowsSection = new String(source.AffectRowsSection);
        }
        if (source.SentRowsSection != null) {
            this.SentRowsSection = new String(source.SentRowsSection);
        }
        if (source.ExecTimeSection != null) {
            this.ExecTimeSection = new String(source.ExecTimeSection);
        }
        if (source.LockWaitTimeSection != null) {
            this.LockWaitTimeSection = new String(source.LockWaitTimeSection);
        }
        if (source.IoWaitTimeSection != null) {
            this.IoWaitTimeSection = new String(source.IoWaitTimeSection);
        }
        if (source.TransactionLivingTimeSection != null) {
            this.TransactionLivingTimeSection = new String(source.TransactionLivingTimeSection);
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
        this.setParamSimple(map, prefix + "AffectRowsSection", this.AffectRowsSection);
        this.setParamSimple(map, prefix + "SentRowsSection", this.SentRowsSection);
        this.setParamSimple(map, prefix + "ExecTimeSection", this.ExecTimeSection);
        this.setParamSimple(map, prefix + "LockWaitTimeSection", this.LockWaitTimeSection);
        this.setParamSimple(map, prefix + "IoWaitTimeSection", this.IoWaitTimeSection);
        this.setParamSimple(map, prefix + "TransactionLivingTimeSection", this.TransactionLivingTimeSection);

    }
}

