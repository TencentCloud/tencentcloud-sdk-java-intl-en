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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FieldConfig extends AbstractModel {

    /**
    * <p>Field display</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>Field value</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>Field style configuration</p>
    */
    @SerializedName("Style")
    @Expose
    private FieldStyle Style;

    /**
    * <p>Field content quantity.</p>
    */
    @SerializedName("ValueCount")
    @Expose
    private Long ValueCount;

    /**
     * Get <p>Field display</p> 
     * @return Label <p>Field display</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>Field display</p>
     * @param Label <p>Field display</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>Field value</p> 
     * @return Value <p>Field value</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>Field value</p>
     * @param Value <p>Field value</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>Field style configuration</p> 
     * @return Style <p>Field style configuration</p>
     */
    public FieldStyle getStyle() {
        return this.Style;
    }

    /**
     * Set <p>Field style configuration</p>
     * @param Style <p>Field style configuration</p>
     */
    public void setStyle(FieldStyle Style) {
        this.Style = Style;
    }

    /**
     * Get <p>Field content quantity.</p> 
     * @return ValueCount <p>Field content quantity.</p>
     */
    public Long getValueCount() {
        return this.ValueCount;
    }

    /**
     * Set <p>Field content quantity.</p>
     * @param ValueCount <p>Field content quantity.</p>
     */
    public void setValueCount(Long ValueCount) {
        this.ValueCount = ValueCount;
    }

    public FieldConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FieldConfig(FieldConfig source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Style != null) {
            this.Style = new FieldStyle(source.Style);
        }
        if (source.ValueCount != null) {
            this.ValueCount = new Long(source.ValueCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamObj(map, prefix + "Style.", this.Style);
        this.setParamSimple(map, prefix + "ValueCount", this.ValueCount);

    }
}

