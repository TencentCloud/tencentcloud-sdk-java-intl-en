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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * Filter field name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Filter field values.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * Whether to enable reverse query.
    */
    @SerializedName("Negative")
    @Expose
    private Boolean Negative;

    /**
    * Whether to enable fuzzy matching.
    */
    @SerializedName("Fuzzy")
    @Expose
    private Boolean Fuzzy;

    /**
     * Get Filter field name. 
     * @return Name Filter field name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filter field name.
     * @param Name Filter field name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Filter field values. 
     * @return Values Filter field values.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Filter field values.
     * @param Values Filter field values.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get Whether to enable reverse query. 
     * @return Negative Whether to enable reverse query.
     */
    public Boolean getNegative() {
        return this.Negative;
    }

    /**
     * Set Whether to enable reverse query.
     * @param Negative Whether to enable reverse query.
     */
    public void setNegative(Boolean Negative) {
        this.Negative = Negative;
    }

    /**
     * Get Whether to enable fuzzy matching. 
     * @return Fuzzy Whether to enable fuzzy matching.
     */
    public Boolean getFuzzy() {
        return this.Fuzzy;
    }

    /**
     * Set Whether to enable fuzzy matching.
     * @param Fuzzy Whether to enable fuzzy matching.
     */
    public void setFuzzy(Boolean Fuzzy) {
        this.Fuzzy = Fuzzy;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.Negative != null) {
            this.Negative = new Boolean(source.Negative);
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
        this.setParamSimple(map, prefix + "Negative", this.Negative);
        this.setParamSimple(map, prefix + "Fuzzy", this.Fuzzy);

    }
}

