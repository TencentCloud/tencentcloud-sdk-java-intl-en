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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagWithDelete extends AbstractModel {

    /**
    * Tag key.
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * Tag value.
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * If deletion is allowed.
    */
    @SerializedName("CanDelete")
    @Expose
    private Long CanDelete;

    /**
    * Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All.Note: This field may return null, indicating that no value is obtained.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get Tag key. 
     * @return TagKey Tag key.
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Tag key.
     * @param TagKey Tag key.
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get Tag value. 
     * @return TagValue Tag value.
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set Tag value.
     * @param TagValue Tag value.
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get If deletion is allowed. 
     * @return CanDelete If deletion is allowed.
     */
    public Long getCanDelete() {
        return this.CanDelete;
    }

    /**
     * Set If deletion is allowed.
     * @param CanDelete If deletion is allowed.
     */
    public void setCanDelete(Long CanDelete) {
        this.CanDelete = CanDelete;
    }

    /**
     * Get Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All.Note: This field may return null, indicating that no value is obtained. 
     * @return Category Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All.Note: This field may return null, indicating that no value is obtained.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All.Note: This field may return null, indicating that no value is obtained.
     * @param Category Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All.Note: This field may return null, indicating that no value is obtained.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public TagWithDelete() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagWithDelete(TagWithDelete source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.CanDelete != null) {
            this.CanDelete = new Long(source.CanDelete);
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
        this.setParamSimple(map, prefix + "CanDelete", this.CanDelete);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

