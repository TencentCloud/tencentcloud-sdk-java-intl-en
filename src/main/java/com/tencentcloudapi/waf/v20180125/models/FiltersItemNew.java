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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FiltersItemNew extends AbstractModel {

    /**
    * Field name, used for filtering
Filter the sub-order number (value) by DealName.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Values after filtering
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * Exact search or not
    */
    @SerializedName("ExactMatch")
    @Expose
    private Boolean ExactMatch;

    /**
     * Get Field name, used for filtering
Filter the sub-order number (value) by DealName. 
     * @return Name Field name, used for filtering
Filter the sub-order number (value) by DealName.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Field name, used for filtering
Filter the sub-order number (value) by DealName.
     * @param Name Field name, used for filtering
Filter the sub-order number (value) by DealName.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Values after filtering 
     * @return Values Values after filtering
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Values after filtering
     * @param Values Values after filtering
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get Exact search or not 
     * @return ExactMatch Exact search or not
     */
    public Boolean getExactMatch() {
        return this.ExactMatch;
    }

    /**
     * Set Exact search or not
     * @param ExactMatch Exact search or not
     */
    public void setExactMatch(Boolean ExactMatch) {
        this.ExactMatch = ExactMatch;
    }

    public FiltersItemNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FiltersItemNew(FiltersItemNew source) {
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
            this.ExactMatch = new Boolean(source.ExactMatch);
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

