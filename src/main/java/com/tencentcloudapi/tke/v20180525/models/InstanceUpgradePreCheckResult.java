/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceUpgradePreCheckResult extends AbstractModel {

    /**
    * Whether the check is passed
    */
    @SerializedName("CheckPass")
    @Expose
    private Boolean CheckPass;

    /**
    * Array of check items
    */
    @SerializedName("Items")
    @Expose
    private InstanceUpgradePreCheckResultItem [] Items;

    /**
    * List of independent pods on this node
    */
    @SerializedName("SinglePods")
    @Expose
    private String [] SinglePods;

    /**
     * Get Whether the check is passed 
     * @return CheckPass Whether the check is passed
     */
    public Boolean getCheckPass() {
        return this.CheckPass;
    }

    /**
     * Set Whether the check is passed
     * @param CheckPass Whether the check is passed
     */
    public void setCheckPass(Boolean CheckPass) {
        this.CheckPass = CheckPass;
    }

    /**
     * Get Array of check items 
     * @return Items Array of check items
     */
    public InstanceUpgradePreCheckResultItem [] getItems() {
        return this.Items;
    }

    /**
     * Set Array of check items
     * @param Items Array of check items
     */
    public void setItems(InstanceUpgradePreCheckResultItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get List of independent pods on this node 
     * @return SinglePods List of independent pods on this node
     */
    public String [] getSinglePods() {
        return this.SinglePods;
    }

    /**
     * Set List of independent pods on this node
     * @param SinglePods List of independent pods on this node
     */
    public void setSinglePods(String [] SinglePods) {
        this.SinglePods = SinglePods;
    }

    public InstanceUpgradePreCheckResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceUpgradePreCheckResult(InstanceUpgradePreCheckResult source) {
        if (source.CheckPass != null) {
            this.CheckPass = new Boolean(source.CheckPass);
        }
        if (source.Items != null) {
            this.Items = new InstanceUpgradePreCheckResultItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new InstanceUpgradePreCheckResultItem(source.Items[i]);
            }
        }
        if (source.SinglePods != null) {
            this.SinglePods = new String[source.SinglePods.length];
            for (int i = 0; i < source.SinglePods.length; i++) {
                this.SinglePods[i] = new String(source.SinglePods[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckPass", this.CheckPass);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamArraySimple(map, prefix + "SinglePods.", this.SinglePods);

    }
}

