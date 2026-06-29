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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RequestFilter extends AbstractModel {

    /**
    * Filter field name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Filter operator. Values: EXACT (exact match), FUZZY (fuzzy matching), NOT (exclusion).
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * Filter value list. Supports up to 10.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

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
     * Get Filter operator. Values: EXACT (exact match), FUZZY (fuzzy matching), NOT (exclusion). 
     * @return Op Filter operator. Values: EXACT (exact match), FUZZY (fuzzy matching), NOT (exclusion).
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set Filter operator. Values: EXACT (exact match), FUZZY (fuzzy matching), NOT (exclusion).
     * @param Op Filter operator. Values: EXACT (exact match), FUZZY (fuzzy matching), NOT (exclusion).
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get Filter value list. Supports up to 10. 
     * @return Values Filter value list. Supports up to 10.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Filter value list. Supports up to 10.
     * @param Values Filter value list. Supports up to 10.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public RequestFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestFilter(RequestFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Op != null) {
            this.Op = new String(source.Op);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

