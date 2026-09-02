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

public class BehaviorSummary extends AbstractModel {

    /**
    * Specific user behavior data for rendering a line chart
    */
    @SerializedName("BehaviorInfo")
    @Expose
    private BehaviorInfo [] BehaviorInfo;

    /**
    * Number of abnormal behaviors
    */
    @SerializedName("AbnormalCount")
    @Expose
    private Long AbnormalCount;

    /**
    * Whether to access
    */
    @SerializedName("IsAccess")
    @Expose
    private Boolean IsAccess;

    /**
     * Get Specific user behavior data for rendering a line chart 
     * @return BehaviorInfo Specific user behavior data for rendering a line chart
     */
    public BehaviorInfo [] getBehaviorInfo() {
        return this.BehaviorInfo;
    }

    /**
     * Set Specific user behavior data for rendering a line chart
     * @param BehaviorInfo Specific user behavior data for rendering a line chart
     */
    public void setBehaviorInfo(BehaviorInfo [] BehaviorInfo) {
        this.BehaviorInfo = BehaviorInfo;
    }

    /**
     * Get Number of abnormal behaviors 
     * @return AbnormalCount Number of abnormal behaviors
     */
    public Long getAbnormalCount() {
        return this.AbnormalCount;
    }

    /**
     * Set Number of abnormal behaviors
     * @param AbnormalCount Number of abnormal behaviors
     */
    public void setAbnormalCount(Long AbnormalCount) {
        this.AbnormalCount = AbnormalCount;
    }

    /**
     * Get Whether to access 
     * @return IsAccess Whether to access
     */
    public Boolean getIsAccess() {
        return this.IsAccess;
    }

    /**
     * Set Whether to access
     * @param IsAccess Whether to access
     */
    public void setIsAccess(Boolean IsAccess) {
        this.IsAccess = IsAccess;
    }

    public BehaviorSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BehaviorSummary(BehaviorSummary source) {
        if (source.BehaviorInfo != null) {
            this.BehaviorInfo = new BehaviorInfo[source.BehaviorInfo.length];
            for (int i = 0; i < source.BehaviorInfo.length; i++) {
                this.BehaviorInfo[i] = new BehaviorInfo(source.BehaviorInfo[i]);
            }
        }
        if (source.AbnormalCount != null) {
            this.AbnormalCount = new Long(source.AbnormalCount);
        }
        if (source.IsAccess != null) {
            this.IsAccess = new Boolean(source.IsAccess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BehaviorInfo.", this.BehaviorInfo);
        this.setParamSimple(map, prefix + "AbnormalCount", this.AbnormalCount);
        this.setParamSimple(map, prefix + "IsAccess", this.IsAccess);

    }
}

