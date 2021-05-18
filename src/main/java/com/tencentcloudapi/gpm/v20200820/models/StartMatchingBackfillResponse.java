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

public class StartMatchingBackfillResponse extends AbstractModel{

    /**
    * MatchTicket
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MatchTicket")
    @Expose
    private MatchTicket MatchTicket;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get MatchTicket
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MatchTicket MatchTicket
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public MatchTicket getMatchTicket() {
        return this.MatchTicket;
    }

    /**
     * Set MatchTicket
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MatchTicket MatchTicket
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMatchTicket(MatchTicket MatchTicket) {
        this.MatchTicket = MatchTicket;
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

    public StartMatchingBackfillResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartMatchingBackfillResponse(StartMatchingBackfillResponse source) {
        if (source.MatchTicket != null) {
            this.MatchTicket = new MatchTicket(source.MatchTicket);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MatchTicket.", this.MatchTicket);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

