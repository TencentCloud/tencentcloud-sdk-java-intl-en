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

public class DescribeUserRoleListRequest extends AbstractModel {

    /**
    * Page number.
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * Number of pages.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * All page numbers.
    */
    @SerializedName("AllPage")
    @Expose
    private Boolean AllPage;

    /**
    * 0: enterprise user. 1: visitor. If left blank, it indicates all users.
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * Keyword for fuzzy search.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Project ID.

    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Whether to only obtain users bound to the WeCom app.
    */
    @SerializedName("IsOnlyBindAppUser")
    @Expose
    private Boolean IsOnlyBindAppUser;

    /**
     * Get Page number. 
     * @return PageNo Page number.
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set Page number.
     * @param PageNo Page number.
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get Number of pages. 
     * @return PageSize Number of pages.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of pages.
     * @param PageSize Number of pages.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get All page numbers. 
     * @return AllPage All page numbers.
     */
    public Boolean getAllPage() {
        return this.AllPage;
    }

    /**
     * Set All page numbers.
     * @param AllPage All page numbers.
     */
    public void setAllPage(Boolean AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get 0: enterprise user. 1: visitor. If left blank, it indicates all users. 
     * @return UserType 0: enterprise user. 1: visitor. If left blank, it indicates all users.
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 0: enterprise user. 1: visitor. If left blank, it indicates all users.
     * @param UserType 0: enterprise user. 1: visitor. If left blank, it indicates all users.
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get Keyword for fuzzy search. 
     * @return Keyword Keyword for fuzzy search.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keyword for fuzzy search.
     * @param Keyword Keyword for fuzzy search.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

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
     * Get Whether to only obtain users bound to the WeCom app. 
     * @return IsOnlyBindAppUser Whether to only obtain users bound to the WeCom app.
     */
    public Boolean getIsOnlyBindAppUser() {
        return this.IsOnlyBindAppUser;
    }

    /**
     * Set Whether to only obtain users bound to the WeCom app.
     * @param IsOnlyBindAppUser Whether to only obtain users bound to the WeCom app.
     */
    public void setIsOnlyBindAppUser(Boolean IsOnlyBindAppUser) {
        this.IsOnlyBindAppUser = IsOnlyBindAppUser;
    }

    public DescribeUserRoleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserRoleListRequest(DescribeUserRoleListRequest source) {
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.AllPage != null) {
            this.AllPage = new Boolean(source.AllPage);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.IsOnlyBindAppUser != null) {
            this.IsOnlyBindAppUser = new Boolean(source.IsOnlyBindAppUser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "AllPage", this.AllPage);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "IsOnlyBindAppUser", this.IsOnlyBindAppUser);

    }
}

