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

public class CreateVulScanManualRequest extends AbstractModel {

    /**
    * <p>Timeout period (seconds)</p>
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>Asset scope (0-all assets, 1-Custom assets, 2-remove asset, 3-automatic asset match)</p>
    */
    @SerializedName("AssetRange")
    @Expose
    private Long AssetRange;

    /**
    * <p>Scanning method (VersionCompare: version comparison, POC: POC detection, VersionComparePOC: version comparison + POC detection)</p>
    */
    @SerializedName("Method")
    @Expose
    private String [] Method;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Vulnerability id</p>
    */
    @SerializedName("VulId")
    @Expose
    private Long [] VulId;

    /**
    * <p>kb No.</p>
    */
    @SerializedName("KbNo")
    @Expose
    private String [] KbNo;

    /**
    * <p>Vulnerability scan type</p><p>Enumeration value:</p><ul><li>LINUX: Linux software vulnerability</li><li>WINDOWS: Windows system patch</li><li>WEB_CMS: Web-CMS vulnerability</li><li>APPLICATION: Application vulnerability</li><li>EMERGENCY: Emergency vulnerability</li></ul>
    */
    @SerializedName("VulCategory")
    @Expose
    private String [] VulCategory;

    /**
    * <p>Vulnerability level (INVALID: Invalid, INFO: Notification, LOW: Low risk, MEDIUM: Medium risk, HIGH: High risk, CRITICAL: Critical)</p>
    */
    @SerializedName("Level")
    @Expose
    private String [] Level;

    /**
    * <p>Asset list (UUID list)</p>
    */
    @SerializedName("AssetList")
    @Expose
    private String [] AssetList;

    /**
    * <p>Tag id</p>
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
     * Get <p>Timeout period (seconds)</p> 
     * @return Timeout <p>Timeout period (seconds)</p>
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>Timeout period (seconds)</p>
     * @param Timeout <p>Timeout period (seconds)</p>
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>Asset scope (0-all assets, 1-Custom assets, 2-remove asset, 3-automatic asset match)</p> 
     * @return AssetRange <p>Asset scope (0-all assets, 1-Custom assets, 2-remove asset, 3-automatic asset match)</p>
     */
    public Long getAssetRange() {
        return this.AssetRange;
    }

    /**
     * Set <p>Asset scope (0-all assets, 1-Custom assets, 2-remove asset, 3-automatic asset match)</p>
     * @param AssetRange <p>Asset scope (0-all assets, 1-Custom assets, 2-remove asset, 3-automatic asset match)</p>
     */
    public void setAssetRange(Long AssetRange) {
        this.AssetRange = AssetRange;
    }

    /**
     * Get <p>Scanning method (VersionCompare: version comparison, POC: POC detection, VersionComparePOC: version comparison + POC detection)</p> 
     * @return Method <p>Scanning method (VersionCompare: version comparison, POC: POC detection, VersionComparePOC: version comparison + POC detection)</p>
     */
    public String [] getMethod() {
        return this.Method;
    }

