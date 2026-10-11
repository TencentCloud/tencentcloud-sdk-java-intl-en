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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeDetailPriceResult extends AbstractModel {

    /**
    * Node type. Valid values: master, core, task, common, router, and mysql.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Price details for each component of the node.
    */
    @SerializedName("PartDetailPrice")
    @Expose
    private PartDetailPriceItem [] PartDetailPrice;

    /**
     * Get Node type. Valid values: master, core, task, common, router, and mysql. 
     * @return NodeType Node type. Valid values: master, core, task, common, router, and mysql.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type. Valid values: master, core, task, common, router, and mysql.
     * @param NodeType Node type. Valid values: master, core, task, common, router, and mysql.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Price details for each component of the node. 
     * @return PartDetailPrice Price details for each component of the node.
     */
    public PartDetailPriceItem [] getPartDetailPrice() {
        return this.PartDetailPrice;
    }

    /**
     * Set Price details for each component of the node.
     * @param PartDetailPrice Price details for each component of the node.
     */
    public void setPartDetailPrice(PartDetailPriceItem [] PartDetailPrice) {
        this.PartDetailPrice = PartDetailPrice;
    }

    public NodeDetailPriceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeDetailPriceResult(NodeDetailPriceResult source) {
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.PartDetailPrice != null) {
            this.PartDetailPrice = new PartDetailPriceItem[source.PartDetailPrice.length];
            for (int i = 0; i < source.PartDetailPrice.length; i++) {
                this.PartDetailPrice[i] = new PartDetailPriceItem(source.PartDetailPrice[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArrayObj(map, prefix + "PartDetailPrice.", this.PartDetailPrice);

    }
}

