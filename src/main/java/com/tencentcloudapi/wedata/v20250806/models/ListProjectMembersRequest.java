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

public class ListProjectMembersRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Filter by member name with fuzzy query support.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Filter by member id. supports fuzzy query.
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * Page size, default first page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Number of items per page. default value is `10`.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

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
     * Get Filter by member name with fuzzy query support. 
     * @return UserName Filter by member name with fuzzy query support.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Filter by member name with fuzzy query support.
     * @param UserName Filter by member name with fuzzy query support.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Filter by member id. supports fuzzy query. 
     * @return UserUin Filter by member id. supports fuzzy query.
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set Filter by member id. supports fuzzy query.
     * @param UserUin Filter by member id. supports fuzzy query.
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get Page size, default first page. 
     * @return PageSize Page size, default first page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size, default first page.
     * @param PageSize Page size, default first page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Number of items per page. default value is `10`. 
     * @return PageNumber Number of items per page. default value is `10`.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Number of items per page. default value is `10`.
     * @param PageNumber Number of items per page. default value is `10`.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public ListProjectMembersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListProjectMembersRequest(ListProjectMembersRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

