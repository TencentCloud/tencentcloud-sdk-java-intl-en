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

public class ModifyProtectionSetting extends AbstractModel {

    /**
    * Unique asset ID.
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * Master switch. Valid values: 0 (disabled) and 1 (enabled).
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * Vulnerability defense switch. Valid values: 0 (disabled) and 1 (enabled).
    */
    @SerializedName("VulDefEnable")
    @Expose
    private Long VulDefEnable;

    /**
    * Vulnerability defense mode. Valid values: 0 (standard) and 1 (major event protection).
    */
    @SerializedName("VulDefMode")
    @Expose
    private Long VulDefMode;

    /**
    * Vulnerability defense action. Valid values: 0 (detection only) and 1 (detection and prevention).
    */
    @SerializedName("VulDefAction")
    @Expose
    private Long VulDefAction;

    /**
    * In-memory webshell defense switch. Valid values: 0 (disabled) and 1 (enabled).
    */
    @SerializedName("MemShellDefEnable")
    @Expose
    private Long MemShellDefEnable;

    /**
    * Performance limit switch. Valid values: 0 (disabled) and 1 (enabled).
    */
    @SerializedName("PerformanceLimit")
    @Expose
    private Long PerformanceLimit;

    /**
    * CPU threshold. Value range: 1–99.
    */
    @SerializedName("PerformanceLimitCpu")
    @Expose
    private Long PerformanceLimitCpu;

    /**
    * Memory threshold. Value range: 1–99.
    */
    @SerializedName("PerformanceLimitMem")
    @Expose
    private Long PerformanceLimitMem;

    /**
    * Remaining memory threshold.
    */
    @SerializedName("PerformanceLimitMemAmount")
    @Expose
    private Long PerformanceLimitMemAmount;

    /**
    * Additional protection. Valid values: 0 (do not inject into processes that will restart) and 1 (inject into processes that will restart).
    */
    @SerializedName("SafeInject")
    @Expose
    private Long SafeInject;

    /**
     * Get Unique asset ID. 
     * @return QUUID Unique asset ID.
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set Unique asset ID.
     * @param QUUID Unique asset ID.
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get Master switch. Valid values: 0 (disabled) and 1 (enabled). 
     * @return Enable Master switch. Valid values: 0 (disabled) and 1 (enabled).
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Master switch. Valid values: 0 (disabled) and 1 (enabled).
     * @param Enable Master switch. Valid values: 0 (disabled) and 1 (enabled).
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Vulnerability defense switch. Valid values: 0 (disabled) and 1 (enabled). 
     * @return VulDefEnable Vulnerability defense switch. Valid values: 0 (disabled) and 1 (enabled).
     */
    public Long getVulDefEnable() {
        return this.VulDefEnable;
    }

    /**
     * Set Vulnerability defense switch. Valid values: 0 (disabled) and 1 (enabled).
     * @param VulDefEnable Vulnerability defense switch. Valid values: 0 (disabled) and 1 (enabled).
     */
    public void setVulDefEnable(Long VulDefEnable) {
        this.VulDefEnable = VulDefEnable;
    }

    /**
     * Get Vulnerability defense mode. Valid values: 0 (standard) and 1 (major event protection). 
     * @return VulDefMode Vulnerability defense mode. Valid values: 0 (standard) and 1 (major event protection).
     */
    public Long getVulDefMode() {
        return this.VulDefMode;
    }

    /**
     * Set Vulnerability defense mode. Valid values: 0 (standard) and 1 (major event protection).
     * @param VulDefMode Vulnerability defense mode. Valid values: 0 (standard) and 1 (major event protection).
     */
    public void setVulDefMode(Long VulDefMode) {
        this.VulDefMode = VulDefMode;
    }

    /**
     * Get Vulnerability defense action. Valid values: 0 (detection only) and 1 (detection and prevention). 
     * @return VulDefAction Vulnerability defense action. Valid values: 0 (detection only) and 1 (detection and prevention).
     */
    public Long getVulDefAction() {
        return this.VulDefAction;
    }

    /**
     * Set Vulnerability defense action. Valid values: 0 (detection only) and 1 (detection and prevention).
     * @param VulDefAction Vulnerability defense action. Valid values: 0 (detection only) and 1 (detection and prevention).
     */
    public void setVulDefAction(Long VulDefAction) {
        this.VulDefAction = VulDefAction;
    }

    /**
     * Get In-memory webshell defense switch. Valid values: 0 (disabled) and 1 (enabled). 
     * @return MemShellDefEnable In-memory webshell defense switch. Valid values: 0 (disabled) and 1 (enabled).
     */
    public Long getMemShellDefEnable() {
        return this.MemShellDefEnable;
    }

    /**
     * Set In-memory webshell defense switch. Valid values: 0 (disabled) and 1 (enabled).
     * @param MemShellDefEnable In-memory webshell defense switch. Valid values: 0 (disabled) and 1 (enabled).
     */
    public void setMemShellDefEnable(Long MemShellDefEnable) {
        this.MemShellDefEnable = MemShellDefEnable;
    }

