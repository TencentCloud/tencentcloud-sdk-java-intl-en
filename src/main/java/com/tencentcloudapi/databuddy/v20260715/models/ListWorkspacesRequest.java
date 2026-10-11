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

public class ListWorkspacesRequest extends AbstractModel {

    /**
    * <p>Workspace ID exact match</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>Fuzzy matching by workspace name</p>
    */
    @SerializedName("WorkspaceKeyword")
    @Expose
    private String WorkspaceKeyword;

    /**
    * <p>Workspace status filtering (multiple selection): 0=not specified 1=creating 2=creation failure 3=operating normally 4=deleted</p>
    */
    @SerializedName("StatusList")
    @Expose
    private Long [] StatusList;

    /**
    * <p>Multi-field sorting, for example, [{Name: 'CreateTime', Direction: 'Desc'}]; import one for single-field sorting. Default: in descending order by creation time.</p>
    */
    @SerializedName("OrderBys")
    @Expose
    private OrderBy [] OrderBys;

    /**
    * <p>Page number. Value range: starts from 1. Default value: 1.</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Size per page. Default: 10. Minimum: 10. Maximum: 100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Workspace region filtering (multiple selection), for example, ap-guangzhou</p>
    */
    @SerializedName("WorkspaceRegion")
    @Expose
    private String [] WorkspaceRegion;

    /**
    * <p>Creator UIN filter (multi-option)</p>
    */
    @SerializedName("Creator")
    @Expose
    private String [] Creator;

    /**
     * Get <p>Workspace ID exact match</p> 
     * @return WorkspaceId <p>Workspace ID exact match</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>Workspace ID exact match</p>
     * @param WorkspaceId <p>Workspace ID exact match</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>Fuzzy matching by workspace name</p> 
     * @return WorkspaceKeyword <p>Fuzzy matching by workspace name</p>
     */
    public String getWorkspaceKeyword() {
        return this.WorkspaceKeyword;
    }

    /**
     * Set <p>Fuzzy matching by workspace name</p>
     * @param WorkspaceKeyword <p>Fuzzy matching by workspace name</p>
     */
    public void setWorkspaceKeyword(String WorkspaceKeyword) {
        this.WorkspaceKeyword = WorkspaceKeyword;
    }

    /**
     * Get <p>Workspace status filtering (multiple selection): 0=not specified 1=creating 2=creation failure 3=operating normally 4=deleted</p> 
     * @return StatusList <p>Workspace status filtering (multiple selection): 0=not specified 1=creating 2=creation failure 3=operating normally 4=deleted</p>
     */
    public Long [] getStatusList() {
        return this.StatusList;
    }

    /**
     * Set <p>Workspace status filtering (multiple selection): 0=not specified 1=creating 2=creation failure 3=operating normally 4=deleted</p>
     * @param StatusList <p>Workspace status filtering (multiple selection): 0=not specified 1=creating 2=creation failure 3=operating normally 4=deleted</p>
     */
    public void setStatusList(Long [] StatusList) {
        this.StatusList = StatusList;
    }

    /**
     * Get <p>Multi-field sorting, for example, [{Name: 'CreateTime', Direction: 'Desc'}]; import one for single-field sorting. Default: in descending order by creation time.</p> 
     * @return OrderBys <p>Multi-field sorting, for example, [{Name: 'CreateTime', Direction: 'Desc'}]; import one for single-field sorting. Default: in descending order by creation time.</p>
     */
    public OrderBy [] getOrderBys() {
        return this.OrderBys;
    }

    /**
     * Set <p>Multi-field sorting, for example, [{Name: 'CreateTime', Direction: 'Desc'}]; import one for single-field sorting. Default: in descending order by creation time.</p>
     * @param OrderBys <p>Multi-field sorting, for example, [{Name: 'CreateTime', Direction: 'Desc'}]; import one for single-field sorting. Default: in descending order by creation time.</p>
     */
    public void setOrderBys(OrderBy [] OrderBys) {
        this.OrderBys = OrderBys;
    }

    /**
     * Get <p>Page number. Value range: starts from 1. Default value: 1.</p> 
     * @return PageNumber <p>Page number. Value range: starts from 1. Default value: 1.</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number. Value range: starts from 1. Default value: 1.</p>
     * @param PageNumber <p>Page number. Value range: starts from 1. Default value: 1.</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Size per page. Default: 10. Minimum: 10. Maximum: 100</p> 
     * @return PageSize <p>Size per page. Default: 10. Minimum: 10. Maximum: 100</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Size per page. Default: 10. Minimum: 10. Maximum: 100</p>
     * @param PageSize <p>Size per page. Default: 10. Minimum: 10. Maximum: 100</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Workspace region filtering (multiple selection), for example, ap-guangzhou</p> 
     * @return WorkspaceRegion <p>Workspace region filtering (multiple selection), for example, ap-guangzhou</p>
     */
    public String [] getWorkspaceRegion() {
        return this.WorkspaceRegion;
    }

    /**
     * Set <p>Workspace region filtering (multiple selection), for example, ap-guangzhou</p>
     * @param WorkspaceRegion <p>Workspace region filtering (multiple selection), for example, ap-guangzhou</p>
     */
    public void setWorkspaceRegion(String [] WorkspaceRegion) {
        this.WorkspaceRegion = WorkspaceRegion;
    }

    /**
     * Get <p>Creator UIN filter (multi-option)</p> 
     * @return Creator <p>Creator UIN filter (multi-option)</p>
     */
    public String [] getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>Creator UIN filter (multi-option)</p>
     * @param Creator <p>Creator UIN filter (multi-option)</p>
     */
    public void setCreator(String [] Creator) {
        this.Creator = Creator;
    }

    public ListWorkspacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListWorkspacesRequest(ListWorkspacesRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkspaceKeyword != null) {
            this.WorkspaceKeyword = new String(source.WorkspaceKeyword);
        }
        if (source.StatusList != null) {
            this.StatusList = new Long[source.StatusList.length];
            for (int i = 0; i < source.StatusList.length; i++) {
                this.StatusList[i] = new Long(source.StatusList[i]);
            }
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
        if (source.WorkspaceRegion != null) {
            this.WorkspaceRegion = new String[source.WorkspaceRegion.length];
            for (int i = 0; i < source.WorkspaceRegion.length; i++) {
                this.WorkspaceRegion[i] = new String(source.WorkspaceRegion[i]);
            }
        }
        if (source.Creator != null) {
            this.Creator = new String[source.Creator.length];
            for (int i = 0; i < source.Creator.length; i++) {
                this.Creator[i] = new String(source.Creator[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkspaceKeyword", this.WorkspaceKeyword);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);
        this.setParamArrayObj(map, prefix + "OrderBys.", this.OrderBys);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "WorkspaceRegion.", this.WorkspaceRegion);
        this.setParamArraySimple(map, prefix + "Creator.", this.Creator);

    }
}

