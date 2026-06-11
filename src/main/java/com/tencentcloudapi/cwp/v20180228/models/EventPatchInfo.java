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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventPatchInfo extends AbstractModel {

    /**
    * Patch name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Patch Number
    */
    @SerializedName("KbNo")
    @Expose
    private String KbNo;

    /**
    * Disclosure time
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * Number of affected hosts.
    */
    @SerializedName("EffectHostCount")
    @Expose
    private Long EffectHostCount;

    /**
    * Number of associated vulnerabilities
    */
    @SerializedName("RelateVulCount")
    @Expose
    private Long RelateVulCount;

    /**
    * Associated vulnerability ID array
    */
    @SerializedName("RelateVulList")
    @Expose
    private String [] RelateVulList;

    /**
    * Whether it is the latest disclosure [0: no | 1: yes], no by default
    */
    @SerializedName("IsNew")
    @Expose
    private Long IsNew;

    /**
    * Last scan time
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 0 pending, 1 ignored, 3 fixed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Prerequisite for installing the kb is generally other KBs, and there may be multiple, with KBs separated by ", "
    */
    @SerializedName("KbPreCondition")
    @Expose
    private String KbPreCondition;

    /**
    * Name of the windows product associated with the kb
    */
    @SerializedName("RelatedProduct")
    @Expose
    private String RelatedProduct;

    /**
    * Patch ID
    */
    @SerializedName("KbId")
    @Expose
    private Long KbId;

    /**
    * Related kb event id collection
    */
    @SerializedName("Ids")
    @Expose
    private String Ids;

    /**
     * Get Patch name 
     * @return Name Patch name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Patch name
     * @param Name Patch name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Patch Number 
     * @return KbNo Patch Number
     */
    public String getKbNo() {
        return this.KbNo;
    }

    /**
     * Set Patch Number
     * @param KbNo Patch Number
     */
    public void setKbNo(String KbNo) {
        this.KbNo = KbNo;
    }

    /**
     * Get Disclosure time 
     * @return PublishTime Disclosure time
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set Disclosure time
     * @param PublishTime Disclosure time
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get Number of affected hosts. 
     * @return EffectHostCount Number of affected hosts.
     */
    public Long getEffectHostCount() {
        return this.EffectHostCount;
    }

    /**
     * Set Number of affected hosts.
     * @param EffectHostCount Number of affected hosts.
     */
    public void setEffectHostCount(Long EffectHostCount) {
        this.EffectHostCount = EffectHostCount;
    }

    /**
     * Get Number of associated vulnerabilities 
     * @return RelateVulCount Number of associated vulnerabilities
     */
    public Long getRelateVulCount() {
        return this.RelateVulCount;
    }

    /**
     * Set Number of associated vulnerabilities
     * @param RelateVulCount Number of associated vulnerabilities
     */
    public void setRelateVulCount(Long RelateVulCount) {
        this.RelateVulCount = RelateVulCount;
    }

    /**
     * Get Associated vulnerability ID array 
     * @return RelateVulList Associated vulnerability ID array
     */
    public String [] getRelateVulList() {
        return this.RelateVulList;
    }

    /**
     * Set Associated vulnerability ID array
     * @param RelateVulList Associated vulnerability ID array
     */
    public void setRelateVulList(String [] RelateVulList) {
        this.RelateVulList = RelateVulList;
    }

    /**
     * Get Whether it is the latest disclosure [0: no | 1: yes], no by default 
     * @return IsNew Whether it is the latest disclosure [0: no | 1: yes], no by default
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set Whether it is the latest disclosure [0: no | 1: yes], no by default
     * @param IsNew Whether it is the latest disclosure [0: no | 1: yes], no by default
     */
    public void setIsNew(Long IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * Get Last scan time 
     * @return LastScanTime Last scan time
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set Last scan time
     * @param LastScanTime Last scan time
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get 0 pending, 1 ignored, 3 fixed 
     * @return Status 0 pending, 1 ignored, 3 fixed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0 pending, 1 ignored, 3 fixed
     * @param Status 0 pending, 1 ignored, 3 fixed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Prerequisite for installing the kb is generally other KBs, and there may be multiple, with KBs separated by ", " 
     * @return KbPreCondition Prerequisite for installing the kb is generally other KBs, and there may be multiple, with KBs separated by ", "
     */
    public String getKbPreCondition() {
        return this.KbPreCondition;
    }

    /**
     * Set Prerequisite for installing the kb is generally other KBs, and there may be multiple, with KBs separated by ", "
     * @param KbPreCondition Prerequisite for installing the kb is generally other KBs, and there may be multiple, with KBs separated by ", "
     */
    public void setKbPreCondition(String KbPreCondition) {
        this.KbPreCondition = KbPreCondition;
    }

    /**
     * Get Name of the windows product associated with the kb 
     * @return RelatedProduct Name of the windows product associated with the kb
     */
    public String getRelatedProduct() {
        return this.RelatedProduct;
    }

    /**
     * Set Name of the windows product associated with the kb
     * @param RelatedProduct Name of the windows product associated with the kb
     */
    public void setRelatedProduct(String RelatedProduct) {
        this.RelatedProduct = RelatedProduct;
    }

    /**
     * Get Patch ID 
     * @return KbId Patch ID
     */
    public Long getKbId() {
        return this.KbId;
    }

    /**
     * Set Patch ID
     * @param KbId Patch ID
     */
    public void setKbId(Long KbId) {
        this.KbId = KbId;
    }

    /**
     * Get Related kb event id collection 
     * @return Ids Related kb event id collection
     */
    public String getIds() {
        return this.Ids;
    }

    /**
     * Set Related kb event id collection
     * @param Ids Related kb event id collection
     */
    public void setIds(String Ids) {
        this.Ids = Ids;
    }

    public EventPatchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventPatchInfo(EventPatchInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.KbNo != null) {
            this.KbNo = new String(source.KbNo);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.EffectHostCount != null) {
            this.EffectHostCount = new Long(source.EffectHostCount);
        }
        if (source.RelateVulCount != null) {
            this.RelateVulCount = new Long(source.RelateVulCount);
        }
        if (source.RelateVulList != null) {
            this.RelateVulList = new String[source.RelateVulList.length];
            for (int i = 0; i < source.RelateVulList.length; i++) {
                this.RelateVulList[i] = new String(source.RelateVulList[i]);
            }
        }
        if (source.IsNew != null) {
            this.IsNew = new Long(source.IsNew);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.KbPreCondition != null) {
            this.KbPreCondition = new String(source.KbPreCondition);
        }
        if (source.RelatedProduct != null) {
            this.RelatedProduct = new String(source.RelatedProduct);
        }
        if (source.KbId != null) {
            this.KbId = new Long(source.KbId);
        }
        if (source.Ids != null) {
            this.Ids = new String(source.Ids);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "KbNo", this.KbNo);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "EffectHostCount", this.EffectHostCount);
        this.setParamSimple(map, prefix + "RelateVulCount", this.RelateVulCount);
        this.setParamArraySimple(map, prefix + "RelateVulList.", this.RelateVulList);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "KbPreCondition", this.KbPreCondition);
        this.setParamSimple(map, prefix + "RelatedProduct", this.RelatedProduct);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "Ids", this.Ids);

    }
}

