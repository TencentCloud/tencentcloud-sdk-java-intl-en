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

public class ListWorkflowPermissionsRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Authorize entity ID.
    */
    @SerializedName("EntityId")
    @Expose
    private String EntityId;

    /**
    * Authorized entity type, folder/workflow.
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * The page number of the requested data. the default value is 1. the value must be equal to or greater than 1.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of data records displayed per page. default value is 10. minimum value is 10. maximum value is 200.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Authorize entity ID. 
     * @return EntityId Authorize entity ID.
     */
    public String getEntityId() {
        return this.EntityId;
    }

    /**
     * Set Authorize entity ID.
     * @param EntityId Authorize entity ID.
     */
    public void setEntityId(String EntityId) {
        this.EntityId = EntityId;
    }

    /**
     * Get Authorized entity type, folder/workflow. 
     * @return EntityType Authorized entity type, folder/workflow.
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set Authorized entity type, folder/workflow.
     * @param EntityType Authorized entity type, folder/workflow.
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get The page number of the requested data. the default value is 1. the value must be equal to or greater than 1. 
     * @return PageNumber The page number of the requested data. the default value is 1. the value must be equal to or greater than 1.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set The page number of the requested data. the default value is 1. the value must be equal to or greater than 1.
     * @param PageNumber The page number of the requested data. the default value is 1. the value must be equal to or greater than 1.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of data records displayed per page. default value is 10. minimum value is 10. maximum value is 200. 
     * @return PageSize Number of data records displayed per page. default value is 10. minimum value is 10. maximum value is 200.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of data records displayed per page. default value is 10. minimum value is 10. maximum value is 200.
     * @param PageSize Number of data records displayed per page. default value is 10. minimum value is 10. maximum value is 200.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListWorkflowPermissionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkflowPermissionsRequest(ListWorkflowPermissionsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.EntityId != null) {
            this.EntityId = new String(source.EntityId);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "EntityId", this.EntityId);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

