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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateOption extends AbstractModel{

    /**
    * Migration object options, which tell DTS which database/table objects should be migrated.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatabaseTable")
    @Expose
    private DatabaseTableObject DatabaseTable;

    /**
    * Migration type. Valid values: `full`, `structure`, `fullAndIncrement`. Default value: `fullAndIncrement`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MigrateType")
    @Expose
    private String MigrateType;

    /**
    * Data consistency check option. Data consistency check is disabled by default.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Consistency")
    @Expose
    private ConsistencyOption Consistency;

    /**
    * Whether to migrate accounts. Valid values: `yes`, `no`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsMigrateAccount")
    @Expose
    private Boolean IsMigrateAccount;

    /**
    * Whether to use the `Root` account in the source database to overwrite that in the target database. Valid values: `false`, `true`. For database/table or structural migration, you should specify `false`. Note that this parameter takes effect only for OldDTS.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsOverrideRoot")
    @Expose
    private Boolean IsOverrideRoot;

    /**
    * Whether to set the target database to read-only during migration, which takes effect only for MySQL databases. Valid values: `true`, `false`. Default value: `false`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsDstReadOnly")
    @Expose
    private Boolean IsDstReadOnly;

    /**
    * Additional information. You can set additional parameters for certain database types. For Redis, you can define the following parameters: 
["ClientOutputBufferHardLimit":512, 	Hard limit of the replica buffer zone capacity in MB	"ClientOutputBufferSoftLimit":512, 	Soft limit of the replica buffer zone capacity in MB	"ClientOutputBufferPersistTime":60, Soft limit duration of the replica buffer zone in seconds	"ReplBacklogSize":512, 	Limit of the circular buffer zone capacity in MB	"ReplTimeout":120, 		Replication timeout period in seconds]
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtraAttr")
    @Expose
    private KeyValuePairOption [] ExtraAttr;

    /**
     * Get Migration object options, which tell DTS which database/table objects should be migrated.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DatabaseTable Migration object options, which tell DTS which database/table objects should be migrated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DatabaseTableObject getDatabaseTable() {
        return this.DatabaseTable;
    }

    /**
     * Set Migration object options, which tell DTS which database/table objects should be migrated.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DatabaseTable Migration object options, which tell DTS which database/table objects should be migrated.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDatabaseTable(DatabaseTableObject DatabaseTable) {
        this.DatabaseTable = DatabaseTable;
    }

    /**
     * Get Migration type. Valid values: `full`, `structure`, `fullAndIncrement`. Default value: `fullAndIncrement`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MigrateType Migration type. Valid values: `full`, `structure`, `fullAndIncrement`. Default value: `fullAndIncrement`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMigrateType() {
        return this.MigrateType;
    }

    /**
     * Set Migration type. Valid values: `full`, `structure`, `fullAndIncrement`. Default value: `fullAndIncrement`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MigrateType Migration type. Valid values: `full`, `structure`, `fullAndIncrement`. Default value: `fullAndIncrement`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMigrateType(String MigrateType) {
        this.MigrateType = MigrateType;
    }

    /**
     * Get Data consistency check option. Data consistency check is disabled by default.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Consistency Data consistency check option. Data consistency check is disabled by default.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ConsistencyOption getConsistency() {
        return this.Consistency;
    }

    /**
     * Set Data consistency check option. Data consistency check is disabled by default.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Consistency Data consistency check option. Data consistency check is disabled by default.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsistency(ConsistencyOption Consistency) {
        this.Consistency = Consistency;
    }

    /**
     * Get Whether to migrate accounts. Valid values: `yes`, `no`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsMigrateAccount Whether to migrate accounts. Valid values: `yes`, `no`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsMigrateAccount() {
        return this.IsMigrateAccount;
    }

    /**
     * Set Whether to migrate accounts. Valid values: `yes`, `no`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsMigrateAccount Whether to migrate accounts. Valid values: `yes`, `no`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsMigrateAccount(Boolean IsMigrateAccount) {
        this.IsMigrateAccount = IsMigrateAccount;
    }

    /**
     * Get Whether to use the `Root` account in the source database to overwrite that in the target database. Valid values: `false`, `true`. For database/table or structural migration, you should specify `false`. Note that this parameter takes effect only for OldDTS.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsOverrideRoot Whether to use the `Root` account in the source database to overwrite that in the target database. Valid values: `false`, `true`. For database/table or structural migration, you should specify `false`. Note that this parameter takes effect only for OldDTS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsOverrideRoot() {
        return this.IsOverrideRoot;
    }

    /**
     * Set Whether to use the `Root` account in the source database to overwrite that in the target database. Valid values: `false`, `true`. For database/table or structural migration, you should specify `false`. Note that this parameter takes effect only for OldDTS.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsOverrideRoot Whether to use the `Root` account in the source database to overwrite that in the target database. Valid values: `false`, `true`. For database/table or structural migration, you should specify `false`. Note that this parameter takes effect only for OldDTS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsOverrideRoot(Boolean IsOverrideRoot) {
        this.IsOverrideRoot = IsOverrideRoot;
    }

    /**
     * Get Whether to set the target database to read-only during migration, which takes effect only for MySQL databases. Valid values: `true`, `false`. Default value: `false`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsDstReadOnly Whether to set the target database to read-only during migration, which takes effect only for MySQL databases. Valid values: `true`, `false`. Default value: `false`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsDstReadOnly() {
        return this.IsDstReadOnly;
    }

    /**
     * Set Whether to set the target database to read-only during migration, which takes effect only for MySQL databases. Valid values: `true`, `false`. Default value: `false`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsDstReadOnly Whether to set the target database to read-only during migration, which takes effect only for MySQL databases. Valid values: `true`, `false`. Default value: `false`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsDstReadOnly(Boolean IsDstReadOnly) {
        this.IsDstReadOnly = IsDstReadOnly;
    }

    /**
     * Get Additional information. You can set additional parameters for certain database types. For Redis, you can define the following parameters: 
["ClientOutputBufferHardLimit":512, 	Hard limit of the replica buffer zone capacity in MB	"ClientOutputBufferSoftLimit":512, 	Soft limit of the replica buffer zone capacity in MB	"ClientOutputBufferPersistTime":60, Soft limit duration of the replica buffer zone in seconds	"ReplBacklogSize":512, 	Limit of the circular buffer zone capacity in MB	"ReplTimeout":120, 		Replication timeout period in seconds]
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExtraAttr Additional information. You can set additional parameters for certain database types. For Redis, you can define the following parameters: 
["ClientOutputBufferHardLimit":512, 	Hard limit of the replica buffer zone capacity in MB	"ClientOutputBufferSoftLimit":512, 	Soft limit of the replica buffer zone capacity in MB	"ClientOutputBufferPersistTime":60, Soft limit duration of the replica buffer zone in seconds	"ReplBacklogSize":512, 	Limit of the circular buffer zone capacity in MB	"ReplTimeout":120, 		Replication timeout period in seconds]
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KeyValuePairOption [] getExtraAttr() {
        return this.ExtraAttr;
    }

    /**
     * Set Additional information. You can set additional parameters for certain database types. For Redis, you can define the following parameters: 
["ClientOutputBufferHardLimit":512, 	Hard limit of the replica buffer zone capacity in MB	"ClientOutputBufferSoftLimit":512, 	Soft limit of the replica buffer zone capacity in MB	"ClientOutputBufferPersistTime":60, Soft limit duration of the replica buffer zone in seconds	"ReplBacklogSize":512, 	Limit of the circular buffer zone capacity in MB	"ReplTimeout":120, 		Replication timeout period in seconds]
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExtraAttr Additional information. You can set additional parameters for certain database types. For Redis, you can define the following parameters: 
["ClientOutputBufferHardLimit":512, 	Hard limit of the replica buffer zone capacity in MB	"ClientOutputBufferSoftLimit":512, 	Soft limit of the replica buffer zone capacity in MB	"ClientOutputBufferPersistTime":60, Soft limit duration of the replica buffer zone in seconds	"ReplBacklogSize":512, 	Limit of the circular buffer zone capacity in MB	"ReplTimeout":120, 		Replication timeout period in seconds]
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExtraAttr(KeyValuePairOption [] ExtraAttr) {
        this.ExtraAttr = ExtraAttr;
    }

    public MigrateOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateOption(MigrateOption source) {
        if (source.DatabaseTable != null) {
            this.DatabaseTable = new DatabaseTableObject(source.DatabaseTable);
        }
        if (source.MigrateType != null) {
            this.MigrateType = new String(source.MigrateType);
        }
        if (source.Consistency != null) {
            this.Consistency = new ConsistencyOption(source.Consistency);
        }
        if (source.IsMigrateAccount != null) {
            this.IsMigrateAccount = new Boolean(source.IsMigrateAccount);
        }
        if (source.IsOverrideRoot != null) {
            this.IsOverrideRoot = new Boolean(source.IsOverrideRoot);
        }
        if (source.IsDstReadOnly != null) {
            this.IsDstReadOnly = new Boolean(source.IsDstReadOnly);
        }
        if (source.ExtraAttr != null) {
            this.ExtraAttr = new KeyValuePairOption[source.ExtraAttr.length];
            for (int i = 0; i < source.ExtraAttr.length; i++) {
                this.ExtraAttr[i] = new KeyValuePairOption(source.ExtraAttr[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DatabaseTable.", this.DatabaseTable);
        this.setParamSimple(map, prefix + "MigrateType", this.MigrateType);
        this.setParamObj(map, prefix + "Consistency.", this.Consistency);
        this.setParamSimple(map, prefix + "IsMigrateAccount", this.IsMigrateAccount);
        this.setParamSimple(map, prefix + "IsOverrideRoot", this.IsOverrideRoot);
        this.setParamSimple(map, prefix + "IsDstReadOnly", this.IsDstReadOnly);
        this.setParamArrayObj(map, prefix + "ExtraAttr.", this.ExtraAttr);

    }
}

