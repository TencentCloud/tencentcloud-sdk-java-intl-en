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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RotateClusterTokenRequest extends AbstractModel {

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>Cluster type. Valid values: TKEServerless and TKE. Default value: TKE.</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>Operation to perform. Valid values: CreateNewToken, RevokeOldToken, and RecoverOldToken.<br>CreateNewToken: Creates a new token and makes it take effect. By default, a maximum of two tokens can take effect at the same time. If you want more tokens to take effect, Force must be set to true.<br>RevokeOldToken: Deletes the old token and makes it invalid. In this case, ClusterToken is required.<br>RecoverOldToken: Recovers the old token and makes it take effect. In this case, ClusterToken is required, and this operation can be called only when there is a corresponding RevokeOldToken task that has succeeded.</p>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * <p>Cluster token. It is required only when Operation is set to RevokeOldToken or RecoverOldToken.</p>
    */
    @SerializedName("ClusterToken")
    @Expose
    private String ClusterToken;

    /**
    * <p>Default value: false. It is required only when Operation is set to CreateNewToken. Only when it is set to true can more than two tokens take effect.</p>
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterId <p>Cluster ID.</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterId <p>Cluster ID.</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>Cluster type. Valid values: TKEServerless and TKE. Default value: TKE.</p> 
     * @return ClusterType <p>Cluster type. Valid values: TKEServerless and TKE. Default value: TKE.</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>Cluster type. Valid values: TKEServerless and TKE. Default value: TKE.</p>
     * @param ClusterType <p>Cluster type. Valid values: TKEServerless and TKE. Default value: TKE.</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>Operation to perform. Valid values: CreateNewToken, RevokeOldToken, and RecoverOldToken.<br>CreateNewToken: Creates a new token and makes it take effect. By default, a maximum of two tokens can take effect at the same time. If you want more tokens to take effect, Force must be set to true.<br>RevokeOldToken: Deletes the old token and makes it invalid. In this case, ClusterToken is required.<br>RecoverOldToken: Recovers the old token and makes it take effect. In this case, ClusterToken is required, and this operation can be called only when there is a corresponding RevokeOldToken task that has succeeded.</p> 
     * @return Operation <p>Operation to perform. Valid values: CreateNewToken, RevokeOldToken, and RecoverOldToken.<br>CreateNewToken: Creates a new token and makes it take effect. By default, a maximum of two tokens can take effect at the same time. If you want more tokens to take effect, Force must be set to true.<br>RevokeOldToken: Deletes the old token and makes it invalid. In this case, ClusterToken is required.<br>RecoverOldToken: Recovers the old token and makes it take effect. In this case, ClusterToken is required, and this operation can be called only when there is a corresponding RevokeOldToken task that has succeeded.</p>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set <p>Operation to perform. Valid values: CreateNewToken, RevokeOldToken, and RecoverOldToken.<br>CreateNewToken: Creates a new token and makes it take effect. By default, a maximum of two tokens can take effect at the same time. If you want more tokens to take effect, Force must be set to true.<br>RevokeOldToken: Deletes the old token and makes it invalid. In this case, ClusterToken is required.<br>RecoverOldToken: Recovers the old token and makes it take effect. In this case, ClusterToken is required, and this operation can be called only when there is a corresponding RevokeOldToken task that has succeeded.</p>
     * @param Operation <p>Operation to perform. Valid values: CreateNewToken, RevokeOldToken, and RecoverOldToken.<br>CreateNewToken: Creates a new token and makes it take effect. By default, a maximum of two tokens can take effect at the same time. If you want more tokens to take effect, Force must be set to true.<br>RevokeOldToken: Deletes the old token and makes it invalid. In this case, ClusterToken is required.<br>RecoverOldToken: Recovers the old token and makes it take effect. In this case, ClusterToken is required, and this operation can be called only when there is a corresponding RevokeOldToken task that has succeeded.</p>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get <p>Cluster token. It is required only when Operation is set to RevokeOldToken or RecoverOldToken.</p> 
     * @return ClusterToken <p>Cluster token. It is required only when Operation is set to RevokeOldToken or RecoverOldToken.</p>
     */
    public String getClusterToken() {
        return this.ClusterToken;
    }

    /**
     * Set <p>Cluster token. It is required only when Operation is set to RevokeOldToken or RecoverOldToken.</p>
     * @param ClusterToken <p>Cluster token. It is required only when Operation is set to RevokeOldToken or RecoverOldToken.</p>
     */
    public void setClusterToken(String ClusterToken) {
        this.ClusterToken = ClusterToken;
    }

    /**
     * Get <p>Default value: false. It is required only when Operation is set to CreateNewToken. Only when it is set to true can more than two tokens take effect.</p> 
     * @return Force <p>Default value: false. It is required only when Operation is set to CreateNewToken. Only when it is set to true can more than two tokens take effect.</p>
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set <p>Default value: false. It is required only when Operation is set to CreateNewToken. Only when it is set to true can more than two tokens take effect.</p>
     * @param Force <p>Default value: false. It is required only when Operation is set to CreateNewToken. Only when it is set to true can more than two tokens take effect.</p>
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public RotateClusterTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RotateClusterTokenRequest(RotateClusterTokenRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ClusterToken != null) {
            this.ClusterToken = new String(source.ClusterToken);
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ClusterToken", this.ClusterToken);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

