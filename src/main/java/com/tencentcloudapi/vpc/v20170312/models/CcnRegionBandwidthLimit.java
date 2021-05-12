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

public class CcnRegionBandwidthLimit extends AbstractModel{

    /**
    * Region, such as `ap-guangzhou`
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * The outbound bandwidth cap. Units: Mbps
    */
    @SerializedName("BandwidthLimit")
    @Expose
    private Long BandwidthLimit;

    /**
    * Whether it is a BM region. The default is `false`.
    */
    @SerializedName("IsBm")
    @Expose
    private Boolean IsBm;

    /**
    * The target region, such as `ap-shanghai`
Note: This field may return null, indicating no valid value.
    */
    @SerializedName("DstRegion")
    @Expose
    private String DstRegion;

    /**
    * Whether the target region is a BM region. The default is `false`.
    */
    @SerializedName("DstIsBm")
    @Expose
    private Boolean DstIsBm;

    /**
     * Get Region, such as `ap-guangzhou` 
     * @return Region Region, such as `ap-guangzhou`
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region, such as `ap-guangzhou`
     * @param Region Region, such as `ap-guangzhou`
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get The outbound bandwidth cap. Units: Mbps 
     * @return BandwidthLimit The outbound bandwidth cap. Units: Mbps
     */
    public Long getBandwidthLimit() {
        return this.BandwidthLimit;
    }

    /**
     * Set The outbound bandwidth cap. Units: Mbps
     * @param BandwidthLimit The outbound bandwidth cap. Units: Mbps
     */
    public void setBandwidthLimit(Long BandwidthLimit) {
        this.BandwidthLimit = BandwidthLimit;
    }

    /**
     * Get Whether it is a BM region. The default is `false`. 
     * @return IsBm Whether it is a BM region. The default is `false`.
     */
    public Boolean getIsBm() {
        return this.IsBm;
    }

    /**
     * Set Whether it is a BM region. The default is `false`.
     * @param IsBm Whether it is a BM region. The default is `false`.
     */
    public void setIsBm(Boolean IsBm) {
        this.IsBm = IsBm;
    }

    /**
     * Get The target region, such as `ap-shanghai`
Note: This field may return null, indicating no valid value. 
     * @return DstRegion The target region, such as `ap-shanghai`
Note: This field may return null, indicating no valid value.
     */
    public String getDstRegion() {
        return this.DstRegion;
    }

    /**
     * Set The target region, such as `ap-shanghai`
Note: This field may return null, indicating no valid value.
     * @param DstRegion The target region, such as `ap-shanghai`
Note: This field may return null, indicating no valid value.
     */
    public void setDstRegion(String DstRegion) {
        this.DstRegion = DstRegion;
    }

    /**
     * Get Whether the target region is a BM region. The default is `false`. 
     * @return DstIsBm Whether the target region is a BM region. The default is `false`.
     */
    public Boolean getDstIsBm() {
        return this.DstIsBm;
    }

    /**
     * Set Whether the target region is a BM region. The default is `false`.
     * @param DstIsBm Whether the target region is a BM region. The default is `false`.
     */
    public void setDstIsBm(Boolean DstIsBm) {
        this.DstIsBm = DstIsBm;
    }

    public CcnRegionBandwidthLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnRegionBandwidthLimit(CcnRegionBandwidthLimit source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.BandwidthLimit != null) {
            this.BandwidthLimit = new Long(source.BandwidthLimit);
        }
        if (source.IsBm != null) {
            this.IsBm = new Boolean(source.IsBm);
        }
        if (source.DstRegion != null) {
            this.DstRegion = new String(source.DstRegion);
        }
        if (source.DstIsBm != null) {
            this.DstIsBm = new Boolean(source.DstIsBm);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BandwidthLimit", this.BandwidthLimit);
        this.setParamSimple(map, prefix + "IsBm", this.IsBm);
        this.setParamSimple(map, prefix + "DstRegion", this.DstRegion);
        this.setParamSimple(map, prefix + "DstIsBm", this.DstIsBm);

    }
}

