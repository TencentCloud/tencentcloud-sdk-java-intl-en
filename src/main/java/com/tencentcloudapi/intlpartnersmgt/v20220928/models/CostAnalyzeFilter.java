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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CostAnalyzeFilter extends AbstractModel {

    /**
    * <p>Contains product code</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BusinessIn")
    @Expose
    private String [] BusinessIn;

    /**
    * <p>Contains sub-product code</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductIn")
    @Expose
    private String [] ProductIn;

    /**
    * <p>Contains region id</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionIn")
    @Expose
    private String [] RegionIn;

    /**
    * <p>Contains transaction type</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionTypeIn")
    @Expose
    private String [] ActionTypeIn;

    /**
    * <p>Includes payment mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayModeIn")
    @Expose
    private String [] PayModeIn;

    /**
    * <p>Include project name</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectIn")
    @Expose
    private String [] ProjectIn;

    /**
    * <p>Contains payer uin</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayerUinIn")
    @Expose
    private String [] PayerUinIn;

    /**
    * <p>Tag key.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * <p>Tag value list</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagIn")
    @Expose
    private String [] TagIn;

    /**
    * <p>Contains availability zones</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneIn")
    @Expose
    private String [] ZoneIn;

    /**
    * <p>Owner uin</p>
    */
    @SerializedName("OwnerUinIn")
    @Expose
    private String [] OwnerUinIn;

    /**
    * <p>Component type info</p>
    */
    @SerializedName("ComponentIn")
    @Expose
    private String [] ComponentIn;

    /**
    * <p>Component name</p>
    */
    @SerializedName("ItemIn")
    @Expose
    private String [] ItemIn;

    /**
    * <p>Resource id information</p>
    */
    @SerializedName("ResourceIn")
    @Expose
    private String [] ResourceIn;

    /**
     * Get <p>Contains product code</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BusinessIn <p>Contains product code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBusinessIn() {
        return this.BusinessIn;
    }

    /**
     * Set <p>Contains product code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BusinessIn <p>Contains product code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBusinessIn(String [] BusinessIn) {
        this.BusinessIn = BusinessIn;
    }

    /**
     * Get <p>Contains sub-product code</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProductIn <p>Contains sub-product code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getProductIn() {
        return this.ProductIn;
    }

    /**
     * Set <p>Contains sub-product code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProductIn <p>Contains sub-product code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProductIn(String [] ProductIn) {
        this.ProductIn = ProductIn;
    }

    /**
     * Get <p>Contains region id</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionIn <p>Contains region id</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getRegionIn() {
        return this.RegionIn;
    }

    /**
     * Set <p>Contains region id</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionIn <p>Contains region id</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionIn(String [] RegionIn) {
        this.RegionIn = RegionIn;
    }

    /**
     * Get <p>Contains transaction type</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionTypeIn <p>Contains transaction type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getActionTypeIn() {
        return this.ActionTypeIn;
    }

    /**
     * Set <p>Contains transaction type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionTypeIn <p>Contains transaction type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionTypeIn(String [] ActionTypeIn) {
        this.ActionTypeIn = ActionTypeIn;
    }

    /**
     * Get <p>Includes payment mode</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayModeIn <p>Includes payment mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPayModeIn() {
        return this.PayModeIn;
    }

    /**
     * Set <p>Includes payment mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayModeIn <p>Includes payment mode</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayModeIn(String [] PayModeIn) {
        this.PayModeIn = PayModeIn;
    }

    /**
     * Get <p>Include project name</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectIn <p>Include project name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getProjectIn() {
        return this.ProjectIn;
    }

    /**
     * Set <p>Include project name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectIn <p>Include project name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectIn(String [] ProjectIn) {
        this.ProjectIn = ProjectIn;
    }

    /**
     * Get <p>Contains payer uin</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayerUinIn <p>Contains payer uin</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPayerUinIn() {
        return this.PayerUinIn;
    }

    /**
     * Set <p>Contains payer uin</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayerUinIn <p>Contains payer uin</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayerUinIn(String [] PayerUinIn) {
        this.PayerUinIn = PayerUinIn;
    }

    /**
     * Get <p>Tag key.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagKey <p>Tag key.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>Tag key.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagKey <p>Tag key.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get <p>Tag value list</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagIn <p>Tag value list</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTagIn() {
        return this.TagIn;
    }

    /**
     * Set <p>Tag value list</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagIn <p>Tag value list</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagIn(String [] TagIn) {
        this.TagIn = TagIn;
    }

    /**
     * Get <p>Contains availability zones</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneIn <p>Contains availability zones</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getZoneIn() {
        return this.ZoneIn;
    }

    /**
     * Set <p>Contains availability zones</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneIn <p>Contains availability zones</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneIn(String [] ZoneIn) {
        this.ZoneIn = ZoneIn;
    }

    /**
     * Get <p>Owner uin</p> 
     * @return OwnerUinIn <p>Owner uin</p>
     */
    public String [] getOwnerUinIn() {
        return this.OwnerUinIn;
    }

    /**
     * Set <p>Owner uin</p>
     * @param OwnerUinIn <p>Owner uin</p>
     */
    public void setOwnerUinIn(String [] OwnerUinIn) {
        this.OwnerUinIn = OwnerUinIn;
    }

    /**
     * Get <p>Component type info</p> 
     * @return ComponentIn <p>Component type info</p>
     */
    public String [] getComponentIn() {
        return this.ComponentIn;
    }

    /**
     * Set <p>Component type info</p>
     * @param ComponentIn <p>Component type info</p>
     */
    public void setComponentIn(String [] ComponentIn) {
        this.ComponentIn = ComponentIn;
    }

    /**
     * Get <p>Component name</p> 
     * @return ItemIn <p>Component name</p>
     */
    public String [] getItemIn() {
        return this.ItemIn;
    }

    /**
     * Set <p>Component name</p>
     * @param ItemIn <p>Component name</p>
     */
    public void setItemIn(String [] ItemIn) {
        this.ItemIn = ItemIn;
    }

    /**
     * Get <p>Resource id information</p> 
     * @return ResourceIn <p>Resource id information</p>
     */
    public String [] getResourceIn() {
        return this.ResourceIn;
    }

    /**
     * Set <p>Resource id information</p>
     * @param ResourceIn <p>Resource id information</p>
     */
    public void setResourceIn(String [] ResourceIn) {
        this.ResourceIn = ResourceIn;
    }

    public CostAnalyzeFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CostAnalyzeFilter(CostAnalyzeFilter source) {
        if (source.BusinessIn != null) {
            this.BusinessIn = new String[source.BusinessIn.length];
            for (int i = 0; i < source.BusinessIn.length; i++) {
                this.BusinessIn[i] = new String(source.BusinessIn[i]);
            }
        }
        if (source.ProductIn != null) {
            this.ProductIn = new String[source.ProductIn.length];
            for (int i = 0; i < source.ProductIn.length; i++) {
                this.ProductIn[i] = new String(source.ProductIn[i]);
            }
        }
        if (source.RegionIn != null) {
            this.RegionIn = new String[source.RegionIn.length];
            for (int i = 0; i < source.RegionIn.length; i++) {
                this.RegionIn[i] = new String(source.RegionIn[i]);
            }
        }
        if (source.ActionTypeIn != null) {
            this.ActionTypeIn = new String[source.ActionTypeIn.length];
            for (int i = 0; i < source.ActionTypeIn.length; i++) {
                this.ActionTypeIn[i] = new String(source.ActionTypeIn[i]);
            }
        }
        if (source.PayModeIn != null) {
            this.PayModeIn = new String[source.PayModeIn.length];
            for (int i = 0; i < source.PayModeIn.length; i++) {
                this.PayModeIn[i] = new String(source.PayModeIn[i]);
            }
        }
        if (source.ProjectIn != null) {
            this.ProjectIn = new String[source.ProjectIn.length];
            for (int i = 0; i < source.ProjectIn.length; i++) {
                this.ProjectIn[i] = new String(source.ProjectIn[i]);
            }
        }
        if (source.PayerUinIn != null) {
            this.PayerUinIn = new String[source.PayerUinIn.length];
            for (int i = 0; i < source.PayerUinIn.length; i++) {
                this.PayerUinIn[i] = new String(source.PayerUinIn[i]);
            }
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagIn != null) {
            this.TagIn = new String[source.TagIn.length];
            for (int i = 0; i < source.TagIn.length; i++) {
                this.TagIn[i] = new String(source.TagIn[i]);
            }
        }
        if (source.ZoneIn != null) {
            this.ZoneIn = new String[source.ZoneIn.length];
            for (int i = 0; i < source.ZoneIn.length; i++) {
                this.ZoneIn[i] = new String(source.ZoneIn[i]);
            }
        }
        if (source.OwnerUinIn != null) {
            this.OwnerUinIn = new String[source.OwnerUinIn.length];
            for (int i = 0; i < source.OwnerUinIn.length; i++) {
                this.OwnerUinIn[i] = new String(source.OwnerUinIn[i]);
            }
        }
        if (source.ComponentIn != null) {
            this.ComponentIn = new String[source.ComponentIn.length];
            for (int i = 0; i < source.ComponentIn.length; i++) {
                this.ComponentIn[i] = new String(source.ComponentIn[i]);
            }
        }
        if (source.ItemIn != null) {
            this.ItemIn = new String[source.ItemIn.length];
            for (int i = 0; i < source.ItemIn.length; i++) {
                this.ItemIn[i] = new String(source.ItemIn[i]);
            }
        }
        if (source.ResourceIn != null) {
            this.ResourceIn = new String[source.ResourceIn.length];
            for (int i = 0; i < source.ResourceIn.length; i++) {
                this.ResourceIn[i] = new String(source.ResourceIn[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BusinessIn.", this.BusinessIn);
        this.setParamArraySimple(map, prefix + "ProductIn.", this.ProductIn);
        this.setParamArraySimple(map, prefix + "RegionIn.", this.RegionIn);
        this.setParamArraySimple(map, prefix + "ActionTypeIn.", this.ActionTypeIn);
        this.setParamArraySimple(map, prefix + "PayModeIn.", this.PayModeIn);
        this.setParamArraySimple(map, prefix + "ProjectIn.", this.ProjectIn);
        this.setParamArraySimple(map, prefix + "PayerUinIn.", this.PayerUinIn);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamArraySimple(map, prefix + "TagIn.", this.TagIn);
        this.setParamArraySimple(map, prefix + "ZoneIn.", this.ZoneIn);
        this.setParamArraySimple(map, prefix + "OwnerUinIn.", this.OwnerUinIn);
        this.setParamArraySimple(map, prefix + "ComponentIn.", this.ComponentIn);
        this.setParamArraySimple(map, prefix + "ItemIn.", this.ItemIn);
        this.setParamArraySimple(map, prefix + "ResourceIn.", this.ResourceIn);

    }
}

