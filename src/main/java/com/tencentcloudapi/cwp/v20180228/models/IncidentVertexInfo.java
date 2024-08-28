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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncidentVertexInfo extends AbstractModel {

    /**
    * Event ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IncidentId")
    @Expose
    private String IncidentId;

    /**
    * The name of the table where the event occurred
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * A list of node information, with array items containing detailed node information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vertex")
    @Expose
    private VertexInfo [] Vertex;

    /**
    * Total number of nodes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VertexCount")
    @Expose
    private Long VertexCount;

    /**
     * Get Event ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IncidentId Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIncidentId() {
        return this.IncidentId;
    }

    /**
     * Set Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IncidentId Event ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIncidentId(String IncidentId) {
        this.IncidentId = IncidentId;
    }

    /**
     * Get The name of the table where the event occurred
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableName The name of the table where the event occurred
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set The name of the table where the event occurred
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableName The name of the table where the event occurred
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get A list of node information, with array items containing detailed node information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vertex A list of node information, with array items containing detailed node information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VertexInfo [] getVertex() {
        return this.Vertex;
    }

    /**
     * Set A list of node information, with array items containing detailed node information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vertex A list of node information, with array items containing detailed node information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVertex(VertexInfo [] Vertex) {
        this.Vertex = Vertex;
    }

    /**
     * Get Total number of nodes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VertexCount Total number of nodes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVertexCount() {
        return this.VertexCount;
    }

    /**
     * Set Total number of nodes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VertexCount Total number of nodes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVertexCount(Long VertexCount) {
        this.VertexCount = VertexCount;
    }

    public IncidentVertexInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncidentVertexInfo(IncidentVertexInfo source) {
        if (source.IncidentId != null) {
            this.IncidentId = new String(source.IncidentId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Vertex != null) {
            this.Vertex = new VertexInfo[source.Vertex.length];
            for (int i = 0; i < source.Vertex.length; i++) {
                this.Vertex[i] = new VertexInfo(source.Vertex[i]);
            }
        }
        if (source.VertexCount != null) {
            this.VertexCount = new Long(source.VertexCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IncidentId", this.IncidentId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamArrayObj(map, prefix + "Vertex.", this.Vertex);
        this.setParamSimple(map, prefix + "VertexCount", this.VertexCount);

    }
}

