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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountPrivilegesRequest extends AbstractModel{

    /**
    * Instance ID in the format of tdsql-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Database account, including username and host address.
    */
    @SerializedName("Accounts")
    @Expose
    private Account [] Accounts;

    /**
    * Global permission. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "PROCESS", "DROP", "REFERENCES", "INDEX", "ALTER", "SHOW DATABASES", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER".
Note: If the parameter is left empty, no change will be made to the granted global permissions. To clear the granted global permissions, set the parameter to an empty array.
    */
    @SerializedName("GlobalPrivileges")
    @Expose
    private String [] GlobalPrivileges;

    /**
    * Database permission. Value range: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "REFERENCES", "INDEX", "ALTER", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER".	
Note: If the parameter is not passed in, no change will be made to the granted stored procedure permissions. To clear the granted database permissions, set `Privileges` to an empty array.
    */
    @SerializedName("DatabasePrivileges")
    @Expose
    private DatabasePrivilege [] DatabasePrivileges;

    /**
    * Database table permission. Valid values of `Privileges`: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `DROP`, `REFERENCES`, `INDEX`, `ALTER`, `CREATE VIEW`, `SHOW VIEW`, `TRIGGER`.
Note: If the parameter is not passed in, no change will be made to the granted view permissions. To clear the granted table permissions, set `Privileges` to an empty array.
    */
    @SerializedName("TablePrivileges")
    @Expose
    private TablePrivilege [] TablePrivileges;

    /**
    * Column permission in the table. Valid values: "SELECT", "INSERT", "UPDATE", "REFERENCES".
Note: If the parameter is not passed in, no change will be made to the granted column permissions. To clear the granted column permissions, set `Privileges` to an empty array.
    */
    @SerializedName("ColumnPrivileges")
    @Expose
    private ColumnPrivilege [] ColumnPrivileges;

    /**
    * Database view permission. Valid values of `Privileges`: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `DROP`, `REFERENCES`, `INDEX`, `ALTER`, `CREATE VIEW`, `SHOW VIEW`, `TRIGGER`.
Note: If the parameter is not passed in, no change will be made to the granted table permissions. To clear the granted view permissions, set `Privileges` to an empty array.
    */
    @SerializedName("ViewPrivileges")
    @Expose
    private ViewPrivileges [] ViewPrivileges;

    /**
     * Get Instance ID in the format of tdsql-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console. 
     * @return InstanceId Instance ID in the format of tdsql-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of tdsql-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     * @param InstanceId Instance ID in the format of tdsql-c1nl9rpv. It is the same as the instance ID displayed in the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Database account, including username and host address. 
     * @return Accounts Database account, including username and host address.
     */
    public Account [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set Database account, including username and host address.
     * @param Accounts Database account, including username and host address.
     */
    public void setAccounts(Account [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get Global permission. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "PROCESS", "DROP", "REFERENCES", "INDEX", "ALTER", "SHOW DATABASES", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER".
Note: If the parameter is left empty, no change will be made to the granted global permissions. To clear the granted global permissions, set the parameter to an empty array. 
     * @return GlobalPrivileges Global permission. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "PROCESS", "DROP", "REFERENCES", "INDEX", "ALTER", "SHOW DATABASES", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER".
Note: If the parameter is left empty, no change will be made to the granted global permissions. To clear the granted global permissions, set the parameter to an empty array.
     */
    public String [] getGlobalPrivileges() {
        return this.GlobalPrivileges;
    }

    /**
     * Set Global permission. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "PROCESS", "DROP", "REFERENCES", "INDEX", "ALTER", "SHOW DATABASES", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER".
Note: If the parameter is left empty, no change will be made to the granted global permissions. To clear the granted global permissions, set the parameter to an empty array.
     * @param GlobalPrivileges Global permission. Valid values: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "PROCESS", "DROP", "REFERENCES", "INDEX", "ALTER", "SHOW DATABASES", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER".
Note: If the parameter is left empty, no change will be made to the granted global permissions. To clear the granted global permissions, set the parameter to an empty array.
     */
    public void setGlobalPrivileges(String [] GlobalPrivileges) {
        this.GlobalPrivileges = GlobalPrivileges;
    }

    /**
     * Get Database permission. Value range: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "REFERENCES", "INDEX", "ALTER", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER".	
Note: If the parameter is not passed in, no change will be made to the granted stored procedure permissions. To clear the granted database permissions, set `Privileges` to an empty array. 
     * @return DatabasePrivileges Database permission. Value range: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "REFERENCES", "INDEX", "ALTER", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER".	
Note: If the parameter is not passed in, no change will be made to the granted stored procedure permissions. To clear the granted database permissions, set `Privileges` to an empty array.
     */
    public DatabasePrivilege [] getDatabasePrivileges() {
        return this.DatabasePrivileges;
    }

    /**
     * Set Database permission. Value range: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "REFERENCES", "INDEX", "ALTER", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER".	
Note: If the parameter is not passed in, no change will be made to the granted stored procedure permissions. To clear the granted database permissions, set `Privileges` to an empty array.
     * @param DatabasePrivileges Database permission. Value range: "SELECT", "INSERT", "UPDATE", "DELETE", "CREATE", "DROP", "REFERENCES", "INDEX", "ALTER", "CREATE TEMPORARY TABLES", "LOCK TABLES", "EXECUTE", "CREATE VIEW", "SHOW VIEW", "CREATE ROUTINE", "ALTER ROUTINE", "EVENT", "TRIGGER".	
Note: If the parameter is not passed in, no change will be made to the granted stored procedure permissions. To clear the granted database permissions, set `Privileges` to an empty array.
     */
    public void setDatabasePrivileges(DatabasePrivilege [] DatabasePrivileges) {
        this.DatabasePrivileges = DatabasePrivileges;
    }

    /**
     * Get Database table permission. Valid values of `Privileges`: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `DROP`, `REFERENCES`, `INDEX`, `ALTER`, `CREATE VIEW`, `SHOW VIEW`, `TRIGGER`.
Note: If the parameter is not passed in, no change will be made to the granted view permissions. To clear the granted table permissions, set `Privileges` to an empty array. 
     * @return TablePrivileges Database table permission. Valid values of `Privileges`: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `DROP`, `REFERENCES`, `INDEX`, `ALTER`, `CREATE VIEW`, `SHOW VIEW`, `TRIGGER`.
Note: If the parameter is not passed in, no change will be made to the granted view permissions. To clear the granted table permissions, set `Privileges` to an empty array.
     */
    public TablePrivilege [] getTablePrivileges() {
        return this.TablePrivileges;
    }

    /**
     * Set Database table permission. Valid values of `Privileges`: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `DROP`, `REFERENCES`, `INDEX`, `ALTER`, `CREATE VIEW`, `SHOW VIEW`, `TRIGGER`.
Note: If the parameter is not passed in, no change will be made to the granted view permissions. To clear the granted table permissions, set `Privileges` to an empty array.
     * @param TablePrivileges Database table permission. Valid values of `Privileges`: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `DROP`, `REFERENCES`, `INDEX`, `ALTER`, `CREATE VIEW`, `SHOW VIEW`, `TRIGGER`.
Note: If the parameter is not passed in, no change will be made to the granted view permissions. To clear the granted table permissions, set `Privileges` to an empty array.
     */
    public void setTablePrivileges(TablePrivilege [] TablePrivileges) {
        this.TablePrivileges = TablePrivileges;
    }

    /**
     * Get Column permission in the table. Valid values: "SELECT", "INSERT", "UPDATE", "REFERENCES".
Note: If the parameter is not passed in, no change will be made to the granted column permissions. To clear the granted column permissions, set `Privileges` to an empty array. 
     * @return ColumnPrivileges Column permission in the table. Valid values: "SELECT", "INSERT", "UPDATE", "REFERENCES".
Note: If the parameter is not passed in, no change will be made to the granted column permissions. To clear the granted column permissions, set `Privileges` to an empty array.
     */
    public ColumnPrivilege [] getColumnPrivileges() {
        return this.ColumnPrivileges;
    }

    /**
     * Set Column permission in the table. Valid values: "SELECT", "INSERT", "UPDATE", "REFERENCES".
Note: If the parameter is not passed in, no change will be made to the granted column permissions. To clear the granted column permissions, set `Privileges` to an empty array.
     * @param ColumnPrivileges Column permission in the table. Valid values: "SELECT", "INSERT", "UPDATE", "REFERENCES".
Note: If the parameter is not passed in, no change will be made to the granted column permissions. To clear the granted column permissions, set `Privileges` to an empty array.
     */
    public void setColumnPrivileges(ColumnPrivilege [] ColumnPrivileges) {
        this.ColumnPrivileges = ColumnPrivileges;
    }

    /**
     * Get Database view permission. Valid values of `Privileges`: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `DROP`, `REFERENCES`, `INDEX`, `ALTER`, `CREATE VIEW`, `SHOW VIEW`, `TRIGGER`.
Note: If the parameter is not passed in, no change will be made to the granted table permissions. To clear the granted view permissions, set `Privileges` to an empty array. 
     * @return ViewPrivileges Database view permission. Valid values of `Privileges`: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `DROP`, `REFERENCES`, `INDEX`, `ALTER`, `CREATE VIEW`, `SHOW VIEW`, `TRIGGER`.
Note: If the parameter is not passed in, no change will be made to the granted table permissions. To clear the granted view permissions, set `Privileges` to an empty array.
     */
    public ViewPrivileges [] getViewPrivileges() {
        return this.ViewPrivileges;
    }

    /**
     * Set Database view permission. Valid values of `Privileges`: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `DROP`, `REFERENCES`, `INDEX`, `ALTER`, `CREATE VIEW`, `SHOW VIEW`, `TRIGGER`.
Note: If the parameter is not passed in, no change will be made to the granted table permissions. To clear the granted view permissions, set `Privileges` to an empty array.
     * @param ViewPrivileges Database view permission. Valid values of `Privileges`: `SELECT`, `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `DROP`, `REFERENCES`, `INDEX`, `ALTER`, `CREATE VIEW`, `SHOW VIEW`, `TRIGGER`.
Note: If the parameter is not passed in, no change will be made to the granted table permissions. To clear the granted view permissions, set `Privileges` to an empty array.
     */
    public void setViewPrivileges(ViewPrivileges [] ViewPrivileges) {
        this.ViewPrivileges = ViewPrivileges;
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
        if (source.ViewPrivileges != null) {
            this.ViewPrivileges = new ViewPrivileges[source.ViewPrivileges.length];
            for (int i = 0; i < source.ViewPrivileges.length; i++) {
                this.ViewPrivileges[i] = new ViewPrivileges(source.ViewPrivileges[i]);
            }
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
        this.setParamArrayObj(map, prefix + "ViewPrivileges.", this.ViewPrivileges);

    }
}

