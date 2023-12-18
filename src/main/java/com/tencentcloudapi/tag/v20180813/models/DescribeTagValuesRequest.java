/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class DescribeTagValuesRequest extends AbstractModel {

    /**
    * Tag key list.
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * Creator `Uin`. If not specified, `Uin` is only used as the query condition.
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * Data offset. The default value is 0. Must be an integral multiple of the `Limit` parameter.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Page size. The default value is 0.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get Tag key list. 
     * @return TagKeys Tag key list.
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set Tag key list.
     * @param TagKeys Tag key list.
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get Creator `Uin`. If not specified, `Uin` is only used as the query condition. 
     * @return CreateUin Creator `Uin`. If not specified, `Uin` is only used as the query condition.
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set Creator `Uin`. If not specified, `Uin` is only used as the query condition.
     * @param CreateUin Creator `Uin`. If not specified, `Uin` is only used as the query condition.
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Data offset. The default value is 0. Must be an integral multiple of the `Limit` parameter. 
     * @return Offset Data offset. The default value is 0. Must be an integral multiple of the `Limit` parameter.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset. The default value is 0. Must be an integral multiple of the `Limit` parameter.
     * @param Offset Data offset. The default value is 0. Must be an integral multiple of the `Limit` parameter.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Page size. The default value is 0. 
     * @return Limit Page size. The default value is 0.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page size. The default value is 0.
     * @param Limit Page size. The default value is 0.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All. 
     * @return Category Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All.
     * @param Category Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public DescribeTagValuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTagValuesRequest(DescribeTagValuesRequest source) {
        if (source.TagKeys != null) {
            this.TagKeys = new String[source.TagKeys.length];
            for (int i = 0; i < source.TagKeys.length; i++) {
                this.TagKeys[i] = new String(source.TagKeys[i]);
            }
        }
        if (source.CreateUin != null) {
            this.CreateUin = new Long(source.CreateUin);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

