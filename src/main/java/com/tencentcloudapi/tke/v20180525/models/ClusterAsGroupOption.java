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

public class ClusterAsGroupOption extends AbstractModel{

    /**
    * Whether to enable scale-in
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("IsScaleDownEnabled")
    @Expose
    private Boolean IsScaleDownEnabled;

    /**
    * The scale-out method when there are multiple scaling groups. `random`: select a random scaling group. `most-pods`: choose the scaling group that can schedule the most pods. `least-waste`: select the scaling group that can ensure the fewest remaining resources after Pod scheduling.. The default value is `random`.)
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("Expander")
    @Expose
    private String Expander;

    /**
    * Max concurrent scale-in volume
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("MaxEmptyBulkDelete")
    @Expose
    private Long MaxEmptyBulkDelete;

    /**
    * Number of minutes after cluster scale-out when the system starts judging whether to perform scale-in
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("ScaleDownDelay")
    @Expose
    private Long ScaleDownDelay;

    /**
    * Number of consecutive minutes of idleness after which the node is subject to scale-in (default value: 10)
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("ScaleDownUnneededTime")
    @Expose
    private Long ScaleDownUnneededTime;

    /**
    * Percentage of node resource usage below which the node is considered to be idle (default value: 50)
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("ScaleDownUtilizationThreshold")
    @Expose
    private Long ScaleDownUtilizationThreshold;

    /**
    * During scale-in, ignore nodes with local storage pods (default value: False)
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("SkipNodesWithLocalStorage")
    @Expose
    private Boolean SkipNodesWithLocalStorage;

    /**
    * During scale-in, ignore nodes with pods in the kube-system namespace that are not managed by DaemonSet (default value: False)
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("SkipNodesWithSystemPods")
    @Expose
    private Boolean SkipNodesWithSystemPods;

    /**
    * Whether to ignore DaemonSet pods by default when calculating resource usage (default value: False: do not ignore)
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("IgnoreDaemonSetsUtilization")
    @Expose
    private Boolean IgnoreDaemonSetsUtilization;

    /**
    * Number at which CA health detection is triggered (default value: 3). After the number specified in OkTotalUnreadyCount is exceeded, CA will perform health detection.
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("OkTotalUnreadyCount")
    @Expose
    private Long OkTotalUnreadyCount;

    /**
    * Max percentage of unready nodes. After the max percentage is exceeded, CA will stop operation.
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("MaxTotalUnreadyPercentage")
    @Expose
    private Long MaxTotalUnreadyPercentage;

    /**
    * Amount of time before unready nodes become eligible for scale-in
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("ScaleDownUnreadyTime")
    @Expose
    private Long ScaleDownUnreadyTime;

    /**
    * Waiting time before CA deletes nodes that are not registered in Kubernetes
Note: this field may return null, indicating that no valid value was found.
    */
    @SerializedName("UnregisteredNodeRemovalTime")
    @Expose
    private Long UnregisteredNodeRemovalTime;

    /**
     * Get Whether to enable scale-in
Note: this field may return null, indicating that no valid value was found. 
     * @return IsScaleDownEnabled Whether to enable scale-in
Note: this field may return null, indicating that no valid value was found.
     */
    public Boolean getIsScaleDownEnabled() {
        return this.IsScaleDownEnabled;
    }

    /**
     * Set Whether to enable scale-in
Note: this field may return null, indicating that no valid value was found.
     * @param IsScaleDownEnabled Whether to enable scale-in
Note: this field may return null, indicating that no valid value was found.
     */
    public void setIsScaleDownEnabled(Boolean IsScaleDownEnabled) {
        this.IsScaleDownEnabled = IsScaleDownEnabled;
    }

    /**
     * Get The scale-out method when there are multiple scaling groups. `random`: select a random scaling group. `most-pods`: choose the scaling group that can schedule the most pods. `least-waste`: select the scaling group that can ensure the fewest remaining resources after Pod scheduling.. The default value is `random`.)
Note: this field may return null, indicating that no valid value was found. 
     * @return Expander The scale-out method when there are multiple scaling groups. `random`: select a random scaling group. `most-pods`: choose the scaling group that can schedule the most pods. `least-waste`: select the scaling group that can ensure the fewest remaining resources after Pod scheduling.. The default value is `random`.)
Note: this field may return null, indicating that no valid value was found.
     */
    public String getExpander() {
        return this.Expander;
    }

