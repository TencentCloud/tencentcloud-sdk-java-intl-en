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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostDetailInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("HostTypeFamily")
    @Expose
    private String HostTypeFamily;

    /**
    * 
    */
    @SerializedName("CpuTotal")
    @Expose
    private Float CpuTotal;

    /**
    * 
    */
    @SerializedName("CpuAvailable")
    @Expose
    private Float CpuAvailable;

    /**
    * 
    */
    @SerializedName("MemTotal")
    @Expose
    private Float MemTotal;

    /**
    * 
    */
    @SerializedName("MemAvailable")
    @Expose
    private Float MemAvailable;

    /**
     * Get  
     * @return HostTypeFamily 
     */
    public String getHostTypeFamily() {
        return this.HostTypeFamily;
    }

    /**
     * Set 
     * @param HostTypeFamily 
     */
    public void setHostTypeFamily(String HostTypeFamily) {
        this.HostTypeFamily = HostTypeFamily;
    }

    /**
     * Get  
     * @return CpuTotal 
     */
    public Float getCpuTotal() {
        return this.CpuTotal;
    }

    /**
     * Set 
     * @param CpuTotal 
     */
    public void setCpuTotal(Float CpuTotal) {
        this.CpuTotal = CpuTotal;
    }

    /**
     * Get  
     * @return CpuAvailable 
     */
    public Float getCpuAvailable() {
        return this.CpuAvailable;
    }

    /**
     * Set 
     * @param CpuAvailable 
     */
    public void setCpuAvailable(Float CpuAvailable) {
        this.CpuAvailable = CpuAvailable;
    }

    /**
     * Get  
     * @return MemTotal 
     */
    public Float getMemTotal() {
        return this.MemTotal;
    }

    /**
     * Set 
     * @param MemTotal 
     */
    public void setMemTotal(Float MemTotal) {
        this.MemTotal = MemTotal;
    }

    /**
     * Get  
     * @return MemAvailable 
     */
    public Float getMemAvailable() {
        return this.MemAvailable;
    }

    /**
     * Set 
     * @param MemAvailable 
     */
    public void setMemAvailable(Float MemAvailable) {
        this.MemAvailable = MemAvailable;
    }

    public HostDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostDetailInfo(HostDetailInfo source) {
        if (source.HostTypeFamily != null) {
            this.HostTypeFamily = new String(source.HostTypeFamily);
        }
        if (source.CpuTotal != null) {
            this.CpuTotal = new Float(source.CpuTotal);
        }
        if (source.CpuAvailable != null) {
            this.CpuAvailable = new Float(source.CpuAvailable);
        }
        if (source.MemTotal != null) {
            this.MemTotal = new Float(source.MemTotal);
        }
        if (source.MemAvailable != null) {
            this.MemAvailable = new Float(source.MemAvailable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostTypeFamily", this.HostTypeFamily);
        this.setParamSimple(map, prefix + "CpuTotal", this.CpuTotal);
        this.setParamSimple(map, prefix + "CpuAvailable", this.CpuAvailable);
        this.setParamSimple(map, prefix + "MemTotal", this.MemTotal);
        this.setParamSimple(map, prefix + "MemAvailable", this.MemAvailable);

    }
}

