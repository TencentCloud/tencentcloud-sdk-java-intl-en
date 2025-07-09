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
package com.tencentcloudapi.advisor.v20200721.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Strategies extends AbstractModel {

    /**
    * Assessment item ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * Assessment item name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Assessment item description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Product ID corresponding to the assessment item
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Product name corresponding to the assessment item
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProductDesc")
    @Expose
    private String ProductDesc;

    /**
    * Optimization suggestions for the assessment item
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Repair")
    @Expose
    private String Repair;

    /**
    * Category ID of the assessment item 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Category name of the assessment item 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Risk list of the assessment item 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Conditions")
    @Expose
    private Conditions [] Conditions;

    /**
     * Get Assessment item ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StrategyId Assessment item ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Assessment item ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StrategyId Assessment item ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Assessment item name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Assessment item name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Assessment item name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Assessment item name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Assessment item description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Desc Assessment item description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Assessment item description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Desc Assessment item description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Product ID corresponding to the assessment item
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Product Product ID corresponding to the assessment item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Product ID corresponding to the assessment item
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Product Product ID corresponding to the assessment item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Product name corresponding to the assessment item
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProductDesc Product name corresponding to the assessment item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProductDesc() {
        return this.ProductDesc;
    }

    /**
     * Set Product name corresponding to the assessment item
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProductDesc Product name corresponding to the assessment item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProductDesc(String ProductDesc) {
        this.ProductDesc = ProductDesc;
    }

    /**
     * Get Optimization suggestions for the assessment item
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Repair Optimization suggestions for the assessment item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRepair() {
        return this.Repair;
    }

    /**
     * Set Optimization suggestions for the assessment item
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Repair Optimization suggestions for the assessment item
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRepair(String Repair) {
        this.Repair = Repair;
    }

    /**
     * Get Category ID of the assessment item 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupId Category ID of the assessment item 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Category ID of the assessment item 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupId Category ID of the assessment item 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Category name of the assessment item 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GroupName Category name of the assessment item 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Category name of the assessment item 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GroupName Category name of the assessment item 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Risk list of the assessment item 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Conditions Risk list of the assessment item 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Conditions [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Risk list of the assessment item 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Conditions Risk list of the assessment item 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConditions(Conditions [] Conditions) {
        this.Conditions = Conditions;
    }

    public Strategies() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Strategies(Strategies source) {
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ProductDesc != null) {
            this.ProductDesc = new String(source.ProductDesc);
        }
        if (source.Repair != null) {
            this.Repair = new String(source.Repair);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Conditions != null) {
            this.Conditions = new Conditions[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new Conditions(source.Conditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ProductDesc", this.ProductDesc);
        this.setParamSimple(map, prefix + "Repair", this.Repair);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);

    }
}

