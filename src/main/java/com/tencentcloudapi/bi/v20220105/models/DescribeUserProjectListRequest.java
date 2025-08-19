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

public class DescribeUserProjectListRequest extends AbstractModel {

    /**
    * Project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * None.
    */
    @SerializedName("AllPage")
    @Expose
    private Boolean AllPage;

    /**
    * None.
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * None.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Whether to filter out enterprise administrators.
    */
    @SerializedName("IsFilterPerAuthUser")
    @Expose
    private Boolean IsFilterPerAuthUser;

    /**
    * Whether to filter out the current user.
    */
    @SerializedName("IsFilterCurrentUser")
    @Expose
    private Boolean IsFilterCurrentUser;

    /**
    * Keyword.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

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
     * Get None. 
     * @return AllPage None.
     */
    public Boolean getAllPage() {
        return this.AllPage;
    }

    /**
     * Set None.
     * @param AllPage None.
     */
    public void setAllPage(Boolean AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get None. 
     * @return PageNo None.
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set None.
     * @param PageNo None.
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get None. 
     * @return PageSize None.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set None.
     * @param PageSize None.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Whether to filter out enterprise administrators. 
     * @return IsFilterPerAuthUser Whether to filter out enterprise administrators.
     */
    public Boolean getIsFilterPerAuthUser() {
        return this.IsFilterPerAuthUser;
    }

    /**
     * Set Whether to filter out enterprise administrators.
     * @param IsFilterPerAuthUser Whether to filter out enterprise administrators.
     */
    public void setIsFilterPerAuthUser(Boolean IsFilterPerAuthUser) {
        this.IsFilterPerAuthUser = IsFilterPerAuthUser;
    }

    /**
     * Get Whether to filter out the current user. 
     * @return IsFilterCurrentUser Whether to filter out the current user.
     */
    public Boolean getIsFilterCurrentUser() {
        return this.IsFilterCurrentUser;
    }

    /**
     * Set Whether to filter out the current user.
     * @param IsFilterCurrentUser Whether to filter out the current user.
     */
    public void setIsFilterCurrentUser(Boolean IsFilterCurrentUser) {
        this.IsFilterCurrentUser = IsFilterCurrentUser;
    }

    /**
     * Get Keyword. 
     * @return Keyword Keyword.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keyword.
     * @param Keyword Keyword.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeUserProjectListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserProjectListRequest(DescribeUserProjectListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AllPage != null) {
            this.AllPage = new Boolean(source.AllPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.IsFilterPerAuthUser != null) {
            this.IsFilterPerAuthUser = new Boolean(source.IsFilterPerAuthUser);
        }
        if (source.IsFilterCurrentUser != null) {
            this.IsFilterCurrentUser = new Boolean(source.IsFilterCurrentUser);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AllPage", this.AllPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "IsFilterPerAuthUser", this.IsFilterPerAuthUser);
        this.setParamSimple(map, prefix + "IsFilterCurrentUser", this.IsFilterCurrentUser);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

