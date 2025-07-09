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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Load extends AbstractModel {

    /**
    * Load configuration.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("LoadSpec")
    @Expose
    private LoadSpec LoadSpec;

    /**
    * Stress source from vpc.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("VpcLoadDistribution")
    @Expose
    private VpcLoadDistribution VpcLoadDistribution;

    /**
    * Multi-region stress distribution.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("GeoRegionsLoadDistribution")
    @Expose
    private GeoRegionsLoadItem [] GeoRegionsLoadDistribution;

    /**
     * Get Load configuration.

Note: This field may return null, indicating that no valid value is found. 
     * @return LoadSpec Load configuration.

Note: This field may return null, indicating that no valid value is found.
     */
    public LoadSpec getLoadSpec() {
        return this.LoadSpec;
    }

    /**
     * Set Load configuration.

Note: This field may return null, indicating that no valid value is found.
     * @param LoadSpec Load configuration.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setLoadSpec(LoadSpec LoadSpec) {
        this.LoadSpec = LoadSpec;
    }

    /**
     * Get Stress source from vpc.

Note: This field may return null, indicating that no valid value is found. 
     * @return VpcLoadDistribution Stress source from vpc.

Note: This field may return null, indicating that no valid value is found.
     */
    public VpcLoadDistribution getVpcLoadDistribution() {
        return this.VpcLoadDistribution;
    }

    /**
     * Set Stress source from vpc.

Note: This field may return null, indicating that no valid value is found.
     * @param VpcLoadDistribution Stress source from vpc.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setVpcLoadDistribution(VpcLoadDistribution VpcLoadDistribution) {
        this.VpcLoadDistribution = VpcLoadDistribution;
    }

    /**
     * Get Multi-region stress distribution.

Note: This field may return null, indicating that no valid value is found. 
     * @return GeoRegionsLoadDistribution Multi-region stress distribution.

Note: This field may return null, indicating that no valid value is found.
     */
    public GeoRegionsLoadItem [] getGeoRegionsLoadDistribution() {
        return this.GeoRegionsLoadDistribution;
    }

    /**
     * Set Multi-region stress distribution.

Note: This field may return null, indicating that no valid value is found.
     * @param GeoRegionsLoadDistribution Multi-region stress distribution.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setGeoRegionsLoadDistribution(GeoRegionsLoadItem [] GeoRegionsLoadDistribution) {
        this.GeoRegionsLoadDistribution = GeoRegionsLoadDistribution;
    }

    public Load() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Load(Load source) {
        if (source.LoadSpec != null) {
            this.LoadSpec = new LoadSpec(source.LoadSpec);
        }
        if (source.VpcLoadDistribution != null) {
            this.VpcLoadDistribution = new VpcLoadDistribution(source.VpcLoadDistribution);
        }
        if (source.GeoRegionsLoadDistribution != null) {
            this.GeoRegionsLoadDistribution = new GeoRegionsLoadItem[source.GeoRegionsLoadDistribution.length];
            for (int i = 0; i < source.GeoRegionsLoadDistribution.length; i++) {
                this.GeoRegionsLoadDistribution[i] = new GeoRegionsLoadItem(source.GeoRegionsLoadDistribution[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LoadSpec.", this.LoadSpec);
        this.setParamObj(map, prefix + "VpcLoadDistribution.", this.VpcLoadDistribution);
        this.setParamArrayObj(map, prefix + "GeoRegionsLoadDistribution.", this.GeoRegionsLoadDistribution);

    }
}

