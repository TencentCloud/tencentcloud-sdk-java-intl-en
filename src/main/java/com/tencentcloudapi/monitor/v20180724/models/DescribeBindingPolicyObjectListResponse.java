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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBindingPolicyObjectListResponse extends AbstractModel {

    /**
    * List of bound object instances.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("List")
    @Expose
    private DescribeBindingPolicyObjectListInstance [] List;

    /**
    * Total number of bound object instances.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Number of object instances that are not shielded.
    */
    @SerializedName("NoShieldedSum")
    @Expose
    private Long NoShieldedSum;

    /**
    * Bound instance group information. This parameter is not configured if no instance group is bound.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InstanceGroup")
    @Expose
    private DescribeBindingPolicyObjectListInstanceGroup InstanceGroup;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of bound object instances.
Note: This field may return null, indicating that no valid value was found. 
     * @return List List of bound object instances.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribeBindingPolicyObjectListInstance [] getList() {
        return this.List;
    }

    /**
     * Set List of bound object instances.
Note: This field may return null, indicating that no valid value was found.
     * @param List List of bound object instances.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setList(DescribeBindingPolicyObjectListInstance [] List) {
        this.List = List;
    }

    /**
     * Get Total number of bound object instances. 
     * @return Total Total number of bound object instances.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of bound object instances.
     * @param Total Total number of bound object instances.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Number of object instances that are not shielded. 
     * @return NoShieldedSum Number of object instances that are not shielded.
     */
    public Long getNoShieldedSum() {
        return this.NoShieldedSum;
    }

    /**
     * Set Number of object instances that are not shielded.
     * @param NoShieldedSum Number of object instances that are not shielded.
     */
    public void setNoShieldedSum(Long NoShieldedSum) {
        this.NoShieldedSum = NoShieldedSum;
    }

    /**
     * Get Bound instance group information. This parameter is not configured if no instance group is bound.
Note: This field may return null, indicating that no valid value was found. 
     * @return InstanceGroup Bound instance group information. This parameter is not configured if no instance group is bound.
Note: This field may return null, indicating that no valid value was found.
     */
    public DescribeBindingPolicyObjectListInstanceGroup getInstanceGroup() {
        return this.InstanceGroup;
    }

    /**
     * Set Bound instance group information. This parameter is not configured if no instance group is bound.
Note: This field may return null, indicating that no valid value was found.
     * @param InstanceGroup Bound instance group information. This parameter is not configured if no instance group is bound.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setInstanceGroup(DescribeBindingPolicyObjectListInstanceGroup InstanceGroup) {
        this.InstanceGroup = InstanceGroup;
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

    public DescribeBindingPolicyObjectListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBindingPolicyObjectListResponse(DescribeBindingPolicyObjectListResponse source) {
        if (source.List != null) {
            this.List = new DescribeBindingPolicyObjectListInstance[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new DescribeBindingPolicyObjectListInstance(source.List[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.NoShieldedSum != null) {
            this.NoShieldedSum = new Long(source.NoShieldedSum);
        }
        if (source.InstanceGroup != null) {
            this.InstanceGroup = new DescribeBindingPolicyObjectListInstanceGroup(source.InstanceGroup);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "NoShieldedSum", this.NoShieldedSum);
        this.setParamObj(map, prefix + "InstanceGroup.", this.InstanceGroup);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

