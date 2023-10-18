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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ISPCounter extends AbstractModel {

    /**
    * ISP name
    */
    @SerializedName("ProviderName")
    @Expose
    private String ProviderName;

    /**
    * Number of nodes
    */
    @SerializedName("ProviderNodeNum")
    @Expose
    private Long ProviderNodeNum;

    /**
    * Number of instances
    */
    @SerializedName("ProvederInstanceNum")
    @Expose
    private Long ProvederInstanceNum;

    /**
    * Zone instance information structure array
    */
    @SerializedName("ZoneInstanceInfoSet")
    @Expose
    private ZoneInstanceInfo [] ZoneInstanceInfoSet;

    /**
     * Get ISP name 
     * @return ProviderName ISP name
     */
    public String getProviderName() {
        return this.ProviderName;
    }

    /**
     * Set ISP name
     * @param ProviderName ISP name
     */
    public void setProviderName(String ProviderName) {
        this.ProviderName = ProviderName;
    }

    /**
     * Get Number of nodes 
     * @return ProviderNodeNum Number of nodes
     */
    public Long getProviderNodeNum() {
        return this.ProviderNodeNum;
    }

    /**
     * Set Number of nodes
     * @param ProviderNodeNum Number of nodes
     */
    public void setProviderNodeNum(Long ProviderNodeNum) {
        this.ProviderNodeNum = ProviderNodeNum;
    }

    /**
     * Get Number of instances 
     * @return ProvederInstanceNum Number of instances
     */
    public Long getProvederInstanceNum() {
        return this.ProvederInstanceNum;
    }

    /**
     * Set Number of instances
     * @param ProvederInstanceNum Number of instances
     */
    public void setProvederInstanceNum(Long ProvederInstanceNum) {
        this.ProvederInstanceNum = ProvederInstanceNum;
    }

    /**
     * Get Zone instance information structure array 
     * @return ZoneInstanceInfoSet Zone instance information structure array
     */
    public ZoneInstanceInfo [] getZoneInstanceInfoSet() {
        return this.ZoneInstanceInfoSet;
    }

    /**
     * Set Zone instance information structure array
     * @param ZoneInstanceInfoSet Zone instance information structure array
     */
    public void setZoneInstanceInfoSet(ZoneInstanceInfo [] ZoneInstanceInfoSet) {
        this.ZoneInstanceInfoSet = ZoneInstanceInfoSet;
    }

    public ISPCounter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ISPCounter(ISPCounter source) {
        if (source.ProviderName != null) {
            this.ProviderName = new String(source.ProviderName);
        }
        if (source.ProviderNodeNum != null) {
            this.ProviderNodeNum = new Long(source.ProviderNodeNum);
        }
        if (source.ProvederInstanceNum != null) {
            this.ProvederInstanceNum = new Long(source.ProvederInstanceNum);
        }
        if (source.ZoneInstanceInfoSet != null) {
            this.ZoneInstanceInfoSet = new ZoneInstanceInfo[source.ZoneInstanceInfoSet.length];
            for (int i = 0; i < source.ZoneInstanceInfoSet.length; i++) {
                this.ZoneInstanceInfoSet[i] = new ZoneInstanceInfo(source.ZoneInstanceInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProviderName", this.ProviderName);
        this.setParamSimple(map, prefix + "ProviderNodeNum", this.ProviderNodeNum);
        this.setParamSimple(map, prefix + "ProvederInstanceNum", this.ProvederInstanceNum);
        this.setParamArrayObj(map, prefix + "ZoneInstanceInfoSet.", this.ZoneInstanceInfoSet);

    }
}

