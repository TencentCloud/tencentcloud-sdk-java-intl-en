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

public class HealthProbe extends AbstractModel {

    /**
    * Liveness probe.
    */
    @SerializedName("LivenessProbe")
    @Expose
    private Probe LivenessProbe;

    /**
    * Readiness probe.
    */
    @SerializedName("ReadinessProbe")
    @Expose
    private Probe ReadinessProbe;

    /**
    * Startup probe.
    */
    @SerializedName("StartupProbe")
    @Expose
    private Probe StartupProbe;

    /**
     * Get Liveness probe. 
     * @return LivenessProbe Liveness probe.
     */
    public Probe getLivenessProbe() {
        return this.LivenessProbe;
    }

    /**
     * Set Liveness probe.
     * @param LivenessProbe Liveness probe.
     */
    public void setLivenessProbe(Probe LivenessProbe) {
        this.LivenessProbe = LivenessProbe;
    }

    /**
     * Get Readiness probe. 
     * @return ReadinessProbe Readiness probe.
     */
    public Probe getReadinessProbe() {
        return this.ReadinessProbe;
    }

    /**
     * Set Readiness probe.
     * @param ReadinessProbe Readiness probe.
     */
    public void setReadinessProbe(Probe ReadinessProbe) {
        this.ReadinessProbe = ReadinessProbe;
    }

    /**
     * Get Startup probe. 
     * @return StartupProbe Startup probe.
     */
    public Probe getStartupProbe() {
        return this.StartupProbe;
    }

    /**
     * Set Startup probe.
     * @param StartupProbe Startup probe.
     */
    public void setStartupProbe(Probe StartupProbe) {
        this.StartupProbe = StartupProbe;
    }

    public HealthProbe() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthProbe(HealthProbe source) {
        if (source.LivenessProbe != null) {
            this.LivenessProbe = new Probe(source.LivenessProbe);
        }
        if (source.ReadinessProbe != null) {
            this.ReadinessProbe = new Probe(source.ReadinessProbe);
        }
        if (source.StartupProbe != null) {
            this.StartupProbe = new Probe(source.StartupProbe);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LivenessProbe.", this.LivenessProbe);
        this.setParamObj(map, prefix + "ReadinessProbe.", this.ReadinessProbe);
        this.setParamObj(map, prefix + "StartupProbe.", this.StartupProbe);

    }
}

