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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmServiceInfo extends AbstractModel {

    /**
    * Business ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Application name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceNameList")
    @Expose
    private String [] ServiceNameList;

    /**
    * Region ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get Business ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Business ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Business ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Business ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Application name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceNameList Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getServiceNameList() {
        return this.ServiceNameList;
    }

    /**
     * Set Application name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceNameList Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceNameList(String [] ServiceNameList) {
        this.ServiceNameList = ServiceNameList;
    }

    /**
     * Get Region ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionId Region ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionId Region ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    public ApmServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmServiceInfo(ApmServiceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ServiceNameList != null) {
            this.ServiceNameList = new String[source.ServiceNameList.length];
            for (int i = 0; i < source.ServiceNameList.length; i++) {
                this.ServiceNameList[i] = new String(source.ServiceNameList[i]);
            }
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "ServiceNameList.", this.ServiceNameList);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

