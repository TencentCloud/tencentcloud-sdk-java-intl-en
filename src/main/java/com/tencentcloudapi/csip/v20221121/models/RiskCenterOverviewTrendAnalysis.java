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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskCenterOverviewTrendAnalysis extends AbstractModel {

    /**
    * Date
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Number of ports
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Number of vulnerabilities
    */
    @SerializedName("VUL")
    @Expose
    private Long VUL;

    /**
    * Weak Password Count
    */
    @SerializedName("WeakPassword")
    @Expose
    private Long WeakPassword;

    /**
    * Number of Websites
    */
    @SerializedName("Website")
    @Expose
    private Long Website;

    /**
    * Number of Configurations
    */
    @SerializedName("CFG")
    @Expose
    private Long CFG;

    /**
    * Mapping Risk Count
    */
    @SerializedName("Server")
    @Expose
    private Long Server;

    /**
    * Number of host risk configurations
    */
    @SerializedName("HostCFG")
    @Expose
    private Long HostCFG;

    /**
    * Number of risk configurations in the container baseline
    */
    @SerializedName("PodCFG")
    @Expose
    private Long PodCFG;

    /**
     * Get Date 
     * @return Date Date
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Date
     * @param Date Date
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Number of ports 
     * @return Port Number of ports
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Number of ports
     * @param Port Number of ports
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Number of vulnerabilities 
     * @return VUL Number of vulnerabilities
     */
    public Long getVUL() {
        return this.VUL;
    }

    /**
     * Set Number of vulnerabilities
     * @param VUL Number of vulnerabilities
     */
    public void setVUL(Long VUL) {
        this.VUL = VUL;
    }

    /**
     * Get Weak Password Count 
     * @return WeakPassword Weak Password Count
     */
    public Long getWeakPassword() {
        return this.WeakPassword;
    }

    /**
     * Set Weak Password Count
     * @param WeakPassword Weak Password Count
     */
    public void setWeakPassword(Long WeakPassword) {
        this.WeakPassword = WeakPassword;
    }

    /**
     * Get Number of Websites 
     * @return Website Number of Websites
     */
    public Long getWebsite() {
        return this.Website;
    }

    /**
     * Set Number of Websites
     * @param Website Number of Websites
     */
    public void setWebsite(Long Website) {
        this.Website = Website;
    }

    /**
     * Get Number of Configurations 
     * @return CFG Number of Configurations
     */
    public Long getCFG() {
        return this.CFG;
    }

    /**
     * Set Number of Configurations
     * @param CFG Number of Configurations
     */
    public void setCFG(Long CFG) {
        this.CFG = CFG;
    }

    /**
     * Get Mapping Risk Count 
     * @return Server Mapping Risk Count
     */
    public Long getServer() {
        return this.Server;
    }

    /**
     * Set Mapping Risk Count
     * @param Server Mapping Risk Count
     */
    public void setServer(Long Server) {
        this.Server = Server;
    }

    /**
     * Get Number of host risk configurations 
     * @return HostCFG Number of host risk configurations
     */
    public Long getHostCFG() {
        return this.HostCFG;
    }

    /**
     * Set Number of host risk configurations
     * @param HostCFG Number of host risk configurations
     */
    public void setHostCFG(Long HostCFG) {
        this.HostCFG = HostCFG;
    }

    /**
     * Get Number of risk configurations in the container baseline 
     * @return PodCFG Number of risk configurations in the container baseline
     */
    public Long getPodCFG() {
        return this.PodCFG;
    }

    /**
     * Set Number of risk configurations in the container baseline
     * @param PodCFG Number of risk configurations in the container baseline
     */
    public void setPodCFG(Long PodCFG) {
        this.PodCFG = PodCFG;
    }

    public RiskCenterOverviewTrendAnalysis() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskCenterOverviewTrendAnalysis(RiskCenterOverviewTrendAnalysis source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.VUL != null) {
            this.VUL = new Long(source.VUL);
        }
        if (source.WeakPassword != null) {
            this.WeakPassword = new Long(source.WeakPassword);
        }
        if (source.Website != null) {
            this.Website = new Long(source.Website);
        }
        if (source.CFG != null) {
            this.CFG = new Long(source.CFG);
        }
        if (source.Server != null) {
            this.Server = new Long(source.Server);
        }
        if (source.HostCFG != null) {
            this.HostCFG = new Long(source.HostCFG);
        }
        if (source.PodCFG != null) {
            this.PodCFG = new Long(source.PodCFG);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "VUL", this.VUL);
        this.setParamSimple(map, prefix + "WeakPassword", this.WeakPassword);
        this.setParamSimple(map, prefix + "Website", this.Website);
        this.setParamSimple(map, prefix + "CFG", this.CFG);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "HostCFG", this.HostCFG);
        this.setParamSimple(map, prefix + "PodCFG", this.PodCFG);

    }
}

