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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePodContainerListExportJobRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Pod unique ID</p>
    */
    @SerializedName("PodUniqueID")
    @Expose
    private String PodUniqueID;

    /**
    * <p>Cluster CA certificate MD5 (used to query node information)</p>
    */
    @SerializedName("ClusterCaMD5")
    @Expose
    private String ClusterCaMD5;

    /**
    * <p>Common filter criteria list. Supported filter fields:<br>ContainerId: container ID, exact match.<br>ContainerName: container name, fuzzy match.<br>RunStatus: container running status, exact match. Values: RUNNING, PAUSED, STOPPED, CREATED, DESTROYED, RESTARTING, REMOVING, DEAD, UNKNOWN.<br>ImageId: image ID, exact match.<br>ImageName: image name, fuzzy match.<br>IsolateStatus: isolation status, exact match. Values: NORMAL (unisolated), ISOLATED (isolated), ISOLATING (isolating), ISOLATE_FAILED (isolation failed), RESTORING (restoring isolation), RESTORE_FAILED (isolation removal failed).<br>NodeUniqueId: unique ID of the node it belongs to, exact match (NodeAssetId is an equivalent alias).<br>UUID: host UUID, exact match.</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * <p>Export field list (export all fields if not specified)<br>Enumeration values:<br>ContainerId: container ID<br>ContainerName: Container name<br>RunStatus: running state<br>NodeId: node ID<br>NodeType: node type<br>ImageId: image id<br>ImageName: mirror name<br>IsolateStatus: isolation status</p>
    */
    @SerializedName("ExportFields")
    @Expose
    private String [] ExportFields;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Pod unique ID</p> 
     * @return PodUniqueID <p>Pod unique ID</p>
     */
    public String getPodUniqueID() {
        return this.PodUniqueID;
    }

    /**
     * Set <p>Pod unique ID</p>
     * @param PodUniqueID <p>Pod unique ID</p>
     */
    public void setPodUniqueID(String PodUniqueID) {
        this.PodUniqueID = PodUniqueID;
    }

    /**
     * Get <p>Cluster CA certificate MD5 (used to query node information)</p> 
     * @return ClusterCaMD5 <p>Cluster CA certificate MD5 (used to query node information)</p>
     */
    public String getClusterCaMD5() {
        return this.ClusterCaMD5;
    }

    /**
     * Set <p>Cluster CA certificate MD5 (used to query node information)</p>
     * @param ClusterCaMD5 <p>Cluster CA certificate MD5 (used to query node information)</p>
     */
    public void setClusterCaMD5(String ClusterCaMD5) {
        this.ClusterCaMD5 = ClusterCaMD5;
    }

    /**
     * Get <p>Common filter criteria list. Supported filter fields:<br>ContainerId: container ID, exact match.<br>ContainerName: container name, fuzzy match.<br>RunStatus: container running status, exact match. Values: RUNNING, PAUSED, STOPPED, CREATED, DESTROYED, RESTARTING, REMOVING, DEAD, UNKNOWN.<br>ImageId: image ID, exact match.<br>ImageName: image name, fuzzy match.<br>IsolateStatus: isolation status, exact match. Values: NORMAL (unisolated), ISOLATED (isolated), ISOLATING (isolating), ISOLATE_FAILED (isolation failed), RESTORING (restoring isolation), RESTORE_FAILED (isolation removal failed).<br>NodeUniqueId: unique ID of the node it belongs to, exact match (NodeAssetId is an equivalent alias).<br>UUID: host UUID, exact match.</p> 
     * @return Filter <p>Common filter criteria list. Supported filter fields:<br>ContainerId: container ID, exact match.<br>ContainerName: container name, fuzzy match.<br>RunStatus: container running status, exact match. Values: RUNNING, PAUSED, STOPPED, CREATED, DESTROYED, RESTARTING, REMOVING, DEAD, UNKNOWN.<br>ImageId: image ID, exact match.<br>ImageName: image name, fuzzy match.<br>IsolateStatus: isolation status, exact match. Values: NORMAL (unisolated), ISOLATED (isolated), ISOLATING (isolating), ISOLATE_FAILED (isolation failed), RESTORING (restoring isolation), RESTORE_FAILED (isolation removal failed).<br>NodeUniqueId: unique ID of the node it belongs to, exact match (NodeAssetId is an equivalent alias).<br>UUID: host UUID, exact match.</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>Common filter criteria list. Supported filter fields:<br>ContainerId: container ID, exact match.<br>ContainerName: container name, fuzzy match.<br>RunStatus: container running status, exact match. Values: RUNNING, PAUSED, STOPPED, CREATED, DESTROYED, RESTARTING, REMOVING, DEAD, UNKNOWN.<br>ImageId: image ID, exact match.<br>ImageName: image name, fuzzy match.<br>IsolateStatus: isolation status, exact match. Values: NORMAL (unisolated), ISOLATED (isolated), ISOLATING (isolating), ISOLATE_FAILED (isolation failed), RESTORING (restoring isolation), RESTORE_FAILED (isolation removal failed).<br>NodeUniqueId: unique ID of the node it belongs to, exact match (NodeAssetId is an equivalent alias).<br>UUID: host UUID, exact match.</p>
     * @param Filter <p>Common filter criteria list. Supported filter fields:<br>ContainerId: container ID, exact match.<br>ContainerName: container name, fuzzy match.<br>RunStatus: container running status, exact match. Values: RUNNING, PAUSED, STOPPED, CREATED, DESTROYED, RESTARTING, REMOVING, DEAD, UNKNOWN.<br>ImageId: image ID, exact match.<br>ImageName: image name, fuzzy match.<br>IsolateStatus: isolation status, exact match. Values: NORMAL (unisolated), ISOLATED (isolated), ISOLATING (isolating), ISOLATE_FAILED (isolation failed), RESTORING (restoring isolation), RESTORE_FAILED (isolation removal failed).<br>NodeUniqueId: unique ID of the node it belongs to, exact match (NodeAssetId is an equivalent alias).<br>UUID: host UUID, exact match.</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>Export field list (export all fields if not specified)<br>Enumeration values:<br>ContainerId: container ID<br>ContainerName: Container name<br>RunStatus: running state<br>NodeId: node ID<br>NodeType: node type<br>ImageId: image id<br>ImageName: mirror name<br>IsolateStatus: isolation status</p> 
     * @return ExportFields <p>Export field list (export all fields if not specified)<br>Enumeration values:<br>ContainerId: container ID<br>ContainerName: Container name<br>RunStatus: running state<br>NodeId: node ID<br>NodeType: node type<br>ImageId: image id<br>ImageName: mirror name<br>IsolateStatus: isolation status</p>
     */
    public String [] getExportFields() {
        return this.ExportFields;
    }

    /**
     * Set <p>Export field list (export all fields if not specified)<br>Enumeration values:<br>ContainerId: container ID<br>ContainerName: Container name<br>RunStatus: running state<br>NodeId: node ID<br>NodeType: node type<br>ImageId: image id<br>ImageName: mirror name<br>IsolateStatus: isolation status</p>
     * @param ExportFields <p>Export field list (export all fields if not specified)<br>Enumeration values:<br>ContainerId: container ID<br>ContainerName: Container name<br>RunStatus: running state<br>NodeId: node ID<br>NodeType: node type<br>ImageId: image id<br>ImageName: mirror name<br>IsolateStatus: isolation status</p>
     */
    public void setExportFields(String [] ExportFields) {
        this.ExportFields = ExportFields;
    }

    public CreatePodContainerListExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePodContainerListExportJobRequest(CreatePodContainerListExportJobRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.PodUniqueID != null) {
            this.PodUniqueID = new String(source.PodUniqueID);
        }
        if (source.ClusterCaMD5 != null) {
            this.ClusterCaMD5 = new String(source.ClusterCaMD5);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.ExportFields != null) {
            this.ExportFields = new String[source.ExportFields.length];
            for (int i = 0; i < source.ExportFields.length; i++) {
                this.ExportFields[i] = new String(source.ExportFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "PodUniqueID", this.PodUniqueID);
        this.setParamSimple(map, prefix + "ClusterCaMD5", this.ClusterCaMD5);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "ExportFields.", this.ExportFields);

    }
}

