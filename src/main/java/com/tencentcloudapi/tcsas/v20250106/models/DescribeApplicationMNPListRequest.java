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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationMNPListRequest extends AbstractModel {

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
    * Superapp ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Online status. 0 All (default); 1 Available; 2 In canary release
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * Engine type. 0 Mini program; 1 Mini game
    */
    @SerializedName("EngineTypeList")
    @Expose
    private Long [] EngineTypeList;

    /**
    * Secondary category name
    */
    @SerializedName("SubCategory")
    @Expose
    private String SubCategory;

    /**
    * Primary category name
    */
    @SerializedName("PrimaryCategory")
    @Expose
    private String PrimaryCategory;

    /**
    * Keywords
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
     * Get Superapp ID 
     * @return ApplicationId Superapp ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Superapp ID
     * @param ApplicationId Superapp ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Online status. 0 All (default); 1 Available; 2 In canary release 
     * @return OnlineStatus Online status. 0 All (default); 1 Available; 2 In canary release
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set Online status. 0 All (default); 1 Available; 2 In canary release
     * @param OnlineStatus Online status. 0 All (default); 1 Available; 2 In canary release
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get Engine type. 0 Mini program; 1 Mini game 
     * @return EngineTypeList Engine type. 0 Mini program; 1 Mini game
     */
    public Long [] getEngineTypeList() {
        return this.EngineTypeList;
    }

    /**
     * Set Engine type. 0 Mini program; 1 Mini game
     * @param EngineTypeList Engine type. 0 Mini program; 1 Mini game
     */
    public void setEngineTypeList(Long [] EngineTypeList) {
        this.EngineTypeList = EngineTypeList;
    }

    /**
     * Get Secondary category name 
     * @return SubCategory Secondary category name
     */
    public String getSubCategory() {
        return this.SubCategory;
    }

    /**
     * Set Secondary category name
     * @param SubCategory Secondary category name
     */
    public void setSubCategory(String SubCategory) {
        this.SubCategory = SubCategory;
    }

    /**
     * Get Primary category name 
     * @return PrimaryCategory Primary category name
     */
    public String getPrimaryCategory() {
        return this.PrimaryCategory;
    }

    /**
     * Set Primary category name
     * @param PrimaryCategory Primary category name
     */
    public void setPrimaryCategory(String PrimaryCategory) {
        this.PrimaryCategory = PrimaryCategory;
    }

    /**
     * Get Keywords 
     * @return Keyword Keywords
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keywords
     * @param Keyword Keywords
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeApplicationMNPListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationMNPListRequest(DescribeApplicationMNPListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.OnlineStatus != null) {
            this.OnlineStatus = new Long(source.OnlineStatus);
        }
        if (source.EngineTypeList != null) {
            this.EngineTypeList = new Long[source.EngineTypeList.length];
            for (int i = 0; i < source.EngineTypeList.length; i++) {
                this.EngineTypeList[i] = new Long(source.EngineTypeList[i]);
            }
        }
        if (source.SubCategory != null) {
            this.SubCategory = new String(source.SubCategory);
        }
        if (source.PrimaryCategory != null) {
            this.PrimaryCategory = new String(source.PrimaryCategory);
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
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "OnlineStatus", this.OnlineStatus);
        this.setParamArraySimple(map, prefix + "EngineTypeList.", this.EngineTypeList);
        this.setParamSimple(map, prefix + "SubCategory", this.SubCategory);
        this.setParamSimple(map, prefix + "PrimaryCategory", this.PrimaryCategory);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

