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

public class CreateTargetGroupRequest extends AbstractModel {

    /**
    * <p>Target Group Type. Value:</p><ul><li><strong>Instance</strong> (default): Cvm server type or Eni type.</li></ul>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>VPC ID.</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Whether to preview this request.</p><ul><li><strong>false</strong> (default): Send a normal request to directly create a target group.</li><li><strong>true</strong>: Send a preview request to check whether the parameters, format, and service limits for target group creation meet the requirements.</li></ul>
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
    * <p>Backend service protocol type. Values:</p><ul><li><strong>HTTP</strong> (default): supports binding HTTP and HTTPS listeners</li><li><strong>HTTPS</strong>: supports binding HTTPS listeners</li><li><strong>GRPC</strong>: supports binding HTTPS listeners</li><li><strong>GRPCS</strong>: supports binding HTTPS listeners</li></ul>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>Scheduling algorithm. Value:</p><ul><li><strong>wrr</strong> (default): weighted polling. Backend servers are selected by weight. The higher the weight, the more likely the server is to be polled.</li><li><strong>wlc</strong>: weighted least connections. When different backend servers have the same weight, the server with fewer current connections is more likely to be polled.</li></ul>
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
    * <p>Tag.</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>Target group name, defaulting to the target group ID. It is <strong>1-255</strong> characters long and can contain digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).</p>
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
     * Get <p>Target Group Type. Value:</p><ul><li><strong>Instance</strong> (default): Cvm server type or Eni type.</li></ul> 
     * @return TargetType <p>Target Group Type. Value:</p><ul><li><strong>Instance</strong> (default): Cvm server type or Eni type.</li></ul>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>Target Group Type. Value:</p><ul><li><strong>Instance</strong> (default): Cvm server type or Eni type.</li></ul>
     * @param TargetType <p>Target Group Type. Value:</p><ul><li><strong>Instance</strong> (default): Cvm server type or Eni type.</li></ul>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>VPC ID.</p> 
     * @return VpcId <p>VPC ID.</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID.</p>
     * @param VpcId <p>VPC ID.</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Whether to preview this request.</p><ul><li><strong>false</strong> (default): Send a normal request to directly create a target group.</li><li><strong>true</strong>: Send a preview request to check whether the parameters, format, and service limits for target group creation meet the requirements.</li></ul> 
     * @return DryRun <p>Whether to preview this request.</p><ul><li><strong>false</strong> (default): Send a normal request to directly create a target group.</li><li><strong>true</strong>: Send a preview request to check whether the parameters, format, and service limits for target group creation meet the requirements.</li></ul>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>Whether to preview this request.</p><ul><li><strong>false</strong> (default): Send a normal request to directly create a target group.</li><li><strong>true</strong>: Send a preview request to check whether the parameters, format, and service limits for target group creation meet the requirements.</li></ul>
     * @param DryRun <p>Whether to preview this request.</p><ul><li><strong>false</strong> (default): Send a normal request to directly create a target group.</li><li><strong>true</strong>: Send a preview request to check whether the parameters, format, and service limits for target group creation meet the requirements.</li></ul>
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
     * Get <p>Backend service protocol type. Values:</p><ul><li><strong>HTTP</strong> (default): supports binding HTTP and HTTPS listeners</li><li><strong>HTTPS</strong>: supports binding HTTPS listeners</li><li><strong>GRPC</strong>: supports binding HTTPS listeners</li><li><strong>GRPCS</strong>: supports binding HTTPS listeners</li></ul> 
     * @return Protocol <p>Backend service protocol type. Values:</p><ul><li><strong>HTTP</strong> (default): supports binding HTTP and HTTPS listeners</li><li><strong>HTTPS</strong>: supports binding HTTPS listeners</li><li><strong>GRPC</strong>: supports binding HTTPS listeners</li><li><strong>GRPCS</strong>: supports binding HTTPS listeners</li></ul>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>Backend service protocol type. Values:</p><ul><li><strong>HTTP</strong> (default): supports binding HTTP and HTTPS listeners</li><li><strong>HTTPS</strong>: supports binding HTTPS listeners</li><li><strong>GRPC</strong>: supports binding HTTPS listeners</li><li><strong>GRPCS</strong>: supports binding HTTPS listeners</li></ul>
     * @param Protocol <p>Backend service protocol type. Values:</p><ul><li><strong>HTTP</strong> (default): supports binding HTTP and HTTPS listeners</li><li><strong>HTTPS</strong>: supports binding HTTPS listeners</li><li><strong>GRPC</strong>: supports binding HTTPS listeners</li><li><strong>GRPCS</strong>: supports binding HTTPS listeners</li></ul>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>Scheduling algorithm. Value:</p><ul><li><strong>wrr</strong> (default): weighted polling. Backend servers are selected by weight. The higher the weight, the more likely the server is to be polled.</li><li><strong>wlc</strong>: weighted least connections. When different backend servers have the same weight, the server with fewer current connections is more likely to be polled.</li></ul> 
     * @return SchedulerAlgorithm <p>Scheduling algorithm. Value:</p><ul><li><strong>wrr</strong> (default): weighted polling. Backend servers are selected by weight. The higher the weight, the more likely the server is to be polled.</li><li><strong>wlc</strong>: weighted least connections. When different backend servers have the same weight, the server with fewer current connections is more likely to be polled.</li></ul>
     */
    public String getSchedulerAlgorithm() {
        return this.SchedulerAlgorithm;
    }

