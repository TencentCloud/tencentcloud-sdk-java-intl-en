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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduleBizEnumBrief extends AbstractModel {

    /**
    * Enumerate tag keys
    */
    @SerializedName("LabelKey")
    @Expose
    private String LabelKey;

    /**
    * Enumerate tag values.
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
    * Statistical quantity of enumeration items
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Enumerate tag keys 
     * @return LabelKey Enumerate tag keys
     */
    public String getLabelKey() {
        return this.LabelKey;
    }

    /**
     * Set Enumerate tag keys
     * @param LabelKey Enumerate tag keys
     */
    public void setLabelKey(String LabelKey) {
        this.LabelKey = LabelKey;
    }

    /**
     * Get Enumerate tag values. 
     * @return LabelValue Enumerate tag values.
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set Enumerate tag values.
     * @param LabelValue Enumerate tag values.
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    /**
     * Get Statistical quantity of enumeration items 
     * @return Count Statistical quantity of enumeration items
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Statistical quantity of enumeration items
     * @param Count Statistical quantity of enumeration items
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public ScheduleBizEnumBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduleBizEnumBrief(ScheduleBizEnumBrief source) {
        if (source.LabelKey != null) {
            this.LabelKey = new String(source.LabelKey);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelKey", this.LabelKey);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

