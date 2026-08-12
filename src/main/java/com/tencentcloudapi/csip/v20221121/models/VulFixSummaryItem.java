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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulFixSummaryItem extends AbstractModel {

    /**
    * <p>Vulnerability ID</p>
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * <p>Vulnerability name</p>
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * <p>CVE id</p>
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
    * <p>Number of affected hosts</p>
    */
    @SerializedName("AffectedCount")
    @Expose
    private Long AffectedCount;

    /**
    * <p>Whether restart is required after repair</p>
    */
    @SerializedName("NeedReboot")
    @Expose
    private Boolean NeedReboot;

    /**
    * <p>Whether one-click repair is supported true-supported false-unsupported</p>
    */
    @SerializedName("FixSwitch")
    @Expose
    private Boolean FixSwitch;

    /**
     * Get <p>Vulnerability ID</p> 
     * @return VulId <p>Vulnerability ID</p>
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>Vulnerability ID</p>
     * @param VulId <p>Vulnerability ID</p>
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get <p>Vulnerability name</p> 
     * @return VulName <p>Vulnerability name</p>
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set <p>Vulnerability name</p>
     * @param VulName <p>Vulnerability name</p>
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get <p>CVE id</p> 
     * @return CveId <p>CVE id</p>
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set <p>CVE id</p>
     * @param CveId <p>CVE id</p>
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    /**
     * Get <p>Number of affected hosts</p> 
     * @return AffectedCount <p>Number of affected hosts</p>
     */
    public Long getAffectedCount() {
        return this.AffectedCount;
    }

    /**
     * Set <p>Number of affected hosts</p>
     * @param AffectedCount <p>Number of affected hosts</p>
     */
    public void setAffectedCount(Long AffectedCount) {
        this.AffectedCount = AffectedCount;
    }

    /**
     * Get <p>Whether restart is required after repair</p> 
     * @return NeedReboot <p>Whether restart is required after repair</p>
     */
    public Boolean getNeedReboot() {
        return this.NeedReboot;
    }

    /**
     * Set <p>Whether restart is required after repair</p>
     * @param NeedReboot <p>Whether restart is required after repair</p>
     */
    public void setNeedReboot(Boolean NeedReboot) {
        this.NeedReboot = NeedReboot;
    }

    /**
     * Get <p>Whether one-click repair is supported true-supported false-unsupported</p> 
     * @return FixSwitch <p>Whether one-click repair is supported true-supported false-unsupported</p>
     */
    public Boolean getFixSwitch() {
        return this.FixSwitch;
    }

    /**
     * Set <p>Whether one-click repair is supported true-supported false-unsupported</p>
     * @param FixSwitch <p>Whether one-click repair is supported true-supported false-unsupported</p>
     */
    public void setFixSwitch(Boolean FixSwitch) {
        this.FixSwitch = FixSwitch;
    }

    public VulFixSummaryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixSummaryItem(VulFixSummaryItem source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
        if (source.AffectedCount != null) {
            this.AffectedCount = new Long(source.AffectedCount);
        }
        if (source.NeedReboot != null) {
            this.NeedReboot = new Boolean(source.NeedReboot);
        }
        if (source.FixSwitch != null) {
            this.FixSwitch = new Boolean(source.FixSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "CveId", this.CveId);
        this.setParamSimple(map, prefix + "AffectedCount", this.AffectedCount);
        this.setParamSimple(map, prefix + "NeedReboot", this.NeedReboot);
        this.setParamSimple(map, prefix + "FixSwitch", this.FixSwitch);

    }
}

