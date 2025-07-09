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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedFilter extends AbstractModel {

    /**
    * Field to be filtered.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Value of the filtered field.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * Whether to enable fuzzy query.
    */
    @SerializedName("Fuzzy")
    @Expose
    private Boolean Fuzzy;

    /**
     * Get Field to be filtered. 
     * @return Name Field to be filtered.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Field to be filtered.
     * @param Name Field to be filtered.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Value of the filtered field. 
     * @return Values Value of the filtered field.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Value of the filtered field.
     * @param Values Value of the filtered field.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get Whether to enable fuzzy query. 
     * @return Fuzzy Whether to enable fuzzy query.
     */
    public Boolean getFuzzy() {
        return this.Fuzzy;
    }

    /**
     * Set Whether to enable fuzzy query.
     * @param Fuzzy Whether to enable fuzzy query.
     */
    public void setFuzzy(Boolean Fuzzy) {
        this.Fuzzy = Fuzzy;
    }

    public AdvancedFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedFilter(AdvancedFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.Fuzzy != null) {
            this.Fuzzy = new Boolean(source.Fuzzy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Fuzzy", this.Fuzzy);

    }
}

