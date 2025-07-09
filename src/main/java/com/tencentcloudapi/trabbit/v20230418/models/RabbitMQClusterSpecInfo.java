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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQClusterSpecInfo extends AbstractModel {

    /**
    * Specifies the cluster specification name.
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Max tps.
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * Maximum number of queues.
    */
    @SerializedName("MaxQueueNum")
    @Expose
    private Long MaxQueueNum;

    /**
    * Maximum number of exchanges.
    */
    @SerializedName("MaxExchangeNum")
    @Expose
    private Long MaxExchangeNum;

    /**
    * Maximum number of vhosts.
    */
    @SerializedName("MaxVhostNum")
    @Expose
    private Long MaxVhostNum;

    /**
    * Maximum number of connections.
    */
    @SerializedName("MaxConnNum")
    @Expose
    private Long MaxConnNum;

    /**
    * Maximum number of users.
    */
    @SerializedName("MaxUserNum")
    @Expose
    private Long MaxUserNum;

    /**
    * Peak bandwidth. abandoned.
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * Public network bandwidth. abandoned.
    */
    @SerializedName("PublicNetworkTps")
    @Expose
    private Long PublicNetworkTps;

    /**
     * Get Specifies the cluster specification name. 
     * @return SpecName Specifies the cluster specification name.
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Specifies the cluster specification name.
     * @param SpecName Specifies the cluster specification name.
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Max tps. 
     * @return MaxTps Max tps.
     */
    public Long getMaxTps() {
        return this.MaxTps;
    }

    /**
     * Set Max tps.
     * @param MaxTps Max tps.
     */
    public void setMaxTps(Long MaxTps) {
        this.MaxTps = MaxTps;
    }

    /**
     * Get Maximum number of queues. 
     * @return MaxQueueNum Maximum number of queues.
     */
    public Long getMaxQueueNum() {
        return this.MaxQueueNum;
    }

    /**
     * Set Maximum number of queues.
     * @param MaxQueueNum Maximum number of queues.
     */
    public void setMaxQueueNum(Long MaxQueueNum) {
        this.MaxQueueNum = MaxQueueNum;
    }

    /**
     * Get Maximum number of exchanges. 
     * @return MaxExchangeNum Maximum number of exchanges.
     */
    public Long getMaxExchangeNum() {
        return this.MaxExchangeNum;
    }

    /**
     * Set Maximum number of exchanges.
     * @param MaxExchangeNum Maximum number of exchanges.
     */
    public void setMaxExchangeNum(Long MaxExchangeNum) {
        this.MaxExchangeNum = MaxExchangeNum;
    }

    /**
     * Get Maximum number of vhosts. 
     * @return MaxVhostNum Maximum number of vhosts.
     */
    public Long getMaxVhostNum() {
        return this.MaxVhostNum;
    }

    /**
     * Set Maximum number of vhosts.
     * @param MaxVhostNum Maximum number of vhosts.
     */
    public void setMaxVhostNum(Long MaxVhostNum) {
        this.MaxVhostNum = MaxVhostNum;
    }

    /**
     * Get Maximum number of connections. 
     * @return MaxConnNum Maximum number of connections.
     */
    public Long getMaxConnNum() {
        return this.MaxConnNum;
    }

    /**
     * Set Maximum number of connections.
     * @param MaxConnNum Maximum number of connections.
     */
    public void setMaxConnNum(Long MaxConnNum) {
        this.MaxConnNum = MaxConnNum;
    }

    /**
     * Get Maximum number of users. 
     * @return MaxUserNum Maximum number of users.
     */
    public Long getMaxUserNum() {
        return this.MaxUserNum;
    }

    /**
     * Set Maximum number of users.
     * @param MaxUserNum Maximum number of users.
     */
    public void setMaxUserNum(Long MaxUserNum) {
        this.MaxUserNum = MaxUserNum;
    }

    /**
     * Get Peak bandwidth. abandoned. 
     * @return MaxBandWidth Peak bandwidth. abandoned.
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set Peak bandwidth. abandoned.
     * @param MaxBandWidth Peak bandwidth. abandoned.
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get Public network bandwidth. abandoned. 
     * @return PublicNetworkTps Public network bandwidth. abandoned.
     */
    public Long getPublicNetworkTps() {
        return this.PublicNetworkTps;
    }

    /**
     * Set Public network bandwidth. abandoned.
     * @param PublicNetworkTps Public network bandwidth. abandoned.
     */
    public void setPublicNetworkTps(Long PublicNetworkTps) {
        this.PublicNetworkTps = PublicNetworkTps;
    }

    public RabbitMQClusterSpecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQClusterSpecInfo(RabbitMQClusterSpecInfo source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.MaxTps != null) {
            this.MaxTps = new Long(source.MaxTps);
        }
        if (source.MaxQueueNum != null) {
            this.MaxQueueNum = new Long(source.MaxQueueNum);
        }
        if (source.MaxExchangeNum != null) {
            this.MaxExchangeNum = new Long(source.MaxExchangeNum);
        }
        if (source.MaxVhostNum != null) {
            this.MaxVhostNum = new Long(source.MaxVhostNum);
        }
        if (source.MaxConnNum != null) {
            this.MaxConnNum = new Long(source.MaxConnNum);
        }
        if (source.MaxUserNum != null) {
            this.MaxUserNum = new Long(source.MaxUserNum);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.PublicNetworkTps != null) {
            this.PublicNetworkTps = new Long(source.PublicNetworkTps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "MaxTps", this.MaxTps);
        this.setParamSimple(map, prefix + "MaxQueueNum", this.MaxQueueNum);
        this.setParamSimple(map, prefix + "MaxExchangeNum", this.MaxExchangeNum);
        this.setParamSimple(map, prefix + "MaxVhostNum", this.MaxVhostNum);
        this.setParamSimple(map, prefix + "MaxConnNum", this.MaxConnNum);
        this.setParamSimple(map, prefix + "MaxUserNum", this.MaxUserNum);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "PublicNetworkTps", this.PublicNetworkTps);

    }
}

