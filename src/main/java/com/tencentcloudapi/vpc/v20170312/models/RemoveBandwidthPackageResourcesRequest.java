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

public class RemoveBandwidthPackageResourcesRequest extends AbstractModel{

    /**
    * The unique ID of the bandwidth package, such as `bwp-xxxx`.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * The resource type. Valid values: `Address` and `LoadBalance`.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * The resource IP, such as `eip-xxxx` and `lb-xxxx`.
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
     * Get The unique ID of the bandwidth package, such as `bwp-xxxx`. 
     * @return BandwidthPackageId The unique ID of the bandwidth package, such as `bwp-xxxx`.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set The unique ID of the bandwidth package, such as `bwp-xxxx`.
     * @param BandwidthPackageId The unique ID of the bandwidth package, such as `bwp-xxxx`.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get The resource type. Valid values: `Address` and `LoadBalance`. 
     * @return ResourceType The resource type. Valid values: `Address` and `LoadBalance`.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set The resource type. Valid values: `Address` and `LoadBalance`.
     * @param ResourceType The resource type. Valid values: `Address` and `LoadBalance`.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get The resource IP, such as `eip-xxxx` and `lb-xxxx`. 
     * @return ResourceIds The resource IP, such as `eip-xxxx` and `lb-xxxx`.
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set The resource IP, such as `eip-xxxx` and `lb-xxxx`.
     * @param ResourceIds The resource IP, such as `eip-xxxx` and `lb-xxxx`.
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    public RemoveBandwidthPackageResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveBandwidthPackageResourcesRequest(RemoveBandwidthPackageResourcesRequest source) {
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);

    }
}

