/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class RequestsPerSecond extends AbstractModel {

    /**
    * Maximum rps.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("MaxRequestsPerSecond")
    @Expose
    private Long MaxRequestsPerSecond;

    /**
    * Duration time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
    * Deprecated.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("TargetVirtualUsers")
    @Expose
    private Long TargetVirtualUsers;

    /**
    * Number of resources.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Resources")
    @Expose
    private Long Resources;

    /**
    * Initial rps.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("StartRequestsPerSecond")
    @Expose
    private Long StartRequestsPerSecond;

    /**
    * Target rps, invalid as an input parameter.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("TargetRequestsPerSecond")
    @Expose
    private Long TargetRequestsPerSecond;

    /**
    * Graceful shutdown waiting time.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("GracefulStopSeconds")
    @Expose
    private Long GracefulStopSeconds;

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
     * Get Duration time.

Note: This field may return null, indicating that no valid value is found. 
     * @return DurationSeconds Duration time.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set Duration time.

Note: This field may return null, indicating that no valid value is found.
     * @param DurationSeconds Duration time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    /**
     * Get Deprecated.

Note: This field may return null, indicating that no valid value is found. 
     * @return TargetVirtualUsers Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getTargetVirtualUsers() {
        return this.TargetVirtualUsers;
    }

    /**
     * Set Deprecated.

Note: This field may return null, indicating that no valid value is found.
     * @param TargetVirtualUsers Deprecated.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setTargetVirtualUsers(Long TargetVirtualUsers) {
        this.TargetVirtualUsers = TargetVirtualUsers;
    }

    /**
     * Get Number of resources.

Note: This field may return null, indicating that no valid value is found. 
     * @return Resources Number of resources.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getResources() {
        return this.Resources;
    }

    /**
     * Set Number of resources.

Note: This field may return null, indicating that no valid value is found.
     * @param Resources Number of resources.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setResources(Long Resources) {
        this.Resources = Resources;
    }

    /**
     * Get Initial rps.

Note: This field may return null, indicating that no valid value is found. 
     * @return StartRequestsPerSecond Initial rps.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getStartRequestsPerSecond() {
        return this.StartRequestsPerSecond;
    }

    /**
     * Set Initial rps.

Note: This field may return null, indicating that no valid value is found.
     * @param StartRequestsPerSecond Initial rps.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setStartRequestsPerSecond(Long StartRequestsPerSecond) {
        this.StartRequestsPerSecond = StartRequestsPerSecond;
    }

    /**
     * Get Target rps, invalid as an input parameter.

Note: This field may return null, indicating that no valid value is found. 
     * @return TargetRequestsPerSecond Target rps, invalid as an input parameter.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getTargetRequestsPerSecond() {
        return this.TargetRequestsPerSecond;
    }

    /**
     * Set Target rps, invalid as an input parameter.

Note: This field may return null, indicating that no valid value is found.
     * @param TargetRequestsPerSecond Target rps, invalid as an input parameter.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setTargetRequestsPerSecond(Long TargetRequestsPerSecond) {
        this.TargetRequestsPerSecond = TargetRequestsPerSecond;
    }

    /**
     * Get Graceful shutdown waiting time.

Note: This field may return null, indicating that no valid value is found. 
     * @return GracefulStopSeconds Graceful shutdown waiting time.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getGracefulStopSeconds() {
        return this.GracefulStopSeconds;
    }

    /**
     * Set Graceful shutdown waiting time.

Note: This field may return null, indicating that no valid value is found.
     * @param GracefulStopSeconds Graceful shutdown waiting time.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setGracefulStopSeconds(Long GracefulStopSeconds) {
        this.GracefulStopSeconds = GracefulStopSeconds;
    }

    public RequestsPerSecond() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestsPerSecond(RequestsPerSecond source) {
        if (source.MaxRequestsPerSecond != null) {
            this.MaxRequestsPerSecond = new Long(source.MaxRequestsPerSecond);
        }
        if (source.DurationSeconds != null) {
            this.DurationSeconds = new Long(source.DurationSeconds);
        }
        if (source.TargetVirtualUsers != null) {
            this.TargetVirtualUsers = new Long(source.TargetVirtualUsers);
        }
        if (source.Resources != null) {
            this.Resources = new Long(source.Resources);
        }
        if (source.StartRequestsPerSecond != null) {
            this.StartRequestsPerSecond = new Long(source.StartRequestsPerSecond);
        }
        if (source.TargetRequestsPerSecond != null) {
            this.TargetRequestsPerSecond = new Long(source.TargetRequestsPerSecond);
        }
        if (source.GracefulStopSeconds != null) {
            this.GracefulStopSeconds = new Long(source.GracefulStopSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxRequestsPerSecond", this.MaxRequestsPerSecond);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);
        this.setParamSimple(map, prefix + "TargetVirtualUsers", this.TargetVirtualUsers);
        this.setParamSimple(map, prefix + "Resources", this.Resources);
        this.setParamSimple(map, prefix + "StartRequestsPerSecond", this.StartRequestsPerSecond);
        this.setParamSimple(map, prefix + "TargetRequestsPerSecond", this.TargetRequestsPerSecond);
        this.setParamSimple(map, prefix + "GracefulStopSeconds", this.GracefulStopSeconds);

    }
}

