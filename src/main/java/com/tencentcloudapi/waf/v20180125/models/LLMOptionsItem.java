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

public class LLMOptionsItem extends AbstractModel {

    /**
    * Key.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Operator.
    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * Value.
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
    * Use with Header Parameter Value
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Region selection
    */
    @SerializedName("Areas")
    @Expose
    private Area [] Areas;

    /**
     * Get Key. 
     * @return Key Key.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key.
     * @param Key Key.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Operator. 
     * @return Op Operator.
     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set Operator.
     * @param Op Operator.
     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get Value. 
     * @return Value Value.
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set Value.
     * @param Value Value.
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    /**
     * Get Use with Header Parameter Value 
     * @return Name Use with Header Parameter Value
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Use with Header Parameter Value
     * @param Name Use with Header Parameter Value
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Region selection 
     * @return Areas Region selection
     */
    public Area [] getAreas() {
        return this.Areas;
    }

    /**
     * Set Region selection
     * @param Areas Region selection
     */
    public void setAreas(Area [] Areas) {
        this.Areas = Areas;
    }

    public LLMOptionsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMOptionsItem(LLMOptionsItem source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Op != null) {
            this.Op = new String(source.Op);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Areas != null) {
            this.Areas = new Area[source.Areas.length];
            for (int i = 0; i < source.Areas.length; i++) {
                this.Areas[i] = new Area(source.Areas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Areas.", this.Areas);

    }
}

