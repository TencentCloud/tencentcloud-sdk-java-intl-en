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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostDetailInfo extends AbstractModel {

    /**
    * Type Family
    */
    @SerializedName("HostTypeFamily")
    @Expose
    private String HostTypeFamily;

    /**
    * Total CPU
    */
    @SerializedName("CpuTotal")
    @Expose
    private Float CpuTotal;

    /**
    * Available CPU
    */
    @SerializedName("CpuAvailable")
    @Expose
    private Float CpuAvailable;

    /**
    * Total Memory
    */
    @SerializedName("MemTotal")
    @Expose
    private Float MemTotal;

    /**
    * Available Memory
    */
    @SerializedName("MemAvailable")
    @Expose
    private Float MemAvailable;

    /**
     * Get Type Family 
     * @return HostTypeFamily Type Family
     */
    public String getHostTypeFamily() {
        return this.HostTypeFamily;
    }

    /**
     * Set Type Family
     * @param HostTypeFamily Type Family
     */
    public void setHostTypeFamily(String HostTypeFamily) {
        this.HostTypeFamily = HostTypeFamily;
    }

    /**
     * Get Total CPU 
     * @return CpuTotal Total CPU
     */
    public Float getCpuTotal() {
        return this.CpuTotal;
    }

    /**
     * Set Total CPU
     * @param CpuTotal Total CPU
     */
    public void setCpuTotal(Float CpuTotal) {
        this.CpuTotal = CpuTotal;
    }

    /**
     * Get Available CPU 
     * @return CpuAvailable Available CPU
     */
    public Float getCpuAvailable() {
        return this.CpuAvailable;
    }

    /**
     * Set Available CPU
     * @param CpuAvailable Available CPU
     */
    public void setCpuAvailable(Float CpuAvailable) {
        this.CpuAvailable = CpuAvailable;
    }

    /**
     * Get Total Memory 
     * @return MemTotal Total Memory
     */
    public Float getMemTotal() {
        return this.MemTotal;
    }

    /**
     * Set Total Memory
     * @param MemTotal Total Memory
     */
    public void setMemTotal(Float MemTotal) {
        this.MemTotal = MemTotal;
    }

    /**
     * Get Available Memory 
     * @return MemAvailable Available Memory
     */
    public Float getMemAvailable() {
        return this.MemAvailable;
    }

    /**
     * Set Available Memory
     * @param MemAvailable Available Memory
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