    /**
     * Set The scale-out method when there are multiple scaling groups. `random`: select a random scaling group. `most-pods`: choose the scaling group that can schedule the most pods. `least-waste`: select the scaling group that can ensure the fewest remaining resources after Pod scheduling.. The default value is `random`.)
Note: this field may return null, indicating that no valid value was found.
     * @param Expander The scale-out method when there are multiple scaling groups. `random`: select a random scaling group. `most-pods`: choose the scaling group that can schedule the most pods. `least-waste`: select the scaling group that can ensure the fewest remaining resources after Pod scheduling.. The default value is `random`.)
Note: this field may return null, indicating that no valid value was found.
     */
    public void setExpander(String Expander) {
        this.Expander = Expander;
    }

    /**
     * Get Max concurrent scale-in volume
Note: this field may return null, indicating that no valid value was found. 
     * @return MaxEmptyBulkDelete Max concurrent scale-in volume
Note: this field may return null, indicating that no valid value was found.
     */
    public Long getMaxEmptyBulkDelete() {
        return this.MaxEmptyBulkDelete;
    }

    /**
     * Set Max concurrent scale-in volume
Note: this field may return null, indicating that no valid value was found.
     * @param MaxEmptyBulkDelete Max concurrent scale-in volume
Note: this field may return null, indicating that no valid value was found.
     */
    public void setMaxEmptyBulkDelete(Long MaxEmptyBulkDelete) {
        this.MaxEmptyBulkDelete = MaxEmptyBulkDelete;
    }

    /**
     * Get Number of minutes after cluster scale-out when the system starts judging whether to perform scale-in
Note: this field may return null, indicating that no valid value was found. 
     * @return ScaleDownDelay Number of minutes after cluster scale-out when the system starts judging whether to perform scale-in
Note: this field may return null, indicating that no valid value was found.
     */
    public Long getScaleDownDelay() {
        return this.ScaleDownDelay;
    }

    /**
     * Set Number of minutes after cluster scale-out when the system starts judging whether to perform scale-in
Note: this field may return null, indicating that no valid value was found.
     * @param ScaleDownDelay Number of minutes after cluster scale-out when the system starts judging whether to perform scale-in
Note: this field may return null, indicating that no valid value was found.
     */
    public void setScaleDownDelay(Long ScaleDownDelay) {
        this.ScaleDownDelay = ScaleDownDelay;
    }

    /**
     * Get Number of consecutive minutes of idleness after which the node is subject to scale-in (default value: 10)
Note: this field may return null, indicating that no valid value was found. 
     * @return ScaleDownUnneededTime Number of consecutive minutes of idleness after which the node is subject to scale-in (default value: 10)
Note: this field may return null, indicating that no valid value was found.
     */
    public Long getScaleDownUnneededTime() {
        return this.ScaleDownUnneededTime;
    }

    /**
     * Set Number of consecutive minutes of idleness after which the node is subject to scale-in (default value: 10)
Note: this field may return null, indicating that no valid value was found.
     * @param ScaleDownUnneededTime Number of consecutive minutes of idleness after which the node is subject to scale-in (default value: 10)
Note: this field may return null, indicating that no valid value was found.
     */
    public void setScaleDownUnneededTime(Long ScaleDownUnneededTime) {
        this.ScaleDownUnneededTime = ScaleDownUnneededTime;
    }

    /**
     * Get Percentage of node resource usage below which the node is considered to be idle (default value: 50)
Note: this field may return null, indicating that no valid value was found. 
     * @return ScaleDownUtilizationThreshold Percentage of node resource usage below which the node is considered to be idle (default value: 50)
Note: this field may return null, indicating that no valid value was found.
     */
    public Long getScaleDownUtilizationThreshold() {
        return this.ScaleDownUtilizationThreshold;
    }

    /**
     * Set Percentage of node resource usage below which the node is considered to be idle (default value: 50)
Note: this field may return null, indicating that no valid value was found.
     * @param ScaleDownUtilizationThreshold Percentage of node resource usage below which the node is considered to be idle (default value: 50)
Note: this field may return null, indicating that no valid value was found.
     */
    public void setScaleDownUtilizationThreshold(Long ScaleDownUtilizationThreshold) {
        this.ScaleDownUtilizationThreshold = ScaleDownUtilizationThreshold;
    }

