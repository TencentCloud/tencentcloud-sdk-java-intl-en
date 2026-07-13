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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagsForm extends AbstractModel {

    /**
    * key
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * value
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagValue")
    @Expose
    private String [] TagValue;

    /**
     * Get key
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagKey key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set key
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagKey key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get value
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagValue value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTagValue() {
        return this.TagValue;
    }

    /**
     * Set value
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagValue value
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagValue(String [] TagValue) {
        this.TagValue = TagValue;
    }

    public TagsForm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagsForm(TagsForm source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String[source.TagValue.length];
            for (int i = 0; i < source.TagValue.length; i++) {
                this.TagValue[i] = new String(source.TagValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamArraySimple(map, prefix + "TagValue.", this.TagValue);

    }
}

