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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HandleCurrentPlaylistRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * 
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 
    */
    @SerializedName("SegmentIndex")
    @Expose
    private Long SegmentIndex;

    /**
    * 
    */
    @SerializedName("RoundPlaylist")
    @Expose
    private RoundPlayListItemInfo [] RoundPlaylist;

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return RoundPlayId 
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set 
     * @param RoundPlayId 
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get  
     * @return Operation 
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 
     * @param Operation 
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get  
     * @return ItemId 
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 
     * @param ItemId 
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get  
     * @return SegmentIndex 
     */
    public Long getSegmentIndex() {
        return this.SegmentIndex;
    }

    /**
     * Set 
     * @param SegmentIndex 
     */
    public void setSegmentIndex(Long SegmentIndex) {
        this.SegmentIndex = SegmentIndex;
    }

    /**
     * Get  
     * @return RoundPlaylist 
     */
    public RoundPlayListItemInfo [] getRoundPlaylist() {
        return this.RoundPlaylist;
    }

    /**
     * Set 
     * @param RoundPlaylist 
     */
    public void setRoundPlaylist(RoundPlayListItemInfo [] RoundPlaylist) {
        this.RoundPlaylist = RoundPlaylist;
    }

    public HandleCurrentPlaylistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HandleCurrentPlaylistRequest(HandleCurrentPlaylistRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.RoundPlayId != null) {
            this.RoundPlayId = new String(source.RoundPlayId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.SegmentIndex != null) {
            this.SegmentIndex = new Long(source.SegmentIndex);
        }
        if (source.RoundPlaylist != null) {
            this.RoundPlaylist = new RoundPlayListItemInfo[source.RoundPlaylist.length];
            for (int i = 0; i < source.RoundPlaylist.length; i++) {
                this.RoundPlaylist[i] = new RoundPlayListItemInfo(source.RoundPlaylist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "RoundPlayId", this.RoundPlayId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "SegmentIndex", this.SegmentIndex);
        this.setParamArrayObj(map, prefix + "RoundPlaylist.", this.RoundPlaylist);

    }
}

