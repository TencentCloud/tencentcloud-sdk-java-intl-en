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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PageByNoParams extends AbstractModel {

    /**
    * Number of items per page.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PerPage")
    @Expose
    private Long PerPage;

    /**
    * Page number, starting from 1.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageNo")
    @Expose
    private String PageNo;

    /**
     * Get Number of items per page.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PerPage Number of items per page.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPerPage() {
        return this.PerPage;
    }

    /**
     * Set Number of items per page.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PerPage Number of items per page.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPerPage(Long PerPage) {
        this.PerPage = PerPage;
    }

    /**
     * Get Page number, starting from 1.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageNo Page number, starting from 1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPageNo() {
        return this.PageNo;
    }

    /**
     * Set Page number, starting from 1.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageNo Page number, starting from 1.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageNo(String PageNo) {
        this.PageNo = PageNo;
    }

    public PageByNoParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PageByNoParams(PageByNoParams source) {
        if (source.PerPage != null) {
            this.PerPage = new Long(source.PerPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new String(source.PageNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PerPage", this.PerPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);

    }
}

