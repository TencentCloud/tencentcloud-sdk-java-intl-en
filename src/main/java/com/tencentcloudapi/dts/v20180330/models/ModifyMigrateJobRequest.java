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

public class ModifyMigrateJobRequest extends AbstractModel{

    /**
    * ID of the data migration task to be modified
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

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
    * Source instance access type. Valid values: extranet (public network), cvm (CVM-based self-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance)
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
    * Target instance access type. Valid values: extranet (public network), cvm (CVM-based self-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance). Currently, only `cdb` is supported
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * Target instance information. The region where the target instance is located cannot be modified.
    */
    @SerializedName("DstInfo")
    @Expose
    private DstInfo DstInfo;

    /**
    * When migrating the specified table, you need to set the information of the source database table to be migrated, which should be described in JSON string format. Below are examples.

For databases with a database-table structure:
[{"Database":"db1","Table":["table1","table2"]},{"Database":"db2"}]
For databases with a database-schema-table structure:
[{"Database":"db1","Schema":"s1","Table":["table1","table2"]},{"Database":"db1","Schema":"s2","Table":["table1","table2"]},{"Database":"db2","Schema":"s1","Table":["table1","table2"]},{"Database":"db3"},{"Database":"db4","Schema":"s1"}]

This field does not need to be set when the entire instance is to be migrated
    */
    @SerializedName("DatabaseInfo")
    @Expose
    private String DatabaseInfo;

    /**
    * Source instance type. `simple`: Primary/Secondary node; `cluster`: Cluster node. If this field is left empty, the value defaults to primary/secondary node.
    */
    @SerializedName("SrcNodeType")
    @Expose
    private String SrcNodeType;

    /**
    * Source instance information, which is correlated with the migration task type.
    */
    @SerializedName("SrcInfoMulti")
    @Expose
    private SrcInfo [] SrcInfoMulti;

