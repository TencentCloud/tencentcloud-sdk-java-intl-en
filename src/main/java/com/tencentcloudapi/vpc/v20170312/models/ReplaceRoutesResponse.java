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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplaceRoutesResponse extends AbstractModel{

    /**
    * Old routing policy
    */
    @SerializedName("OldRouteSet")
    @Expose
    private Route [] OldRouteSet;

    /**
    * New routing policy
    */
    @SerializedName("NewRouteSet")
    @Expose
    private Route [] NewRouteSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Old routing policy 
     * @return OldRouteSet Old routing policy
     */
    public Route [] getOldRouteSet() {
        return this.OldRouteSet;
    }

    /**
     * Set Old routing policy
     * @param OldRouteSet Old routing policy
     */
    public void setOldRouteSet(Route [] OldRouteSet) {
        this.OldRouteSet = OldRouteSet;
    }

    /**
     * Get New routing policy 
     * @return NewRouteSet New routing policy
     */
    public Route [] getNewRouteSet() {
        return this.NewRouteSet;
    }

    /**
     * Set New routing policy
     * @param NewRouteSet New routing policy
     */
    public void setNewRouteSet(Route [] NewRouteSet) {
        this.NewRouteSet = NewRouteSet;
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

    public ReplaceRoutesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceRoutesResponse(ReplaceRoutesResponse source) {
        if (source.OldRouteSet != null) {
            this.OldRouteSet = new Route[source.OldRouteSet.length];
            for (int i = 0; i < source.OldRouteSet.length; i++) {
                this.OldRouteSet[i] = new Route(source.OldRouteSet[i]);
            }
        }
        if (source.NewRouteSet != null) {
            this.NewRouteSet = new Route[source.NewRouteSet.length];
            for (int i = 0; i < source.NewRouteSet.length; i++) {
                this.NewRouteSet[i] = new Route(source.NewRouteSet[i]);
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
        this.setParamArrayObj(map, prefix + "OldRouteSet.", this.OldRouteSet);
        this.setParamArrayObj(map, prefix + "NewRouteSet.", this.NewRouteSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

