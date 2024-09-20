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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTemplateListRequest extends AbstractModel {

    /**
    * Pagination limit.Maximum value:100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Experiment name
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Tag key
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * Status. 1: in use; 2: not in use.
    */
    @SerializedName("IsUsed")
    @Expose
    private Long IsUsed;

    /**
    * Tag pair
    */
    @SerializedName("Tags")
    @Expose
    private TagWithDescribe [] Tags;

    /**
    * Template library source. 0: self-built; 1: recommended by experts.
    */
    @SerializedName("TemplateSource")
    @Expose
    private Long TemplateSource;

    /**
    * Template ID
    */
    @SerializedName("TemplateIdList")
    @Expose
    private Long [] TemplateIdList;

    /**
    * Filter parameters
    */
    @SerializedName("Filters")
    @Expose
    private ActionFilter [] Filters;

    /**
     * Get Pagination limit.Maximum value:100. 
     * @return Limit Pagination limit.Maximum value:100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination limit.Maximum value:100.
     * @param Limit Pagination limit.Maximum value:100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Experiment name 
     * @return Title Experiment name
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Experiment name
     * @param Title Experiment name
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Tag key 
     * @return Tag Tag key
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tag key
     * @param Tag Tag key
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Status. 1: in use; 2: not in use. 
     * @return IsUsed Status. 1: in use; 2: not in use.
     */
    public Long getIsUsed() {
        return this.IsUsed;
    }

    /**
     * Set Status. 1: in use; 2: not in use.
     * @param IsUsed Status. 1: in use; 2: not in use.
     */
    public void setIsUsed(Long IsUsed) {
        this.IsUsed = IsUsed;
    }

    /**
     * Get Tag pair 
     * @return Tags Tag pair
     */
    public TagWithDescribe [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag pair
     * @param Tags Tag pair
     */
    public void setTags(TagWithDescribe [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Template library source. 0: self-built; 1: recommended by experts. 
     * @return TemplateSource Template library source. 0: self-built; 1: recommended by experts.
     */
    public Long getTemplateSource() {
        return this.TemplateSource;
    }

    /**
     * Set Template library source. 0: self-built; 1: recommended by experts.
     * @param TemplateSource Template library source. 0: self-built; 1: recommended by experts.
     */
    public void setTemplateSource(Long TemplateSource) {
        this.TemplateSource = TemplateSource;
    }

    /**
     * Get Template ID 
     * @return TemplateIdList Template ID
     */
    public Long [] getTemplateIdList() {
        return this.TemplateIdList;
    }

    /**
     * Set Template ID
     * @param TemplateIdList Template ID
     */
    public void setTemplateIdList(Long [] TemplateIdList) {
        this.TemplateIdList = TemplateIdList;
    }

    /**
     * Get Filter parameters 
     * @return Filters Filter parameters
     */
    public ActionFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameters
     * @param Filters Filter parameters
     */
    public void setFilters(ActionFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTemplateListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTemplateListRequest(DescribeTemplateListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Tag != null) {
            this.Tag = new String[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new String(source.Tag[i]);
            }
        }
        if (source.IsUsed != null) {
            this.IsUsed = new Long(source.IsUsed);
        }
        if (source.Tags != null) {
            this.Tags = new TagWithDescribe[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagWithDescribe(source.Tags[i]);
            }
        }
        if (source.TemplateSource != null) {
            this.TemplateSource = new Long(source.TemplateSource);
        }
        if (source.TemplateIdList != null) {
            this.TemplateIdList = new Long[source.TemplateIdList.length];
            for (int i = 0; i < source.TemplateIdList.length; i++) {
                this.TemplateIdList[i] = new Long(source.TemplateIdList[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new ActionFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ActionFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamArraySimple(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "IsUsed", this.IsUsed);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TemplateSource", this.TemplateSource);
        this.setParamArraySimple(map, prefix + "TemplateIdList.", this.TemplateIdList);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

