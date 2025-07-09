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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckIntlDomainNewRequest extends AbstractModel {

    /**
    * The name of the domain to be checked.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Period, in years. If this parameter is left empty, premium domains cannot be queried.
    */
    @SerializedName("Period")
    @Expose
    private String Period;

    /**
     * Get The name of the domain to be checked. 
     * @return Domain The name of the domain to be checked.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The name of the domain to be checked.
     * @param Domain The name of the domain to be checked.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Period, in years. If this parameter is left empty, premium domains cannot be queried. 
     * @return Period Period, in years. If this parameter is left empty, premium domains cannot be queried.
     */
    public String getPeriod() {
        return this.Period;
    }

    /**
     * Set Period, in years. If this parameter is left empty, premium domains cannot be queried.
     * @param Period Period, in years. If this parameter is left empty, premium domains cannot be queried.
     */
    public void setPeriod(String Period) {
        this.Period = Period;
    }

    public CheckIntlDomainNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckIntlDomainNewRequest(CheckIntlDomainNewRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Period != null) {
            this.Period = new String(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

