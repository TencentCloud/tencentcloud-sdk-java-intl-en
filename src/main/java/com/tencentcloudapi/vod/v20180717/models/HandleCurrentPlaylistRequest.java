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
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Carousel playlist unique identifier.
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * Operation type. Valid values: <li>Insert: insert a program into the current playback list. The inserted program remains valid in subsequent carousel processes.</li> <li>InsertTemporary: temporarily insert a program into the current playback list. Temporarily inserted programs are only effective during this carousel process.</li><li>Delete: delete a program from the playback list. Cannot delete currently playing programs.</li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Playlist program ID. <li>When Operation is Insert, this field is required, indicating that the inserted program list is located after this program.</li> <li>When Operation is InsertTemporary, this field is optional. If not filled in, the program is inserted at the latest insertion point. If this field is filled in and SegmentIndex is also filled in, the program is inserted behind the SegmentIndex fragment of the program corresponding to ItemId. Otherwise, it is inserted after this program.</li> <li>When Operation is Delete, this field is required, indicating deletion of this program. Currently playing programs cannot be deleted.</li>
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * Index number of the M3U8 file segment. The SegmentIndex of the first segment in an M3U8 file is 0. This parameter is valid when Operation is InsertTemporary and ItemId has a value.
    */
    @SerializedName("SegmentIndex")
    @Expose
    private Long SegmentIndex;

    /**
    * Program list. Required when Operation is Insert, InsertTemporary, or Delete. Indicates the program list to operate. The maximum list length is 10.
    */
    @SerializedName("RoundPlaylist")
    @Expose
    private RoundPlayListItemInfo [] RoundPlaylist;

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Carousel playlist unique identifier. 
     * @return RoundPlayId Carousel playlist unique identifier.
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set Carousel playlist unique identifier.
     * @param RoundPlayId Carousel playlist unique identifier.
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get Operation type. Valid values: <li>Insert: insert a program into the current playback list. The inserted program remains valid in subsequent carousel processes.</li> <li>InsertTemporary: temporarily insert a program into the current playback list. Temporarily inserted programs are only effective during this carousel process.</li><li>Delete: delete a program from the playback list. Cannot delete currently playing programs.</li> 
     * @return Operation Operation type. Valid values: <li>Insert: insert a program into the current playback list. The inserted program remains valid in subsequent carousel processes.</li> <li>InsertTemporary: temporarily insert a program into the current playback list. Temporarily inserted programs are only effective during this carousel process.</li><li>Delete: delete a program from the playback list. Cannot delete currently playing programs.</li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set Operation type. Valid values: <li>Insert: insert a program into the current playback list. The inserted program remains valid in subsequent carousel processes.</li> <li>InsertTemporary: temporarily insert a program into the current playback list. Temporarily inserted programs are only effective during this carousel process.</li><li>Delete: delete a program from the playback list. Cannot delete currently playing programs.</li>
     * @param Operation Operation type. Valid values: <li>Insert: insert a program into the current playback list. The inserted program remains valid in subsequent carousel processes.</li> <li>InsertTemporary: temporarily insert a program into the current playback list. Temporarily inserted programs are only effective during this carousel process.</li><li>Delete: delete a program from the playback list. Cannot delete currently playing programs.</li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get Playlist program ID. <li>When Operation is Insert, this field is required, indicating that the inserted program list is located after this program.</li> <li>When Operation is InsertTemporary, this field is optional. If not filled in, the program is inserted at the latest insertion point. If this field is filled in and SegmentIndex is also filled in, the program is inserted behind the SegmentIndex fragment of the program corresponding to ItemId. Otherwise, it is inserted after this program.</li> <li>When Operation is Delete, this field is required, indicating deletion of this program. Currently playing programs cannot be deleted.</li> 
     * @return ItemId Playlist program ID. <li>When Operation is Insert, this field is required, indicating that the inserted program list is located after this program.</li> <li>When Operation is InsertTemporary, this field is optional. If not filled in, the program is inserted at the latest insertion point. If this field is filled in and SegmentIndex is also filled in, the program is inserted behind the SegmentIndex fragment of the program corresponding to ItemId. Otherwise, it is inserted after this program.</li> <li>When Operation is Delete, this field is required, indicating deletion of this program. Currently playing programs cannot be deleted.</li>
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set Playlist program ID. <li>When Operation is Insert, this field is required, indicating that the inserted program list is located after this program.</li> <li>When Operation is InsertTemporary, this field is optional. If not filled in, the program is inserted at the latest insertion point. If this field is filled in and SegmentIndex is also filled in, the program is inserted behind the SegmentIndex fragment of the program corresponding to ItemId. Otherwise, it is inserted after this program.</li> <li>When Operation is Delete, this field is required, indicating deletion of this program. Currently playing programs cannot be deleted.</li>
     * @param ItemId Playlist program ID. <li>When Operation is Insert, this field is required, indicating that the inserted program list is located after this program.</li> <li>When Operation is InsertTemporary, this field is optional. If not filled in, the program is inserted at the latest insertion point. If this field is filled in and SegmentIndex is also filled in, the program is inserted behind the SegmentIndex fragment of the program corresponding to ItemId. Otherwise, it is inserted after this program.</li> <li>When Operation is Delete, this field is required, indicating deletion of this program. Currently playing programs cannot be deleted.</li>
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get Index number of the M3U8 file segment. The SegmentIndex of the first segment in an M3U8 file is 0. This parameter is valid when Operation is InsertTemporary and ItemId has a value. 
     * @return SegmentIndex Index number of the M3U8 file segment. The SegmentIndex of the first segment in an M3U8 file is 0. This parameter is valid when Operation is InsertTemporary and ItemId has a value.
     */
    public Long getSegmentIndex() {
        return this.SegmentIndex;
    }

    /**
     * Set Index number of the M3U8 file segment. The SegmentIndex of the first segment in an M3U8 file is 0. This parameter is valid when Operation is InsertTemporary and ItemId has a value.
     * @param SegmentIndex Index number of the M3U8 file segment. The SegmentIndex of the first segment in an M3U8 file is 0. This parameter is valid when Operation is InsertTemporary and ItemId has a value.
     */
    public void setSegmentIndex(Long SegmentIndex) {
        this.SegmentIndex = SegmentIndex;
    }

    /**
     * Get Program list. Required when Operation is Insert, InsertTemporary, or Delete. Indicates the program list to operate. The maximum list length is 10. 
     * @return RoundPlaylist Program list. Required when Operation is Insert, InsertTemporary, or Delete. Indicates the program list to operate. The maximum list length is 10.
     */
    public RoundPlayListItemInfo [] getRoundPlaylist() {
        return this.RoundPlaylist;
    }

    /**
     * Set Program list. Required when Operation is Insert, InsertTemporary, or Delete. Indicates the program list to operate. The maximum list length is 10.
     * @param RoundPlaylist Program list. Required when Operation is Insert, InsertTemporary, or Delete. Indicates the program list to operate. The maximum list length is 10.
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

