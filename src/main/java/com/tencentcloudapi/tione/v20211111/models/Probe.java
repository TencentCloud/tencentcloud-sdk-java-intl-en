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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Probe extends AbstractModel {

    /**
    * Probe action.
    */
    @SerializedName("ProbeAction")
    @Expose
    private ProbeAction ProbeAction;

    /**
    * Delay in waiting for a service startup.
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * Polling check interval.
    */
    @SerializedName("PeriodSeconds")
    @Expose
    private Long PeriodSeconds;

    /**
    * Check timeout duration.
    */
    @SerializedName("TimeoutSeconds")
    @Expose
    private Long TimeoutSeconds;

    /**
    * Number of acknowledged failed detections.
    */
    @SerializedName("FailureThreshold")
    @Expose
    private Long FailureThreshold;

    /**
    * Number of acknowledged successful detections. The default values for readiness, liveness, and startup statuses are 3, 1, and 1.
    */
    @SerializedName("SuccessThreshold")
    @Expose
    private Long SuccessThreshold;

    /**
     * Get Probe action. 
     * @return ProbeAction Probe action.
     */
    public ProbeAction getProbeAction() {
        return this.ProbeAction;
    }

    /**
     * Set Probe action.
     * @param ProbeAction Probe action.
     */
    public void setProbeAction(ProbeAction ProbeAction) {
        this.ProbeAction = ProbeAction;
    }

    /**
     * Get Delay in waiting for a service startup. 
     * @return InitialDelaySeconds Delay in waiting for a service startup.
     */
    public Long getInitialDelaySeconds() {
        return this.InitialDelaySeconds;
    }

    /**
     * Set Delay in waiting for a service startup.
     * @param InitialDelaySeconds Delay in waiting for a service startup.
     */
    public void setInitialDelaySeconds(Long InitialDelaySeconds) {
        this.InitialDelaySeconds = InitialDelaySeconds;
    }

    /**
     * Get Polling check interval. 
     * @return PeriodSeconds Polling check interval.
     */
    public Long getPeriodSeconds() {
        return this.PeriodSeconds;
    }

    /**
     * Set Polling check interval.
     * @param PeriodSeconds Polling check interval.
     */
    public void setPeriodSeconds(Long PeriodSeconds) {
        this.PeriodSeconds = PeriodSeconds;
    }

    /**
     * Get Check timeout duration. 
     * @return TimeoutSeconds Check timeout duration.
     */
    public Long getTimeoutSeconds() {
        return this.TimeoutSeconds;
    }

    /**
     * Set Check timeout duration.
     * @param TimeoutSeconds Check timeout duration.
     */
    public void setTimeoutSeconds(Long TimeoutSeconds) {
        this.TimeoutSeconds = TimeoutSeconds;
    }

    /**
     * Get Number of acknowledged failed detections. 
     * @return FailureThreshold Number of acknowledged failed detections.
     */
    public Long getFailureThreshold() {
        return this.FailureThreshold;
    }

    /**
     * Set Number of acknowledged failed detections.
     * @param FailureThreshold Number of acknowledged failed detections.
     */
    public void setFailureThreshold(Long FailureThreshold) {
        this.FailureThreshold = FailureThreshold;
    }

    /**
     * Get Number of acknowledged successful detections. The default values for readiness, liveness, and startup statuses are 3, 1, and 1. 
     * @return SuccessThreshold Number of acknowledged successful detections. The default values for readiness, liveness, and startup statuses are 3, 1, and 1.
     */
    public Long getSuccessThreshold() {
        return this.SuccessThreshold;
    }

    /**
     * Set Number of acknowledged successful detections. The default values for readiness, liveness, and startup statuses are 3, 1, and 1.
     * @param SuccessThreshold Number of acknowledged successful detections. The default values for readiness, liveness, and startup statuses are 3, 1, and 1.
     */
    public void setSuccessThreshold(Long SuccessThreshold) {
        this.SuccessThreshold = SuccessThreshold;
    }

    public Probe() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Probe(Probe source) {
        if (source.ProbeAction != null) {
            this.ProbeAction = new ProbeAction(source.ProbeAction);
        }
        if (source.InitialDelaySeconds != null) {
            this.InitialDelaySeconds = new Long(source.InitialDelaySeconds);
        }
        if (source.PeriodSeconds != null) {
            this.PeriodSeconds = new Long(source.PeriodSeconds);
        }
        if (source.TimeoutSeconds != null) {
            this.TimeoutSeconds = new Long(source.TimeoutSeconds);
        }
        if (source.FailureThreshold != null) {
            this.FailureThreshold = new Long(source.FailureThreshold);
        }
        if (source.SuccessThreshold != null) {
            this.SuccessThreshold = new Long(source.SuccessThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ProbeAction.", this.ProbeAction);
        this.setParamSimple(map, prefix + "InitialDelaySeconds", this.InitialDelaySeconds);
        this.setParamSimple(map, prefix + "PeriodSeconds", this.PeriodSeconds);
        this.setParamSimple(map, prefix + "TimeoutSeconds", this.TimeoutSeconds);
        this.setParamSimple(map, prefix + "FailureThreshold", this.FailureThreshold);
        this.setParamSimple(map, prefix + "SuccessThreshold", this.SuccessThreshold);

    }
}

