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

public class KongUpstreamInfo extends AbstractModel {

    /**
    * IP or domain
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Service source ID
    */
    @SerializedName("SourceID")
    @Expose
    private String SourceID;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Service (registration center or service in Kubernetes) name
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * The backend type is IPList when provided by the service
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Targets")
    @Expose
    private KongTarget [] Targets;

    /**
    * Service source type
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * SCF Function Type
    */
    @SerializedName("ScfType")
    @Expose
    private String ScfType;

    /**
    * SCF function namespace
    */
    @SerializedName("ScfNamespace")
    @Expose
    private String ScfNamespace;

    /**
    * SCF Function Name
    */
    @SerializedName("ScfLambdaName")
    @Expose
    private String ScfLambdaName;

    /**
    * SCF Function Version
    */
    @SerializedName("ScfLambdaQualifier")
    @Expose
    private String ScfLambdaQualifier;

    /**
    * Cold start time, in seconds
    */
    @SerializedName("SlowStart")
    @Expose
    private Long SlowStart;

    /**
    * Load balancing algorithm, defaults to round-robin, also supports least-connections, consisten_hashing
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * Auto scaling group ID of CVM
    */
    @SerializedName("AutoScalingGroupID")
    @Expose
    private String AutoScalingGroupID;

    /**
    * CVM auto scaling group port
    */
    @SerializedName("AutoScalingCvmPort")
    @Expose
    private Long AutoScalingCvmPort;

    /**
    * TAT command status of the CVM used in the auto scaling group
    */
    @SerializedName("AutoScalingTatCmdStatus")
    @Expose
    private String AutoScalingTatCmdStatus;

    /**
    * CVM auto scaling group lifecycle hook status
    */
    @SerializedName("AutoScalingHookStatus")
    @Expose
    private String AutoScalingHookStatus;

    /**
    * Service source name.
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * Precise service source type. Type passed in when creating a service source.
    */
    @SerializedName("RealSourceType")
    @Expose
    private String RealSourceType;

    /**
    * upstream health status HEALTHY (healthy), UNHEALTHY (abnormal), HEALTHCHECKS_OFF (not enabled), and NONE (health checks not supported)
    */
    @SerializedName("HealthStatus")
    @Expose
    private String HealthStatus;

    /**
    * Whether CAM authentication is enabled for SCF. Enabled by default (true) when left blank.
    */
    @SerializedName("ScfCamAuthEnable")
    @Expose
    private Boolean ScfCamAuthEnable;

    /**
    * Whether Base64 encoding is enabled for SCF, default false
    */
    @SerializedName("ScfIsBase64Encoded")
    @Expose
    private Boolean ScfIsBase64Encoded;

    /**
    * Whether response integration is enabled for the cloud function, default false
    */
    @SerializedName("ScfIsIntegratedResponse")
    @Expose
    private Boolean ScfIsIntegratedResponse;

    /**
     * Get IP or domain 
     * @return Host IP or domain
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set IP or domain
     * @param Host IP or domain
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Port. 
     * @return Port Port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port.
     * @param Port Port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Service source ID 
     * @return SourceID Service source ID
     */
    public String getSourceID() {
        return this.SourceID;
    }

    /**
     * Set Service source ID
     * @param SourceID Service source ID
     */
    public void setSourceID(String SourceID) {
        this.SourceID = SourceID;
    }

    /**
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Service (registration center or service in Kubernetes) name 
     * @return ServiceName Service (registration center or service in Kubernetes) name
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service (registration center or service in Kubernetes) name
     * @param ServiceName Service (registration center or service in Kubernetes) name
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get The backend type is IPList when provided by the service
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Targets The backend type is IPList when provided by the service
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KongTarget [] getTargets() {
        return this.Targets;
    }

    /**
     * Set The backend type is IPList when provided by the service
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Targets The backend type is IPList when provided by the service
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargets(KongTarget [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get Service source type 
     * @return SourceType Service source type
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Service source type
     * @param SourceType Service source type
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get SCF Function Type 
     * @return ScfType SCF Function Type
     */
    public String getScfType() {
        return this.ScfType;
    }

    /**
     * Set SCF Function Type
     * @param ScfType SCF Function Type
     */
    public void setScfType(String ScfType) {
        this.ScfType = ScfType;
    }

    /**
     * Get SCF function namespace 
     * @return ScfNamespace SCF function namespace
     */
    public String getScfNamespace() {
        return this.ScfNamespace;
    }

    /**
     * Set SCF function namespace
     * @param ScfNamespace SCF function namespace
     */
    public void setScfNamespace(String ScfNamespace) {
        this.ScfNamespace = ScfNamespace;
    }

    /**
     * Get SCF Function Name 
     * @return ScfLambdaName SCF Function Name
     */
    public String getScfLambdaName() {
        return this.ScfLambdaName;
    }

    /**
     * Set SCF Function Name
     * @param ScfLambdaName SCF Function Name
     */
    public void setScfLambdaName(String ScfLambdaName) {
        this.ScfLambdaName = ScfLambdaName;
    }

