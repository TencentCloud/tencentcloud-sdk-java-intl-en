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

public class CsipRiskCenterStatistics extends AbstractModel {

    /**
    * Total Number of Port Risks
    */
    @SerializedName("PortTotal")
    @Expose
    private Long PortTotal;

    /**
    * High Port Risk Count
    */
    @SerializedName("PortHighLevel")
    @Expose
    private Long PortHighLevel;

    /**
    * 	Total number of weak password risks.
    */
    @SerializedName("WeakPasswordTotal")
    @Expose
    private Long WeakPasswordTotal;

    /**
    * High Weak Password Risk Count
    */
    @SerializedName("WeakPasswordHighLevel")
    @Expose
    private Long WeakPasswordHighLevel;

    /**
    * Website Risk Count
    */
    @SerializedName("WebsiteTotal")
    @Expose
    private Long WebsiteTotal;

    /**
    * Number of High Risks on Websites
    */
    @SerializedName("WebsiteHighLevel")
    @Expose
    private Long WebsiteHighLevel;

    /**
    * Time of the Latest Scan
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * Number of vulnerability risks.
    */
    @SerializedName("VULTotal")
    @Expose
    private Long VULTotal;

    /**
    * Number of High-Risk Vulnerability Risks
    */
    @SerializedName("VULHighLevel")
    @Expose
    private Long VULHighLevel;

    /**
    * Number of Configuration Item Risks
    */
    @SerializedName("CFGTotal")
    @Expose
    private Long CFGTotal;

    /**
    * Number of High-Risk Configuration Item Risks
    */
    @SerializedName("CFGHighLevel")
    @Expose
    private Long CFGHighLevel;

    /**
    * Mapping Service Risk Count
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServerTotal")
    @Expose
    private Long ServerTotal;

    /**
    * High Mapping Service Risk Count
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServerHighLevel")
    @Expose
    private Long ServerHighLevel;

    /**
    * Number of host baseline risks.
    */
    @SerializedName("HostBaseLineRiskTotal")
    @Expose
    private Long HostBaseLineRiskTotal;

    /**
    * Number of high-risk risks.
    */
    @SerializedName("HostBaseLineRiskHighLevel")
    @Expose
    private Long HostBaseLineRiskHighLevel;

    /**
    * Baseline risk count of the container.
    */
    @SerializedName("PodBaseLineRiskTotal")
    @Expose
    private Long PodBaseLineRiskTotal;

    /**
    * Number of high-risk baseline risks in the container.
    */
    @SerializedName("PodBaseLineRiskHighLevel")
    @Expose
    private Long PodBaseLineRiskHighLevel;

    /**
     * Get Total Number of Port Risks 
     * @return PortTotal Total Number of Port Risks
     */
    public Long getPortTotal() {
        return this.PortTotal;
    }

    /**
     * Set Total Number of Port Risks
     * @param PortTotal Total Number of Port Risks
     */
    public void setPortTotal(Long PortTotal) {
        this.PortTotal = PortTotal;
    }

    /**
     * Get High Port Risk Count 
     * @return PortHighLevel High Port Risk Count
     */
    public Long getPortHighLevel() {
        return this.PortHighLevel;
    }

    /**
     * Set High Port Risk Count
     * @param PortHighLevel High Port Risk Count
     */
    public void setPortHighLevel(Long PortHighLevel) {
        this.PortHighLevel = PortHighLevel;
    }

    /**
     * Get 	Total number of weak password risks. 
     * @return WeakPasswordTotal 	Total number of weak password risks.
     */
    public Long getWeakPasswordTotal() {
        return this.WeakPasswordTotal;
    }

    /**
     * Set 	Total number of weak password risks.
     * @param WeakPasswordTotal 	Total number of weak password risks.
     */
    public void setWeakPasswordTotal(Long WeakPasswordTotal) {
        this.WeakPasswordTotal = WeakPasswordTotal;
    }

    /**
     * Get High Weak Password Risk Count 
     * @return WeakPasswordHighLevel High Weak Password Risk Count
     */
    public Long getWeakPasswordHighLevel() {
        return this.WeakPasswordHighLevel;
    }

    /**
     * Set High Weak Password Risk Count
     * @param WeakPasswordHighLevel High Weak Password Risk Count
     */
    public void setWeakPasswordHighLevel(Long WeakPasswordHighLevel) {
        this.WeakPasswordHighLevel = WeakPasswordHighLevel;
    }

    /**
     * Get Website Risk Count 
     * @return WebsiteTotal Website Risk Count
     */
    public Long getWebsiteTotal() {
        return this.WebsiteTotal;
    }

