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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BudgetConditionsForm extends AbstractModel {

    /**
    * <p>Product.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Business")
    @Expose
    private String [] Business;

    /**
    * <p>Billing mode</p><p>Enumeration value:</p><ul><li>prePay: Monthly Subscription</li><li>postPay: Pay-As-You-Go</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayMode")
    @Expose
    private String [] PayMode;

    /**
    * <p>Subproduct</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductCodes")
    @Expose
    private String [] ProductCodes;

    /**
    * <p>Component code</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ComponentCodes")
    @Expose
    private String [] ComponentCodes;

    /**
    * <p>Region.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * <p>AZ.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionIds")
    @Expose
    private String [] RegionIds;

    /**
    * <p>Project</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * <p>Transaction type</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActionTypes")
    @Expose
    private String [] ActionTypes;

    /**
    * <p>Consumption type</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumptionTypes")
    @Expose
    private String [] ConsumptionTypes;

    /**
    * <p>Tag.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private TagsForm [] Tags;

    /**
    * <p>Leaf-level cost allocation unit</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayerUins")
    @Expose
    private String [] PayerUins;

    /**
    * <p>Primary user Uin</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OwnerUins")
    @Expose
    private String [] OwnerUins;

    /**
    * <p>Unique key of the leaf-level cost allocation unit</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TreeNodeUniqKeys")
    @Expose
    private String [] TreeNodeUniqKeys;

    /**
     * Get <p>Product.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Business <p>Product.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBusiness() {
        return this.Business;
    }

    /**
     * Set <p>Product.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Business <p>Product.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBusiness(String [] Business) {
        this.Business = Business;
    }

    /**
     * Get <p>Billing mode</p><p>Enumeration value:</p><ul><li>prePay: Monthly Subscription</li><li>postPay: Pay-As-You-Go</li></ul>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayMode <p>Billing mode</p><p>Enumeration value:</p><ul><li>prePay: Monthly Subscription</li><li>postPay: Pay-As-You-Go</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Billing mode</p><p>Enumeration value:</p><ul><li>prePay: Monthly Subscription</li><li>postPay: Pay-As-You-Go</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayMode <p>Billing mode</p><p>Enumeration value:</p><ul><li>prePay: Monthly Subscription</li><li>postPay: Pay-As-You-Go</li></ul>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayMode(String [] PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Subproduct</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProductCodes <p>Subproduct</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getProductCodes() {
        return this.ProductCodes;
    }

    /**
     * Set <p>Subproduct</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProductCodes <p>Subproduct</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProductCodes(String [] ProductCodes) {
        this.ProductCodes = ProductCodes;
    }

    /**
     * Get <p>Component code</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ComponentCodes <p>Component code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getComponentCodes() {
        return this.ComponentCodes;
    }

    /**
     * Set <p>Component code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ComponentCodes <p>Component code</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComponentCodes(String [] ComponentCodes) {
        this.ComponentCodes = ComponentCodes;
    }

    /**
     * Get <p>Region.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneIds <p>Region.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>Region.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneIds <p>Region.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>AZ.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionIds <p>AZ.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set <p>AZ.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionIds <p>AZ.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionIds(String [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    /**
     * Get <p>Project</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectIds <p>Project</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>Project</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectIds <p>Project</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get <p>Transaction type</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActionTypes <p>Transaction type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getActionTypes() {
        return this.ActionTypes;
    }

    /**
     * Set <p>Transaction type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActionTypes <p>Transaction type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActionTypes(String [] ActionTypes) {
        this.ActionTypes = ActionTypes;
    }

    /**
     * Get <p>Consumption type</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsumptionTypes <p>Consumption type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getConsumptionTypes() {
        return this.ConsumptionTypes;
    }

    /**
     * Set <p>Consumption type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsumptionTypes <p>Consumption type</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumptionTypes(String [] ConsumptionTypes) {
        this.ConsumptionTypes = ConsumptionTypes;
    }

    /**
     * Get <p>Tag.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags <p>Tag.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TagsForm [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags <p>Tag.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(TagsForm [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Leaf-level cost allocation unit</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayerUins <p>Leaf-level cost allocation unit</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPayerUins() {
        return this.PayerUins;
    }

    /**
     * Set <p>Leaf-level cost allocation unit</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayerUins <p>Leaf-level cost allocation unit</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayerUins(String [] PayerUins) {
        this.PayerUins = PayerUins;
    }

    /**
     * Get <p>Primary user Uin</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OwnerUins <p>Primary user Uin</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getOwnerUins() {
        return this.OwnerUins;
    }

    /**
     * Set <p>Primary user Uin</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OwnerUins <p>Primary user Uin</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOwnerUins(String [] OwnerUins) {
        this.OwnerUins = OwnerUins;
    }

    /**
     * Get <p>Unique key of the leaf-level cost allocation unit</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TreeNodeUniqKeys <p>Unique key of the leaf-level cost allocation unit</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTreeNodeUniqKeys() {
        return this.TreeNodeUniqKeys;
    }

    /**
     * Set <p>Unique key of the leaf-level cost allocation unit</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TreeNodeUniqKeys <p>Unique key of the leaf-level cost allocation unit</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTreeNodeUniqKeys(String [] TreeNodeUniqKeys) {
        this.TreeNodeUniqKeys = TreeNodeUniqKeys;
    }

    public BudgetConditionsForm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetConditionsForm(BudgetConditionsForm source) {
        if (source.Business != null) {
            this.Business = new String[source.Business.length];
            for (int i = 0; i < source.Business.length; i++) {
                this.Business[i] = new String(source.Business[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new String[source.PayMode.length];
            for (int i = 0; i < source.PayMode.length; i++) {
                this.PayMode[i] = new String(source.PayMode[i]);
            }
        }
        if (source.ProductCodes != null) {
            this.ProductCodes = new String[source.ProductCodes.length];
            for (int i = 0; i < source.ProductCodes.length; i++) {
                this.ProductCodes[i] = new String(source.ProductCodes[i]);
            }
        }
        if (source.ComponentCodes != null) {
            this.ComponentCodes = new String[source.ComponentCodes.length];
            for (int i = 0; i < source.ComponentCodes.length; i++) {
                this.ComponentCodes[i] = new String(source.ComponentCodes[i]);
            }
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.RegionIds != null) {
            this.RegionIds = new String[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new String(source.RegionIds[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.ActionTypes != null) {
            this.ActionTypes = new String[source.ActionTypes.length];
            for (int i = 0; i < source.ActionTypes.length; i++) {
                this.ActionTypes[i] = new String(source.ActionTypes[i]);
            }
        }
        if (source.ConsumptionTypes != null) {
            this.ConsumptionTypes = new String[source.ConsumptionTypes.length];
            for (int i = 0; i < source.ConsumptionTypes.length; i++) {
                this.ConsumptionTypes[i] = new String(source.ConsumptionTypes[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagsForm[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagsForm(source.Tags[i]);
            }
        }
        if (source.PayerUins != null) {
            this.PayerUins = new String[source.PayerUins.length];
            for (int i = 0; i < source.PayerUins.length; i++) {
                this.PayerUins[i] = new String(source.PayerUins[i]);
            }
        }
        if (source.OwnerUins != null) {
            this.OwnerUins = new String[source.OwnerUins.length];
            for (int i = 0; i < source.OwnerUins.length; i++) {
                this.OwnerUins[i] = new String(source.OwnerUins[i]);
            }
        }
        if (source.TreeNodeUniqKeys != null) {
            this.TreeNodeUniqKeys = new String[source.TreeNodeUniqKeys.length];
            for (int i = 0; i < source.TreeNodeUniqKeys.length; i++) {
                this.TreeNodeUniqKeys[i] = new String(source.TreeNodeUniqKeys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Business.", this.Business);
        this.setParamArraySimple(map, prefix + "PayMode.", this.PayMode);
        this.setParamArraySimple(map, prefix + "ProductCodes.", this.ProductCodes);
        this.setParamArraySimple(map, prefix + "ComponentCodes.", this.ComponentCodes);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "ActionTypes.", this.ActionTypes);
        this.setParamArraySimple(map, prefix + "ConsumptionTypes.", this.ConsumptionTypes);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "PayerUins.", this.PayerUins);
        this.setParamArraySimple(map, prefix + "OwnerUins.", this.OwnerUins);
        this.setParamArraySimple(map, prefix + "TreeNodeUniqKeys.", this.TreeNodeUniqKeys);

    }
}

