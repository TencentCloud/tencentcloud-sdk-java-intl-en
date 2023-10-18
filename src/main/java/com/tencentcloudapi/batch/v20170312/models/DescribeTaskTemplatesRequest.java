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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskTemplatesRequest extends AbstractModel {

    /**
    * List of task template IDs. It cannot be specified together with `Filters`.
    */
    @SerializedName("TaskTemplateIds")
    @Expose
    private String [] TaskTemplateIds;

    /**
    * Filter
<li> `task-template-name` - String - Optional - Task template name.</li>
<li> `tag-key` - String - Optional - Tag key.</li>
<li> `tag-value` - String - Optional - Tag value.</li>
<li> `tag:tag-key` - String - Optional - Tag key-value pair. The tag-key should be replaced by a specified tag key.</li>
It cannot be specified together with `TaskTemplateIds`.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of returned items
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get List of task template IDs. It cannot be specified together with `Filters`. 
     * @return TaskTemplateIds List of task template IDs. It cannot be specified together with `Filters`.
     */
    public String [] getTaskTemplateIds() {
        return this.TaskTemplateIds;
    }

    /**
     * Set List of task template IDs. It cannot be specified together with `Filters`.
     * @param TaskTemplateIds List of task template IDs. It cannot be specified together with `Filters`.
     */
    public void setTaskTemplateIds(String [] TaskTemplateIds) {
        this.TaskTemplateIds = TaskTemplateIds;
    }

    /**
     * Get Filter
<li> `task-template-name` - String - Optional - Task template name.</li>
<li> `tag-key` - String - Optional - Tag key.</li>
<li> `tag-value` - String - Optional - Tag value.</li>
<li> `tag:tag-key` - String - Optional - Tag key-value pair. The tag-key should be replaced by a specified tag key.</li>
It cannot be specified together with `TaskTemplateIds`. 
     * @return Filters Filter
<li> `task-template-name` - String - Optional - Task template name.</li>
<li> `tag-key` - String - Optional - Tag key.</li>
<li> `tag-value` - String - Optional - Tag value.</li>
<li> `tag:tag-key` - String - Optional - Tag key-value pair. The tag-key should be replaced by a specified tag key.</li>
It cannot be specified together with `TaskTemplateIds`.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter
<li> `task-template-name` - String - Optional - Task template name.</li>
<li> `tag-key` - String - Optional - Tag key.</li>
<li> `tag-value` - String - Optional - Tag value.</li>
<li> `tag:tag-key` - String - Optional - Tag key-value pair. The tag-key should be replaced by a specified tag key.</li>
It cannot be specified together with `TaskTemplateIds`.
     * @param Filters Filter
<li> `task-template-name` - String - Optional - Task template name.</li>
<li> `tag-key` - String - Optional - Tag key.</li>
<li> `tag-value` - String - Optional - Tag value.</li>
<li> `tag:tag-key` - String - Optional - Tag key-value pair. The tag-key should be replaced by a specified tag key.</li>
It cannot be specified together with `TaskTemplateIds`.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of returned items 
     * @return Limit Maximum number of returned items
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of returned items
     * @param Limit Maximum number of returned items
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTaskTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskTemplatesRequest(DescribeTaskTemplatesRequest source) {
        if (source.TaskTemplateIds != null) {
            this.TaskTemplateIds = new String[source.TaskTemplateIds.length];
            for (int i = 0; i < source.TaskTemplateIds.length; i++) {
                this.TaskTemplateIds[i] = new String(source.TaskTemplateIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskTemplateIds.", this.TaskTemplateIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