    /**
     * Set Website Risk Count
     * @param WebsiteTotal Website Risk Count
     */
    public void setWebsiteTotal(Long WebsiteTotal) {
        this.WebsiteTotal = WebsiteTotal;
    }

    /**
     * Get Number of High Risks on Websites 
     * @return WebsiteHighLevel Number of High Risks on Websites
     */
    public Long getWebsiteHighLevel() {
        return this.WebsiteHighLevel;
    }

    /**
     * Set Number of High Risks on Websites
     * @param WebsiteHighLevel Number of High Risks on Websites
     */
    public void setWebsiteHighLevel(Long WebsiteHighLevel) {
        this.WebsiteHighLevel = WebsiteHighLevel;
    }

    /**
     * Get Time of the Latest Scan 
     * @return LastScanTime Time of the Latest Scan
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set Time of the Latest Scan
     * @param LastScanTime Time of the Latest Scan
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get Number of vulnerability risks. 
     * @return VULTotal Number of vulnerability risks.
     */
    public Long getVULTotal() {
        return this.VULTotal;
    }

    /**
     * Set Number of vulnerability risks.
     * @param VULTotal Number of vulnerability risks.
     */
    public void setVULTotal(Long VULTotal) {
        this.VULTotal = VULTotal;
    }

    /**
     * Get Number of High-Risk Vulnerability Risks 
     * @return VULHighLevel Number of High-Risk Vulnerability Risks
     */
    public Long getVULHighLevel() {
        return this.VULHighLevel;
    }

    /**
     * Set Number of High-Risk Vulnerability Risks
     * @param VULHighLevel Number of High-Risk Vulnerability Risks
     */
    public void setVULHighLevel(Long VULHighLevel) {
        this.VULHighLevel = VULHighLevel;
    }

    /**
     * Get Number of Configuration Item Risks 
     * @return CFGTotal Number of Configuration Item Risks
     */
    public Long getCFGTotal() {
        return this.CFGTotal;
    }

    /**
     * Set Number of Configuration Item Risks
     * @param CFGTotal Number of Configuration Item Risks
     */
    public void setCFGTotal(Long CFGTotal) {
        this.CFGTotal = CFGTotal;
    }

    /**
     * Get Number of High-Risk Configuration Item Risks 
     * @return CFGHighLevel Number of High-Risk Configuration Item Risks
     */
    public Long getCFGHighLevel() {
        return this.CFGHighLevel;
    }

    /**
     * Set Number of High-Risk Configuration Item Risks
     * @param CFGHighLevel Number of High-Risk Configuration Item Risks
     */
    public void setCFGHighLevel(Long CFGHighLevel) {
        this.CFGHighLevel = CFGHighLevel;
    }

    /**
     * Get Mapping Service Risk Count
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServerTotal Mapping Service Risk Count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getServerTotal() {
        return this.ServerTotal;
    }

    /**
     * Set Mapping Service Risk Count
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServerTotal Mapping Service Risk Count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServerTotal(Long ServerTotal) {
        this.ServerTotal = ServerTotal;
    }

    /**
     * Get High Mapping Service Risk Count
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServerHighLevel High Mapping Service Risk Count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getServerHighLevel() {
        return this.ServerHighLevel;
    }

    /**
     * Set High Mapping Service Risk Count
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServerHighLevel High Mapping Service Risk Count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServerHighLevel(Long ServerHighLevel) {
        this.ServerHighLevel = ServerHighLevel;
    }

    /**
     * Get Number of host baseline risks. 
     * @return HostBaseLineRiskTotal Number of host baseline risks.
     */
    public Long getHostBaseLineRiskTotal() {
        return this.HostBaseLineRiskTotal;
    }

    /**
     * Set Number of host baseline risks.
     * @param HostBaseLineRiskTotal Number of host baseline risks.
     */
    public void setHostBaseLineRiskTotal(Long HostBaseLineRiskTotal) {
        this.HostBaseLineRiskTotal = HostBaseLineRiskTotal;
    }

    /**
     * Get Number of high-risk risks. 
     * @return HostBaseLineRiskHighLevel Number of high-risk risks.
     */
    public Long getHostBaseLineRiskHighLevel() {
        return this.HostBaseLineRiskHighLevel;
    }

    /**
     * Set Number of high-risk risks.
     * @param HostBaseLineRiskHighLevel Number of high-risk risks.
     */
    public void setHostBaseLineRiskHighLevel(Long HostBaseLineRiskHighLevel) {
        this.HostBaseLineRiskHighLevel = HostBaseLineRiskHighLevel;
    }

    /**
     * Get Baseline risk count of the container. 
     * @return PodBaseLineRiskTotal Baseline risk count of the container.
     */
    public Long getPodBaseLineRiskTotal() {
        return this.PodBaseLineRiskTotal;
    }

