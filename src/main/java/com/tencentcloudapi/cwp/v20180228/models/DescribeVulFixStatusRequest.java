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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulFixStatusRequest extends AbstractModel {

    /**
    * Task ID. This parameter can be left blank if VulId is specified.
    */
    @SerializedName("FixId")
    @Expose
    private Long FixId;

    /**
    * Vulnerability ID. This parameter can be left blank if FixId is specified.
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Host QUUID. This parameter can be used together with VulId to query the details of the last fixing task on a specific host.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
     * Get Task ID. This parameter can be left blank if VulId is specified. 
     * @return FixId Task ID. This parameter can be left blank if VulId is specified.
     */
    public Long getFixId() {
        return this.FixId;
    }

    /**
     * Set Task ID. This parameter can be left blank if VulId is specified.
     * @param FixId Task ID. This parameter can be left blank if VulId is specified.
     */
    public void setFixId(Long FixId) {
        this.FixId = FixId;
    }

    /**
     * Get Vulnerability ID. This parameter can be left blank if FixId is specified. 
     * @return VulId Vulnerability ID. This parameter can be left blank if FixId is specified.
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID. This parameter can be left blank if FixId is specified.
     * @param VulId Vulnerability ID. This parameter can be left blank if FixId is specified.
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Host QUUID. This parameter can be used together with VulId to query the details of the last fixing task on a specific host. 
     * @return Quuid Host QUUID. This parameter can be used together with VulId to query the details of the last fixing task on a specific host.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID. This parameter can be used together with VulId to query the details of the last fixing task on a specific host.
     * @param Quuid Host QUUID. This parameter can be used together with VulId to query the details of the last fixing task on a specific host.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    public DescribeVulFixStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulFixStatusRequest(DescribeVulFixStatusRequest source) {
        if (source.FixId != null) {
            this.FixId = new Long(source.FixId);
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FixId", this.FixId);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

