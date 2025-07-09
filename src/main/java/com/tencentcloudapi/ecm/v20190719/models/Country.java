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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Country extends AbstractModel {

    /**
    * Country/Region ID
    */
    @SerializedName("CountryId")
    @Expose
    private String CountryId;

    /**
    * Country/Region name
    */
    @SerializedName("CountryName")
    @Expose
    private String CountryName;

    /**
     * Get Country/Region ID 
     * @return CountryId Country/Region ID
     */
    public String getCountryId() {
        return this.CountryId;
    }

    /**
     * Set Country/Region ID
     * @param CountryId Country/Region ID
     */
    public void setCountryId(String CountryId) {
        this.CountryId = CountryId;
    }

    /**
     * Get Country/Region name 
     * @return CountryName Country/Region name
     */
    public String getCountryName() {
        return this.CountryName;
    }

    /**
     * Set Country/Region name
     * @param CountryName Country/Region name
     */
    public void setCountryName(String CountryName) {
        this.CountryName = CountryName;
    }

    public Country() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Country(Country source) {
        if (source.CountryId != null) {
            this.CountryId = new String(source.CountryId);
        }
        if (source.CountryName != null) {
            this.CountryName = new String(source.CountryName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CountryId", this.CountryId);
        this.setParamSimple(map, prefix + "CountryName", this.CountryName);

    }
}

