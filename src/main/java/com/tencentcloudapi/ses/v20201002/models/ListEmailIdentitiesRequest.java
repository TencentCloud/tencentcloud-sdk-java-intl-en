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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListEmailIdentitiesRequest extends AbstractModel {

    /**
    * tag.
    */
    @SerializedName("TagList")
    @Expose
    private TagList [] TagList;

    /**
    * Pagination limit.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Paging offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get tag. 
     * @return TagList tag.
     */
    public TagList [] getTagList() {
        return this.TagList;
    }

    /**
     * Set tag.
     * @param TagList tag.
     */
    public void setTagList(TagList [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Pagination limit. 
     * @return Limit Pagination limit.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination limit.
     * @param Limit Pagination limit.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Paging offset. 
     * @return Offset Paging offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Paging offset.
     * @param Offset Paging offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public ListEmailIdentitiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListEmailIdentitiesRequest(ListEmailIdentitiesRequest source) {
        if (source.TagList != null) {
            this.TagList = new TagList[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagList(source.TagList[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