    /**
     * Get SCF Function Version 
     * @return ScfLambdaQualifier SCF Function Version
     */
    public String getScfLambdaQualifier() {
        return this.ScfLambdaQualifier;
    }

    /**
     * Set SCF Function Version
     * @param ScfLambdaQualifier SCF Function Version
     */
    public void setScfLambdaQualifier(String ScfLambdaQualifier) {
        this.ScfLambdaQualifier = ScfLambdaQualifier;
    }

    /**
     * Get Cold start time, in seconds 
     * @return SlowStart Cold start time, in seconds
     */
    public Long getSlowStart() {
        return this.SlowStart;
    }

    /**
     * Set Cold start time, in seconds
     * @param SlowStart Cold start time, in seconds
     */
    public void setSlowStart(Long SlowStart) {
        this.SlowStart = SlowStart;
    }

    /**
     * Get Load balancing algorithm, defaults to round-robin, also supports least-connections, consisten_hashing 
     * @return Algorithm Load balancing algorithm, defaults to round-robin, also supports least-connections, consisten_hashing
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set Load balancing algorithm, defaults to round-robin, also supports least-connections, consisten_hashing
     * @param Algorithm Load balancing algorithm, defaults to round-robin, also supports least-connections, consisten_hashing
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get Auto scaling group ID of CVM 
     * @return AutoScalingGroupID Auto scaling group ID of CVM
     */
    public String getAutoScalingGroupID() {
        return this.AutoScalingGroupID;
    }

    /**
     * Set Auto scaling group ID of CVM
     * @param AutoScalingGroupID Auto scaling group ID of CVM
     */
    public void setAutoScalingGroupID(String AutoScalingGroupID) {
        this.AutoScalingGroupID = AutoScalingGroupID;
    }

    /**
     * Get CVM auto scaling group port 
     * @return AutoScalingCvmPort CVM auto scaling group port
     */
    public Long getAutoScalingCvmPort() {
        return this.AutoScalingCvmPort;
    }

    /**
     * Set CVM auto scaling group port
     * @param AutoScalingCvmPort CVM auto scaling group port
     */
    public void setAutoScalingCvmPort(Long AutoScalingCvmPort) {
        this.AutoScalingCvmPort = AutoScalingCvmPort;
    }

    /**
     * Get TAT command status of the CVM used in the auto scaling group 
     * @return AutoScalingTatCmdStatus TAT command status of the CVM used in the auto scaling group
     */
    public String getAutoScalingTatCmdStatus() {
        return this.AutoScalingTatCmdStatus;
    }

    /**
     * Set TAT command status of the CVM used in the auto scaling group
     * @param AutoScalingTatCmdStatus TAT command status of the CVM used in the auto scaling group
     */
    public void setAutoScalingTatCmdStatus(String AutoScalingTatCmdStatus) {
        this.AutoScalingTatCmdStatus = AutoScalingTatCmdStatus;
    }

    /**
     * Get CVM auto scaling group lifecycle hook status 
     * @return AutoScalingHookStatus CVM auto scaling group lifecycle hook status
     */
    public String getAutoScalingHookStatus() {
        return this.AutoScalingHookStatus;
    }

    /**
     * Set CVM auto scaling group lifecycle hook status
     * @param AutoScalingHookStatus CVM auto scaling group lifecycle hook status
     */
    public void setAutoScalingHookStatus(String AutoScalingHookStatus) {
        this.AutoScalingHookStatus = AutoScalingHookStatus;
    }

    /**
     * Get Service source name. 
     * @return SourceName Service source name.
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set Service source name.
     * @param SourceName Service source name.
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get Precise service source type. Type passed in when creating a service source. 
     * @return RealSourceType Precise service source type. Type passed in when creating a service source.
     */
    public String getRealSourceType() {
        return this.RealSourceType;
    }

    /**
     * Set Precise service source type. Type passed in when creating a service source.
     * @param RealSourceType Precise service source type. Type passed in when creating a service source.
     */
    public void setRealSourceType(String RealSourceType) {
        this.RealSourceType = RealSourceType;
    }

