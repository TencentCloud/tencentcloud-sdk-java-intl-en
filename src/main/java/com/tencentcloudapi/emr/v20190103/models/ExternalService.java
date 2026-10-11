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

public class ExternalService extends AbstractModel {

    /**
    * Shared component type. Valid values: EMR and CUSTOM.
    */
    @SerializedName("ShareType")
    @Expose
    private String ShareType;

    /**
    * Shared component name.
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * Shared component cluster.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Custom parameter collection.
    */
    @SerializedName("CustomServiceDefineList")
    @Expose
    private CustomServiceDefine [] CustomServiceDefineList;

    /**
     * Get Shared component type. Valid values: EMR and CUSTOM. 
     * @return ShareType Shared component type. Valid values: EMR and CUSTOM.
     */
    public String getShareType() {
        return this.ShareType;
    }

    /**
     * Set Shared component type. Valid values: EMR and CUSTOM.
     * @param ShareType Shared component type. Valid values: EMR and CUSTOM.
     */
    public void setShareType(String ShareType) {
        this.ShareType = ShareType;
    }

    /**
     * Get Shared component name. 
     * @return Service Shared component name.
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set Shared component name.
     * @param Service Shared component name.
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get Shared component cluster. 
     * @return InstanceId Shared component cluster.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Shared component cluster.
     * @param InstanceId Shared component cluster.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Custom parameter collection. 
     * @return CustomServiceDefineList Custom parameter collection.
     */
    public CustomServiceDefine [] getCustomServiceDefineList() {
        return this.CustomServiceDefineList;
    }

    /**
     * Set Custom parameter collection.
     * @param CustomServiceDefineList Custom parameter collection.
     */
    public void setCustomServiceDefineList(CustomServiceDefine [] CustomServiceDefineList) {
        this.CustomServiceDefineList = CustomServiceDefineList;
    }

    public ExternalService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExternalService(ExternalService source) {
        if (source.ShareType != null) {
            this.ShareType = new String(source.ShareType);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CustomServiceDefineList != null) {
            this.CustomServiceDefineList = new CustomServiceDefine[source.CustomServiceDefineList.length];
            for (int i = 0; i < source.CustomServiceDefineList.length; i++) {
                this.CustomServiceDefineList[i] = new CustomServiceDefine(source.CustomServiceDefineList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShareType", this.ShareType);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "CustomServiceDefineList.", this.CustomServiceDefineList);

    }
}

