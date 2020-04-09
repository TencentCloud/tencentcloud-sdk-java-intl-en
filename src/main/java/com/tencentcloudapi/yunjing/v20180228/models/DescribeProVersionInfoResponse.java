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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProVersionInfoResponse extends AbstractModel{

    /**
    * Fee on yesterday (pay-as-you-go)
    */
    @SerializedName("PostPayCost")
    @Expose
    private Long PostPayCost;

    /**
    * Whether CWP Pro is activated for new servers
    */
    @SerializedName("IsAutoOpenProVersion")
    @Expose
    private Boolean IsAutoOpenProVersion;

    /**
    * Number of servers on CWP Pro
    */
    @SerializedName("ProVersionNum")
    @Expose
    private Long ProVersionNum;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Fee on yesterday (pay-as-you-go) 
     * @return PostPayCost Fee on yesterday (pay-as-you-go)
     */
    public Long getPostPayCost() {
        return this.PostPayCost;
    }

    /**
     * Set Fee on yesterday (pay-as-you-go)
     * @param PostPayCost Fee on yesterday (pay-as-you-go)
     */
    public void setPostPayCost(Long PostPayCost) {
        this.PostPayCost = PostPayCost;
    }

    /**
     * Get Whether CWP Pro is activated for new servers 
     * @return IsAutoOpenProVersion Whether CWP Pro is activated for new servers
     */
    public Boolean getIsAutoOpenProVersion() {
        return this.IsAutoOpenProVersion;
    }

    /**
     * Set Whether CWP Pro is activated for new servers
     * @param IsAutoOpenProVersion Whether CWP Pro is activated for new servers
     */
    public void setIsAutoOpenProVersion(Boolean IsAutoOpenProVersion) {
        this.IsAutoOpenProVersion = IsAutoOpenProVersion;
    }

    /**
     * Get Number of servers on CWP Pro 
     * @return ProVersionNum Number of servers on CWP Pro
     */
    public Long getProVersionNum() {
        return this.ProVersionNum;
    }

    /**
     * Set Number of servers on CWP Pro
     * @param ProVersionNum Number of servers on CWP Pro
     */
    public void setProVersionNum(Long ProVersionNum) {
        this.ProVersionNum = ProVersionNum;
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
        this.setParamSimple(map, prefix + "PostPayCost", this.PostPayCost);
        this.setParamSimple(map, prefix + "IsAutoOpenProVersion", this.IsAutoOpenProVersion);
        this.setParamSimple(map, prefix + "ProVersionNum", this.ProVersionNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

