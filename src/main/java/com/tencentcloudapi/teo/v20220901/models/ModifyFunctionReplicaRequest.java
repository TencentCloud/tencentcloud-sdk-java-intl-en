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

public class ModifyFunctionReplicaRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Function ID.
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * Name of the edge function copy that needs to be modified.
    */
    @SerializedName("ReplicaName")
    @Expose
    private String ReplicaName;

    /**
    * Content of the edge function replica, which currently only supports JavaScript code. Its maximum size is 5 MB.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Description of the edge function copy. It can contain up to 50 characters.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

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
     * Get Name of the edge function copy that needs to be modified. 
     * @return ReplicaName Name of the edge function copy that needs to be modified.
     */
    public String getReplicaName() {
        return this.ReplicaName;
    }

    /**
     * Set Name of the edge function copy that needs to be modified.
     * @param ReplicaName Name of the edge function copy that needs to be modified.
     */
    public void setReplicaName(String ReplicaName) {
        this.ReplicaName = ReplicaName;
    }

    /**
     * Get Content of the edge function replica, which currently only supports JavaScript code. Its maximum size is 5 MB. 
     * @return Content Content of the edge function replica, which currently only supports JavaScript code. Its maximum size is 5 MB.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Content of the edge function replica, which currently only supports JavaScript code. Its maximum size is 5 MB.
     * @param Content Content of the edge function replica, which currently only supports JavaScript code. Its maximum size is 5 MB.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Description of the edge function copy. It can contain up to 50 characters. 
     * @return Remark Description of the edge function copy. It can contain up to 50 characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Description of the edge function copy. It can contain up to 50 characters.
     * @param Remark Description of the edge function copy. It can contain up to 50 characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyFunctionReplicaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFunctionReplicaRequest(ModifyFunctionReplicaRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "ReplicaName", this.ReplicaName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

