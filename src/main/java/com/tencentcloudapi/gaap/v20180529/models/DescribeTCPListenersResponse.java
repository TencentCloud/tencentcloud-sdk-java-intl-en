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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTCPListenersResponse extends AbstractModel{

    /**
    * Total quantity of listeners that matches the conditions
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * TCP listener list
    */
    @SerializedName("ListenerSet")
    @Expose
    private TCPListener [] ListenerSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total quantity of listeners that matches the conditions 
     * @return TotalCount Total quantity of listeners that matches the conditions
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total quantity of listeners that matches the conditions
     * @param TotalCount Total quantity of listeners that matches the conditions
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get TCP listener list 
     * @return ListenerSet TCP listener list
     */
    public TCPListener [] getListenerSet() {
        return this.ListenerSet;
    }

    /**
     * Set TCP listener list
     * @param ListenerSet TCP listener list
     */
    public void setListenerSet(TCPListener [] ListenerSet) {
        this.ListenerSet = ListenerSet;
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

    public DescribeTCPListenersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTCPListenersResponse(DescribeTCPListenersResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ListenerSet != null) {
            this.ListenerSet = new TCPListener[source.ListenerSet.length];
            for (int i = 0; i < source.ListenerSet.length; i++) {
                this.ListenerSet[i] = new TCPListener(source.ListenerSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ListenerSet.", this.ListenerSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