    /**
     * Set Baseline risk count of the container.
     * @param PodBaseLineRiskTotal Baseline risk count of the container.
     */
    public void setPodBaseLineRiskTotal(Long PodBaseLineRiskTotal) {
        this.PodBaseLineRiskTotal = PodBaseLineRiskTotal;
    }

    /**
     * Get Number of high-risk baseline risks in the container. 
     * @return PodBaseLineRiskHighLevel Number of high-risk baseline risks in the container.
     */
    public Long getPodBaseLineRiskHighLevel() {
        return this.PodBaseLineRiskHighLevel;
    }

    /**
     * Set Number of high-risk baseline risks in the container.
     * @param PodBaseLineRiskHighLevel Number of high-risk baseline risks in the container.
     */
    public void setPodBaseLineRiskHighLevel(Long PodBaseLineRiskHighLevel) {
        this.PodBaseLineRiskHighLevel = PodBaseLineRiskHighLevel;
    }

    public CsipRiskCenterStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CsipRiskCenterStatistics(CsipRiskCenterStatistics source) {
        if (source.PortTotal != null) {
            this.PortTotal = new Long(source.PortTotal);
        }
        if (source.PortHighLevel != null) {
            this.PortHighLevel = new Long(source.PortHighLevel);
        }
        if (source.WeakPasswordTotal != null) {
            this.WeakPasswordTotal = new Long(source.WeakPasswordTotal);
        }
        if (source.WeakPasswordHighLevel != null) {
            this.WeakPasswordHighLevel = new Long(source.WeakPasswordHighLevel);
        }
        if (source.WebsiteTotal != null) {
            this.WebsiteTotal = new Long(source.WebsiteTotal);
        }
        if (source.WebsiteHighLevel != null) {
            this.WebsiteHighLevel = new Long(source.WebsiteHighLevel);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.VULTotal != null) {
            this.VULTotal = new Long(source.VULTotal);
        }
        if (source.VULHighLevel != null) {
            this.VULHighLevel = new Long(source.VULHighLevel);
        }
        if (source.CFGTotal != null) {
            this.CFGTotal = new Long(source.CFGTotal);
        }
        if (source.CFGHighLevel != null) {
            this.CFGHighLevel = new Long(source.CFGHighLevel);
        }
        if (source.ServerTotal != null) {
            this.ServerTotal = new Long(source.ServerTotal);
        }
        if (source.ServerHighLevel != null) {
            this.ServerHighLevel = new Long(source.ServerHighLevel);
        }
        if (source.HostBaseLineRiskTotal != null) {
            this.HostBaseLineRiskTotal = new Long(source.HostBaseLineRiskTotal);
        }
        if (source.HostBaseLineRiskHighLevel != null) {
            this.HostBaseLineRiskHighLevel = new Long(source.HostBaseLineRiskHighLevel);
        }
        if (source.PodBaseLineRiskTotal != null) {
            this.PodBaseLineRiskTotal = new Long(source.PodBaseLineRiskTotal);
        }
        if (source.PodBaseLineRiskHighLevel != null) {
            this.PodBaseLineRiskHighLevel = new Long(source.PodBaseLineRiskHighLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PortTotal", this.PortTotal);
        this.setParamSimple(map, prefix + "PortHighLevel", this.PortHighLevel);
        this.setParamSimple(map, prefix + "WeakPasswordTotal", this.WeakPasswordTotal);
        this.setParamSimple(map, prefix + "WeakPasswordHighLevel", this.WeakPasswordHighLevel);
        this.setParamSimple(map, prefix + "WebsiteTotal", this.WebsiteTotal);
        this.setParamSimple(map, prefix + "WebsiteHighLevel", this.WebsiteHighLevel);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "VULTotal", this.VULTotal);
        this.setParamSimple(map, prefix + "VULHighLevel", this.VULHighLevel);
        this.setParamSimple(map, prefix + "CFGTotal", this.CFGTotal);
        this.setParamSimple(map, prefix + "CFGHighLevel", this.CFGHighLevel);
        this.setParamSimple(map, prefix + "ServerTotal", this.ServerTotal);
        this.setParamSimple(map, prefix + "ServerHighLevel", this.ServerHighLevel);
        this.setParamSimple(map, prefix + "HostBaseLineRiskTotal", this.HostBaseLineRiskTotal);
        this.setParamSimple(map, prefix + "HostBaseLineRiskHighLevel", this.HostBaseLineRiskHighLevel);
        this.setParamSimple(map, prefix + "PodBaseLineRiskTotal", this.PodBaseLineRiskTotal);
        this.setParamSimple(map, prefix + "PodBaseLineRiskHighLevel", this.PodBaseLineRiskHighLevel);

    }
}

