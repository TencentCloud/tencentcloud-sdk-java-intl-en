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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * One or more filter values.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * Filter name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get One or more filter values. 
     * @return Values One or more filter values.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set One or more filter values.
     * @param Values One or more filter values.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get Filter name. 
     * @return Name Filter name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filter name.
     * @param Name Filter name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public Filter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Filter(Filter source) {
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

