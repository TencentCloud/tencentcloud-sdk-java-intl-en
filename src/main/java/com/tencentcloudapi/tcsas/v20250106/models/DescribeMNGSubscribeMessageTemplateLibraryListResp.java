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

public class DescribeMNGSubscribeMessageTemplateLibraryListResp extends AbstractModel {

    /**
    * <p>Total count.</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>Subscription message template library data.</p>
    */
    @SerializedName("DataList")
    @Expose
    private DescribeMNGSubscribeMessageTemplateLibraryInfoResp [] DataList;

    /**
     * Get <p>Total count.</p> 
     * @return TotalCount <p>Total count.</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>Total count.</p>
     * @param TotalCount <p>Total count.</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>Subscription message template library data.</p> 
     * @return DataList <p>Subscription message template library data.</p>
     */
    public DescribeMNGSubscribeMessageTemplateLibraryInfoResp [] getDataList() {
        return this.DataList;
    }

    /**
     * Set <p>Subscription message template library data.</p>
     * @param DataList <p>Subscription message template library data.</p>
     */
    public void setDataList(DescribeMNGSubscribeMessageTemplateLibraryInfoResp [] DataList) {
        this.DataList = DataList;
    }

    public DescribeMNGSubscribeMessageTemplateLibraryListResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGSubscribeMessageTemplateLibraryListResp(DescribeMNGSubscribeMessageTemplateLibraryListResp source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DataList != null) {
            this.DataList = new DescribeMNGSubscribeMessageTemplateLibraryInfoResp[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new DescribeMNGSubscribeMessageTemplateLibraryInfoResp(source.DataList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "DataList.", this.DataList);

    }
}

