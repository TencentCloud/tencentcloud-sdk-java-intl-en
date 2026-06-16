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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourceUserGroupResourceRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * User ID
    */
    @SerializedName("UserGroupId")
    @Expose
    private Long UserGroupId;

    /**
    * resource
    */
    @SerializedName("Resource")
    @Expose
    private UserResourceDTO Resource;

    /**
    * Entity class
    */
    @SerializedName("EntityIds")
    @Expose
    private Long [] EntityIds;

    /**
    * Resource type.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get Project ID. 
     * @return ProjectId Project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
     * @param ProjectId Project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get User ID 
     * @return UserGroupId User ID
     */
    public Long getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set User ID
     * @param UserGroupId User ID
     */
    public void setUserGroupId(Long UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get resource 
     * @return Resource resource
     */
    public UserResourceDTO getResource() {
        return this.Resource;
    }

    /**
     * Set resource
     * @param Resource resource
     */
    public void setResource(UserResourceDTO Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Entity class 
     * @return EntityIds Entity class
     */
    public Long [] getEntityIds() {
        return this.EntityIds;
    }

    /**
     * Set Entity class
     * @param EntityIds Entity class
     */
    public void setEntityIds(Long [] EntityIds) {
        this.EntityIds = EntityIds;
    }

    /**
     * Get Resource type. 
     * @return ResourceType Resource type.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type.
     * @param ResourceType Resource type.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public ModifyResourceUserGroupResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceUserGroupResourceRequest(ModifyResourceUserGroupResourceRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new Long(source.UserGroupId);
        }
        if (source.Resource != null) {
            this.Resource = new UserResourceDTO(source.Resource);
        }
        if (source.EntityIds != null) {
            this.EntityIds = new Long[source.EntityIds.length];
            for (int i = 0; i < source.EntityIds.length; i++) {
                this.EntityIds[i] = new Long(source.EntityIds[i]);
            }
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamArraySimple(map, prefix + "EntityIds.", this.EntityIds);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

