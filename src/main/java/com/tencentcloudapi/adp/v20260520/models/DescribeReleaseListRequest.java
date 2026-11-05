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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReleaseListRequest extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Page number, starting from 0.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of items per page. Maximum: 100.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Application ID 
     * @return AppId Application ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set Application ID
     * @param AppId Application ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Page number, starting from 0. 
     * @return PageNumber Page number, starting from 0.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number, starting from 0.
     * @param PageNumber Page number, starting from 0.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of items per page. Maximum: 100. 
     * @return PageSize Number of items per page. Maximum: 100.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page. Maximum: 100.
     * @param PageSize Number of items per page. Maximum: 100.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeReleaseListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReleaseListRequest(DescribeReleaseListRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
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
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

