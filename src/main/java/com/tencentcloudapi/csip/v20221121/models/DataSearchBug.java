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
    *  
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataBug")
    @Expose
    private BugInfoDetail [] DataBug;

    /**
    * None
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataAsset")
    @Expose
    private AssetInfoDetail [] DataAsset;

    /**
    * `true`: Support vulnerability scan; `false`: Do not support vulnerability scan
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("VSSScan")
    @Expose
    private Boolean VSSScan;

    /**
    * `0`: Do not support; `1`: Support
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("CWPScan")
    @Expose
    private String CWPScan;

    /**
    * `1`: Support virtual patches; `0` or null: Do not support
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("CFWPatch")
    @Expose
    private String CFWPatch;

    /**
    * `0`: Do not support; `1`: Support
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("WafPatch")
    @Expose
    private Long WafPatch;

    /**
    * `0`: Do not support; `1`: Support
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("CWPFix")
    @Expose
    private Long CWPFix;

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
     * Get  
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return DataBug  
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public BugInfoDetail [] getDataBug() {
        return this.DataBug;
    }

    /**
     * Set  
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param DataBug  
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setDataBug(BugInfoDetail [] DataBug) {
        this.DataBug = DataBug;
    }

    /**
     * Get None
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return DataAsset None
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public AssetInfoDetail [] getDataAsset() {
        return this.DataAsset;
    }

    /**
     * Set None
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param DataAsset None
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setDataAsset(AssetInfoDetail [] DataAsset) {
        this.DataAsset = DataAsset;
    }

    /**
     * Get `true`: Support vulnerability scan; `false`: Do not support vulnerability scan
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return VSSScan `true`: Support vulnerability scan; `false`: Do not support vulnerability scan
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Boolean getVSSScan() {
        return this.VSSScan;
    }

    /**
     * Set `true`: Support vulnerability scan; `false`: Do not support vulnerability scan
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param VSSScan `true`: Support vulnerability scan; `false`: Do not support vulnerability scan
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setVSSScan(Boolean VSSScan) {
        this.VSSScan = VSSScan;
    }

    /**
     * Get `0`: Do not support; `1`: Support
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return CWPScan `0`: Do not support; `1`: Support
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getCWPScan() {
        return this.CWPScan;
    }

    /**
     * Set `0`: Do not support; `1`: Support
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param CWPScan `0`: Do not support; `1`: Support
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setCWPScan(String CWPScan) {
        this.CWPScan = CWPScan;
    }

    /**
     * Get `1`: Support virtual patches; `0` or null: Do not support
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return CFWPatch `1`: Support virtual patches; `0` or null: Do not support
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getCFWPatch() {
        return this.CFWPatch;
    }

    /**
     * Set `1`: Support virtual patches; `0` or null: Do not support
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param CFWPatch `1`: Support virtual patches; `0` or null: Do not support
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setCFWPatch(String CFWPatch) {
        this.CFWPatch = CFWPatch;
    }

    /**
     * Get `0`: Do not support; `1`: Support
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return WafPatch `0`: Do not support; `1`: Support
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getWafPatch() {
        return this.WafPatch;
    }

    /**
     * Set `0`: Do not support; `1`: Support
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param WafPatch `0`: Do not support; `1`: Support
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setWafPatch(Long WafPatch) {
        this.WafPatch = WafPatch;
    }

    /**
     * Get `0`: Do not support; `1`: Support
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return CWPFix `0`: Do not support; `1`: Support
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getCWPFix() {
        return this.CWPFix;
    }

    /**
     * Set `0`: Do not support; `1`: Support
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param CWPFix `0`: Do not support; `1`: Support
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setCWPFix(Long CWPFix) {
        this.CWPFix = CWPFix;
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

    }
}

