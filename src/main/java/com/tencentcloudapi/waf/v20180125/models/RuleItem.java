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

public class RuleItem extends AbstractModel {

    /**
    *  Information Type
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    *  Operator. Default value: Contains.

    */
    @SerializedName("Op")
    @Expose
    private String Op;

    /**
    * Information Type
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
    * Information type.
    */
    @SerializedName("Levels")
    @Expose
    private ValueLevel [] Levels;

    /**
    * Toolcall tool parameter name. Supports multi-level paths (such as apiData.operate_op). Only used for the tool_args information type.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get  Information Type 
     * @return Key  Information Type
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set  Information Type
     * @param Key  Information Type
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get  Operator. Default value: Contains.
 
     * @return Op  Operator. Default value: Contains.

     */
    public String getOp() {
        return this.Op;
    }

    /**
     * Set  Operator. Default value: Contains.

     * @param Op  Operator. Default value: Contains.

     */
    public void setOp(String Op) {
        this.Op = Op;
    }

    /**
     * Get Information Type 
     * @return Value Information Type
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set Information Type
     * @param Value Information Type
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    /**
     * Get Information type. 
     * @return Levels Information type.
     */
    public ValueLevel [] getLevels() {
        return this.Levels;
    }

    /**
     * Set Information type.
     * @param Levels Information type.
     */
    public void setLevels(ValueLevel [] Levels) {
        this.Levels = Levels;
    }

    /**
     * Get Toolcall tool parameter name. Supports multi-level paths (such as apiData.operate_op). Only used for the tool_args information type. 
     * @return Name Toolcall tool parameter name. Supports multi-level paths (such as apiData.operate_op). Only used for the tool_args information type.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Toolcall tool parameter name. Supports multi-level paths (such as apiData.operate_op). Only used for the tool_args information type.
     * @param Name Toolcall tool parameter name. Supports multi-level paths (such as apiData.operate_op). Only used for the tool_args information type.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public RuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleItem(RuleItem source) {
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
        if (source.Levels != null) {
            this.Levels = new ValueLevel[source.Levels.length];
            for (int i = 0; i < source.Levels.length; i++) {
                this.Levels[i] = new ValueLevel(source.Levels[i]);
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
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);
        this.setParamArrayObj(map, prefix + "Levels.", this.Levels);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

