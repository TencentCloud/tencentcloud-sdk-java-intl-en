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

public class ModifyMigrationRequest extends AbstractModel{

    /**
    * Migration task ID
    */
    @SerializedName("MigrateId")
    @Expose
    private Long MigrateId;

    /**
    * New name of migration task. If this parameter is left empty, no modification will be made
    */
    @SerializedName("MigrateName")
    @Expose
    private String MigrateName;

    /**
    * New migration type (1: structure migration, 2: data migration, 3: incremental sync). If this parameter is left empty, no modification will be made
    */
    @SerializedName("MigrateType")
    @Expose
    private Long MigrateType;

    /**
    * Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode). If this parameter is left empty, no modification will be made
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Migration source. If this parameter is left empty, no modification will be made
    */
    @SerializedName("Source")
    @Expose
    private MigrateSource Source;

    /**
    * Migration target. If this parameter is left empty, no modification will be made
    */
    @SerializedName("Target")
    @Expose
    private MigrateTarget Target;

    /**
    * Database objects to be migrated. This parameter is not used for offline migration (SourceType=4 or SourceType=5). If it left empty, no modification will be made
    */
    @SerializedName("MigrateDBSet")
    @Expose
    private MigrateDB [] MigrateDBSet;

    /**
     * Get Migration task ID 
     * @return MigrateId Migration task ID
     */
    public Long getMigrateId() {
        return this.MigrateId;
    }

    /**
     * Set Migration task ID
     * @param MigrateId Migration task ID
     */
    public void setMigrateId(Long MigrateId) {
        this.MigrateId = MigrateId;
    }

    /**
     * Get New name of migration task. If this parameter is left empty, no modification will be made 
     * @return MigrateName New name of migration task. If this parameter is left empty, no modification will be made
     */
    public String getMigrateName() {
        return this.MigrateName;
    }

    /**
     * Set New name of migration task. If this parameter is left empty, no modification will be made
     * @param MigrateName New name of migration task. If this parameter is left empty, no modification will be made
     */
    public void setMigrateName(String MigrateName) {
        this.MigrateName = MigrateName;
    }

    /**
     * Get New migration type (1: structure migration, 2: data migration, 3: incremental sync). If this parameter is left empty, no modification will be made 
     * @return MigrateType New migration type (1: structure migration, 2: data migration, 3: incremental sync). If this parameter is left empty, no modification will be made
     */
    public Long getMigrateType() {
        return this.MigrateType;
    }

    /**
     * Set New migration type (1: structure migration, 2: data migration, 3: incremental sync). If this parameter is left empty, no modification will be made
     * @param MigrateType New migration type (1: structure migration, 2: data migration, 3: incremental sync). If this parameter is left empty, no modification will be made
     */
    public void setMigrateType(Long MigrateType) {
        this.MigrateType = MigrateType;
    }

    /**
     * Get Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode). If this parameter is left empty, no modification will be made 
     * @return SourceType Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode). If this parameter is left empty, no modification will be made
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode). If this parameter is left empty, no modification will be made
     * @param SourceType Migration source type. 1: TencentDB for SQL Server, 2: CVM-based self-created SQL Server database; 3: SQL Server backup restoration, 4: SQL Server backup restoration (in COS mode). If this parameter is left empty, no modification will be made
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Migration source. If this parameter is left empty, no modification will be made 
     * @return Source Migration source. If this parameter is left empty, no modification will be made
     */
    public MigrateSource getSource() {
        return this.Source;
    }

    /**
     * Set Migration source. If this parameter is left empty, no modification will be made
     * @param Source Migration source. If this parameter is left empty, no modification will be made
     */
    public void setSource(MigrateSource Source) {
        this.Source = Source;
    }

    /**
     * Get Migration target. If this parameter is left empty, no modification will be made 
     * @return Target Migration target. If this parameter is left empty, no modification will be made
     */
    public MigrateTarget getTarget() {
        return this.Target;
    }

    /**
     * Set Migration target. If this parameter is left empty, no modification will be made
     * @param Target Migration target. If this parameter is left empty, no modification will be made
     */
    public void setTarget(MigrateTarget Target) {
        this.Target = Target;
    }

    /**
     * Get Database objects to be migrated. This parameter is not used for offline migration (SourceType=4 or SourceType=5). If it left empty, no modification will be made 
     * @return MigrateDBSet Database objects to be migrated. This parameter is not used for offline migration (SourceType=4 or SourceType=5). If it left empty, no modification will be made
     */
    public MigrateDB [] getMigrateDBSet() {
        return this.MigrateDBSet;
    }

    /**
     * Set Database objects to be migrated. This parameter is not used for offline migration (SourceType=4 or SourceType=5). If it left empty, no modification will be made
     * @param MigrateDBSet Database objects to be migrated. This parameter is not used for offline migration (SourceType=4 or SourceType=5). If it left empty, no modification will be made
     */
    public void setMigrateDBSet(MigrateDB [] MigrateDBSet) {
        this.MigrateDBSet = MigrateDBSet;
    }

    public ModifyMigrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMigrationRequest(ModifyMigrationRequest source) {
        if (source.MigrateId != null) {
            this.MigrateId = new Long(source.MigrateId);
        }
        if (source.MigrateName != null) {
            this.MigrateName = new String(source.MigrateName);
        }
        if (source.MigrateType != null) {
            this.MigrateType = new Long(source.MigrateType);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.Source != null) {
            this.Source = new MigrateSource(source.Source);
        }
        if (source.Target != null) {
            this.Target = new MigrateTarget(source.Target);
        }
        if (source.MigrateDBSet != null) {
            this.MigrateDBSet = new MigrateDB[source.MigrateDBSet.length];
            for (int i = 0; i < source.MigrateDBSet.length; i++) {
                this.MigrateDBSet[i] = new MigrateDB(source.MigrateDBSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MigrateId", this.MigrateId);
        this.setParamSimple(map, prefix + "MigrateName", this.MigrateName);
        this.setParamSimple(map, prefix + "MigrateType", this.MigrateType);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamObj(map, prefix + "Source.", this.Source);
        this.setParamObj(map, prefix + "Target.", this.Target);
        this.setParamArrayObj(map, prefix + "MigrateDBSet.", this.MigrateDBSet);

    }
}

