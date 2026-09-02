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

public class CWPOrderList extends AbstractModel {

    /**
    * <p>Associated product p_</p>
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * <p>Subproduct sp_</p>
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * <p>Billing item Layer-4 sv_</p>
    */
    @SerializedName("InquireKey")
    @Expose
    private String InquireKey;

    /**
    * <p>Resource purchase quantity</p>
    */
    @SerializedName("InquireNum")
    @Expose
    private Long InquireNum;

    /**
    * <p>Resource usage</p>
    */
    @SerializedName("UsedNum")
    @Expose
    private Long UsedNum;

    /**
    * <p>Cloud tag</p>
    */
    @SerializedName("TagList")
    @Expose
    private Tags [] TagList;

    /**
    * <p>Order status: 1 normal, 2 isolated, 3 terminated</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Order start time</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>Order end time</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Project ID.</p>
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * <p>Resource alias</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>Resource ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>Auto-renewal label 0: no automatic renewal by default (key accounts renew automatically). 1: auto-renewal. 2: manually set not to automatically renew (key accounts do not renew automatically).</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>Resource type.</p>
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * <p>Billing mode. 0: postpaid. 1: prepaid (annual/monthly subscription)</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Region ID.</p>
    */
    @SerializedName("RegionID")
    @Expose
    private Long RegionID;

    /**
    * <p>AZ ID.</p>
    */
    @SerializedName("ZoneID")
    @Expose
    private Long ZoneID;

    /**
    * <p>Current sub-order number</p>
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * <p>Additional parameters for orders</p>
    */
    @SerializedName("ExtraParam")
    @Expose
    private CWPOrderExtraParam ExtraParam;

    /**
     * Get <p>Associated product p_</p> 
     * @return ProductCode <p>Associated product p_</p>
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set <p>Associated product p_</p>
     * @param ProductCode <p>Associated product p_</p>
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get <p>Subproduct sp_</p> 
     * @return SubProductCode <p>Subproduct sp_</p>
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set <p>Subproduct sp_</p>
     * @param SubProductCode <p>Subproduct sp_</p>
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get <p>Billing item Layer-4 sv_</p> 
     * @return InquireKey <p>Billing item Layer-4 sv_</p>
     */
    public String getInquireKey() {
        return this.InquireKey;
    }

    /**
     * Set <p>Billing item Layer-4 sv_</p>
     * @param InquireKey <p>Billing item Layer-4 sv_</p>
     */
    public void setInquireKey(String InquireKey) {
        this.InquireKey = InquireKey;
    }

    /**
     * Get <p>Resource purchase quantity</p> 
     * @return InquireNum <p>Resource purchase quantity</p>
     */
    public Long getInquireNum() {
        return this.InquireNum;
    }

    /**
     * Set <p>Resource purchase quantity</p>
     * @param InquireNum <p>Resource purchase quantity</p>
     */
    public void setInquireNum(Long InquireNum) {
        this.InquireNum = InquireNum;
    }

    /**
     * Get <p>Resource usage</p> 
     * @return UsedNum <p>Resource usage</p>
     */
    public Long getUsedNum() {
        return this.UsedNum;
    }

    /**
     * Set <p>Resource usage</p>
     * @param UsedNum <p>Resource usage</p>
     */
    public void setUsedNum(Long UsedNum) {
        this.UsedNum = UsedNum;
    }

