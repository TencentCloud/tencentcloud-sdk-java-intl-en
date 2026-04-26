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
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * Assessment item name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Assessment item description.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Product ID corresponding to the assessment item.
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * Assessment item corresponding product name.
    */
    @SerializedName("ProductDesc")
    @Expose
    private String ProductDesc;

    /**
    * Specifies optimization suggestions for the assessment item.
    */
    @SerializedName("Repair")
    @Expose
    private String Repair;

    /**
    * Assessment item category ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Specifies the category name of the assessment item.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Specifies the evaluation item risk list.
    */
    @SerializedName("Conditions")
    @Expose
    private Conditions [] Conditions;

    /**
     * Get Assessment item ID 
     * @return StrategyId Assessment item ID
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Assessment item ID
     * @param StrategyId Assessment item ID
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get Assessment item name. 
     * @return Name Assessment item name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Assessment item name.
     * @param Name Assessment item name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Assessment item description. 
     * @return Desc Assessment item description.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Assessment item description.
     * @param Desc Assessment item description.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Product ID corresponding to the assessment item. 
     * @return Product Product ID corresponding to the assessment item.
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set Product ID corresponding to the assessment item.
     * @param Product Product ID corresponding to the assessment item.
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get Assessment item corresponding product name. 
     * @return ProductDesc Assessment item corresponding product name.
     */
    public String getProductDesc() {
        return this.ProductDesc;
    }

    /**
     * Set Assessment item corresponding product name.
     * @param ProductDesc Assessment item corresponding product name.
     */
    public void setProductDesc(String ProductDesc) {
        this.ProductDesc = ProductDesc;
    }

    /**
     * Get Specifies optimization suggestions for the assessment item. 
     * @return Repair Specifies optimization suggestions for the assessment item.
     */
    public String getRepair() {
        return this.Repair;
    }

    /**
     * Set Specifies optimization suggestions for the assessment item.
     * @param Repair Specifies optimization suggestions for the assessment item.
     */
    public void setRepair(String Repair) {
        this.Repair = Repair;
    }

    /**
     * Get Assessment item category ID. 
     * @return GroupId Assessment item category ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Assessment item category ID.
     * @param GroupId Assessment item category ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Specifies the category name of the assessment item. 
     * @return GroupName Specifies the category name of the assessment item.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Specifies the category name of the assessment item.
     * @param GroupName Specifies the category name of the assessment item.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Specifies the evaluation item risk list. 
     * @return Conditions Specifies the evaluation item risk list.
     */
    public Conditions [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Specifies the evaluation item risk list.
     * @param Conditions Specifies the evaluation item risk list.
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

