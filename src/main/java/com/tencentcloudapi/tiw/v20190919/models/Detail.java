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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Detail extends AbstractModel {

    /**
    * Usage metric.
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * Usage weight.
    */
    @SerializedName("Weight")
    @Expose
    private Float Weight;

    /**
    * Usage value.
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get Usage metric. 
     * @return TagName Usage metric.
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set Usage metric.
     * @param TagName Usage metric.
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get Usage weight. 
     * @return Weight Usage weight.
     */
    public Float getWeight() {
        return this.Weight;
    }

    /**
     * Set Usage weight.
     * @param Weight Usage weight.
     */
    public void setWeight(Float Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Usage value. 
     * @return Value Usage value.
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set Usage value.
     * @param Value Usage value.
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public Detail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Detail(Detail source) {
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.Weight != null) {
            this.Weight = new Float(source.Weight);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

