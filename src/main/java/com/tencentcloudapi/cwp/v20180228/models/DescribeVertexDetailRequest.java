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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVertexDetailRequest extends AbstractModel {

    /**
    * Point ID list
    */
    @SerializedName("VertexIds")
    @Expose
    private String [] VertexIds;

    /**
    * Event ID
    */
    @SerializedName("IncidentId")
    @Expose
    private String IncidentId;

    /**
    * The name of the table where the event occurred
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
     * Get Point ID list 
     * @return VertexIds Point ID list
     */
    public String [] getVertexIds() {
        return this.VertexIds;
    }

    /**
     * Set Point ID list
     * @param VertexIds Point ID list
     */
    public void setVertexIds(String [] VertexIds) {
        this.VertexIds = VertexIds;
    }

    /**
     * Get Event ID 
     * @return IncidentId Event ID
     */
    public String getIncidentId() {
        return this.IncidentId;
    }

    /**
     * Set Event ID
     * @param IncidentId Event ID
     */
    public void setIncidentId(String IncidentId) {
        this.IncidentId = IncidentId;
    }

    /**
     * Get The name of the table where the event occurred 
     * @return TableName The name of the table where the event occurred
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set The name of the table where the event occurred
     * @param TableName The name of the table where the event occurred
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public DescribeVertexDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVertexDetailRequest(DescribeVertexDetailRequest source) {
        if (source.VertexIds != null) {
            this.VertexIds = new String[source.VertexIds.length];
            for (int i = 0; i < source.VertexIds.length; i++) {
                this.VertexIds[i] = new String(source.VertexIds[i]);
            }
        }
        if (source.IncidentId != null) {
            this.IncidentId = new String(source.IncidentId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VertexIds.", this.VertexIds);
        this.setParamSimple(map, prefix + "IncidentId", this.IncidentId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

