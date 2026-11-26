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

public class CreatePlanForZoneRequest extends AbstractModel {

    /**
    * Site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Type of the package to purchase. Valid values:
<li> sta: Global content delivery network (excluding Chinese mainland) Standard Edition Plan; </li>
<li> sta_with_bot: Standard Edition Plan of the global content delivery network (excluding Chinese mainland) with bundled bot management;</li>
<li> sta_cm: CDN Standard Edition Plan for the Chinese mainland; </li>
<li> sta_cm_with_bot: CDN Standard Edition Plan on the Chinese mainland with bundled bot management;</li>
<li> sta_global: Global content delivery network (including Chinese mainland) Standard Edition Plan; </li>
<li> sta_global_with_bot: Standard Edition Plan of global content delivery network (including Chinese mainland) with bundled bot management;</li>
<li> ent: Enterprise plan for global content delivery network (excluding Chinese mainland); </li>
<li> ent_with_bot: Enterprise package of global content delivery network (excluding Chinese mainland) with bundled bot management;</li>
<li> ent_cm: CDN enterprise plan for the Chinese mainland; </li>
<li> ent_cm_with_bot: CDN enterprise plan on the Chinese mainland with bundled bot management.</li>
<li> ent_global: Enterprise package for global content delivery network (including Chinese mainland); </li>
<li> ent_global_with_bot: Enterprise package of global content delivery network (including Chinese mainland) with bundled bot management.</li>For the package types available for the current account, refer to the response of <a href="https://www.tencentcloud.com/document/product/1552/80606?from_cn_redirect=1">DescribeAvailablePlans</a>.
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
     * Get Site ID. 
     * @return ZoneId Site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID.
     * @param ZoneId Site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Type of the package to purchase. Valid values:
<li> sta: Global content delivery network (excluding Chinese mainland) Standard Edition Plan; </li>
<li> sta_with_bot: Standard Edition Plan of the global content delivery network (excluding Chinese mainland) with bundled bot management;</li>
<li> sta_cm: CDN Standard Edition Plan for the Chinese mainland; </li>
<li> sta_cm_with_bot: CDN Standard Edition Plan on the Chinese mainland with bundled bot management;</li>
<li> sta_global: Global content delivery network (including Chinese mainland) Standard Edition Plan; </li>
<li> sta_global_with_bot: Standard Edition Plan of global content delivery network (including Chinese mainland) with bundled bot management;</li>
<li> ent: Enterprise plan for global content delivery network (excluding Chinese mainland); </li>
<li> ent_with_bot: Enterprise package of global content delivery network (excluding Chinese mainland) with bundled bot management;</li>
<li> ent_cm: CDN enterprise plan for the Chinese mainland; </li>
<li> ent_cm_with_bot: CDN enterprise plan on the Chinese mainland with bundled bot management.</li>
<li> ent_global: Enterprise package for global content delivery network (including Chinese mainland); </li>
<li> ent_global_with_bot: Enterprise package of global content delivery network (including Chinese mainland) with bundled bot management.</li>For the package types available for the current account, refer to the response of <a href="https://www.tencentcloud.com/document/product/1552/80606?from_cn_redirect=1">DescribeAvailablePlans</a>. 
     * @return PlanType Type of the package to purchase. Valid values:
<li> sta: Global content delivery network (excluding Chinese mainland) Standard Edition Plan; </li>
<li> sta_with_bot: Standard Edition Plan of the global content delivery network (excluding Chinese mainland) with bundled bot management;</li>
<li> sta_cm: CDN Standard Edition Plan for the Chinese mainland; </li>
<li> sta_cm_with_bot: CDN Standard Edition Plan on the Chinese mainland with bundled bot management;</li>
<li> sta_global: Global content delivery network (including Chinese mainland) Standard Edition Plan; </li>
<li> sta_global_with_bot: Standard Edition Plan of global content delivery network (including Chinese mainland) with bundled bot management;</li>
<li> ent: Enterprise plan for global content delivery network (excluding Chinese mainland); </li>
<li> ent_with_bot: Enterprise package of global content delivery network (excluding Chinese mainland) with bundled bot management;</li>
<li> ent_cm: CDN enterprise plan for the Chinese mainland; </li>
<li> ent_cm_with_bot: CDN enterprise plan on the Chinese mainland with bundled bot management.</li>
<li> ent_global: Enterprise package for global content delivery network (including Chinese mainland); </li>
<li> ent_global_with_bot: Enterprise package of global content delivery network (including Chinese mainland) with bundled bot management.</li>For the package types available for the current account, refer to the response of <a href="https://www.tencentcloud.com/document/product/1552/80606?from_cn_redirect=1">DescribeAvailablePlans</a>.
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set Type of the package to purchase. Valid values:
<li> sta: Global content delivery network (excluding Chinese mainland) Standard Edition Plan; </li>
<li> sta_with_bot: Standard Edition Plan of the global content delivery network (excluding Chinese mainland) with bundled bot management;</li>
<li> sta_cm: CDN Standard Edition Plan for the Chinese mainland; </li>
<li> sta_cm_with_bot: CDN Standard Edition Plan on the Chinese mainland with bundled bot management;</li>
<li> sta_global: Global content delivery network (including Chinese mainland) Standard Edition Plan; </li>
<li> sta_global_with_bot: Standard Edition Plan of global content delivery network (including Chinese mainland) with bundled bot management;</li>
<li> ent: Enterprise plan for global content delivery network (excluding Chinese mainland); </li>
<li> ent_with_bot: Enterprise package of global content delivery network (excluding Chinese mainland) with bundled bot management;</li>
<li> ent_cm: CDN enterprise plan for the Chinese mainland; </li>
<li> ent_cm_with_bot: CDN enterprise plan on the Chinese mainland with bundled bot management.</li>
<li> ent_global: Enterprise package for global content delivery network (including Chinese mainland); </li>
<li> ent_global_with_bot: Enterprise package of global content delivery network (including Chinese mainland) with bundled bot management.</li>For the package types available for the current account, refer to the response of <a href="https://www.tencentcloud.com/document/product/1552/80606?from_cn_redirect=1">DescribeAvailablePlans</a>.
     * @param PlanType Type of the package to purchase. Valid values:
<li> sta: Global content delivery network (excluding Chinese mainland) Standard Edition Plan; </li>
<li> sta_with_bot: Standard Edition Plan of the global content delivery network (excluding Chinese mainland) with bundled bot management;</li>
<li> sta_cm: CDN Standard Edition Plan for the Chinese mainland; </li>
<li> sta_cm_with_bot: CDN Standard Edition Plan on the Chinese mainland with bundled bot management;</li>
<li> sta_global: Global content delivery network (including Chinese mainland) Standard Edition Plan; </li>
<li> sta_global_with_bot: Standard Edition Plan of global content delivery network (including Chinese mainland) with bundled bot management;</li>
<li> ent: Enterprise plan for global content delivery network (excluding Chinese mainland); </li>
<li> ent_with_bot: Enterprise package of global content delivery network (excluding Chinese mainland) with bundled bot management;</li>
<li> ent_cm: CDN enterprise plan for the Chinese mainland; </li>
<li> ent_cm_with_bot: CDN enterprise plan on the Chinese mainland with bundled bot management.</li>
<li> ent_global: Enterprise package for global content delivery network (including Chinese mainland); </li>
<li> ent_global_with_bot: Enterprise package of global content delivery network (including Chinese mainland) with bundled bot management.</li>For the package types available for the current account, refer to the response of <a href="https://www.tencentcloud.com/document/product/1552/80606?from_cn_redirect=1">DescribeAvailablePlans</a>.
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    public CreatePlanForZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePlanForZoneRequest(CreatePlanForZoneRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.PlanType != null) {
            this.PlanType = new String(source.PlanType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);

    }
}