    /**
     * Get upstream health status HEALTHY (healthy), UNHEALTHY (abnormal), HEALTHCHECKS_OFF (not enabled), and NONE (health checks not supported) 
     * @return HealthStatus upstream health status HEALTHY (healthy), UNHEALTHY (abnormal), HEALTHCHECKS_OFF (not enabled), and NONE (health checks not supported)
     */
    public String getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set upstream health status HEALTHY (healthy), UNHEALTHY (abnormal), HEALTHCHECKS_OFF (not enabled), and NONE (health checks not supported)
     * @param HealthStatus upstream health status HEALTHY (healthy), UNHEALTHY (abnormal), HEALTHCHECKS_OFF (not enabled), and NONE (health checks not supported)
     */
    public void setHealthStatus(String HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get Whether CAM authentication is enabled for SCF. Enabled by default (true) when left blank. 
     * @return ScfCamAuthEnable Whether CAM authentication is enabled for SCF. Enabled by default (true) when left blank.
     */
    public Boolean getScfCamAuthEnable() {
        return this.ScfCamAuthEnable;
    }

    /**
     * Set Whether CAM authentication is enabled for SCF. Enabled by default (true) when left blank.
     * @param ScfCamAuthEnable Whether CAM authentication is enabled for SCF. Enabled by default (true) when left blank.
     */
    public void setScfCamAuthEnable(Boolean ScfCamAuthEnable) {
        this.ScfCamAuthEnable = ScfCamAuthEnable;
    }

    /**
     * Get Whether Base64 encoding is enabled for SCF, default false 
     * @return ScfIsBase64Encoded Whether Base64 encoding is enabled for SCF, default false
     */
    public Boolean getScfIsBase64Encoded() {
        return this.ScfIsBase64Encoded;
    }

    /**
     * Set Whether Base64 encoding is enabled for SCF, default false
     * @param ScfIsBase64Encoded Whether Base64 encoding is enabled for SCF, default false
     */
    public void setScfIsBase64Encoded(Boolean ScfIsBase64Encoded) {
        this.ScfIsBase64Encoded = ScfIsBase64Encoded;
    }

    /**
     * Get Whether response integration is enabled for the cloud function, default false 
     * @return ScfIsIntegratedResponse Whether response integration is enabled for the cloud function, default false
     */
    public Boolean getScfIsIntegratedResponse() {
        return this.ScfIsIntegratedResponse;
    }

    /**
     * Set Whether response integration is enabled for the cloud function, default false
     * @param ScfIsIntegratedResponse Whether response integration is enabled for the cloud function, default false
     */
    public void setScfIsIntegratedResponse(Boolean ScfIsIntegratedResponse) {
        this.ScfIsIntegratedResponse = ScfIsIntegratedResponse;
    }

    public KongUpstreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongUpstreamInfo(KongUpstreamInfo source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.SourceID != null) {
            this.SourceID = new String(source.SourceID);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Targets != null) {
            this.Targets = new KongTarget[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new KongTarget(source.Targets[i]);
            }
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.ScfType != null) {
            this.ScfType = new String(source.ScfType);
        }
        if (source.ScfNamespace != null) {
            this.ScfNamespace = new String(source.ScfNamespace);
        }
        if (source.ScfLambdaName != null) {
            this.ScfLambdaName = new String(source.ScfLambdaName);
        }
        if (source.ScfLambdaQualifier != null) {
            this.ScfLambdaQualifier = new String(source.ScfLambdaQualifier);
        }
        if (source.SlowStart != null) {
            this.SlowStart = new Long(source.SlowStart);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.AutoScalingGroupID != null) {
            this.AutoScalingGroupID = new String(source.AutoScalingGroupID);
        }
        if (source.AutoScalingCvmPort != null) {
            this.AutoScalingCvmPort = new Long(source.AutoScalingCvmPort);
        }
        if (source.AutoScalingTatCmdStatus != null) {
            this.AutoScalingTatCmdStatus = new String(source.AutoScalingTatCmdStatus);
        }
        if (source.AutoScalingHookStatus != null) {
            this.AutoScalingHookStatus = new String(source.AutoScalingHookStatus);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.RealSourceType != null) {
            this.RealSourceType = new String(source.RealSourceType);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new String(source.HealthStatus);
        }
        if (source.ScfCamAuthEnable != null) {
            this.ScfCamAuthEnable = new Boolean(source.ScfCamAuthEnable);
        }
        if (source.ScfIsBase64Encoded != null) {
            this.ScfIsBase64Encoded = new Boolean(source.ScfIsBase64Encoded);
        }
        if (source.ScfIsIntegratedResponse != null) {
            this.ScfIsIntegratedResponse = new Boolean(source.ScfIsIntegratedResponse);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "SourceID", this.SourceID);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "ScfType", this.ScfType);
        this.setParamSimple(map, prefix + "ScfNamespace", this.ScfNamespace);
        this.setParamSimple(map, prefix + "ScfLambdaName", this.ScfLambdaName);
        this.setParamSimple(map, prefix + "ScfLambdaQualifier", this.ScfLambdaQualifier);
        this.setParamSimple(map, prefix + "SlowStart", this.SlowStart);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "AutoScalingGroupID", this.AutoScalingGroupID);
        this.setParamSimple(map, prefix + "AutoScalingCvmPort", this.AutoScalingCvmPort);
        this.setParamSimple(map, prefix + "AutoScalingTatCmdStatus", this.AutoScalingTatCmdStatus);
        this.setParamSimple(map, prefix + "AutoScalingHookStatus", this.AutoScalingHookStatus);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "RealSourceType", this.RealSourceType);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);
        this.setParamSimple(map, prefix + "ScfCamAuthEnable", this.ScfCamAuthEnable);
        this.setParamSimple(map, prefix + "ScfIsBase64Encoded", this.ScfIsBase64Encoded);
        this.setParamSimple(map, prefix + "ScfIsIntegratedResponse", this.ScfIsIntegratedResponse);

    }
}