    /**
     * Set <p>Scanning method (VersionCompare: version comparison, POC: POC detection, VersionComparePOC: version comparison + POC detection)</p>
     * @param Method <p>Scanning method (VersionCompare: version comparison, POC: POC detection, VersionComparePOC: version comparison + POC detection)</p>
     */
    public void setMethod(String [] Method) {
        this.Method = Method;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Vulnerability id</p> 
     * @return VulId <p>Vulnerability id</p>
     */
    public Long [] getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>Vulnerability id</p>
     * @param VulId <p>Vulnerability id</p>
     */
    public void setVulId(Long [] VulId) {
        this.VulId = VulId;
    }

    /**
     * Get <p>kb No.</p> 
     * @return KbNo <p>kb No.</p>
     */
    public String [] getKbNo() {
        return this.KbNo;
    }

    /**
     * Set <p>kb No.</p>
     * @param KbNo <p>kb No.</p>
     */
    public void setKbNo(String [] KbNo) {
        this.KbNo = KbNo;
    }

    /**
     * Get <p>Vulnerability scan type</p><p>Enumeration value:</p><ul><li>LINUX: Linux software vulnerability</li><li>WINDOWS: Windows system patch</li><li>WEB_CMS: Web-CMS vulnerability</li><li>APPLICATION: Application vulnerability</li><li>EMERGENCY: Emergency vulnerability</li></ul> 
     * @return VulCategory <p>Vulnerability scan type</p><p>Enumeration value:</p><ul><li>LINUX: Linux software vulnerability</li><li>WINDOWS: Windows system patch</li><li>WEB_CMS: Web-CMS vulnerability</li><li>APPLICATION: Application vulnerability</li><li>EMERGENCY: Emergency vulnerability</li></ul>
     */
    public String [] getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set <p>Vulnerability scan type</p><p>Enumeration value:</p><ul><li>LINUX: Linux software vulnerability</li><li>WINDOWS: Windows system patch</li><li>WEB_CMS: Web-CMS vulnerability</li><li>APPLICATION: Application vulnerability</li><li>EMERGENCY: Emergency vulnerability</li></ul>
     * @param VulCategory <p>Vulnerability scan type</p><p>Enumeration value:</p><ul><li>LINUX: Linux software vulnerability</li><li>WINDOWS: Windows system patch</li><li>WEB_CMS: Web-CMS vulnerability</li><li>APPLICATION: Application vulnerability</li><li>EMERGENCY: Emergency vulnerability</li></ul>
     */
    public void setVulCategory(String [] VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get <p>Vulnerability level (INVALID: Invalid, INFO: Notification, LOW: Low risk, MEDIUM: Medium risk, HIGH: High risk, CRITICAL: Critical)</p> 
     * @return Level <p>Vulnerability level (INVALID: Invalid, INFO: Notification, LOW: Low risk, MEDIUM: Medium risk, HIGH: High risk, CRITICAL: Critical)</p>
     */
    public String [] getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Vulnerability level (INVALID: Invalid, INFO: Notification, LOW: Low risk, MEDIUM: Medium risk, HIGH: High risk, CRITICAL: Critical)</p>
     * @param Level <p>Vulnerability level (INVALID: Invalid, INFO: Notification, LOW: Low risk, MEDIUM: Medium risk, HIGH: High risk, CRITICAL: Critical)</p>
     */
    public void setLevel(String [] Level) {
        this.Level = Level;
    }

    /**
     * Get <p>Asset list (UUID list)</p> 
     * @return AssetList <p>Asset list (UUID list)</p>
     */
    public String [] getAssetList() {
        return this.AssetList;
    }

    /**
     * Set <p>Asset list (UUID list)</p>
     * @param AssetList <p>Asset list (UUID list)</p>
     */
    public void setAssetList(String [] AssetList) {
        this.AssetList = AssetList;
    }

    /**
     * Get <p>Tag id</p> 
     * @return TagIds <p>Tag id</p>
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set <p>Tag id</p>
     * @param TagIds <p>Tag id</p>
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    public CreateVulScanManualRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVulScanManualRequest(CreateVulScanManualRequest source) {
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.AssetRange != null) {
            this.AssetRange = new Long(source.AssetRange);
        }
        if (source.Method != null) {
            this.Method = new String[source.Method.length];
            for (int i = 0; i < source.Method.length; i++) {
                this.Method[i] = new String(source.Method[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.VulId != null) {
            this.VulId = new Long[source.VulId.length];
            for (int i = 0; i < source.VulId.length; i++) {
                this.VulId[i] = new Long(source.VulId[i]);
            }
        }
        if (source.KbNo != null) {
            this.KbNo = new String[source.KbNo.length];
            for (int i = 0; i < source.KbNo.length; i++) {
                this.KbNo[i] = new String(source.KbNo[i]);
            }
        }
        if (source.VulCategory != null) {
            this.VulCategory = new String[source.VulCategory.length];
            for (int i = 0; i < source.VulCategory.length; i++) {
                this.VulCategory[i] = new String(source.VulCategory[i]);
            }
        }
        if (source.Level != null) {
            this.Level = new String[source.Level.length];
            for (int i = 0; i < source.Level.length; i++) {
                this.Level[i] = new String(source.Level[i]);
            }
        }
        if (source.AssetList != null) {
            this.AssetList = new String[source.AssetList.length];
            for (int i = 0; i < source.AssetList.length; i++) {
                this.AssetList[i] = new String(source.AssetList[i]);
            }
        }
        if (source.TagIds != null) {
            this.TagIds = new Long[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new Long(source.TagIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "AssetRange", this.AssetRange);
        this.setParamArraySimple(map, prefix + "Method.", this.Method);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "VulId.", this.VulId);
        this.setParamArraySimple(map, prefix + "KbNo.", this.KbNo);
        this.setParamArraySimple(map, prefix + "VulCategory.", this.VulCategory);
        this.setParamArraySimple(map, prefix + "Level.", this.Level);
        this.setParamArraySimple(map, prefix + "AssetList.", this.AssetList);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);

    }
}

