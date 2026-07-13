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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBudgetRemindRecordListRequest extends AbstractModel {

    /**
    * Page number, int
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * Number of items per page, integer
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Budget base information association id
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
     * Get Page number, int 
     * @return PageNo Page number, int
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set Page number, int
     * @param PageNo Page number, int
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get Number of items per page, integer 
     * @return PageSize Number of items per page, integer
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of items per page, integer
     * @param PageSize Number of items per page, integer
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Budget base information association id 
     * @return BudgetId Budget base information association id
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set Budget base information association id
     * @param BudgetId Budget base information association id
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    public DescribeBudgetRemindRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBudgetRemindRecordListRequest(DescribeBudgetRemindRecordListRequest source) {
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);

    }
}

