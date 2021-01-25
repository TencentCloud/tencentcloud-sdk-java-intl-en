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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupAssociationStatistics extends AbstractModel{

    /**
    * Security group instance ID.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Number of CVM instances.
    */
    @SerializedName("CVM")
    @Expose
    private Long CVM;

    /**
    * Number of TencentDB for MySQL instances
    */
    @SerializedName("CDB")
    @Expose
    private Long CDB;

    /**
    * Number of ENI instances.
    */
    @SerializedName("ENI")
    @Expose
    private Long ENI;

    /**
    * Number of times a security group is referenced by other security groups
    */
    @SerializedName("SG")
    @Expose
    private Long SG;

    /**
    * Number of load balancer instances.
    */
    @SerializedName("CLB")
    @Expose
    private Long CLB;

    /**
    * The binding statistics for all instances.
    */
    @SerializedName("InstanceStatistics")
    @Expose
    private InstanceStatistic [] InstanceStatistics;

    /**
    * Total count of all resources (excluding resources referenced by security groups).
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
     * Get Number of CVM instances. 
     * @return CVM Number of CVM instances.
     */
    public Long getCVM() {
        return this.CVM;
    }

    /**
     * Set Number of CVM instances.
     * @param CVM Number of CVM instances.
     */
    public void setCVM(Long CVM) {
        this.CVM = CVM;
    }

    /**
     * Get Number of TencentDB for MySQL instances 
     * @return CDB Number of TencentDB for MySQL instances
     */
    public Long getCDB() {
        return this.CDB;
    }

    /**
     * Set Number of TencentDB for MySQL instances
     * @param CDB Number of TencentDB for MySQL instances
     */
    public void setCDB(Long CDB) {
        this.CDB = CDB;
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
     * Get Number of times a security group is referenced by other security groups 
     * @return SG Number of times a security group is referenced by other security groups
     */
    public Long getSG() {
        return this.SG;
    }

    /**
     * Set Number of times a security group is referenced by other security groups
     * @param SG Number of times a security group is referenced by other security groups
     */
    public void setSG(Long SG) {
        this.SG = SG;
    }

    /**
     * Get Number of load balancer instances. 
     * @return CLB Number of load balancer instances.
     */
    public Long getCLB() {
        return this.CLB;
    }

    /**
     * Set Number of load balancer instances.
     * @param CLB Number of load balancer instances.
     */
    public void setCLB(Long CLB) {
        this.CLB = CLB;
    }

    /**
     * Get The binding statistics for all instances. 
     * @return InstanceStatistics The binding statistics for all instances.
     */
    public InstanceStatistic [] getInstanceStatistics() {
        return this.InstanceStatistics;
    }

    /**
     * Set The binding statistics for all instances.
     * @param InstanceStatistics The binding statistics for all instances.
     */
    public void setInstanceStatistics(InstanceStatistic [] InstanceStatistics) {
        this.InstanceStatistics = InstanceStatistics;
    }

    /**
     * Get Total count of all resources (excluding resources referenced by security groups). 
     * @return TotalCount Total count of all resources (excluding resources referenced by security groups).
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total count of all resources (excluding resources referenced by security groups).
     * @param TotalCount Total count of all resources (excluding resources referenced by security groups).
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "CVM", this.CVM);
        this.setParamSimple(map, prefix + "CDB", this.CDB);
        this.setParamSimple(map, prefix + "ENI", this.ENI);
        this.setParamSimple(map, prefix + "SG", this.SG);
        this.setParamSimple(map, prefix + "CLB", this.CLB);
        this.setParamArrayObj(map, prefix + "InstanceStatistics.", this.InstanceStatistics);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

