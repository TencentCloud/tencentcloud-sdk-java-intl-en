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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WhereFilter extends AbstractModel {

    /**
    * Filter item
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Filter value
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    *  
`1`: =; `2`: >; `3`: <; `4`: ≥; `5`: ≤; `6`: ≠;
`7`: Exact match; `9`: Fuzzy match; `13`: Non-fuzzy match; `14`: AND

    */
    @SerializedName("OperatorType")
    @Expose
    private Long OperatorType;

    /**
     * Get Filter item 
     * @return Name Filter item
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filter item
     * @param Name Filter item
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Filter value 
     * @return Values Filter value
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Filter value
     * @param Values Filter value
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get  
`1`: =; `2`: >; `3`: <; `4`: ≥; `5`: ≤; `6`: ≠;
`7`: Exact match; `9`: Fuzzy match; `13`: Non-fuzzy match; `14`: AND
 
     * @return OperatorType  
`1`: =; `2`: >; `3`: <; `4`: ≥; `5`: ≤; `6`: ≠;
`7`: Exact match; `9`: Fuzzy match; `13`: Non-fuzzy match; `14`: AND

     */
    public Long getOperatorType() {
        return this.OperatorType;
    }

    /**
     * Set  
`1`: =; `2`: >; `3`: <; `4`: ≥; `5`: ≤; `6`: ≠;
`7`: Exact match; `9`: Fuzzy match; `13`: Non-fuzzy match; `14`: AND

     * @param OperatorType  
`1`: =; `2`: >; `3`: <; `4`: ≥; `5`: ≤; `6`: ≠;
`7`: Exact match; `9`: Fuzzy match; `13`: Non-fuzzy match; `14`: AND

     */
    public void setOperatorType(Long OperatorType) {
        this.OperatorType = OperatorType;
    }

    public WhereFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhereFilter(WhereFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.OperatorType != null) {
            this.OperatorType = new Long(source.OperatorType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "OperatorType", this.OperatorType);

    }
}

