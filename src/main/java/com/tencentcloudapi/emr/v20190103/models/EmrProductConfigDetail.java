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

public class EmrProductConfigDetail extends AbstractModel {

    /**
    * Software information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SoftInfo")
    @Expose
    private String [] SoftInfo;

    /**
    * Number of Master nodes.
    */
    @SerializedName("MasterNodeSize")
    @Expose
    private Long MasterNodeSize;

    /**
    * Number of Core nodes.
    */
    @SerializedName("CoreNodeSize")
    @Expose
    private Long CoreNodeSize;

    /**
    * Number of Task nodes.
    */
    @SerializedName("TaskNodeSize")
    @Expose
    private Long TaskNodeSize;

    /**
    * Number of Common nodes.
    */
    @SerializedName("ComNodeSize")
    @Expose
    private Long ComNodeSize;

    /**
    * Primary node resources

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MasterResource")
    @Expose
    private ResourceDetail MasterResource;

    /**
    * Core node resources

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CoreResource")
    @Expose
    private ResourceDetail CoreResource;

    /**
    * Task node resources

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskResource")
    @Expose
    private ResourceDetail TaskResource;

    /**
    * Common node resources

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComResource")
    @Expose
    private ResourceDetail ComResource;

    /**
    * Whether to use COS.
    */
    @SerializedName("OnCos")
    @Expose
    private Boolean OnCos;

    /**
    * Charge type.
    */
    @SerializedName("ChargeType")
    @Expose
    private Long ChargeType;

    /**
    * Number of Router nodes.
    */
    @SerializedName("RouterNodeSize")
    @Expose
    private Long RouterNodeSize;

    /**
    * Whether HA is supported.
    */
    @SerializedName("SupportHA")
    @Expose
    private Boolean SupportHA;

    /**
    * Whether security mode is supported.
    */
    @SerializedName("SecurityOn")
    @Expose
    private Boolean SecurityOn;

    /**
    * Security group name.
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
    * Whether to enable CBS encryption.
    */
    @SerializedName("CbsEncrypt")
    @Expose
    private Long CbsEncrypt;

    /**
    * Custom application role.
    */
    @SerializedName("ApplicationRole")
    @Expose
    private String ApplicationRole;

    /**
    * Security group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecurityGroups")
    @Expose
    private String [] SecurityGroups;

    /**
    * SSH key ID.
    */
    @SerializedName("PublicKeyId")
    @Expose
    private String PublicKeyId;

    /**
     * Get Software information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SoftInfo Software information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSoftInfo() {
        return this.SoftInfo;
    }

    /**
     * Set Software information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SoftInfo Software information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSoftInfo(String [] SoftInfo) {
        this.SoftInfo = SoftInfo;
    }

    /**
     * Get Number of Master nodes. 
     * @return MasterNodeSize Number of Master nodes.
     */
    public Long getMasterNodeSize() {
        return this.MasterNodeSize;
    }

    /**
     * Set Number of Master nodes.
     * @param MasterNodeSize Number of Master nodes.
     */
    public void setMasterNodeSize(Long MasterNodeSize) {
        this.MasterNodeSize = MasterNodeSize;
    }

    /**
     * Get Number of Core nodes. 
     * @return CoreNodeSize Number of Core nodes.
     */
    public Long getCoreNodeSize() {
        return this.CoreNodeSize;
    }

    /**
     * Set Number of Core nodes.
     * @param CoreNodeSize Number of Core nodes.
     */
    public void setCoreNodeSize(Long CoreNodeSize) {
        this.CoreNodeSize = CoreNodeSize;
    }

    /**
     * Get Number of Task nodes. 
     * @return TaskNodeSize Number of Task nodes.
     */
    public Long getTaskNodeSize() {
        return this.TaskNodeSize;
    }

    /**
     * Set Number of Task nodes.
     * @param TaskNodeSize Number of Task nodes.
     */
    public void setTaskNodeSize(Long TaskNodeSize) {
        this.TaskNodeSize = TaskNodeSize;
    }

    /**
     * Get Number of Common nodes. 
     * @return ComNodeSize Number of Common nodes.
     */
    public Long getComNodeSize() {
        return this.ComNodeSize;
    }

    /**
     * Set Number of Common nodes.
     * @param ComNodeSize Number of Common nodes.
     */
    public void setComNodeSize(Long ComNodeSize) {
        this.ComNodeSize = ComNodeSize;
    }

