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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccelerateAreaInfo extends AbstractModel {

    /**
    * Acceleration region. Available values:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Tencent disable reason. Available values:
<li>ForLegalReasons: Acceleration disabled due to legal reasons;</li>
<li>ForOverdueBills: Acceleration is disabled due to service suspension for overdue payment.</li>
    */
    @SerializedName("TencentDisableReason")
    @Expose
    private String TencentDisableReason;

    /**
    * CNAME domain name corresponding to the acceleration domain.
    */
    @SerializedName("TencentEdgeDomain")
    @Expose
    private String TencentEdgeDomain;

    /**
     * Get Acceleration region. Available values:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li> 
     * @return Area Acceleration region. Available values:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration region. Available values:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
     * @param Area Acceleration region. Available values:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Tencent disable reason. Available values:
<li>ForLegalReasons: Acceleration disabled due to legal reasons;</li>
<li>ForOverdueBills: Acceleration is disabled due to service suspension for overdue payment.</li> 
     * @return TencentDisableReason Tencent disable reason. Available values:
<li>ForLegalReasons: Acceleration disabled due to legal reasons;</li>
<li>ForOverdueBills: Acceleration is disabled due to service suspension for overdue payment.</li>
     */
    public String getTencentDisableReason() {
        return this.TencentDisableReason;
    }

    /**
     * Set Tencent disable reason. Available values:
<li>ForLegalReasons: Acceleration disabled due to legal reasons;</li>
<li>ForOverdueBills: Acceleration is disabled due to service suspension for overdue payment.</li>
     * @param TencentDisableReason Tencent disable reason. Available values:
<li>ForLegalReasons: Acceleration disabled due to legal reasons;</li>
<li>ForOverdueBills: Acceleration is disabled due to service suspension for overdue payment.</li>
     */
    public void setTencentDisableReason(String TencentDisableReason) {
        this.TencentDisableReason = TencentDisableReason;
    }

    /**
     * Get CNAME domain name corresponding to the acceleration domain. 
     * @return TencentEdgeDomain CNAME domain name corresponding to the acceleration domain.
     */
    public String getTencentEdgeDomain() {
        return this.TencentEdgeDomain;
    }

    /**
     * Set CNAME domain name corresponding to the acceleration domain.
     * @param TencentEdgeDomain CNAME domain name corresponding to the acceleration domain.
     */
    public void setTencentEdgeDomain(String TencentEdgeDomain) {
        this.TencentEdgeDomain = TencentEdgeDomain;
    }

    public AccelerateAreaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccelerateAreaInfo(AccelerateAreaInfo source) {
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.TencentDisableReason != null) {
            this.TencentDisableReason = new String(source.TencentDisableReason);
        }
        if (source.TencentEdgeDomain != null) {
            this.TencentEdgeDomain = new String(source.TencentEdgeDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "TencentDisableReason", this.TencentDisableReason);
        this.setParamSimple(map, prefix + "TencentEdgeDomain", this.TencentEdgeDomain);

    }
}

