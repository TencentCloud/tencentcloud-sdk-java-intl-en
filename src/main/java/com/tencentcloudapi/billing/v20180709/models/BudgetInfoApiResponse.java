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

public class BudgetInfoApiResponse extends AbstractModel {

    /**
    * Budget project id
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * Update budget time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * Get Update budget time 
     * @return UpdateTime Update budget time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update budget time
     * @param UpdateTime Update budget time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public BudgetInfoApiResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetInfoApiResponse(BudgetInfoApiResponse source) {
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

