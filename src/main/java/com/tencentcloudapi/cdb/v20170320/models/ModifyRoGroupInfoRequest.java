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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRoGroupInfoRequest extends AbstractModel {

    /**
    * ID of the RO group, which can be obtained through the [DescribeRoGroups](https://www.tencentcloud.com/document/api/236/40939?from_cn_redirect=1) API.
    */
    @SerializedName("RoGroupId")
    @Expose
    private String RoGroupId;

    /**
    * RO group details.
    */
    @SerializedName("RoGroupInfo")
    @Expose
    private RoGroupAttr RoGroupInfo;

    /**
    * Weight of instances in the RO group. If modification is needed to set the weight mode of the RO group to user-defined mode (custom), this parameter must be set, and the weight value of each read-only instance needs to be set. The RO instance ID can be obtained through the [DescribeRoGroups](https://www.tencentcloud.com/document/api/236/40939?from_cn_redirect=1) API.
    */
    @SerializedName("RoWeightValues")
    @Expose
    private RoWeightValue [] RoWeightValues;

    /**
    * Whether to rebalance the loads of read-only replicas in the RO group. Valid values: `1` (yes), `0` (no). Default value: `0`. If this parameter is set to `1`, connections to the read-only replicas in the RO group will be interrupted transiently. Please ensure that your application has a reconnection mechanism.
    */
    @SerializedName("IsBalanceRoLoad")
    @Expose
    private Long IsBalanceRoLoad;

    /**
    * This field has been deprecated.
    */
    @SerializedName("ReplicationDelayTime")
    @Expose
    private Long ReplicationDelayTime;

    /**
     * Get ID of the RO group, which can be obtained through the [DescribeRoGroups](https://www.tencentcloud.com/document/api/236/40939?from_cn_redirect=1) API. 
     * @return RoGroupId ID of the RO group, which can be obtained through the [DescribeRoGroups](https://www.tencentcloud.com/document/api/236/40939?from_cn_redirect=1) API.
     */
    public String getRoGroupId() {
        return this.RoGroupId;
    }

    /**
     * Set ID of the RO group, which can be obtained through the [DescribeRoGroups](https://www.tencentcloud.com/document/api/236/40939?from_cn_redirect=1) API.
     * @param RoGroupId ID of the RO group, which can be obtained through the [DescribeRoGroups](https://www.tencentcloud.com/document/api/236/40939?from_cn_redirect=1) API.
     */
    public void setRoGroupId(String RoGroupId) {
        this.RoGroupId = RoGroupId;
    }

    /**
     * Get RO group details. 
     * @return RoGroupInfo RO group details.
     */
    public RoGroupAttr getRoGroupInfo() {
        return this.RoGroupInfo;
    }

    /**
     * Set RO group details.
     * @param RoGroupInfo RO group details.
     */
    public void setRoGroupInfo(RoGroupAttr RoGroupInfo) {
        this.RoGroupInfo = RoGroupInfo;
    }

    /**
     * Get Weight of instances in the RO group. If modification is needed to set the weight mode of the RO group to user-defined mode (custom), this parameter must be set, and the weight value of each read-only instance needs to be set. The RO instance ID can be obtained through the [DescribeRoGroups](https://www.tencentcloud.com/document/api/236/40939?from_cn_redirect=1) API. 
     * @return RoWeightValues Weight of instances in the RO group. If modification is needed to set the weight mode of the RO group to user-defined mode (custom), this parameter must be set, and the weight value of each read-only instance needs to be set. The RO instance ID can be obtained through the [DescribeRoGroups](https://www.tencentcloud.com/document/api/236/40939?from_cn_redirect=1) API.
     */
    public RoWeightValue [] getRoWeightValues() {
        return this.RoWeightValues;
    }

    /**
     * Set Weight of instances in the RO group. If modification is needed to set the weight mode of the RO group to user-defined mode (custom), this parameter must be set, and the weight value of each read-only instance needs to be set. The RO instance ID can be obtained through the [DescribeRoGroups](https://www.tencentcloud.com/document/api/236/40939?from_cn_redirect=1) API.
     * @param RoWeightValues Weight of instances in the RO group. If modification is needed to set the weight mode of the RO group to user-defined mode (custom), this parameter must be set, and the weight value of each read-only instance needs to be set. The RO instance ID can be obtained through the [DescribeRoGroups](https://www.tencentcloud.com/document/api/236/40939?from_cn_redirect=1) API.
     */
    public void setRoWeightValues(RoWeightValue [] RoWeightValues) {
        this.RoWeightValues = RoWeightValues;
    }

    /**
     * Get Whether to rebalance the loads of read-only replicas in the RO group. Valid values: `1` (yes), `0` (no). Default value: `0`. If this parameter is set to `1`, connections to the read-only replicas in the RO group will be interrupted transiently. Please ensure that your application has a reconnection mechanism. 
     * @return IsBalanceRoLoad Whether to rebalance the loads of read-only replicas in the RO group. Valid values: `1` (yes), `0` (no). Default value: `0`. If this parameter is set to `1`, connections to the read-only replicas in the RO group will be interrupted transiently. Please ensure that your application has a reconnection mechanism.
     */
    public Long getIsBalanceRoLoad() {
        return this.IsBalanceRoLoad;
    }

    /**
     * Set Whether to rebalance the loads of read-only replicas in the RO group. Valid values: `1` (yes), `0` (no). Default value: `0`. If this parameter is set to `1`, connections to the read-only replicas in the RO group will be interrupted transiently. Please ensure that your application has a reconnection mechanism.
     * @param IsBalanceRoLoad Whether to rebalance the loads of read-only replicas in the RO group. Valid values: `1` (yes), `0` (no). Default value: `0`. If this parameter is set to `1`, connections to the read-only replicas in the RO group will be interrupted transiently. Please ensure that your application has a reconnection mechanism.
     */
    public void setIsBalanceRoLoad(Long IsBalanceRoLoad) {
        this.IsBalanceRoLoad = IsBalanceRoLoad;
    }

    /**
     * Get This field has been deprecated. 
     * @return ReplicationDelayTime This field has been deprecated.
     * @deprecated
     */
    @Deprecated
    public Long getReplicationDelayTime() {
        return this.ReplicationDelayTime;
    }

    /**
     * Set This field has been deprecated.
     * @param ReplicationDelayTime This field has been deprecated.
     * @deprecated
     */
    @Deprecated
    public void setReplicationDelayTime(Long ReplicationDelayTime) {
        this.ReplicationDelayTime = ReplicationDelayTime;
    }

    public ModifyRoGroupInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoGroupInfoRequest(ModifyRoGroupInfoRequest source) {
        if (source.RoGroupId != null) {
            this.RoGroupId = new String(source.RoGroupId);
        }
        if (source.RoGroupInfo != null) {
            this.RoGroupInfo = new RoGroupAttr(source.RoGroupInfo);
        }
        if (source.RoWeightValues != null) {
            this.RoWeightValues = new RoWeightValue[source.RoWeightValues.length];
            for (int i = 0; i < source.RoWeightValues.length; i++) {
                this.RoWeightValues[i] = new RoWeightValue(source.RoWeightValues[i]);
            }
        }
        if (source.IsBalanceRoLoad != null) {
            this.IsBalanceRoLoad = new Long(source.IsBalanceRoLoad);
        }
        if (source.ReplicationDelayTime != null) {
            this.ReplicationDelayTime = new Long(source.ReplicationDelayTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoGroupId", this.RoGroupId);
        this.setParamObj(map, prefix + "RoGroupInfo.", this.RoGroupInfo);
        this.setParamArrayObj(map, prefix + "RoWeightValues.", this.RoWeightValues);
        this.setParamSimple(map, prefix + "IsBalanceRoLoad", this.IsBalanceRoLoad);
        this.setParamSimple(map, prefix + "ReplicationDelayTime", this.ReplicationDelayTime);

    }
}