    /**
     * Get During scale-in, ignore nodes with local storage pods (default value: False)
Note: this field may return null, indicating that no valid value was found. 
     * @return SkipNodesWithLocalStorage During scale-in, ignore nodes with local storage pods (default value: False)
Note: this field may return null, indicating that no valid value was found.
     */
    public Boolean getSkipNodesWithLocalStorage() {
        return this.SkipNodesWithLocalStorage;
    }

    /**
     * Set During scale-in, ignore nodes with local storage pods (default value: False)
Note: this field may return null, indicating that no valid value was found.
     * @param SkipNodesWithLocalStorage During scale-in, ignore nodes with local storage pods (default value: False)
Note: this field may return null, indicating that no valid value was found.
     */
    public void setSkipNodesWithLocalStorage(Boolean SkipNodesWithLocalStorage) {
        this.SkipNodesWithLocalStorage = SkipNodesWithLocalStorage;
    }

    /**
     * Get During scale-in, ignore nodes with pods in the kube-system namespace that are not managed by DaemonSet (default value: False)
Note: this field may return null, indicating that no valid value was found. 
     * @return SkipNodesWithSystemPods During scale-in, ignore nodes with pods in the kube-system namespace that are not managed by DaemonSet (default value: False)
Note: this field may return null, indicating that no valid value was found.
     */
    public Boolean getSkipNodesWithSystemPods() {
        return this.SkipNodesWithSystemPods;
    }

    /**
     * Set During scale-in, ignore nodes with pods in the kube-system namespace that are not managed by DaemonSet (default value: False)
Note: this field may return null, indicating that no valid value was found.
     * @param SkipNodesWithSystemPods During scale-in, ignore nodes with pods in the kube-system namespace that are not managed by DaemonSet (default value: False)
Note: this field may return null, indicating that no valid value was found.
     */
    public void setSkipNodesWithSystemPods(Boolean SkipNodesWithSystemPods) {
        this.SkipNodesWithSystemPods = SkipNodesWithSystemPods;
    }

    /**
     * Get Whether to ignore DaemonSet pods by default when calculating resource usage (default value: False: do not ignore)
Note: this field may return null, indicating that no valid value was found. 
     * @return IgnoreDaemonSetsUtilization Whether to ignore DaemonSet pods by default when calculating resource usage (default value: False: do not ignore)
Note: this field may return null, indicating that no valid value was found.
     */
    public Boolean getIgnoreDaemonSetsUtilization() {
        return this.IgnoreDaemonSetsUtilization;
    }

    /**
     * Set Whether to ignore DaemonSet pods by default when calculating resource usage (default value: False: do not ignore)
Note: this field may return null, indicating that no valid value was found.
     * @param IgnoreDaemonSetsUtilization Whether to ignore DaemonSet pods by default when calculating resource usage (default value: False: do not ignore)
Note: this field may return null, indicating that no valid value was found.
     */
    public void setIgnoreDaemonSetsUtilization(Boolean IgnoreDaemonSetsUtilization) {
        this.IgnoreDaemonSetsUtilization = IgnoreDaemonSetsUtilization;
    }

    /**
     * Get Number at which CA health detection is triggered (default value: 3). After the number specified in OkTotalUnreadyCount is exceeded, CA will perform health detection.
Note: this field may return null, indicating that no valid value was found. 
     * @return OkTotalUnreadyCount Number at which CA health detection is triggered (default value: 3). After the number specified in OkTotalUnreadyCount is exceeded, CA will perform health detection.
Note: this field may return null, indicating that no valid value was found.
     */
    public Long getOkTotalUnreadyCount() {
        return this.OkTotalUnreadyCount;
    }

    /**
     * Set Number at which CA health detection is triggered (default value: 3). After the number specified in OkTotalUnreadyCount is exceeded, CA will perform health detection.
Note: this field may return null, indicating that no valid value was found.
     * @param OkTotalUnreadyCount Number at which CA health detection is triggered (default value: 3). After the number specified in OkTotalUnreadyCount is exceeded, CA will perform health detection.
Note: this field may return null, indicating that no valid value was found.
     */
    public void setOkTotalUnreadyCount(Long OkTotalUnreadyCount) {
        this.OkTotalUnreadyCount = OkTotalUnreadyCount;
    }

