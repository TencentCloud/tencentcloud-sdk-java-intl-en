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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataMaskStrategyPolicy extends AbstractModel {

    /**
    * Masking permission object.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicyInfo")
    @Expose
    private Policy PolicyInfo;

    /**
    * Masking policy ID. specifies the ID of the data masking policy.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataMaskStrategyId")
    @Expose
    private String DataMaskStrategyId;

    /**
    * Bound field type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ColumnType")
    @Expose
    private String ColumnType;

    /**
     * Get Masking permission object.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicyInfo Masking permission object.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Policy getPolicyInfo() {
        return this.PolicyInfo;
    }

    /**
     * Set Masking permission object.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicyInfo Masking permission object.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicyInfo(Policy PolicyInfo) {
        this.PolicyInfo = PolicyInfo;
    }

    /**
     * Get Masking policy ID. specifies the ID of the data masking policy.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataMaskStrategyId Masking policy ID. specifies the ID of the data masking policy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataMaskStrategyId() {
        return this.DataMaskStrategyId;
    }

    /**
     * Set Masking policy ID. specifies the ID of the data masking policy.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataMaskStrategyId Masking policy ID. specifies the ID of the data masking policy.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataMaskStrategyId(String DataMaskStrategyId) {
        this.DataMaskStrategyId = DataMaskStrategyId;
    }

    /**
     * Get Bound field type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ColumnType Bound field type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getColumnType() {
        return this.ColumnType;
    }

    /**
     * Set Bound field type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ColumnType Bound field type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColumnType(String ColumnType) {
        this.ColumnType = ColumnType;
    }

    public DataMaskStrategyPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataMaskStrategyPolicy(DataMaskStrategyPolicy source) {
        if (source.PolicyInfo != null) {
            this.PolicyInfo = new Policy(source.PolicyInfo);
        }
        if (source.DataMaskStrategyId != null) {
            this.DataMaskStrategyId = new String(source.DataMaskStrategyId);
        }
        if (source.ColumnType != null) {
            this.ColumnType = new String(source.ColumnType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PolicyInfo.", this.PolicyInfo);
        this.setParamSimple(map, prefix + "DataMaskStrategyId", this.DataMaskStrategyId);
        this.setParamSimple(map, prefix + "ColumnType", this.ColumnType);

    }
}

