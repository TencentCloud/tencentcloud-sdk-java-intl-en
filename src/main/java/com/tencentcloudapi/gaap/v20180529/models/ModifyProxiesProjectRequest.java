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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProxiesProjectRequest extends AbstractModel{

    /**
    * The target project ID.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * ID of one or multiple connections to be operated; It’s an old parameter, please switch to ProxyIds.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idem-potency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * ID of one or multiple connections to be operated; It’s a new parameter.
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
     * Get The target project ID. 
     * @return ProjectId The target project ID.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set The target project ID.
     * @param ProjectId The target project ID.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get ID of one or multiple connections to be operated; It’s an old parameter, please switch to ProxyIds. 
     * @return InstanceIds ID of one or multiple connections to be operated; It’s an old parameter, please switch to ProxyIds.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set ID of one or multiple connections to be operated; It’s an old parameter, please switch to ProxyIds.
     * @param InstanceIds ID of one or multiple connections to be operated; It’s an old parameter, please switch to ProxyIds.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idem-potency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence. 
     * @return ClientToken A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idem-potency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idem-potency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
     * @param ClientToken A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idem-potency of the request cannot be guaranteed.
For more information, please see How to Ensure Idempotence.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get ID of one or multiple connections to be operated; It’s a new parameter. 
     * @return ProxyIds ID of one or multiple connections to be operated; It’s a new parameter.
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set ID of one or multiple connections to be operated; It’s a new parameter.
     * @param ProxyIds ID of one or multiple connections to be operated; It’s a new parameter.
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
    }

    public ModifyProxiesProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProxiesProjectRequest(ModifyProxiesProjectRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.ProxyIds != null) {
            this.ProxyIds = new String[source.ProxyIds.length];
            for (int i = 0; i < source.ProxyIds.length; i++) {
                this.ProxyIds[i] = new String(source.ProxyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamArraySimple(map, prefix + "ProxyIds.", this.ProxyIds);

    }
}

