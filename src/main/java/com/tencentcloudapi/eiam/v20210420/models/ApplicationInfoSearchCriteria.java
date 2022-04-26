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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationInfoSearchCriteria extends AbstractModel{

    /**
    * Application search keyword, which can be application name or ID.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Application type. Valid values: OAUTH2, JWT, CAS, SAML2, FORM, OIDC, APIGW
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
     * Get Application search keyword, which can be application name or ID. 
     * @return Keyword Application search keyword, which can be application name or ID.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Application search keyword, which can be application name or ID.
     * @param Keyword Application search keyword, which can be application name or ID.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Application type. Valid values: OAUTH2, JWT, CAS, SAML2, FORM, OIDC, APIGW 
     * @return ApplicationType Application type. Valid values: OAUTH2, JWT, CAS, SAML2, FORM, OIDC, APIGW
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Application type. Valid values: OAUTH2, JWT, CAS, SAML2, FORM, OIDC, APIGW
     * @param ApplicationType Application type. Valid values: OAUTH2, JWT, CAS, SAML2, FORM, OIDC, APIGW
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    public ApplicationInfoSearchCriteria() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationInfoSearchCriteria(ApplicationInfoSearchCriteria source) {
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);

    }
}

