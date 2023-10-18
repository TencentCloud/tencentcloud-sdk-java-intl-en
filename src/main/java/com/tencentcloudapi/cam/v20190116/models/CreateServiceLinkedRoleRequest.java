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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateServiceLinkedRoleRequest extends AbstractModel {

    /**
    * Authorized service, i.e., Tencent Cloud service entity with this role attached.
    */
    @SerializedName("QCSServiceName")
    @Expose
    private String [] QCSServiceName;

    /**
    * Custom suffix. A string you provide, which is combined with the service-provided prefix to form the complete role name.
    */
    @SerializedName("CustomSuffix")
    @Expose
    private String CustomSuffix;

    /**
    * Role description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Tags bound to the role.
    */
    @SerializedName("Tags")
    @Expose
    private RoleTags [] Tags;

    /**
     * Get Authorized service, i.e., Tencent Cloud service entity with this role attached. 
     * @return QCSServiceName Authorized service, i.e., Tencent Cloud service entity with this role attached.
     */
    public String [] getQCSServiceName() {
        return this.QCSServiceName;
    }

    /**
     * Set Authorized service, i.e., Tencent Cloud service entity with this role attached.
     * @param QCSServiceName Authorized service, i.e., Tencent Cloud service entity with this role attached.
     */
    public void setQCSServiceName(String [] QCSServiceName) {
        this.QCSServiceName = QCSServiceName;
    }

    /**
     * Get Custom suffix. A string you provide, which is combined with the service-provided prefix to form the complete role name. 
     * @return CustomSuffix Custom suffix. A string you provide, which is combined with the service-provided prefix to form the complete role name.
     */
    public String getCustomSuffix() {
        return this.CustomSuffix;
    }

    /**
     * Set Custom suffix. A string you provide, which is combined with the service-provided prefix to form the complete role name.
     * @param CustomSuffix Custom suffix. A string you provide, which is combined with the service-provided prefix to form the complete role name.
     */
    public void setCustomSuffix(String CustomSuffix) {
        this.CustomSuffix = CustomSuffix;
    }

    /**
     * Get Role description. 
     * @return Description Role description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Role description.
     * @param Description Role description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Tags bound to the role. 
     * @return Tags Tags bound to the role.
     */
    public RoleTags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags bound to the role.
     * @param Tags Tags bound to the role.
     */
    public void setTags(RoleTags [] Tags) {
        this.Tags = Tags;
    }

    public CreateServiceLinkedRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServiceLinkedRoleRequest(CreateServiceLinkedRoleRequest source) {
        if (source.QCSServiceName != null) {
            this.QCSServiceName = new String[source.QCSServiceName.length];
            for (int i = 0; i < source.QCSServiceName.length; i++) {
                this.QCSServiceName[i] = new String(source.QCSServiceName[i]);
            }
        }
        if (source.CustomSuffix != null) {
            this.CustomSuffix = new String(source.CustomSuffix);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new RoleTags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new RoleTags(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "QCSServiceName.", this.QCSServiceName);
        this.setParamSimple(map, prefix + "CustomSuffix", this.CustomSuffix);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

