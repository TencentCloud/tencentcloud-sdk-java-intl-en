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

public class ListPoliciesResponse extends AbstractModel {

    /**
    * Total number of policies
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * Policy array. Each array contains fields including `policyId`, `policyName`, `addTime`, `type`, `description`, and `createMode`. 
policyId: policy ID 
policyName: policy name
addTime: policy creation time
type: 1: custom policy, 2: preset policy 
description: policy description 
createMode: 1 indicates a policy created based on business permissions, while other values indicate that the policy syntax can be viewed and the policy can be updated using the policy syntax
Attachments: number of associated users
ServiceType: the product the policy is associated with
IsAttached: this value should not be null when querying if a marked entity has been associated with a policy. 0 indicates that no policy has been associated, and 1 indicates that a policy has been associated
    */
    @SerializedName("List")
    @Expose
    private StrategyInfo [] List;

    /**
    * Reserved field
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ServiceTypeList")
    @Expose
    private String [] ServiceTypeList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of policies 
     * @return TotalNum Total number of policies
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set Total number of policies
     * @param TotalNum Total number of policies
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get Policy array. Each array contains fields including `policyId`, `policyName`, `addTime`, `type`, `description`, and `createMode`. 
policyId: policy ID 
policyName: policy name
addTime: policy creation time
type: 1: custom policy, 2: preset policy 
description: policy description 
createMode: 1 indicates a policy created based on business permissions, while other values indicate that the policy syntax can be viewed and the policy can be updated using the policy syntax
Attachments: number of associated users
ServiceType: the product the policy is associated with
IsAttached: this value should not be null when querying if a marked entity has been associated with a policy. 0 indicates that no policy has been associated, and 1 indicates that a policy has been associated 
     * @return List Policy array. Each array contains fields including `policyId`, `policyName`, `addTime`, `type`, `description`, and `createMode`. 
policyId: policy ID 
policyName: policy name
addTime: policy creation time
type: 1: custom policy, 2: preset policy 
description: policy description 
createMode: 1 indicates a policy created based on business permissions, while other values indicate that the policy syntax can be viewed and the policy can be updated using the policy syntax
Attachments: number of associated users
ServiceType: the product the policy is associated with
IsAttached: this value should not be null when querying if a marked entity has been associated with a policy. 0 indicates that no policy has been associated, and 1 indicates that a policy has been associated
     */
    public StrategyInfo [] getList() {
        return this.List;
    }

    /**
     * Set Policy array. Each array contains fields including `policyId`, `policyName`, `addTime`, `type`, `description`, and `createMode`. 
policyId: policy ID 
policyName: policy name
addTime: policy creation time
type: 1: custom policy, 2: preset policy 
description: policy description 
createMode: 1 indicates a policy created based on business permissions, while other values indicate that the policy syntax can be viewed and the policy can be updated using the policy syntax
Attachments: number of associated users
ServiceType: the product the policy is associated with
IsAttached: this value should not be null when querying if a marked entity has been associated with a policy. 0 indicates that no policy has been associated, and 1 indicates that a policy has been associated
     * @param List Policy array. Each array contains fields including `policyId`, `policyName`, `addTime`, `type`, `description`, and `createMode`. 
policyId: policy ID 
policyName: policy name
addTime: policy creation time
type: 1: custom policy, 2: preset policy 
description: policy description 
createMode: 1 indicates a policy created based on business permissions, while other values indicate that the policy syntax can be viewed and the policy can be updated using the policy syntax
Attachments: number of associated users
ServiceType: the product the policy is associated with
IsAttached: this value should not be null when querying if a marked entity has been associated with a policy. 0 indicates that no policy has been associated, and 1 indicates that a policy has been associated
     */
    public void setList(StrategyInfo [] List) {
        this.List = List;
    }

    /**
     * Get Reserved field
Note: This field may return null, indicating that no valid value was found. 
     * @return ServiceTypeList Reserved field
Note: This field may return null, indicating that no valid value was found.
     */
    public String [] getServiceTypeList() {
        return this.ServiceTypeList;
    }

    /**
     * Set Reserved field
Note: This field may return null, indicating that no valid value was found.
     * @param ServiceTypeList Reserved field
Note: This field may return null, indicating that no valid value was found.
     */
    public void setServiceTypeList(String [] ServiceTypeList) {
        this.ServiceTypeList = ServiceTypeList;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ListPoliciesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListPoliciesResponse(ListPoliciesResponse source) {
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.List != null) {
            this.List = new StrategyInfo[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new StrategyInfo(source.List[i]);
            }
        }
        if (source.ServiceTypeList != null) {
            this.ServiceTypeList = new String[source.ServiceTypeList.length];
            for (int i = 0; i < source.ServiceTypeList.length; i++) {
                this.ServiceTypeList[i] = new String(source.ServiceTypeList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamArraySimple(map, prefix + "ServiceTypeList.", this.ServiceTypeList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

