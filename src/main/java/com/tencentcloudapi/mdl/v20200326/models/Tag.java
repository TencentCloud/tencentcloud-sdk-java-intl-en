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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tag extends AbstractModel {

    /**
    * Tag key. Refer to the tag document (https://www.tencentcloud.com/document/product/651/13354?from_cn_redirect=1) for limits.
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * Tag value. For reference, see the tag document at https://www.tencentcloud.com/document/product/651/13354.?from_cn_redirect=1
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * Tag type, optional. See the tag document for reference (https://www.tencentcloud.com/document/product/651/35327?from_cn_redirect=1#Tag).
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get Tag key. Refer to the tag document (https://www.tencentcloud.com/document/product/651/13354?from_cn_redirect=1) for limits. 
     * @return TagKey Tag key. Refer to the tag document (https://www.tencentcloud.com/document/product/651/13354?from_cn_redirect=1) for limits.
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Tag key. Refer to the tag document (https://www.tencentcloud.com/document/product/651/13354?from_cn_redirect=1) for limits.
     * @param TagKey Tag key. Refer to the tag document (https://www.tencentcloud.com/document/product/651/13354?from_cn_redirect=1) for limits.
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get Tag value. For reference, see the tag document at https://www.tencentcloud.com/document/product/651/13354.?from_cn_redirect=1 
     * @return TagValue Tag value. For reference, see the tag document at https://www.tencentcloud.com/document/product/651/13354.?from_cn_redirect=1
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set Tag value. For reference, see the tag document at https://www.tencentcloud.com/document/product/651/13354.?from_cn_redirect=1
     * @param TagValue Tag value. For reference, see the tag document at https://www.tencentcloud.com/document/product/651/13354.?from_cn_redirect=1
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get Tag type, optional. See the tag document for reference (https://www.tencentcloud.com/document/product/651/35327?from_cn_redirect=1#Tag). 
     * @return Category Tag type, optional. See the tag document for reference (https://www.tencentcloud.com/document/product/651/35327?from_cn_redirect=1#Tag).
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Tag type, optional. See the tag document for reference (https://www.tencentcloud.com/document/product/651/35327?from_cn_redirect=1#Tag).
     * @param Category Tag type, optional. See the tag document for reference (https://www.tencentcloud.com/document/product/651/35327?from_cn_redirect=1#Tag).
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public Tag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tag(Tag source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

