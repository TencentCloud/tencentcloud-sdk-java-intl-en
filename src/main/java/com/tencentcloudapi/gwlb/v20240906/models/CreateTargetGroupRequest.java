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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTargetGroupRequest extends AbstractModel {

    /**
    * Target group name, up to 50 characters
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * VPCID attribute of target group. If this parameter is left blank, the default VPC will be used.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Default port of target group. This default port can be used when servers are added subsequently. Either Port or port in TargetGroupInstances.N is required.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Real server bound to a target group
    */
    @SerializedName("TargetGroupInstances")
    @Expose
    private TargetGroupInstance [] TargetGroupInstances;

    /**
    * GWLB target group protocol.- AWS_GENEVE: GENEVE compatible protocol - TENCENT_GENEVE: GENEVE standard protocol
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Health check.
    */
    @SerializedName("HealthCheck")
    @Expose
    private TargetGroupHealthCheck HealthCheck;

    /**
    * RS scheduling algorithm.- IP_HASH_3_ELASTIC: elastic hashing
    */
    @SerializedName("ScheduleAlgorithm")
    @Expose
    private String ScheduleAlgorithm;

    /**
    * Whether "All Dead, All Alive" is supported. It is supported by default.
    */
    @SerializedName("AllDeadToAlive")
    @Expose
    private Boolean AllDeadToAlive;

    /**
     * Get Target group name, up to 50 characters 
     * @return TargetGroupName Target group name, up to 50 characters
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set Target group name, up to 50 characters
     * @param TargetGroupName Target group name, up to 50 characters
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get VPCID attribute of target group. If this parameter is left blank, the default VPC will be used. 
     * @return VpcId VPCID attribute of target group. If this parameter is left blank, the default VPC will be used.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPCID attribute of target group. If this parameter is left blank, the default VPC will be used.
     * @param VpcId VPCID attribute of target group. If this parameter is left blank, the default VPC will be used.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Default port of target group. This default port can be used when servers are added subsequently. Either Port or port in TargetGroupInstances.N is required. 
     * @return Port Default port of target group. This default port can be used when servers are added subsequently. Either Port or port in TargetGroupInstances.N is required.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Default port of target group. This default port can be used when servers are added subsequently. Either Port or port in TargetGroupInstances.N is required.
     * @param Port Default port of target group. This default port can be used when servers are added subsequently. Either Port or port in TargetGroupInstances.N is required.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Real server bound to a target group 
     * @return TargetGroupInstances Real server bound to a target group
     */
    public TargetGroupInstance [] getTargetGroupInstances() {
        return this.TargetGroupInstances;
    }

    /**
     * Set Real server bound to a target group
     * @param TargetGroupInstances Real server bound to a target group
     */
    public void setTargetGroupInstances(TargetGroupInstance [] TargetGroupInstances) {
        this.TargetGroupInstances = TargetGroupInstances;
    }

    /**
     * Get GWLB target group protocol.- AWS_GENEVE: GENEVE compatible protocol - TENCENT_GENEVE: GENEVE standard protocol 
     * @return Protocol GWLB target group protocol.- AWS_GENEVE: GENEVE compatible protocol - TENCENT_GENEVE: GENEVE standard protocol
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set GWLB target group protocol.- AWS_GENEVE: GENEVE compatible protocol - TENCENT_GENEVE: GENEVE standard protocol
     * @param Protocol GWLB target group protocol.- AWS_GENEVE: GENEVE compatible protocol - TENCENT_GENEVE: GENEVE standard protocol
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Health check. 
     * @return HealthCheck Health check.
     */
    public TargetGroupHealthCheck getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set Health check.
     * @param HealthCheck Health check.
     */
    public void setHealthCheck(TargetGroupHealthCheck HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get RS scheduling algorithm.- IP_HASH_3_ELASTIC: elastic hashing 
     * @return ScheduleAlgorithm RS scheduling algorithm.- IP_HASH_3_ELASTIC: elastic hashing
     */
    public String getScheduleAlgorithm() {
        return this.ScheduleAlgorithm;
    }

    /**
     * Set RS scheduling algorithm.- IP_HASH_3_ELASTIC: elastic hashing
     * @param ScheduleAlgorithm RS scheduling algorithm.- IP_HASH_3_ELASTIC: elastic hashing
     */
    public void setScheduleAlgorithm(String ScheduleAlgorithm) {
        this.ScheduleAlgorithm = ScheduleAlgorithm;
    }

    /**
     * Get Whether "All Dead, All Alive" is supported. It is supported by default. 
     * @return AllDeadToAlive Whether "All Dead, All Alive" is supported. It is supported by default.
     */
    public Boolean getAllDeadToAlive() {
        return this.AllDeadToAlive;
    }

    /**
     * Set Whether "All Dead, All Alive" is supported. It is supported by default.
     * @param AllDeadToAlive Whether "All Dead, All Alive" is supported. It is supported by default.
     */
    public void setAllDeadToAlive(Boolean AllDeadToAlive) {
        this.AllDeadToAlive = AllDeadToAlive;
    }

    public CreateTargetGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTargetGroupRequest(CreateTargetGroupRequest source) {
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.TargetGroupInstances != null) {
            this.TargetGroupInstances = new TargetGroupInstance[source.TargetGroupInstances.length];
            for (int i = 0; i < source.TargetGroupInstances.length; i++) {
                this.TargetGroupInstances[i] = new TargetGroupInstance(source.TargetGroupInstances[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new TargetGroupHealthCheck(source.HealthCheck);
        }
        if (source.ScheduleAlgorithm != null) {
            this.ScheduleAlgorithm = new String(source.ScheduleAlgorithm);
        }
        if (source.AllDeadToAlive != null) {
            this.AllDeadToAlive = new Boolean(source.AllDeadToAlive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArrayObj(map, prefix + "TargetGroupInstances.", this.TargetGroupInstances);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamObj(map, prefix + "HealthCheck.", this.HealthCheck);
        this.setParamSimple(map, prefix + "ScheduleAlgorithm", this.ScheduleAlgorithm);
        this.setParamSimple(map, prefix + "AllDeadToAlive", this.AllDeadToAlive);

    }
}

