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

public class DescribeTagKeysRequest extends AbstractModel {

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
    * Number of entries per page. Default: 15; maximum: 1,000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Whether to show project
    */
    @SerializedName("ShowProject")
    @Expose
    private Long ShowProject;

    /**
    * Tag type. Valid values: Custom: custom tag; System: system tag; All: all tags. Default value: All.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

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
     * Get Number of entries per page. Default: 15; maximum: 1,000. 
     * @return Limit Number of entries per page. Default: 15; maximum: 1,000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Default: 15; maximum: 1,000.
     * @param Limit Number of entries per page. Default: 15; maximum: 1,000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Whether to show project 
     * @return ShowProject Whether to show project
     */
    public Long getShowProject() {
        return this.ShowProject;
    }

    /**
     * Set Whether to show project
     * @param ShowProject Whether to show project
     */
    public void setShowProject(Long ShowProject) {
        this.ShowProject = ShowProject;
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

    public DescribeTagKeysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTagKeysRequest(DescribeTagKeysRequest source) {
        if (source.CreateUin != null) {
            this.CreateUin = new Long(source.CreateUin);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ShowProject != null) {
            this.ShowProject = new Long(source.ShowProject);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ShowProject", this.ShowProject);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