    /**
     * Get Primary node resources

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MasterResource Primary node resources

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourceDetail getMasterResource() {
        return this.MasterResource;
    }

    /**
     * Set Primary node resources

Note: This field may return null, indicating that no valid values can be obtained.
     * @param MasterResource Primary node resources

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMasterResource(ResourceDetail MasterResource) {
        this.MasterResource = MasterResource;
    }

    /**
     * Get Core node resources

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CoreResource Core node resources

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourceDetail getCoreResource() {
        return this.CoreResource;
    }

    /**
     * Set Core node resources

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CoreResource Core node resources

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCoreResource(ResourceDetail CoreResource) {
        this.CoreResource = CoreResource;
    }

    /**
     * Get Task node resources

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskResource Task node resources

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourceDetail getTaskResource() {
        return this.TaskResource;
    }

    /**
     * Set Task node resources

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskResource Task node resources

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskResource(ResourceDetail TaskResource) {
        this.TaskResource = TaskResource;
    }

    /**
     * Get Common node resources

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComResource Common node resources

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ResourceDetail getComResource() {
        return this.ComResource;
    }

    /**
     * Set Common node resources

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComResource Common node resources

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComResource(ResourceDetail ComResource) {
        this.ComResource = ComResource;
    }

    /**
     * Get Whether to use COS. 
     * @return OnCos Whether to use COS.
     */
    public Boolean getOnCos() {
        return this.OnCos;
    }

    /**
     * Set Whether to use COS.
     * @param OnCos Whether to use COS.
     */
    public void setOnCos(Boolean OnCos) {
        this.OnCos = OnCos;
    }

    /**
     * Get Charge type. 
     * @return ChargeType Charge type.
     */
    public Long getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Charge type.
     * @param ChargeType Charge type.
     */
    public void setChargeType(Long ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Number of Router nodes. 
     * @return RouterNodeSize Number of Router nodes.
     */
    public Long getRouterNodeSize() {
        return this.RouterNodeSize;
    }

    /**
     * Set Number of Router nodes.
     * @param RouterNodeSize Number of Router nodes.
     */
    public void setRouterNodeSize(Long RouterNodeSize) {
        this.RouterNodeSize = RouterNodeSize;
    }

    /**
     * Get Whether HA is supported. 
     * @return SupportHA Whether HA is supported.
     */
    public Boolean getSupportHA() {
        return this.SupportHA;
    }

    /**
     * Set Whether HA is supported.
     * @param SupportHA Whether HA is supported.
     */
    public void setSupportHA(Boolean SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * Get Whether security mode is supported. 
     * @return SecurityOn Whether security mode is supported.
     */
    public Boolean getSecurityOn() {
        return this.SecurityOn;
    }

    /**
     * Set Whether security mode is supported.
     * @param SecurityOn Whether security mode is supported.
     */
    public void setSecurityOn(Boolean SecurityOn) {
        this.SecurityOn = SecurityOn;
    }

    /**
     * Get Security group name. 
     * @return SecurityGroup Security group name.
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set Security group name.
     * @param SecurityGroup Security group name.
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get Whether to enable CBS encryption. 
     * @return CbsEncrypt Whether to enable CBS encryption.
     */
    public Long getCbsEncrypt() {
        return this.CbsEncrypt;
    }

    /**
     * Set Whether to enable CBS encryption.
     * @param CbsEncrypt Whether to enable CBS encryption.
     */
    public void setCbsEncrypt(Long CbsEncrypt) {
        this.CbsEncrypt = CbsEncrypt;
    }

    /**
     * Get Custom application role. 
     * @return ApplicationRole Custom application role.
     */
    public String getApplicationRole() {
        return this.ApplicationRole;
    }

    /**
     * Set Custom application role.
     * @param ApplicationRole Custom application role.
     */
    public void setApplicationRole(String ApplicationRole) {
        this.ApplicationRole = ApplicationRole;
    }

    /**
     * Get Security group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecurityGroups Security group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSecurityGroups() {
        return this.SecurityGroups;
    }

    /**
     * Set Security group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecurityGroups Security group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecurityGroups(String [] SecurityGroups) {
        this.SecurityGroups = SecurityGroups;
    }

    /**
     * Get SSH key ID. 
     * @return PublicKeyId SSH key ID.
     */
    public String getPublicKeyId() {
        return this.PublicKeyId;
    }

    /**
     * Set SSH key ID.
     * @param PublicKeyId SSH key ID.
     */
    public void setPublicKeyId(String PublicKeyId) {
        this.PublicKeyId = PublicKeyId;
    }

    public EmrProductConfigDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmrProductConfigDetail(EmrProductConfigDetail source) {
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
            this.MasterResource = new ResourceDetail(source.MasterResource);
        }
        if (source.CoreResource != null) {
            this.CoreResource = new ResourceDetail(source.CoreResource);
        }
        if (source.TaskResource != null) {
            this.TaskResource = new ResourceDetail(source.TaskResource);
        }
        if (source.ComResource != null) {
            this.ComResource = new ResourceDetail(source.ComResource);
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

