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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListFilesRequest extends AbstractModel {

    /**
    * <p>Workspace id</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Parent directory. If left blank, the root node is queried by default.</p>
    */
    @SerializedName("Parent")
    @Expose
    private FolderLocator Parent;

    /**
    * <p>Filter by file type</p>
    */
    @SerializedName("FileTypes")
    @Expose
    private String [] FileTypes;

    /**
    * <p>Fuzzy matching by file name</p>
    */
    @SerializedName("NameKeyword")
    @Expose
    private String NameKeyword;

    /**
    * <p>Filter by owner UIN. Multiple values are OR-related</p>
    */
    @SerializedName("OwnerUserUins")
    @Expose
    private String [] OwnerUserUins;

    /**
    * <p>Whether to list folders only. Default false.</p>
    */
    @SerializedName("OnlyFolder")
    @Expose
    private Boolean OnlyFolder;

    /**
    * <p>Sorting field list, for example, creation time [{Name: 'CreateTime', Direction: 'DESC'}], file name [{Name: 'Name', Direction: 'ASC'}]</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

    /**
    * <p>Page number. Default value: 1. Minimum value: 1.</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Entries per page. Default: 10. Minimum value: 10. Maximum value: 100</p><p>Value range: [10, 100]</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>Workspace id</p> 
     * @return WorkspaceId <p>Workspace id</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace id</p>
     * @param WorkspaceId <p>Workspace id</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>Parent directory. If left blank, the root node is queried by default.</p> 
     * @return Parent <p>Parent directory. If left blank, the root node is queried by default.</p>
     */
    public FolderLocator getParent() {
        return this.Parent;
    }

    /**
     * Set <p>Parent directory. If left blank, the root node is queried by default.</p>
     * @param Parent <p>Parent directory. If left blank, the root node is queried by default.</p>
     */
    public void setParent(FolderLocator Parent) {
        this.Parent = Parent;
    }

    /**
     * Get <p>Filter by file type</p> 
     * @return FileTypes <p>Filter by file type</p>
     */
    public String [] getFileTypes() {
        return this.FileTypes;
    }

    /**
     * Set <p>Filter by file type</p>
     * @param FileTypes <p>Filter by file type</p>
     */
    public void setFileTypes(String [] FileTypes) {
        this.FileTypes = FileTypes;
    }

    /**
     * Get <p>Fuzzy matching by file name</p> 
     * @return NameKeyword <p>Fuzzy matching by file name</p>
     */
    public String getNameKeyword() {
        return this.NameKeyword;
    }

    /**
     * Set <p>Fuzzy matching by file name</p>
     * @param NameKeyword <p>Fuzzy matching by file name</p>
     */
    public void setNameKeyword(String NameKeyword) {
        this.NameKeyword = NameKeyword;
    }

    /**
     * Get <p>Filter by owner UIN. Multiple values are OR-related</p> 
     * @return OwnerUserUins <p>Filter by owner UIN. Multiple values are OR-related</p>
     */
    public String [] getOwnerUserUins() {
        return this.OwnerUserUins;
    }

    /**
     * Set <p>Filter by owner UIN. Multiple values are OR-related</p>
     * @param OwnerUserUins <p>Filter by owner UIN. Multiple values are OR-related</p>
     */
    public void setOwnerUserUins(String [] OwnerUserUins) {
        this.OwnerUserUins = OwnerUserUins;
    }

    /**
     * Get <p>Whether to list folders only. Default false.</p> 
     * @return OnlyFolder <p>Whether to list folders only. Default false.</p>
     */
    public Boolean getOnlyFolder() {
        return this.OnlyFolder;
    }

    /**
     * Set <p>Whether to list folders only. Default false.</p>
     * @param OnlyFolder <p>Whether to list folders only. Default false.</p>
     */
    public void setOnlyFolder(Boolean OnlyFolder) {
        this.OnlyFolder = OnlyFolder;
    }

    /**
     * Get <p>Sorting field list, for example, creation time [{Name: 'CreateTime', Direction: 'DESC'}], file name [{Name: 'Name', Direction: 'ASC'}]</p> 
     * @return OrderBys <p>Sorting field list, for example, creation time [{Name: 'CreateTime', Direction: 'DESC'}], file name [{Name: 'Name', Direction: 'ASC'}]</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>Sorting field list, for example, creation time [{Name: 'CreateTime', Direction: 'DESC'}], file name [{Name: 'Name', Direction: 'ASC'}]</p>
     * @param OrderBys <p>Sorting field list, for example, creation time [{Name: 'CreateTime', Direction: 'DESC'}], file name [{Name: 'Name', Direction: 'ASC'}]</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    /**
     * Get <p>Page number. Default value: 1. Minimum value: 1.</p> 
     * @return PageNumber <p>Page number. Default value: 1. Minimum value: 1.</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number. Default value: 1. Minimum value: 1.</p>
     * @param PageNumber <p>Page number. Default value: 1. Minimum value: 1.</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Entries per page. Default: 10. Minimum value: 10. Maximum value: 100</p><p>Value range: [10, 100]</p> 
     * @return PageSize <p>Entries per page. Default: 10. Minimum value: 10. Maximum value: 100</p><p>Value range: [10, 100]</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Entries per page. Default: 10. Minimum value: 10. Maximum value: 100</p><p>Value range: [10, 100]</p>
     * @param PageSize <p>Entries per page. Default: 10. Minimum value: 10. Maximum value: 100</p><p>Value range: [10, 100]</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListFilesRequest(ListFilesRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.Parent != null) {
            this.Parent = new FolderLocator(source.Parent);
        }
        if (source.FileTypes != null) {
            this.FileTypes = new String[source.FileTypes.length];
            for (int i = 0; i < source.FileTypes.length; i++) {
                this.FileTypes[i] = new String(source.FileTypes[i]);
            }
        }
        if (source.NameKeyword != null) {
            this.NameKeyword = new String(source.NameKeyword);
        }
        if (source.OwnerUserUins != null) {
            this.OwnerUserUins = new String[source.OwnerUserUins.length];
            for (int i = 0; i < source.OwnerUserUins.length; i++) {
                this.OwnerUserUins[i] = new String(source.OwnerUserUins[i]);
            }
        }
        if (source.OnlyFolder != null) {
            this.OnlyFolder = new Boolean(source.OnlyFolder);
        }
        if (source.OrderBys != null) {
            this.OrderBys = new OrderBy[source.OrderBys.length];
            for (int i = 0; i < source.OrderBys.length; i++) {
                this.OrderBys[i] = new OrderBy(source.OrderBys[i]);
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
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamObj(map, prefix + "Parent.", this.Parent);
        this.setParamArraySimple(map, prefix + "FileTypes.", this.FileTypes);
        this.setParamSimple(map, prefix + "NameKeyword", this.NameKeyword);
        this.setParamArraySimple(map, prefix + "OwnerUserUins.", this.OwnerUserUins);
        this.setParamSimple(map, prefix + "OnlyFolder", this.OnlyFolder);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

