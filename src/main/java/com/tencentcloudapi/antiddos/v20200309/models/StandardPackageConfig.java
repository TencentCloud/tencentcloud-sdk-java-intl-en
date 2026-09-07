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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StandardPackageConfig extends AbstractModel {

    /**
    * Specifies the purchase region of the anti-ddos pro package.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Specifies the number of protected ips.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProtectIpCount")
    @Expose
    private Long ProtectIpCount;

    /**
    * Specifies the protection business bandwidth of 50Mbps.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Specifies whether elastic protection bandwidth is enabled. valid values: enabled. 
The default is false. disable.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ElasticBandwidthFlag")
    @Expose
    private Boolean ElasticBandwidthFlag;

    /**
     * Get Specifies the purchase region of the anti-ddos pro package.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Specifies the purchase region of the anti-ddos pro package.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Specifies the purchase region of the anti-ddos pro package.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Specifies the purchase region of the anti-ddos pro package.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Specifies the number of protected ips.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProtectIpCount Specifies the number of protected ips.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getProtectIpCount() {
        return this.ProtectIpCount;
    }

    /**
     * Set Specifies the number of protected ips.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProtectIpCount Specifies the number of protected ips.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtectIpCount(Long ProtectIpCount) {
        this.ProtectIpCount = ProtectIpCount;
    }

    /**
     * Get Specifies the protection business bandwidth of 50Mbps.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Bandwidth Specifies the protection business bandwidth of 50Mbps.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Specifies the protection business bandwidth of 50Mbps.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Bandwidth Specifies the protection business bandwidth of 50Mbps.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Specifies whether elastic protection bandwidth is enabled. valid values: enabled. 
The default is false. disable.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ElasticBandwidthFlag Specifies whether elastic protection bandwidth is enabled. valid values: enabled. 
The default is false. disable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getElasticBandwidthFlag() {
        return this.ElasticBandwidthFlag;
    }

    /**
     * Set Specifies whether elastic protection bandwidth is enabled. valid values: enabled. 
The default is false. disable.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ElasticBandwidthFlag Specifies whether elastic protection bandwidth is enabled. valid values: enabled. 
The default is false. disable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setElasticBandwidthFlag(Boolean ElasticBandwidthFlag) {
        this.ElasticBandwidthFlag = ElasticBandwidthFlag;
    }

    public StandardPackageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandardPackageConfig(StandardPackageConfig source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ProtectIpCount != null) {
            this.ProtectIpCount = new Long(source.ProtectIpCount);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.ElasticBandwidthFlag != null) {
            this.ElasticBandwidthFlag = new Boolean(source.ElasticBandwidthFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ProtectIpCount", this.ProtectIpCount);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "ElasticBandwidthFlag", this.ElasticBandwidthFlag);

    }
}

