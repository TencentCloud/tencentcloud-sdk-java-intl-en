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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccelerateAreaInfo extends AbstractModel{

    /**
    * Acceleration region. Valid values:
<li>Chinese Mainland</li>
<li>Outside Chinese Mainland</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Reason why acceleration is disabled by Tencent Cloud. Valid values:
<li>ForLegalReasons: legal reasons</li>
<li>ForOverdueBills: overdue payment</li>
    */
    @SerializedName("TencentDisableReason")
    @Expose
    private String TencentDisableReason;

    /**
    * CNAME of the acceleration domain name
    */
    @SerializedName("TencentEdgeDomain")
    @Expose
    private String TencentEdgeDomain;

    /**
     * Get Acceleration region. Valid values:
<li>Chinese Mainland</li>
<li>Outside Chinese Mainland</li> 
     * @return Area Acceleration region. Valid values:
<li>Chinese Mainland</li>
<li>Outside Chinese Mainland</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Acceleration region. Valid values:
<li>Chinese Mainland</li>
<li>Outside Chinese Mainland</li>
     * @param Area Acceleration region. Valid values:
<li>Chinese Mainland</li>
<li>Outside Chinese Mainland</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Reason why acceleration is disabled by Tencent Cloud. Valid values:
<li>ForLegalReasons: legal reasons</li>
<li>ForOverdueBills: overdue payment</li> 
     * @return TencentDisableReason Reason why acceleration is disabled by Tencent Cloud. Valid values:
<li>ForLegalReasons: legal reasons</li>
<li>ForOverdueBills: overdue payment</li>
     */
    public String getTencentDisableReason() {
        return this.TencentDisableReason;
    }

    /**
     * Set Reason why acceleration is disabled by Tencent Cloud. Valid values:
<li>ForLegalReasons: legal reasons</li>
<li>ForOverdueBills: overdue payment</li>
     * @param TencentDisableReason Reason why acceleration is disabled by Tencent Cloud. Valid values:
<li>ForLegalReasons: legal reasons</li>
<li>ForOverdueBills: overdue payment</li>
     */
    public void setTencentDisableReason(String TencentDisableReason) {
        this.TencentDisableReason = TencentDisableReason;
    }

    /**
     * Get CNAME of the acceleration domain name 
     * @return TencentEdgeDomain CNAME of the acceleration domain name
     */
    public String getTencentEdgeDomain() {
        return this.TencentEdgeDomain;
    }

    /**
     * Set CNAME of the acceleration domain name
     * @param TencentEdgeDomain CNAME of the acceleration domain name
     */
    public void setTencentEdgeDomain(String TencentEdgeDomain) {
        this.TencentEdgeDomain = TencentEdgeDomain;
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

