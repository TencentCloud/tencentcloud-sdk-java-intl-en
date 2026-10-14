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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterView extends AbstractModel {

    /**
    * Cluster health status
    */
    @SerializedName("Health")
    @Expose
    private Float Health;

    /**
    * Whether the cluster is visible
    */
    @SerializedName("Visible")
    @Expose
    private Float Visible;

    /**
    * Whether to fuse the cluster
    */
    @SerializedName("Break")
    @Expose
    private Float Break;

    /**
    * Average Disk Usage
    */
    @SerializedName("AvgDiskUsage")
    @Expose
    private Float AvgDiskUsage;

    /**
    * Average memory utilization
    */
    @SerializedName("AvgMemUsage")
    @Expose
    private Float AvgMemUsage;

    /**
    * Average CPU Usage
    */
    @SerializedName("AvgCpuUsage")
    @Expose
    private Float AvgCpuUsage;

    /**
    * Total storage size of a cluster.
    */
    @SerializedName("TotalDiskSize")
    @Expose
    private Long TotalDiskSize;

    /**
    * Client request node
    */
    @SerializedName("TargetNodeTypes")
    @Expose
    private String [] TargetNodeTypes;

    /**
    * Number of online nodes
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * Total number of nodes
    */
    @SerializedName("TotalNodeNum")
    @Expose
    private Long TotalNodeNum;

    /**
    * Number of Data Nodes
    */
    @SerializedName("DataNodeNum")
    @Expose
    private Long DataNodeNum;

    /**
    * Index count
    */
    @SerializedName("IndexNum")
    @Expose
    private Long IndexNum;

    /**
    * Number of documents
    */
    @SerializedName("DocNum")
    @Expose
    private Long DocNum;

    /**
    * Used bytes of the disk
    */
    @SerializedName("DiskUsedInBytes")
    @Expose
    private Long DiskUsedInBytes;

    /**
    * Number of shards
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * Number of primary shards
    */
    @SerializedName("PrimaryShardNum")
    @Expose
    private Long PrimaryShardNum;

    /**
    * Number of migrating shards
    */
    @SerializedName("RelocatingShardNum")
    @Expose
    private Long RelocatingShardNum;

    /**
    * Number of initializing shards.
    */
    @SerializedName("InitializingShardNum")
    @Expose
    private Long InitializingShardNum;

    /**
    * Number of unassigned shards
    */
    @SerializedName("UnassignedShardNum")
    @Expose
    private Long UnassignedShardNum;

    /**
    * Enterprise Edition COS storage capacity size in GB
    */
    @SerializedName("TotalCosStorage")
    @Expose
    private Long TotalCosStorage;

    /**
    * bucket name for storing cos searchable snapshots in the Enterprise Edition cluster
    */
    @SerializedName("SearchableSnapshotCosBucket")
    @Expose
    private String SearchableSnapshotCosBucket;

    /**
    * App ID of the cos bucket for searchable snapshots in the Enterprise Edition cluster
    */
    @SerializedName("SearchableSnapshotCosAppId")
    @Expose
    private String SearchableSnapshotCosAppId;

    /**
     * Get Cluster health status 
     * @return Health Cluster health status
     */
    public Float getHealth() {
        return this.Health;
    }

    /**
     * Set Cluster health status
     * @param Health Cluster health status
     */
    public void setHealth(Float Health) {
        this.Health = Health;
    }

    /**
     * Get Whether the cluster is visible 
     * @return Visible Whether the cluster is visible
     */
    public Float getVisible() {
        return this.Visible;
    }

    /**
     * Set Whether the cluster is visible
     * @param Visible Whether the cluster is visible
     */
    public void setVisible(Float Visible) {
        this.Visible = Visible;
    }

    /**
     * Get Whether to fuse the cluster 
     * @return Break Whether to fuse the cluster
     */
    public Float getBreak() {
        return this.Break;
    }

    /**
     * Set Whether to fuse the cluster
     * @param Break Whether to fuse the cluster
     */
    public void setBreak(Float Break) {
        this.Break = Break;
    }

    /**
     * Get Average Disk Usage 
     * @return AvgDiskUsage Average Disk Usage
     */
    public Float getAvgDiskUsage() {
        return this.AvgDiskUsage;
    }

    /**
     * Set Average Disk Usage
     * @param AvgDiskUsage Average Disk Usage
     */
    public void setAvgDiskUsage(Float AvgDiskUsage) {
        this.AvgDiskUsage = AvgDiskUsage;
    }

    /**
     * Get Average memory utilization 
     * @return AvgMemUsage Average memory utilization
     */
    public Float getAvgMemUsage() {
        return this.AvgMemUsage;
    }

    /**
     * Set Average memory utilization
     * @param AvgMemUsage Average memory utilization
     */
    public void setAvgMemUsage(Float AvgMemUsage) {
        this.AvgMemUsage = AvgMemUsage;
    }

    /**
     * Get Average CPU Usage 
     * @return AvgCpuUsage Average CPU Usage
     */
    public Float getAvgCpuUsage() {
        return this.AvgCpuUsage;
    }

    /**
     * Set Average CPU Usage
     * @param AvgCpuUsage Average CPU Usage
     */
    public void setAvgCpuUsage(Float AvgCpuUsage) {
        this.AvgCpuUsage = AvgCpuUsage;
    }

    /**
     * Get Total storage size of a cluster. 
     * @return TotalDiskSize Total storage size of a cluster.
     */
    public Long getTotalDiskSize() {
        return this.TotalDiskSize;
    }

    /**
     * Set Total storage size of a cluster.
     * @param TotalDiskSize Total storage size of a cluster.
     */
    public void setTotalDiskSize(Long TotalDiskSize) {
        this.TotalDiskSize = TotalDiskSize;
    }

    /**
     * Get Client request node 
     * @return TargetNodeTypes Client request node
     */
    public String [] getTargetNodeTypes() {
        return this.TargetNodeTypes;
    }

    /**
     * Set Client request node
     * @param TargetNodeTypes Client request node
     */
    public void setTargetNodeTypes(String [] TargetNodeTypes) {
        this.TargetNodeTypes = TargetNodeTypes;
    }

    /**
     * Get Number of online nodes 
     * @return NodeNum Number of online nodes
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set Number of online nodes
     * @param NodeNum Number of online nodes
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get Total number of nodes 
     * @return TotalNodeNum Total number of nodes
     */
    public Long getTotalNodeNum() {
        return this.TotalNodeNum;
    }

    /**
     * Set Total number of nodes
     * @param TotalNodeNum Total number of nodes
     */
    public void setTotalNodeNum(Long TotalNodeNum) {
        this.TotalNodeNum = TotalNodeNum;
    }

    /**
     * Get Number of Data Nodes 
     * @return DataNodeNum Number of Data Nodes
     */
    public Long getDataNodeNum() {
        return this.DataNodeNum;
    }

    /**
     * Set Number of Data Nodes
     * @param DataNodeNum Number of Data Nodes
     */
    public void setDataNodeNum(Long DataNodeNum) {
        this.DataNodeNum = DataNodeNum;
    }

    /**
     * Get Index count 
     * @return IndexNum Index count
     */
    public Long getIndexNum() {
        return this.IndexNum;
    }

    /**
     * Set Index count
     * @param IndexNum Index count
     */
    public void setIndexNum(Long IndexNum) {
        this.IndexNum = IndexNum;
    }

    /**
     * Get Number of documents 
     * @return DocNum Number of documents
     */
    public Long getDocNum() {
        return this.DocNum;
    }

    /**
     * Set Number of documents
     * @param DocNum Number of documents
     */
    public void setDocNum(Long DocNum) {
        this.DocNum = DocNum;
    }

    /**
     * Get Used bytes of the disk 
     * @return DiskUsedInBytes Used bytes of the disk
     */
    public Long getDiskUsedInBytes() {
        return this.DiskUsedInBytes;
    }

    /**
     * Set Used bytes of the disk
     * @param DiskUsedInBytes Used bytes of the disk
     */
    public void setDiskUsedInBytes(Long DiskUsedInBytes) {
        this.DiskUsedInBytes = DiskUsedInBytes;
    }

    /**
     * Get Number of shards 
     * @return ShardNum Number of shards
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set Number of shards
     * @param ShardNum Number of shards
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get Number of primary shards 
     * @return PrimaryShardNum Number of primary shards
     */
    public Long getPrimaryShardNum() {
        return this.PrimaryShardNum;
    }

    /**
     * Set Number of primary shards
     * @param PrimaryShardNum Number of primary shards
     */
    public void setPrimaryShardNum(Long PrimaryShardNum) {
        this.PrimaryShardNum = PrimaryShardNum;
    }

    /**
     * Get Number of migrating shards 
     * @return RelocatingShardNum Number of migrating shards
     */
    public Long getRelocatingShardNum() {
        return this.RelocatingShardNum;
    }

    /**
     * Set Number of migrating shards
     * @param RelocatingShardNum Number of migrating shards
     */
    public void setRelocatingShardNum(Long RelocatingShardNum) {
        this.RelocatingShardNum = RelocatingShardNum;
    }

    /**
     * Get Number of initializing shards. 
     * @return InitializingShardNum Number of initializing shards.
     */
    public Long getInitializingShardNum() {
        return this.InitializingShardNum;
    }

    /**
     * Set Number of initializing shards.
     * @param InitializingShardNum Number of initializing shards.
     */
    public void setInitializingShardNum(Long InitializingShardNum) {
        this.InitializingShardNum = InitializingShardNum;
    }

    /**
     * Get Number of unassigned shards 
     * @return UnassignedShardNum Number of unassigned shards
     */
    public Long getUnassignedShardNum() {
        return this.UnassignedShardNum;
    }

    /**
     * Set Number of unassigned shards
     * @param UnassignedShardNum Number of unassigned shards
     */
    public void setUnassignedShardNum(Long UnassignedShardNum) {
        this.UnassignedShardNum = UnassignedShardNum;
    }

    /**
     * Get Enterprise Edition COS storage capacity size in GB 
     * @return TotalCosStorage Enterprise Edition COS storage capacity size in GB
     */
    public Long getTotalCosStorage() {
        return this.TotalCosStorage;
    }

    /**
     * Set Enterprise Edition COS storage capacity size in GB
     * @param TotalCosStorage Enterprise Edition COS storage capacity size in GB
     */
    public void setTotalCosStorage(Long TotalCosStorage) {
        this.TotalCosStorage = TotalCosStorage;
    }

    /**
     * Get bucket name for storing cos searchable snapshots in the Enterprise Edition cluster 
     * @return SearchableSnapshotCosBucket bucket name for storing cos searchable snapshots in the Enterprise Edition cluster
     */
    public String getSearchableSnapshotCosBucket() {
        return this.SearchableSnapshotCosBucket;
    }

    /**
     * Set bucket name for storing cos searchable snapshots in the Enterprise Edition cluster
     * @param SearchableSnapshotCosBucket bucket name for storing cos searchable snapshots in the Enterprise Edition cluster
     */
    public void setSearchableSnapshotCosBucket(String SearchableSnapshotCosBucket) {
        this.SearchableSnapshotCosBucket = SearchableSnapshotCosBucket;
    }

    /**
     * Get App ID of the cos bucket for searchable snapshots in the Enterprise Edition cluster 
     * @return SearchableSnapshotCosAppId App ID of the cos bucket for searchable snapshots in the Enterprise Edition cluster
     */
    public String getSearchableSnapshotCosAppId() {
        return this.SearchableSnapshotCosAppId;
    }

    /**
     * Set App ID of the cos bucket for searchable snapshots in the Enterprise Edition cluster
     * @param SearchableSnapshotCosAppId App ID of the cos bucket for searchable snapshots in the Enterprise Edition cluster
     */
    public void setSearchableSnapshotCosAppId(String SearchableSnapshotCosAppId) {
        this.SearchableSnapshotCosAppId = SearchableSnapshotCosAppId;
    }

    public ClusterView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterView(ClusterView source) {
        if (source.Health != null) {
            this.Health = new Float(source.Health);
        }
        if (source.Visible != null) {
            this.Visible = new Float(source.Visible);
        }
        if (source.Break != null) {
            this.Break = new Float(source.Break);
        }
        if (source.AvgDiskUsage != null) {
            this.AvgDiskUsage = new Float(source.AvgDiskUsage);
        }
        if (source.AvgMemUsage != null) {
            this.AvgMemUsage = new Float(source.AvgMemUsage);
        }
        if (source.AvgCpuUsage != null) {
            this.AvgCpuUsage = new Float(source.AvgCpuUsage);
        }
        if (source.TotalDiskSize != null) {
            this.TotalDiskSize = new Long(source.TotalDiskSize);
        }
        if (source.TargetNodeTypes != null) {
            this.TargetNodeTypes = new String[source.TargetNodeTypes.length];
            for (int i = 0; i < source.TargetNodeTypes.length; i++) {
                this.TargetNodeTypes[i] = new String(source.TargetNodeTypes[i]);
            }
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.TotalNodeNum != null) {
            this.TotalNodeNum = new Long(source.TotalNodeNum);
        }
        if (source.DataNodeNum != null) {
            this.DataNodeNum = new Long(source.DataNodeNum);
        }
        if (source.IndexNum != null) {
            this.IndexNum = new Long(source.IndexNum);
        }
        if (source.DocNum != null) {
            this.DocNum = new Long(source.DocNum);
        }
        if (source.DiskUsedInBytes != null) {
            this.DiskUsedInBytes = new Long(source.DiskUsedInBytes);
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
        if (source.PrimaryShardNum != null) {
            this.PrimaryShardNum = new Long(source.PrimaryShardNum);
        }
        if (source.RelocatingShardNum != null) {
            this.RelocatingShardNum = new Long(source.RelocatingShardNum);
        }
        if (source.InitializingShardNum != null) {
            this.InitializingShardNum = new Long(source.InitializingShardNum);
        }
        if (source.UnassignedShardNum != null) {
            this.UnassignedShardNum = new Long(source.UnassignedShardNum);
        }
        if (source.TotalCosStorage != null) {
            this.TotalCosStorage = new Long(source.TotalCosStorage);
        }
        if (source.SearchableSnapshotCosBucket != null) {
            this.SearchableSnapshotCosBucket = new String(source.SearchableSnapshotCosBucket);
        }
        if (source.SearchableSnapshotCosAppId != null) {
            this.SearchableSnapshotCosAppId = new String(source.SearchableSnapshotCosAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Health", this.Health);
        this.setParamSimple(map, prefix + "Visible", this.Visible);
        this.setParamSimple(map, prefix + "Break", this.Break);
        this.setParamSimple(map, prefix + "AvgDiskUsage", this.AvgDiskUsage);
        this.setParamSimple(map, prefix + "AvgMemUsage", this.AvgMemUsage);
        this.setParamSimple(map, prefix + "AvgCpuUsage", this.AvgCpuUsage);
        this.setParamSimple(map, prefix + "TotalDiskSize", this.TotalDiskSize);
        this.setParamArraySimple(map, prefix + "TargetNodeTypes.", this.TargetNodeTypes);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "TotalNodeNum", this.TotalNodeNum);
        this.setParamSimple(map, prefix + "DataNodeNum", this.DataNodeNum);
        this.setParamSimple(map, prefix + "IndexNum", this.IndexNum);
        this.setParamSimple(map, prefix + "DocNum", this.DocNum);
        this.setParamSimple(map, prefix + "DiskUsedInBytes", this.DiskUsedInBytes);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamSimple(map, prefix + "PrimaryShardNum", this.PrimaryShardNum);
        this.setParamSimple(map, prefix + "RelocatingShardNum", this.RelocatingShardNum);
        this.setParamSimple(map, prefix + "InitializingShardNum", this.InitializingShardNum);
        this.setParamSimple(map, prefix + "UnassignedShardNum", this.UnassignedShardNum);
        this.setParamSimple(map, prefix + "TotalCosStorage", this.TotalCosStorage);
        this.setParamSimple(map, prefix + "SearchableSnapshotCosBucket", this.SearchableSnapshotCosBucket);
        this.setParamSimple(map, prefix + "SearchableSnapshotCosAppId", this.SearchableSnapshotCosAppId);

    }
}

