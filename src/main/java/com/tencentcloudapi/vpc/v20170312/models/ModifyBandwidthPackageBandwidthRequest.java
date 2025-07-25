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

public class ModifyBandwidthPackageBandwidthRequest extends AbstractModel {

    /**
    * Maximum bandwidth. Unit: Mbps. 
    */
    @SerializedName("InternetMaxBandwidth")
    @Expose
    private Long InternetMaxBandwidth;

    /**
    * Bandwidth package ID.
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
     * Get Maximum bandwidth. Unit: Mbps.  
     * @return InternetMaxBandwidth Maximum bandwidth. Unit: Mbps. 
     */
    public Long getInternetMaxBandwidth() {
        return this.InternetMaxBandwidth;
    }

    /**
     * Set Maximum bandwidth. Unit: Mbps. 
     * @param InternetMaxBandwidth Maximum bandwidth. Unit: Mbps. 
     */
    public void setInternetMaxBandwidth(Long InternetMaxBandwidth) {
        this.InternetMaxBandwidth = InternetMaxBandwidth;
    }

    /**
     * Get Bandwidth package ID. 
     * @return BandwidthPackageId Bandwidth package ID.
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set Bandwidth package ID.
     * @param BandwidthPackageId Bandwidth package ID.
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    public ModifyBandwidthPackageBandwidthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBandwidthPackageBandwidthRequest(ModifyBandwidthPackageBandwidthRequest source) {
        if (source.InternetMaxBandwidth != null) {
            this.InternetMaxBandwidth = new Long(source.InternetMaxBandwidth);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetMaxBandwidth", this.InternetMaxBandwidth);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);

    }
}

