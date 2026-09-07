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

public class EnterprisePackageConfig extends AbstractModel {

    /**
    * Specifies the region of the anti-ddos pro package.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Number of protected ips.
    */
    @SerializedName("ProtectIpCount")
    @Expose
    private Long ProtectIpCount;

    /**
    * Specifies the baseline protection bandwidth.
    */
    @SerializedName("BasicProtectBandwidth")
    @Expose
    private Long BasicProtectBandwidth;

    /**
    * Business bandwidth scale.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Elastic bandwidth in Gbps. valid values: 0, 400, 500, 600, 800, 1000.
The default is 0.
    */
    @SerializedName("ElasticProtectBandwidth")
    @Expose
    private Long ElasticProtectBandwidth;

    /**
    * Elastic scaling enabled for business bandwidth.
The default is false.
    */
    @SerializedName("ElasticBandwidthFlag")
    @Expose
    private Boolean ElasticBandwidthFlag;

    /**
     * Get Specifies the region of the anti-ddos pro package. 
     * @return Region Specifies the region of the anti-ddos pro package.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Specifies the region of the anti-ddos pro package.
     * @param Region Specifies the region of the anti-ddos pro package.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Number of protected ips. 
     * @return ProtectIpCount Number of protected ips.
     */
    public Long getProtectIpCount() {
        return this.ProtectIpCount;
    }

    /**
     * Set Number of protected ips.
     * @param ProtectIpCount Number of protected ips.
     */
    public void setProtectIpCount(Long ProtectIpCount) {
        this.ProtectIpCount = ProtectIpCount;
    }

    /**
     * Get Specifies the baseline protection bandwidth. 
     * @return BasicProtectBandwidth Specifies the baseline protection bandwidth.
     */
    public Long getBasicProtectBandwidth() {
        return this.BasicProtectBandwidth;
    }

    /**
     * Set Specifies the baseline protection bandwidth.
     * @param BasicProtectBandwidth Specifies the baseline protection bandwidth.
     */
    public void setBasicProtectBandwidth(Long BasicProtectBandwidth) {
        this.BasicProtectBandwidth = BasicProtectBandwidth;
    }

    /**
     * Get Business bandwidth scale. 
     * @return Bandwidth Business bandwidth scale.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Business bandwidth scale.
     * @param Bandwidth Business bandwidth scale.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Elastic bandwidth in Gbps. valid values: 0, 400, 500, 600, 800, 1000.
The default is 0. 
     * @return ElasticProtectBandwidth Elastic bandwidth in Gbps. valid values: 0, 400, 500, 600, 800, 1000.
The default is 0.
     */
    public Long getElasticProtectBandwidth() {
        return this.ElasticProtectBandwidth;
    }

    /**
     * Set Elastic bandwidth in Gbps. valid values: 0, 400, 500, 600, 800, 1000.
The default is 0.
     * @param ElasticProtectBandwidth Elastic bandwidth in Gbps. valid values: 0, 400, 500, 600, 800, 1000.
The default is 0.
     */
    public void setElasticProtectBandwidth(Long ElasticProtectBandwidth) {
        this.ElasticProtectBandwidth = ElasticProtectBandwidth;
    }

    /**
     * Get Elastic scaling enabled for business bandwidth.
The default is false. 
     * @return ElasticBandwidthFlag Elastic scaling enabled for business bandwidth.
The default is false.
     */
    public Boolean getElasticBandwidthFlag() {
        return this.ElasticBandwidthFlag;
    }

    /**
     * Set Elastic scaling enabled for business bandwidth.
The default is false.
     * @param ElasticBandwidthFlag Elastic scaling enabled for business bandwidth.
The default is false.
     */
    public void setElasticBandwidthFlag(Boolean ElasticBandwidthFlag) {
        this.ElasticBandwidthFlag = ElasticBandwidthFlag;
    }

    public EnterprisePackageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnterprisePackageConfig(EnterprisePackageConfig source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ProtectIpCount != null) {
            this.ProtectIpCount = new Long(source.ProtectIpCount);
        }
        if (source.BasicProtectBandwidth != null) {
            this.BasicProtectBandwidth = new Long(source.BasicProtectBandwidth);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.ElasticProtectBandwidth != null) {
            this.ElasticProtectBandwidth = new Long(source.ElasticProtectBandwidth);
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
        this.setParamSimple(map, prefix + "BasicProtectBandwidth", this.BasicProtectBandwidth);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "ElasticProtectBandwidth", this.ElasticProtectBandwidth);
        this.setParamSimple(map, prefix + "ElasticBandwidthFlag", this.ElasticBandwidthFlag);

    }
}

