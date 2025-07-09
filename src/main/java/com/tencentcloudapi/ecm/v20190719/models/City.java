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

public class City extends AbstractModel {

    /**
    * City ID
    */
    @SerializedName("CityId")
    @Expose
    private String CityId;

    /**
    * City name
    */
    @SerializedName("CityName")
    @Expose
    private String CityName;

    /**
     * Get City ID 
     * @return CityId City ID
     */
    public String getCityId() {
        return this.CityId;
    }

    /**
     * Set City ID
     * @param CityId City ID
     */
    public void setCityId(String CityId) {
        this.CityId = CityId;
    }

    /**
     * Get City name 
     * @return CityName City name
     */
    public String getCityName() {
        return this.CityName;
    }

    /**
     * Set City name
     * @param CityName City name
     */
    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public City() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public City(City source) {
        if (source.CityId != null) {
            this.CityId = new String(source.CityId);
        }
        if (source.CityName != null) {
            this.CityName = new String(source.CityName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CityId", this.CityId);
        this.setParamSimple(map, prefix + "CityName", this.CityName);

    }
}

