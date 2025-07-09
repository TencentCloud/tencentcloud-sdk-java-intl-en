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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLogAggregationResult extends AbstractModel {

    /**
    * Aggregation dimension
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AggregationField")
    @Expose
    private String AggregationField;

    /**
    * Result set of an aggregation bucket
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Buckets")
    @Expose
    private Bucket [] Buckets;

    /**
     * Get Aggregation dimension
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AggregationField Aggregation dimension
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAggregationField() {
        return this.AggregationField;
    }

    /**
     * Set Aggregation dimension
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AggregationField Aggregation dimension
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAggregationField(String AggregationField) {
        this.AggregationField = AggregationField;
    }

    /**
     * Get Result set of an aggregation bucket
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Buckets Result set of an aggregation bucket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Bucket [] getBuckets() {
        return this.Buckets;
    }

    /**
     * Set Result set of an aggregation bucket
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Buckets Result set of an aggregation bucket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBuckets(Bucket [] Buckets) {
        this.Buckets = Buckets;
    }

    public AuditLogAggregationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogAggregationResult(AuditLogAggregationResult source) {
        if (source.AggregationField != null) {
            this.AggregationField = new String(source.AggregationField);
        }
        if (source.Buckets != null) {
            this.Buckets = new Bucket[source.Buckets.length];
            for (int i = 0; i < source.Buckets.length; i++) {
                this.Buckets[i] = new Bucket(source.Buckets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AggregationField", this.AggregationField);
        this.setParamArrayObj(map, prefix + "Buckets.", this.Buckets);

    }
}

