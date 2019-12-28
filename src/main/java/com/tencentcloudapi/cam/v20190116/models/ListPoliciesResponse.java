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

public class ListPoliciesResponse extends AbstractModel{

    /**
    * Total number of policies
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * Policy array. Each item in the array has the fields `policyId`, `policyName`, `addTime`, `type`, `description`, and `createMode` 
`policyId`: Policy ID 
`policyName`: Policy name
`addTime`: Time policy created
`type`: 1 is custom policy; 2 is preset policy 
`description`: Policy description 
`createMode`: 1 indicates a policy created based on business permissions, while other values indicate that the policy syntax can be viewed and the policy can be updated using the policy syntax.
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
     * Get Policy array. Each item in the array has the fields `policyId`, `policyName`, `addTime`, `type`, `description`, and `createMode` 
`policyId`: Policy ID 
`policyName`: Policy name
`addTime`: Time policy created
`type`: 1 is custom policy; 2 is preset policy 
`description`: Policy description 
`createMode`: 1 indicates a policy created based on business permissions, while other values indicate that the policy syntax can be viewed and the policy can be updated using the policy syntax. 
     * @return List Policy array. Each item in the array has the fields `policyId`, `policyName`, `addTime`, `type`, `description`, and `createMode` 
`policyId`: Policy ID 
`policyName`: Policy name
`addTime`: Time policy created
`type`: 1 is custom policy; 2 is preset policy 
`description`: Policy description 
`createMode`: 1 indicates a policy created based on business permissions, while other values indicate that the policy syntax can be viewed and the policy can be updated using the policy syntax.
     */
    public StrategyInfo [] getList() {
        return this.List;
    }

    /**
     * Set Policy array. Each item in the array has the fields `policyId`, `policyName`, `addTime`, `type`, `description`, and `createMode` 
`policyId`: Policy ID 
`policyName`: Policy name
`addTime`: Time policy created
`type`: 1 is custom policy; 2 is preset policy 
`description`: Policy description 
`createMode`: 1 indicates a policy created based on business permissions, while other values indicate that the policy syntax can be viewed and the policy can be updated using the policy syntax.
     * @param List Policy array. Each item in the array has the fields `policyId`, `policyName`, `addTime`, `type`, `description`, and `createMode` 
`policyId`: Policy ID 
`policyName`: Policy name
`addTime`: Time policy created
`type`: 1 is custom policy; 2 is preset policy 
`description`: Policy description 
`createMode`: 1 indicates a policy created based on business permissions, while other values indicate that the policy syntax can be viewed and the policy can be updated using the policy syntax.
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

