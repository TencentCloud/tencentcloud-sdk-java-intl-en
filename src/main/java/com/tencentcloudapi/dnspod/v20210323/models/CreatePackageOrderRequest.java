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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePackageOrderRequest extends AbstractModel {

    /**
    * Domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Valid options for the package version are as follows:
DPG_PROFESSIONAL
DPG_ENTERPRISE
DPG_ULTIMATE
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
     * Get Domain 
     * @return Domain Domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain
     * @param Domain Domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Valid options for the package version are as follows:
DPG_PROFESSIONAL
DPG_ENTERPRISE
DPG_ULTIMATE 
     * @return Grade Valid options for the package version are as follows:
DPG_PROFESSIONAL
DPG_ENTERPRISE
DPG_ULTIMATE
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set Valid options for the package version are as follows:
DPG_PROFESSIONAL
DPG_ENTERPRISE
DPG_ULTIMATE
     * @param Grade Valid options for the package version are as follows:
DPG_PROFESSIONAL
DPG_ENTERPRISE
DPG_ULTIMATE
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public CreatePackageOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePackageOrderRequest(CreatePackageOrderRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Grade != null) {
            this.Grade = new String(source.Grade);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Grade", this.Grade);

    }
}

