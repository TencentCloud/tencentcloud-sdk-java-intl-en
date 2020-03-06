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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMigrateJobRequest extends AbstractModel{

    /**
    * Data migration task name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * Migration task configuration options
    */
    @SerializedName("MigrateOption")
    @Expose
    private MigrateOption MigrateOption;

    /**
    * Source instance database type, which currently supports MySQL, Redis, MongoDB, PostgreSQL, MariaDB, and Percona. For more information on the supported types in a specific region, see the migration task creation page in the console.
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * Source instance access type. Value range: extranet (public network), cvm (CVM-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance), ccn (CCN instances)
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * Source instance information, which is correlated with the migration task type
    */
    @SerializedName("SrcInfo")
    @Expose
    private SrcInfo SrcInfo;

    /**
    * Target instance access type, which currently supports MySQL, Redis, MongoDB, PostgreSQL, MariaDB, and Percona. For more information on the supported types in a specific region, see the migration task creation page in the console.
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
    * Target instance access type, which currently only supports cdb (TencentDB instance)
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * Destination instance information
    */
    @SerializedName("DstInfo")
    @Expose
    private DstInfo DstInfo;

    /**
    * Information of the source table to be migrated, which is described in JSON string format. It is required if MigrateOption.MigrateObject is 2 (migrating the specified table).
For databases with a database-table structure:
[{Database:db1,Table:[table1,table2]},{Database:db2}]
For databases with a database-schema-table structure:
[{Database:db1,Schema:s1
Table:[table1,table2]},{Database:db1,Schema:s2
Table:[table1,table2]},{Database:db2,Schema:s1
Table:[table1,table2]},{Database:db3},{Database:db4
Schema:s1}]
    */
    @SerializedName("DatabaseInfo")
    @Expose
    private String DatabaseInfo;

    /**
     * Get Data migration task name 
     * @return JobName Data migration task name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Data migration task name
     * @param JobName Data migration task name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get Migration task configuration options 
     * @return MigrateOption Migration task configuration options
     */
    public MigrateOption getMigrateOption() {
        return this.MigrateOption;
    }

    /**
     * Set Migration task configuration options
     * @param MigrateOption Migration task configuration options
     */
    public void setMigrateOption(MigrateOption MigrateOption) {
        this.MigrateOption = MigrateOption;
    }

    /**
     * Get Source instance database type, which currently supports MySQL, Redis, MongoDB, PostgreSQL, MariaDB, and Percona. For more information on the supported types in a specific region, see the migration task creation page in the console. 
     * @return SrcDatabaseType Source instance database type, which currently supports MySQL, Redis, MongoDB, PostgreSQL, MariaDB, and Percona. For more information on the supported types in a specific region, see the migration task creation page in the console.
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set Source instance database type, which currently supports MySQL, Redis, MongoDB, PostgreSQL, MariaDB, and Percona. For more information on the supported types in a specific region, see the migration task creation page in the console.
     * @param SrcDatabaseType Source instance database type, which currently supports MySQL, Redis, MongoDB, PostgreSQL, MariaDB, and Percona. For more information on the supported types in a specific region, see the migration task creation page in the console.
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get Source instance access type. Value range: extranet (public network), cvm (CVM-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance), ccn (CCN instances) 
     * @return SrcAccessType Source instance access type. Value range: extranet (public network), cvm (CVM-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance), ccn (CCN instances)
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set Source instance access type. Value range: extranet (public network), cvm (CVM-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance), ccn (CCN instances)
     * @param SrcAccessType Source instance access type. Value range: extranet (public network), cvm (CVM-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance), ccn (CCN instances)
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get Source instance information, which is correlated with the migration task type 
     * @return SrcInfo Source instance information, which is correlated with the migration task type
     */
    public SrcInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set Source instance information, which is correlated with the migration task type
     * @param SrcInfo Source instance information, which is correlated with the migration task type
     */
    public void setSrcInfo(SrcInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get Target instance access type, which currently supports MySQL, Redis, MongoDB, PostgreSQL, MariaDB, and Percona. For more information on the supported types in a specific region, see the migration task creation page in the console. 
     * @return DstDatabaseType Target instance access type, which currently supports MySQL, Redis, MongoDB, PostgreSQL, MariaDB, and Percona. For more information on the supported types in a specific region, see the migration task creation page in the console.
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set Target instance access type, which currently supports MySQL, Redis, MongoDB, PostgreSQL, MariaDB, and Percona. For more information on the supported types in a specific region, see the migration task creation page in the console.
     * @param DstDatabaseType Target instance access type, which currently supports MySQL, Redis, MongoDB, PostgreSQL, MariaDB, and Percona. For more information on the supported types in a specific region, see the migration task creation page in the console.
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get Target instance access type, which currently only supports cdb (TencentDB instance) 
     * @return DstAccessType Target instance access type, which currently only supports cdb (TencentDB instance)
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set Target instance access type, which currently only supports cdb (TencentDB instance)
     * @param DstAccessType Target instance access type, which currently only supports cdb (TencentDB instance)
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get Destination instance information 
     * @return DstInfo Destination instance information
     */
    public DstInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set Destination instance information
     * @param DstInfo Destination instance information
     */
    public void setDstInfo(DstInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get Information of the source table to be migrated, which is described in JSON string format. It is required if MigrateOption.MigrateObject is 2 (migrating the specified table).
For databases with a database-table structure:
[{Database:db1,Table:[table1,table2]},{Database:db2}]
For databases with a database-schema-table structure:
[{Database:db1,Schema:s1
Table:[table1,table2]},{Database:db1,Schema:s2
Table:[table1,table2]},{Database:db2,Schema:s1
Table:[table1,table2]},{Database:db3},{Database:db4
Schema:s1}] 
     * @return DatabaseInfo Information of the source table to be migrated, which is described in JSON string format. It is required if MigrateOption.MigrateObject is 2 (migrating the specified table).
For databases with a database-table structure:
[{Database:db1,Table:[table1,table2]},{Database:db2}]
For databases with a database-schema-table structure:
[{Database:db1,Schema:s1
Table:[table1,table2]},{Database:db1,Schema:s2
Table:[table1,table2]},{Database:db2,Schema:s1
Table:[table1,table2]},{Database:db3},{Database:db4
Schema:s1}]
     */
    public String getDatabaseInfo() {
        return this.DatabaseInfo;
    }

    /**
     * Set Information of the source table to be migrated, which is described in JSON string format. It is required if MigrateOption.MigrateObject is 2 (migrating the specified table).
For databases with a database-table structure:
[{Database:db1,Table:[table1,table2]},{Database:db2}]
For databases with a database-schema-table structure:
[{Database:db1,Schema:s1
Table:[table1,table2]},{Database:db1,Schema:s2
Table:[table1,table2]},{Database:db2,Schema:s1
Table:[table1,table2]},{Database:db3},{Database:db4
Schema:s1}]
     * @param DatabaseInfo Information of the source table to be migrated, which is described in JSON string format. It is required if MigrateOption.MigrateObject is 2 (migrating the specified table).
For databases with a database-table structure:
[{Database:db1,Table:[table1,table2]},{Database:db2}]
For databases with a database-schema-table structure:
[{Database:db1,Schema:s1
Table:[table1,table2]},{Database:db1,Schema:s2
Table:[table1,table2]},{Database:db2,Schema:s1
Table:[table1,table2]},{Database:db3},{Database:db4
Schema:s1}]
     */
    public void setDatabaseInfo(String DatabaseInfo) {
        this.DatabaseInfo = DatabaseInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamObj(map, prefix + "MigrateOption.", this.MigrateOption);
        this.setParamSimple(map, prefix + "SrcDatabaseType", this.SrcDatabaseType);
        this.setParamSimple(map, prefix + "SrcAccessType", this.SrcAccessType);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamSimple(map, prefix + "DstDatabaseType", this.DstDatabaseType);
        this.setParamSimple(map, prefix + "DstAccessType", this.DstAccessType);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamSimple(map, prefix + "DatabaseInfo", this.DatabaseInfo);

    }
}

