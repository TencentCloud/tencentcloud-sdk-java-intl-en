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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMountTargetsResponse extends AbstractModel {

    /**
    * Mount target details
    */
    @SerializedName("MountTargets")
    @Expose
    private MountInfo [] MountTargets;

    /**
    * The number of mount targets
    */
    @SerializedName("NumberOfMountTargets")
    @Expose
    private Long NumberOfMountTargets;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Mount target details 
     * @return MountTargets Mount target details
     */
    public MountInfo [] getMountTargets() {
        return this.MountTargets;
    }

    /**
     * Set Mount target details
     * @param MountTargets Mount target details
     */
    public void setMountTargets(MountInfo [] MountTargets) {
        this.MountTargets = MountTargets;
    }

    /**
     * Get The number of mount targets 
     * @return NumberOfMountTargets The number of mount targets
     */
    public Long getNumberOfMountTargets() {
        return this.NumberOfMountTargets;
    }

    /**
     * Set The number of mount targets
     * @param NumberOfMountTargets The number of mount targets
     */
    public void setNumberOfMountTargets(Long NumberOfMountTargets) {
        this.NumberOfMountTargets = NumberOfMountTargets;
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

    public DescribeMountTargetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMountTargetsResponse(DescribeMountTargetsResponse source) {
        if (source.MountTargets != null) {
            this.MountTargets = new MountInfo[source.MountTargets.length];
            for (int i = 0; i < source.MountTargets.length; i++) {
                this.MountTargets[i] = new MountInfo(source.MountTargets[i]);
            }
        }
        if (source.NumberOfMountTargets != null) {
            this.NumberOfMountTargets = new Long(source.NumberOfMountTargets);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MountTargets.", this.MountTargets);
        this.setParamSimple(map, prefix + "NumberOfMountTargets", this.NumberOfMountTargets);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

