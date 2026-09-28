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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetHealthStatusInfo extends AbstractModel {

    /**
    * Backend service health status. If DescribeListenerHealthStatus returns only unhealthy backends, this value is UnHealthy.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Backend service instance ID. For a CVM instance, the format is "ins-" followed by 8 alphanumeric characters.
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * Backend target service IP.
    */
    @SerializedName("TargetIp")
    @Expose
    private String TargetIp;

    /**
    * Backend server port.
    */
    @SerializedName("TargetPort")
    @Expose
    private Long TargetPort;

    /**
     * Get Backend service health status. If DescribeListenerHealthStatus returns only unhealthy backends, this value is UnHealthy. 
     * @return Status Backend service health status. If DescribeListenerHealthStatus returns only unhealthy backends, this value is UnHealthy.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Backend service health status. If DescribeListenerHealthStatus returns only unhealthy backends, this value is UnHealthy.
     * @param Status Backend service health status. If DescribeListenerHealthStatus returns only unhealthy backends, this value is UnHealthy.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Backend service instance ID. For a CVM instance, the format is "ins-" followed by 8 alphanumeric characters. 
     * @return TargetId Backend service instance ID. For a CVM instance, the format is "ins-" followed by 8 alphanumeric characters.
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set Backend service instance ID. For a CVM instance, the format is "ins-" followed by 8 alphanumeric characters.
     * @param TargetId Backend service instance ID. For a CVM instance, the format is "ins-" followed by 8 alphanumeric characters.
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get Backend target service IP. 
     * @return TargetIp Backend target service IP.
     */
    public String getTargetIp() {
        return this.TargetIp;
    }

    /**
     * Set Backend target service IP.
     * @param TargetIp Backend target service IP.
     */
    public void setTargetIp(String TargetIp) {
        this.TargetIp = TargetIp;
    }

    /**
     * Get Backend server port. 
     * @return TargetPort Backend server port.
     */
    public Long getTargetPort() {
        return this.TargetPort;
    }

    /**
     * Set Backend server port.
     * @param TargetPort Backend server port.
     */
    public void setTargetPort(Long TargetPort) {
        this.TargetPort = TargetPort;
    }

    public TargetHealthStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetHealthStatusInfo(TargetHealthStatusInfo source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.TargetIp != null) {
            this.TargetIp = new String(source.TargetIp);
        }
        if (source.TargetPort != null) {
            this.TargetPort = new Long(source.TargetPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetIp", this.TargetIp);
        this.setParamSimple(map, prefix + "TargetPort", this.TargetPort);

    }
}