    /**
     * Set <p>Scheduling algorithm. Value:</p><ul><li><strong>wrr</strong> (default): weighted polling. Backend servers are selected by weight. The higher the weight, the more likely the server is to be polled.</li><li><strong>wlc</strong>: weighted least connections. When different backend servers have the same weight, the server with fewer current connections is more likely to be polled.</li></ul>
     * @param SchedulerAlgorithm <p>Scheduling algorithm. Value:</p><ul><li><strong>wrr</strong> (default): weighted polling. Backend servers are selected by weight. The higher the weight, the more likely the server is to be polled.</li><li><strong>wlc</strong>: weighted least connections. When different backend servers have the same weight, the server with fewer current connections is more likely to be polled.</li></ul>
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
     * Get <p>Tag.</p> 
     * @return Tags <p>Tag.</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag.</p>
     * @param Tags <p>Tag.</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Target group name, defaulting to the target group ID. It is <strong>1-255</strong> characters long and can contain digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).</p> 
     * @return TargetGroupName <p>Target group name, defaulting to the target group ID. It is <strong>1-255</strong> characters long and can contain digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).</p>
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set <p>Target group name, defaulting to the target group ID. It is <strong>1-255</strong> characters long and can contain digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).</p>
     * @param TargetGroupName <p>Target group name, defaulting to the target group ID. It is <strong>1-255</strong> characters long and can contain digits, upper- and lower-case letters, Chinese characters, half-width periods (.), underscores (_), and dashes (-).</p>
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    public CreateTargetGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTargetGroupRequest(CreateTargetGroupRequest source) {
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.HealthCheckConfig != null) {
            this.HealthCheckConfig = new HealthCheckConfig(source.HealthCheckConfig);
        }
        if (source.KeepaliveEnabled != null) {
            this.KeepaliveEnabled = new Boolean(source.KeepaliveEnabled);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SchedulerAlgorithm != null) {
            this.SchedulerAlgorithm = new String(source.SchedulerAlgorithm);
        }
        if (source.StickySessionConfig != null) {
            this.StickySessionConfig = new StickySessionConfig(source.StickySessionConfig);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamObj(map, prefix + "HealthCheckConfig.", this.HealthCheckConfig);
        this.setParamSimple(map, prefix + "KeepaliveEnabled", this.KeepaliveEnabled);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "SchedulerAlgorithm", this.SchedulerAlgorithm);
        this.setParamObj(map, prefix + "StickySessionConfig.", this.StickySessionConfig);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);

    }
}

