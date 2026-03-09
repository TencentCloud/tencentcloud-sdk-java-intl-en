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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BizStateEnumInfoBrief extends AbstractModel {

    /**
    * Tag key.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LabelKey")
    @Expose
    private String LabelKey;

    /**
    * Tag value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
    * Total number of tags.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Tag key.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LabelKey Tag key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLabelKey() {
        return this.LabelKey;
    }

    /**
     * Set Tag key.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LabelKey Tag key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabelKey(String LabelKey) {
        this.LabelKey = LabelKey;
    }

    /**
     * Get Tag value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LabelValue Tag value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set Tag value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LabelValue Tag value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    /**
     * Get Total number of tags.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Count Total number of tags.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Total number of tags.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Count Total number of tags.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public BizStateEnumInfoBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BizStateEnumInfoBrief(BizStateEnumInfoBrief source) {
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

