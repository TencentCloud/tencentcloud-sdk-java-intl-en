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

public class Filters extends AbstractModel {

    /**
    * Filter condition name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Filter condition value list
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * Exact match: 1 - exact match; default - fuzzy match
    */
    @SerializedName("ExactMatch")
    @Expose
    private String ExactMatch;

    /**
     * Get Filter condition name. 
     * @return Name Filter condition name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filter condition name.
     * @param Name Filter condition name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Filter condition value list 
     * @return Values Filter condition value list
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Filter condition value list
     * @param Values Filter condition value list
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get Exact match: 1 - exact match; default - fuzzy match 
     * @return ExactMatch Exact match: 1 - exact match; default - fuzzy match
     */
    public String getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set Exact match: 1 - exact match; default - fuzzy match
     * @param ExactMatch Exact match: 1 - exact match; default - fuzzy match
     */
    public void setExactMatch(String ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    public Filters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filters(Filters source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.ExactMatch != null) {
            this.ExactMatch = new String(source.ExactMatch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "ExactMatch", this.ExactMatch);

    }
}

