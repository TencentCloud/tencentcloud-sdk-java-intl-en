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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareTablesInfo extends AbstractModel {

    /**
    * Cluster ID of the source table
    */
    @SerializedName("SrcTableClusterId")
    @Expose
    private String SrcTableClusterId;

    /**
    * Table group ID of the source table
    */
    @SerializedName("SrcTableGroupId")
    @Expose
    private String SrcTableGroupId;

    /**
    * Source table name
    */
    @SerializedName("SrcTableName")
    @Expose
    private String SrcTableName;

    /**
    * Cluster ID of the target table
    */
    @SerializedName("DstTableClusterId")
    @Expose
    private String DstTableClusterId;

    /**
    * Table group ID of the target table
    */
    @SerializedName("DstTableGroupId")
    @Expose
    private String DstTableGroupId;

    /**
    * Target table name
    */
    @SerializedName("DstTableName")
    @Expose
    private String DstTableName;

    /**
    * Source table ID
    */
    @SerializedName("SrcTableInstanceId")
    @Expose
    private String SrcTableInstanceId;

    /**
    * Target table ID
    */
    @SerializedName("DstTableInstanceId")
    @Expose
    private String DstTableInstanceId;

    /**
     * Get Cluster ID of the source table 
     * @return SrcTableClusterId Cluster ID of the source table
     */
    public String getSrcTableClusterId() {
        return this.SrcTableClusterId;
    }

    /**
     * Set Cluster ID of the source table
     * @param SrcTableClusterId Cluster ID of the source table
     */
    public void setSrcTableClusterId(String SrcTableClusterId) {
        this.SrcTableClusterId = SrcTableClusterId;
    }

    /**
     * Get Table group ID of the source table 
     * @return SrcTableGroupId Table group ID of the source table
     */
    public String getSrcTableGroupId() {
        return this.SrcTableGroupId;
    }

    /**
     * Set Table group ID of the source table
     * @param SrcTableGroupId Table group ID of the source table
     */
    public void setSrcTableGroupId(String SrcTableGroupId) {
        this.SrcTableGroupId = SrcTableGroupId;
    }

    /**
     * Get Source table name 
     * @return SrcTableName Source table name
     */
    public String getSrcTableName() {
        return this.SrcTableName;
    }

    /**
     * Set Source table name
     * @param SrcTableName Source table name
     */
    public void setSrcTableName(String SrcTableName) {
        this.SrcTableName = SrcTableName;
    }

    /**
     * Get Cluster ID of the target table 
     * @return DstTableClusterId Cluster ID of the target table
     */
    public String getDstTableClusterId() {
        return this.DstTableClusterId;
    }

    /**
     * Set Cluster ID of the target table
     * @param DstTableClusterId Cluster ID of the target table
     */
    public void setDstTableClusterId(String DstTableClusterId) {
        this.DstTableClusterId = DstTableClusterId;
    }

    /**
     * Get Table group ID of the target table 
     * @return DstTableGroupId Table group ID of the target table
     */
    public String getDstTableGroupId() {
        return this.DstTableGroupId;
    }

    /**
     * Set Table group ID of the target table
     * @param DstTableGroupId Table group ID of the target table
     */
    public void setDstTableGroupId(String DstTableGroupId) {
        this.DstTableGroupId = DstTableGroupId;
    }

    /**
     * Get Target table name 
     * @return DstTableName Target table name
     */
    public String getDstTableName() {
        return this.DstTableName;
    }

    /**
     * Set Target table name
     * @param DstTableName Target table name
     */
    public void setDstTableName(String DstTableName) {
        this.DstTableName = DstTableName;
    }

    /**
     * Get Source table ID 
     * @return SrcTableInstanceId Source table ID
     */
    public String getSrcTableInstanceId() {
        return this.SrcTableInstanceId;
    }

    /**
     * Set Source table ID
     * @param SrcTableInstanceId Source table ID
     */
    public void setSrcTableInstanceId(String SrcTableInstanceId) {
        this.SrcTableInstanceId = SrcTableInstanceId;
    }

    /**
     * Get Target table ID 
     * @return DstTableInstanceId Target table ID
     */
    public String getDstTableInstanceId() {
        return this.DstTableInstanceId;
    }

    /**
     * Set Target table ID
     * @param DstTableInstanceId Target table ID
     */
    public void setDstTableInstanceId(String DstTableInstanceId) {
        this.DstTableInstanceId = DstTableInstanceId;
    }

    public CompareTablesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareTablesInfo(CompareTablesInfo source) {
        if (source.SrcTableClusterId != null) {
            this.SrcTableClusterId = new String(source.SrcTableClusterId);
        }
        if (source.SrcTableGroupId != null) {
            this.SrcTableGroupId = new String(source.SrcTableGroupId);
        }
        if (source.SrcTableName != null) {
            this.SrcTableName = new String(source.SrcTableName);
        }
        if (source.DstTableClusterId != null) {
            this.DstTableClusterId = new String(source.DstTableClusterId);
        }
        if (source.DstTableGroupId != null) {
            this.DstTableGroupId = new String(source.DstTableGroupId);
        }
        if (source.DstTableName != null) {
            this.DstTableName = new String(source.DstTableName);
        }
        if (source.SrcTableInstanceId != null) {
            this.SrcTableInstanceId = new String(source.SrcTableInstanceId);
        }
        if (source.DstTableInstanceId != null) {
            this.DstTableInstanceId = new String(source.DstTableInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcTableClusterId", this.SrcTableClusterId);
        this.setParamSimple(map, prefix + "SrcTableGroupId", this.SrcTableGroupId);
        this.setParamSimple(map, prefix + "SrcTableName", this.SrcTableName);
        this.setParamSimple(map, prefix + "DstTableClusterId", this.DstTableClusterId);
        this.setParamSimple(map, prefix + "DstTableGroupId", this.DstTableGroupId);
        this.setParamSimple(map, prefix + "DstTableName", this.DstTableName);
        this.setParamSimple(map, prefix + "SrcTableInstanceId", this.SrcTableInstanceId);
        this.setParamSimple(map, prefix + "DstTableInstanceId", this.DstTableInstanceId);

    }
}

