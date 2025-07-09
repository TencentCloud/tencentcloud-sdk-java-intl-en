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
package com.tencentcloudapi.ip.v20210409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CountryCodeItem extends AbstractModel {

    /**
    * Country/region name in English
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * Country/region name in Chinese
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * IOS2 standard country/region code
    */
    @SerializedName("IOS2")
    @Expose
    private String IOS2;

    /**
    * IOS3 standard country/region code
    */
    @SerializedName("IOS3")
    @Expose
    private String IOS3;

    /**
    * Phone code
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
     * Get Country/region name in English 
     * @return EnName Country/region name in English
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set Country/region name in English
     * @param EnName Country/region name in English
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get Country/region name in Chinese 
     * @return Name Country/region name in Chinese
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Country/region name in Chinese
     * @param Name Country/region name in Chinese
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get IOS2 standard country/region code 
     * @return IOS2 IOS2 standard country/region code
     */
    public String getIOS2() {
        return this.IOS2;
    }

    /**
     * Set IOS2 standard country/region code
     * @param IOS2 IOS2 standard country/region code
     */
    public void setIOS2(String IOS2) {
        this.IOS2 = IOS2;
    }

    /**
     * Get IOS3 standard country/region code 
     * @return IOS3 IOS3 standard country/region code
     */
    public String getIOS3() {
        return this.IOS3;
    }

    /**
     * Set IOS3 standard country/region code
     * @param IOS3 IOS3 standard country/region code
     */
    public void setIOS3(String IOS3) {
        this.IOS3 = IOS3;
    }

    /**
     * Get Phone code 
     * @return Code Phone code
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Phone code
     * @param Code Phone code
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    public CountryCodeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CountryCodeItem(CountryCodeItem source) {
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IOS2 != null) {
            this.IOS2 = new String(source.IOS2);
        }
        if (source.IOS3 != null) {
            this.IOS3 = new String(source.IOS3);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IOS2", this.IOS2);
        this.setParamSimple(map, prefix + "IOS3", this.IOS3);
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}

