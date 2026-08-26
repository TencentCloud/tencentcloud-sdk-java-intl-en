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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenPlanPackageInfo extends AbstractModel {

    /**
    * Total quota. The unit is determined by the package type: credits for the Enterprise Professional package and tokens for the Enterprise auto package.
    */
    @SerializedName("TotalQuota")
    @Expose
    private String TotalQuota;

    /**
    * Total used quota. The unit varies by package type: credits (enterprise edition professional package), tokens (enterprise edition auto package)
    */
    @SerializedName("TotalUsed")
    @Expose
    private String TotalUsed;

    /**
    * Total number of periods.
    */
    @SerializedName("TotalCycles")
    @Expose
    private Long TotalCycles;

    /**
    * Period unit. Value: month
    */
    @SerializedName("CycleUnit")
    @Expose
    private String CycleUnit;

    /**
    * Package effective time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Package expiration time.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Allocated quota for dedicated pool. The unit varies by package type: credits (enterprise edition professional package), tokens (enterprise edition auto package)
    */
    @SerializedName("ExclusiveAllocated")
    @Expose
    private String ExclusiveAllocated;

    /**
    * Used credit of the dedicated pool. The unit varies based on the package type: credits for the enterprise professional package, and tokens for the enterprise auto package.
    */
    @SerializedName("ExclusiveUsed")
    @Expose
    private String ExclusiveUsed;

    /**
    * Total shared pool quota. The measurement unit varies based on the package type: credits (enterprise edition professional package), tokens (enterprise edition auto package).
    */
    @SerializedName("SharedPool")
    @Expose
    private String SharedPool;

    /**
    * Shared used credit. The unit varies by package type: credits (enterprise edition professional package), tokens (enterprise edition auto package)
    */
    @SerializedName("SharedUsed")
    @Expose
    private String SharedUsed;

    /**
    * Current period limit. The unit varies by package type: credits (Enterprise Edition Professional), tokens (Enterprise Edition auto).
    */
    @SerializedName("CycleQuota")
    @Expose
    private String CycleQuota;

    /**
    * Current cycle.
    */
    @SerializedName("CurrentCycle")
    @Expose
    private Long CurrentCycle;

    /**
    * Remaining cycle.
    */
    @SerializedName("RemainCycles")
    @Expose
    private Long RemainCycles;

    /**
     * Get Total quota. The unit is determined by the package type: credits for the Enterprise Professional package and tokens for the Enterprise auto package. 
     * @return TotalQuota Total quota. The unit is determined by the package type: credits for the Enterprise Professional package and tokens for the Enterprise auto package.
     */
    public String getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set Total quota. The unit is determined by the package type: credits for the Enterprise Professional package and tokens for the Enterprise auto package.
     * @param TotalQuota Total quota. The unit is determined by the package type: credits for the Enterprise Professional package and tokens for the Enterprise auto package.
     */
    public void setTotalQuota(String TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get Total used quota. The unit varies by package type: credits (enterprise edition professional package), tokens (enterprise edition auto package) 
     * @return TotalUsed Total used quota. The unit varies by package type: credits (enterprise edition professional package), tokens (enterprise edition auto package)
     */
    public String getTotalUsed() {
        return this.TotalUsed;
    }

    /**
     * Set Total used quota. The unit varies by package type: credits (enterprise edition professional package), tokens (enterprise edition auto package)
     * @param TotalUsed Total used quota. The unit varies by package type: credits (enterprise edition professional package), tokens (enterprise edition auto package)
     */
    public void setTotalUsed(String TotalUsed) {
        this.TotalUsed = TotalUsed;
    }

    /**
     * Get Total number of periods. 
     * @return TotalCycles Total number of periods.
     */
    public Long getTotalCycles() {
        return this.TotalCycles;
    }

    /**
     * Set Total number of periods.
     * @param TotalCycles Total number of periods.
     */
    public void setTotalCycles(Long TotalCycles) {
        this.TotalCycles = TotalCycles;
    }

    /**
     * Get Period unit. Value: month 
     * @return CycleUnit Period unit. Value: month
     */
    public String getCycleUnit() {
        return this.CycleUnit;
    }

    /**
     * Set Period unit. Value: month
     * @param CycleUnit Period unit. Value: month
     */
    public void setCycleUnit(String CycleUnit) {
        this.CycleUnit = CycleUnit;
    }

    /**
     * Get Package effective time. 
     * @return StartTime Package effective time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Package effective time.
     * @param StartTime Package effective time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Package expiration time. 
     * @return ExpireTime Package expiration time.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Package expiration time.
     * @param ExpireTime Package expiration time.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Allocated quota for dedicated pool. The unit varies by package type: credits (enterprise edition professional package), tokens (enterprise edition auto package) 
     * @return ExclusiveAllocated Allocated quota for dedicated pool. The unit varies by package type: credits (enterprise edition professional package), tokens (enterprise edition auto package)
     */
    public String getExclusiveAllocated() {
        return this.ExclusiveAllocated;
    }

    /**
     * Set Allocated quota for dedicated pool. The unit varies by package type: credits (enterprise edition professional package), tokens (enterprise edition auto package)
     * @param ExclusiveAllocated Allocated quota for dedicated pool. The unit varies by package type: credits (enterprise edition professional package), tokens (enterprise edition auto package)
     */
    public void setExclusiveAllocated(String ExclusiveAllocated) {
        this.ExclusiveAllocated = ExclusiveAllocated;
    }

    /**
     * Get Used credit of the dedicated pool. The unit varies based on the package type: credits for the enterprise professional package, and tokens for the enterprise auto package. 
     * @return ExclusiveUsed Used credit of the dedicated pool. The unit varies based on the package type: credits for the enterprise professional package, and tokens for the enterprise auto package.
     */
    public String getExclusiveUsed() {
        return this.ExclusiveUsed;
    }

    /**
     * Set Used credit of the dedicated pool. The unit varies based on the package type: credits for the enterprise professional package, and tokens for the enterprise auto package.
     * @param ExclusiveUsed Used credit of the dedicated pool. The unit varies based on the package type: credits for the enterprise professional package, and tokens for the enterprise auto package.
     */
    public void setExclusiveUsed(String ExclusiveUsed) {
        this.ExclusiveUsed = ExclusiveUsed;
    }

    /**
     * Get Total shared pool quota. The measurement unit varies based on the package type: credits (enterprise edition professional package), tokens (enterprise edition auto package). 
     * @return SharedPool Total shared pool quota. The measurement unit varies based on the package type: credits (enterprise edition professional package), tokens (enterprise edition auto package).
     */
    public String getSharedPool() {
        return this.SharedPool;
    }

    /**
     * Set Total shared pool quota. The measurement unit varies based on the package type: credits (enterprise edition professional package), tokens (enterprise edition auto package).
     * @param SharedPool Total shared pool quota. The measurement unit varies based on the package type: credits (enterprise edition professional package), tokens (enterprise edition auto package).
     */
    public void setSharedPool(String SharedPool) {
        this.SharedPool = SharedPool;
    }

    /**
     * Get Shared used credit. The unit varies by package type: credits (enterprise edition professional package), tokens (enterprise edition auto package) 
     * @return SharedUsed Shared used credit. The unit varies by package type: credits (enterprise edition professional package), tokens (enterprise edition auto package)
     */
    public String getSharedUsed() {
        return this.SharedUsed;
    }

    /**
     * Set Shared used credit. The unit varies by package type: credits (enterprise edition professional package), tokens (enterprise edition auto package)
     * @param SharedUsed Shared used credit. The unit varies by package type: credits (enterprise edition professional package), tokens (enterprise edition auto package)
     */
    public void setSharedUsed(String SharedUsed) {
        this.SharedUsed = SharedUsed;
    }

    /**
     * Get Current period limit. The unit varies by package type: credits (Enterprise Edition Professional), tokens (Enterprise Edition auto). 
     * @return CycleQuota Current period limit. The unit varies by package type: credits (Enterprise Edition Professional), tokens (Enterprise Edition auto).
     */
    public String getCycleQuota() {
        return this.CycleQuota;
    }

    /**
     * Set Current period limit. The unit varies by package type: credits (Enterprise Edition Professional), tokens (Enterprise Edition auto).
     * @param CycleQuota Current period limit. The unit varies by package type: credits (Enterprise Edition Professional), tokens (Enterprise Edition auto).
     */
    public void setCycleQuota(String CycleQuota) {
        this.CycleQuota = CycleQuota;
    }

    /**
     * Get Current cycle. 
     * @return CurrentCycle Current cycle.
     */
    public Long getCurrentCycle() {
        return this.CurrentCycle;
    }

    /**
     * Set Current cycle.
     * @param CurrentCycle Current cycle.
     */
    public void setCurrentCycle(Long CurrentCycle) {
        this.CurrentCycle = CurrentCycle;
    }

    /**
     * Get Remaining cycle. 
     * @return RemainCycles Remaining cycle.
     */
    public Long getRemainCycles() {
        return this.RemainCycles;
    }

    /**
     * Set Remaining cycle.
     * @param RemainCycles Remaining cycle.
     */
    public void setRemainCycles(Long RemainCycles) {
        this.RemainCycles = RemainCycles;
    }

    public TokenPlanPackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenPlanPackageInfo(TokenPlanPackageInfo source) {
        if (source.TotalQuota != null) {
            this.TotalQuota = new String(source.TotalQuota);
        }
        if (source.TotalUsed != null) {
            this.TotalUsed = new String(source.TotalUsed);
        }
        if (source.TotalCycles != null) {
            this.TotalCycles = new Long(source.TotalCycles);
        }
        if (source.CycleUnit != null) {
            this.CycleUnit = new String(source.CycleUnit);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ExclusiveAllocated != null) {
            this.ExclusiveAllocated = new String(source.ExclusiveAllocated);
        }
        if (source.ExclusiveUsed != null) {
            this.ExclusiveUsed = new String(source.ExclusiveUsed);
        }
        if (source.SharedPool != null) {
            this.SharedPool = new String(source.SharedPool);
        }
        if (source.SharedUsed != null) {
            this.SharedUsed = new String(source.SharedUsed);
        }
        if (source.CycleQuota != null) {
            this.CycleQuota = new String(source.CycleQuota);
        }
        if (source.CurrentCycle != null) {
            this.CurrentCycle = new Long(source.CurrentCycle);
        }
        if (source.RemainCycles != null) {
            this.RemainCycles = new Long(source.RemainCycles);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "TotalUsed", this.TotalUsed);
        this.setParamSimple(map, prefix + "TotalCycles", this.TotalCycles);
        this.setParamSimple(map, prefix + "CycleUnit", this.CycleUnit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ExclusiveAllocated", this.ExclusiveAllocated);
        this.setParamSimple(map, prefix + "ExclusiveUsed", this.ExclusiveUsed);
        this.setParamSimple(map, prefix + "SharedPool", this.SharedPool);
        this.setParamSimple(map, prefix + "SharedUsed", this.SharedUsed);
        this.setParamSimple(map, prefix + "CycleQuota", this.CycleQuota);
        this.setParamSimple(map, prefix + "CurrentCycle", this.CurrentCycle);
        this.setParamSimple(map, prefix + "RemainCycles", this.RemainCycles);

    }
}

