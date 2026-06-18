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

public class DataSearchBug extends AbstractModel {

    /**
    * Query status code
    */
    @SerializedName("StateCode")
    @Expose
    private String StateCode;

    /**
    * Vulnerability details
    */
    @SerializedName("DataBug")
    @Expose
    private BugInfoDetail [] DataBug;

    /**
    * Vulnerability impact assets details
    */
    @SerializedName("DataAsset")
    @Expose
    private AssetInfoDetail [] DataAsset;

    /**
    * True supports scanning. False does not support scanning.
    */
    @SerializedName("VSSScan")
    @Expose
    private Boolean VSSScan;

    /**
    * 0-Not Supported; 1-Supported
    */
    @SerializedName("CWPScan")
    @Expose
    private String CWPScan;

    /**
    * 1 indicates virtual patches supported, 0 or null indicates not supported.
    */
    @SerializedName("CFWPatch")
    @Expose
    private String CFWPatch;

    /**
    * 0-Not Supported; 1-Supported
    */
    @SerializedName("WafPatch")
    @Expose
    private Long WafPatch;

    /**
    * 0-Not Supported; 1-Supported
    */
    @SerializedName("CWPFix")
    @Expose
    private Long CWPFix;

    /**
    * Product Support Status
    */
    @SerializedName("DataSupport")
    @Expose
    private ProductSupport [] DataSupport;

    /**
    * cveId
    */
    @SerializedName("CveId")
    @Expose
    private String CveId;

    /**
     * Get Query status code 
     * @return StateCode Query status code
     */
    public String getStateCode() {
        return this.StateCode;
    }

    /**
     * Set Query status code
     * @param StateCode Query status code
     */
    public void setStateCode(String StateCode) {
        this.StateCode = StateCode;
    }

    /**
     * Get Vulnerability details 
     * @return DataBug Vulnerability details
     */
    public BugInfoDetail [] getDataBug() {
        return this.DataBug;
    }

    /**
     * Set Vulnerability details
     * @param DataBug Vulnerability details
     */
    public void setDataBug(BugInfoDetail [] DataBug) {
        this.DataBug = DataBug;
    }

    /**
     * Get Vulnerability impact assets details 
     * @return DataAsset Vulnerability impact assets details
     */
    public AssetInfoDetail [] getDataAsset() {
        return this.DataAsset;
    }

    /**
     * Set Vulnerability impact assets details
     * @param DataAsset Vulnerability impact assets details
     */
    public void setDataAsset(AssetInfoDetail [] DataAsset) {
        this.DataAsset = DataAsset;
    }

    /**
     * Get True supports scanning. False does not support scanning. 
     * @return VSSScan True supports scanning. False does not support scanning.
     */
    public Boolean getVSSScan() {
        return this.VSSScan;
    }

    /**
     * Set True supports scanning. False does not support scanning.
     * @param VSSScan True supports scanning. False does not support scanning.
     */
    public void setVSSScan(Boolean VSSScan) {
        this.VSSScan = VSSScan;
    }

    /**
     * Get 0-Not Supported; 1-Supported 
     * @return CWPScan 0-Not Supported; 1-Supported
     */
    public String getCWPScan() {
        return this.CWPScan;
    }

    /**
     * Set 0-Not Supported; 1-Supported
     * @param CWPScan 0-Not Supported; 1-Supported
     */
    public void setCWPScan(String CWPScan) {
        this.CWPScan = CWPScan;
    }

    /**
     * Get 1 indicates virtual patches supported, 0 or null indicates not supported. 
     * @return CFWPatch 1 indicates virtual patches supported, 0 or null indicates not supported.
     */
    public String getCFWPatch() {
        return this.CFWPatch;
    }

    /**
     * Set 1 indicates virtual patches supported, 0 or null indicates not supported.
     * @param CFWPatch 1 indicates virtual patches supported, 0 or null indicates not supported.
     */
    public void setCFWPatch(String CFWPatch) {
        this.CFWPatch = CFWPatch;
    }

