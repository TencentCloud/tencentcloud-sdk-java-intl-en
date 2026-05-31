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

public class ModifyLibraDBClusterDataSourceRequest extends AbstractModel {

    /**
    * Analysis Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Read-only analysis engine instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Source information
    */
    @SerializedName("SrcInfo")
    @Expose
    private LibraDBClusterSrcInfo [] SrcInfo;

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
     * Get Read-only analysis engine instance ID 
     * @return InstanceId Read-only analysis engine instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Read-only analysis engine instance ID
     * @param InstanceId Read-only analysis engine instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Source information 
     * @return SrcInfo Source information
     */
    public LibraDBClusterSrcInfo [] getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set Source information
     * @param SrcInfo Source information
     */
    public void setSrcInfo(LibraDBClusterSrcInfo [] SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    public ModifyLibraDBClusterDataSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLibraDBClusterDataSourceRequest(ModifyLibraDBClusterDataSourceRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SrcInfo != null) {
            this.SrcInfo = new LibraDBClusterSrcInfo[source.SrcInfo.length];
            for (int i = 0; i < source.SrcInfo.length; i++) {
                this.SrcInfo[i] = new LibraDBClusterSrcInfo(source.SrcInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "SrcInfo.", this.SrcInfo);

    }
}

