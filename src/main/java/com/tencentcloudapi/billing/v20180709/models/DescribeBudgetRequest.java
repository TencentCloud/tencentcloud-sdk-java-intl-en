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

public class DescribeBudgetRequest extends AbstractModel {

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
    * Budget project id
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * Budget Name
    */
    @SerializedName("BudgetName")
    @Expose
    private String BudgetName;

    /**
    * EXPIRED, ACTIVE, ACTIVATED pending activation
    */
    @SerializedName("BudgetStatus")
    @Expose
    private String BudgetStatus;

    /**
    * DAY day MONTH monthly QUARTER quarter YEAR annual
    */
    @SerializedName("CycleTypes")
    @Expose
    private String [] CycleTypes;

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
     * Get Budget project id 
     * @return BudgetId Budget project id
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set Budget project id
     * @param BudgetId Budget project id
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get Budget Name 
     * @return BudgetName Budget Name
     */
    public String getBudgetName() {
        return this.BudgetName;
    }

    /**
     * Set Budget Name
     * @param BudgetName Budget Name
     */
    public void setBudgetName(String BudgetName) {
        this.BudgetName = BudgetName;
    }

    /**
     * Get EXPIRED, ACTIVE, ACTIVATED pending activation 
     * @return BudgetStatus EXPIRED, ACTIVE, ACTIVATED pending activation
     */
    public String getBudgetStatus() {
        return this.BudgetStatus;
    }

    /**
     * Set EXPIRED, ACTIVE, ACTIVATED pending activation
     * @param BudgetStatus EXPIRED, ACTIVE, ACTIVATED pending activation
     */
    public void setBudgetStatus(String BudgetStatus) {
        this.BudgetStatus = BudgetStatus;
    }

    /**
     * Get DAY day MONTH monthly QUARTER quarter YEAR annual 
     * @return CycleTypes DAY day MONTH monthly QUARTER quarter YEAR annual
     */
    public String [] getCycleTypes() {
        return this.CycleTypes;
    }

    /**
     * Set DAY day MONTH monthly QUARTER quarter YEAR annual
     * @param CycleTypes DAY day MONTH monthly QUARTER quarter YEAR annual
     */
    public void setCycleTypes(String [] CycleTypes) {
        this.CycleTypes = CycleTypes;
    }

    public DescribeBudgetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBudgetRequest(DescribeBudgetRequest source) {
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.BudgetName != null) {
            this.BudgetName = new String(source.BudgetName);
        }
        if (source.BudgetStatus != null) {
            this.BudgetStatus = new String(source.BudgetStatus);
        }
        if (source.CycleTypes != null) {
            this.CycleTypes = new String[source.CycleTypes.length];
            for (int i = 0; i < source.CycleTypes.length; i++) {
                this.CycleTypes[i] = new String(source.CycleTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamSimple(map, prefix + "BudgetName", this.BudgetName);
        this.setParamSimple(map, prefix + "BudgetStatus", this.BudgetStatus);
        this.setParamArraySimple(map, prefix + "CycleTypes.", this.CycleTypes);

    }
}

