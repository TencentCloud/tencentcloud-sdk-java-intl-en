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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLibraDBClusterTableMappingRequest extends AbstractModel {

    /**
    * Analysis Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Analysis engine instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Node ID
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Page history limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Source schema list
    */
    @SerializedName("SrcSchemas")
    @Expose
    private String [] SrcSchemas;

    /**
    * Source table list
    */
    @SerializedName("SrcTableName")
    @Expose
    private String [] SrcTableName;

    /**
    * Status list
    */
    @SerializedName("StatusList")
    @Expose
    private String [] StatusList;

    /**
    * Map database name
    */
    @SerializedName("MapSchemas")
    @Expose
    private String [] MapSchemas;

    /**
    * Mapping table name
    */
    @SerializedName("MapTableName")
    @Expose
    private String [] MapTableName;

    /**
    * Query records where the database name is not null
    */
    @SerializedName("MapSchemaNotEmpty")
    @Expose
    private Boolean MapSchemaNotEmpty;

    /**
    * Query records where the mapping table name is not null
    */
    @SerializedName("MapTableNameNotEmpty")
    @Expose
    private Boolean MapTableNameNotEmpty;

    /**
     * Get Analysis Cluster ID 
     * @return ClusterId Analysis Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Analysis Cluster ID
     * @param ClusterId Analysis Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Analysis engine instance ID 
     * @return InstanceId Analysis engine instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Analysis engine instance ID
     * @param InstanceId Analysis engine instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Node ID 
     * @return NodeId Node ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID
     * @param NodeId Node ID
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Offset. 
     * @return Offset Offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset.
     * @param Offset Offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Page history limit 
     * @return Limit Page history limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page history limit
     * @param Limit Page history limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Source schema list 
     * @return SrcSchemas Source schema list
     */
    public String [] getSrcSchemas() {
        return this.SrcSchemas;
    }

    /**
     * Set Source schema list
     * @param SrcSchemas Source schema list
     */
    public void setSrcSchemas(String [] SrcSchemas) {
        this.SrcSchemas = SrcSchemas;
    }

    /**
     * Get Source table list 
     * @return SrcTableName Source table list
     */
    public String [] getSrcTableName() {
        return this.SrcTableName;
    }

    /**
     * Set Source table list
     * @param SrcTableName Source table list
     */
    public void setSrcTableName(String [] SrcTableName) {
        this.SrcTableName = SrcTableName;
    }

    /**
     * Get Status list 
     * @return StatusList Status list
     */
    public String [] getStatusList() {
        return this.StatusList;
    }

    /**
     * Set Status list
     * @param StatusList Status list
     */
    public void setStatusList(String [] StatusList) {
        this.StatusList = StatusList;
    }

    /**
     * Get Map database name 
     * @return MapSchemas Map database name
     */
    public String [] getMapSchemas() {
        return this.MapSchemas;
    }

    /**
     * Set Map database name
     * @param MapSchemas Map database name
     */
    public void setMapSchemas(String [] MapSchemas) {
        this.MapSchemas = MapSchemas;
    }

    /**
     * Get Mapping table name 
     * @return MapTableName Mapping table name
     */
    public String [] getMapTableName() {
        return this.MapTableName;
    }

    /**
     * Set Mapping table name
     * @param MapTableName Mapping table name
     */
    public void setMapTableName(String [] MapTableName) {
        this.MapTableName = MapTableName;
    }

    /**
     * Get Query records where the database name is not null 
     * @return MapSchemaNotEmpty Query records where the database name is not null
     */
    public Boolean getMapSchemaNotEmpty() {
        return this.MapSchemaNotEmpty;
    }

    /**
     * Set Query records where the database name is not null
     * @param MapSchemaNotEmpty Query records where the database name is not null
     */
    public void setMapSchemaNotEmpty(Boolean MapSchemaNotEmpty) {
        this.MapSchemaNotEmpty = MapSchemaNotEmpty;
    }

    /**
     * Get Query records where the mapping table name is not null 
     * @return MapTableNameNotEmpty Query records where the mapping table name is not null
     */
    public Boolean getMapTableNameNotEmpty() {
        return this.MapTableNameNotEmpty;
    }

    /**
     * Set Query records where the mapping table name is not null
     * @param MapTableNameNotEmpty Query records where the mapping table name is not null
     */
    public void setMapTableNameNotEmpty(Boolean MapTableNameNotEmpty) {
        this.MapTableNameNotEmpty = MapTableNameNotEmpty;
    }

    public DescribeLibraDBClusterTableMappingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLibraDBClusterTableMappingRequest(DescribeLibraDBClusterTableMappingRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SrcSchemas != null) {
            this.SrcSchemas = new String[source.SrcSchemas.length];
            for (int i = 0; i < source.SrcSchemas.length; i++) {
                this.SrcSchemas[i] = new String(source.SrcSchemas[i]);
            }
        }
        if (source.SrcTableName != null) {
            this.SrcTableName = new String[source.SrcTableName.length];
            for (int i = 0; i < source.SrcTableName.length; i++) {
                this.SrcTableName[i] = new String(source.SrcTableName[i]);
            }
        }
        if (source.StatusList != null) {
            this.StatusList = new String[source.StatusList.length];
            for (int i = 0; i < source.StatusList.length; i++) {
                this.StatusList[i] = new String(source.StatusList[i]);
            }
        }
        if (source.MapSchemas != null) {
            this.MapSchemas = new String[source.MapSchemas.length];
            for (int i = 0; i < source.MapSchemas.length; i++) {
                this.MapSchemas[i] = new String(source.MapSchemas[i]);
            }
        }
        if (source.MapTableName != null) {
            this.MapTableName = new String[source.MapTableName.length];
            for (int i = 0; i < source.MapTableName.length; i++) {
                this.MapTableName[i] = new String(source.MapTableName[i]);
            }
        }
        if (source.MapSchemaNotEmpty != null) {
            this.MapSchemaNotEmpty = new Boolean(source.MapSchemaNotEmpty);
        }
        if (source.MapTableNameNotEmpty != null) {
            this.MapTableNameNotEmpty = new Boolean(source.MapTableNameNotEmpty);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "SrcSchemas.", this.SrcSchemas);
        this.setParamArraySimple(map, prefix + "SrcTableName.", this.SrcTableName);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);
        this.setParamArraySimple(map, prefix + "MapSchemas.", this.MapSchemas);
        this.setParamArraySimple(map, prefix + "MapTableName.", this.MapTableName);
        this.setParamSimple(map, prefix + "MapSchemaNotEmpty", this.MapSchemaNotEmpty);
        this.setParamSimple(map, prefix + "MapTableNameNotEmpty", this.MapTableNameNotEmpty);

    }
}

