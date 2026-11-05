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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelParameter extends AbstractModel {

    /**
    * <p>Default value.</p>
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * <p>Available Option List</p>
    */
    @SerializedName("EnumValueList")
    @Expose
    private String [] EnumValueList;

    /**
    * <p>Maximum value (valid only for numerical type).</p>
    */
    @SerializedName("MaxValue")
    @Expose
    private Float MaxValue;

    /**
    * <p>Minimum value (valid only for numerical types).</p>
    */
    @SerializedName("MinValue")
    @Expose
    private Float MinValue;

    /**
    * <p>Hyperparameter name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Hyperparameter type. 1-floating-point number, 2-integer, 3-string</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get <p>Default value.</p> 
     * @return DefaultValue <p>Default value.</p>
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set <p>Default value.</p>
     * @param DefaultValue <p>Default value.</p>
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get <p>Available Option List</p> 
     * @return EnumValueList <p>Available Option List</p>
     */
    public String [] getEnumValueList() {
        return this.EnumValueList;
    }

    /**
     * Set <p>Available Option List</p>
     * @param EnumValueList <p>Available Option List</p>
     */
    public void setEnumValueList(String [] EnumValueList) {
        this.EnumValueList = EnumValueList;
    }

    /**
     * Get <p>Maximum value (valid only for numerical type).</p> 
     * @return MaxValue <p>Maximum value (valid only for numerical type).</p>
     */
    public Float getMaxValue() {
        return this.MaxValue;
    }

    /**
     * Set <p>Maximum value (valid only for numerical type).</p>
     * @param MaxValue <p>Maximum value (valid only for numerical type).</p>
     */
    public void setMaxValue(Float MaxValue) {
        this.MaxValue = MaxValue;
    }

    /**
     * Get <p>Minimum value (valid only for numerical types).</p> 
     * @return MinValue <p>Minimum value (valid only for numerical types).</p>
     */
    public Float getMinValue() {
        return this.MinValue;
    }

    /**
     * Set <p>Minimum value (valid only for numerical types).</p>
     * @param MinValue <p>Minimum value (valid only for numerical types).</p>
     */
    public void setMinValue(Float MinValue) {
        this.MinValue = MinValue;
    }

    /**
     * Get <p>Hyperparameter name</p> 
     * @return Name <p>Hyperparameter name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Hyperparameter name</p>
     * @param Name <p>Hyperparameter name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Hyperparameter type. 1-floating-point number, 2-integer, 3-string</p> 
     * @return Type <p>Hyperparameter type. 1-floating-point number, 2-integer, 3-string</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Hyperparameter type. 1-floating-point number, 2-integer, 3-string</p>
     * @param Type <p>Hyperparameter type. 1-floating-point number, 2-integer, 3-string</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ModelParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelParameter(ModelParameter source) {
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.EnumValueList != null) {
            this.EnumValueList = new String[source.EnumValueList.length];
            for (int i = 0; i < source.EnumValueList.length; i++) {
                this.EnumValueList[i] = new String(source.EnumValueList[i]);
            }
        }
        if (source.MaxValue != null) {
            this.MaxValue = new Float(source.MaxValue);
        }
        if (source.MinValue != null) {
            this.MinValue = new Float(source.MinValue);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamArraySimple(map, prefix + "EnumValueList.", this.EnumValueList);
        this.setParamSimple(map, prefix + "MaxValue", this.MaxValue);
        this.setParamSimple(map, prefix + "MinValue", this.MinValue);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

