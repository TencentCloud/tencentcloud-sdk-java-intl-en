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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostRiskLevelCount extends AbstractModel {

    /**
    * Host ID
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * Host name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Critical count
    */
    @SerializedName("SeriousCount")
    @Expose
    private Long SeriousCount;

    /**
    * High-risk count
    */
    @SerializedName("HighCount")
    @Expose
    private Long HighCount;

    /**
    * Number of medium-risk vulnerabilities
    */
    @SerializedName("MediumCount")
    @Expose
    private Long MediumCount;

    /**
    * Number of low-risk vulnerabilities
    */
    @SerializedName("LowCount")
    @Expose
    private Long LowCount;

    /**
     * Get Host ID 
     * @return HostId Host ID
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set Host ID
     * @param HostId Host ID
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get Host name 
     * @return HostName Host name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name
     * @param HostName Host name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Critical count 
     * @return SeriousCount Critical count
     */
    public Long getSeriousCount() {
        return this.SeriousCount;
    }

    /**
     * Set Critical count
     * @param SeriousCount Critical count
     */
    public void setSeriousCount(Long SeriousCount) {
        this.SeriousCount = SeriousCount;
    }

    /**
     * Get High-risk count 
     * @return HighCount High-risk count
     */
    public Long getHighCount() {
        return this.HighCount;
    }

    /**
     * Set High-risk count
     * @param HighCount High-risk count
     */
    public void setHighCount(Long HighCount) {
        this.HighCount = HighCount;
    }

    /**
     * Get Number of medium-risk vulnerabilities 
     * @return MediumCount Number of medium-risk vulnerabilities
     */
    public Long getMediumCount() {
        return this.MediumCount;
    }

    /**
     * Set Number of medium-risk vulnerabilities
     * @param MediumCount Number of medium-risk vulnerabilities
     */
    public void setMediumCount(Long MediumCount) {
        this.MediumCount = MediumCount;
    }

    /**
     * Get Number of low-risk vulnerabilities 
     * @return LowCount Number of low-risk vulnerabilities
     */
    public Long getLowCount() {
        return this.LowCount;
    }

    /**
     * Set Number of low-risk vulnerabilities
     * @param LowCount Number of low-risk vulnerabilities
     */
    public void setLowCount(Long LowCount) {
        this.LowCount = LowCount;
    }

    public HostRiskLevelCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostRiskLevelCount(HostRiskLevelCount source) {
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.SeriousCount != null) {
            this.SeriousCount = new Long(source.SeriousCount);
        }
        if (source.HighCount != null) {
            this.HighCount = new Long(source.HighCount);
        }
        if (source.MediumCount != null) {
            this.MediumCount = new Long(source.MediumCount);
        }
        if (source.LowCount != null) {
            this.LowCount = new Long(source.LowCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "SeriousCount", this.SeriousCount);
        this.setParamSimple(map, prefix + "HighCount", this.HighCount);
        this.setParamSimple(map, prefix + "MediumCount", this.MediumCount);
        this.setParamSimple(map, prefix + "LowCount", this.LowCount);

    }
}

