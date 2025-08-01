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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeakNetworkRegionInfo extends AbstractModel {

    /**
    * Region information
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Peak network set
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PeakNetworkSet")
    @Expose
    private PeakNetwork [] PeakNetworkSet;

    /**
     * Get Region information 
     * @return Region Region information
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region information
     * @param Region Region information
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Peak network set
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PeakNetworkSet Peak network set
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PeakNetwork [] getPeakNetworkSet() {
        return this.PeakNetworkSet;
    }

    /**
     * Set Peak network set
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PeakNetworkSet Peak network set
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPeakNetworkSet(PeakNetwork [] PeakNetworkSet) {
        this.PeakNetworkSet = PeakNetworkSet;
    }

    public PeakNetworkRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeakNetworkRegionInfo(PeakNetworkRegionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.PeakNetworkSet != null) {
            this.PeakNetworkSet = new PeakNetwork[source.PeakNetworkSet.length];
            for (int i = 0; i < source.PeakNetworkSet.length; i++) {
                this.PeakNetworkSet[i] = new PeakNetwork(source.PeakNetworkSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "PeakNetworkSet.", this.PeakNetworkSet);

    }
}

