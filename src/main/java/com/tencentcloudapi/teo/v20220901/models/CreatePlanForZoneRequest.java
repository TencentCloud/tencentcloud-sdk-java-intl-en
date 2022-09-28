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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePlanForZoneRequest extends AbstractModel{

    /**
    * ID of the site.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Plan options available for purchase. Values:
<li>`sta`: Standard plan for global areas except Chinese mainland;</li>
<li>`sta_with_bot`: Standard plan for global areas except Chinese mainland, with extra bot management;</li>
<li>`sta_cm`: Standard plan for Chinese mainland;</li>
<li>`sta_cm_with_bot`: Standard plan for Chinese mainland, with extra bot management;</li>
<li>`ent`: Enterprise plan for global areas except Chinese mainland;</li>
<li>`ent_with_bot`: Enterprise plan for global areas except Chinese mainland, with extra bot management;</li>
<li>`ent_cm`: Enterprise plan for Chinese mainland;</li>
<li>`ent_cm_with_bot`: Enterprise plan for Chinese mainland, with extra bot management.</li>To get the available plan options for your account, view the output from <a href="https://tcloud4api.woa.com/document/product/1657/80124?!preview&!document=1">DescribeAvailablePlans</a>.
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
     * Get ID of the site. 
     * @return ZoneId ID of the site.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site.
     * @param ZoneId ID of the site.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Plan options available for purchase. Values:
<li>`sta`: Standard plan for global areas except Chinese mainland;</li>
<li>`sta_with_bot`: Standard plan for global areas except Chinese mainland, with extra bot management;</li>
<li>`sta_cm`: Standard plan for Chinese mainland;</li>
<li>`sta_cm_with_bot`: Standard plan for Chinese mainland, with extra bot management;</li>
<li>`ent`: Enterprise plan for global areas except Chinese mainland;</li>
<li>`ent_with_bot`: Enterprise plan for global areas except Chinese mainland, with extra bot management;</li>
<li>`ent_cm`: Enterprise plan for Chinese mainland;</li>
<li>`ent_cm_with_bot`: Enterprise plan for Chinese mainland, with extra bot management.</li>To get the available plan options for your account, view the output from <a href="https://tcloud4api.woa.com/document/product/1657/80124?!preview&!document=1">DescribeAvailablePlans</a>. 
     * @return PlanType Plan options available for purchase. Values:
<li>`sta`: Standard plan for global areas except Chinese mainland;</li>
<li>`sta_with_bot`: Standard plan for global areas except Chinese mainland, with extra bot management;</li>
<li>`sta_cm`: Standard plan for Chinese mainland;</li>
<li>`sta_cm_with_bot`: Standard plan for Chinese mainland, with extra bot management;</li>
<li>`ent`: Enterprise plan for global areas except Chinese mainland;</li>
<li>`ent_with_bot`: Enterprise plan for global areas except Chinese mainland, with extra bot management;</li>
<li>`ent_cm`: Enterprise plan for Chinese mainland;</li>
<li>`ent_cm_with_bot`: Enterprise plan for Chinese mainland, with extra bot management.</li>To get the available plan options for your account, view the output from <a href="https://tcloud4api.woa.com/document/product/1657/80124?!preview&!document=1">DescribeAvailablePlans</a>.
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set Plan options available for purchase. Values:
<li>`sta`: Standard plan for global areas except Chinese mainland;</li>
<li>`sta_with_bot`: Standard plan for global areas except Chinese mainland, with extra bot management;</li>
<li>`sta_cm`: Standard plan for Chinese mainland;</li>
<li>`sta_cm_with_bot`: Standard plan for Chinese mainland, with extra bot management;</li>
<li>`ent`: Enterprise plan for global areas except Chinese mainland;</li>
<li>`ent_with_bot`: Enterprise plan for global areas except Chinese mainland, with extra bot management;</li>
<li>`ent_cm`: Enterprise plan for Chinese mainland;</li>
<li>`ent_cm_with_bot`: Enterprise plan for Chinese mainland, with extra bot management.</li>To get the available plan options for your account, view the output from <a href="https://tcloud4api.woa.com/document/product/1657/80124?!preview&!document=1">DescribeAvailablePlans</a>.
     * @param PlanType Plan options available for purchase. Values:
<li>`sta`: Standard plan for global areas except Chinese mainland;</li>
<li>`sta_with_bot`: Standard plan for global areas except Chinese mainland, with extra bot management;</li>
<li>`sta_cm`: Standard plan for Chinese mainland;</li>
<li>`sta_cm_with_bot`: Standard plan for Chinese mainland, with extra bot management;</li>
<li>`ent`: Enterprise plan for global areas except Chinese mainland;</li>
<li>`ent_with_bot`: Enterprise plan for global areas except Chinese mainland, with extra bot management;</li>
<li>`ent_cm`: Enterprise plan for Chinese mainland;</li>
<li>`ent_cm_with_bot`: Enterprise plan for Chinese mainland, with extra bot management.</li>To get the available plan options for your account, view the output from <a href="https://tcloud4api.woa.com/document/product/1657/80124?!preview&!document=1">DescribeAvailablePlans</a>.
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

