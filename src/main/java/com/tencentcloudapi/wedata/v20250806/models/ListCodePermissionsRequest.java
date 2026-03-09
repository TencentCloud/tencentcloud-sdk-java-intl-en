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

public class ListCodePermissionsRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Page number, which is 1 by default.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of returned results. the default is 20, and the maximum value is 100. requirements: 500, 1000 or more.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Authorized resources.
    */
    @SerializedName("Resource")
    @Expose
    private ExploreFileResource Resource;

    /**
    * User filtering criteria.
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

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
     * Get Page number, which is 1 by default. 
     * @return PageNumber Page number, which is 1 by default.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number, which is 1 by default.
     * @param PageNumber Page number, which is 1 by default.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of returned results. the default is 20, and the maximum value is 100. requirements: 500, 1000 or more. 
     * @return PageSize Number of returned results. the default is 20, and the maximum value is 100. requirements: 500, 1000 or more.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of returned results. the default is 20, and the maximum value is 100. requirements: 500, 1000 or more.
     * @param PageSize Number of returned results. the default is 20, and the maximum value is 100. requirements: 500, 1000 or more.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Authorized resources. 
     * @return Resource Authorized resources.
     */
    public ExploreFileResource getResource() {
        return this.Resource;
    }

    /**
     * Set Authorized resources.
     * @param Resource Authorized resources.
     */
    public void setResource(ExploreFileResource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get User filtering criteria. 
     * @return Users User filtering criteria.
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set User filtering criteria.
     * @param Users User filtering criteria.
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    public ListCodePermissionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListCodePermissionsRequest(ListCodePermissionsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Resource != null) {
            this.Resource = new ExploreFileResource(source.Resource);
        }
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);

    }
}

