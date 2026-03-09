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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListResourceGroupsRequest extends AbstractModel {

    /**
    * Execution resource group type.

-Schedule --- scheduling resource group.
-Integration - integration resource group.
-DataService - data service resource group.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Resource group ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Execution resource group name to search.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Project space id query list.
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * Number of pages.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Page size.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Execution resource group type.

-Schedule --- scheduling resource group.
-Integration - integration resource group.
-DataService - data service resource group. 
     * @return Type Execution resource group type.

-Schedule --- scheduling resource group.
-Integration - integration resource group.
-DataService - data service resource group.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Execution resource group type.

-Schedule --- scheduling resource group.
-Integration - integration resource group.
-DataService - data service resource group.
     * @param Type Execution resource group type.

-Schedule --- scheduling resource group.
-Integration - integration resource group.
-DataService - data service resource group.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Resource group ID 
     * @return Id Resource group ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Resource group ID
     * @param Id Resource group ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Execution resource group name to search. 
     * @return Name Execution resource group name to search.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Execution resource group name to search.
     * @param Name Execution resource group name to search.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Project space id query list. 
     * @return ProjectIds Project space id query list.
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Project space id query list.
     * @param ProjectIds Project space id query list.
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Number of pages. 
     * @return PageNumber Number of pages.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Number of pages.
     * @param PageNumber Number of pages.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Page size. 
     * @return PageSize Page size.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size.
     * @param PageSize Page size.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListResourceGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListResourceGroupsRequest(ListResourceGroupsRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

