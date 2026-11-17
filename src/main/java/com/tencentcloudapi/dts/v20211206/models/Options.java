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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Options extends AbstractModel {

    /**
    * <p>Synchronization initialization options: Data (Full Data initialization), Structure (Structure initialization), Full (Full Data and Structure initialization, default), None (incremental only). The mongodb link supports only Full Data initialization or incremental only.</p>
    */
    @SerializedName("InitType")
    @Expose
    private String InitType;

    /**
    * <p>Handling of tables with the same name, ReportErrorAfterCheck (pre-validation and error reporting, default), ExecuteAfterIgnore (ignore and continue execution).</p>
    */
    @SerializedName("DealOfExistSameTable")
    @Expose
    private String DealOfExistSameTable;

    /**
    * <p>Conflict resolution options: ReportError (report error, default), Ignore, Cover, ConditionCover</p>
    */
    @SerializedName("ConflictHandleType")
    @Expose
    private String ConflictHandleType;

    /**
    * <p>Whether to add an additional column</p>
    */
    @SerializedName("AddAdditionalColumn")
    @Expose
    private Boolean AddAdditionalColumn;

    /**
    * <p>Options for DML and DDL to be synchronized: Insert, Update, Delete, DDL (structure synchronization), PartialDDL (custom, can be used together with DdlOptions). Note that it must contain at least one DML option.</p>
    */
    @SerializedName("OpTypes")
    @Expose
    private String [] OpTypes;

    /**
    * <p>Detailed options for conflict resolution, such as condition row and conditional operation in condition coverage</p>
    */
    @SerializedName("ConflictHandleOption")
    @Expose
    private ConflictHandleOption ConflictHandleOption;

    /**
    * <p>DDL synchronization option. Description of which DDLs to synchronize.</p>
    */
    @SerializedName("DdlOptions")
    @Expose
    private DdlOption [] DdlOptions;

    /**
    * <p>kafka sync options</p>
    */
    @SerializedName("KafkaOption")
    @Expose
    private KafkaOption KafkaOption;

    /**
    * <p>Task speed limit information</p>
    */
    @SerializedName("RateLimitOption")
    @Expose
    private RateLimitOption RateLimitOption;

    /**
    * <p>Time window for automatic retry settings</p>
    */
    @SerializedName("AutoRetryTimeRangeMinutes")
    @Expose
    private Long AutoRetryTimeRangeMinutes;

    /**
    * <p>Synchronize to the specified checkpoint of the kafka link. Currently only support time format: 2023-12-20T19:24:23+08:00. If not specified, it is empty.</p>
    */
    @SerializedName("StartPosition")
    @Expose
    private String StartPosition;

    /**
    * <p>Whether to filter out begin and commit messages when synchronizing to kafka. Currently, only the mysql-to-kafka link supports this.</p>
    */
    @SerializedName("FilterBeginCommit")
    @Expose
    private Boolean FilterBeginCommit;

    /**
    * <p>Whether to filter out checkpoint messages when synchronizing to kafka. Currently, only the mysql-to-kafka link supports this.</p>
    */
    @SerializedName("FilterCheckpoint")
    @Expose
    private Boolean FilterCheckpoint;

    /**
     * Get <p>Synchronization initialization options: Data (Full Data initialization), Structure (Structure initialization), Full (Full Data and Structure initialization, default), None (incremental only). The mongodb link supports only Full Data initialization or incremental only.</p> 
     * @return InitType <p>Synchronization initialization options: Data (Full Data initialization), Structure (Structure initialization), Full (Full Data and Structure initialization, default), None (incremental only). The mongodb link supports only Full Data initialization or incremental only.</p>
     */
    public String getInitType() {
        return this.InitType;
    }

    /**
     * Set <p>Synchronization initialization options: Data (Full Data initialization), Structure (Structure initialization), Full (Full Data and Structure initialization, default), None (incremental only). The mongodb link supports only Full Data initialization or incremental only.</p>
     * @param InitType <p>Synchronization initialization options: Data (Full Data initialization), Structure (Structure initialization), Full (Full Data and Structure initialization, default), None (incremental only). The mongodb link supports only Full Data initialization or incremental only.</p>
     */
    public void setInitType(String InitType) {
        this.InitType = InitType;
    }

    /**
     * Get <p>Handling of tables with the same name, ReportErrorAfterCheck (pre-validation and error reporting, default), ExecuteAfterIgnore (ignore and continue execution).</p> 
     * @return DealOfExistSameTable <p>Handling of tables with the same name, ReportErrorAfterCheck (pre-validation and error reporting, default), ExecuteAfterIgnore (ignore and continue execution).</p>
     */
    public String getDealOfExistSameTable() {
        return this.DealOfExistSameTable;
    }

    /**
     * Set <p>Handling of tables with the same name, ReportErrorAfterCheck (pre-validation and error reporting, default), ExecuteAfterIgnore (ignore and continue execution).</p>
     * @param DealOfExistSameTable <p>Handling of tables with the same name, ReportErrorAfterCheck (pre-validation and error reporting, default), ExecuteAfterIgnore (ignore and continue execution).</p>
     */
    public void setDealOfExistSameTable(String DealOfExistSameTable) {
        this.DealOfExistSameTable = DealOfExistSameTable;
    }

    /**
     * Get <p>Conflict resolution options: ReportError (report error, default), Ignore, Cover, ConditionCover</p> 
     * @return ConflictHandleType <p>Conflict resolution options: ReportError (report error, default), Ignore, Cover, ConditionCover</p>
     */
    public String getConflictHandleType() {
        return this.ConflictHandleType;
    }

    /**
     * Set <p>Conflict resolution options: ReportError (report error, default), Ignore, Cover, ConditionCover</p>
     * @param ConflictHandleType <p>Conflict resolution options: ReportError (report error, default), Ignore, Cover, ConditionCover</p>
     */
    public void setConflictHandleType(String ConflictHandleType) {
        this.ConflictHandleType = ConflictHandleType;
    }

    /**
     * Get <p>Whether to add an additional column</p> 
     * @return AddAdditionalColumn <p>Whether to add an additional column</p>
     */
    public Boolean getAddAdditionalColumn() {
        return this.AddAdditionalColumn;
    }

    /**
     * Set <p>Whether to add an additional column</p>
     * @param AddAdditionalColumn <p>Whether to add an additional column</p>
     */
    public void setAddAdditionalColumn(Boolean AddAdditionalColumn) {
        this.AddAdditionalColumn = AddAdditionalColumn;
    }

    /**
     * Get <p>Options for DML and DDL to be synchronized: Insert, Update, Delete, DDL (structure synchronization), PartialDDL (custom, can be used together with DdlOptions). Note that it must contain at least one DML option.</p> 
     * @return OpTypes <p>Options for DML and DDL to be synchronized: Insert, Update, Delete, DDL (structure synchronization), PartialDDL (custom, can be used together with DdlOptions). Note that it must contain at least one DML option.</p>
     */
    public String [] getOpTypes() {
        return this.OpTypes;
    }

    /**
     * Set <p>Options for DML and DDL to be synchronized: Insert, Update, Delete, DDL (structure synchronization), PartialDDL (custom, can be used together with DdlOptions). Note that it must contain at least one DML option.</p>
     * @param OpTypes <p>Options for DML and DDL to be synchronized: Insert, Update, Delete, DDL (structure synchronization), PartialDDL (custom, can be used together with DdlOptions). Note that it must contain at least one DML option.</p>
     */
    public void setOpTypes(String [] OpTypes) {
        this.OpTypes = OpTypes;
    }

    /**
     * Get <p>Detailed options for conflict resolution, such as condition row and conditional operation in condition coverage</p> 
     * @return ConflictHandleOption <p>Detailed options for conflict resolution, such as condition row and conditional operation in condition coverage</p>
     */
    public ConflictHandleOption getConflictHandleOption() {
        return this.ConflictHandleOption;
    }

    /**
     * Set <p>Detailed options for conflict resolution, such as condition row and conditional operation in condition coverage</p>
     * @param ConflictHandleOption <p>Detailed options for conflict resolution, such as condition row and conditional operation in condition coverage</p>
     */
    public void setConflictHandleOption(ConflictHandleOption ConflictHandleOption) {
        this.ConflictHandleOption = ConflictHandleOption;
    }

    /**
     * Get <p>DDL synchronization option. Description of which DDLs to synchronize.</p> 
     * @return DdlOptions <p>DDL synchronization option. Description of which DDLs to synchronize.</p>
     */
    public DdlOption [] getDdlOptions() {
        return this.DdlOptions;
    }

    /**
     * Set <p>DDL synchronization option. Description of which DDLs to synchronize.</p>
     * @param DdlOptions <p>DDL synchronization option. Description of which DDLs to synchronize.</p>
     */
    public void setDdlOptions(DdlOption [] DdlOptions) {
        this.DdlOptions = DdlOptions;
    }

    /**
     * Get <p>kafka sync options</p> 
     * @return KafkaOption <p>kafka sync options</p>
     */
    public KafkaOption getKafkaOption() {
        return this.KafkaOption;
    }

    /**
     * Set <p>kafka sync options</p>
     * @param KafkaOption <p>kafka sync options</p>
     */
    public void setKafkaOption(KafkaOption KafkaOption) {
        this.KafkaOption = KafkaOption;
    }

    /**
     * Get <p>Task speed limit information</p> 
     * @return RateLimitOption <p>Task speed limit information</p>
     */
    public RateLimitOption getRateLimitOption() {
        return this.RateLimitOption;
    }

    /**
     * Set <p>Task speed limit information</p>
     * @param RateLimitOption <p>Task speed limit information</p>
     */
    public void setRateLimitOption(RateLimitOption RateLimitOption) {
        this.RateLimitOption = RateLimitOption;
    }

    /**
     * Get <p>Time window for automatic retry settings</p> 
     * @return AutoRetryTimeRangeMinutes <p>Time window for automatic retry settings</p>
     */
    public Long getAutoRetryTimeRangeMinutes() {
        return this.AutoRetryTimeRangeMinutes;
    }

    /**
     * Set <p>Time window for automatic retry settings</p>
     * @param AutoRetryTimeRangeMinutes <p>Time window for automatic retry settings</p>
     */
    public void setAutoRetryTimeRangeMinutes(Long AutoRetryTimeRangeMinutes) {
        this.AutoRetryTimeRangeMinutes = AutoRetryTimeRangeMinutes;
    }

    /**
     * Get <p>Synchronize to the specified checkpoint of the kafka link. Currently only support time format: 2023-12-20T19:24:23+08:00. If not specified, it is empty.</p> 
     * @return StartPosition <p>Synchronize to the specified checkpoint of the kafka link. Currently only support time format: 2023-12-20T19:24:23+08:00. If not specified, it is empty.</p>
     */
    public String getStartPosition() {
        return this.StartPosition;
    }

    /**
     * Set <p>Synchronize to the specified checkpoint of the kafka link. Currently only support time format: 2023-12-20T19:24:23+08:00. If not specified, it is empty.</p>
     * @param StartPosition <p>Synchronize to the specified checkpoint of the kafka link. Currently only support time format: 2023-12-20T19:24:23+08:00. If not specified, it is empty.</p>
     */
    public void setStartPosition(String StartPosition) {
        this.StartPosition = StartPosition;
    }

    /**
     * Get <p>Whether to filter out begin and commit messages when synchronizing to kafka. Currently, only the mysql-to-kafka link supports this.</p> 
     * @return FilterBeginCommit <p>Whether to filter out begin and commit messages when synchronizing to kafka. Currently, only the mysql-to-kafka link supports this.</p>
     */
    public Boolean getFilterBeginCommit() {
        return this.FilterBeginCommit;
    }

    /**
     * Set <p>Whether to filter out begin and commit messages when synchronizing to kafka. Currently, only the mysql-to-kafka link supports this.</p>
     * @param FilterBeginCommit <p>Whether to filter out begin and commit messages when synchronizing to kafka. Currently, only the mysql-to-kafka link supports this.</p>
     */
    public void setFilterBeginCommit(Boolean FilterBeginCommit) {
        this.FilterBeginCommit = FilterBeginCommit;
    }

    /**
     * Get <p>Whether to filter out checkpoint messages when synchronizing to kafka. Currently, only the mysql-to-kafka link supports this.</p> 
     * @return FilterCheckpoint <p>Whether to filter out checkpoint messages when synchronizing to kafka. Currently, only the mysql-to-kafka link supports this.</p>
     */
    public Boolean getFilterCheckpoint() {
        return this.FilterCheckpoint;
    }

    /**
     * Set <p>Whether to filter out checkpoint messages when synchronizing to kafka. Currently, only the mysql-to-kafka link supports this.</p>
     * @param FilterCheckpoint <p>Whether to filter out checkpoint messages when synchronizing to kafka. Currently, only the mysql-to-kafka link supports this.</p>
     */
    public void setFilterCheckpoint(Boolean FilterCheckpoint) {
        this.FilterCheckpoint = FilterCheckpoint;
    }

    public Options() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Options(Options source) {
        if (source.InitType != null) {
            this.InitType = new String(source.InitType);
        }
        if (source.DealOfExistSameTable != null) {
            this.DealOfExistSameTable = new String(source.DealOfExistSameTable);
        }
        if (source.ConflictHandleType != null) {
            this.ConflictHandleType = new String(source.ConflictHandleType);
        }
        if (source.AddAdditionalColumn != null) {
            this.AddAdditionalColumn = new Boolean(source.AddAdditionalColumn);
        }
        if (source.OpTypes != null) {
            this.OpTypes = new String[source.OpTypes.length];
            for (int i = 0; i < source.OpTypes.length; i++) {
                this.OpTypes[i] = new String(source.OpTypes[i]);
            }
        }
        if (source.ConflictHandleOption != null) {
            this.ConflictHandleOption = new ConflictHandleOption(source.ConflictHandleOption);
        }
        if (source.DdlOptions != null) {
            this.DdlOptions = new DdlOption[source.DdlOptions.length];
            for (int i = 0; i < source.DdlOptions.length; i++) {
                this.DdlOptions[i] = new DdlOption(source.DdlOptions[i]);
            }
        }
        if (source.KafkaOption != null) {
            this.KafkaOption = new KafkaOption(source.KafkaOption);
        }
        if (source.RateLimitOption != null) {
            this.RateLimitOption = new RateLimitOption(source.RateLimitOption);
        }
        if (source.AutoRetryTimeRangeMinutes != null) {
            this.AutoRetryTimeRangeMinutes = new Long(source.AutoRetryTimeRangeMinutes);
        }
        if (source.StartPosition != null) {
            this.StartPosition = new String(source.StartPosition);
        }
        if (source.FilterBeginCommit != null) {
            this.FilterBeginCommit = new Boolean(source.FilterBeginCommit);
        }
        if (source.FilterCheckpoint != null) {
            this.FilterCheckpoint = new Boolean(source.FilterCheckpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InitType", this.InitType);
        this.setParamSimple(map, prefix + "DealOfExistSameTable", this.DealOfExistSameTable);
        this.setParamSimple(map, prefix + "ConflictHandleType", this.ConflictHandleType);
        this.setParamSimple(map, prefix + "AddAdditionalColumn", this.AddAdditionalColumn);
        this.setParamArraySimple(map, prefix + "OpTypes.", this.OpTypes);
        this.setParamObj(map, prefix + "ConflictHandleOption.", this.ConflictHandleOption);
        this.setParamArrayObj(map, prefix + "DdlOptions.", this.DdlOptions);
        this.setParamObj(map, prefix + "KafkaOption.", this.KafkaOption);
        this.setParamObj(map, prefix + "RateLimitOption.", this.RateLimitOption);
        this.setParamSimple(map, prefix + "AutoRetryTimeRangeMinutes", this.AutoRetryTimeRangeMinutes);
        this.setParamSimple(map, prefix + "StartPosition", this.StartPosition);
        this.setParamSimple(map, prefix + "FilterBeginCommit", this.FilterBeginCommit);
        this.setParamSimple(map, prefix + "FilterCheckpoint", this.FilterCheckpoint);

    }
}

