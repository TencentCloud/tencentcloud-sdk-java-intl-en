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

public class DataForBudgetOperationLogPage extends AbstractModel {

    /**
    * Pagination
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
    * Pagination size.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Total amount
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Querying the data list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Records")
    @Expose
    private BudgetOperationLogEntity [] Records;

    /**
    * Current Page
    */
    @SerializedName("Current")
    @Expose
    private Long Current;

    /**
     * Get Pagination 
     * @return Pages Pagination
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set Pagination
     * @param Pages Pagination
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    /**
     * Get Pagination size. 
     * @return Size Pagination size.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Pagination size.
     * @param Size Pagination size.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Total amount 
     * @return Total Total amount
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total amount
     * @param Total Total amount
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Querying the data list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Records Querying the data list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BudgetOperationLogEntity [] getRecords() {
        return this.Records;
    }

    /**
     * Set Querying the data list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Records Querying the data list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecords(BudgetOperationLogEntity [] Records) {
        this.Records = Records;
    }

    /**
     * Get Current Page 
     * @return Current Current Page
     */
    public Long getCurrent() {
        return this.Current;
    }

    /**
     * Set Current Page
     * @param Current Current Page
     */
    public void setCurrent(Long Current) {
        this.Current = Current;
    }

    public DataForBudgetOperationLogPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataForBudgetOperationLogPage(DataForBudgetOperationLogPage source) {
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Records != null) {
            this.Records = new BudgetOperationLogEntity[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new BudgetOperationLogEntity(source.Records[i]);
            }
        }
        if (source.Current != null) {
            this.Current = new Long(source.Current);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamSimple(map, prefix + "Current", this.Current);

    }
}