    /**
     * Get 0-Not Supported; 1-Supported 
     * @return WafPatch 0-Not Supported; 1-Supported
     */
    public Long getWafPatch() {
        return this.WafPatch;
    }

    /**
     * Set 0-Not Supported; 1-Supported
     * @param WafPatch 0-Not Supported; 1-Supported
     */
    public void setWafPatch(Long WafPatch) {
        this.WafPatch = WafPatch;
    }

    /**
     * Get 0-Not Supported; 1-Supported 
     * @return CWPFix 0-Not Supported; 1-Supported
     */
    public Long getCWPFix() {
        return this.CWPFix;
    }

    /**
     * Set 0-Not Supported; 1-Supported
     * @param CWPFix 0-Not Supported; 1-Supported
     */
    public void setCWPFix(Long CWPFix) {
        this.CWPFix = CWPFix;
    }

    /**
     * Get Product Support Status 
     * @return DataSupport Product Support Status
     */
    public ProductSupport [] getDataSupport() {
        return this.DataSupport;
    }

    /**
     * Set Product Support Status
     * @param DataSupport Product Support Status
     */
    public void setDataSupport(ProductSupport [] DataSupport) {
        this.DataSupport = DataSupport;
    }

    /**
     * Get cveId 
     * @return CveId cveId
     */
    public String getCveId() {
        return this.CveId;
    }

    /**
     * Set cveId
     * @param CveId cveId
     */
    public void setCveId(String CveId) {
        this.CveId = CveId;
    }

    public DataSearchBug() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSearchBug(DataSearchBug source) {
        if (source.StateCode != null) {
            this.StateCode = new String(source.StateCode);
        }
        if (source.DataBug != null) {
            this.DataBug = new BugInfoDetail[source.DataBug.length];
            for (int i = 0; i < source.DataBug.length; i++) {
                this.DataBug[i] = new BugInfoDetail(source.DataBug[i]);
            }
        }
        if (source.DataAsset != null) {
            this.DataAsset = new AssetInfoDetail[source.DataAsset.length];
            for (int i = 0; i < source.DataAsset.length; i++) {
                this.DataAsset[i] = new AssetInfoDetail(source.DataAsset[i]);
            }
        }
        if (source.VSSScan != null) {
            this.VSSScan = new Boolean(source.VSSScan);
        }
        if (source.CWPScan != null) {
            this.CWPScan = new String(source.CWPScan);
        }
        if (source.CFWPatch != null) {
            this.CFWPatch = new String(source.CFWPatch);
        }
        if (source.WafPatch != null) {
            this.WafPatch = new Long(source.WafPatch);
        }
        if (source.CWPFix != null) {
            this.CWPFix = new Long(source.CWPFix);
        }
        if (source.DataSupport != null) {
            this.DataSupport = new ProductSupport[source.DataSupport.length];
            for (int i = 0; i < source.DataSupport.length; i++) {
                this.DataSupport[i] = new ProductSupport(source.DataSupport[i]);
            }
        }
        if (source.CveId != null) {
            this.CveId = new String(source.CveId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StateCode", this.StateCode);
        this.setParamArrayObj(map, prefix + "DataBug.", this.DataBug);
        this.setParamArrayObj(map, prefix + "DataAsset.", this.DataAsset);
        this.setParamSimple(map, prefix + "VSSScan", this.VSSScan);
        this.setParamSimple(map, prefix + "CWPScan", this.CWPScan);
        this.setParamSimple(map, prefix + "CFWPatch", this.CFWPatch);
        this.setParamSimple(map, prefix + "WafPatch", this.WafPatch);
        this.setParamSimple(map, prefix + "CWPFix", this.CWPFix);
        this.setParamArrayObj(map, prefix + "DataSupport.", this.DataSupport);
        this.setParamSimple(map, prefix + "CveId", this.CveId);

    }
}

