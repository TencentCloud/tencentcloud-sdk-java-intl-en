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

public class LabelBrief extends AbstractModel {

    /**
    * Tag name.
    */
    @SerializedName("LabelKey")
    @Expose
    private String LabelKey;

    /**
    * Tag value.
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
    * Tag name ID, obtainable through tag-related APIs
    */
    @SerializedName("LabelKeyId")
    @Expose
    private String LabelKeyId;

    /**
    * Tag value ID, which can be obtained through tag relevant APIs.
    */
    @SerializedName("LabelValueId")
    @Expose
    private String LabelValueId;

    /**
     * Get Tag name. 
     * @return LabelKey Tag name.
     */
    public String getLabelKey() {
        return this.LabelKey;
    }

    /**
     * Set Tag name.
     * @param LabelKey Tag name.
     */
    public void setLabelKey(String LabelKey) {
        this.LabelKey = LabelKey;
    }

    /**
     * Get Tag value. 
     * @return LabelValue Tag value.
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set Tag value.
     * @param LabelValue Tag value.
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    /**
     * Get Tag name ID, obtainable through tag-related APIs 
     * @return LabelKeyId Tag name ID, obtainable through tag-related APIs
     */
    public String getLabelKeyId() {
        return this.LabelKeyId;
    }

    /**
     * Set Tag name ID, obtainable through tag-related APIs
     * @param LabelKeyId Tag name ID, obtainable through tag-related APIs
     */
    public void setLabelKeyId(String LabelKeyId) {
        this.LabelKeyId = LabelKeyId;
    }

    /**
     * Get Tag value ID, which can be obtained through tag relevant APIs. 
     * @return LabelValueId Tag value ID, which can be obtained through tag relevant APIs.
     */
    public String getLabelValueId() {
        return this.LabelValueId;
    }

    /**
     * Set Tag value ID, which can be obtained through tag relevant APIs.
     * @param LabelValueId Tag value ID, which can be obtained through tag relevant APIs.
     */
    public void setLabelValueId(String LabelValueId) {
        this.LabelValueId = LabelValueId;
    }

    public LabelBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelBrief(LabelBrief source) {
        if (source.LabelKey != null) {
            this.LabelKey = new String(source.LabelKey);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
        if (source.LabelKeyId != null) {
            this.LabelKeyId = new String(source.LabelKeyId);
        }
        if (source.LabelValueId != null) {
            this.LabelValueId = new String(source.LabelValueId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelKey", this.LabelKey);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);
        this.setParamSimple(map, prefix + "LabelKeyId", this.LabelKeyId);
        this.setParamSimple(map, prefix + "LabelValueId", this.LabelValueId);

    }
}

