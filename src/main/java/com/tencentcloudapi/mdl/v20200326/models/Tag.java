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
    * Tag key, for restrictions please refer to the tag documentation: https://www.tencentcloud.com/document/product/651/13354.
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * Tag value, for restrictions please refer to the tag documentation: https://www.tencentcloud.com/document/product/651/13354.
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * Tag type, optional; for documentation please refer to: https://www.tencentcloud.com/document/product/651/33023#tag.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get Tag key, for restrictions please refer to the tag documentation: https://www.tencentcloud.com/document/product/651/13354. 
     * @return TagKey Tag key, for restrictions please refer to the tag documentation: https://www.tencentcloud.com/document/product/651/13354.
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Tag key, for restrictions please refer to the tag documentation: https://www.tencentcloud.com/document/product/651/13354.
     * @param TagKey Tag key, for restrictions please refer to the tag documentation: https://www.tencentcloud.com/document/product/651/13354.
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get Tag value, for restrictions please refer to the tag documentation: https://www.tencentcloud.com/document/product/651/13354. 
     * @return TagValue Tag value, for restrictions please refer to the tag documentation: https://www.tencentcloud.com/document/product/651/13354.
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set Tag value, for restrictions please refer to the tag documentation: https://www.tencentcloud.com/document/product/651/13354.
     * @param TagValue Tag value, for restrictions please refer to the tag documentation: https://www.tencentcloud.com/document/product/651/13354.
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get Tag type, optional; for documentation please refer to: https://www.tencentcloud.com/document/product/651/33023#tag. 
     * @return Category Tag type, optional; for documentation please refer to: https://www.tencentcloud.com/document/product/651/33023#tag.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Tag type, optional; for documentation please refer to: https://www.tencentcloud.com/document/product/651/33023#tag.
     * @param Category Tag type, optional; for documentation please refer to: https://www.tencentcloud.com/document/product/651/33023#tag.
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