    /**
     * Get <p>Cloud tag</p> 
     * @return TagList <p>Cloud tag</p>
     */
    public Tags [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>Cloud tag</p>
     * @param TagList <p>Cloud tag</p>
     */
    public void setTagList(Tags [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>Order status: 1 normal, 2 isolated, 3 terminated</p> 
     * @return Status <p>Order status: 1 normal, 2 isolated, 3 terminated</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Order status: 1 normal, 2 isolated, 3 terminated</p>
     * @param Status <p>Order status: 1 normal, 2 isolated, 3 terminated</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Order start time</p> 
     * @return BeginTime <p>Order start time</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>Order start time</p>
     * @param BeginTime <p>Order start time</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>Order end time</p> 
     * @return EndTime <p>Order end time</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Order end time</p>
     * @param EndTime <p>Order end time</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Project ID.</p> 
     * @return ProjectID <p>Project ID.</p>
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set <p>Project ID.</p>
     * @param ProjectID <p>Project ID.</p>
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get <p>Resource alias</p> 
     * @return Alias <p>Resource alias</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>Resource alias</p>
     * @param Alias <p>Resource alias</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>Resource ID</p> 
     * @return ResourceId <p>Resource ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>Resource ID</p>
     * @param ResourceId <p>Resource ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>Auto-renewal label 0: no automatic renewal by default (key accounts renew automatically). 1: auto-renewal. 2: manually set not to automatically renew (key accounts do not renew automatically).</p> 
     * @return AutoRenewFlag <p>Auto-renewal label 0: no automatic renewal by default (key accounts renew automatically). 1: auto-renewal. 2: manually set not to automatically renew (key accounts do not renew automatically).</p>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>Auto-renewal label 0: no automatic renewal by default (key accounts renew automatically). 1: auto-renewal. 2: manually set not to automatically renew (key accounts do not renew automatically).</p>
     * @param AutoRenewFlag <p>Auto-renewal label 0: no automatic renewal by default (key accounts renew automatically). 1: auto-renewal. 2: manually set not to automatically renew (key accounts do not renew automatically).</p>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>Resource type.</p> 
     * @return SourceType <p>Resource type.</p>
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>Resource type.</p>
     * @param SourceType <p>Resource type.</p>
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>Billing mode. 0: postpaid. 1: prepaid (annual/monthly subscription)</p> 
     * @return PayMode <p>Billing mode. 0: postpaid. 1: prepaid (annual/monthly subscription)</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Billing mode. 0: postpaid. 1: prepaid (annual/monthly subscription)</p>
     * @param PayMode <p>Billing mode. 0: postpaid. 1: prepaid (annual/monthly subscription)</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Region ID.</p> 
     * @return RegionID <p>Region ID.</p>
     */
    public Long getRegionID() {
        return this.RegionID;
    }

    /**
     * Set <p>Region ID.</p>
     * @param RegionID <p>Region ID.</p>
     */
    public void setRegionID(Long RegionID) {
        this.RegionID = RegionID;
    }

    /**
     * Get <p>AZ ID.</p> 
     * @return ZoneID <p>AZ ID.</p>
     */
    public Long getZoneID() {
        return this.ZoneID;
    }

    /**
     * Set <p>AZ ID.</p>
     * @param ZoneID <p>AZ ID.</p>
     */
    public void setZoneID(Long ZoneID) {
        this.ZoneID = ZoneID;
    }

    /**
     * Get <p>Current sub-order number</p> 
     * @return DealName <p>Current sub-order number</p>
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set <p>Current sub-order number</p>
     * @param DealName <p>Current sub-order number</p>
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get <p>Additional parameters for orders</p> 
     * @return ExtraParam <p>Additional parameters for orders</p>
     */
    public CWPOrderExtraParam getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set <p>Additional parameters for orders</p>
     * @param ExtraParam <p>Additional parameters for orders</p>
     */
    public void setExtraParam(CWPOrderExtraParam ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    public CWPOrderList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CWPOrderList(CWPOrderList source) {
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.InquireKey != null) {
            this.InquireKey = new String(source.InquireKey);
        }
        if (source.InquireNum != null) {
            this.InquireNum = new Long(source.InquireNum);
        }
        if (source.UsedNum != null) {
            this.UsedNum = new Long(source.UsedNum);
        }
        if (source.TagList != null) {
            this.TagList = new Tags[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tags(source.TagList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ProjectID != null) {
            this.ProjectID = new Long(source.ProjectID);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.RegionID != null) {
            this.RegionID = new Long(source.RegionID);
        }
        if (source.ZoneID != null) {
            this.ZoneID = new Long(source.ZoneID);
        }
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new CWPOrderExtraParam(source.ExtraParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "InquireKey", this.InquireKey);
        this.setParamSimple(map, prefix + "InquireNum", this.InquireNum);
        this.setParamSimple(map, prefix + "UsedNum", this.UsedNum);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RegionID", this.RegionID);
        this.setParamSimple(map, prefix + "ZoneID", this.ZoneID);
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamObj(map, prefix + "ExtraParam.", this.ExtraParam);

    }
}

