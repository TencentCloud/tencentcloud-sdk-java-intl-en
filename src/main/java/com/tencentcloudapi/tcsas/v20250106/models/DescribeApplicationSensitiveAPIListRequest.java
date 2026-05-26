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

public class DescribeApplicationSensitiveAPIListRequest extends AbstractModel {

    /**
    * Pagination offset. 
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page. 
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Platform ID.
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * Superapp ID.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Search keyword (API name or method).
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Team ID.
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
     * Get Pagination offset.  
     * @return Offset Pagination offset. 
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. 
     * @param Offset Pagination offset. 
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page.  
     * @return Limit Number of entries per page. 
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. 
     * @param Limit Number of entries per page. 
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Platform ID. 
     * @return PlatformId Platform ID.
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID.
     * @param PlatformId Platform ID.
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get Superapp ID. 
     * @return ApplicationId Superapp ID.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Superapp ID.
     * @param ApplicationId Superapp ID.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Search keyword (API name or method). 
     * @return Keyword Search keyword (API name or method).
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Search keyword (API name or method).
     * @param Keyword Search keyword (API name or method).
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Team ID. 
     * @return TeamId Team ID.
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Team ID.
     * @param TeamId Team ID.
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    public DescribeApplicationSensitiveAPIListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationSensitiveAPIListRequest(DescribeApplicationSensitiveAPIListRequest source) {
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
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
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
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);

    }
}

