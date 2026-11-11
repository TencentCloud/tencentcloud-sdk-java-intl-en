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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLoginWhiteLearnEDRRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Explicitly selected rule ID list, up to 1000; choose either this or SelectAll</p>
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * <p>Select all across pages: true - Delete all rules that meet Filters (Filters is required at this point). false - Delete only Ids</p>
    */
    @SerializedName("SelectAll")
    @Expose
    private Boolean SelectAll;

    /**
    * <p>List of target account AppIds for multi-account, up to 1000; being empty indicates only the current account; returns InvalidParameter when input but no permissions at all</p>
    */
    @SerializedName("TargetAppIDs")
    @Expose
    private Long [] TargetAppIDs;

    /**
    * <p>List of excluded rule IDs</p>
    */
    @SerializedName("ExcludeIds")
    @Expose
    private Long [] ExcludeIds;

    /**
    * <p>Filtering criteria under select all</p>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilter [] Filters;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Explicitly selected rule ID list, up to 1000; choose either this or SelectAll</p> 
     * @return Ids <p>Explicitly selected rule ID list, up to 1000; choose either this or SelectAll</p>
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set <p>Explicitly selected rule ID list, up to 1000; choose either this or SelectAll</p>
     * @param Ids <p>Explicitly selected rule ID list, up to 1000; choose either this or SelectAll</p>
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get <p>Select all across pages: true - Delete all rules that meet Filters (Filters is required at this point). false - Delete only Ids</p> 
     * @return SelectAll <p>Select all across pages: true - Delete all rules that meet Filters (Filters is required at this point). false - Delete only Ids</p>
     */
    public Boolean getSelectAll() {
        return this.SelectAll;
    }

    /**
     * Set <p>Select all across pages: true - Delete all rules that meet Filters (Filters is required at this point). false - Delete only Ids</p>
     * @param SelectAll <p>Select all across pages: true - Delete all rules that meet Filters (Filters is required at this point). false - Delete only Ids</p>
     */
    public void setSelectAll(Boolean SelectAll) {
        this.SelectAll = SelectAll;
    }

    /**
     * Get <p>List of target account AppIds for multi-account, up to 1000; being empty indicates only the current account; returns InvalidParameter when input but no permissions at all</p> 
     * @return TargetAppIDs <p>List of target account AppIds for multi-account, up to 1000; being empty indicates only the current account; returns InvalidParameter when input but no permissions at all</p>
     */
    public Long [] getTargetAppIDs() {
        return this.TargetAppIDs;
    }

    /**
     * Set <p>List of target account AppIds for multi-account, up to 1000; being empty indicates only the current account; returns InvalidParameter when input but no permissions at all</p>
     * @param TargetAppIDs <p>List of target account AppIds for multi-account, up to 1000; being empty indicates only the current account; returns InvalidParameter when input but no permissions at all</p>
     */
    public void setTargetAppIDs(Long [] TargetAppIDs) {
        this.TargetAppIDs = TargetAppIDs;
    }

    /**
     * Get <p>List of excluded rule IDs</p> 
     * @return ExcludeIds <p>List of excluded rule IDs</p>
     */
    public Long [] getExcludeIds() {
        return this.ExcludeIds;
    }

    /**
     * Set <p>List of excluded rule IDs</p>
     * @param ExcludeIds <p>List of excluded rule IDs</p>
     */
    public void setExcludeIds(Long [] ExcludeIds) {
        this.ExcludeIds = ExcludeIds;
    }

    /**
     * Get <p>Filtering criteria under select all</p> 
     * @return Filters <p>Filtering criteria under select all</p>
     */
    public EDRFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filtering criteria under select all</p>
     * @param Filters <p>Filtering criteria under select all</p>
     */
    public void setFilters(EDRFilter [] Filters) {
        this.Filters = Filters;
    }

    public DeleteLoginWhiteLearnEDRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLoginWhiteLearnEDRRequest(DeleteLoginWhiteLearnEDRRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.SelectAll != null) {
            this.SelectAll = new Boolean(source.SelectAll);
        }
        if (source.TargetAppIDs != null) {
            this.TargetAppIDs = new Long[source.TargetAppIDs.length];
            for (int i = 0; i < source.TargetAppIDs.length; i++) {
                this.TargetAppIDs[i] = new Long(source.TargetAppIDs[i]);
            }
        }
        if (source.ExcludeIds != null) {
            this.ExcludeIds = new Long[source.ExcludeIds.length];
            for (int i = 0; i < source.ExcludeIds.length; i++) {
                this.ExcludeIds[i] = new Long(source.ExcludeIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "SelectAll", this.SelectAll);
        this.setParamArraySimple(map, prefix + "TargetAppIDs.", this.TargetAppIDs);
        this.setParamArraySimple(map, prefix + "ExcludeIds.", this.ExcludeIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

