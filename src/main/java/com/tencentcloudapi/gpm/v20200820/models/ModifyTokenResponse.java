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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTokenResponse extends AbstractModel{

    /**
    * Token that has been set successfully.
    */
    @SerializedName("MatchToken")
    @Expose
    private String MatchToken;

    /**
    * The time period during which GPM will continuously push the original token in seconds to the user when the token is replaced.
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("CompatibleSpan")
    @Expose
    private Long CompatibleSpan;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Token that has been set successfully. 
     * @return MatchToken Token that has been set successfully.
     */
    public String getMatchToken() {
        return this.MatchToken;
    }

    /**
     * Set Token that has been set successfully.
     * @param MatchToken Token that has been set successfully.
     */
    public void setMatchToken(String MatchToken) {
        this.MatchToken = MatchToken;
    }

    /**
     * Get The time period during which GPM will continuously push the original token in seconds to the user when the token is replaced.
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return CompatibleSpan The time period during which GPM will continuously push the original token in seconds to the user when the token is replaced.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getCompatibleSpan() {
        return this.CompatibleSpan;
    }

    /**
     * Set The time period during which GPM will continuously push the original token in seconds to the user when the token is replaced.
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param CompatibleSpan The time period during which GPM will continuously push the original token in seconds to the user when the token is replaced.
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setCompatibleSpan(Long CompatibleSpan) {
        this.CompatibleSpan = CompatibleSpan;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchToken", this.MatchToken);
        this.setParamSimple(map, prefix + "CompatibleSpan", this.CompatibleSpan);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

