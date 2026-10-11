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

public class UserTagInfo extends AbstractModel {

    /**
    * <p>Tag dimension ID</p>
    */
    @SerializedName("TagId")
    @Expose
    private String TagId;

    /**
    * <p>Tag name, filled during queries, not passed when writing</p>
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * <p>All tag values bound to this dimension</p>
    */
    @SerializedName("Values")
    @Expose
    private TagValueInfo [] Values;

    /**
     * Get <p>Tag dimension ID</p> 
     * @return TagId <p>Tag dimension ID</p>
     */
    public String getTagId() {
        return this.TagId;
    }

    /**
     * Set <p>Tag dimension ID</p>
     * @param TagId <p>Tag dimension ID</p>
     */
    public void setTagId(String TagId) {
        this.TagId = TagId;
    }

    /**
     * Get <p>Tag name, filled during queries, not passed when writing</p> 
     * @return TagName <p>Tag name, filled during queries, not passed when writing</p>
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set <p>Tag name, filled during queries, not passed when writing</p>
     * @param TagName <p>Tag name, filled during queries, not passed when writing</p>
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get <p>All tag values bound to this dimension</p> 
     * @return Values <p>All tag values bound to this dimension</p>
     */
    public TagValueInfo [] getValues() {
        return this.Values;
    }

    /**
     * Set <p>All tag values bound to this dimension</p>
     * @param Values <p>All tag values bound to this dimension</p>
     */
    public void setValues(TagValueInfo [] Values) {
        this.Values = Values;
    }

    public UserTagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserTagInfo(UserTagInfo source) {
        if (source.TagId != null) {
            this.TagId = new String(source.TagId);
        }
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.Values != null) {
            this.Values = new TagValueInfo[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new TagValueInfo(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagId", this.TagId);
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamArrayObj(map, prefix + "Values.", this.Values);

    }
}

