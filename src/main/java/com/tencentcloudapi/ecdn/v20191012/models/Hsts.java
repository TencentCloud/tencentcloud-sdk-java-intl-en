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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Hsts extends AbstractModel{

    /**
    * 
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 
    */
    @SerializedName("MaxAge")
    @Expose
    private Long MaxAge;

    /**
    * 
    */
    @SerializedName("IncludeSubDomains")
    @Expose
    private String IncludeSubDomains;

    /**
     * Get  
     * @return Switch 
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 
     * @param Switch 
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get  
     * @return MaxAge 
     */
    public Long getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set 
     * @param MaxAge 
     */
    public void setMaxAge(Long MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get  
     * @return IncludeSubDomains 
     */
    public String getIncludeSubDomains() {
        return this.IncludeSubDomains;
    }

    /**
     * Set 
     * @param IncludeSubDomains 
     */
    public void setIncludeSubDomains(String IncludeSubDomains) {
        this.IncludeSubDomains = IncludeSubDomains;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "MaxAge", this.MaxAge);
        this.setParamSimple(map, prefix + "IncludeSubDomains", this.IncludeSubDomains);

    }
}

