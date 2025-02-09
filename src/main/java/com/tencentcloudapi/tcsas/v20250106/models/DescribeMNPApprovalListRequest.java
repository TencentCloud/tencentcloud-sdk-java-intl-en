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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNPApprovalListRequest extends AbstractModel {

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
    * Approval status. 1: Processing; 2: Rejected; 3: Approved; 4 Cancelled
    */
    @SerializedName("ApprovalStatusList")
    @Expose
    private Long [] ApprovalStatusList;

    /**
    * Keywords of the mini program name to search
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Team ID
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

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
     * Get Approval status. 1: Processing; 2: Rejected; 3: Approved; 4 Cancelled 
     * @return ApprovalStatusList Approval status. 1: Processing; 2: Rejected; 3: Approved; 4 Cancelled
     */
    public Long [] getApprovalStatusList() {
        return this.ApprovalStatusList;
    }

    /**
     * Set Approval status. 1: Processing; 2: Rejected; 3: Approved; 4 Cancelled
     * @param ApprovalStatusList Approval status. 1: Processing; 2: Rejected; 3: Approved; 4 Cancelled
     */
    public void setApprovalStatusList(Long [] ApprovalStatusList) {
        this.ApprovalStatusList = ApprovalStatusList;
    }

    /**
     * Get Keywords of the mini program name to search 
     * @return Keyword Keywords of the mini program name to search
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keywords of the mini program name to search
     * @param Keyword Keywords of the mini program name to search
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Application ID 
     * @return ApplicationId Application ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
     * @param ApplicationId Application ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Team ID 
     * @return TeamId Team ID
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Team ID
     * @param TeamId Team ID
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    public DescribeMNPApprovalListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPApprovalListRequest(DescribeMNPApprovalListRequest source) {
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
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
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
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);

    }
}

