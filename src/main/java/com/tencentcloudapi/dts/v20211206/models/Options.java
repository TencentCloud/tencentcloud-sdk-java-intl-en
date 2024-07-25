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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Options extends AbstractModel {

    /**
    * Sync initialization option. Valid values: `data` (full data initialization); `Structure` (structure initialization); `Full` (full data and structure initialization); `None` (incremental data only). Default value: `Full`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InitType")
    @Expose
    private String InitType;

    /**
    * Processing method for duplicate tables. Valid values: `ReportErrorAfterCheck`, `InitializeAfterDelete`, `ExecuteAfterIgnore`. Default value: `ReportErrorAfterCheck`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DealOfExistSameTable")
    @Expose
    private String DealOfExistSameTable;

    /**
    * Conflict processing option. Valid values: `ReportError` (report an error); `Ignore` (ignore); `Cover` (overwrite); `ConditionCover` (conditionally overwrite). Default value: `ReportError`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConflictHandleType")
    @Expose
    private String ConflictHandleType;

    /**
    * Whether to add the additional column
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AddAdditionalColumn")
    @Expose
    private Boolean AddAdditionalColumn;

    /**
    * DML and DDL options to be synced. Valid values: `Insert` (INSERT operations); `Update` (UPDATE operations); `Delete` (DELETE operations); `DDL` (structure sync); `PartialDDL` (custom option, which is used together with `DdlOptions`). You can also leave this parameter empty.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OpTypes")
    @Expose
    private String [] OpTypes;

    /**
    * Detailed option for conflict processing, such as condition rows and operations in conditional overwrite.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConflictHandleOption")
    @Expose
    private ConflictHandleOption ConflictHandleOption;

    /**
    * DDL statements to be synced
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DdlOptions")
    @Expose
    private DdlOption [] DdlOptions;

    /**
    * Kafka sync options
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("KafkaOption")
    @Expose
    private KafkaOption KafkaOption;

    /**
    * Task speed limit information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RateLimitOption")
    @Expose
    private RateLimitOption RateLimitOption;

    /**
    * Settings of the automatic retry time range
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoRetryTimeRangeMinutes")
    @Expose
    private Long AutoRetryTimeRangeMinutes;

    /**
    * 
    */
    @SerializedName("FilterBeginCommit")
    @Expose
    private Boolean FilterBeginCommit;

    /**
    * 
    */
    @SerializedName("FilterCheckpoint")
    @Expose
    private Boolean FilterCheckpoint;

    /**
     * Get Sync initialization option. Valid values: `data` (full data initialization); `Structure` (structure initialization); `Full` (full data and structure initialization); `None` (incremental data only). Default value: `Full`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InitType Sync initialization option. Valid values: `data` (full data initialization); `Structure` (structure initialization); `Full` (full data and structure initialization); `None` (incremental data only). Default value: `Full`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInitType() {
        return this.InitType;
    }

    /**
     * Set Sync initialization option. Valid values: `data` (full data initialization); `Structure` (structure initialization); `Full` (full data and structure initialization); `None` (incremental data only). Default value: `Full`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InitType Sync initialization option. Valid values: `data` (full data initialization); `Structure` (structure initialization); `Full` (full data and structure initialization); `None` (incremental data only). Default value: `Full`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInitType(String InitType) {
        this.InitType = InitType;
    }

    /**
     * Get Processing method for duplicate tables. Valid values: `ReportErrorAfterCheck`, `InitializeAfterDelete`, `ExecuteAfterIgnore`. Default value: `ReportErrorAfterCheck`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DealOfExistSameTable Processing method for duplicate tables. Valid values: `ReportErrorAfterCheck`, `InitializeAfterDelete`, `ExecuteAfterIgnore`. Default value: `ReportErrorAfterCheck`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDealOfExistSameTable() {
        return this.DealOfExistSameTable;
    }

    /**
     * Set Processing method for duplicate tables. Valid values: `ReportErrorAfterCheck`, `InitializeAfterDelete`, `ExecuteAfterIgnore`. Default value: `ReportErrorAfterCheck`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DealOfExistSameTable Processing method for duplicate tables. Valid values: `ReportErrorAfterCheck`, `InitializeAfterDelete`, `ExecuteAfterIgnore`. Default value: `ReportErrorAfterCheck`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDealOfExistSameTable(String DealOfExistSameTable) {
        this.DealOfExistSameTable = DealOfExistSameTable;
    }

    /**
     * Get Conflict processing option. Valid values: `ReportError` (report an error); `Ignore` (ignore); `Cover` (overwrite); `ConditionCover` (conditionally overwrite). Default value: `ReportError`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConflictHandleType Conflict processing option. Valid values: `ReportError` (report an error); `Ignore` (ignore); `Cover` (overwrite); `ConditionCover` (conditionally overwrite). Default value: `ReportError`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConflictHandleType() {
        return this.ConflictHandleType;
    }

    /**
     * Set Conflict processing option. Valid values: `ReportError` (report an error); `Ignore` (ignore); `Cover` (overwrite); `ConditionCover` (conditionally overwrite). Default value: `ReportError`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConflictHandleType Conflict processing option. Valid values: `ReportError` (report an error); `Ignore` (ignore); `Cover` (overwrite); `ConditionCover` (conditionally overwrite). Default value: `ReportError`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConflictHandleType(String ConflictHandleType) {
        this.ConflictHandleType = ConflictHandleType;
    }

    /**
     * Get Whether to add the additional column
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AddAdditionalColumn Whether to add the additional column
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAddAdditionalColumn() {
        return this.AddAdditionalColumn;
    }

    /**
     * Set Whether to add the additional column
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AddAdditionalColumn Whether to add the additional column
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddAdditionalColumn(Boolean AddAdditionalColumn) {
        this.AddAdditionalColumn = AddAdditionalColumn;
    }

    /**
     * Get DML and DDL options to be synced. Valid values: `Insert` (INSERT operations); `Update` (UPDATE operations); `Delete` (DELETE operations); `DDL` (structure sync); `PartialDDL` (custom option, which is used together with `DdlOptions`). You can also leave this parameter empty.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OpTypes DML and DDL options to be synced. Valid values: `Insert` (INSERT operations); `Update` (UPDATE operations); `Delete` (DELETE operations); `DDL` (structure sync); `PartialDDL` (custom option, which is used together with `DdlOptions`). You can also leave this parameter empty.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getOpTypes() {
        return this.OpTypes;
    }

    /**
     * Set DML and DDL options to be synced. Valid values: `Insert` (INSERT operations); `Update` (UPDATE operations); `Delete` (DELETE operations); `DDL` (structure sync); `PartialDDL` (custom option, which is used together with `DdlOptions`). You can also leave this parameter empty.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OpTypes DML and DDL options to be synced. Valid values: `Insert` (INSERT operations); `Update` (UPDATE operations); `Delete` (DELETE operations); `DDL` (structure sync); `PartialDDL` (custom option, which is used together with `DdlOptions`). You can also leave this parameter empty.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOpTypes(String [] OpTypes) {
        this.OpTypes = OpTypes;
    }

    /**
     * Get Detailed option for conflict processing, such as condition rows and operations in conditional overwrite.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConflictHandleOption Detailed option for conflict processing, such as condition rows and operations in conditional overwrite.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ConflictHandleOption getConflictHandleOption() {
        return this.ConflictHandleOption;
    }

    /**
     * Set Detailed option for conflict processing, such as condition rows and operations in conditional overwrite.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConflictHandleOption Detailed option for conflict processing, such as condition rows and operations in conditional overwrite.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConflictHandleOption(ConflictHandleOption ConflictHandleOption) {
        this.ConflictHandleOption = ConflictHandleOption;
    }

    /**
     * Get DDL statements to be synced
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DdlOptions DDL statements to be synced
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DdlOption [] getDdlOptions() {
        return this.DdlOptions;
    }

    /**
     * Set DDL statements to be synced
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DdlOptions DDL statements to be synced
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDdlOptions(DdlOption [] DdlOptions) {
        this.DdlOptions = DdlOptions;
    }

    /**
     * Get Kafka sync options
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return KafkaOption Kafka sync options
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KafkaOption getKafkaOption() {
        return this.KafkaOption;
    }

    /**
     * Set Kafka sync options
Note: This field may return null, indicating that no valid values can be obtained.
     * @param KafkaOption Kafka sync options
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKafkaOption(KafkaOption KafkaOption) {
        this.KafkaOption = KafkaOption;
    }

    /**
     * Get Task speed limit information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RateLimitOption Task speed limit information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RateLimitOption getRateLimitOption() {
        return this.RateLimitOption;
    }

    /**
     * Set Task speed limit information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RateLimitOption Task speed limit information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRateLimitOption(RateLimitOption RateLimitOption) {
        this.RateLimitOption = RateLimitOption;
    }

    /**
     * Get Settings of the automatic retry time range
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoRetryTimeRangeMinutes Settings of the automatic retry time range
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAutoRetryTimeRangeMinutes() {
        return this.AutoRetryTimeRangeMinutes;
    }

    /**
     * Set Settings of the automatic retry time range
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoRetryTimeRangeMinutes Settings of the automatic retry time range
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoRetryTimeRangeMinutes(Long AutoRetryTimeRangeMinutes) {
        this.AutoRetryTimeRangeMinutes = AutoRetryTimeRangeMinutes;
    }

    /**
     * Get  
     * @return FilterBeginCommit 
     */
    public Boolean getFilterBeginCommit() {
        return this.FilterBeginCommit;
    }

    /**
     * Set 
     * @param FilterBeginCommit 
     */
    public void setFilterBeginCommit(Boolean FilterBeginCommit) {
        this.FilterBeginCommit = FilterBeginCommit;
    }

    /**
     * Get  
     * @return FilterCheckpoint 
     */
    public Boolean getFilterCheckpoint() {
        return this.FilterCheckpoint;
    }

    /**
     * Set 
     * @param FilterCheckpoint 
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
        this.setParamSimple(map, prefix + "FilterBeginCommit", this.FilterBeginCommit);
        this.setParamSimple(map, prefix + "FilterCheckpoint", this.FilterCheckpoint);

    }
}

