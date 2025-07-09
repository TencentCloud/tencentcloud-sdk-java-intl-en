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

public class DeleteTrafficPackagesRequest extends AbstractModel {

    /**
    * The unique ID array of traffic packages to delete
    */
    @SerializedName("TrafficPackageIds")
    @Expose
    private String [] TrafficPackageIds;

    /**
     * Get The unique ID array of traffic packages to delete 
     * @return TrafficPackageIds The unique ID array of traffic packages to delete
     */
    public String [] getTrafficPackageIds() {
        return this.TrafficPackageIds;
    }

    /**
     * Set The unique ID array of traffic packages to delete
     * @param TrafficPackageIds The unique ID array of traffic packages to delete
     */
    public void setTrafficPackageIds(String [] TrafficPackageIds) {
        this.TrafficPackageIds = TrafficPackageIds;
    }

    public DeleteTrafficPackagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTrafficPackagesRequest(DeleteTrafficPackagesRequest source) {
        if (source.TrafficPackageIds != null) {
            this.TrafficPackageIds = new String[source.TrafficPackageIds.length];
            for (int i = 0; i < source.TrafficPackageIds.length; i++) {
                this.TrafficPackageIds[i] = new String(source.TrafficPackageIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TrafficPackageIds.", this.TrafficPackageIds);

    }
}

