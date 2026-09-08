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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCaptchaConsoleDataInternational extends AbstractModel {

    /**
    * <p>Paginated data array.</p>
    */
    @SerializedName("DataList")
    @Expose
    private DescribeCaptchaConsoleSubDataInternational [] DataList;

    /**
    * <p>Total pages</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>Current page</p>
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
     * Get <p>Paginated data array.</p> 
     * @return DataList <p>Paginated data array.</p>
     */
    public DescribeCaptchaConsoleSubDataInternational [] getDataList() {
        return this.DataList;
    }

    /**
     * Set <p>Paginated data array.</p>
     * @param DataList <p>Paginated data array.</p>
     */
    public void setDataList(DescribeCaptchaConsoleSubDataInternational [] DataList) {
        this.DataList = DataList;
    }

    /**
     * Get <p>Total pages</p> 
     * @return Total <p>Total pages</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>Total pages</p>
     * @param Total <p>Total pages</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>Current page</p> 
     * @return PageIndex <p>Current page</p>
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set <p>Current page</p>
     * @param PageIndex <p>Current page</p>
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    public DescribeCaptchaConsoleDataInternational() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCaptchaConsoleDataInternational(DescribeCaptchaConsoleDataInternational source) {
        if (source.DataList != null) {
            this.DataList = new DescribeCaptchaConsoleSubDataInternational[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new DescribeCaptchaConsoleSubDataInternational(source.DataList[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DataList.", this.DataList);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);

    }
}

