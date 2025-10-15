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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAlarmRulesResult extends AbstractModel {

    /**
    * Page number for pagination. current page number.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Specifies the number of items to display per page.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Total number of pages.
    */
    @SerializedName("TotalPageNumber")
    @Expose
    private Long TotalPageNumber;

    /**
    * Count of all Alarm rules.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Alert rule information list.
    */
    @SerializedName("Items")
    @Expose
    private AlarmRuleData [] Items;

    /**
     * Get Page number for pagination. current page number. 
     * @return PageNumber Page number for pagination. current page number.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number for pagination. current page number.
     * @param PageNumber Page number for pagination. current page number.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Specifies the number of items to display per page. 
     * @return PageSize Specifies the number of items to display per page.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Specifies the number of items to display per page.
     * @param PageSize Specifies the number of items to display per page.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Total number of pages. 
     * @return TotalPageNumber Total number of pages.
     */
    public Long getTotalPageNumber() {
        return this.TotalPageNumber;
    }

    /**
     * Set Total number of pages.
     * @param TotalPageNumber Total number of pages.
     */
    public void setTotalPageNumber(Long TotalPageNumber) {
        this.TotalPageNumber = TotalPageNumber;
    }

    /**
     * Get Count of all Alarm rules. 
     * @return TotalCount Count of all Alarm rules.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Count of all Alarm rules.
     * @param TotalCount Count of all Alarm rules.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Alert rule information list. 
     * @return Items Alert rule information list.
     */
    public AlarmRuleData [] getItems() {
        return this.Items;
    }

    /**
     * Set Alert rule information list.
     * @param Items Alert rule information list.
     */
    public void setItems(AlarmRuleData [] Items) {
        this.Items = Items;
    }

    public ListAlarmRulesResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAlarmRulesResult(ListAlarmRulesResult source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalPageNumber != null) {
            this.TotalPageNumber = new Long(source.TotalPageNumber);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new AlarmRuleData[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new AlarmRuleData(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalPageNumber", this.TotalPageNumber);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

