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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeAnalysisInstanceVersionInfo extends AbstractModel {

    /**
    * <p>Grayscale ip for version upgrade</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>Grayscale port for version upgrade</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>Upgrade to a later version</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String EngineVersion;

    /**
    * <p>Grayscale event for instance upgrade</p><p>Unit: day</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
     * Get <p>Grayscale ip for version upgrade</p> 
     * @return Vip <p>Grayscale ip for version upgrade</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>Grayscale ip for version upgrade</p>
     * @param Vip <p>Grayscale ip for version upgrade</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>Grayscale port for version upgrade</p> 
     * @return Vport <p>Grayscale port for version upgrade</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>Grayscale port for version upgrade</p>
     * @param Vport <p>Grayscale port for version upgrade</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>Upgrade to a later version</p> 
     * @return EngineVersion <p>Upgrade to a later version</p>
     */
    public String getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>Upgrade to a later version</p>
     * @param EngineVersion <p>Upgrade to a later version</p>
     */
    public void setEngineVersion(String EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>Grayscale event for instance upgrade</p><p>Unit: day</p> 
     * @return ExpireTime <p>Grayscale event for instance upgrade</p><p>Unit: day</p>
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Grayscale event for instance upgrade</p><p>Unit: day</p>
     * @param ExpireTime <p>Grayscale event for instance upgrade</p><p>Unit: day</p>
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public UpgradeAnalysisInstanceVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeAnalysisInstanceVersionInfo(UpgradeAnalysisInstanceVersionInfo source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String(source.EngineVersion);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

