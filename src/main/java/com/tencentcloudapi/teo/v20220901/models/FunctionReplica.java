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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionReplica extends AbstractModel {

    /**
    * Function ID.
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * Name of the edge function copy.
    */
    @SerializedName("ReplicaName")
    @Expose
    private String ReplicaName;

    /**
    * Content of the edge function copy. Format: JavaScript code.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Description of the edge function replica.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Creation time of the edge function replica.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Last update time of the edge function replica.
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get Function ID. 
     * @return FunctionId Function ID.
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set Function ID.
     * @param FunctionId Function ID.
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get Name of the edge function copy. 
     * @return ReplicaName Name of the edge function copy.
     */
    public String getReplicaName() {
        return this.ReplicaName;
    }

    /**
     * Set Name of the edge function copy.
     * @param ReplicaName Name of the edge function copy.
     */
    public void setReplicaName(String ReplicaName) {
        this.ReplicaName = ReplicaName;
    }

    /**
     * Get Content of the edge function copy. Format: JavaScript code. 
     * @return Content Content of the edge function copy. Format: JavaScript code.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Content of the edge function copy. Format: JavaScript code.
     * @param Content Content of the edge function copy. Format: JavaScript code.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Description of the edge function replica. 
     * @return Remark Description of the edge function replica.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Description of the edge function replica.
     * @param Remark Description of the edge function replica.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Creation time of the edge function replica. 
     * @return CreatedOn Creation time of the edge function replica.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Creation time of the edge function replica.
     * @param CreatedOn Creation time of the edge function replica.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Last update time of the edge function replica. 
     * @return ModifiedOn Last update time of the edge function replica.
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set Last update time of the edge function replica.
     * @param ModifiedOn Last update time of the edge function replica.
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    public FunctionReplica() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionReplica(FunctionReplica source) {
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.ReplicaName != null) {
            this.ReplicaName = new String(source.ReplicaName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "ReplicaName", this.ReplicaName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);

    }
}

