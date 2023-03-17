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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrtcUsageResponse extends AbstractModel{

    /**
    * The usage type. Each element of this parameter corresponds to an element of `UsageValue` in the order they are listed.
    */
    @SerializedName("UsageKey")
    @Expose
    private String [] UsageKey;

    /**
    * The usage data in each time unit.
    */
    @SerializedName("UsageList")
    @Expose
    private TrtcUsage [] UsageList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The usage type. Each element of this parameter corresponds to an element of `UsageValue` in the order they are listed. 
     * @return UsageKey The usage type. Each element of this parameter corresponds to an element of `UsageValue` in the order they are listed.
     */
    public String [] getUsageKey() {
        return this.UsageKey;
    }

    /**
     * Set The usage type. Each element of this parameter corresponds to an element of `UsageValue` in the order they are listed.
     * @param UsageKey The usage type. Each element of this parameter corresponds to an element of `UsageValue` in the order they are listed.
     */
    public void setUsageKey(String [] UsageKey) {
        this.UsageKey = UsageKey;
    }

    /**
     * Get The usage data in each time unit. 
     * @return UsageList The usage data in each time unit.
     */
    public TrtcUsage [] getUsageList() {
        return this.UsageList;
    }

    /**
     * Set The usage data in each time unit.
     * @param UsageList The usage data in each time unit.
     */
    public void setUsageList(TrtcUsage [] UsageList) {
        this.UsageList = UsageList;
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

    public DescribeTrtcUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrtcUsageResponse(DescribeTrtcUsageResponse source) {
        if (source.UsageKey != null) {
            this.UsageKey = new String[source.UsageKey.length];
            for (int i = 0; i < source.UsageKey.length; i++) {
                this.UsageKey[i] = new String(source.UsageKey[i]);
            }
        }
        if (source.UsageList != null) {
            this.UsageList = new TrtcUsage[source.UsageList.length];
            for (int i = 0; i < source.UsageList.length; i++) {
                this.UsageList[i] = new TrtcUsage(source.UsageList[i]);
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
        this.setParamArraySimple(map, prefix + "UsageKey.", this.UsageKey);
        this.setParamArrayObj(map, prefix + "UsageList.", this.UsageList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

