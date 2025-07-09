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

public class OriginACLEntity extends AbstractModel {

    /**
    * Instance type. Valid values:
-l7: L7 acceleration domain;
-l4: L4 proxy instance.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Instance detail. Valid values:
-When Type = l7, please enter the L7 acceleration domain.
-When Type = l4, please enter the L4 proxy instance ID.
    */
    @SerializedName("Instances")
    @Expose
    private String [] Instances;

    /**
    * Operation mode. Valid values:.
- enable: enabled L7/L4 instances.
- disable: disable L7/L4 instances.
    */
    @SerializedName("OperationMode")
    @Expose
    private String OperationMode;

    /**
     * Get Instance type. Valid values:
-l7: L7 acceleration domain;
-l4: L4 proxy instance. 
     * @return Type Instance type. Valid values:
-l7: L7 acceleration domain;
-l4: L4 proxy instance.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Instance type. Valid values:
-l7: L7 acceleration domain;
-l4: L4 proxy instance.
     * @param Type Instance type. Valid values:
-l7: L7 acceleration domain;
-l4: L4 proxy instance.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Instance detail. Valid values:
-When Type = l7, please enter the L7 acceleration domain.
-When Type = l4, please enter the L4 proxy instance ID. 
     * @return Instances Instance detail. Valid values:
-When Type = l7, please enter the L7 acceleration domain.
-When Type = l4, please enter the L4 proxy instance ID.
     */
    public String [] getInstances() {
        return this.Instances;
    }

    /**
     * Set Instance detail. Valid values:
-When Type = l7, please enter the L7 acceleration domain.
-When Type = l4, please enter the L4 proxy instance ID.
     * @param Instances Instance detail. Valid values:
-When Type = l7, please enter the L7 acceleration domain.
-When Type = l4, please enter the L4 proxy instance ID.
     */
    public void setInstances(String [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get Operation mode. Valid values:.
- enable: enabled L7/L4 instances.
- disable: disable L7/L4 instances. 
     * @return OperationMode Operation mode. Valid values:.
- enable: enabled L7/L4 instances.
- disable: disable L7/L4 instances.
     */
    public String getOperationMode() {
        return this.OperationMode;
    }

    /**
     * Set Operation mode. Valid values:.
- enable: enabled L7/L4 instances.
- disable: disable L7/L4 instances.
     * @param OperationMode Operation mode. Valid values:.
- enable: enabled L7/L4 instances.
- disable: disable L7/L4 instances.
     */
    public void setOperationMode(String OperationMode) {
        this.OperationMode = OperationMode;
    }

    public OriginACLEntity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginACLEntity(OriginACLEntity source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Instances != null) {
            this.Instances = new String[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new String(source.Instances[i]);
            }
        }
        if (source.OperationMode != null) {
            this.OperationMode = new String(source.OperationMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "OperationMode", this.OperationMode);

    }
}

