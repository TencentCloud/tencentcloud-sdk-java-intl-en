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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConflictSource extends AbstractModel{

    /**
    * Conflict resource ID
    */
    @SerializedName("ConflictSourceId")
    @Expose
    private String ConflictSourceId;

    /**
    * Conflict resource
    */
    @SerializedName("SourceItem")
    @Expose
    private String SourceItem;

    /**
    * Conflict resource items
    */
    @SerializedName("ConflictItemSet")
    @Expose
    private ConflictItem [] ConflictItemSet;

    /**
     * Get Conflict resource ID 
     * @return ConflictSourceId Conflict resource ID
     */
    public String getConflictSourceId() {
        return this.ConflictSourceId;
    }

    /**
     * Set Conflict resource ID
     * @param ConflictSourceId Conflict resource ID
     */
    public void setConflictSourceId(String ConflictSourceId) {
        this.ConflictSourceId = ConflictSourceId;
    }

    /**
     * Get Conflict resource 
     * @return SourceItem Conflict resource
     */
    public String getSourceItem() {
        return this.SourceItem;
    }

    /**
     * Set Conflict resource
     * @param SourceItem Conflict resource
     */
    public void setSourceItem(String SourceItem) {
        this.SourceItem = SourceItem;
    }

    /**
     * Get Conflict resource items 
     * @return ConflictItemSet Conflict resource items
     */
    public ConflictItem [] getConflictItemSet() {
        return this.ConflictItemSet;
    }

    /**
     * Set Conflict resource items
     * @param ConflictItemSet Conflict resource items
     */
    public void setConflictItemSet(ConflictItem [] ConflictItemSet) {
        this.ConflictItemSet = ConflictItemSet;
    }

    public ConflictSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConflictSource(ConflictSource source) {
        if (source.ConflictSourceId != null) {
            this.ConflictSourceId = new String(source.ConflictSourceId);
        }
        if (source.SourceItem != null) {
            this.SourceItem = new String(source.SourceItem);
        }
        if (source.ConflictItemSet != null) {
            this.ConflictItemSet = new ConflictItem[source.ConflictItemSet.length];
            for (int i = 0; i < source.ConflictItemSet.length; i++) {
                this.ConflictItemSet[i] = new ConflictItem(source.ConflictItemSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConflictSourceId", this.ConflictSourceId);
        this.setParamSimple(map, prefix + "SourceItem", this.SourceItem);
        this.setParamArrayObj(map, prefix + "ConflictItemSet.", this.ConflictItemSet);

    }
}

