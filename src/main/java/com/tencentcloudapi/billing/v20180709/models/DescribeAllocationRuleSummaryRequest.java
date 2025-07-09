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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllocationRuleSummaryRequest extends AbstractModel {

    /**
    * Specifies the data quantity per fetch. the maximum value is 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Month, which is the current month by default if not provided.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Public area policy type, for filtering.
Enumeration values are as follows:. 
1 - custom sharing proportion. 
2 - proportional allocation. 
3 - allocation by proportion.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Sharing rule name or cost allocation unit name, used for fuzzy filter criteria.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Specifies the data quantity per fetch. the maximum value is 1000. 
     * @return Limit Specifies the data quantity per fetch. the maximum value is 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Specifies the data quantity per fetch. the maximum value is 1000.
     * @param Limit Specifies the data quantity per fetch. the maximum value is 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Month, which is the current month by default if not provided. 
     * @return Month Month, which is the current month by default if not provided.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Month, which is the current month by default if not provided.
     * @param Month Month, which is the current month by default if not provided.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Public area policy type, for filtering.
Enumeration values are as follows:. 
1 - custom sharing proportion. 
2 - proportional allocation. 
3 - allocation by proportion. 
     * @return Type Public area policy type, for filtering.
Enumeration values are as follows:. 
1 - custom sharing proportion. 
2 - proportional allocation. 
3 - allocation by proportion.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Public area policy type, for filtering.
Enumeration values are as follows:. 
1 - custom sharing proportion. 
2 - proportional allocation. 
3 - allocation by proportion.
     * @param Type Public area policy type, for filtering.
Enumeration values are as follows:. 
1 - custom sharing proportion. 
2 - proportional allocation. 
3 - allocation by proportion.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Sharing rule name or cost allocation unit name, used for fuzzy filter criteria. 
     * @return Name Sharing rule name or cost allocation unit name, used for fuzzy filter criteria.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Sharing rule name or cost allocation unit name, used for fuzzy filter criteria.
     * @param Name Sharing rule name or cost allocation unit name, used for fuzzy filter criteria.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeAllocationRuleSummaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationRuleSummaryRequest(DescribeAllocationRuleSummaryRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

