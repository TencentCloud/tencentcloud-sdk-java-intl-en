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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceUpgradeClusterStatus extends AbstractModel{

    /**
    * Total Pods
    */
    @SerializedName("PodTotal")
    @Expose
    private Long PodTotal;

    /**
    * Total number of NotReady Pods
    */
    @SerializedName("NotReadyPod")
    @Expose
    private Long NotReadyPod;

    /**
     * Get Total Pods 
     * @return PodTotal Total Pods
     */
    public Long getPodTotal() {
        return this.PodTotal;
    }

    /**
     * Set Total Pods
     * @param PodTotal Total Pods
     */
    public void setPodTotal(Long PodTotal) {
        this.PodTotal = PodTotal;
    }

    /**
     * Get Total number of NotReady Pods 
     * @return NotReadyPod Total number of NotReady Pods
     */
    public Long getNotReadyPod() {
        return this.NotReadyPod;
    }

    /**
     * Set Total number of NotReady Pods
     * @param NotReadyPod Total number of NotReady Pods
     */
    public void setNotReadyPod(Long NotReadyPod) {
        this.NotReadyPod = NotReadyPod;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PodTotal", this.PodTotal);
        this.setParamSimple(map, prefix + "NotReadyPod", this.NotReadyPod);

    }
}

