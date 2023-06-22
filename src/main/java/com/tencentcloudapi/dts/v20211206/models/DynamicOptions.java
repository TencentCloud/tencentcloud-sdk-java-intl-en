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

public class DynamicOptions extends AbstractModel{

    /**
    * DML and DDL options to be synced. Valid values: `Insert` (INSERT), `Update` (UPDATE), `Delete` (DELETE), `DDL` (structure sync), `PartialDDL` (custom option, which is used together with `DdlOptions`). This parameter is required, and its value will overwrite the previous value. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OpTypes")
    @Expose
    private String [] OpTypes;

    /**
    * DDL options to be synced. This parameter is required when `OpTypes` is `PartialDDL`, and its value will overwrite the previous value. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DdlOptions")
    @Expose
    private DdlOption [] DdlOptions;

    /**
    * Conflict resolution method. Valid values: `ReportError` (Report error), `Ignore` (Ignore), `Cover` (Overwrite), `ConditionCover` (Conditionally overwrite). Currently, this parameter cannot be modified if the target of the link is Kafka. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConflictHandleType")
    @Expose
    private String ConflictHandleType;

    /**
    * Detailed options of the conflict resolution method, such as the conditionally overwritten rows and condition operations for the “conditionally overwrite” method. The internal field of this parameter cannot be modified separately. If this parameter needs to be updated, update it fully. Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConflictHandleOption")
    @Expose
    private ConflictHandleOption ConflictHandleOption;

    /**
     * Get DML and DDL options to be synced. Valid values: `Insert` (INSERT), `Update` (UPDATE), `Delete` (DELETE), `DDL` (structure sync), `PartialDDL` (custom option, which is used together with `DdlOptions`). This parameter is required, and its value will overwrite the previous value. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OpTypes DML and DDL options to be synced. Valid values: `Insert` (INSERT), `Update` (UPDATE), `Delete` (DELETE), `DDL` (structure sync), `PartialDDL` (custom option, which is used together with `DdlOptions`). This parameter is required, and its value will overwrite the previous value. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getOpTypes() {
        return this.OpTypes;
    }

    /**
     * Set DML and DDL options to be synced. Valid values: `Insert` (INSERT), `Update` (UPDATE), `Delete` (DELETE), `DDL` (structure sync), `PartialDDL` (custom option, which is used together with `DdlOptions`). This parameter is required, and its value will overwrite the previous value. Note: This field may return null, indicating that no valid values can be obtained.
     * @param OpTypes DML and DDL options to be synced. Valid values: `Insert` (INSERT), `Update` (UPDATE), `Delete` (DELETE), `DDL` (structure sync), `PartialDDL` (custom option, which is used together with `DdlOptions`). This parameter is required, and its value will overwrite the previous value. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOpTypes(String [] OpTypes) {
        this.OpTypes = OpTypes;
    }

    /**
     * Get DDL options to be synced. This parameter is required when `OpTypes` is `PartialDDL`, and its value will overwrite the previous value. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DdlOptions DDL options to be synced. This parameter is required when `OpTypes` is `PartialDDL`, and its value will overwrite the previous value. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DdlOption [] getDdlOptions() {
        return this.DdlOptions;
    }

    /**
     * Set DDL options to be synced. This parameter is required when `OpTypes` is `PartialDDL`, and its value will overwrite the previous value. Note: This field may return null, indicating that no valid values can be obtained.
     * @param DdlOptions DDL options to be synced. This parameter is required when `OpTypes` is `PartialDDL`, and its value will overwrite the previous value. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDdlOptions(DdlOption [] DdlOptions) {
        this.DdlOptions = DdlOptions;
    }

    /**
     * Get Conflict resolution method. Valid values: `ReportError` (Report error), `Ignore` (Ignore), `Cover` (Overwrite), `ConditionCover` (Conditionally overwrite). Currently, this parameter cannot be modified if the target of the link is Kafka. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConflictHandleType Conflict resolution method. Valid values: `ReportError` (Report error), `Ignore` (Ignore), `Cover` (Overwrite), `ConditionCover` (Conditionally overwrite). Currently, this parameter cannot be modified if the target of the link is Kafka. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConflictHandleType() {
        return this.ConflictHandleType;
    }

    /**
     * Set Conflict resolution method. Valid values: `ReportError` (Report error), `Ignore` (Ignore), `Cover` (Overwrite), `ConditionCover` (Conditionally overwrite). Currently, this parameter cannot be modified if the target of the link is Kafka. Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConflictHandleType Conflict resolution method. Valid values: `ReportError` (Report error), `Ignore` (Ignore), `Cover` (Overwrite), `ConditionCover` (Conditionally overwrite). Currently, this parameter cannot be modified if the target of the link is Kafka. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConflictHandleType(String ConflictHandleType) {
        this.ConflictHandleType = ConflictHandleType;
    }

    /**
     * Get Detailed options of the conflict resolution method, such as the conditionally overwritten rows and condition operations for the “conditionally overwrite” method. The internal field of this parameter cannot be modified separately. If this parameter needs to be updated, update it fully. Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConflictHandleOption Detailed options of the conflict resolution method, such as the conditionally overwritten rows and condition operations for the “conditionally overwrite” method. The internal field of this parameter cannot be modified separately. If this parameter needs to be updated, update it fully. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ConflictHandleOption getConflictHandleOption() {
        return this.ConflictHandleOption;
    }

    /**
     * Set Detailed options of the conflict resolution method, such as the conditionally overwritten rows and condition operations for the “conditionally overwrite” method. The internal field of this parameter cannot be modified separately. If this parameter needs to be updated, update it fully. Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConflictHandleOption Detailed options of the conflict resolution method, such as the conditionally overwritten rows and condition operations for the “conditionally overwrite” method. The internal field of this parameter cannot be modified separately. If this parameter needs to be updated, update it fully. Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConflictHandleOption(ConflictHandleOption ConflictHandleOption) {
        this.ConflictHandleOption = ConflictHandleOption;
    }

    public DynamicOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicOptions(DynamicOptions source) {
        if (source.OpTypes != null) {
            this.OpTypes = new String[source.OpTypes.length];
            for (int i = 0; i < source.OpTypes.length; i++) {
                this.OpTypes[i] = new String(source.OpTypes[i]);
            }
        }
        if (source.DdlOptions != null) {
            this.DdlOptions = new DdlOption[source.DdlOptions.length];
            for (int i = 0; i < source.DdlOptions.length; i++) {
                this.DdlOptions[i] = new DdlOption(source.DdlOptions[i]);
            }
        }
        if (source.ConflictHandleType != null) {
            this.ConflictHandleType = new String(source.ConflictHandleType);
        }
        if (source.ConflictHandleOption != null) {
            this.ConflictHandleOption = new ConflictHandleOption(source.ConflictHandleOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "OpTypes.", this.OpTypes);
        this.setParamArrayObj(map, prefix + "DdlOptions.", this.DdlOptions);
        this.setParamSimple(map, prefix + "ConflictHandleType", this.ConflictHandleType);
        this.setParamObj(map, prefix + "ConflictHandleOption.", this.ConflictHandleOption);

    }
}

