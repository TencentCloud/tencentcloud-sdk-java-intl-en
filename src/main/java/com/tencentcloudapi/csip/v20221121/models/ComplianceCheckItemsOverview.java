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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComplianceCheckItemsOverview extends AbstractModel {

    /**
    * <p>Number of check items</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>Check item pass rate</p>
    */
    @SerializedName("PassRate")
    @Expose
    private Long PassRate;

    /**
    * <p>Check type and check item distribution</p>
    */
    @SerializedName("CheckTypes")
    @Expose
    private ComplianceCheckTypeItem [] CheckTypes;

    /**
     * Get <p>Number of check items</p> 
     * @return TotalCount <p>Number of check items</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>Number of check items</p>
     * @param TotalCount <p>Number of check items</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>Check item pass rate</p> 
     * @return PassRate <p>Check item pass rate</p>
     */
    public Long getPassRate() {
        return this.PassRate;
    }

    /**
     * Set <p>Check item pass rate</p>
     * @param PassRate <p>Check item pass rate</p>
     */
    public void setPassRate(Long PassRate) {
        this.PassRate = PassRate;
    }

    /**
     * Get <p>Check type and check item distribution</p> 
     * @return CheckTypes <p>Check type and check item distribution</p>
     */
    public ComplianceCheckTypeItem [] getCheckTypes() {
        return this.CheckTypes;
    }

    /**
     * Set <p>Check type and check item distribution</p>
     * @param CheckTypes <p>Check type and check item distribution</p>
     */
    public void setCheckTypes(ComplianceCheckTypeItem [] CheckTypes) {
        this.CheckTypes = CheckTypes;
    }

    public ComplianceCheckItemsOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceCheckItemsOverview(ComplianceCheckItemsOverview source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.PassRate != null) {
            this.PassRate = new Long(source.PassRate);
        }
        if (source.CheckTypes != null) {
            this.CheckTypes = new ComplianceCheckTypeItem[source.CheckTypes.length];
            for (int i = 0; i < source.CheckTypes.length; i++) {
                this.CheckTypes[i] = new ComplianceCheckTypeItem(source.CheckTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "PassRate", this.PassRate);
        this.setParamArrayObj(map, prefix + "CheckTypes.", this.CheckTypes);

    }
}

