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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagWithCreate extends AbstractModel {

    /**
    * Tag key
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * Tag value
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
     * Get Tag key 
     * @return TagKey Tag key
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Tag key
     * @param TagKey Tag key
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get Tag value 
     * @return TagValue Tag value
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set Tag value
     * @param TagValue Tag value
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    public TagWithCreate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagWithCreate(TagWithCreate source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);

    }
}

