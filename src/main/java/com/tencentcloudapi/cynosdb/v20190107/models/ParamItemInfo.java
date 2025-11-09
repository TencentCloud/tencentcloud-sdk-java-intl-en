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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamItemInfo extends AbstractModel {

    /**
    * Parameter name.
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * New parameter value.

    */
    @SerializedName("NewValue")
    @Expose
    private String NewValue;

    /**
    * Old parameter value.

    */
    @SerializedName("OldValue")
    @Expose
    private String OldValue;

    /**
    * Parameter formula.

    */
    @SerializedName("ValueFunction")
    @Expose
    private String ValueFunction;

    /**
     * Get Parameter name. 
     * @return ParamName Parameter name.
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Parameter name.
     * @param ParamName Parameter name.
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get New parameter value.
 
     * @return NewValue New parameter value.

     */
    public String getNewValue() {
        return this.NewValue;
    }

    /**
     * Set New parameter value.

     * @param NewValue New parameter value.

     */
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

    /**
     * Get Old parameter value.
 
     * @return OldValue Old parameter value.

     */
    public String getOldValue() {
        return this.OldValue;
    }

    /**
     * Set Old parameter value.

     * @param OldValue Old parameter value.

     */
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    /**
     * Get Parameter formula.
 
     * @return ValueFunction Parameter formula.

     */
    public String getValueFunction() {
        return this.ValueFunction;
    }

    /**
     * Set Parameter formula.

     * @param ValueFunction Parameter formula.

     */
    public void setValueFunction(String ValueFunction) {
        this.ValueFunction = ValueFunction;
    }

    public ParamItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamItemInfo(ParamItemInfo source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.NewValue != null) {
            this.NewValue = new String(source.NewValue);
        }
        if (source.OldValue != null) {
            this.OldValue = new String(source.OldValue);
        }
        if (source.ValueFunction != null) {
            this.ValueFunction = new String(source.ValueFunction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "NewValue", this.NewValue);
        this.setParamSimple(map, prefix + "OldValue", this.OldValue);
        this.setParamSimple(map, prefix + "ValueFunction", this.ValueFunction);

    }
}

