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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TLogInfo extends AbstractModel {

    /**
    * Compromised servers
    */
    @SerializedName("OutNum")
    @Expose
    private Long OutNum;

    /**
    * Unhandled alerts
    */
    @SerializedName("HandleNum")
    @Expose
    private Long HandleNum;

    /**
    * Vulnerability attacks
    */
    @SerializedName("VulNum")
    @Expose
    private Long VulNum;

    /**
    * Detected networks
    */
    @SerializedName("NetworkNum")
    @Expose
    private Long NetworkNum;

    /**
    * Blocklist
    */
    @SerializedName("BanNum")
    @Expose
    private Long BanNum;

    /**
    * Brute force attacks
    */
    @SerializedName("BruteForceNum")
    @Expose
    private Long BruteForceNum;

    /**
     * Get Compromised servers 
     * @return OutNum Compromised servers
     */
    public Long getOutNum() {
        return this.OutNum;
    }

    /**
     * Set Compromised servers
     * @param OutNum Compromised servers
     */
    public void setOutNum(Long OutNum) {
        this.OutNum = OutNum;
    }

    /**
     * Get Unhandled alerts 
     * @return HandleNum Unhandled alerts
     */
    public Long getHandleNum() {
        return this.HandleNum;
    }

    /**
     * Set Unhandled alerts
     * @param HandleNum Unhandled alerts
     */
    public void setHandleNum(Long HandleNum) {
        this.HandleNum = HandleNum;
    }

    /**
     * Get Vulnerability attacks 
     * @return VulNum Vulnerability attacks
     */
    public Long getVulNum() {
        return this.VulNum;
    }

    /**
     * Set Vulnerability attacks
     * @param VulNum Vulnerability attacks
     */
    public void setVulNum(Long VulNum) {
        this.VulNum = VulNum;
    }

    /**
     * Get Detected networks 
     * @return NetworkNum Detected networks
     */
    public Long getNetworkNum() {
        return this.NetworkNum;
    }

    /**
     * Set Detected networks
     * @param NetworkNum Detected networks
     */
    public void setNetworkNum(Long NetworkNum) {
        this.NetworkNum = NetworkNum;
    }

    /**
     * Get Blocklist 
     * @return BanNum Blocklist
     */
    public Long getBanNum() {
        return this.BanNum;
    }

    /**
     * Set Blocklist
     * @param BanNum Blocklist
     */
    public void setBanNum(Long BanNum) {
        this.BanNum = BanNum;
    }

    /**
     * Get Brute force attacks 
     * @return BruteForceNum Brute force attacks
     */
    public Long getBruteForceNum() {
        return this.BruteForceNum;
    }

    /**
     * Set Brute force attacks
     * @param BruteForceNum Brute force attacks
     */
    public void setBruteForceNum(Long BruteForceNum) {
        this.BruteForceNum = BruteForceNum;
    }

    public TLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TLogInfo(TLogInfo source) {
        if (source.OutNum != null) {
            this.OutNum = new Long(source.OutNum);
        }
        if (source.HandleNum != null) {
            this.HandleNum = new Long(source.HandleNum);
        }
        if (source.VulNum != null) {
            this.VulNum = new Long(source.VulNum);
        }
        if (source.NetworkNum != null) {
            this.NetworkNum = new Long(source.NetworkNum);
        }
        if (source.BanNum != null) {
            this.BanNum = new Long(source.BanNum);
        }
        if (source.BruteForceNum != null) {
            this.BruteForceNum = new Long(source.BruteForceNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutNum", this.OutNum);
        this.setParamSimple(map, prefix + "HandleNum", this.HandleNum);
        this.setParamSimple(map, prefix + "VulNum", this.VulNum);
        this.setParamSimple(map, prefix + "NetworkNum", this.NetworkNum);
        this.setParamSimple(map, prefix + "BanNum", this.BanNum);
        this.setParamSimple(map, prefix + "BruteForceNum", this.BruteForceNum);

    }
}

