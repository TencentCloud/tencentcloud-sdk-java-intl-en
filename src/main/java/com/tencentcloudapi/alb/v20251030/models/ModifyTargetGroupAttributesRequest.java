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

public class ModifyTargetGroupAttributesRequest extends AbstractModel {

    /**
    * <p>Whether to preview this request.</p><ul><li><strong>false</strong> (default): Send a normal request to directly modify the target group.</li><li><strong>true</strong>: Send a preview request to check whether the parameters, format, and service limits for modifying the target group meet the requirements.</li></ul>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>Health check configuration.</p>
    */
    @SerializedName("HealthCheckConfig")
    @Expose
    private HealthCheckConfig HealthCheckConfig;

    /**
    * <p>Whether to enable long connections.</p>
    */
    @SerializedName("KeepaliveEnabled")
    @Expose
    private Boolean KeepaliveEnabled;

    /**
    * <p>Scheduling algorithm. Values:</p><ul><li><strong>wrr</strong>: weighted polling. Real servers are selected by weight. The higher the weight, the more chances a server stands to be polled.</li><li><strong>wlc</strong>: number of weighted least connections. When weight values of different real servers are the same, the server with fewer current connections stands more chances to be polled.</li></ul>
    */
    @SerializedName("SchedulerAlgorithm")
    @Expose
    private String SchedulerAlgorithm;

    /**
    * <p>Session persistence configuration.</p>
    */
    @SerializedName("StickySessionConfig")
    @Expose
    private StickySessionConfig StickySessionConfig;

    /**
    * <p>Target group ID, format: lbtg- followed by 8 alphanumeric characters.</p>
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * <p>Target group name. It can contain 1–255 characters, consisting of digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-). If no target group name is specified, the ID is used as the target group name by default.</p>
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
     * Get <p>Whether to preview this request.</p><ul><li><strong>false</strong> (default): Send a normal request to directly modify the target group.</li><li><strong>true</strong>: Send a preview request to check whether the parameters, format, and service limits for modifying the target group meet the requirements.</li></ul> 
     * @return DryRun <p>Whether to preview this request.</p><ul><li><strong>false</strong> (default): Send a normal request to directly modify the target group.</li><li><strong>true</strong>: Send a preview request to check whether the parameters, format, and service limits for modifying the target group meet the requirements.</li></ul>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>Whether to preview this request.</p><ul><li><strong>false</strong> (default): Send a normal request to directly modify the target group.</li><li><strong>true</strong>: Send a preview request to check whether the parameters, format, and service limits for modifying the target group meet the requirements.</li></ul>
     * @param DryRun <p>Whether to preview this request.</p><ul><li><strong>false</strong> (default): Send a normal request to directly modify the target group.</li><li><strong>true</strong>: Send a preview request to check whether the parameters, format, and service limits for modifying the target group meet the requirements.</li></ul>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get <p>Health check configuration.</p> 
     * @return HealthCheckConfig <p>Health check configuration.</p>
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return this.HealthCheckConfig;
    }

    /**
     * Set <p>Health check configuration.</p>
     * @param HealthCheckConfig <p>Health check configuration.</p>
     */
    public void setHealthCheckConfig(HealthCheckConfig HealthCheckConfig) {
        this.HealthCheckConfig = HealthCheckConfig;
    }

    /**
     * Get <p>Whether to enable long connections.</p> 
     * @return KeepaliveEnabled <p>Whether to enable long connections.</p>
     */
    public Boolean getKeepaliveEnabled() {
        return this.KeepaliveEnabled;
    }

    /**
     * Set <p>Whether to enable long connections.</p>
     * @param KeepaliveEnabled <p>Whether to enable long connections.</p>
     */
    public void setKeepaliveEnabled(Boolean KeepaliveEnabled) {
        this.KeepaliveEnabled = KeepaliveEnabled;
    }

