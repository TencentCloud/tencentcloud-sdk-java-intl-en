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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PullSmsSendStatusResponse extends AbstractModel {

    /**
    * Delivery status response set.
    */
    @SerializedName("PullSmsSendStatusSet")
    @Expose
    private PullSmsSendStatus [] PullSmsSendStatusSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Delivery status response set. 
     * @return PullSmsSendStatusSet Delivery status response set.
     */
    public PullSmsSendStatus [] getPullSmsSendStatusSet() {
        return this.PullSmsSendStatusSet;
    }

    /**
     * Set Delivery status response set.
     * @param PullSmsSendStatusSet Delivery status response set.
     */
    public void setPullSmsSendStatusSet(PullSmsSendStatus [] PullSmsSendStatusSet) {
        this.PullSmsSendStatusSet = PullSmsSendStatusSet;
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

    public PullSmsSendStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PullSmsSendStatusResponse(PullSmsSendStatusResponse source) {
        if (source.PullSmsSendStatusSet != null) {
            this.PullSmsSendStatusSet = new PullSmsSendStatus[source.PullSmsSendStatusSet.length];
            for (int i = 0; i < source.PullSmsSendStatusSet.length; i++) {
                this.PullSmsSendStatusSet[i] = new PullSmsSendStatus(source.PullSmsSendStatusSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PullSmsSendStatusSet.", this.PullSmsSendStatusSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

