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

public class DescribeTableGroupTagsRequest extends AbstractModel{

    /**
    * The ID of the cluster where table group tags need to be queried
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The list of IDs of the table groups whose tags need to be queried
    */
    @SerializedName("TableGroupIds")
    @Expose
    private String [] TableGroupIds;

    /**
     * Get The ID of the cluster where table group tags need to be queried 
     * @return ClusterId The ID of the cluster where table group tags need to be queried
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The ID of the cluster where table group tags need to be queried
     * @param ClusterId The ID of the cluster where table group tags need to be queried
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The list of IDs of the table groups whose tags need to be queried 
     * @return TableGroupIds The list of IDs of the table groups whose tags need to be queried
     */
    public String [] getTableGroupIds() {
        return this.TableGroupIds;
    }

    /**
     * Set The list of IDs of the table groups whose tags need to be queried
     * @param TableGroupIds The list of IDs of the table groups whose tags need to be queried
     */
    public void setTableGroupIds(String [] TableGroupIds) {
        this.TableGroupIds = TableGroupIds;
    }

    public DescribeTableGroupTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableGroupTagsRequest(DescribeTableGroupTagsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TableGroupIds != null) {
            this.TableGroupIds = new String[source.TableGroupIds.length];
            for (int i = 0; i < source.TableGroupIds.length; i++) {
                this.TableGroupIds[i] = new String(source.TableGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "TableGroupIds.", this.TableGroupIds);

    }
}

