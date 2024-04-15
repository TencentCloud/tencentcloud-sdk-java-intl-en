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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckFunctionRequest extends AbstractModel {

    /**
    * Processing statement entered by the user
    */
    @SerializedName("EtlContent")
    @Expose
    private String EtlContent;

    /**
    * Target topic ID and alias of the data processing task
    */
    @SerializedName("DstResources")
    @Expose
    private DataTransformResouceInfo [] DstResources;

    /**
    * Type of the target topic for data processing. Valid values: 1 (fixed Topic) and 2 (dynamic creation)
    */
    @SerializedName("FuncType")
    @Expose
    private Long FuncType;

    /**
     * Get Processing statement entered by the user 
     * @return EtlContent Processing statement entered by the user
     */
    public String getEtlContent() {
        return this.EtlContent;
    }

    /**
     * Set Processing statement entered by the user
     * @param EtlContent Processing statement entered by the user
     */
    public void setEtlContent(String EtlContent) {
        this.EtlContent = EtlContent;
    }

    /**
     * Get Target topic ID and alias of the data processing task 
     * @return DstResources Target topic ID and alias of the data processing task
     */
    public DataTransformResouceInfo [] getDstResources() {
        return this.DstResources;
    }

    /**
     * Set Target topic ID and alias of the data processing task
     * @param DstResources Target topic ID and alias of the data processing task
     */
    public void setDstResources(DataTransformResouceInfo [] DstResources) {
        this.DstResources = DstResources;
    }

    /**
     * Get Type of the target topic for data processing. Valid values: 1 (fixed Topic) and 2 (dynamic creation) 
     * @return FuncType Type of the target topic for data processing. Valid values: 1 (fixed Topic) and 2 (dynamic creation)
     */
    public Long getFuncType() {
        return this.FuncType;
    }

    /**
     * Set Type of the target topic for data processing. Valid values: 1 (fixed Topic) and 2 (dynamic creation)
     * @param FuncType Type of the target topic for data processing. Valid values: 1 (fixed Topic) and 2 (dynamic creation)
     */
    public void setFuncType(Long FuncType) {
        this.FuncType = FuncType;
    }

    public CheckFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckFunctionRequest(CheckFunctionRequest source) {
        if (source.EtlContent != null) {
            this.EtlContent = new String(source.EtlContent);
        }
        if (source.DstResources != null) {
            this.DstResources = new DataTransformResouceInfo[source.DstResources.length];
            for (int i = 0; i < source.DstResources.length; i++) {
                this.DstResources[i] = new DataTransformResouceInfo(source.DstResources[i]);
            }
        }
        if (source.FuncType != null) {
            this.FuncType = new Long(source.FuncType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EtlContent", this.EtlContent);
        this.setParamArrayObj(map, prefix + "DstResources.", this.DstResources);
        this.setParamSimple(map, prefix + "FuncType", this.FuncType);

    }
}

