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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StrategyInfo extends AbstractModel{

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Time policy created
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Policy type. 1: Custom policy; 2: Preset policy
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Policy description
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * How the policy was created: 1: Via console; 2: Via syntax
    */
    @SerializedName("CreateMode")
    @Expose
    private Long CreateMode;

    /**
    * Number of associated users
    */
    @SerializedName("Attachments")
    @Expose
    private Long Attachments;

    /**
    * Product associated with the policy
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 
    */
    @SerializedName("IsAttached")
    @Expose
    private Long IsAttached;

    /**
    * 
    */
    @SerializedName("Deactived")
    @Expose
    private Long Deactived;

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Policy name 
     * @return PolicyName Policy name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name
     * @param PolicyName Policy name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Time policy created
Note: This field may return null, indicating that no valid value was found. 
     * @return AddTime Time policy created
Note: This field may return null, indicating that no valid value was found.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Time policy created
Note: This field may return null, indicating that no valid value was found.
     * @param AddTime Time policy created
Note: This field may return null, indicating that no valid value was found.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Policy type. 1: Custom policy; 2: Preset policy 
     * @return Type Policy type. 1: Custom policy; 2: Preset policy
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Policy type. 1: Custom policy; 2: Preset policy
     * @param Type Policy type. 1: Custom policy; 2: Preset policy
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Policy description
Note: This field may return null, indicating that no valid value was found. 
     * @return Description Policy description
Note: This field may return null, indicating that no valid value was found.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Policy description
Note: This field may return null, indicating that no valid value was found.
     * @param Description Policy description
Note: This field may return null, indicating that no valid value was found.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get How the policy was created: 1: Via console; 2: Via syntax 
     * @return CreateMode How the policy was created: 1: Via console; 2: Via syntax
     */
    public Long getCreateMode() {
        return this.CreateMode;
    }

    /**
     * Set How the policy was created: 1: Via console; 2: Via syntax
     * @param CreateMode How the policy was created: 1: Via console; 2: Via syntax
     */
    public void setCreateMode(Long CreateMode) {
        this.CreateMode = CreateMode;
    }

    /**
     * Get Number of associated users 
     * @return Attachments Number of associated users
     */
    public Long getAttachments() {
        return this.Attachments;
    }

    /**
     * Set Number of associated users
     * @param Attachments Number of associated users
     */
    public void setAttachments(Long Attachments) {
        this.Attachments = Attachments;
    }

    /**
     * Get Product associated with the policy
Note: This field may return null, indicating that no valid value was found. 
     * @return ServiceType Product associated with the policy
Note: This field may return null, indicating that no valid value was found.
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Product associated with the policy
Note: This field may return null, indicating that no valid value was found.
     * @param ServiceType Product associated with the policy
Note: This field may return null, indicating that no valid value was found.
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get  
     * @return IsAttached 
     */
    public Long getIsAttached() {
        return this.IsAttached;
    }

    /**
     * Set 
     * @param IsAttached 
     */
    public void setIsAttached(Long IsAttached) {
        this.IsAttached = IsAttached;
    }

    /**
     * Get  
     * @return Deactived 
     */
    public Long getDeactived() {
        return this.Deactived;
    }

    /**
     * Set 
     * @param Deactived 
     */
    public void setDeactived(Long Deactived) {
        this.Deactived = Deactived;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateMode", this.CreateMode);
        this.setParamSimple(map, prefix + "Attachments", this.Attachments);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "IsAttached", this.IsAttached);
        this.setParamSimple(map, prefix + "Deactived", this.Deactived);

    }
}

