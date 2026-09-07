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

public class StandardPlusPackageConfig extends AbstractModel {

    /**
    * Specifies the region of the anti-ddos pro package.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Protection TIMES: TWO_TIMES: full protection twice. UNLIMITED: UNLIMITED protection.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProtectCount")
    @Expose
    private String ProtectCount;

    /**
    * Specifies the number of protected ips.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProtectIpCount")
    @Expose
    private Long ProtectIpCount;

    /**
    * Protection bandwidth is 50 Mbps.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Elastic scaling enabled for business bandwidth.
true: enabled.
Specifies whether the feature is disabled. valid values: false. 
Disabled by default.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ElasticBandwidthFlag")
    @Expose
    private Boolean ElasticBandwidthFlag;

    /**
     * Get Specifies the region of the anti-ddos pro package.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Specifies the region of the anti-ddos pro package.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Specifies the region of the anti-ddos pro package.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Specifies the region of the anti-ddos pro package.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Protection TIMES: TWO_TIMES: full protection twice. UNLIMITED: UNLIMITED protection.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProtectCount Protection TIMES: TWO_TIMES: full protection twice. UNLIMITED: UNLIMITED protection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProtectCount() {
        return this.ProtectCount;
    }

    /**
     * Set Protection TIMES: TWO_TIMES: full protection twice. UNLIMITED: UNLIMITED protection.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProtectCount Protection TIMES: TWO_TIMES: full protection twice. UNLIMITED: UNLIMITED protection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProtectCount(String ProtectCount) {
        this.ProtectCount = ProtectCount;
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
     * Get Protection bandwidth is 50 Mbps.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Bandwidth Protection bandwidth is 50 Mbps.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Protection bandwidth is 50 Mbps.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Bandwidth Protection bandwidth is 50 Mbps.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Elastic scaling enabled for business bandwidth.
true: enabled.
Specifies whether the feature is disabled. valid values: false. 
Disabled by default.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ElasticBandwidthFlag Elastic scaling enabled for business bandwidth.
true: enabled.
Specifies whether the feature is disabled. valid values: false. 
Disabled by default.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getElasticBandwidthFlag() {
        return this.ElasticBandwidthFlag;
    }

    /**
     * Set Elastic scaling enabled for business bandwidth.
true: enabled.
Specifies whether the feature is disabled. valid values: false. 
Disabled by default.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ElasticBandwidthFlag Elastic scaling enabled for business bandwidth.
true: enabled.
Specifies whether the feature is disabled. valid values: false. 
Disabled by default.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setElasticBandwidthFlag(Boolean ElasticBandwidthFlag) {
        this.ElasticBandwidthFlag = ElasticBandwidthFlag;
    }

    public StandardPlusPackageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandardPlusPackageConfig(StandardPlusPackageConfig source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ProtectCount != null) {
            this.ProtectCount = new String(source.ProtectCount);
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
        this.setParamSimple(map, prefix + "ProtectCount", this.ProtectCount);
        this.setParamSimple(map, prefix + "ProtectIpCount", this.ProtectIpCount);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "ElasticBandwidthFlag", this.ElasticBandwidthFlag);

    }
}

