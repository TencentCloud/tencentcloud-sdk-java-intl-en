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
package com.tencentcloudapi.ctsdb.v20230202.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter extends AbstractModel {

    /**
    * Filter parameter.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Filter expression.
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * Value involved in filtering.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Filter parameter. 
     * @return Name Filter parameter.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filter parameter.
     * @param Name Filter parameter.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Filter expression. 
     * @return Op Filter expression.
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set Filter expression.
     * @param Op Filter expression.
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get Value involved in filtering. 
     * @return Values Value involved in filtering.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Value involved in filtering.
     * @param Values Value involved in filtering.
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

