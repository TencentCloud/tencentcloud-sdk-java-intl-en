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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMigrationRequest extends AbstractModel{

    /**
    * Migration task name
    */
    @SerializedName("MigrateName")
    @Expose
    private String MigrateName;

    /**
    * Migration type (1: structure migration, 2: data migration, 3: incremental sync)
    */
    @SerializedName("MigrateType")
    @Expose
    private Long MigrateType;

    /**
    * Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode)
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Migration source
    */
    @SerializedName("Source")
    @Expose
    private MigrateSource Source;

    /**
    * Migration target
    */
    @SerializedName("Target")
    @Expose
    private MigrateTarget Target;

    /**
    * Database objects to be migrated. This parameter is not used for offline migration (SourceType=4 or SourceType=5)
    */
    @SerializedName("MigrateDBSet")
    @Expose
    private MigrateDB [] MigrateDBSet;

    /**
    * Restore and rename the databases listed in `ReNameRestoreDatabase`. If this parameter is left empty, all restored databases will be renamed in the default format. This parameter takes effect only when `SourceType=5`.
    */
    @SerializedName("RenameRestore")
    @Expose
    private RenameRestoreDatabase [] RenameRestore;

    /**
     * Get Migration task name 
     * @return MigrateName Migration task name
     */
    public String getMigrateName() {
        return this.MigrateName;
    }

    /**
     * Set Migration task name
     * @param MigrateName Migration task name
     */
    public void setMigrateName(String MigrateName) {
        this.MigrateName = MigrateName;
    }

    /**
     * Get Migration type (1: structure migration, 2: data migration, 3: incremental sync) 
     * @return MigrateType Migration type (1: structure migration, 2: data migration, 3: incremental sync)
     */
    public Long getMigrateType() {
        return this.MigrateType;
    }

    /**
     * Set Migration type (1: structure migration, 2: data migration, 3: incremental sync)
     * @param MigrateType Migration type (1: structure migration, 2: data migration, 3: incremental sync)
     */
    public void setMigrateType(Long MigrateType) {
        this.MigrateType = MigrateType;
    }

    /**
     * Get Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode) 
     * @return SourceType Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode)
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode)
     * @param SourceType Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode)
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Migration source 
     * @return Source Migration source
     */
    public MigrateSource getSource() {
        return this.Source;
    }

    /**
     * Set Migration source
     * @param Source Migration source
     */
    public void setSource(MigrateSource Source) {
        this.Source = Source;
    }

    /**
     * Get Migration target 
     * @return Target Migration target
     */
    public MigrateTarget getTarget() {
        return this.Target;
    }

    /**
     * Set Migration target
     * @param Target Migration target
     */
    public void setTarget(MigrateTarget Target) {
        this.Target = Target;
    }

    /**
     * Get Database objects to be migrated. This parameter is not used for offline migration (SourceType=4 or SourceType=5) 
     * @return MigrateDBSet Database objects to be migrated. This parameter is not used for offline migration (SourceType=4 or SourceType=5)
     */
    public MigrateDB [] getMigrateDBSet() {
        return this.MigrateDBSet;
    }

    /**
     * Set Database objects to be migrated. This parameter is not used for offline migration (SourceType=4 or SourceType=5)
     * @param MigrateDBSet Database objects to be migrated. This parameter is not used for offline migration (SourceType=4 or SourceType=5)
     */
    public void setMigrateDBSet(MigrateDB [] MigrateDBSet) {
        this.MigrateDBSet = MigrateDBSet;
    }

    /**
     * Get Restore and rename the databases listed in `ReNameRestoreDatabase`. If this parameter is left empty, all restored databases will be renamed in the default format. This parameter takes effect only when `SourceType=5`. 
     * @return RenameRestore Restore and rename the databases listed in `ReNameRestoreDatabase`. If this parameter is left empty, all restored databases will be renamed in the default format. This parameter takes effect only when `SourceType=5`.
     */
    public RenameRestoreDatabase [] getRenameRestore() {
        return this.RenameRestore;
    }

    /**
     * Set Restore and rename the databases listed in `ReNameRestoreDatabase`. If this parameter is left empty, all restored databases will be renamed in the default format. This parameter takes effect only when `SourceType=5`.
     * @param RenameRestore Restore and rename the databases listed in `ReNameRestoreDatabase`. If this parameter is left empty, all restored databases will be renamed in the default format. This parameter takes effect only when `SourceType=5`.
     */
    public void setRenameRestore(RenameRestoreDatabase [] RenameRestore) {
        this.RenameRestore = RenameRestore;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MigrateName", this.MigrateName);
        this.setParamSimple(map, prefix + "MigrateType", this.MigrateType);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamObj(map, prefix + "Source.", this.Source);
        this.setParamObj(map, prefix + "Target.", this.Target);
        this.setParamArrayObj(map, prefix + "MigrateDBSet.", this.MigrateDBSet);
        this.setParamArrayObj(map, prefix + "RenameRestore.", this.RenameRestore);

    }
}

