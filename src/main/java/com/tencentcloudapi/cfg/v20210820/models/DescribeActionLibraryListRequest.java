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

public class DescribeActionLibraryListRequest extends AbstractModel {

    /**
    * 0-100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Object type ID
    */
    @SerializedName("ObjectType")
    @Expose
    private Long ObjectType;

    /**
    * Keyword value {"action name": "a_title", "description": "a_desc", "action type": "a_type", "creation time": "a_create_time", "level-2 type": "a_resource_type"}
    */
    @SerializedName("Filters")
    @Expose
    private ActionFilter [] Filters;

    /**
    * Action type. 1: fault action; 2: recovery action.
    */
    @SerializedName("Attribute")
    @Expose
    private Long [] Attribute;

    /**
    * Filter item - action ID
    */
    @SerializedName("ActionIds")
    @Expose
    private Long [] ActionIds;

    /**
     * Get 0-100 
     * @return Limit 0-100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 0-100
     * @param Limit 0-100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Default value: 0 
     * @return Offset Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Default value: 0
     * @param Offset Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Object type ID 
     * @return ObjectType Object type ID
     */
    public Long getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set Object type ID
     * @param ObjectType Object type ID
     */
    public void setObjectType(Long ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get Keyword value {"action name": "a_title", "description": "a_desc", "action type": "a_type", "creation time": "a_create_time", "level-2 type": "a_resource_type"} 
     * @return Filters Keyword value {"action name": "a_title", "description": "a_desc", "action type": "a_type", "creation time": "a_create_time", "level-2 type": "a_resource_type"}
     */
    public ActionFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Keyword value {"action name": "a_title", "description": "a_desc", "action type": "a_type", "creation time": "a_create_time", "level-2 type": "a_resource_type"}
     * @param Filters Keyword value {"action name": "a_title", "description": "a_desc", "action type": "a_type", "creation time": "a_create_time", "level-2 type": "a_resource_type"}
     */
    public void setFilters(ActionFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Action type. 1: fault action; 2: recovery action. 
     * @return Attribute Action type. 1: fault action; 2: recovery action.
     */
    public Long [] getAttribute() {
        return this.Attribute;
    }

    /**
     * Set Action type. 1: fault action; 2: recovery action.
     * @param Attribute Action type. 1: fault action; 2: recovery action.
     */
    public void setAttribute(Long [] Attribute) {
        this.Attribute = Attribute;
    }

    /**
     * Get Filter item - action ID 
     * @return ActionIds Filter item - action ID
     */
    public Long [] getActionIds() {
        return this.ActionIds;
    }

    /**
     * Set Filter item - action ID
     * @param ActionIds Filter item - action ID
     */
    public void setActionIds(Long [] ActionIds) {
        this.ActionIds = ActionIds;
    }

    public DescribeActionLibraryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeActionLibraryListRequest(DescribeActionLibraryListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new Long(source.ObjectType);
        }
        if (source.Filters != null) {
            this.Filters = new ActionFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ActionFilter(source.Filters[i]);
            }
        }
        if (source.Attribute != null) {
            this.Attribute = new Long[source.Attribute.length];
            for (int i = 0; i < source.Attribute.length; i++) {
                this.Attribute[i] = new Long(source.Attribute[i]);
            }
        }
        if (source.ActionIds != null) {
            this.ActionIds = new Long[source.ActionIds.length];
            for (int i = 0; i < source.ActionIds.length; i++) {
                this.ActionIds[i] = new Long(source.ActionIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "Attribute.", this.Attribute);
        this.setParamArraySimple(map, prefix + "ActionIds.", this.ActionIds);

    }
}

