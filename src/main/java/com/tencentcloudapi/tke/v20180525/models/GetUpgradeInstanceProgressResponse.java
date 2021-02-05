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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetUpgradeInstanceProgressResponse extends AbstractModel{

    /**
    * Total nodes to upgrade
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Total upgraded nodes
    */
    @SerializedName("Done")
    @Expose
    private Long Done;

    /**
    * The lifecycle of the upgrade task
process: running
paused: stopped
pausing: stopping
done: completed
timeout: timed out
aborted: canceled
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * Details of upgrade progress of each node
    */
    @SerializedName("Instances")
    @Expose
    private InstanceUpgradeProgressItem [] Instances;

    /**
    * Current cluster status
    */
    @SerializedName("ClusterStatus")
    @Expose
    private InstanceUpgradeClusterStatus ClusterStatus;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total nodes to upgrade 
     * @return Total Total nodes to upgrade
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total nodes to upgrade
     * @param Total Total nodes to upgrade
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Total upgraded nodes 
     * @return Done Total upgraded nodes
     */
    public Long getDone() {
        return this.Done;
    }

    /**
     * Set Total upgraded nodes
     * @param Done Total upgraded nodes
     */
    public void setDone(Long Done) {
        this.Done = Done;
    }

    /**
     * Get The lifecycle of the upgrade task
process: running
paused: stopped
pausing: stopping
done: completed
timeout: timed out
aborted: canceled 
     * @return LifeState The lifecycle of the upgrade task
process: running
paused: stopped
pausing: stopping
done: completed
timeout: timed out
aborted: canceled
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set The lifecycle of the upgrade task
process: running
paused: stopped
pausing: stopping
done: completed
timeout: timed out
aborted: canceled
     * @param LifeState The lifecycle of the upgrade task
process: running
paused: stopped
pausing: stopping
done: completed
timeout: timed out
aborted: canceled
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get Details of upgrade progress of each node 
     * @return Instances Details of upgrade progress of each node
     */
    public InstanceUpgradeProgressItem [] getInstances() {
        return this.Instances;
    }

    /**
     * Set Details of upgrade progress of each node
     * @param Instances Details of upgrade progress of each node
     */
    public void setInstances(InstanceUpgradeProgressItem [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get Current cluster status 
     * @return ClusterStatus Current cluster status
     */
    public InstanceUpgradeClusterStatus getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set Current cluster status
     * @param ClusterStatus Current cluster status
     */
    public void setClusterStatus(InstanceUpgradeClusterStatus ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Done", this.Done);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamObj(map, prefix + "ClusterStatus.", this.ClusterStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

