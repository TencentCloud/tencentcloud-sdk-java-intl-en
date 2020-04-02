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

public class AttachPolicyInfo extends AbstractModel{

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Policy name
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Time created
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * How the policy was created: 1: Via console; 2: Via syntax
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("CreateMode")
    @Expose
    private Long CreateMode;

    /**
    * Valid values: `user` and `QCS`
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 
    */
    @SerializedName("OperateOwnerUin")
    @Expose
    private String OperateOwnerUin;

    /**
    * 
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * 
    */
    @SerializedName("OperateUinType")
    @Expose
    private Long OperateUinType;

    /**
    * Queries if the policy has been deactivated
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Deactived")
    @Expose
    private Long Deactived;

    /**
    * List of deprecated products
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeactivedDetail")
    @Expose
    private String [] DeactivedDetail;

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
Note: This field may return null, indicating that no valid value was found. 
     * @return PolicyName Policy name
Note: This field may return null, indicating that no valid value was found.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name
Note: This field may return null, indicating that no valid value was found.
     * @param PolicyName Policy name
Note: This field may return null, indicating that no valid value was found.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Time created
Note: This field may return null, indicating that no valid value was found. 
     * @return AddTime Time created
Note: This field may return null, indicating that no valid value was found.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Time created
Note: This field may return null, indicating that no valid value was found.
     * @param AddTime Time created
Note: This field may return null, indicating that no valid value was found.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get How the policy was created: 1: Via console; 2: Via syntax
Note: This field may return null, indicating that no valid value was found. 
     * @return CreateMode How the policy was created: 1: Via console; 2: Via syntax
Note: This field may return null, indicating that no valid value was found.
     */
    public Long getCreateMode() {
        return this.CreateMode;
    }

    /**
     * Set How the policy was created: 1: Via console; 2: Via syntax
Note: This field may return null, indicating that no valid value was found.
     * @param CreateMode How the policy was created: 1: Via console; 2: Via syntax
Note: This field may return null, indicating that no valid value was found.
     */
    public void setCreateMode(Long CreateMode) {
        this.CreateMode = CreateMode;
    }

    /**
     * Get Valid values: `user` and `QCS`
Note: This field may return null, indicating that no valid value was found. 
     * @return PolicyType Valid values: `user` and `QCS`
Note: This field may return null, indicating that no valid value was found.
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Valid values: `user` and `QCS`
Note: This field may return null, indicating that no valid value was found.
     * @param PolicyType Valid values: `user` and `QCS`
Note: This field may return null, indicating that no valid value was found.
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get  
     * @return Remark 
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 
     * @param Remark 
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get  
     * @return OperateOwnerUin 
     */
    public String getOperateOwnerUin() {
        return this.OperateOwnerUin;
    }

    /**
     * Set 
     * @param OperateOwnerUin 
     */
    public void setOperateOwnerUin(String OperateOwnerUin) {
        this.OperateOwnerUin = OperateOwnerUin;
    }

    /**
     * Get  
     * @return OperateUin 
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set 
     * @param OperateUin 
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get  
     * @return OperateUinType 
     */
    public Long getOperateUinType() {
        return this.OperateUinType;
    }

    /**
     * Set 
     * @param OperateUinType 
     */
    public void setOperateUinType(Long OperateUinType) {
        this.OperateUinType = OperateUinType;
    }

    /**
     * Get Queries if the policy has been deactivated
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Deactived Queries if the policy has been deactivated
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDeactived() {
        return this.Deactived;
    }

    /**
     * Set Queries if the policy has been deactivated
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Deactived Queries if the policy has been deactivated
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeactived(Long Deactived) {
        this.Deactived = Deactived;
    }

    /**
     * Get List of deprecated products
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DeactivedDetail List of deprecated products
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getDeactivedDetail() {
        return this.DeactivedDetail;
    }

    /**
     * Set List of deprecated products
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DeactivedDetail List of deprecated products
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDeactivedDetail(String [] DeactivedDetail) {
        this.DeactivedDetail = DeactivedDetail;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "CreateMode", this.CreateMode);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "OperateOwnerUin", this.OperateOwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "OperateUinType", this.OperateUinType);
        this.setParamSimple(map, prefix + "Deactived", this.Deactived);
        this.setParamArraySimple(map, prefix + "DeactivedDetail.", this.DeactivedDetail);

    }
}

