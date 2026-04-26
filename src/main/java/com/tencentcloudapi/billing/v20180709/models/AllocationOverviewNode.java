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

public class AllocationOverviewNode extends AbstractModel {

    /**
    * Cost allocation unit ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Name of a cost allocation unit
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Unique identifier of a cost allocation unit
    */
    @SerializedName("TreeNodeUniqKey")
    @Expose
    private String TreeNodeUniqKey;

    /**
    * Billing unit including a rule flag
0 - No rule exists.
1 - Both collection rules and allocation rules exist.
2 - Only collection rules exist.
3 - Only allocation rules exist.
    */
    @SerializedName("Symbol")
    @Expose
    private Long Symbol;

    /**
    * Detailed monthly overview of a sub-unit
    */
    @SerializedName("Children")
    @Expose
    private AllocationOverviewNode [] Children;

    /**
    * Monthly overview amount details of a cost allocation bill
    */
    @SerializedName("Detail")
    @Expose
    private AllocationMonthOverviewDetail Detail;

    /**
     * Get Cost allocation unit ID 
     * @return Id Cost allocation unit ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Cost allocation unit ID
     * @param Id Cost allocation unit ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Name of a cost allocation unit 
     * @return Name Name of a cost allocation unit
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a cost allocation unit
     * @param Name Name of a cost allocation unit
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Unique identifier of a cost allocation unit 
     * @return TreeNodeUniqKey Unique identifier of a cost allocation unit
     */
    public String getTreeNodeUniqKey() {
        return this.TreeNodeUniqKey;
    }

    /**
     * Set Unique identifier of a cost allocation unit
     * @param TreeNodeUniqKey Unique identifier of a cost allocation unit
     */
    public void setTreeNodeUniqKey(String TreeNodeUniqKey) {
        this.TreeNodeUniqKey = TreeNodeUniqKey;
    }

    /**
     * Get Billing unit including a rule flag
0 - No rule exists.
1 - Both collection rules and allocation rules exist.
2 - Only collection rules exist.
3 - Only allocation rules exist. 
     * @return Symbol Billing unit including a rule flag
0 - No rule exists.
1 - Both collection rules and allocation rules exist.
2 - Only collection rules exist.
3 - Only allocation rules exist.
     */
    public Long getSymbol() {
        return this.Symbol;
    }

    /**
     * Set Billing unit including a rule flag
0 - No rule exists.
1 - Both collection rules and allocation rules exist.
2 - Only collection rules exist.
3 - Only allocation rules exist.
     * @param Symbol Billing unit including a rule flag
0 - No rule exists.
1 - Both collection rules and allocation rules exist.
2 - Only collection rules exist.
3 - Only allocation rules exist.
     */
    public void setSymbol(Long Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * Get Detailed monthly overview of a sub-unit 
     * @return Children Detailed monthly overview of a sub-unit
     */
    public AllocationOverviewNode [] getChildren() {
        return this.Children;
    }

    /**
     * Set Detailed monthly overview of a sub-unit
     * @param Children Detailed monthly overview of a sub-unit
     */
    public void setChildren(AllocationOverviewNode [] Children) {
        this.Children = Children;
    }

    /**
     * Get Monthly overview amount details of a cost allocation bill 
     * @return Detail Monthly overview amount details of a cost allocation bill
     */
    public AllocationMonthOverviewDetail getDetail() {
        return this.Detail;
    }

    /**
     * Set Monthly overview amount details of a cost allocation bill
     * @param Detail Monthly overview amount details of a cost allocation bill
     */
    public void setDetail(AllocationMonthOverviewDetail Detail) {
        this.Detail = Detail;
    }

    public AllocationOverviewNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationOverviewNode(AllocationOverviewNode source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TreeNodeUniqKey != null) {
            this.TreeNodeUniqKey = new String(source.TreeNodeUniqKey);
        }
        if (source.Symbol != null) {
            this.Symbol = new Long(source.Symbol);
        }
        if (source.Children != null) {
            this.Children = new AllocationOverviewNode[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new AllocationOverviewNode(source.Children[i]);
            }
        }
        if (source.Detail != null) {
            this.Detail = new AllocationMonthOverviewDetail(source.Detail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TreeNodeUniqKey", this.TreeNodeUniqKey);
        this.setParamSimple(map, prefix + "Symbol", this.Symbol);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamObj(map, prefix + "Detail.", this.Detail);

    }
}

