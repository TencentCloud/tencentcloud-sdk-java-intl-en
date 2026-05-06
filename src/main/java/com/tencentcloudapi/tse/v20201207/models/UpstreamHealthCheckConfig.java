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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpstreamHealthCheckConfig extends AbstractModel {

    /**
    * Enable active health check
    */
    @SerializedName("EnableActiveHealthCheck")
    @Expose
    private Boolean EnableActiveHealthCheck;

    /**
    * Active health check configuration
    */
    @SerializedName("ActiveHealthCheck")
    @Expose
    private KongActiveHealthCheck ActiveHealthCheck;

    /**
    * Enable passive health check
    */
    @SerializedName("EnablePassiveHealthCheck")
    @Expose
    private Boolean EnablePassiveHealthCheck;

    /**
    * Passive health check configuration
    */
    @SerializedName("PassiveHealthCheck")
    @Expose
    private KongPassiveHealthCheck PassiveHealthCheck;

    /**
    * Consecutive health threshold, unit: times
    */
    @SerializedName("Successes")
    @Expose
    private Long Successes;

    /**
    * Continuous anomaly threshold, unit: times	
    */
    @SerializedName("Failures")
    @Expose
    private Long Failures;

    /**
    * Timeout threshold, unit: times
    */
    @SerializedName("Timeouts")
    @Expose
    private Long Timeouts;

    /**
    * Healthy HTTP status code
    */
    @SerializedName("HealthyHttpStatuses")
    @Expose
    private Long [] HealthyHttpStatuses;

    /**
    * abnormal HTTP status code
    */
    @SerializedName("UnhealthyHttpStatuses")
    @Expose
    private Long [] UnhealthyHttpStatuses;

    /**
    * Health check monitoring blocks nodes with a weight of 0 in reported data
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IgnoreZeroWeightNodes")
    @Expose
    private Boolean IgnoreZeroWeightNodes;

    /**
    * Health check supports nodes with support weights of 0
    */
    @SerializedName("ZeroWeightHeathCheck")
    @Expose
    private Boolean ZeroWeightHeathCheck;

    /**
     * Get Enable active health check 
     * @return EnableActiveHealthCheck Enable active health check
     */
    public Boolean getEnableActiveHealthCheck() {
        return this.EnableActiveHealthCheck;
    }

    /**
     * Set Enable active health check
     * @param EnableActiveHealthCheck Enable active health check
     */
    public void setEnableActiveHealthCheck(Boolean EnableActiveHealthCheck) {
        this.EnableActiveHealthCheck = EnableActiveHealthCheck;
    }

    /**
     * Get Active health check configuration 
     * @return ActiveHealthCheck Active health check configuration
     */
    public KongActiveHealthCheck getActiveHealthCheck() {
        return this.ActiveHealthCheck;
    }

    /**
     * Set Active health check configuration
     * @param ActiveHealthCheck Active health check configuration
     */
    public void setActiveHealthCheck(KongActiveHealthCheck ActiveHealthCheck) {
        this.ActiveHealthCheck = ActiveHealthCheck;
    }

    /**
     * Get Enable passive health check 
     * @return EnablePassiveHealthCheck Enable passive health check
     */
    public Boolean getEnablePassiveHealthCheck() {
        return this.EnablePassiveHealthCheck;
    }

    /**
     * Set Enable passive health check
     * @param EnablePassiveHealthCheck Enable passive health check
     */
    public void setEnablePassiveHealthCheck(Boolean EnablePassiveHealthCheck) {
        this.EnablePassiveHealthCheck = EnablePassiveHealthCheck;
    }

    /**
     * Get Passive health check configuration 
     * @return PassiveHealthCheck Passive health check configuration
     */
    public KongPassiveHealthCheck getPassiveHealthCheck() {
        return this.PassiveHealthCheck;
    }

    /**
     * Set Passive health check configuration
     * @param PassiveHealthCheck Passive health check configuration
     */
    public void setPassiveHealthCheck(KongPassiveHealthCheck PassiveHealthCheck) {
        this.PassiveHealthCheck = PassiveHealthCheck;
    }

    /**
     * Get Consecutive health threshold, unit: times 
     * @return Successes Consecutive health threshold, unit: times
     */
    public Long getSuccesses() {
        return this.Successes;
    }

    /**
     * Set Consecutive health threshold, unit: times
     * @param Successes Consecutive health threshold, unit: times
     */
    public void setSuccesses(Long Successes) {
        this.Successes = Successes;
    }

    /**
     * Get Continuous anomaly threshold, unit: times	 
     * @return Failures Continuous anomaly threshold, unit: times	
     */
    public Long getFailures() {
        return this.Failures;
    }

    /**
     * Set Continuous anomaly threshold, unit: times	
     * @param Failures Continuous anomaly threshold, unit: times	
     */
    public void setFailures(Long Failures) {
        this.Failures = Failures;
    }

    /**
     * Get Timeout threshold, unit: times 
     * @return Timeouts Timeout threshold, unit: times
     */
    public Long getTimeouts() {
        return this.Timeouts;
    }

    /**
     * Set Timeout threshold, unit: times
     * @param Timeouts Timeout threshold, unit: times
     */
    public void setTimeouts(Long Timeouts) {
        this.Timeouts = Timeouts;
    }

    /**
     * Get Healthy HTTP status code 
     * @return HealthyHttpStatuses Healthy HTTP status code
     */
    public Long [] getHealthyHttpStatuses() {
        return this.HealthyHttpStatuses;
    }

    /**
     * Set Healthy HTTP status code
     * @param HealthyHttpStatuses Healthy HTTP status code
     */
    public void setHealthyHttpStatuses(Long [] HealthyHttpStatuses) {
        this.HealthyHttpStatuses = HealthyHttpStatuses;
    }

    /**
     * Get abnormal HTTP status code 
     * @return UnhealthyHttpStatuses abnormal HTTP status code
     */
    public Long [] getUnhealthyHttpStatuses() {
        return this.UnhealthyHttpStatuses;
    }

    /**
     * Set abnormal HTTP status code
     * @param UnhealthyHttpStatuses abnormal HTTP status code
     */
    public void setUnhealthyHttpStatuses(Long [] UnhealthyHttpStatuses) {
        this.UnhealthyHttpStatuses = UnhealthyHttpStatuses;
    }

    /**
     * Get Health check monitoring blocks nodes with a weight of 0 in reported data
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IgnoreZeroWeightNodes Health check monitoring blocks nodes with a weight of 0 in reported data
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Boolean getIgnoreZeroWeightNodes() {
        return this.IgnoreZeroWeightNodes;
    }

    /**
     * Set Health check monitoring blocks nodes with a weight of 0 in reported data
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IgnoreZeroWeightNodes Health check monitoring blocks nodes with a weight of 0 in reported data
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setIgnoreZeroWeightNodes(Boolean IgnoreZeroWeightNodes) {
        this.IgnoreZeroWeightNodes = IgnoreZeroWeightNodes;
    }

    /**
     * Get Health check supports nodes with support weights of 0 
     * @return ZeroWeightHeathCheck Health check supports nodes with support weights of 0
     */
    public Boolean getZeroWeightHeathCheck() {
        return this.ZeroWeightHeathCheck;
    }

    /**
     * Set Health check supports nodes with support weights of 0
     * @param ZeroWeightHeathCheck Health check supports nodes with support weights of 0
     */
    public void setZeroWeightHeathCheck(Boolean ZeroWeightHeathCheck) {
        this.ZeroWeightHeathCheck = ZeroWeightHeathCheck;
    }

    public UpstreamHealthCheckConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamHealthCheckConfig(UpstreamHealthCheckConfig source) {
        if (source.EnableActiveHealthCheck != null) {
            this.EnableActiveHealthCheck = new Boolean(source.EnableActiveHealthCheck);
        }
        if (source.ActiveHealthCheck != null) {
            this.ActiveHealthCheck = new KongActiveHealthCheck(source.ActiveHealthCheck);
        }
        if (source.EnablePassiveHealthCheck != null) {
            this.EnablePassiveHealthCheck = new Boolean(source.EnablePassiveHealthCheck);
        }
        if (source.PassiveHealthCheck != null) {
            this.PassiveHealthCheck = new KongPassiveHealthCheck(source.PassiveHealthCheck);
        }
        if (source.Successes != null) {
            this.Successes = new Long(source.Successes);
        }
        if (source.Failures != null) {
            this.Failures = new Long(source.Failures);
        }
        if (source.Timeouts != null) {
            this.Timeouts = new Long(source.Timeouts);
        }
        if (source.HealthyHttpStatuses != null) {
            this.HealthyHttpStatuses = new Long[source.HealthyHttpStatuses.length];
            for (int i = 0; i < source.HealthyHttpStatuses.length; i++) {
                this.HealthyHttpStatuses[i] = new Long(source.HealthyHttpStatuses[i]);
            }
        }
        if (source.UnhealthyHttpStatuses != null) {
            this.UnhealthyHttpStatuses = new Long[source.UnhealthyHttpStatuses.length];
            for (int i = 0; i < source.UnhealthyHttpStatuses.length; i++) {
                this.UnhealthyHttpStatuses[i] = new Long(source.UnhealthyHttpStatuses[i]);
            }
        }
        if (source.IgnoreZeroWeightNodes != null) {
            this.IgnoreZeroWeightNodes = new Boolean(source.IgnoreZeroWeightNodes);
        }
        if (source.ZeroWeightHeathCheck != null) {
            this.ZeroWeightHeathCheck = new Boolean(source.ZeroWeightHeathCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableActiveHealthCheck", this.EnableActiveHealthCheck);
        this.setParamObj(map, prefix + "ActiveHealthCheck.", this.ActiveHealthCheck);
        this.setParamSimple(map, prefix + "EnablePassiveHealthCheck", this.EnablePassiveHealthCheck);
        this.setParamObj(map, prefix + "PassiveHealthCheck.", this.PassiveHealthCheck);
        this.setParamSimple(map, prefix + "Successes", this.Successes);
        this.setParamSimple(map, prefix + "Failures", this.Failures);
        this.setParamSimple(map, prefix + "Timeouts", this.Timeouts);
        this.setParamArraySimple(map, prefix + "HealthyHttpStatuses.", this.HealthyHttpStatuses);
        this.setParamArraySimple(map, prefix + "UnhealthyHttpStatuses.", this.UnhealthyHttpStatuses);
        this.setParamSimple(map, prefix + "IgnoreZeroWeightNodes", this.IgnoreZeroWeightNodes);
        this.setParamSimple(map, prefix + "ZeroWeightHeathCheck", this.ZeroWeightHeathCheck);

    }
}

