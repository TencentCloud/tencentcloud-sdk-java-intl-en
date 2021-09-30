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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBlueprintInstancesResponse extends AbstractModel{

    /**
    * Number of eligible image instances.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Image instance list information.
    */
    @SerializedName("BlueprintInstanceSet")
    @Expose
    private BlueprintInstance [] BlueprintInstanceSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of eligible image instances. 
     * @return TotalCount Number of eligible image instances.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible image instances.
     * @param TotalCount Number of eligible image instances.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Image instance list information. 
     * @return BlueprintInstanceSet Image instance list information.
     */
    public BlueprintInstance [] getBlueprintInstanceSet() {
        return this.BlueprintInstanceSet;
    }

    /**
     * Set Image instance list information.
     * @param BlueprintInstanceSet Image instance list information.
     */
    public void setBlueprintInstanceSet(BlueprintInstance [] BlueprintInstanceSet) {
        this.BlueprintInstanceSet = BlueprintInstanceSet;
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

    public DescribeBlueprintInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBlueprintInstancesResponse(DescribeBlueprintInstancesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.BlueprintInstanceSet != null) {
            this.BlueprintInstanceSet = new BlueprintInstance[source.BlueprintInstanceSet.length];
            for (int i = 0; i < source.BlueprintInstanceSet.length; i++) {
                this.BlueprintInstanceSet[i] = new BlueprintInstance(source.BlueprintInstanceSet[i]);
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
        this.setParamArrayObj(map, prefix + "BlueprintInstanceSet.", this.BlueprintInstanceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