    /**
     * Get <p>Scheduling algorithm. Values:</p><ul><li><strong>wrr</strong>: weighted polling. Real servers are selected by weight. The higher the weight, the more chances a server stands to be polled.</li><li><strong>wlc</strong>: number of weighted least connections. When weight values of different real servers are the same, the server with fewer current connections stands more chances to be polled.</li></ul> 
     * @return SchedulerAlgorithm <p>Scheduling algorithm. Values:</p><ul><li><strong>wrr</strong>: weighted polling. Real servers are selected by weight. The higher the weight, the more chances a server stands to be polled.</li><li><strong>wlc</strong>: number of weighted least connections. When weight values of different real servers are the same, the server with fewer current connections stands more chances to be polled.</li></ul>
     */
    public String getSchedulerAlgorithm() {
        return this.SchedulerAlgorithm;
    }

    /**
     * Set <p>Scheduling algorithm. Values:</p><ul><li><strong>wrr</strong>: weighted polling. Real servers are selected by weight. The higher the weight, the more chances a server stands to be polled.</li><li><strong>wlc</strong>: number of weighted least connections. When weight values of different real servers are the same, the server with fewer current connections stands more chances to be polled.</li></ul>
     * @param SchedulerAlgorithm <p>Scheduling algorithm. Values:</p><ul><li><strong>wrr</strong>: weighted polling. Real servers are selected by weight. The higher the weight, the more chances a server stands to be polled.</li><li><strong>wlc</strong>: number of weighted least connections. When weight values of different real servers are the same, the server with fewer current connections stands more chances to be polled.</li></ul>
     */
    public void setSchedulerAlgorithm(String SchedulerAlgorithm) {
        this.SchedulerAlgorithm = SchedulerAlgorithm;
    }

    /**
     * Get <p>Session persistence configuration.</p> 
     * @return StickySessionConfig <p>Session persistence configuration.</p>
     */
    public StickySessionConfig getStickySessionConfig() {
        return this.StickySessionConfig;
    }

    /**
     * Set <p>Session persistence configuration.</p>
     * @param StickySessionConfig <p>Session persistence configuration.</p>
     */
    public void setStickySessionConfig(StickySessionConfig StickySessionConfig) {
        this.StickySessionConfig = StickySessionConfig;
    }

    /**
     * Get <p>Target group ID, format: lbtg- followed by 8 alphanumeric characters.</p> 
     * @return TargetGroupId <p>Target group ID, format: lbtg- followed by 8 alphanumeric characters.</p>
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set <p>Target group ID, format: lbtg- followed by 8 alphanumeric characters.</p>
     * @param TargetGroupId <p>Target group ID, format: lbtg- followed by 8 alphanumeric characters.</p>
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get <p>Target group name. It can contain 1–255 characters, consisting of digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-). If no target group name is specified, the ID is used as the target group name by default.</p> 
     * @return TargetGroupName <p>Target group name. It can contain 1–255 characters, consisting of digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-). If no target group name is specified, the ID is used as the target group name by default.</p>
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set <p>Target group name. It can contain 1–255 characters, consisting of digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-). If no target group name is specified, the ID is used as the target group name by default.</p>
     * @param TargetGroupName <p>Target group name. It can contain 1–255 characters, consisting of digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-). If no target group name is specified, the ID is used as the target group name by default.</p>
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    public ModifyTargetGroupAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTargetGroupAttributesRequest(ModifyTargetGroupAttributesRequest source) {
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.HealthCheckConfig != null) {
            this.HealthCheckConfig = new HealthCheckConfig(source.HealthCheckConfig);
        }
        if (source.KeepaliveEnabled != null) {
            this.KeepaliveEnabled = new Boolean(source.KeepaliveEnabled);
        }
        if (source.SchedulerAlgorithm != null) {
            this.SchedulerAlgorithm = new String(source.SchedulerAlgorithm);
        }
        if (source.StickySessionConfig != null) {
            this.StickySessionConfig = new StickySessionConfig(source.StickySessionConfig);
        }
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamObj(map, prefix + "HealthCheckConfig.", this.HealthCheckConfig);
        this.setParamSimple(map, prefix + "KeepaliveEnabled", this.KeepaliveEnabled);
        this.setParamSimple(map, prefix + "SchedulerAlgorithm", this.SchedulerAlgorithm);
        this.setParamObj(map, prefix + "StickySessionConfig.", this.StickySessionConfig);
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);

    }
}

