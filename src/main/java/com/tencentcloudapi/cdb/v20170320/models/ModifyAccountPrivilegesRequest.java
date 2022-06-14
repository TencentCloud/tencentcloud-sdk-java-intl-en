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

public class ModifyAccountPrivilegesRequest extends AbstractModel{

    /**
    * Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Database account, including username and domain name.
    */
    @SerializedName("Accounts")
    @Expose
    private Account [] Accounts;

    /**
    * Global permission. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "PROCESS", "DROP", "REFERENCES", "INDEX", "ALTER", "SHOW DATABASES", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER", "CREATE USER", "RELOAD", "REPLICATION CLIENT", "REPLICATION SLAVE".
Note: When “ModifyAction” is empty, if `GlobalPrivileges` is not passed in, it indicates the global permission will become ineffective.
    */
    @SerializedName("GlobalPrivileges")
    @Expose
    private String [] GlobalPrivileges;

    /**
    * Database permission. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "REFERENCES", "INDEX", "ALTER", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER".
Note: When “ModifyAction” is empty, if `DatabasePrivileges` is not passed in, it indicates the permission of the database will become ineffective.
    */
    @SerializedName("DatabasePrivileges")
    @Expose
    private DatabasePrivilege [] DatabasePrivileges;

    /**
    * Table permission in the database. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "REFERENCES", "INDEX", "ALTER", "CREATE VIEW", "SHOW VIEW", "TRIGGER".
Note: When “ModifyAction” is empty, if `TablePrivileges` is not passed in, it indicates the permission of the table will become ineffective.
    */
    @SerializedName("TablePrivileges")
    @Expose
    private TablePrivilege [] TablePrivileges;

    /**
    * Column permission in the table. Valid values: "SELECT", "INSERT", "UPDATE", "REFERENCES".
Note: When “ModifyAction” is empty, if `ColumnPrivileges` is not passed in, it indicates the permission of the column will become ineffective.
    */
    @SerializedName("ColumnPrivileges")
    @Expose
    private ColumnPrivilege [] ColumnPrivileges;

    /**
    * When this parameter is not empty, it indicates that the permission will be modified. Valid values: `grant` (grant permission), `revoke` (revoke permission)
    */
    @SerializedName("ModifyAction")
    @Expose
    private String ModifyAction;