    /**
     * Get Performance limit switch. Valid values: 0 (disabled) and 1 (enabled). 
     * @return PerformanceLimit Performance limit switch. Valid values: 0 (disabled) and 1 (enabled).
     */
    public Long getPerformanceLimit() {
        return this.PerformanceLimit;
    }

    /**
     * Set Performance limit switch. Valid values: 0 (disabled) and 1 (enabled).
     * @param PerformanceLimit Performance limit switch. Valid values: 0 (disabled) and 1 (enabled).
     */
    public void setPerformanceLimit(Long PerformanceLimit) {
        this.PerformanceLimit = PerformanceLimit;
    }

    /**
     * Get CPU threshold. Value range: 1–99. 
     * @return PerformanceLimitCpu CPU threshold. Value range: 1–99.
     */
    public Long getPerformanceLimitCpu() {
        return this.PerformanceLimitCpu;
    }

    /**
     * Set CPU threshold. Value range: 1–99.
     * @param PerformanceLimitCpu CPU threshold. Value range: 1–99.
     */
    public void setPerformanceLimitCpu(Long PerformanceLimitCpu) {
        this.PerformanceLimitCpu = PerformanceLimitCpu;
    }

    /**
     * Get Memory threshold. Value range: 1–99. 
     * @return PerformanceLimitMem Memory threshold. Value range: 1–99.
     */
    public Long getPerformanceLimitMem() {
        return this.PerformanceLimitMem;
    }

    /**
     * Set Memory threshold. Value range: 1–99.
     * @param PerformanceLimitMem Memory threshold. Value range: 1–99.
     */
    public void setPerformanceLimitMem(Long PerformanceLimitMem) {
        this.PerformanceLimitMem = PerformanceLimitMem;
    }

    /**
     * Get Remaining memory threshold. 
     * @return PerformanceLimitMemAmount Remaining memory threshold.
     */
    public Long getPerformanceLimitMemAmount() {
        return this.PerformanceLimitMemAmount;
    }

    /**
     * Set Remaining memory threshold.
     * @param PerformanceLimitMemAmount Remaining memory threshold.
     */
    public void setPerformanceLimitMemAmount(Long PerformanceLimitMemAmount) {
        this.PerformanceLimitMemAmount = PerformanceLimitMemAmount;
    }

    /**
     * Get Additional protection. Valid values: 0 (do not inject into processes that will restart) and 1 (inject into processes that will restart). 
     * @return SafeInject Additional protection. Valid values: 0 (do not inject into processes that will restart) and 1 (inject into processes that will restart).
     */
    public Long getSafeInject() {
        return this.SafeInject;
    }

    /**
     * Set Additional protection. Valid values: 0 (do not inject into processes that will restart) and 1 (inject into processes that will restart).
     * @param SafeInject Additional protection. Valid values: 0 (do not inject into processes that will restart) and 1 (inject into processes that will restart).
     */
    public void setSafeInject(Long SafeInject) {
        this.SafeInject = SafeInject;
    }

    public ModifyProtectionSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProtectionSetting(ModifyProtectionSetting source) {
        if (source.QUUID != null) {
            this.QUUID = new String(source.QUUID);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.VulDefEnable != null) {
            this.VulDefEnable = new Long(source.VulDefEnable);
        }
        if (source.VulDefMode != null) {
            this.VulDefMode = new Long(source.VulDefMode);
        }
        if (source.VulDefAction != null) {
            this.VulDefAction = new Long(source.VulDefAction);
        }
        if (source.MemShellDefEnable != null) {
            this.MemShellDefEnable = new Long(source.MemShellDefEnable);
        }
        if (source.PerformanceLimit != null) {
            this.PerformanceLimit = new Long(source.PerformanceLimit);
        }
        if (source.PerformanceLimitCpu != null) {
            this.PerformanceLimitCpu = new Long(source.PerformanceLimitCpu);
        }
        if (source.PerformanceLimitMem != null) {
            this.PerformanceLimitMem = new Long(source.PerformanceLimitMem);
        }
        if (source.PerformanceLimitMemAmount != null) {
            this.PerformanceLimitMemAmount = new Long(source.PerformanceLimitMemAmount);
        }
        if (source.SafeInject != null) {
            this.SafeInject = new Long(source.SafeInject);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QUUID", this.QUUID);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "VulDefEnable", this.VulDefEnable);
        this.setParamSimple(map, prefix + "VulDefMode", this.VulDefMode);
        this.setParamSimple(map, prefix + "VulDefAction", this.VulDefAction);
        this.setParamSimple(map, prefix + "MemShellDefEnable", this.MemShellDefEnable);
        this.setParamSimple(map, prefix + "PerformanceLimit", this.PerformanceLimit);
        this.setParamSimple(map, prefix + "PerformanceLimitCpu", this.PerformanceLimitCpu);
        this.setParamSimple(map, prefix + "PerformanceLimitMem", this.PerformanceLimitMem);
        this.setParamSimple(map, prefix + "PerformanceLimitMemAmount", this.PerformanceLimitMemAmount);
        this.setParamSimple(map, prefix + "SafeInject", this.SafeInject);

    }
}

