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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrefetchOriginLimit extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Acceleration domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Specifies the acceleration region with origin-pull speed limit.
During preheating, the acceleration region will be subject to the configured Bandwidth value limit. valid values:.
<Li>Overseas: global availability zone (excluding the chinese mainland);</li>.
<Li>MainlandChina: chinese mainland availability zone.</li>.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Specifies the bandwidth limit for origin-pull.
Specifies the upper limit of bandwidth returning to the origin server during preheating. value ranges from 100 to 100,000 Mbps.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Describes the time when the origin-pull speed limit was created.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Describes the time when the origin-pull speed limit is updated.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Acceleration domain name. 
     * @return DomainName Acceleration domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Acceleration domain name.
     * @param DomainName Acceleration domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Specifies the acceleration region with origin-pull speed limit.
During preheating, the acceleration region will be subject to the configured Bandwidth value limit. valid values:.
<Li>Overseas: global availability zone (excluding the chinese mainland);</li>.
<Li>MainlandChina: chinese mainland availability zone.</li>. 
     * @return Area Specifies the acceleration region with origin-pull speed limit.
During preheating, the acceleration region will be subject to the configured Bandwidth value limit. valid values:.
<Li>Overseas: global availability zone (excluding the chinese mainland);</li>.
<Li>MainlandChina: chinese mainland availability zone.</li>.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Specifies the acceleration region with origin-pull speed limit.
During preheating, the acceleration region will be subject to the configured Bandwidth value limit. valid values:.
<Li>Overseas: global availability zone (excluding the chinese mainland);</li>.
<Li>MainlandChina: chinese mainland availability zone.</li>.
     * @param Area Specifies the acceleration region with origin-pull speed limit.
During preheating, the acceleration region will be subject to the configured Bandwidth value limit. valid values:.
<Li>Overseas: global availability zone (excluding the chinese mainland);</li>.
<Li>MainlandChina: chinese mainland availability zone.</li>.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Specifies the bandwidth limit for origin-pull.
Specifies the upper limit of bandwidth returning to the origin server during preheating. value ranges from 100 to 100,000 Mbps. 
     * @return Bandwidth Specifies the bandwidth limit for origin-pull.
Specifies the upper limit of bandwidth returning to the origin server during preheating. value ranges from 100 to 100,000 Mbps.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Specifies the bandwidth limit for origin-pull.
Specifies the upper limit of bandwidth returning to the origin server during preheating. value ranges from 100 to 100,000 Mbps.
     * @param Bandwidth Specifies the bandwidth limit for origin-pull.
Specifies the upper limit of bandwidth returning to the origin server during preheating. value ranges from 100 to 100,000 Mbps.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Describes the time when the origin-pull speed limit was created. 
     * @return CreateTime Describes the time when the origin-pull speed limit was created.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Describes the time when the origin-pull speed limit was created.
     * @param CreateTime Describes the time when the origin-pull speed limit was created.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Describes the time when the origin-pull speed limit is updated. 
     * @return UpdateTime Describes the time when the origin-pull speed limit is updated.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Describes the time when the origin-pull speed limit is updated.
     * @param UpdateTime Describes the time when the origin-pull speed limit is updated.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public PrefetchOriginLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrefetchOriginLimit(PrefetchOriginLimit source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

