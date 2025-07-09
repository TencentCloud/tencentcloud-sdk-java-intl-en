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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySLInstanceRequest extends AbstractModel {

    /**
    * Instance unique identifier (string).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Region name to be changed.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Target node count after configuration change in this region. The total number of nodes across all regions should be greater than or equal to 3 and less than or equal to 50.
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * The unique random identifier with a time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from creating resources repeatedly. For example: a9a90aa6-****-****-****-fae360632808.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get Instance unique identifier (string). 
     * @return InstanceId Instance unique identifier (string).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance unique identifier (string).
     * @param InstanceId Instance unique identifier (string).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Region name to be changed. 
     * @return Zone Region name to be changed.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Region name to be changed.
     * @param Zone Region name to be changed.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Target node count after configuration change in this region. The total number of nodes across all regions should be greater than or equal to 3 and less than or equal to 50. 
     * @return NodeNum Target node count after configuration change in this region. The total number of nodes across all regions should be greater than or equal to 3 and less than or equal to 50.
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set Target node count after configuration change in this region. The total number of nodes across all regions should be greater than or equal to 3 and less than or equal to 50.
     * @param NodeNum Target node count after configuration change in this region. The total number of nodes across all regions should be greater than or equal to 3 and less than or equal to 50.
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get The unique random identifier with a time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from creating resources repeatedly. For example: a9a90aa6-****-****-****-fae360632808. 
     * @return ClientToken The unique random identifier with a time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from creating resources repeatedly. For example: a9a90aa6-****-****-****-fae360632808.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set The unique random identifier with a time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from creating resources repeatedly. For example: a9a90aa6-****-****-****-fae360632808.
     * @param ClientToken The unique random identifier with a time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from creating resources repeatedly. For example: a9a90aa6-****-****-****-fae360632808.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public ModifySLInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySLInstanceRequest(ModifySLInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

