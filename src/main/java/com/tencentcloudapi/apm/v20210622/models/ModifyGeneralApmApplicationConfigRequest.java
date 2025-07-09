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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGeneralApmApplicationConfigRequest extends AbstractModel {

    /**
    * Business system id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Fields to be modified. the key and value respectively specify the field name and field value.
.
For specific fields, please refer to.
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * Name of the application list that requires configuration modification.	
    */
    @SerializedName("ServiceNames")
    @Expose
    private String [] ServiceNames;

    /**
     * Get Business system id. 
     * @return InstanceId Business system id.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Business system id.
     * @param InstanceId Business system id.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Fields to be modified. the key and value respectively specify the field name and field value.
.
For specific fields, please refer to. 
     * @return Tags Fields to be modified. the key and value respectively specify the field name and field value.
.
For specific fields, please refer to.
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Fields to be modified. the key and value respectively specify the field name and field value.
.
For specific fields, please refer to.
     * @param Tags Fields to be modified. the key and value respectively specify the field name and field value.
.
For specific fields, please refer to.
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Name of the application list that requires configuration modification.	 
     * @return ServiceNames Name of the application list that requires configuration modification.	
     */
    public String [] getServiceNames() {
        return this.ServiceNames;
    }

    /**
     * Set Name of the application list that requires configuration modification.	
     * @param ServiceNames Name of the application list that requires configuration modification.	
     */
    public void setServiceNames(String [] ServiceNames) {
        this.ServiceNames = ServiceNames;
    }

    public ModifyGeneralApmApplicationConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGeneralApmApplicationConfigRequest(ModifyGeneralApmApplicationConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.ServiceNames != null) {
            this.ServiceNames = new String[source.ServiceNames.length];
            for (int i = 0; i < source.ServiceNames.length; i++) {
                this.ServiceNames[i] = new String(source.ServiceNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "ServiceNames.", this.ServiceNames);

    }
}

