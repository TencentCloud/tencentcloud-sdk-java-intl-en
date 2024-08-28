/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class DescribeVulTopRequest extends AbstractModel {

    /**
    * Top servers by vulnerability risks. The specific number is in the range of 1 to 100.
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability; 6: emergency vulnerability. If this parameter is left blank or set to 0, the statistical data of all these types of vulnerabilities is returned.
    */
    @SerializedName("VulCategory")
    @Expose
    private Long VulCategory;

    /**
    * Whether to count only focused vulnerabilities. 1: count only focused vulnerabilities; 0: count all vulnerabilities.
    */
    @SerializedName("IsFollowVul")
    @Expose
    private Long IsFollowVul;

    /**
     * Get Top servers by vulnerability risks. The specific number is in the range of 1 to 100. 
     * @return Top Top servers by vulnerability risks. The specific number is in the range of 1 to 100.
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set Top servers by vulnerability risks. The specific number is in the range of 1 to 100.
     * @param Top Top servers by vulnerability risks. The specific number is in the range of 1 to 100.
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability; 6: emergency vulnerability. If this parameter is left blank or set to 0, the statistical data of all these types of vulnerabilities is returned. 
     * @return VulCategory 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability; 6: emergency vulnerability. If this parameter is left blank or set to 0, the statistical data of all these types of vulnerabilities is returned.
     */
    public Long getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability; 6: emergency vulnerability. If this parameter is left blank or set to 0, the statistical data of all these types of vulnerabilities is returned.
     * @param VulCategory 1: web CMS vulnerability; 2: application vulnerability; 4: Linux software vulnerability; 5: Windows system vulnerability; 6: emergency vulnerability. If this parameter is left blank or set to 0, the statistical data of all these types of vulnerabilities is returned.
     */
    public void setVulCategory(Long VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get Whether to count only focused vulnerabilities. 1: count only focused vulnerabilities; 0: count all vulnerabilities. 
     * @return IsFollowVul Whether to count only focused vulnerabilities. 1: count only focused vulnerabilities; 0: count all vulnerabilities.
     */
    public Long getIsFollowVul() {
        return this.IsFollowVul;
    }

    /**
     * Set Whether to count only focused vulnerabilities. 1: count only focused vulnerabilities; 0: count all vulnerabilities.
     * @param IsFollowVul Whether to count only focused vulnerabilities. 1: count only focused vulnerabilities; 0: count all vulnerabilities.
     */
    public void setIsFollowVul(Long IsFollowVul) {
        this.IsFollowVul = IsFollowVul;
    }

    public DescribeVulTopRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulTopRequest(DescribeVulTopRequest source) {
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