    /**
     * Get ID of the data migration task to be modified 
     * @return JobId ID of the data migration task to be modified
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set ID of the data migration task to be modified
     * @param JobId ID of the data migration task to be modified
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

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
     * Get Source instance access type. Valid values: extranet (public network), cvm (CVM-based self-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance) 
     * @return SrcAccessType Source instance access type. Valid values: extranet (public network), cvm (CVM-based self-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance)
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set Source instance access type. Valid values: extranet (public network), cvm (CVM-based self-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance)
     * @param SrcAccessType Source instance access type. Valid values: extranet (public network), cvm (CVM-based self-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance)
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
     * Get Target instance access type. Valid values: extranet (public network), cvm (CVM-based self-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance). Currently, only `cdb` is supported 
     * @return DstAccessType Target instance access type. Valid values: extranet (public network), cvm (CVM-based self-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance). Currently, only `cdb` is supported
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set Target instance access type. Valid values: extranet (public network), cvm (CVM-based self-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance). Currently, only `cdb` is supported
     * @param DstAccessType Target instance access type. Valid values: extranet (public network), cvm (CVM-based self-created instance), dcg (Direct Connect-enabled instance), vpncloud (Tencent Cloud VPN-enabled instance), cdb (TencentDB instance). Currently, only `cdb` is supported
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get Target instance information. The region where the target instance is located cannot be modified. 
     * @return DstInfo Target instance information. The region where the target instance is located cannot be modified.
     */
    public DstInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set Target instance information. The region where the target instance is located cannot be modified.
     * @param DstInfo Target instance information. The region where the target instance is located cannot be modified.
     */
    public void setDstInfo(DstInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get When migrating the specified table, you need to set the information of the source database table to be migrated, which should be described in JSON string format. Below are examples.

For databases with a database-table structure:
[{"Database":"db1","Table":["table1","table2"]},{"Database":"db2"}]
For databases with a database-schema-table structure:
[{"Database":"db1","Schema":"s1","Table":["table1","table2"]},{"Database":"db1","Schema":"s2","Table":["table1","table2"]},{"Database":"db2","Schema":"s1","Table":["table1","table2"]},{"Database":"db3"},{"Database":"db4","Schema":"s1"}]

This field does not need to be set when the entire instance is to be migrated 
     * @return DatabaseInfo When migrating the specified table, you need to set the information of the source database table to be migrated, which should be described in JSON string format. Below are examples.

For databases with a database-table structure:
[{"Database":"db1","Table":["table1","table2"]},{"Database":"db2"}]
For databases with a database-schema-table structure:
[{"Database":"db1","Schema":"s1","Table":["table1","table2"]},{"Database":"db1","Schema":"s2","Table":["table1","table2"]},{"Database":"db2","Schema":"s1","Table":["table1","table2"]},{"Database":"db3"},{"Database":"db4","Schema":"s1"}]

This field does not need to be set when the entire instance is to be migrated
     */
    public String getDatabaseInfo() {
        return this.DatabaseInfo;
    }

    /**
     * Set When migrating the specified table, you need to set the information of the source database table to be migrated, which should be described in JSON string format. Below are examples.

For databases with a database-table structure:
[{"Database":"db1","Table":["table1","table2"]},{"Database":"db2"}]
For databases with a database-schema-table structure:
[{"Database":"db1","Schema":"s1","Table":["table1","table2"]},{"Database":"db1","Schema":"s2","Table":["table1","table2"]},{"Database":"db2","Schema":"s1","Table":["table1","table2"]},{"Database":"db3"},{"Database":"db4","Schema":"s1"}]

This field does not need to be set when the entire instance is to be migrated
     * @param DatabaseInfo When migrating the specified table, you need to set the information of the source database table to be migrated, which should be described in JSON string format. Below are examples.

For databases with a database-table structure:
[{"Database":"db1","Table":["table1","table2"]},{"Database":"db2"}]
For databases with a database-schema-table structure:
[{"Database":"db1","Schema":"s1","Table":["table1","table2"]},{"Database":"db1","Schema":"s2","Table":["table1","table2"]},{"Database":"db2","Schema":"s1","Table":["table1","table2"]},{"Database":"db3"},{"Database":"db4","Schema":"s1"}]

This field does not need to be set when the entire instance is to be migrated
     */
    public void setDatabaseInfo(String DatabaseInfo) {
        this.DatabaseInfo = DatabaseInfo;
    }

    /**
     * Get Source instance type. `simple`: Primary/Secondary node; `cluster`: Cluster node. If this field is left empty, the value defaults to primary/secondary node. 
     * @return SrcNodeType Source instance type. `simple`: Primary/Secondary node; `cluster`: Cluster node. If this field is left empty, the value defaults to primary/secondary node.
     */
    public String getSrcNodeType() {
        return this.SrcNodeType;
    }

    /**
     * Set Source instance type. `simple`: Primary/Secondary node; `cluster`: Cluster node. If this field is left empty, the value defaults to primary/secondary node.
     * @param SrcNodeType Source instance type. `simple`: Primary/Secondary node; `cluster`: Cluster node. If this field is left empty, the value defaults to primary/secondary node.
     */
    public void setSrcNodeType(String SrcNodeType) {
        this.SrcNodeType = SrcNodeType;
    }

    /**
     * Get Source instance information, which is correlated with the migration task type. 
     * @return SrcInfoMulti Source instance information, which is correlated with the migration task type.
     */
    public SrcInfo [] getSrcInfoMulti() {
        return this.SrcInfoMulti;
    }

    /**
     * Set Source instance information, which is correlated with the migration task type.
     * @param SrcInfoMulti Source instance information, which is correlated with the migration task type.
     */
    public void setSrcInfoMulti(SrcInfo [] SrcInfoMulti) {
        this.SrcInfoMulti = SrcInfoMulti;
    }

    public ModifyMigrateJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMigrateJobRequest(ModifyMigrateJobRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.MigrateOption != null) {
            this.MigrateOption = new MigrateOption(source.MigrateOption);
        }
        if (source.SrcAccessType != null) {
            this.SrcAccessType = new String(source.SrcAccessType);
        }
        if (source.SrcInfo != null) {
            this.SrcInfo = new SrcInfo(source.SrcInfo);
        }
        if (source.DstAccessType != null) {
            this.DstAccessType = new String(source.DstAccessType);
        }
        if (source.DstInfo != null) {
            this.DstInfo = new DstInfo(source.DstInfo);
        }
        if (source.DatabaseInfo != null) {
            this.DatabaseInfo = new String(source.DatabaseInfo);
        }
        if (source.SrcNodeType != null) {
            this.SrcNodeType = new String(source.SrcNodeType);
        }
        if (source.SrcInfoMulti != null) {
            this.SrcInfoMulti = new SrcInfo[source.SrcInfoMulti.length];
            for (int i = 0; i < source.SrcInfoMulti.length; i++) {
                this.SrcInfoMulti[i] = new SrcInfo(source.SrcInfoMulti[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamObj(map, prefix + "MigrateOption.", this.MigrateOption);
        this.setParamSimple(map, prefix + "SrcAccessType", this.SrcAccessType);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamSimple(map, prefix + "DstAccessType", this.DstAccessType);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamSimple(map, prefix + "DatabaseInfo", this.DatabaseInfo);
        this.setParamSimple(map, prefix + "SrcNodeType", this.SrcNodeType);
        this.setParamArrayObj(map, prefix + "SrcInfoMulti.", this.SrcInfoMulti);

    }
}

