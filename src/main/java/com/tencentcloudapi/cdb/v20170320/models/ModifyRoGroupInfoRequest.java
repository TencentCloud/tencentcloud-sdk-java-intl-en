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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRoGroupInfoRequest extends AbstractModel{

    /**
    * RO group ID.
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
    * Weights of instances in RO group. If the weighting mode of an RO group is changed to custom mode, this parameter must be set, and a weight value needs to be set for each RO instance.
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
     * Get RO group ID. 
     * @return RoGroupId RO group ID.
     */
    public String getRoGroupId() {
        return this.RoGroupId;
    }

    /**
     * Set RO group ID.
     * @param RoGroupId RO group ID.
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
     * Get Weights of instances in RO group. If the weighting mode of an RO group is changed to custom mode, this parameter must be set, and a weight value needs to be set for each RO instance. 
     * @return RoWeightValues Weights of instances in RO group. If the weighting mode of an RO group is changed to custom mode, this parameter must be set, and a weight value needs to be set for each RO instance.
     */
    public RoWeightValue [] getRoWeightValues() {
        return this.RoWeightValues;
    }

    /**
     * Set Weights of instances in RO group. If the weighting mode of an RO group is changed to custom mode, this parameter must be set, and a weight value needs to be set for each RO instance.
     * @param RoWeightValues Weights of instances in RO group. If the weighting mode of an RO group is changed to custom mode, this parameter must be set, and a weight value needs to be set for each RO instance.
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoGroupId", this.RoGroupId);
        this.setParamObj(map, prefix + "RoGroupInfo.", this.RoGroupInfo);
        this.setParamArrayObj(map, prefix + "RoWeightValues.", this.RoWeightValues);
        this.setParamSimple(map, prefix + "IsBalanceRoLoad", this.IsBalanceRoLoad);

    }
}

