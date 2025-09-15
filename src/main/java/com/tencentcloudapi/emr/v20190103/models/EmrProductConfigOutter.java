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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmrProductConfigOutter extends AbstractModel {

    /**
    * Software information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SoftInfo")
    @Expose
    private String [] SoftInfo;

    /**
    * Number of master nodes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MasterNodeSize")
    @Expose
    private Long MasterNodeSize;

    /**
    * Number of core nodes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoreNodeSize")
    @Expose
    private Long CoreNodeSize;

    /**
    * Number of task nodes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskNodeSize")
    @Expose
    private Long TaskNodeSize;

    /**
    * Number of common nodes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComNodeSize")
    @Expose
    private Long ComNodeSize;

    /**
    * Master node resource
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MasterResource")
    @Expose
    private OutterResource MasterResource;

    /**
    * Core node resource
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoreResource")
    @Expose
    private OutterResource CoreResource;

    /**
    * Task node resource
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskResource")
    @Expose
    private OutterResource TaskResource;

    /**
    * Common node resource
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComResource")
    @Expose
    private OutterResource ComResource;

    /**
    * Whether COS is used
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OnCos")
    @Expose
    private Boolean OnCos;

    /**
    * Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * Number of router nodes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RouterNodeSize")
    @Expose
    private Long RouterNodeSize;

    /**
    * Whether HA is supported
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportHA")
    @Expose
    private Boolean SupportHA;

    /**
    * Whether secure mode is supported
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityOn")
    @Expose
    private Boolean SecurityOn;

    /**
    * Initial security group ID of the cluster.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
    * Whether to enable CBS encryption
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CbsEncrypt")
    @Expose
    private Long CbsEncrypt;

    /**
    * Custom application role
Note: this field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ApplicationRole")
    @Expose
    private String ApplicationRole;

    /**
    * Security group ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * SSH key ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicKeyId")
    @Expose
    private String PublicKeyId;

    /**
     * Get Software information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SoftInfo Software information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSoftInfo() {
        return this.SoftInfo;
    }

    /**
     * Set Software information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SoftInfo Software information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSoftInfo(String [] SoftInfo) {
        this.SoftInfo = SoftInfo;
    }

    /**
     * Get Number of master nodes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MasterNodeSize Number of master nodes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMasterNodeSize() {
        return this.MasterNodeSize;
    }

    /**
     * Set Number of master nodes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MasterNodeSize Number of master nodes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMasterNodeSize(Long MasterNodeSize) {
        this.MasterNodeSize = MasterNodeSize;
    }

    /**
     * Get Number of core nodes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CoreNodeSize Number of core nodes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCoreNodeSize() {
        return this.CoreNodeSize;
    }

    /**
     * Set Number of core nodes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CoreNodeSize Number of core nodes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCoreNodeSize(Long CoreNodeSize) {
        this.CoreNodeSize = CoreNodeSize;
    }

    /**
     * Get Number of task nodes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TaskNodeSize Number of task nodes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTaskNodeSize() {
        return this.TaskNodeSize;
    }

    /**
     * Set Number of task nodes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TaskNodeSize Number of task nodes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskNodeSize(Long TaskNodeSize) {
        this.TaskNodeSize = TaskNodeSize;
    }

    /**
     * Get Number of common nodes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ComNodeSize Number of common nodes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getComNodeSize() {
        return this.ComNodeSize;
    }

    /**
     * Set Number of common nodes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ComNodeSize Number of common nodes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setComNodeSize(Long ComNodeSize) {
        this.ComNodeSize = ComNodeSize;
    }

    /**
     * Get Master node resource
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MasterResource Master node resource
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OutterResource getMasterResource() {
        return this.MasterResource;
    }

    /**
     * Set Master node resource
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MasterResource Master node resource
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMasterResource(OutterResource MasterResource) {
        this.MasterResource = MasterResource;
    }

    /**
     * Get Core node resource
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CoreResource Core node resource
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OutterResource getCoreResource() {
        return this.CoreResource;
    }

    /**
     * Set Core node resource
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CoreResource Core node resource
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCoreResource(OutterResource CoreResource) {
        this.CoreResource = CoreResource;
    }

    /**
     * Get Task node resource
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TaskResource Task node resource
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OutterResource getTaskResource() {
        return this.TaskResource;
    }

    /**
     * Set Task node resource
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TaskResource Task node resource
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskResource(OutterResource TaskResource) {
        this.TaskResource = TaskResource;
    }

    /**
     * Get Common node resource
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ComResource Common node resource
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OutterResource getComResource() {
        return this.ComResource;
    }

    /**
     * Set Common node resource
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ComResource Common node resource
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setComResource(OutterResource ComResource) {
        this.ComResource = ComResource;
    }

    /**
     * Get Whether COS is used
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OnCos Whether COS is used
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getOnCos() {
        return this.OnCos;
    }

    /**
     * Set Whether COS is used
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OnCos Whether COS is used
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOnCos(Boolean OnCos) {
        this.OnCos = OnCos;
    }

    /**
     * Get Billing mode
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ChargeType Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ChargeType Billing mode
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Number of router nodes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RouterNodeSize Number of router nodes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRouterNodeSize() {
        return this.RouterNodeSize;
    }

    /**
     * Set Number of router nodes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RouterNodeSize Number of router nodes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRouterNodeSize(Long RouterNodeSize) {
        this.RouterNodeSize = RouterNodeSize;
    }

    /**
     * Get Whether HA is supported
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SupportHA Whether HA is supported
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSupportHA() {
        return this.SupportHA;
    }

    /**
     * Set Whether HA is supported
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SupportHA Whether HA is supported
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportHA(Boolean SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * Get Whether secure mode is supported
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SecurityOn Whether secure mode is supported
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSecurityOn() {
        return this.SecurityOn;
    }

    /**
     * Set Whether secure mode is supported
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SecurityOn Whether secure mode is supported
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSecurityOn(Boolean SecurityOn) {
        this.SecurityOn = SecurityOn;
    }

    /**
     * Get Initial security group ID of the cluster.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecurityGroup Initial security group ID of the cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Initial security group ID of the cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecurityGroup Initial security group ID of the cluster.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get Whether to enable CBS encryption
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CbsEncrypt Whether to enable CBS encryption
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCbsEncrypt() {
        return this.CbsEncrypt;
    }

    /**
     * Set Whether to enable CBS encryption
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CbsEncrypt Whether to enable CBS encryption
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCbsEncrypt(Long CbsEncrypt) {
        this.CbsEncrypt = CbsEncrypt;
    }

    /**
     * Get Custom application role
Note: this field may return `null`, indicating that no valid value can be obtained. 
     * @return ApplicationRole Custom application role
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public String getApplicationRole() {
        return this.ApplicationRole;
    }

    /**
     * Set Custom application role
Note: this field may return `null`, indicating that no valid value can be obtained.
     * @param ApplicationRole Custom application role
Note: this field may return `null`, indicating that no valid value can be obtained.
     */
    public void setApplicationRole(String ApplicationRole) {
        this.ApplicationRole = ApplicationRole;
    }

    /**
     * Get Security group ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecurityGroups Security group ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set Security group ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecurityGroups Security group ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get SSH key ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return PublicKeyId SSH key ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPublicKeyId() {
        return this.PublicKeyId;
    }

    /**
     * Set SSH key ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param PublicKeyId SSH key ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPublicKeyId(String PublicKeyId) {
        this.PublicKeyId = PublicKeyId;
    }

    public EmrProductConfigOutter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmrProductConfigOutter(EmrProductConfigOutter source) {
        if (source.SoftInfo != null) {
            this.SoftInfo = new String[source.SoftInfo.length];
            for (int i = 0; i < source.SoftInfo.length; i++) {
                this.SoftInfo[i] = new String(source.SoftInfo[i]);
            }
        }
        if (source.MasterNodeSize != null) {
            this.MasterNodeSize = new Long(source.MasterNodeSize);
        }
        if (source.CoreNodeSize != null) {
            this.CoreNodeSize = new Long(source.CoreNodeSize);
        }
        if (source.TaskNodeSize != null) {
            this.TaskNodeSize = new Long(source.TaskNodeSize);
        }
        if (source.ComNodeSize != null) {
            this.ComNodeSize = new Long(source.ComNodeSize);
        }
        if (source.MasterResource != null) {
            this.MasterResource = new OutterResource(source.MasterResource);
        }
        if (source.CoreResource != null) {
            this.CoreResource = new OutterResource(source.CoreResource);
        }
        if (source.TaskResource != null) {
            this.TaskResource = new OutterResource(source.TaskResource);
        }
        if (source.ComResource != null) {
            this.ComResource = new OutterResource(source.ComResource);
        }
        if (source.OnCos != null) {
            this.OnCos = new Boolean(source.OnCos);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new Long(source.ChargeType);
        }
        if (source.RouterNodeSize != null) {
            this.RouterNodeSize = new Long(source.RouterNodeSize);
        }
        if (source.SupportHA != null) {
            this.SupportHA = new Boolean(source.SupportHA);
        }
        if (source.SecurityOn != null) {
            this.SecurityOn = new Boolean(source.SecurityOn);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String(source.SecurityGroup);
        }
        if (source.CbsEncrypt != null) {
            this.CbsEncrypt = new Long(source.CbsEncrypt);
        }
        if (source.ApplicationRole != null) {
            this.ApplicationRole = new String(source.ApplicationRole);
        }
        if (source.SecurityGroups != null) {
            this.SecurityGroups = new String[source.SecurityGroups.length];
            for (int i = 0; i < source.SecurityGroups.length; i++) {
                this.SecurityGroups[i] = new String(source.SecurityGroups[i]);
            }
        }
        if (source.PublicKeyId != null) {
            this.PublicKeyId = new String(source.PublicKeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SoftInfo.", this.SoftInfo);
        this.setParamSimple(map, prefix + "MasterNodeSize", this.MasterNodeSize);
        this.setParamSimple(map, prefix + "CoreNodeSize", this.CoreNodeSize);
        this.setParamSimple(map, prefix + "TaskNodeSize", this.TaskNodeSize);
        this.setParamSimple(map, prefix + "ComNodeSize", this.ComNodeSize);
        this.setParamObj(map, prefix + "MasterResource.", this.MasterResource);
        this.setParamObj(map, prefix + "CoreResource.", this.CoreResource);
        this.setParamObj(map, prefix + "TaskResource.", this.TaskResource);
        this.setParamObj(map, prefix + "ComResource.", this.ComResource);
        this.setParamSimple(map, prefix + "OnCos", this.OnCos);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "RouterNodeSize", this.RouterNodeSize);
        this.setParamSimple(map, prefix + "SupportHA", this.SupportHA);
        this.setParamSimple(map, prefix + "SecurityOn", this.SecurityOn);
        this.setParamSimple(map, prefix + "SecurityGroup", this.SecurityGroup);
        this.setParamSimple(map, prefix + "CbsEncrypt", this.CbsEncrypt);
        this.setParamSimple(map, prefix + "ApplicationRole", this.ApplicationRole);
        this.setParamArraySimple(map, prefix + "SecurityGroups.", this.SecurityGroups);
        this.setParamSimple(map, prefix + "PublicKeyId", this.PublicKeyId);

    }
}

