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

public class DescribeAddableEntityListRequest extends AbstractModel{

    /**
    * ID of the site.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Type of the shipping entity. Values:
<li>`domain`: L7 acceleration logs;</li>
<li>`application`: L4 acceleration logs;</li>
<li>`web-rateLiming`: Rate limiting logs;</li>
<li>`web-attack`: Web security logs;</li>
<li>`web-rule`: Custom rule logs;</li>
<li>`web-bot`: Bot management logs.</li>
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * The service region. Values:
<li>`mainland`: Chinese mainland.</li>
<li>`overseas`: Regions outside the Chinese mainland.</li>For an account registered on the Chinese site, it defaults to `mainland`. For an account registered on the international site, it defaults to `overseas`.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

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
     * Get Type of the shipping entity. Values:
<li>`domain`: L7 acceleration logs;</li>
<li>`application`: L4 acceleration logs;</li>
<li>`web-rateLiming`: Rate limiting logs;</li>
<li>`web-attack`: Web security logs;</li>
<li>`web-rule`: Custom rule logs;</li>
<li>`web-bot`: Bot management logs.</li> 
     * @return EntityType Type of the shipping entity. Values:
<li>`domain`: L7 acceleration logs;</li>
<li>`application`: L4 acceleration logs;</li>
<li>`web-rateLiming`: Rate limiting logs;</li>
<li>`web-attack`: Web security logs;</li>
<li>`web-rule`: Custom rule logs;</li>
<li>`web-bot`: Bot management logs.</li>
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set Type of the shipping entity. Values:
<li>`domain`: L7 acceleration logs;</li>
<li>`application`: L4 acceleration logs;</li>
<li>`web-rateLiming`: Rate limiting logs;</li>
<li>`web-attack`: Web security logs;</li>
<li>`web-rule`: Custom rule logs;</li>
<li>`web-bot`: Bot management logs.</li>
     * @param EntityType Type of the shipping entity. Values:
<li>`domain`: L7 acceleration logs;</li>
<li>`application`: L4 acceleration logs;</li>
<li>`web-rateLiming`: Rate limiting logs;</li>
<li>`web-attack`: Web security logs;</li>
<li>`web-rule`: Custom rule logs;</li>
<li>`web-bot`: Bot management logs.</li>
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
    }

    /**
     * Get The service region. Values:
<li>`mainland`: Chinese mainland.</li>
<li>`overseas`: Regions outside the Chinese mainland.</li>For an account registered on the Chinese site, it defaults to `mainland`. For an account registered on the international site, it defaults to `overseas`. 
     * @return Area The service region. Values:
<li>`mainland`: Chinese mainland.</li>
<li>`overseas`: Regions outside the Chinese mainland.</li>For an account registered on the Chinese site, it defaults to `mainland`. For an account registered on the international site, it defaults to `overseas`.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set The service region. Values:
<li>`mainland`: Chinese mainland.</li>
<li>`overseas`: Regions outside the Chinese mainland.</li>For an account registered on the Chinese site, it defaults to `mainland`. For an account registered on the international site, it defaults to `overseas`.
     * @param Area The service region. Values:
<li>`mainland`: Chinese mainland.</li>
<li>`overseas`: Regions outside the Chinese mainland.</li>For an account registered on the Chinese site, it defaults to `mainland`. For an account registered on the international site, it defaults to `overseas`.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeAddableEntityListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAddableEntityListRequest(DescribeAddableEntityListRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

