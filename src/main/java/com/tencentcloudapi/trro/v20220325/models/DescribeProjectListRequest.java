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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProjectListRequest extends AbstractModel {

    /**
    * The maximum number of projects returned per page. the default value is 10 if it is not filled in.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * The current page number. the default value is 1 (homepage) if it is not filled in.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get The maximum number of projects returned per page. the default value is 10 if it is not filled in. 
     * @return PageSize The maximum number of projects returned per page. the default value is 10 if it is not filled in.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set The maximum number of projects returned per page. the default value is 10 if it is not filled in.
     * @param PageSize The maximum number of projects returned per page. the default value is 10 if it is not filled in.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get The current page number. the default value is 1 (homepage) if it is not filled in. 
     * @return PageNumber The current page number. the default value is 1 (homepage) if it is not filled in.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set The current page number. the default value is 1 (homepage) if it is not filled in.
     * @param PageNumber The current page number. the default value is 1 (homepage) if it is not filled in.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public DescribeProjectListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectListRequest(DescribeProjectListRequest source) {
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

