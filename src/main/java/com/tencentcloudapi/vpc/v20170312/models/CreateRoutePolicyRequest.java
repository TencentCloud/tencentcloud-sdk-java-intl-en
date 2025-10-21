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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRoutePolicyRequest extends AbstractModel {

    /**
    * Routing policy description.
    */
    @SerializedName("RoutePolicyDescription")
    @Expose
    private String RoutePolicyDescription;

    /**
    * Specifies the routing strategy name.
    */
    @SerializedName("RoutePolicyName")
    @Expose
    private String RoutePolicyName;

    /**
    * Routing policy entry list.
    */
    @SerializedName("RoutePolicyEntrySet")
    @Expose
    private RoutePolicyEntry [] RoutePolicyEntrySet;

    /**
     * Get Routing policy description. 
     * @return RoutePolicyDescription Routing policy description.
     */
    public String getRoutePolicyDescription() {
        return this.RoutePolicyDescription;
    }

    /**
     * Set Routing policy description.
     * @param RoutePolicyDescription Routing policy description.
     */
    public void setRoutePolicyDescription(String RoutePolicyDescription) {
        this.RoutePolicyDescription = RoutePolicyDescription;
    }

    /**
     * Get Specifies the routing strategy name. 
     * @return RoutePolicyName Specifies the routing strategy name.
     */
    public String getRoutePolicyName() {
        return this.RoutePolicyName;
    }

    /**
     * Set Specifies the routing strategy name.
     * @param RoutePolicyName Specifies the routing strategy name.
     */
    public void setRoutePolicyName(String RoutePolicyName) {
        this.RoutePolicyName = RoutePolicyName;
    }

    /**
     * Get Routing policy entry list. 
     * @return RoutePolicyEntrySet Routing policy entry list.
     */
    public RoutePolicyEntry [] getRoutePolicyEntrySet() {
        return this.RoutePolicyEntrySet;
    }

    /**
     * Set Routing policy entry list.
     * @param RoutePolicyEntrySet Routing policy entry list.
     */
    public void setRoutePolicyEntrySet(RoutePolicyEntry [] RoutePolicyEntrySet) {
        this.RoutePolicyEntrySet = RoutePolicyEntrySet;
    }

    public CreateRoutePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoutePolicyRequest(CreateRoutePolicyRequest source) {
        if (source.RoutePolicyDescription != null) {
            this.RoutePolicyDescription = new String(source.RoutePolicyDescription);
        }
        if (source.RoutePolicyName != null) {
            this.RoutePolicyName = new String(source.RoutePolicyName);
        }
        if (source.RoutePolicyEntrySet != null) {
            this.RoutePolicyEntrySet = new RoutePolicyEntry[source.RoutePolicyEntrySet.length];
            for (int i = 0; i < source.RoutePolicyEntrySet.length; i++) {
                this.RoutePolicyEntrySet[i] = new RoutePolicyEntry(source.RoutePolicyEntrySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoutePolicyDescription", this.RoutePolicyDescription);
        this.setParamSimple(map, prefix + "RoutePolicyName", this.RoutePolicyName);
        this.setParamArrayObj(map, prefix + "RoutePolicyEntrySet.", this.RoutePolicyEntrySet);

    }
}