    /**
     * Get Max percentage of unready nodes. After the max percentage is exceeded, CA will stop operation.
Note: this field may return null, indicating that no valid value was found. 
     * @return MaxTotalUnreadyPercentage Max percentage of unready nodes. After the max percentage is exceeded, CA will stop operation.
Note: this field may return null, indicating that no valid value was found.
     */
    public Long getMaxTotalUnreadyPercentage() {
        return this.MaxTotalUnreadyPercentage;
    }

    /**
     * Set Max percentage of unready nodes. After the max percentage is exceeded, CA will stop operation.
Note: this field may return null, indicating that no valid value was found.
     * @param MaxTotalUnreadyPercentage Max percentage of unready nodes. After the max percentage is exceeded, CA will stop operation.
Note: this field may return null, indicating that no valid value was found.
     */
    public void setMaxTotalUnreadyPercentage(Long MaxTotalUnreadyPercentage) {
        this.MaxTotalUnreadyPercentage = MaxTotalUnreadyPercentage;
    }

    /**
     * Get Amount of time before unready nodes become eligible for scale-in
Note: this field may return null, indicating that no valid value was found. 
     * @return ScaleDownUnreadyTime Amount of time before unready nodes become eligible for scale-in
Note: this field may return null, indicating that no valid value was found.
     */
    public Long getScaleDownUnreadyTime() {
        return this.ScaleDownUnreadyTime;
    }

    /**
     * Set Amount of time before unready nodes become eligible for scale-in
Note: this field may return null, indicating that no valid value was found.
     * @param ScaleDownUnreadyTime Amount of time before unready nodes become eligible for scale-in
Note: this field may return null, indicating that no valid value was found.
     */
    public void setScaleDownUnreadyTime(Long ScaleDownUnreadyTime) {
        this.ScaleDownUnreadyTime = ScaleDownUnreadyTime;
    }

    /**
     * Get Waiting time before CA deletes nodes that are not registered in Kubernetes
Note: this field may return null, indicating that no valid value was found. 
     * @return UnregisteredNodeRemovalTime Waiting time before CA deletes nodes that are not registered in Kubernetes
Note: this field may return null, indicating that no valid value was found.
     */
    public Long getUnregisteredNodeRemovalTime() {
        return this.UnregisteredNodeRemovalTime;
    }

    /**
     * Set Waiting time before CA deletes nodes that are not registered in Kubernetes
Note: this field may return null, indicating that no valid value was found.
     * @param UnregisteredNodeRemovalTime Waiting time before CA deletes nodes that are not registered in Kubernetes
Note: this field may return null, indicating that no valid value was found.
     */
    public void setUnregisteredNodeRemovalTime(Long UnregisteredNodeRemovalTime) {
        this.UnregisteredNodeRemovalTime = UnregisteredNodeRemovalTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsScaleDownEnabled", this.IsScaleDownEnabled);
        this.setParamSimple(map, prefix + "Expander", this.Expander);
        this.setParamSimple(map, prefix + "MaxEmptyBulkDelete", this.MaxEmptyBulkDelete);
        this.setParamSimple(map, prefix + "ScaleDownDelay", this.ScaleDownDelay);
        this.setParamSimple(map, prefix + "ScaleDownUnneededTime", this.ScaleDownUnneededTime);
        this.setParamSimple(map, prefix + "ScaleDownUtilizationThreshold", this.ScaleDownUtilizationThreshold);
        this.setParamSimple(map, prefix + "SkipNodesWithLocalStorage", this.SkipNodesWithLocalStorage);
        this.setParamSimple(map, prefix + "SkipNodesWithSystemPods", this.SkipNodesWithSystemPods);
        this.setParamSimple(map, prefix + "IgnoreDaemonSetsUtilization", this.IgnoreDaemonSetsUtilization);
        this.setParamSimple(map, prefix + "OkTotalUnreadyCount", this.OkTotalUnreadyCount);
        this.setParamSimple(map, prefix + "MaxTotalUnreadyPercentage", this.MaxTotalUnreadyPercentage);
        this.setParamSimple(map, prefix + "ScaleDownUnreadyTime", this.ScaleDownUnreadyTime);
        this.setParamSimple(map, prefix + "UnregisteredNodeRemovalTime", this.UnregisteredNodeRemovalTime);

    }
}

