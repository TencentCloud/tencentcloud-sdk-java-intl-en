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

public class DescribeWebSecurityTemplateRequest extends AbstractModel {

    /**
    * Site ID. Requires the input of the site to which the target policy template belongs in terms of access privileges. You can use the DescribeWebSecurityTemplates API to query the site to which the policy template belongs.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Policy template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get Site ID. Requires the input of the site to which the target policy template belongs in terms of access privileges. You can use the DescribeWebSecurityTemplates API to query the site to which the policy template belongs. 
     * @return ZoneId Site ID. Requires the input of the site to which the target policy template belongs in terms of access privileges. You can use the DescribeWebSecurityTemplates API to query the site to which the policy template belongs.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID. Requires the input of the site to which the target policy template belongs in terms of access privileges. You can use the DescribeWebSecurityTemplates API to query the site to which the policy template belongs.
     * @param ZoneId Site ID. Requires the input of the site to which the target policy template belongs in terms of access privileges. You can use the DescribeWebSecurityTemplates API to query the site to which the policy template belongs.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Policy template ID. 
     * @return TemplateId Policy template ID.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Policy template ID.
     * @param TemplateId Policy template ID.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public DescribeWebSecurityTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebSecurityTemplateRequest(DescribeWebSecurityTemplateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

