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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessRegionsByDestRegionRequest extends AbstractModel {

    /**
    * Origin server region: the DescribeDestRegions API returns the value of `RegionId` field of `DestRegionSet`.
    */
    @SerializedName("DestRegion")
    @Expose
    private String DestRegion;

    /**
    * IP version. Valid values: `IPv4` (default), `IPv6`.
    */
    @SerializedName("IPAddressVersion")
    @Expose
    private String IPAddressVersion;

    /**
    * Package type of connection groups. Valid values: `Thunder` (general), `Accelerator` (specific for games), and `CrossBorder` (cross-MLC-border connection).
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
     * Get Origin server region: the DescribeDestRegions API returns the value of `RegionId` field of `DestRegionSet`. 
     * @return DestRegion Origin server region: the DescribeDestRegions API returns the value of `RegionId` field of `DestRegionSet`.
     */
    public String getDestRegion() {
        return this.DestRegion;
    }

    /**
     * Set Origin server region: the DescribeDestRegions API returns the value of `RegionId` field of `DestRegionSet`.
     * @param DestRegion Origin server region: the DescribeDestRegions API returns the value of `RegionId` field of `DestRegionSet`.
     */
    public void setDestRegion(String DestRegion) {
        this.DestRegion = DestRegion;
    }

    /**
     * Get IP version. Valid values: `IPv4` (default), `IPv6`. 
     * @return IPAddressVersion IP version. Valid values: `IPv4` (default), `IPv6`.
     */
    public String getIPAddressVersion() {
        return this.IPAddressVersion;
    }

    /**
     * Set IP version. Valid values: `IPv4` (default), `IPv6`.
     * @param IPAddressVersion IP version. Valid values: `IPv4` (default), `IPv6`.
     */
    public void setIPAddressVersion(String IPAddressVersion) {
        this.IPAddressVersion = IPAddressVersion;
    }

    /**
     * Get Package type of connection groups. Valid values: `Thunder` (general), `Accelerator` (specific for games), and `CrossBorder` (cross-MLC-border connection). 
     * @return PackageType Package type of connection groups. Valid values: `Thunder` (general), `Accelerator` (specific for games), and `CrossBorder` (cross-MLC-border connection).
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Package type of connection groups. Valid values: `Thunder` (general), `Accelerator` (specific for games), and `CrossBorder` (cross-MLC-border connection).
     * @param PackageType Package type of connection groups. Valid values: `Thunder` (general), `Accelerator` (specific for games), and `CrossBorder` (cross-MLC-border connection).
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    public DescribeAccessRegionsByDestRegionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessRegionsByDestRegionRequest(DescribeAccessRegionsByDestRegionRequest source) {
        if (source.DestRegion != null) {
            this.DestRegion = new String(source.DestRegion);
        }
        if (source.IPAddressVersion != null) {
            this.IPAddressVersion = new String(source.IPAddressVersion);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestRegion", this.DestRegion);
        this.setParamSimple(map, prefix + "IPAddressVersion", this.IPAddressVersion);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);

    }
}

