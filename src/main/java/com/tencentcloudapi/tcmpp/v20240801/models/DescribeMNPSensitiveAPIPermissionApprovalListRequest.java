/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNPSensitiveAPIPermissionApprovalListRequest extends AbstractModel {

    /**
    * Page offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results per page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Approval status. 1: Processing; 20: Rejected; 30: Approved
    */
    @SerializedName("ApprovalStatusList")
    @Expose
    private Long [] ApprovalStatusList;

    /**
    * Keywords for search (API name, API method or application name)
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get Page offset 
     * @return Offset Page offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page offset
     * @param Offset Page offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results per page 
     * @return Limit Number of results per page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results per page
     * @param Limit Number of results per page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Platform ID 
     * @return PlatformId Platform ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID
     * @param PlatformId Platform ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get Approval status. 1: Processing; 20: Rejected; 30: Approved 
     * @return ApprovalStatusList Approval status. 1: Processing; 20: Rejected; 30: Approved
     */
    public Long [] getApprovalStatusList() {
        return this.ApprovalStatusList;
    }

    /**
     * Set Approval status. 1: Processing; 20: Rejected; 30: Approved
     * @param ApprovalStatusList Approval status. 1: Processing; 20: Rejected; 30: Approved
     */
    public void setApprovalStatusList(Long [] ApprovalStatusList) {
        this.ApprovalStatusList = ApprovalStatusList;
    }

    /**
     * Get Keywords for search (API name, API method or application name) 
     * @return Keyword Keywords for search (API name, API method or application name)
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keywords for search (API name, API method or application name)
     * @param Keyword Keywords for search (API name, API method or application name)
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeMNPSensitiveAPIPermissionApprovalListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPSensitiveAPIPermissionApprovalListRequest(DescribeMNPSensitiveAPIPermissionApprovalListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.ApprovalStatusList != null) {
            this.ApprovalStatusList = new Long[source.ApprovalStatusList.length];
            for (int i = 0; i < source.ApprovalStatusList.length; i++) {
                this.ApprovalStatusList[i] = new Long(source.ApprovalStatusList[i]);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamArraySimple(map, prefix + "ApprovalStatusList.", this.ApprovalStatusList);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

