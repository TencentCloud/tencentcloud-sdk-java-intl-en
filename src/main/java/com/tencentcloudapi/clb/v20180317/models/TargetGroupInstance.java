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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupInstance extends AbstractModel{

    /**
    * Private IP of target group instance
    */
    @SerializedName("BindIP")
    @Expose
    private String BindIP;

    /**
    * Port of target group instance
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Weight of target group instance
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * New port of target group instance
    */
    @SerializedName("NewPort")
    @Expose
    private Long NewPort;

    /**
     * Get Private IP of target group instance 
     * @return BindIP Private IP of target group instance
     */
    public String getBindIP() {
        return this.BindIP;
    }

    /**
     * Set Private IP of target group instance
     * @param BindIP Private IP of target group instance
     */
    public void setBindIP(String BindIP) {
        this.BindIP = BindIP;
    }

    /**
     * Get Port of target group instance 
     * @return Port Port of target group instance
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port of target group instance
     * @param Port Port of target group instance
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Weight of target group instance 
     * @return Weight Weight of target group instance
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight of target group instance
     * @param Weight Weight of target group instance
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get New port of target group instance 
     * @return NewPort New port of target group instance
     */
    public Long getNewPort() {
        return this.NewPort;
    }

    /**
     * Set New port of target group instance
     * @param NewPort New port of target group instance
     */
    public void setNewPort(Long NewPort) {
        this.NewPort = NewPort;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BindIP", this.BindIP);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "NewPort", this.NewPort);

    }
}

