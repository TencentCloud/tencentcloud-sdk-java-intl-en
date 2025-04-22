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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigHistory extends AbstractModel {

    /**
    * id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Instance name.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Creation time.


    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Update time.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * dn/cn
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Parameter name.
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * New parameter value.
    */
    @SerializedName("ParamNewValue")
    @Expose
    private String ParamNewValue;

    /**
    * Old parameter value.
    */
    @SerializedName("ParamOldValue")
    @Expose
    private String ParamOldValue;

    /**
    * Status. Valid values: doing and success.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get id 
     * @return Id id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id
     * @param Id id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Instance name. 
     * @return InstanceId Instance name.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance name.
     * @param InstanceId Instance name.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Creation time.

 
     * @return CreatedAt Creation time.


     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time.


     * @param CreatedAt Creation time.


     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Update time. 
     * @return UpdatedAt Update time.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time.
     * @param UpdatedAt Update time.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get dn/cn 
     * @return NodeType dn/cn
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set dn/cn
     * @param NodeType dn/cn
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Parameter name. 
     * @return ParamName Parameter name.
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set Parameter name.
     * @param ParamName Parameter name.
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get New parameter value. 
     * @return ParamNewValue New parameter value.
     */
    public String getParamNewValue() {
        return this.ParamNewValue;
    }

    /**
     * Set New parameter value.
     * @param ParamNewValue New parameter value.
     */
    public void setParamNewValue(String ParamNewValue) {
        this.ParamNewValue = ParamNewValue;
    }

    /**
     * Get Old parameter value. 
     * @return ParamOldValue Old parameter value.
     */
    public String getParamOldValue() {
        return this.ParamOldValue;
    }

    /**
     * Set Old parameter value.
     * @param ParamOldValue Old parameter value.
     */
    public void setParamOldValue(String ParamOldValue) {
        this.ParamOldValue = ParamOldValue;
    }

    /**
     * Get Status. Valid values: doing and success. 
     * @return Status Status. Valid values: doing and success.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status. Valid values: doing and success.
     * @param Status Status. Valid values: doing and success.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ConfigHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigHistory(ConfigHistory source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.ParamNewValue != null) {
            this.ParamNewValue = new String(source.ParamNewValue);
        }
        if (source.ParamOldValue != null) {
            this.ParamOldValue = new String(source.ParamOldValue);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "ParamNewValue", this.ParamNewValue);
        this.setParamSimple(map, prefix + "ParamOldValue", this.ParamOldValue);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

