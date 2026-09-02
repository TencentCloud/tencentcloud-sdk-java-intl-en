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

public class KBDetail extends AbstractModel {

    /**
    * <p>KB patch internal ID (kb_info.id)</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>KB No.<br>Parameter format: e.g. KB5001234</p>
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * <p>KB patch name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Reference link (Microsoft Official Documentation address)</p>
    */
    @SerializedName("ReferUrl")
    @Expose
    private String ReferUrl;

    /**
    * <p>Release time<br>Parameter format: YYYY-MM-DD HH:mm:ss</p>
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * <p>Whether restart is required after installing this KB<br>Enumeration values:<br>true: required<br>false: not required</p>
    */
    @SerializedName("NeedRestart")
    @Expose
    private Boolean NeedRestart;

    /**
    * <p>Associated vulnerability list</p>
    */
    @SerializedName("RelateVulList")
    @Expose
    private VulBriefInfo [] RelateVulList;

    /**
    * <p>Total number of associated vulnerabilities</p>
    */
    @SerializedName("RelateVulCount")
    @Expose
    private Long RelateVulCount;

    /**
    * <p>Associated os version</p>
    */
    @SerializedName("RelateProduct")
    @Expose
    private String RelateProduct;

    /**
     * Get <p>KB patch internal ID (kb_info.id)</p> 
     * @return ID <p>KB patch internal ID (kb_info.id)</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>KB patch internal ID (kb_info.id)</p>
     * @param ID <p>KB patch internal ID (kb_info.id)</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>KB No.<br>Parameter format: e.g. KB5001234</p> 
     * @return Number <p>KB No.<br>Parameter format: e.g. KB5001234</p>
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set <p>KB No.<br>Parameter format: e.g. KB5001234</p>
     * @param Number <p>KB No.<br>Parameter format: e.g. KB5001234</p>
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get <p>KB patch name</p> 
     * @return Name <p>KB patch name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>KB patch name</p>
     * @param Name <p>KB patch name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Reference link (Microsoft Official Documentation address)</p> 
     * @return ReferUrl <p>Reference link (Microsoft Official Documentation address)</p>
     */
    public String getReferUrl() {
        return this.ReferUrl;
    }

    /**
     * Set <p>Reference link (Microsoft Official Documentation address)</p>
     * @param ReferUrl <p>Reference link (Microsoft Official Documentation address)</p>
     */
    public void setReferUrl(String ReferUrl) {
        this.ReferUrl = ReferUrl;
    }

    /**
     * Get <p>Release time<br>Parameter format: YYYY-MM-DD HH:mm:ss</p> 
     * @return PublishTime <p>Release time<br>Parameter format: YYYY-MM-DD HH:mm:ss</p>
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set <p>Release time<br>Parameter format: YYYY-MM-DD HH:mm:ss</p>
     * @param PublishTime <p>Release time<br>Parameter format: YYYY-MM-DD HH:mm:ss</p>
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get <p>Whether restart is required after installing this KB<br>Enumeration values:<br>true: required<br>false: not required</p> 
     * @return NeedRestart <p>Whether restart is required after installing this KB<br>Enumeration values:<br>true: required<br>false: not required</p>
     */
    public Boolean getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set <p>Whether restart is required after installing this KB<br>Enumeration values:<br>true: required<br>false: not required</p>
     * @param NeedRestart <p>Whether restart is required after installing this KB<br>Enumeration values:<br>true: required<br>false: not required</p>
     */
    public void setNeedRestart(Boolean NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get <p>Associated vulnerability list</p> 
     * @return RelateVulList <p>Associated vulnerability list</p>
     */
    public VulBriefInfo [] getRelateVulList() {
        return this.RelateVulList;
    }

    /**
     * Set <p>Associated vulnerability list</p>
     * @param RelateVulList <p>Associated vulnerability list</p>
     */
    public void setRelateVulList(VulBriefInfo [] RelateVulList) {
        this.RelateVulList = RelateVulList;
    }

    /**
     * Get <p>Total number of associated vulnerabilities</p> 
     * @return RelateVulCount <p>Total number of associated vulnerabilities</p>
     */
    public Long getRelateVulCount() {
        return this.RelateVulCount;
    }

    /**
     * Set <p>Total number of associated vulnerabilities</p>
     * @param RelateVulCount <p>Total number of associated vulnerabilities</p>
     */
    public void setRelateVulCount(Long RelateVulCount) {
        this.RelateVulCount = RelateVulCount;
    }

    /**
     * Get <p>Associated os version</p> 
     * @return RelateProduct <p>Associated os version</p>
     */
    public String getRelateProduct() {
        return this.RelateProduct;
    }

    /**
     * Set <p>Associated os version</p>
     * @param RelateProduct <p>Associated os version</p>
     */
    public void setRelateProduct(String RelateProduct) {
        this.RelateProduct = RelateProduct;
    }

    public KBDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBDetail(KBDetail source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ReferUrl != null) {
            this.ReferUrl = new String(source.ReferUrl);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new Boolean(source.NeedRestart);
        }
        if (source.RelateVulList != null) {
            this.RelateVulList = new VulBriefInfo[source.RelateVulList.length];
            for (int i = 0; i < source.RelateVulList.length; i++) {
                this.RelateVulList[i] = new VulBriefInfo(source.RelateVulList[i]);
            }
        }
        if (source.RelateVulCount != null) {
            this.RelateVulCount = new Long(source.RelateVulCount);
        }
        if (source.RelateProduct != null) {
            this.RelateProduct = new String(source.RelateProduct);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ReferUrl", this.ReferUrl);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamArrayObj(map, prefix + "RelateVulList.", this.RelateVulList);
        this.setParamSimple(map, prefix + "RelateVulCount", this.RelateVulCount);
        this.setParamSimple(map, prefix + "RelateProduct", this.RelateProduct);

    }
}

