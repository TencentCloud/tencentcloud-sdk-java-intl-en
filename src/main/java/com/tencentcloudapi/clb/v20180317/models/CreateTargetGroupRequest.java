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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTargetGroupRequest extends AbstractModel{

    /**
    * Target group name (up to 50 characters)
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * `vpcid` attribute of a target group. If this parameter is left empty, the default VPC will be used.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Default port of a target group, which can be used for subsequently added servers.
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
     * Get Target group name (up to 50 characters) 
     * @return TargetGroupName Target group name (up to 50 characters)
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set Target group name (up to 50 characters)
     * @param TargetGroupName Target group name (up to 50 characters)
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get `vpcid` attribute of a target group. If this parameter is left empty, the default VPC will be used. 
     * @return VpcId `vpcid` attribute of a target group. If this parameter is left empty, the default VPC will be used.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `vpcid` attribute of a target group. If this parameter is left empty, the default VPC will be used.
     * @param VpcId `vpcid` attribute of a target group. If this parameter is left empty, the default VPC will be used.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Default port of a target group, which can be used for subsequently added servers. 
     * @return Port Default port of a target group, which can be used for subsequently added servers.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Default port of a target group, which can be used for subsequently added servers.
     * @param Port Default port of a target group, which can be used for subsequently added servers.
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArrayObj(map, prefix + "TargetGroupInstances.", this.TargetGroupInstances);

    }
}

