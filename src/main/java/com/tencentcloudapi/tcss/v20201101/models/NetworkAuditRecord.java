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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkAuditRecord extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Cluster region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Action
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Operator
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Policy name
    */
    @SerializedName("NetworkPolicyName")
    @Expose
    private String NetworkPolicyName;

    /**
    * Operation time
    */
    @SerializedName("OperationTime")
    @Expose
    private String OperationTime;

    /**
    * Operator `appid`
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Operator UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster name 
     * @return ClusterName Cluster name
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
     * @param ClusterName Cluster name
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Cluster region 
     * @return Region Cluster region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Cluster region
     * @param Region Cluster region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Action 
     * @return Action Action
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action
     * @param Action Action
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Operator 
     * @return Operation Operator
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operator
     * @param Operation Operator
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Policy name 
     * @return NetworkPolicyName Policy name
     */
    public String getNetworkPolicyName() {
        return this.NetworkPolicyName;
    }

    /**
     * Set Policy name
     * @param NetworkPolicyName Policy name
     */
    public void setNetworkPolicyName(String NetworkPolicyName) {
        this.NetworkPolicyName = NetworkPolicyName;
    }

    /**
     * Get Operation time 
     * @return OperationTime Operation time
     */
    public String getOperationTime() {
        return this.OperationTime;
    }

    /**
     * Set Operation time
     * @param OperationTime Operation time
     */
    public void setOperationTime(String OperationTime) {
        this.OperationTime = OperationTime;
    }

    /**
     * Get Operator `appid`
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppId Operator `appid`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Operator `appid`
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppId Operator `appid`
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Operator UIN 
     * @return Uin Operator UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Operator UIN
     * @param Uin Operator UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    public NetworkAuditRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkAuditRecord(NetworkAuditRecord source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.NetworkPolicyName != null) {
            this.NetworkPolicyName = new String(source.NetworkPolicyName);
        }
        if (source.OperationTime != null) {
            this.OperationTime = new String(source.OperationTime);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "NetworkPolicyName", this.NetworkPolicyName);
        this.setParamSimple(map, prefix + "OperationTime", this.OperationTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

