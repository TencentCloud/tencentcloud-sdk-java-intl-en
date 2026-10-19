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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCosAuditDictionaryListRequest extends AbstractModel {

    /**
    * <p>Dictionary type (RootCategory: level-1 category, IdentifyRule: sensitive identification data item)</p>
    */
    @SerializedName("DictType")
    @Expose
    private String DictType;

    /**
    * <p>Filtering criteria</p>
    */
    @SerializedName("Filters")
    @Expose
    private WhereFilter [] Filters;

    /**
     * Get <p>Dictionary type (RootCategory: level-1 category, IdentifyRule: sensitive identification data item)</p> 
     * @return DictType <p>Dictionary type (RootCategory: level-1 category, IdentifyRule: sensitive identification data item)</p>
     */
    public String getDictType() {
        return this.DictType;
    }

    /**
     * Set <p>Dictionary type (RootCategory: level-1 category, IdentifyRule: sensitive identification data item)</p>
     * @param DictType <p>Dictionary type (RootCategory: level-1 category, IdentifyRule: sensitive identification data item)</p>
     */
    public void setDictType(String DictType) {
        this.DictType = DictType;
    }

    /**
     * Get <p>Filtering criteria</p> 
     * @return Filters <p>Filtering criteria</p>
     */
    public WhereFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filtering criteria</p>
     * @param Filters <p>Filtering criteria</p>
     */
    public void setFilters(WhereFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCosAuditDictionaryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCosAuditDictionaryListRequest(DescribeCosAuditDictionaryListRequest source) {
        if (source.DictType != null) {
            this.DictType = new String(source.DictType);
        }
        if (source.Filters != null) {
            this.Filters = new WhereFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new WhereFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DictType", this.DictType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

