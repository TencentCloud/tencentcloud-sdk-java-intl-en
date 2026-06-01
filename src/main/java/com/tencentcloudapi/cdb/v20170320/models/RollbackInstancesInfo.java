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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackInstancesInfo extends AbstractModel {

    /**
    * Cloud database instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Rollback strategy. Optional values: table, db, full. table - Ultra-fast rollback mode, only imports selected table-level backups and binlog. If there are cross-table operations and the associated table hasn't been selected, it will cause rollback failure. In this mode, parameter Databases must be empty. db - Quick mode, only imports selected database-level backups and binlog. If there are cross-database operations and the associated database hasn't been selected, it will cause rollback failure. full - Standard rollback mode, imports backups and binlog of the entire instance, speed is not as fast.
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * Database rollback time in the format of yyyy-mm-dd hh:mm:ss.
    */
    @SerializedName("RollbackTime")
    @Expose
    private String RollbackTime;

    /**
    * Database information to be rolled back, which means database rollback.
    */
    @SerializedName("Databases")
    @Expose
    private RollbackDBName [] Databases;

    /**
    * Database table information to be rolled back, which means rollback by table.
    */
    @SerializedName("Tables")
    @Expose
    private RollbackTables [] Tables;

    /**
     * Get Cloud database instance ID. 
     * @return InstanceId Cloud database instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cloud database instance ID.
     * @param InstanceId Cloud database instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Rollback strategy. Optional values: table, db, full. table - Ultra-fast rollback mode, only imports selected table-level backups and binlog. If there are cross-table operations and the associated table hasn't been selected, it will cause rollback failure. In this mode, parameter Databases must be empty. db - Quick mode, only imports selected database-level backups and binlog. If there are cross-database operations and the associated database hasn't been selected, it will cause rollback failure. full - Standard rollback mode, imports backups and binlog of the entire instance, speed is not as fast. 
     * @return Strategy Rollback strategy. Optional values: table, db, full. table - Ultra-fast rollback mode, only imports selected table-level backups and binlog. If there are cross-table operations and the associated table hasn't been selected, it will cause rollback failure. In this mode, parameter Databases must be empty. db - Quick mode, only imports selected database-level backups and binlog. If there are cross-database operations and the associated database hasn't been selected, it will cause rollback failure. full - Standard rollback mode, imports backups and binlog of the entire instance, speed is not as fast.
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Rollback strategy. Optional values: table, db, full. table - Ultra-fast rollback mode, only imports selected table-level backups and binlog. If there are cross-table operations and the associated table hasn't been selected, it will cause rollback failure. In this mode, parameter Databases must be empty. db - Quick mode, only imports selected database-level backups and binlog. If there are cross-database operations and the associated database hasn't been selected, it will cause rollback failure. full - Standard rollback mode, imports backups and binlog of the entire instance, speed is not as fast.
     * @param Strategy Rollback strategy. Optional values: table, db, full. table - Ultra-fast rollback mode, only imports selected table-level backups and binlog. If there are cross-table operations and the associated table hasn't been selected, it will cause rollback failure. In this mode, parameter Databases must be empty. db - Quick mode, only imports selected database-level backups and binlog. If there are cross-database operations and the associated database hasn't been selected, it will cause rollback failure. full - Standard rollback mode, imports backups and binlog of the entire instance, speed is not as fast.
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get Database rollback time in the format of yyyy-mm-dd hh:mm:ss. 
     * @return RollbackTime Database rollback time in the format of yyyy-mm-dd hh:mm:ss.
     */
    public String getRollbackTime() {
        return this.RollbackTime;
    }

    /**
     * Set Database rollback time in the format of yyyy-mm-dd hh:mm:ss.
     * @param RollbackTime Database rollback time in the format of yyyy-mm-dd hh:mm:ss.
     */
    public void setRollbackTime(String RollbackTime) {
        this.RollbackTime = RollbackTime;
    }

    /**
     * Get Database information to be rolled back, which means database rollback. 
     * @return Databases Database information to be rolled back, which means database rollback.
     */
    public RollbackDBName [] getDatabases() {
        return this.Databases;
    }

    /**
     * Set Database information to be rolled back, which means database rollback.
     * @param Databases Database information to be rolled back, which means database rollback.
     */
    public void setDatabases(RollbackDBName [] Databases) {
        this.Databases = Databases;
    }

    /**
     * Get Database table information to be rolled back, which means rollback by table. 
     * @return Tables Database table information to be rolled back, which means rollback by table.
     */
    public RollbackTables [] getTables() {
        return this.Tables;
    }

    /**
     * Set Database table information to be rolled back, which means rollback by table.
     * @param Tables Database table information to be rolled back, which means rollback by table.
     */
    public void setTables(RollbackTables [] Tables) {
        this.Tables = Tables;
    }

    public RollbackInstancesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackInstancesInfo(RollbackInstancesInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.RollbackTime != null) {
            this.RollbackTime = new String(source.RollbackTime);
        }
        if (source.Databases != null) {
            this.Databases = new RollbackDBName[source.Databases.length];
            for (int i = 0; i < source.Databases.length; i++) {
                this.Databases[i] = new RollbackDBName(source.Databases[i]);
            }
        }
        if (source.Tables != null) {
            this.Tables = new RollbackTables[source.Tables.length];
            for (int i = 0; i < source.Tables.length; i++) {
                this.Tables[i] = new RollbackTables(source.Tables[i]);
            }
        }
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

