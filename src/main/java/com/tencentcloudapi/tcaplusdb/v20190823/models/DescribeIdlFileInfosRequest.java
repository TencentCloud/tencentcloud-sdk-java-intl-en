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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIdlFileInfosRequest extends AbstractModel{

    /**
    * ID of the cluster where a file resides
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * ID of the table group where a file resides
    */
    @SerializedName("TableGroupIds")
    @Expose
    private String [] TableGroupIds;

    /**
    * File ID list
    */
    @SerializedName("IdlFileIds")
    @Expose
    private String [] IdlFileIds;

    /**
    * Query list offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results in query list
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get ID of the cluster where a file resides 
     * @return ClusterId ID of the cluster where a file resides
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the cluster where a file resides
     * @param ClusterId ID of the cluster where a file resides
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get ID of the table group where a file resides 
     * @return TableGroupIds ID of the table group where a file resides
     */
    public String [] getTableGroupIds() {
        return this.TableGroupIds;
    }

    /**
     * Set ID of the table group where a file resides
     * @param TableGroupIds ID of the table group where a file resides
     */
    public void setTableGroupIds(String [] TableGroupIds) {
        this.TableGroupIds = TableGroupIds;
    }

    /**
     * Get File ID list 
     * @return IdlFileIds File ID list
     */
    public String [] getIdlFileIds() {
        return this.IdlFileIds;
    }

    /**
     * Set File ID list
     * @param IdlFileIds File ID list
     */
    public void setIdlFileIds(String [] IdlFileIds) {
        this.IdlFileIds = IdlFileIds;
    }

    /**
     * Get Query list offset 
     * @return Offset Query list offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Query list offset
     * @param Offset Query list offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results in query list 
     * @return Limit Number of returned results in query list
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results in query list
     * @param Limit Number of returned results in query list
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeIdlFileInfosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIdlFileInfosRequest(DescribeIdlFileInfosRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TableGroupIds != null) {
            this.TableGroupIds = new String[source.TableGroupIds.length];
            for (int i = 0; i < source.TableGroupIds.length; i++) {
                this.TableGroupIds[i] = new String(source.TableGroupIds[i]);
            }
        }
        if (source.IdlFileIds != null) {
            this.IdlFileIds = new String[source.IdlFileIds.length];
            for (int i = 0; i < source.IdlFileIds.length; i++) {
                this.IdlFileIds[i] = new String(source.IdlFileIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "TableGroupIds.", this.TableGroupIds);
        this.setParamArraySimple(map, prefix + "IdlFileIds.", this.IdlFileIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

