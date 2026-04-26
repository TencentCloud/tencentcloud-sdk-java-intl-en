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

public class DescribeAllocationTrendByMonthRequest extends AbstractModel {

    /**
    * Bill month, in the format of 2024-02, which is the current month by default if not provided
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * Unique identifier of a cost allocation unit
    */
    @SerializedName("TreeNodeUniqKey")
    @Expose
    private String TreeNodeUniqKey;

    /**
    * Product code, used for filtering
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
     * Get Bill month, in the format of 2024-02, which is the current month by default if not provided 
     * @return Month Bill month, in the format of 2024-02, which is the current month by default if not provided
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Bill month, in the format of 2024-02, which is the current month by default if not provided
     * @param Month Bill month, in the format of 2024-02, which is the current month by default if not provided
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get Unique identifier of a cost allocation unit 
     * @return TreeNodeUniqKey Unique identifier of a cost allocation unit
     */
    public String getTreeNodeUniqKey() {
        return this.TreeNodeUniqKey;
    }

    /**
     * Set Unique identifier of a cost allocation unit
     * @param TreeNodeUniqKey Unique identifier of a cost allocation unit
     */
    public void setTreeNodeUniqKey(String TreeNodeUniqKey) {
        this.TreeNodeUniqKey = TreeNodeUniqKey;
    }

    /**
     * Get Product code, used for filtering 
     * @return BusinessCode Product code, used for filtering
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set Product code, used for filtering
     * @param BusinessCode Product code, used for filtering
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    public DescribeAllocationTrendByMonthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllocationTrendByMonthRequest(DescribeAllocationTrendByMonthRequest source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.TreeNodeUniqKey != null) {
            this.TreeNodeUniqKey = new String(source.TreeNodeUniqKey);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamSimple(map, prefix + "TreeNodeUniqKey", this.TreeNodeUniqKey);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);

    }
}

