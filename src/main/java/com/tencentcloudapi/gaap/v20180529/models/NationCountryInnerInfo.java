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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NationCountryInnerInfo extends AbstractModel {

    /**
    * Country name
    */
    @SerializedName("NationCountryName")
    @Expose
    private String NationCountryName;

    /**
    * Country internal code
    */
    @SerializedName("NationCountryInnerCode")
    @Expose
    private String NationCountryInnerCode;

    /**
     * Get Country name 
     * @return NationCountryName Country name
     */
    public String getNationCountryName() {
        return this.NationCountryName;
    }

    /**
     * Set Country name
     * @param NationCountryName Country name
     */
    public void setNationCountryName(String NationCountryName) {
        this.NationCountryName = NationCountryName;
    }

    /**
     * Get Country internal code 
     * @return NationCountryInnerCode Country internal code
     */
    public String getNationCountryInnerCode() {
        return this.NationCountryInnerCode;
    }

    /**
     * Set Country internal code
     * @param NationCountryInnerCode Country internal code
     */
    public void setNationCountryInnerCode(String NationCountryInnerCode) {
        this.NationCountryInnerCode = NationCountryInnerCode;
    }

    public NationCountryInnerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NationCountryInnerInfo(NationCountryInnerInfo source) {
        if (source.NationCountryName != null) {
            this.NationCountryName = new String(source.NationCountryName);
        }
        if (source.NationCountryInnerCode != null) {
            this.NationCountryInnerCode = new String(source.NationCountryInnerCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NationCountryName", this.NationCountryName);
        this.setParamSimple(map, prefix + "NationCountryInnerCode", this.NationCountryInnerCode);

    }
}

