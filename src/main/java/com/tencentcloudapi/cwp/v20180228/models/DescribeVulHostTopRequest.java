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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulHostTopRequest extends AbstractModel {

    /**
    * Obtain top values: 1-100
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities; 6: emergency vulnerabilities. If it is left blank or set to 0, the total statistics of vulnerabilities 1, 2, 4, and 5 are returned.
    */
    @SerializedName("VulCategory")
    @Expose
    private Long VulCategory;

    /**
    * Whether to count only critical vulnerabilities: 1: only critical vulnerabilities; 0: all vulnerabilities
    */
    @SerializedName("IsFollowVul")
    @Expose
    private Long IsFollowVul;

    /**
     * Get Obtain top values: 1-100 
     * @return Top Obtain top values: 1-100
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set Obtain top values: 1-100
     * @param Top Obtain top values: 1-100
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities; 6: emergency vulnerabilities. If it is left blank or set to 0, the total statistics of vulnerabilities 1, 2, 4, and 5 are returned. 
     * @return VulCategory 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities; 6: emergency vulnerabilities. If it is left blank or set to 0, the total statistics of vulnerabilities 1, 2, 4, and 5 are returned.
     */
    public Long getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities; 6: emergency vulnerabilities. If it is left blank or set to 0, the total statistics of vulnerabilities 1, 2, 4, and 5 are returned.
     * @param VulCategory 1: web-cms vulnerabilities; 2: application vulnerabilities; 4: Linux software vulnerabilities; 5: Windows system vulnerabilities; 6: emergency vulnerabilities. If it is left blank or set to 0, the total statistics of vulnerabilities 1, 2, 4, and 5 are returned.
     */
    public void setVulCategory(Long VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get Whether to count only critical vulnerabilities: 1: only critical vulnerabilities; 0: all vulnerabilities 
     * @return IsFollowVul Whether to count only critical vulnerabilities: 1: only critical vulnerabilities; 0: all vulnerabilities
     */
    public Long getIsFollowVul() {
        return this.IsFollowVul;
    }

    /**
     * Set Whether to count only critical vulnerabilities: 1: only critical vulnerabilities; 0: all vulnerabilities
     * @param IsFollowVul Whether to count only critical vulnerabilities: 1: only critical vulnerabilities; 0: all vulnerabilities
     */
    public void setIsFollowVul(Long IsFollowVul) {
        this.IsFollowVul = IsFollowVul;
    }

    public DescribeVulHostTopRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulHostTopRequest(DescribeVulHostTopRequest source) {
        if (source.Top != null) {
            this.Top = new Long(source.Top);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new Long(source.VulCategory);
        }
        if (source.IsFollowVul != null) {
            this.IsFollowVul = new Long(source.IsFollowVul);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);
        this.setParamSimple(map, prefix + "IsFollowVul", this.IsFollowVul);

    }
}

