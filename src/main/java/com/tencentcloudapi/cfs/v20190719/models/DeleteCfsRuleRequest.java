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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCfsRuleRequest extends AbstractModel {

    /**
    * Permission group ID, which can be obtained through the api [DescribeCfsPGroups](https://www.tencentcloud.com/document/api/582/38157?from_cn_redirect=1).
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * Rule ID, which can be obtained through the [DescribeCfsRules](https://www.tencentcloud.com/document/api/582/38156?from_cn_redirect=1) api.
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
     * Get Permission group ID, which can be obtained through the api [DescribeCfsPGroups](https://www.tencentcloud.com/document/api/582/38157?from_cn_redirect=1). 
     * @return PGroupId Permission group ID, which can be obtained through the api [DescribeCfsPGroups](https://www.tencentcloud.com/document/api/582/38157?from_cn_redirect=1).
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set Permission group ID, which can be obtained through the api [DescribeCfsPGroups](https://www.tencentcloud.com/document/api/582/38157?from_cn_redirect=1).
     * @param PGroupId Permission group ID, which can be obtained through the api [DescribeCfsPGroups](https://www.tencentcloud.com/document/api/582/38157?from_cn_redirect=1).
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get Rule ID, which can be obtained through the [DescribeCfsRules](https://www.tencentcloud.com/document/api/582/38156?from_cn_redirect=1) api. 
     * @return RuleId Rule ID, which can be obtained through the [DescribeCfsRules](https://www.tencentcloud.com/document/api/582/38156?from_cn_redirect=1) api.
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Rule ID, which can be obtained through the [DescribeCfsRules](https://www.tencentcloud.com/document/api/582/38156?from_cn_redirect=1) api.
     * @param RuleId Rule ID, which can be obtained through the [DescribeCfsRules](https://www.tencentcloud.com/document/api/582/38156?from_cn_redirect=1) api.
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    public DeleteCfsRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCfsRuleRequest(DeleteCfsRuleRequest source) {
        if (source.PGroupId != null) {
            this.PGroupId = new String(source.PGroupId);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);

    }
}

