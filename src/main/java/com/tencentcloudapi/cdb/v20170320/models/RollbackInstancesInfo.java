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

public class RollbackInstancesInfo extends AbstractModel{

    /**
    * TencentDB instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Rollback policy. Value range: table, db, full. Default value: full. Table: expedited rollback mode, where only the selected table-level backups and binlogs are imported; for cross-table rollback, if the associated tables are not selected simultaneously, the rollback will fail; the parameter `Databases` must be empty under this mode. db: fast rollback mode, where only the selected database-level backups and binlogs are imported; for cross-database rollback, if the associated databases are not selected simultaneously, the rollback will fail. full: ordinary rollback mode, which imports all the backups and binlogs of the instance at a relatively low speed.
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * Database rollback time in the format of yyyy-mm-dd hh:mm:ss
    */
    @SerializedName("RollbackTime")
    @Expose
    private String RollbackTime;

    /**
    * Information of the databases to be rolled back, which means rollback at the database level
    */
    @SerializedName("Databases")
    @Expose
    private RollbackDBName [] Databases;

    /**
    * Information of the tables to be rolled back, which means rollback at the table level
    */
    @SerializedName("Tables")
    @Expose
    private RollbackTables [] Tables;

    /**
     * Get TencentDB instance ID 
     * @return InstanceId TencentDB instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set TencentDB instance ID
     * @param InstanceId TencentDB instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Rollback policy. Value range: table, db, full. Default value: full. Table: expedited rollback mode, where only the selected table-level backups and binlogs are imported; for cross-table rollback, if the associated tables are not selected simultaneously, the rollback will fail; the parameter `Databases` must be empty under this mode. db: fast rollback mode, where only the selected database-level backups and binlogs are imported; for cross-database rollback, if the associated databases are not selected simultaneously, the rollback will fail. full: ordinary rollback mode, which imports all the backups and binlogs of the instance at a relatively low speed. 
     * @return Strategy Rollback policy. Value range: table, db, full. Default value: full. Table: expedited rollback mode, where only the selected table-level backups and binlogs are imported; for cross-table rollback, if the associated tables are not selected simultaneously, the rollback will fail; the parameter `Databases` must be empty under this mode. db: fast rollback mode, where only the selected database-level backups and binlogs are imported; for cross-database rollback, if the associated databases are not selected simultaneously, the rollback will fail. full: ordinary rollback mode, which imports all the backups and binlogs of the instance at a relatively low speed.
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Rollback policy. Value range: table, db, full. Default value: full. Table: expedited rollback mode, where only the selected table-level backups and binlogs are imported; for cross-table rollback, if the associated tables are not selected simultaneously, the rollback will fail; the parameter `Databases` must be empty under this mode. db: fast rollback mode, where only the selected database-level backups and binlogs are imported; for cross-database rollback, if the associated databases are not selected simultaneously, the rollback will fail. full: ordinary rollback mode, which imports all the backups and binlogs of the instance at a relatively low speed.
     * @param Strategy Rollback policy. Value range: table, db, full. Default value: full. Table: expedited rollback mode, where only the selected table-level backups and binlogs are imported; for cross-table rollback, if the associated tables are not selected simultaneously, the rollback will fail; the parameter `Databases` must be empty under this mode. db: fast rollback mode, where only the selected database-level backups and binlogs are imported; for cross-database rollback, if the associated databases are not selected simultaneously, the rollback will fail. full: ordinary rollback mode, which imports all the backups and binlogs of the instance at a relatively low speed.
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get Database rollback time in the format of yyyy-mm-dd hh:mm:ss 
     * @return RollbackTime Database rollback time in the format of yyyy-mm-dd hh:mm:ss
     */
    public String getRollbackTime() {
        return this.RollbackTime;
    }

    /**
     * Set Database rollback time in the format of yyyy-mm-dd hh:mm:ss
     * @param RollbackTime Database rollback time in the format of yyyy-mm-dd hh:mm:ss
     */
    public void setRollbackTime(String RollbackTime) {
        this.RollbackTime = RollbackTime;
    }

    /**
     * Get Information of the databases to be rolled back, which means rollback at the database level 
     * @return Databases Information of the databases to be rolled back, which means rollback at the database level
     */
    public RollbackDBName [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set Information of the databases to be rolled back, which means rollback at the database level
     * @param Databases Information of the databases to be rolled back, which means rollback at the database level
     */
    public void setDatabases(RollbackDBName [] Databases) {
        this.Databases = Databases;
    }

    /**
     * Get Information of the tables to be rolled back, which means rollback at the table level 
     * @return Tables Information of the tables to be rolled back, which means rollback at the table level
     */
    public RollbackTables [] getTables() {
        return this.Tables;
    }

    /**
     * Set Information of the tables to be rolled back, which means rollback at the table level
     * @param Tables Information of the tables to be rolled back, which means rollback at the table level
     */
    public void setTables(RollbackTables [] Tables) {
        this.Tables = Tables;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "RollbackTime", this.RollbackTime);
        this.setParamArrayObj(map, prefix + "Databases.", this.Databases);
        this.setParamArrayObj(map, prefix + "Tables.", this.Tables);

    }
}

