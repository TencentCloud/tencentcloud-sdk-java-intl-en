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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillAreaInfo extends AbstractModel{

    /**
    * Region name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Detailed country information
    */
    @SerializedName("Countrys")
    @Expose
    private BillCountryInfo [] Countrys;

    /**
     * Get Region name 
     * @return Name Region name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Region name
     * @param Name Region name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Detailed country information 
     * @return Countrys Detailed country information
     */
    public BillCountryInfo [] getCountrys() {
        return this.Countrys;
    }

    /**
     * Set Detailed country information
     * @param Countrys Detailed country information
     */
    public void setCountrys(BillCountryInfo [] Countrys) {
        this.Countrys = Countrys;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Countrys.", this.Countrys);

    }
}

