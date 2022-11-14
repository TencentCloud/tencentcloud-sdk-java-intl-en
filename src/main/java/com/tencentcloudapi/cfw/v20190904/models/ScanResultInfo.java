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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanResultInfo extends AbstractModel{

    /**
    * Number of vulnerability exploits
    */
    @SerializedName("LeakNum")
    @Expose
    private Long LeakNum;

    /**
    * Number of protected IPs
    */
    @SerializedName("IPNum")
    @Expose
    private Long IPNum;

    /**
    * Number of exposed ports
    */
    @SerializedName("PortNum")
    @Expose
    private Long PortNum;

    /**
    * Protection status
    */
    @SerializedName("IPStatus")
    @Expose
    private Boolean IPStatus;

    /**
    * Attack blocking status
    */
    @SerializedName("IdpStatus")
    @Expose
    private Boolean IdpStatus;

    /**
    * Port blocking status
    */
    @SerializedName("BanStatus")
    @Expose
    private Boolean BanStatus;

    /**
     * Get Number of vulnerability exploits 
     * @return LeakNum Number of vulnerability exploits
     */
    public Long getLeakNum() {
        return this.LeakNum;
    }

    /**
     * Set Number of vulnerability exploits
     * @param LeakNum Number of vulnerability exploits
     */
    public void setLeakNum(Long LeakNum) {
        this.LeakNum = LeakNum;
    }

    /**
     * Get Number of protected IPs 
     * @return IPNum Number of protected IPs
     */
    public Long getIPNum() {
        return this.IPNum;
    }

    /**
     * Set Number of protected IPs
     * @param IPNum Number of protected IPs
     */
    public void setIPNum(Long IPNum) {
        this.IPNum = IPNum;
    }

    /**
     * Get Number of exposed ports 
     * @return PortNum Number of exposed ports
     */
    public Long getPortNum() {
        return this.PortNum;
    }

    /**
     * Set Number of exposed ports
     * @param PortNum Number of exposed ports
     */
    public void setPortNum(Long PortNum) {
        this.PortNum = PortNum;
    }

    /**
     * Get Protection status 
     * @return IPStatus Protection status
     */
    public Boolean getIPStatus() {
        return this.IPStatus;
    }

    /**
     * Set Protection status
     * @param IPStatus Protection status
     */
    public void setIPStatus(Boolean IPStatus) {
        this.IPStatus = IPStatus;
    }

    /**
     * Get Attack blocking status 
     * @return IdpStatus Attack blocking status
     */
    public Boolean getIdpStatus() {
        return this.IdpStatus;
    }

    /**
     * Set Attack blocking status
     * @param IdpStatus Attack blocking status
     */
    public void setIdpStatus(Boolean IdpStatus) {
        this.IdpStatus = IdpStatus;
    }

    /**
     * Get Port blocking status 
     * @return BanStatus Port blocking status
     */
    public Boolean getBanStatus() {
        return this.BanStatus;
    }

    /**
     * Set Port blocking status
     * @param BanStatus Port blocking status
     */
    public void setBanStatus(Boolean BanStatus) {
        this.BanStatus = BanStatus;
    }

    public ScanResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanResultInfo(ScanResultInfo source) {
        if (source.LeakNum != null) {
            this.LeakNum = new Long(source.LeakNum);
        }
        if (source.IPNum != null) {
            this.IPNum = new Long(source.IPNum);
        }
        if (source.PortNum != null) {
            this.PortNum = new Long(source.PortNum);
        }
        if (source.IPStatus != null) {
            this.IPStatus = new Boolean(source.IPStatus);
        }
        if (source.IdpStatus != null) {
            this.IdpStatus = new Boolean(source.IdpStatus);
        }
        if (source.BanStatus != null) {
            this.BanStatus = new Boolean(source.BanStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LeakNum", this.LeakNum);
        this.setParamSimple(map, prefix + "IPNum", this.IPNum);
        this.setParamSimple(map, prefix + "PortNum", this.PortNum);
        this.setParamSimple(map, prefix + "IPStatus", this.IPStatus);
        this.setParamSimple(map, prefix + "IdpStatus", this.IdpStatus);
        this.setParamSimple(map, prefix + "BanStatus", this.BanStatus);

    }
}

