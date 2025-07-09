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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Concurrency extends AbstractModel {

    /**
    * Array of multi-stage configuration.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Stages")
    @Expose
    private Stage [] Stages;

    /**
    * Number of iteration.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("IterationCount")
    @Expose
    private Long IterationCount;

    /**
    * Maximum rps.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("MaxRequestsPerSecond")
    @Expose
    private Long MaxRequestsPerSecond;

    /**
    * Graceful termination job waiting time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("GracefulStopSeconds")
    @Expose
    private Long GracefulStopSeconds;

    /**
    * Number of resource.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Resources")
    @Expose
    private Long Resources;

    /**
     * Get Array of multi-stage configuration.

Note: This field may return null, indicating that no valid value is found. 
     * @return Stages Array of multi-stage configuration.

Note: This field may return null, indicating that no valid value is found.
     */
    public Stage [] getStages() {
        return this.Stages;
    }

    /**
     * Set Array of multi-stage configuration.

Note: This field may return null, indicating that no valid value is found.
     * @param Stages Array of multi-stage configuration.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setStages(Stage [] Stages) {
        this.Stages = Stages;
    }

    /**
     * Get Number of iteration.

Note: This field may return null, indicating that no valid value is found. 
     * @return IterationCount Number of iteration.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getIterationCount() {
        return this.IterationCount;
    }

    /**
     * Set Number of iteration.

Note: This field may return null, indicating that no valid value is found.
     * @param IterationCount Number of iteration.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setIterationCount(Long IterationCount) {
        this.IterationCount = IterationCount;
    }

    /**
     * Get Maximum rps.

Note: This field may return null, indicating that no valid value is found. 
     * @return MaxRequestsPerSecond Maximum rps.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getMaxRequestsPerSecond() {
        return this.MaxRequestsPerSecond;
    }

    /**
     * Set Maximum rps.

Note: This field may return null, indicating that no valid value is found.
     * @param MaxRequestsPerSecond Maximum rps.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setMaxRequestsPerSecond(Long MaxRequestsPerSecond) {
        this.MaxRequestsPerSecond = MaxRequestsPerSecond;
    }

    /**
     * Get Graceful termination job waiting time.

Note: This field may return null, indicating that no valid value is found. 
     * @return GracefulStopSeconds Graceful termination job waiting time.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getGracefulStopSeconds() {
        return this.GracefulStopSeconds;
    }

    /**
     * Set Graceful termination job waiting time.

Note: This field may return null, indicating that no valid value is found.
     * @param GracefulStopSeconds Graceful termination job waiting time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setGracefulStopSeconds(Long GracefulStopSeconds) {
        this.GracefulStopSeconds = GracefulStopSeconds;
    }

    /**
     * Get Number of resource.

Note: This field may return null, indicating that no valid value is found. 
     * @return Resources Number of resource.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getResources() {
        return this.Resources;
    }

    /**
     * Set Number of resource.

Note: This field may return null, indicating that no valid value is found.
     * @param Resources Number of resource.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setResources(Long Resources) {
        this.Resources = Resources;
    }

    public Concurrency() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Concurrency(Concurrency source) {
        if (source.Stages != null) {
            this.Stages = new Stage[source.Stages.length];
            for (int i = 0; i < source.Stages.length; i++) {
                this.Stages[i] = new Stage(source.Stages[i]);
            }
        }
        if (source.IterationCount != null) {
            this.IterationCount = new Long(source.IterationCount);
        }
        if (source.MaxRequestsPerSecond != null) {
            this.MaxRequestsPerSecond = new Long(source.MaxRequestsPerSecond);
        }
        if (source.GracefulStopSeconds != null) {
            this.GracefulStopSeconds = new Long(source.GracefulStopSeconds);
        }
        if (source.Resources != null) {
            this.Resources = new Long(source.Resources);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Stages.", this.Stages);
        this.setParamSimple(map, prefix + "IterationCount", this.IterationCount);
        this.setParamSimple(map, prefix + "MaxRequestsPerSecond", this.MaxRequestsPerSecond);
        this.setParamSimple(map, prefix + "GracefulStopSeconds", this.GracefulStopSeconds);
        this.setParamSimple(map, prefix + "Resources", this.Resources);

    }
}

