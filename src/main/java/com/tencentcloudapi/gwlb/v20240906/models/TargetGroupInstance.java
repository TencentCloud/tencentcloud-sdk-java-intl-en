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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupInstance extends AbstractModel {

    /**
    * Private network IP of target group instance.
    */
    @SerializedName("BindIP")
    @Expose
    private String BindIP;

    /**
    * Port of target group instance. Only 6081 is supported.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Weight of target group instance. Only 0 or 16 is supported, and non-0 is uniformly treated as 16.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get Private network IP of target group instance. 
     * @return BindIP Private network IP of target group instance.
     */
    public String getBindIP() {
        return this.BindIP;
    }

    /**
     * Set Private network IP of target group instance.
     * @param BindIP Private network IP of target group instance.
     */
    public void setBindIP(String BindIP) {
        this.BindIP = BindIP;
    }

    /**
     * Get Port of target group instance. Only 6081 is supported. 
     * @return Port Port of target group instance. Only 6081 is supported.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port of target group instance. Only 6081 is supported.
     * @param Port Port of target group instance. Only 6081 is supported.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Weight of target group instance. Only 0 or 16 is supported, and non-0 is uniformly treated as 16. 
     * @return Weight Weight of target group instance. Only 0 or 16 is supported, and non-0 is uniformly treated as 16.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight of target group instance. Only 0 or 16 is supported, and non-0 is uniformly treated as 16.
     * @param Weight Weight of target group instance. Only 0 or 16 is supported, and non-0 is uniformly treated as 16.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public TargetGroupInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupInstance(TargetGroupInstance source) {
        if (source.BindIP != null) {
            this.BindIP = new String(source.BindIP);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BindIP", this.BindIP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

