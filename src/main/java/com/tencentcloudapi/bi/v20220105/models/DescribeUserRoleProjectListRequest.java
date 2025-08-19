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

public class DescribeUserRoleProjectListRequest extends AbstractModel {

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
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Whether to only obtain users bound to the WeCom app.
    */
    @SerializedName("IsOnlyBindAppUser")
    @Expose
    private Boolean IsOnlyBindAppUser;

    /**
    * Whether to obtain all the data.
    */
    @SerializedName("AllPage")
    @Expose
    private Boolean AllPage;

    /**
    * Role code.
    */
    @SerializedName("RoleCode")
    @Expose
    private String RoleCode;

    /**
    * User ID list.
    */
    @SerializedName("UserIdList")
    @Expose
    private String [] UserIdList;

    /**
    * Search keywords.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

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

    /**
     * Get Whether to obtain all the data. 
     * @return AllPage Whether to obtain all the data.
     */
    public Boolean getAllPage() {
        return this.AllPage;
    }

    /**
     * Set Whether to obtain all the data.
     * @param AllPage Whether to obtain all the data.
     */
    public void setAllPage(Boolean AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get Role code. 
     * @return RoleCode Role code.
     */
    public String getRoleCode() {
        return this.RoleCode;
    }

    /**
     * Set Role code.
     * @param RoleCode Role code.
     */
    public void setRoleCode(String RoleCode) {
        this.RoleCode = RoleCode;
    }

    /**
     * Get User ID list. 
     * @return UserIdList User ID list.
     */
    public String [] getUserIdList() {
        return this.UserIdList;
    }

    /**
     * Set User ID list.
     * @param UserIdList User ID list.
     */
    public void setUserIdList(String [] UserIdList) {
        this.UserIdList = UserIdList;
    }

    /**
     * Get Search keywords. 
     * @return Keyword Search keywords.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Search keywords.
     * @param Keyword Search keywords.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeUserRoleProjectListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserRoleProjectListRequest(DescribeUserRoleProjectListRequest source) {
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.IsOnlyBindAppUser != null) {
            this.IsOnlyBindAppUser = new Boolean(source.IsOnlyBindAppUser);
        }
        if (source.AllPage != null) {
            this.AllPage = new Boolean(source.AllPage);
        }
        if (source.RoleCode != null) {
            this.RoleCode = new String(source.RoleCode);
        }
        if (source.UserIdList != null) {
            this.UserIdList = new String[source.UserIdList.length];
            for (int i = 0; i < source.UserIdList.length; i++) {
                this.UserIdList[i] = new String(source.UserIdList[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "IsOnlyBindAppUser", this.IsOnlyBindAppUser);
        this.setParamSimple(map, prefix + "AllPage", this.AllPage);
        this.setParamSimple(map, prefix + "RoleCode", this.RoleCode);
        this.setParamArraySimple(map, prefix + "UserIdList.", this.UserIdList);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

