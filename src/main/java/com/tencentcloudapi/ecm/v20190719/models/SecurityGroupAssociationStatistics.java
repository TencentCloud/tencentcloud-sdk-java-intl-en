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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupAssociationStatistics extends AbstractModel {

    /**
    * Security group instance ID.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Number of ECM instances.
    */
    @SerializedName("ECM")
    @Expose
    private Long ECM;

    /**
    * Number of ECM modules.
    */
    @SerializedName("Module")
    @Expose
    private Long Module;

    /**
    * Number of ENI instances.
    */
    @SerializedName("ENI")
    @Expose
    private Long ENI;

    /**
    * Number of times the security group is referenced by other security groups.
    */
    @SerializedName("SG")
    @Expose
    private Long SG;

    /**
    * Number of CLB instances.
    */
    @SerializedName("CLB")
    @Expose
    private Long CLB;

    /**
    * Binding statistics of all instances.
    */
    @SerializedName("InstanceStatistics")
    @Expose
    private InstanceStatistic [] InstanceStatistics;

    /**
    * Total number of all resources (excluding resources referenced by security groups).
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get Security group instance ID. 
     * @return SecurityGroupId Security group instance ID.
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group instance ID.
     * @param SecurityGroupId Security group instance ID.
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get Number of ECM instances. 
     * @return ECM Number of ECM instances.
     */
    public Long getECM() {
        return this.ECM;
    }

    /**
     * Set Number of ECM instances.
     * @param ECM Number of ECM instances.
     */
    public void setECM(Long ECM) {
        this.ECM = ECM;
    }

    /**
     * Get Number of ECM modules. 
     * @return Module Number of ECM modules.
     */
    public Long getModule() {
        return this.Module;
    }

    /**
     * Set Number of ECM modules.
     * @param Module Number of ECM modules.
     */
    public void setModule(Long Module) {
        this.Module = Module;
    }

    /**
     * Get Number of ENI instances. 
     * @return ENI Number of ENI instances.
     */
    public Long getENI() {
        return this.ENI;
    }

    /**
     * Set Number of ENI instances.
     * @param ENI Number of ENI instances.
     */
    public void setENI(Long ENI) {
        this.ENI = ENI;
    }

    /**
     * Get Number of times the security group is referenced by other security groups. 
     * @return SG Number of times the security group is referenced by other security groups.
     */
    public Long getSG() {
        return this.SG;
    }

    /**
     * Set Number of times the security group is referenced by other security groups.
     * @param SG Number of times the security group is referenced by other security groups.
     */
    public void setSG(Long SG) {
        this.SG = SG;
    }

    /**
     * Get Number of CLB instances. 
     * @return CLB Number of CLB instances.
     */
    public Long getCLB() {
        return this.CLB;
    }

    /**
     * Set Number of CLB instances.
     * @param CLB Number of CLB instances.
     */
    public void setCLB(Long CLB) {
        this.CLB = CLB;
    }

    /**
     * Get Binding statistics of all instances. 
     * @return InstanceStatistics Binding statistics of all instances.
     */
    public InstanceStatistic [] getInstanceStatistics() {
        return this.InstanceStatistics;
    }

    /**
     * Set Binding statistics of all instances.
     * @param InstanceStatistics Binding statistics of all instances.
     */
    public void setInstanceStatistics(InstanceStatistic [] InstanceStatistics) {
        this.InstanceStatistics = InstanceStatistics;
    }

    /**
     * Get Total number of all resources (excluding resources referenced by security groups). 
     * @return TotalCount Total number of all resources (excluding resources referenced by security groups).
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of all resources (excluding resources referenced by security groups).
     * @param TotalCount Total number of all resources (excluding resources referenced by security groups).
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public SecurityGroupAssociationStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupAssociationStatistics(SecurityGroupAssociationStatistics source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.ECM != null) {
            this.ECM = new Long(source.ECM);
        }
        if (source.Module != null) {
            this.Module = new Long(source.Module);
        }
        if (source.ENI != null) {
            this.ENI = new Long(source.ENI);
        }
        if (source.SG != null) {
            this.SG = new Long(source.SG);
        }
        if (source.CLB != null) {
            this.CLB = new Long(source.CLB);
        }
        if (source.InstanceStatistics != null) {
            this.InstanceStatistics = new InstanceStatistic[source.InstanceStatistics.length];
            for (int i = 0; i < source.InstanceStatistics.length; i++) {
                this.InstanceStatistics[i] = new InstanceStatistic(source.InstanceStatistics[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "ECM", this.ECM);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "ENI", this.ENI);
        this.setParamSimple(map, prefix + "SG", this.SG);
        this.setParamSimple(map, prefix + "CLB", this.CLB);
        this.setParamArrayObj(map, prefix + "InstanceStatistics.", this.InstanceStatistics);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

