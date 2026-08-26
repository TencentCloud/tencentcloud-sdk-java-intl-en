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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeTokenPlanTeamOrderRequest extends AbstractModel {

    /**
    * Package ID. You can obtain it through the DescribeTokenPlanList API.
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * Limit of the new specification after upgrade. For the enterprise package type, it refers to the point limit. For the enterprise-auto package type, it refers to the Token count. Must be greater than the current limit.
    */
    @SerializedName("NewCreditOrToken")
    @Expose
    private Long NewCreditOrToken;

    /**
     * Get Package ID. You can obtain it through the DescribeTokenPlanList API. 
     * @return TeamId Package ID. You can obtain it through the DescribeTokenPlanList API.
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set Package ID. You can obtain it through the DescribeTokenPlanList API.
     * @param TeamId Package ID. You can obtain it through the DescribeTokenPlanList API.
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get Limit of the new specification after upgrade. For the enterprise package type, it refers to the point limit. For the enterprise-auto package type, it refers to the Token count. Must be greater than the current limit. 
     * @return NewCreditOrToken Limit of the new specification after upgrade. For the enterprise package type, it refers to the point limit. For the enterprise-auto package type, it refers to the Token count. Must be greater than the current limit.
     */
    public Long getNewCreditOrToken() {
        return this.NewCreditOrToken;
    }

    /**
     * Set Limit of the new specification after upgrade. For the enterprise package type, it refers to the point limit. For the enterprise-auto package type, it refers to the Token count. Must be greater than the current limit.
     * @param NewCreditOrToken Limit of the new specification after upgrade. For the enterprise package type, it refers to the point limit. For the enterprise-auto package type, it refers to the Token count. Must be greater than the current limit.
     */
    public void setNewCreditOrToken(Long NewCreditOrToken) {
        this.NewCreditOrToken = NewCreditOrToken;
    }

    public UpgradeTokenPlanTeamOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeTokenPlanTeamOrderRequest(UpgradeTokenPlanTeamOrderRequest source) {
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.NewCreditOrToken != null) {
            this.NewCreditOrToken = new Long(source.NewCreditOrToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "NewCreditOrToken", this.NewCreditOrToken);

    }
}

