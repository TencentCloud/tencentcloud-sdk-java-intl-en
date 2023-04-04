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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AggregationCondition extends AbstractModel{

    /**
    * Aggregation field. Valid values: `host` (source IP), `user` （username), `dbName` (database name), `sqlType` (SQL type).
    */
    @SerializedName("AggregationField")
    @Expose
    private String AggregationField;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of buckets returned under this field. Maximum value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Aggregation field. Valid values: `host` (source IP), `user` （username), `dbName` (database name), `sqlType` (SQL type). 
     * @return AggregationField Aggregation field. Valid values: `host` (source IP), `user` （username), `dbName` (database name), `sqlType` (SQL type).
     */
    public String getAggregationField() {
        return this.AggregationField;
    }

    /**
     * Set Aggregation field. Valid values: `host` (source IP), `user` （username), `dbName` (database name), `sqlType` (SQL type).
     * @param AggregationField Aggregation field. Valid values: `host` (source IP), `user` （username), `dbName` (database name), `sqlType` (SQL type).
     */
    public void setAggregationField(String AggregationField) {
        this.AggregationField = AggregationField;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of buckets returned under this field. Maximum value: `100`. 
     * @return Limit Number of buckets returned under this field. Maximum value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of buckets returned under this field. Maximum value: `100`.
     * @param Limit Number of buckets returned under this field. Maximum value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public AggregationCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AggregationCondition(AggregationCondition source) {
        if (source.AggregationField != null) {
            this.AggregationField = new String(source.AggregationField);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AggregationField", this.AggregationField);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

