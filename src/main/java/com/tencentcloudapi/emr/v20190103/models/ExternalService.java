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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExternalService extends AbstractModel{

    /**
    * Shared component type, which can be EMR or CUSTOM
    */
    @SerializedName("ShareType")
    @Expose
    private String ShareType;

    /**
    * Custom parameters
    */
    @SerializedName("CustomServiceDefineList")
    @Expose
    private CustomServiceDefine [] CustomServiceDefineList;

    /**
    * Shared component name
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * Shared component cluster
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Shared component type, which can be EMR or CUSTOM 
     * @return ShareType Shared component type, which can be EMR or CUSTOM
     */
    public String getShareType() {
        return this.ShareType;
    }

    /**
     * Set Shared component type, which can be EMR or CUSTOM
     * @param ShareType Shared component type, which can be EMR or CUSTOM
     */
    public void setShareType(String ShareType) {
        this.ShareType = ShareType;
    }

    /**
     * Get Custom parameters 
     * @return CustomServiceDefineList Custom parameters
     */
    public CustomServiceDefine [] getCustomServiceDefineList() {
        return this.CustomServiceDefineList;
    }

    /**
     * Set Custom parameters
     * @param CustomServiceDefineList Custom parameters
     */
    public void setCustomServiceDefineList(CustomServiceDefine [] CustomServiceDefineList) {
        this.CustomServiceDefineList = CustomServiceDefineList;
    }

    /**
     * Get Shared component name 
     * @return Service Shared component name
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set Shared component name
     * @param Service Shared component name
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get Shared component cluster 
     * @return InstanceId Shared component cluster
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Shared component cluster
     * @param InstanceId Shared component cluster
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
        if (source.CustomServiceDefineList != null) {
            this.CustomServiceDefineList = new CustomServiceDefine[source.CustomServiceDefineList.length];
            for (int i = 0; i < source.CustomServiceDefineList.length; i++) {
                this.CustomServiceDefineList[i] = new CustomServiceDefine(source.CustomServiceDefineList[i]);
            }
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShareType", this.ShareType);
        this.setParamArrayObj(map, prefix + "CustomServiceDefineList.", this.CustomServiceDefineList);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

