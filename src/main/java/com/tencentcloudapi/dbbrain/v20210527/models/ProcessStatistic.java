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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessStatistic extends AbstractModel {

    /**
    * Array of session details
    */
    @SerializedName("Items")
    @Expose
    private SessionItem [] Items;

    /**
    * The total number of connections
    */
    @SerializedName("AllConnSum")
    @Expose
    private Long AllConnSum;

    /**
    * The total number of active connections
    */
    @SerializedName("ActiveConnSum")
    @Expose
    private Long ActiveConnSum;

    /**
     * Get Array of session details 
     * @return Items Array of session details
     */
    public SessionItem [] getItems() {
        return this.Items;
    }

    /**
     * Set Array of session details
     * @param Items Array of session details
     */
    public void setItems(SessionItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get The total number of connections 
     * @return AllConnSum The total number of connections
     */
    public Long getAllConnSum() {
        return this.AllConnSum;
    }

    /**
     * Set The total number of connections
     * @param AllConnSum The total number of connections
     */
    public void setAllConnSum(Long AllConnSum) {
        this.AllConnSum = AllConnSum;
    }

    /**
     * Get The total number of active connections 
     * @return ActiveConnSum The total number of active connections
     */
    public Long getActiveConnSum() {
        return this.ActiveConnSum;
    }

    /**
     * Set The total number of active connections
     * @param ActiveConnSum The total number of active connections
     */
    public void setActiveConnSum(Long ActiveConnSum) {
        this.ActiveConnSum = ActiveConnSum;
    }

    public ProcessStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessStatistic(ProcessStatistic source) {
        if (source.Items != null) {
            this.Items = new SessionItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new SessionItem(source.Items[i]);
            }
        }
        if (source.AllConnSum != null) {
            this.AllConnSum = new Long(source.AllConnSum);
        }
        if (source.ActiveConnSum != null) {
            this.ActiveConnSum = new Long(source.ActiveConnSum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "AllConnSum", this.AllConnSum);
        this.setParamSimple(map, prefix + "ActiveConnSum", this.ActiveConnSum);

    }
}

