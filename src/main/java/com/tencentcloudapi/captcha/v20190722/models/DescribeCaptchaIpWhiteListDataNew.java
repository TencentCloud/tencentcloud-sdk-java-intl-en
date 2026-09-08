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

public class DescribeCaptchaIpWhiteListDataNew extends AbstractModel {

    /**
    * <p>Data list.</p>
    */
    @SerializedName("DataList")
    @Expose
    private DescribeCaptchaWhiteListItem [] DataList;

    /**
    * <p>Total number of records</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>Page number.</p>
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
     * Get <p>Data list.</p> 
     * @return DataList <p>Data list.</p>
     */
    public DescribeCaptchaWhiteListItem [] getDataList() {
        return this.DataList;
    }

    /**
     * Set <p>Data list.</p>
     * @param DataList <p>Data list.</p>
     */
    public void setDataList(DescribeCaptchaWhiteListItem [] DataList) {
        this.DataList = DataList;
    }

    /**
     * Get <p>Total number of records</p> 
     * @return Total <p>Total number of records</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>Total number of records</p>
     * @param Total <p>Total number of records</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>Page number.</p> 
     * @return PageIndex <p>Page number.</p>
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set <p>Page number.</p>
     * @param PageIndex <p>Page number.</p>
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    public DescribeCaptchaIpWhiteListDataNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCaptchaIpWhiteListDataNew(DescribeCaptchaIpWhiteListDataNew source) {
        if (source.DataList != null) {
            this.DataList = new DescribeCaptchaWhiteListItem[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new DescribeCaptchaWhiteListItem(source.DataList[i]);
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

