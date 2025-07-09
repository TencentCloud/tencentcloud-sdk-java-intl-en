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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWarningHostConfigRequest extends AbstractModel {

    /**
    * Alarm type
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Alarm Host Range Type. 0: All Hosts; 1: By Project; 2: By Tencent Cloud Tag; 3: By Host Security Tag; 4: Custom Hosts
    */
    @SerializedName("HostRange")
    @Expose
    private Long HostRange;

    /**
    * List of Project or Tag Names, empty for custom hosts
    */
    @SerializedName("ItemLabels")
    @Expose
    private String [] ItemLabels;

    /**
    * Machine list
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * List of Project or Tag IDs, empty for custom hosts
    */
    @SerializedName("ItemLabelIds")
    @Expose
    private String [] ItemLabelIds;

    /**
    * 
    */
    @SerializedName("ExcludedQuuids")
    @Expose
    private String [] ExcludedQuuids;

    /**
     * Get Alarm type 
     * @return Type Alarm type
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Alarm type
     * @param Type Alarm type
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Alarm Host Range Type. 0: All Hosts; 1: By Project; 2: By Tencent Cloud Tag; 3: By Host Security Tag; 4: Custom Hosts 
     * @return HostRange Alarm Host Range Type. 0: All Hosts; 1: By Project; 2: By Tencent Cloud Tag; 3: By Host Security Tag; 4: Custom Hosts
     */
    public Long getHostRange() {
        return this.HostRange;
    }

    /**
     * Set Alarm Host Range Type. 0: All Hosts; 1: By Project; 2: By Tencent Cloud Tag; 3: By Host Security Tag; 4: Custom Hosts
     * @param HostRange Alarm Host Range Type. 0: All Hosts; 1: By Project; 2: By Tencent Cloud Tag; 3: By Host Security Tag; 4: Custom Hosts
     */
    public void setHostRange(Long HostRange) {
        this.HostRange = HostRange;
    }

    /**
     * Get List of Project or Tag Names, empty for custom hosts 
     * @return ItemLabels List of Project or Tag Names, empty for custom hosts
     */
    public String [] getItemLabels() {
        return this.ItemLabels;
    }

    /**
     * Set List of Project or Tag Names, empty for custom hosts
     * @param ItemLabels List of Project or Tag Names, empty for custom hosts
     */
    public void setItemLabels(String [] ItemLabels) {
        this.ItemLabels = ItemLabels;
    }

    /**
     * Get Machine list 
     * @return Quuids Machine list
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set Machine list
     * @param Quuids Machine list
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get List of Project or Tag IDs, empty for custom hosts 
     * @return ItemLabelIds List of Project or Tag IDs, empty for custom hosts
     */
    public String [] getItemLabelIds() {
        return this.ItemLabelIds;
    }

    /**
     * Set List of Project or Tag IDs, empty for custom hosts
     * @param ItemLabelIds List of Project or Tag IDs, empty for custom hosts
     */
    public void setItemLabelIds(String [] ItemLabelIds) {
        this.ItemLabelIds = ItemLabelIds;
    }

    /**
     * Get  
     * @return ExcludedQuuids 
     */
    public String [] getExcludedQuuids() {
        return this.ExcludedQuuids;
    }

    /**
     * Set 
     * @param ExcludedQuuids 
     */
    public void setExcludedQuuids(String [] ExcludedQuuids) {
        this.ExcludedQuuids = ExcludedQuuids;
    }

    public ModifyWarningHostConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWarningHostConfigRequest(ModifyWarningHostConfigRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.HostRange != null) {
            this.HostRange = new Long(source.HostRange);
        }
        if (source.ItemLabels != null) {
            this.ItemLabels = new String[source.ItemLabels.length];
            for (int i = 0; i < source.ItemLabels.length; i++) {
                this.ItemLabels[i] = new String(source.ItemLabels[i]);
            }
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.ItemLabelIds != null) {
            this.ItemLabelIds = new String[source.ItemLabelIds.length];
            for (int i = 0; i < source.ItemLabelIds.length; i++) {
                this.ItemLabelIds[i] = new String(source.ItemLabelIds[i]);
            }
        }
        if (source.ExcludedQuuids != null) {
            this.ExcludedQuuids = new String[source.ExcludedQuuids.length];
            for (int i = 0; i < source.ExcludedQuuids.length; i++) {
                this.ExcludedQuuids[i] = new String(source.ExcludedQuuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "HostRange", this.HostRange);
        this.setParamArraySimple(map, prefix + "ItemLabels.", this.ItemLabels);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamArraySimple(map, prefix + "ItemLabelIds.", this.ItemLabelIds);
        this.setParamArraySimple(map, prefix + "ExcludedQuuids.", this.ExcludedQuuids);

    }
}

