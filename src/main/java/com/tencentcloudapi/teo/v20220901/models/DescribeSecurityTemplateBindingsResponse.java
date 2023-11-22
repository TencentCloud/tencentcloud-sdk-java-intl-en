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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityTemplateBindingsResponse extends AbstractModel {

    /**
    * Bindings of the specified policy template.

When a domain name of a site is bound with the specified policy template, `TemplateScope` includes the `ZoneId` of the related site and the bindings of the domain name. 

Note: If the template is not bound with any domain name, and there is not any existing binding, `TemplateScope=0` is returned.

In the binding list, the same domain name may appear repeatedly in the `EntityStatus` list with different `Status`. For example, when a domain name is being bound to another policy template, it's marked both `online` and `pending`.
    */
    @SerializedName("SecurityTemplate")
    @Expose
    private SecurityTemplateBinding [] SecurityTemplate;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Bindings of the specified policy template.

When a domain name of a site is bound with the specified policy template, `TemplateScope` includes the `ZoneId` of the related site and the bindings of the domain name. 

Note: If the template is not bound with any domain name, and there is not any existing binding, `TemplateScope=0` is returned.

In the binding list, the same domain name may appear repeatedly in the `EntityStatus` list with different `Status`. For example, when a domain name is being bound to another policy template, it's marked both `online` and `pending`. 
     * @return SecurityTemplate Bindings of the specified policy template.

When a domain name of a site is bound with the specified policy template, `TemplateScope` includes the `ZoneId` of the related site and the bindings of the domain name. 

Note: If the template is not bound with any domain name, and there is not any existing binding, `TemplateScope=0` is returned.

In the binding list, the same domain name may appear repeatedly in the `EntityStatus` list with different `Status`. For example, when a domain name is being bound to another policy template, it's marked both `online` and `pending`.
     */
    public SecurityTemplateBinding [] getSecurityTemplate() {
        return this.SecurityTemplate;
    }

    /**
     * Set Bindings of the specified policy template.

When a domain name of a site is bound with the specified policy template, `TemplateScope` includes the `ZoneId` of the related site and the bindings of the domain name. 

Note: If the template is not bound with any domain name, and there is not any existing binding, `TemplateScope=0` is returned.

In the binding list, the same domain name may appear repeatedly in the `EntityStatus` list with different `Status`. For example, when a domain name is being bound to another policy template, it's marked both `online` and `pending`.
     * @param SecurityTemplate Bindings of the specified policy template.

When a domain name of a site is bound with the specified policy template, `TemplateScope` includes the `ZoneId` of the related site and the bindings of the domain name. 

Note: If the template is not bound with any domain name, and there is not any existing binding, `TemplateScope=0` is returned.

In the binding list, the same domain name may appear repeatedly in the `EntityStatus` list with different `Status`. For example, when a domain name is being bound to another policy template, it's marked both `online` and `pending`.
     */
    public void setSecurityTemplate(SecurityTemplateBinding [] SecurityTemplate) {
        this.SecurityTemplate = SecurityTemplate;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSecurityTemplateBindingsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityTemplateBindingsResponse(DescribeSecurityTemplateBindingsResponse source) {
        if (source.SecurityTemplate != null) {
            this.SecurityTemplate = new SecurityTemplateBinding[source.SecurityTemplate.length];
            for (int i = 0; i < source.SecurityTemplate.length; i++) {
                this.SecurityTemplate[i] = new SecurityTemplateBinding(source.SecurityTemplate[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SecurityTemplate.", this.SecurityTemplate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

