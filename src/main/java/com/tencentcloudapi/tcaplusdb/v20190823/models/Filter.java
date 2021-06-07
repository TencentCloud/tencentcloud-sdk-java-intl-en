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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel{

    /**
    * Filter field name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Filter field value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Filter field value
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Filter field name 
     * @return Name Filter field name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filter field name
     * @param Name Filter field name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Filter field value 
     * @return Value Filter field value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Filter field value
     * @param Value Filter field value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Filter field value 
     * @return Values Filter field value
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Filter field value
     * @param Values Filter field value
     */
    public void setValues(String [] Values) {
        this.Values = Values;
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
        if (source.Value != null) {
            this.Value = new String(source.Value);
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
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

