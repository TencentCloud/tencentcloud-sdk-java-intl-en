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

public class DescribeMNGSensitiveAPIPermissionListRequest extends AbstractModel {

    /**
    * <p>Pagination offset</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Pagination count</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Mini game appid</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Platform ID</p>
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
    * <p>Superapp ID</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>Keywords for search (API name)</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get <p>Pagination offset</p> 
     * @return Offset <p>Pagination offset</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination offset</p>
     * @param Offset <p>Pagination offset</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Pagination count</p> 
     * @return Limit <p>Pagination count</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Pagination count</p>
     * @param Limit <p>Pagination count</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Mini game appid</p> 
     * @return MNPId <p>Mini game appid</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini game appid</p>
     * @param MNPId <p>Mini game appid</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Platform ID</p> 
     * @return PlatformId <p>Platform ID</p>
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set <p>Platform ID</p>
     * @param PlatformId <p>Platform ID</p>
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * Get <p>Superapp ID</p> 
     * @return ApplicationId <p>Superapp ID</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>Superapp ID</p>
     * @param ApplicationId <p>Superapp ID</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>Keywords for search (API name)</p> 
     * @return Keyword <p>Keywords for search (API name)</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>Keywords for search (API name)</p>
     * @param Keyword <p>Keywords for search (API name)</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public DescribeMNGSensitiveAPIPermissionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGSensitiveAPIPermissionListRequest(DescribeMNGSensitiveAPIPermissionListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

