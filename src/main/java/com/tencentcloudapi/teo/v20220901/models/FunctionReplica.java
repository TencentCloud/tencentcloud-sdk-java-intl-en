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
    * Edge function copy name.
    */
    @SerializedName("ReplicaName")
    @Expose
    private String ReplicaName;

    /**
    * Edge function replica content. Format is JavaScript code.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Edge function replica description.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Edge function replica creation time.
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * Edge function replica last update time.
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
     * Get Edge function copy name. 
     * @return ReplicaName Edge function copy name.
     */
    public String getReplicaName() {
        return this.ReplicaName;
    }

    /**
     * Set Edge function copy name.
     * @param ReplicaName Edge function copy name.
     */
    public void setReplicaName(String ReplicaName) {
        this.ReplicaName = ReplicaName;
    }

    /**
     * Get Edge function replica content. Format is JavaScript code. 
     * @return Content Edge function replica content. Format is JavaScript code.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Edge function replica content. Format is JavaScript code.
     * @param Content Edge function replica content. Format is JavaScript code.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Edge function replica description. 
     * @return Remark Edge function replica description.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Edge function replica description.
     * @param Remark Edge function replica description.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Edge function replica creation time. 
     * @return CreatedOn Edge function replica creation time.
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set Edge function replica creation time.
     * @param CreatedOn Edge function replica creation time.
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get Edge function replica last update time. 
     * @return ModifiedOn Edge function replica last update time.
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set Edge function replica last update time.
     * @param ModifiedOn Edge function replica last update time.
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

