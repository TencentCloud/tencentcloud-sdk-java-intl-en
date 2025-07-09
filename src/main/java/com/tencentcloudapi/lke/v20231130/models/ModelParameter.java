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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelParameter extends AbstractModel {

    /**
    * Default value.
    */
    @SerializedName("Default")
    @Expose
    private Float Default;

    /**
    * Minimum value.
    */
    @SerializedName("Min")
    @Expose
    private Float Min;

    /**
    * Maximum value.
    */
    @SerializedName("Max")
    @Expose
    private Float Max;

    /**
     * Get Default value. 
     * @return Default Default value.
     */
    public Float getDefault() {
        return this.Default;
    }

    /**
     * Set Default value.
     * @param Default Default value.
     */
    public void setDefault(Float Default) {
        this.Default = Default;
    }

    /**
     * Get Minimum value. 
     * @return Min Minimum value.
     */
    public Float getMin() {
        return this.Min;
    }

    /**
     * Set Minimum value.
     * @param Min Minimum value.
     */
    public void setMin(Float Min) {
        this.Min = Min;
    }

    /**
     * Get Maximum value. 
     * @return Max Maximum value.
     */
    public Float getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value.
     * @param Max Maximum value.
     */
    public void setMax(Float Max) {
        this.Max = Max;
    }

    public ModelParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelParameter(ModelParameter source) {
        if (source.Default != null) {
            this.Default = new Float(source.Default);
        }
        if (source.Min != null) {
            this.Min = new Float(source.Min);
        }
        if (source.Max != null) {
            this.Max = new Float(source.Max);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);

    }
}