    /**
     * Get Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page. 
     * @return InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     * @param InstanceId Instance ID in the format of cdb-c1nl9rpv. It is the same as the instance ID displayed on the TencentDB Console page.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Database account, including username and domain name. 
     * @return Accounts Database account, including username and domain name.
     */
    public Account [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set Database account, including username and domain name.
     * @param Accounts Database account, including username and domain name.
     */
    public void setAccounts(Account [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get Global permission. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "PROCESS", "DROP", "REFERENCES", "INDEX", "ALTER", "SHOW DATABASES", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER", "CREATE USER", "RELOAD", "REPLICATION CLIENT", "REPLICATION SLAVE".
Note: When “ModifyAction” is empty, if `GlobalPrivileges` is not passed in, it indicates the global permission will become ineffective. 
     * @return GlobalPrivileges Global permission. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "PROCESS", "DROP", "REFERENCES", "INDEX", "ALTER", "SHOW DATABASES", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER", "CREATE USER", "RELOAD", "REPLICATION CLIENT", "REPLICATION SLAVE".
Note: When “ModifyAction” is empty, if `GlobalPrivileges` is not passed in, it indicates the global permission will become ineffective.
     */
    public String [] getGlobalPrivileges() {
        return this.GlobalPrivileges;
    }

    /**
     * Set Global permission. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "PROCESS", "DROP", "REFERENCES", "INDEX", "ALTER", "SHOW DATABASES", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER", "CREATE USER", "RELOAD", "REPLICATION CLIENT", "REPLICATION SLAVE".
Note: When “ModifyAction” is empty, if `GlobalPrivileges` is not passed in, it indicates the global permission will become ineffective.
     * @param GlobalPrivileges Global permission. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "PROCESS", "DROP", "REFERENCES", "INDEX", "ALTER", "SHOW DATABASES", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER", "CREATE USER", "RELOAD", "REPLICATION CLIENT", "REPLICATION SLAVE".
Note: When “ModifyAction” is empty, if `GlobalPrivileges` is not passed in, it indicates the global permission will become ineffective.
     */
    public void setGlobalPrivileges(String [] GlobalPrivileges) {
        this.GlobalPrivileges = GlobalPrivileges;
    }

    /**
     * Get Database permission. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "REFERENCES", "INDEX", "ALTER", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER".
Note: When “ModifyAction” is empty, if `DatabasePrivileges` is not passed in, it indicates the permission of the database will become ineffective. 
     * @return DatabasePrivileges Database permission. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "REFERENCES", "INDEX", "ALTER", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER".
Note: When “ModifyAction” is empty, if `DatabasePrivileges` is not passed in, it indicates the permission of the database will become ineffective.
     */
    public DatabasePrivilege [] getDatabasePrivileges() {
        return this.DatabasePrivileges;
    }

    /**
     * Set Database permission. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "REFERENCES", "INDEX", "ALTER", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER".
Note: When “ModifyAction” is empty, if `DatabasePrivileges` is not passed in, it indicates the permission of the database will become ineffective.
     * @param DatabasePrivileges Database permission. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "REFERENCES", "INDEX", "ALTER", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER".
Note: When “ModifyAction” is empty, if `DatabasePrivileges` is not passed in, it indicates the permission of the database will become ineffective.
     */
    public void setDatabasePrivileges(DatabasePrivilege [] DatabasePrivileges) {
        this.DatabasePrivileges = DatabasePrivileges;
    }

    /**
     * Get Table permission in the database. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "REFERENCES", "INDEX", "ALTER", "CREATE VIEW", "SHOW VIEW", "TRIGGER".
Note: When “ModifyAction” is empty, if `TablePrivileges` is not passed in, it indicates the permission of the table will become ineffective. 
     * @return TablePrivileges Table permission in the database. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "REFERENCES", "INDEX", "ALTER", "CREATE VIEW", "SHOW VIEW", "TRIGGER".
Note: When “ModifyAction” is empty, if `TablePrivileges` is not passed in, it indicates the permission of the table will become ineffective.
     */
    public TablePrivilege [] getTablePrivileges() {
        return this.TablePrivileges;
    }

    /**
     * Set Table permission in the database. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "REFERENCES", "INDEX", "ALTER", "CREATE VIEW", "SHOW VIEW", "TRIGGER".
Note: When “ModifyAction” is empty, if `TablePrivileges` is not passed in, it indicates the permission of the table will become ineffective.
     * @param TablePrivileges Table permission in the database. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "REFERENCES", "INDEX", "ALTER", "CREATE VIEW", "SHOW VIEW", "TRIGGER".
Note: When “ModifyAction” is empty, if `TablePrivileges` is not passed in, it indicates the permission of the table will become ineffective.
     */
    public void setTablePrivileges(TablePrivilege [] TablePrivileges) {
        this.TablePrivileges = TablePrivileges;
    }

    /**
     * Get Column permission in the table. Valid values: "SELECT", "INSERT", "UPDATE", "REFERENCES".
Note: When “ModifyAction” is empty, if `ColumnPrivileges` is not passed in, it indicates the permission of the column will become ineffective. 
     * @return ColumnPrivileges Column permission in the table. Valid values: "SELECT", "INSERT", "UPDATE", "REFERENCES".
Note: When “ModifyAction” is empty, if `ColumnPrivileges` is not passed in, it indicates the permission of the column will become ineffective.
     */
    public ColumnPrivilege [] getColumnPrivileges() {
        return this.ColumnPrivileges;
    }

    /**
     * Set Column permission in the table. Valid values: "SELECT", "INSERT", "UPDATE", "REFERENCES".
Note: When “ModifyAction” is empty, if `ColumnPrivileges` is not passed in, it indicates the permission of the column will become ineffective.
     * @param ColumnPrivileges Column permission in the table. Valid values: "SELECT", "INSERT", "UPDATE", "REFERENCES".
Note: When “ModifyAction” is empty, if `ColumnPrivileges` is not passed in, it indicates the permission of the column will become ineffective.
     */
    public void setColumnPrivileges(ColumnPrivilege [] ColumnPrivileges) {
        this.ColumnPrivileges = ColumnPrivileges;
    }

    /**
     * Get When this parameter is not empty, it indicates that the permission will be modified. Valid values: `grant` (grant permission), `revoke` (revoke permission) 
     * @return ModifyAction When this parameter is not empty, it indicates that the permission will be modified. Valid values: `grant` (grant permission), `revoke` (revoke permission)
     */
    public String getModifyAction() {
        return this.ModifyAction;
    }

    /**
     * Set When this parameter is not empty, it indicates that the permission will be modified. Valid values: `grant` (grant permission), `revoke` (revoke permission)
     * @param ModifyAction When this parameter is not empty, it indicates that the permission will be modified. Valid values: `grant` (grant permission), `revoke` (revoke permission)
     */
    public void setModifyAction(String ModifyAction) {
        this.ModifyAction = ModifyAction;
    }

    public ModifyAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountPrivilegesRequest(ModifyAccountPrivilegesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Accounts != null) {
            this.Accounts = new Account[source.Accounts.length];
            for (int i = 0; i < source.Accounts.length; i++) {
                this.Accounts[i] = new Account(source.Accounts[i]);
            }
        }
        if (source.GlobalPrivileges != null) {
            this.GlobalPrivileges = new String[source.GlobalPrivileges.length];
            for (int i = 0; i < source.GlobalPrivileges.length; i++) {
                this.GlobalPrivileges[i] = new String(source.GlobalPrivileges[i]);
            }
        }
        if (source.DatabasePrivileges != null) {
            this.DatabasePrivileges = new DatabasePrivilege[source.DatabasePrivileges.length];
            for (int i = 0; i < source.DatabasePrivileges.length; i++) {
                this.DatabasePrivileges[i] = new DatabasePrivilege(source.DatabasePrivileges[i]);
            }
        }
        if (source.TablePrivileges != null) {
            this.TablePrivileges = new TablePrivilege[source.TablePrivileges.length];
            for (int i = 0; i < source.TablePrivileges.length; i++) {
                this.TablePrivileges[i] = new TablePrivilege(source.TablePrivileges[i]);
            }
        }
        if (source.ColumnPrivileges != null) {
            this.ColumnPrivileges = new ColumnPrivilege[source.ColumnPrivileges.length];
            for (int i = 0; i < source.ColumnPrivileges.length; i++) {
                this.ColumnPrivileges[i] = new ColumnPrivilege(source.ColumnPrivileges[i]);
            }
        }
        if (source.ModifyAction != null) {
            this.ModifyAction = new String(source.ModifyAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamArraySimple(map, prefix + "GlobalPrivileges.", this.GlobalPrivileges);
        this.setParamArrayObj(map, prefix + "DatabasePrivileges.", this.DatabasePrivileges);
        this.setParamArrayObj(map, prefix + "TablePrivileges.", this.TablePrivileges);
        this.setParamArrayObj(map, prefix + "ColumnPrivileges.", this.ColumnPrivileges);
        this.setParamSimple(map, prefix + "ModifyAction", this.ModifyAction);

    }
}

