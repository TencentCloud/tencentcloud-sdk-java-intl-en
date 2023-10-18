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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachedPolicyOfRole extends AbstractModel {

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
    * Time of association
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Policy type. `User` indicates custom policy; `QCS` indicates preset policy
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * Policy creation method. 1: indicates the policy was created based on product function or item permission; other values indicate the policy was created based on the policy syntax
    */
    @SerializedName("CreateMode")
    @Expose
    private Long CreateMode;

    /**
    * Whether the product has been deprecated (0: no; 1: yes)
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
    * Policy description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Get Time of association 
     * @return AddTime Time of association
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Time of association
     * @param AddTime Time of association
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Policy type. `User` indicates custom policy; `QCS` indicates preset policy
Note: This field may return null, indicating that no valid value was found. 
     * @return PolicyType Policy type. `User` indicates custom policy; `QCS` indicates preset policy
Note: This field may return null, indicating that no valid value was found.
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Policy type. `User` indicates custom policy; `QCS` indicates preset policy
Note: This field may return null, indicating that no valid value was found.
     * @param PolicyType Policy type. `User` indicates custom policy; `QCS` indicates preset policy
Note: This field may return null, indicating that no valid value was found.
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Policy creation method. 1: indicates the policy was created based on product function or item permission; other values indicate the policy was created based on the policy syntax 
     * @return CreateMode Policy creation method. 1: indicates the policy was created based on product function or item permission; other values indicate the policy was created based on the policy syntax
     */
    public Long getCreateMode() {
        return this.CreateMode;
    }

    /**
     * Set Policy creation method. 1: indicates the policy was created based on product function or item permission; other values indicate the policy was created based on the policy syntax
     * @param CreateMode Policy creation method. 1: indicates the policy was created based on product function or item permission; other values indicate the policy was created based on the policy syntax
     */
    public void setCreateMode(Long CreateMode) {
        this.CreateMode = CreateMode;
    }

    /**
     * Get Whether the product has been deprecated (0: no; 1: yes)
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Deactived Whether the product has been deprecated (0: no; 1: yes)
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getDeactived() {
        return this.Deactived;
    }

    /**
     * Set Whether the product has been deprecated (0: no; 1: yes)
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Deactived Whether the product has been deprecated (0: no; 1: yes)
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
     * Get Policy description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description Policy description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Policy description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description Policy description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public AttachedPolicyOfRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachedPolicyOfRole(AttachedPolicyOfRole source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.CreateMode != null) {
            this.CreateMode = new Long(source.CreateMode);
        }
        if (source.Deactived != null) {
            this.Deactived = new Long(source.Deactived);
        }
        if (source.DeactivedDetail != null) {
            this.DeactivedDetail = new String[source.DeactivedDetail.length];
            for (int i = 0; i < source.DeactivedDetail.length; i++) {
                this.DeactivedDetail[i] = new String(source.DeactivedDetail[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "CreateMode", this.CreateMode);
        this.setParamSimple(map, prefix + "Deactived", this.Deactived);
        this.setParamArraySimple(map, prefix + "DeactivedDetail.", this.DeactivedDetail);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

