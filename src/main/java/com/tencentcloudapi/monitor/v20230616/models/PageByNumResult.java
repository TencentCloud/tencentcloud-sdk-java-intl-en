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

public class PageByNumResult extends AbstractModel {

    /**
    * <p>Total number of data</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>Total number of pages</p>
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * <p>Current page number</p>
    */
    @SerializedName("CurrentPageNo")
    @Expose
    private Long CurrentPageNo;

    /**
     * Get <p>Total number of data</p> 
     * @return TotalCount <p>Total number of data</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>Total number of data</p>
     * @param TotalCount <p>Total number of data</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>Total number of pages</p> 
     * @return TotalPage <p>Total number of pages</p>
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set <p>Total number of pages</p>
     * @param TotalPage <p>Total number of pages</p>
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get <p>Current page number</p> 
     * @return CurrentPageNo <p>Current page number</p>
     */
    public Long getCurrentPageNo() {
        return this.CurrentPageNo;
    }

    /**
     * Set <p>Current page number</p>
     * @param CurrentPageNo <p>Current page number</p>
     */
    public void setCurrentPageNo(Long CurrentPageNo) {
        this.CurrentPageNo = CurrentPageNo;
    }

    public PageByNumResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PageByNumResult(PageByNumResult source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.CurrentPageNo != null) {
            this.CurrentPageNo = new Long(source.CurrentPageNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "CurrentPageNo", this.CurrentPageNo);

    }
}

