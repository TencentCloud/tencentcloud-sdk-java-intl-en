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

public class DescribeVulLevelCountRequest extends AbstractModel {

    /**
    * 1: web CMS vulnerability; 2: application vulnerability; 3: security baseline; 4: Linux software vulnerability; 5: Windows system vulnerability; 6: emergency vulnerability. If this parameter is left blank or set to 0, the statistics data of all vulnerabilities of types 1, 2, 4, and 5 is returned.
    */
    @SerializedName("VulCategory")
    @Expose
    private Long VulCategory;

    /**
    * Whether to count only critical vulnerabilities. 1: only critical vulnerabilities; 0: all vulnerabilities.
    */
    @SerializedName("IsFollowVul")
    @Expose
    private Long IsFollowVul;

    /**
     * Get 1: web CMS vulnerability; 2: application vulnerability; 3: security baseline; 4: Linux software vulnerability; 5: Windows system vulnerability; 6: emergency vulnerability. If this parameter is left blank or set to 0, the statistics data of all vulnerabilities of types 1, 2, 4, and 5 is returned. 
     * @return VulCategory 1: web CMS vulnerability; 2: application vulnerability; 3: security baseline; 4: Linux software vulnerability; 5: Windows system vulnerability; 6: emergency vulnerability. If this parameter is left blank or set to 0, the statistics data of all vulnerabilities of types 1, 2, 4, and 5 is returned.
     */
    public Long getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set 1: web CMS vulnerability; 2: application vulnerability; 3: security baseline; 4: Linux software vulnerability; 5: Windows system vulnerability; 6: emergency vulnerability. If this parameter is left blank or set to 0, the statistics data of all vulnerabilities of types 1, 2, 4, and 5 is returned.
     * @param VulCategory 1: web CMS vulnerability; 2: application vulnerability; 3: security baseline; 4: Linux software vulnerability; 5: Windows system vulnerability; 6: emergency vulnerability. If this parameter is left blank or set to 0, the statistics data of all vulnerabilities of types 1, 2, 4, and 5 is returned.
     */
    public void setVulCategory(Long VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get Whether to count only critical vulnerabilities. 1: only critical vulnerabilities; 0: all vulnerabilities. 
     * @return IsFollowVul Whether to count only critical vulnerabilities. 1: only critical vulnerabilities; 0: all vulnerabilities.
     */
    public Long getIsFollowVul() {
        return this.IsFollowVul;
    }

    /**
     * Set Whether to count only critical vulnerabilities. 1: only critical vulnerabilities; 0: all vulnerabilities.
     * @param IsFollowVul Whether to count only critical vulnerabilities. 1: only critical vulnerabilities; 0: all vulnerabilities.
     */
    public void setIsFollowVul(Long IsFollowVul) {
        this.IsFollowVul = IsFollowVul;
    }

    public DescribeVulLevelCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulLevelCountRequest(DescribeVulLevelCountRequest source) {
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
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);
        this.setParamSimple(map, prefix + "IsFollowVul", this.IsFollowVul);

    }
}

