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

public class DescribeDatasourceListRequest extends AbstractModel {

    /**
    * None.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Returns all pages and defaults to false.
    */
    @SerializedName("AllPage")
    @Expose
    private Boolean AllPage;

    /**
    * Database name search.
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

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
    * Search keywords.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Permission filter (0: all permissions, 1: access permission, 2: edit permission).
    */
    @SerializedName("PermissionType")
    @Expose
    private Long PermissionType;

    /**
     * Get None. 
     * @return ProjectId None.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set None.
     * @param ProjectId None.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Returns all pages and defaults to false. 
     * @return AllPage Returns all pages and defaults to false.
     */
    public Boolean getAllPage() {
        return this.AllPage;
    }

    /**
     * Set Returns all pages and defaults to false.
     * @param AllPage Returns all pages and defaults to false.
     */
    public void setAllPage(Boolean AllPage) {
        this.AllPage = AllPage;
    }

    /**
     * Get Database name search. 
     * @return DbName Database name search.
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name search.
     * @param DbName Database name search.
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
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

    /**
     * Get Permission filter (0: all permissions, 1: access permission, 2: edit permission). 
     * @return PermissionType Permission filter (0: all permissions, 1: access permission, 2: edit permission).
     */
    public Long getPermissionType() {
        return this.PermissionType;
    }

    /**
     * Set Permission filter (0: all permissions, 1: access permission, 2: edit permission).
     * @param PermissionType Permission filter (0: all permissions, 1: access permission, 2: edit permission).
     */
    public void setPermissionType(Long PermissionType) {
        this.PermissionType = PermissionType;
    }

    public DescribeDatasourceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatasourceListRequest(DescribeDatasourceListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.AllPage != null) {
            this.AllPage = new Boolean(source.AllPage);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.PermissionType != null) {
            this.PermissionType = new Long(source.PermissionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AllPage", this.AllPage);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "PermissionType", this.PermissionType);

    }
}

