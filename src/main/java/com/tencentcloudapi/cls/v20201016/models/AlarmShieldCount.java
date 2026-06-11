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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmShieldCount extends AbstractModel {

    /**
    * Total number of alarm silence policies that meet the search conditions.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Number of ineffective alarm silence policies.
    */
    @SerializedName("InvalidCount")
    @Expose
    private Long InvalidCount;

    /**
    * Number of effective alarm silence policies.
    */
    @SerializedName("ValidCount")
    @Expose
    private Long ValidCount;

    /**
    * Number of expired alarm silence policies.
    */
    @SerializedName("ExpireCount")
    @Expose
    private Long ExpireCount;

    /**
     * Get Total number of alarm silence policies that meet the search conditions. 
     * @return TotalCount Total number of alarm silence policies that meet the search conditions.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of alarm silence policies that meet the search conditions.
     * @param TotalCount Total number of alarm silence policies that meet the search conditions.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Number of ineffective alarm silence policies. 
     * @return InvalidCount Number of ineffective alarm silence policies.
     */
    public Long getInvalidCount() {
        return this.InvalidCount;
    }

    /**
     * Set Number of ineffective alarm silence policies.
     * @param InvalidCount Number of ineffective alarm silence policies.
     */
    public void setInvalidCount(Long InvalidCount) {
        this.InvalidCount = InvalidCount;
    }

    /**
     * Get Number of effective alarm silence policies. 
     * @return ValidCount Number of effective alarm silence policies.
     */
    public Long getValidCount() {
        return this.ValidCount;
    }

    /**
     * Set Number of effective alarm silence policies.
     * @param ValidCount Number of effective alarm silence policies.
     */
    public void setValidCount(Long ValidCount) {
        this.ValidCount = ValidCount;
    }

    /**
     * Get Number of expired alarm silence policies. 
     * @return ExpireCount Number of expired alarm silence policies.
     */
    public Long getExpireCount() {
        return this.ExpireCount;
    }

    /**
     * Set Number of expired alarm silence policies.
     * @param ExpireCount Number of expired alarm silence policies.
     */
    public void setExpireCount(Long ExpireCount) {
        this.ExpireCount = ExpireCount;
    }

    public AlarmShieldCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmShieldCount(AlarmShieldCount source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InvalidCount != null) {
            this.InvalidCount = new Long(source.InvalidCount);
        }
        if (source.ValidCount != null) {
            this.ValidCount = new Long(source.ValidCount);
        }
        if (source.ExpireCount != null) {
            this.ExpireCount = new Long(source.ExpireCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "InvalidCount", this.InvalidCount);
        this.setParamSimple(map, prefix + "ValidCount", this.ValidCount);
        this.setParamSimple(map, prefix + "ExpireCount", this.ExpireCount);

    }
}

